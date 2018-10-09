package com.batian.btspringboot.basedata.config;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
@Configuration
@MapperScan(basePackages = "com.batian.btspringboot.oracle113.mapper", sqlSessionTemplateRef  = "oracle113SqlSessionTemplate")
public class DataSourceOracle113 {
	@Bean(name = "oracle113DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle113")
    @Primary
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "oracle113SqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("oracle113DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/oracle113/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "oracle113TransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("oracle113DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "oracle113SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("oracle113SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
