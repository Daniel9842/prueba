package edu.escuelaing.arsw.springWeb;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * this class executes the springweb project
 * @author Daniel Santiago Ducuara Ardila
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {
	/**
	 * this method run the springweb project
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringWebApplication.class);
	}

}
