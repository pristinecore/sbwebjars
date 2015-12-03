/*******************************************************************************
 * Copyright 2015 Brient Oh @ Pristine Core
 * boh@pristinecore.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
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