package com.carrel.zuulGateway;

import com.carrel.zuulGateway.filters.ErrorFilter;
import com.carrel.zuulGateway.filters.PostFilter;
import com.carrel.zuulGateway.filters.PreFilter;
import com.carrel.zuulGateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}

	@Bean
	PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	PostFilter PostFilter() {
		return new PostFilter();
	}

	@Bean
	RouteFilter routeFilter() {
		return new RouteFilter();
	}

	@Bean
	ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
}
