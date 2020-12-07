package com.learning.springhibernatedemo.dbconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.learning.springhibernatedemo")
@EnableTransactionManagement
public class HibernateConfig {

	//Configuring H2 Connection details
	@Autowired
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=
				new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/hiberdb");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		System.out.println("DataSource: "+dataSource);
		return dataSource;
	}
	
	//Configuring Hibernate Properties
	private Properties getHibernateProperties() {
		Properties props=new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		
		System.out.println("Hibernate Properties: "+props);
		return props;
	}
	
	//Creating SessionFactory Bean to receive object of Session later
	@Autowired
	@Bean(name="sessionFactory")
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBean session=new LocalSessionFactoryBean();
		session.setHibernateProperties(getHibernateProperties());
		session.setDataSource(dataSource);
		session.setPackagesToScan("com.learning.springhibernatedemo");
		
		System.out.println("Session: "+session);
		return session;
	}
	
	//It consumes sessionFactory object to implement transactions on DB
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager=
				new HibernateTransactionManager(sessionFactory);
		
		System.out.println("HibernateTransactionManager: "+transactionManager);
		return transactionManager;
				
	}
}
