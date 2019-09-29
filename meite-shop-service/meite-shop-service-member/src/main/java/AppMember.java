import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Description: //会员服务接口实现  </br>
 * @Param  </br>
 * @Return  </br>
 * @Author gaoc </br>
 * @Date 21:00 2019/9/26 </br>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppMember {

	public static void main(String[] args) {
		SpringApplication.run(AppMember.class, args);
	}

}