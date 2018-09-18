package com.ketai.config;


import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.ketai")
@MapperScan("com.ketai.mapper")
public class Appconfig {
    @Bean
    public DataSource mysql(){
        DriverManagerDataSource dm = new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.jdbc.Driver");
        dm.setUsername("root");
        dm.setPassword("root");
        dm.setUrl("jdbc:mysql://localhost:3306/smbms?useUnicode=true&characterEncoding=UTF-8&useSSL=false");
        return dm;
    }

    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setLogImpl(Log4jImpl.class);
        sqlSessionFactoryBean.setConfiguration(config);
        return sqlSessionFactoryBean;
    }
}
