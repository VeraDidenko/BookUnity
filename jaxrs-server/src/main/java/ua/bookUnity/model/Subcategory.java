package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Subcategory {

	private Integer subcategoryID;
	private String subcategoryName;
	private String description;
	private Integer genre_fk;
	
	public Subcategory() {}
	
	public Subcategory(Integer subcategoryID,String subcategoryName, String description, Integer genre_fk) {
		this.subcategoryID=subcategoryID;
		this.subcategoryName=subcategoryName;
		this.description=description;
		this.genre_fk=genre_fk;
	}
	
	public String toString() {
		return "Name: "+this.subcategoryName+"\nGenre fk: "+this.genre_fk;
	}
	
}
