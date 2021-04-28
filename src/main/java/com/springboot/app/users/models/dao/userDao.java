package com.springboot.app.users.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springboot.app.commons.users.models.entity.User;

/**
 * This annotation will allow to expose my repository as a rest resource
 * @author AndresRivera
 *
 */
@RepositoryRestResource(path = "users")
public interface userDao extends PagingAndSortingRepository<User, Long> {

	/**
	 * getting data by method parameters name
	 * @RestResource will be usefull if I want to change the url path to expose
	 * @param username
	 * @return
	 */
	@RestResource(path = "search-username")
	public User findByUsername(@Param("username") String username);
	
	/**
	 * getting data by "query" being the query annotation the query to get the objects
	 * @param username
	 * @return
	 */
	@Query("select u from User u where u.username=?1")
	public User getWithUsername(String username);
}
