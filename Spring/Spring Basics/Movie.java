package com.wipro.springsample;

public class Movie {
	private String MovieId;
	private String moviename;
	private String actor;
	public  String getMovieId() {
	return MovieId;	
	}
	public void setMovieId( String MovieId) {
		this.MovieId= MovieId;
	}
	public String getMoviename() {
		return moviename;	
		}
		public void setMoviename(String moviename) {
			this.moviename= moviename;
		}
		public String getActor() {
			return actor;	
			}
			public void setActor(String actor) {
				this.actor= actor;
			}
	public void display() {
		System.out.println("Movie Details:" +" "+MovieId+" "+moviename+" "+actor);
	}

}
