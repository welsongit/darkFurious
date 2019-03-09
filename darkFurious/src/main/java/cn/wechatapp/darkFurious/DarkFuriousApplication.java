package cn.wechatapp.darkFurious;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(value="cn.wechatapp.darkFurious.dao")
public class DarkFuriousApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarkFuriousApplication.class, args);
	}

}
