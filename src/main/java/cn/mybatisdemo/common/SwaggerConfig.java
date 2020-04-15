package cn.mybatisdemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description : Swagger的配置
 * @Author : lizhikang@youngyedu.com, 2020/4/15 10:51
 * @Modified : lizhikang@youngyedu.com, 2020/4/15
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("cn.mybatisdemo"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("名字", "http://xiaopingzi.vip", "705502775@qq.com");
        return new ApiInfoBuilder()
                .title("Swagger测试")
                .description("测试")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
