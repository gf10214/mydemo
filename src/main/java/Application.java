import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.MultipartConfigElement;

/**
 * Created by Zhangsnke on 2016/12/2.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.wondersgroup.mydemo")
@ImportResource("classpath:cxf.xml")
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
    @Bean
    public MultipartConfigElement config(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("10KB");
        return factory.createMultipartConfig();
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
