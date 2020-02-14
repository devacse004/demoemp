package com.example.demo.Resources;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan(basePackageClasses = { EmployeeDBController.class, EmpController.class })
@Configuration
@EnableSwagger2

public class SwaggerConfig implements WebMvcConfigurer{
	@Bean
	public Docket api(Object RequestHandlerSelectors) {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).paths(regex("/api.*")).build()
				.apiInfo(apiDetails());

	}

	private Object regex(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Mongo-DB-", "This Project about spring boot with MongoDb", "Sample", "HI",
				new springfox.documentation.service.Contact("Devaraj", "Diatoz.com", "abc.gmail.com"), "API ",
				"Swagger.api", Collections.emptyList());

	}

	 @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  
	  registry .addResourceHandler("swagger-ui.html")
	  .addResourceLocations("classpath:/META-INF/resources/");
	  
	  registry .addResourceHandler("/webjars/**")
	  .addResourceLocations("classpath:/META-INF/resources/webjars/"); }
	  


}
