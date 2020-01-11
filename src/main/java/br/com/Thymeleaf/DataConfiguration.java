/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package br.com.Thymeleaf;
//
//import javax.activation.DataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
///**
// *
// * @author ctrlaudos
// */
//@Configuration
//public class DataConfiguration {
//    
//    @Bean
//    public DataSource dataSource(){
//       DriverManagerDataSource dataSource = new  DriverManagerDataSource();
//       dataSource.setDriverClassName("org.postgresql.Driver");
//       dataSource.setUrl("jdbc:postgresql://localhost:5432/barao");
//       dataSource.setUsername("postgres");
//       dataSource.setPassword("musica");
//       return (DataSource) dataSource;
//    }
//    
//    public JpaVendorAdapter jva(){
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setDatabase(Database.POSTGRESQL);
//        adapter.setShowSql(true);
//        adapter.setGenerateDdl(true);
//        adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
//        adapter.setPrepareConnection(true);
//        return adapter;
//    }
//}
