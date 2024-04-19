import { Component } from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-post-add',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './post-add.component.html',
  styleUrl: './post-add.component.css'
})
export class PostAddComponent {
	
	constructor(private postService: PostService) {}

	post: Post = {
		id: 0,
		author: "",
		content: "",
		createdDate: "",
		createdTime: ""
	};
	
	savePost(): void {
		const data = {
			//id: this.student.id,
			author: this.post.author,
			content: this.post.content,
			createdDate: this.post.createdDate,
			createdTime: this.post.createdTime
		};
		this.postService.create(data).subscribe(
			(data: Post) => this.postService.onPostAdded.emit(data)
		);
	}

}
