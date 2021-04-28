package com.springboot.app.users;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.springboot.app.commons.users.models.entity.Role;
import com.springboot.app.commons.users.models.entity.User;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	/**
	 * The purpose of this configuration method is expose the Id's of the classes User and Role
	 */
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		config.exposeIdsFor(User.class, Role.class);
	}
	
	

}
