import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author:Zbei
 * @date:2020.03.11 11:54
 */
@SpringBootApplication
@ComponentScan("com")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
