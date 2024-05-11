package com.queue;

import java.time.LocalDate;

public class Movie {
	public static int id = 100;
	private int Movie_id;
	private String Movie_name;
	private String Actor;
	private String Director;
	private LocalDate Release_date;
	
	
	public Movie(String movie_name, String actor, String director, LocalDate release_date) {
		super();
		Movie_id = id++;
		Movie_name = movie_name;
		Actor = actor;
		Director = director;
		Release_date = release_date;
	}


	public int getMovie_id() {
		return Movie_id;
	}


	public void setMovie_id(int movie_id) {
		Movie_id = movie_id;
	}


	public String getMovie_name() {
		return Movie_name;
	}


	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}


	public String getActor() {
		return Actor;
	}


	public void setActor(String actor) {
		Actor = actor;
	}


	public String getDirector() {
		return Director;
	}


	public void setDirector(String director) {
		Director = director;
	}


	public LocalDate getRelease_date() {
		return Release_date;
	}


	public void setRelease_date(LocalDate release_date) {
		Release_date = release_date;
	}


	@Override
	public String toString() {
		return "Movie [Movie_id=" + Movie_id + ", Movie_name=" + Movie_name + ", Actor=" + Actor + ", Director="
				+ Director + ", Release_date=" + Release_date + "]";
	}
	
	

}
