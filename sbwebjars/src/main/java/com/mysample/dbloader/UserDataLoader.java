package com.mysample.dbloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.mysample.domain.User;
import com.mysample.repository.UserRepository;

@Component
public class UserDataLoader implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword("123456");
		admin.setFirstName("Foo");
		admin.setLastName("Bar");
		userRepository.save(admin);

		User user1 = new User();
		user1.setUsername("johndoe");
		user1.setPassword("123456");
		user1.setFirstName("John");
		user1.setLastName("Doe");
		userRepository.save(user1);
	}
}