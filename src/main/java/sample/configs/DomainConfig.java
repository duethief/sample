package sample.configs;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="sample.persistence")
public class DomainConfig {
	
	@Autowired
	private DataSource dataSource;
    
	@Bean 
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception { 
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean(); 
		sessionFactory.setDataSource(dataSource); 
		return sessionFactory.getObject(); 
	} 
}
