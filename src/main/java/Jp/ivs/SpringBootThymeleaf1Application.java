package Jp.ivs;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Jp.ivs.model.Departs;

@MapperScan("Jp.ivs.DepartsMapper")
@MappedTypes(Departs.class)
@SpringBootApplication
public class SpringBootThymeleaf1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleaf1Application.class, args);
	}

}
