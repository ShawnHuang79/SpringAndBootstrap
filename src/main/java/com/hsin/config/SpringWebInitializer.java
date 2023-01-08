package com.hsin.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return null;
	}
	//若用上面的RootConfig設定，若有不同模組時(user、demo)可能造成bean元件載入混亂，所以這邊就不用，統一使用下方的ServletConfig
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class<?>[] { WebConfig.class };
	}
	@Override
	protected String[] getServletMappings(){
		return new String[] { "/" };
	}
	//以filter強制以utf-8為全系統字串編碼原則
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException{
		super.onStartup(servletContext);;
		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("characterEncodingFilter", new CharacterEncodingFilter());
		encodingFilter.setInitParameter("encoding", "UTF-8");
		encodingFilter.setInitParameter("forceEncoding", "true");
		encodingFilter.addMappingForUrlPatterns(null, true, "/*");
	}
}
