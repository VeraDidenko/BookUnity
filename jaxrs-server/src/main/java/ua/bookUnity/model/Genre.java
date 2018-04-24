package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Genre {

	private Integer genreID;
	private String genreName;
	
	public Genre() {}
	
	public Genre(Integer genreID,String genreName) {
		this.genreID = genreID;
		this.genreName = genreName;
	}
	
	public String toString() {
		return "ID "+this.genreID+"\nName "+this.genreName;
	}
	
	
}
