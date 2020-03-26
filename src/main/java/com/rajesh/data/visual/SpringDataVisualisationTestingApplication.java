package com.rajesh.data.visual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import com.rajesh.data.visual.chartjs.dao.CanvasjsChartDao;
import com.rajesh.data.visual.chartjs.dao.CanvasjsChartDaoImpl;
import com.rajesh.data.visual.chartjs.service.CanvasjsChartService;
import com.rajesh.data.visual.chartjs.service.CanvasjsChartServiceImpl;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class SpringDataVisualisationTestingApplication extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataVisualisationTestingApplication.class, args);
	}
	
	@Bean
	public CanvasjsChartService canvasjsChartService() {
		return new CanvasjsChartServiceImpl();
	}
	
	@Bean
	public CanvasjsChartDao canvasjsChartDao() {
		return new CanvasjsChartDaoImpl();
	}
	
	@Bean       
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

}
