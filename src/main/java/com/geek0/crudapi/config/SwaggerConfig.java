//package com.geek0.crudapi.config;
//
//import io.swagger.v3.oas.models.ExternalDocumentation;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("Task Management API")
//                        .version("1.0")
//                        .description("API for managing tasks")
//                        .termsOfService("http://swagger.io/terms/")
//                        .contact(new Contact().name("Your Name").email("your-email@example.com").url("http://yourwebsite.com"))
//                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
//    }
//
//    @Bean
//    public GroupedOpenApi taskApi() {
//        return GroupedOpenApi.builder()
//                .group("tasks")
//                .pathsToMatch("/tasks/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi authApi() {
//        return GroupedOpenApi.builder()
//                .group("auth")
//                .pathsToMatch("/auth/**")
//                .build();
//    }
//}
