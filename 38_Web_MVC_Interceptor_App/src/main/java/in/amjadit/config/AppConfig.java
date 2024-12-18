package in.amjadit.config;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.ResourceHandlerRegistrationCustomizer;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import in.amjadit.interceptor.RequestLogInterceptor;

@Configuration
public class AppConfig extends WebMvcAutoConfigurationAdapter {

	public AppConfig(WebProperties webProperties, WebMvcProperties mvcProperties, ListableBeanFactory beanFactory,
			ObjectProvider<HttpMessageConverters> messageConvertersProvider,
			ObjectProvider<ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerProvider,
			ObjectProvider<DispatcherServletPath> dispatcherServletPath,
			ObjectProvider<ServletRegistrationBean<?>> servletRegistrations) {
		super(webProperties, mvcProperties, beanFactory, messageConvertersProvider,
				resourceHandlerRegistrationCustomizerProvider, dispatcherServletPath, servletRegistrations);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private RequestLogInterceptor logInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(logInterceptor);
	}
}
