import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Post } from './post';
import { EventEmitter } from "@angular/core";

const restUrl = '/api/v1/Davidposts';

@Injectable({
  providedIn: 'root'
})

export class PostService {

  	constructor(private http: HttpClient) { }
  	
  	onPostAdded = new EventEmitter<Post>();
  
  	getAll(): Observable<Post[]> {
		return this.http.get<Post[]>(restUrl);
	}
	
	create(data: any): Observable<any> {
		return this.http.post(restUrl, data);
	}
	  
}
