/*package com.hss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeservicesApplication.class, args);
	}
}
*/
package com.hss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HomeservicesApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HomeservicesApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HomeservicesApplication.class);
    }
}
