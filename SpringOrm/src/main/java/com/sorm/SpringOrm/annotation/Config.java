package com.sorm.SpringOrm.annotation;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Config {
	    @Bean
	    public DataSource dataSource() {
	    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
	        dataSource.setUsername("root");
	        dataSource.setPassword("Lufa@7917");
	        return dataSource;
	    }

	    private final Properties hibernateProperties() {
	        Properties hibernateProperties = new Properties();
	        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	        hibernateProperties.setProperty("hibernate.show_sql", "true");
	        hibernateProperties.setProperty( "hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	        return hibernateProperties;
	    }
	    
	    @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan("com.sorm.SpringOrm.annotation");
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	    }
	    
	    @Bean("hibernateTemplate")
		public HibernateTemplate gethibernate() {
			HibernateTemplate hibernateTemplate = new HibernateTemplate();
			LocalSessionFactoryBean s = sessionFactory();
			hibernateTemplate.setSessionFactory(s.getObject());
			return hibernateTemplate;
		}
	    
	
	    @Bean("studentdaoimp")
	    public StudentDaoImpl getStudentDao() {
	    	StudentDaoImpl s = new StudentDaoImpl();
	    	s.setHibernateTemplate(gethibernate());
	    	return s;
	    }
	    
	    @Bean("student")
	    public Student getStudent() {
	    	return new Student();
	    }
	   
	    
	    @Bean
	    public PlatformTransactionManager hibernateTransactionManager() {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	        transactionManager.setSessionFactory(sessionFactory().getObject());
	        return transactionManager;
	    }
}
