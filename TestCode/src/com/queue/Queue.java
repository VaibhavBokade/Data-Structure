package com.queue;

public interface Queue<Movie> {
	void push(Movie ele) ;
	Movie pop() throws QueueEmptyException;
	Movie peek();
	 boolean isEmpty();
	 
	 

}
