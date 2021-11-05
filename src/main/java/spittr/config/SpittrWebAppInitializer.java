package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { RootConfig.class}; 
	}

	@Override
	protected Class<?>[] getServletConfigClasses() { //Specify configuration class for web components
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() { //Map DispatcherServlet to
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
