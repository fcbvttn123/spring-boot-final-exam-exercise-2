package ca.sheridancollege.vutran.services;

import java.util.List;

import ca.sheridancollege.vutran.domain.Post;

public interface PostService {
	public List<Post> findAll();
	public Post findById(Long id);
	public List<Post> findAllByOrderByCreatedTimeAsc();
	public Post save(Post post);
}
