package br.com.ideao.springwebmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.ideao.springwebmvc")
@EnableWebMvc
public class AppConfig {
}
