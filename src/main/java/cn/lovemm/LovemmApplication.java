package cn.lovemm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"cn.lovemm.mapper"})
@ComponentScan(basePackages = {"cn.lovemm"})
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableCaching
public class LovemmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LovemmApplication.class, args);
	}
}
