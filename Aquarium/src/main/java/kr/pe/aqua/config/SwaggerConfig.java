package kr.pe.aqua.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("kr.pe.aqua.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo swaggerInfo() {
        return new ApiInfoBuilder().title("Fish aquarium API Documentation")
                .description("팀원 : 이재형, 김순영, 손의진, 이수민이 소개하는 아쿠아리움에 오신 것을 환영합니다~")
                .license("마스크 빌런으로부터 우리의 해양생태계를 지켜볼까요?").licenseUrl("https://imnews.imbc.com/replay/2020/nwtoday/article/5740328_32531.html").version("2").build();
    }
}


