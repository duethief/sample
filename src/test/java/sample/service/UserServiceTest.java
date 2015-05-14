package sample.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sample.SampleApplication;
import sample.entities.User;
import sample.service.UserService;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleApplication.class)
public class UserServiceTest {
	@Autowired
	UserService userService;

	@Test
	public void testAddUser() {
		User newUser = new User("dude@dude.com", "thedude");
        int userId = userService.addUser(newUser);
        User createdUser = userService.getUser(userId);
        assertThat(newUser.getEmail(), is(createdUser.getEmail()));
        assertThat(newUser.getUserName(), is(createdUser.getUserName()));
	}

	@Test
	public void testGetUser() {
		assertThat(userService.getUser(1), is(notNullValue()));
	}

}
