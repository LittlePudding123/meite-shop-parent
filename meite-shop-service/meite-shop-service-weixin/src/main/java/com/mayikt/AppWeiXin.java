package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: //微信服务接口实现  </br>
 * @Param  </br>
 * @Return  </br>
 * @Author gaoc </br>
 * @Date 20:57 2019/9/26 </br>
 */
@SpringBootApplication
@EnableEurekaClient
public class AppWeiXin {

	public static void main(String[] args) {
		SpringApplication.run(AppWeiXin.class, args);
	}

}
