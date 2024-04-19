package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.repositories.PostRepo;

@Component
public class PostBootstrap implements CommandLineRunner {
	
	@Autowired PostRepo ps;

	@Override
	public void run(String... args) throws Exception {

		Post post1 = new Post(1L, "John Doe", "This is the content of the post", LocalDate.of(2024, 4, 15), LocalTime.of(10, 30, 0));

		Post post2 = new Post("Jane Smith", "This is another post content", LocalDate.of(2024, 4, 15), LocalTime.of(11, 0, 0));
		
		ps.save(post1);
		
		ps.save(post2);

	}

}
