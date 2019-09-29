package com.mayikt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description: //注册中心 8080  </br>
 * @Param  </br>
 * @Return  </br>
 * @Author gaoc </br>
 * @Date 21:01 2019/9/26 </br>
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

	public static void main(String[] args) {
		SpringApplication.run(AppEureka.class, args);
	}

}
