package ca.sheridancollege.vutran.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.repositories.PostRepo;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired PostRepo pr;

	@Override
	public List<Post> findAll() {
		return pr.findAll();
	}

	@Override
	public Post findById(Long id) {
		return pr.findById(id).get();
	}

	@Override
	public List<Post> findAllByOrderByCreatedTimeAsc() {
		return pr.findAllByOrderByCreatedTimeAsc();
	}

	@Override
	public Post save(Post post) {
		post.setCreatedDate(LocalDate.now());
		post.setCreatedTime(LocalTime.now());
		return pr.save(post);
	}

}
