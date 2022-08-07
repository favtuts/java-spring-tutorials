package com.favtuts.movie;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {
	
	//This "movieFindCache" is declared in ehcache.xml	
	@Cacheable(value = "movieFindCache", key = "#name")
	public Movie findByDirector(String name) {
		//each call will delay 2 seconds, simulate the slow query call
		slowQuery(2000L);
		System.out.println("findByDirector is running...");
		return new Movie(1, "Forrest Gump", "Robert Zemeckis");
	}
	
	private void slowQuery(long seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}
}
