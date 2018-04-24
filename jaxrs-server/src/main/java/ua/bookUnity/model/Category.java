package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category {

	private Integer categoryID;
	private String categoryName;
	
	public Category(){}
	
	public Category(Integer categoryID,String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}
	
	
	public String toString() {
		return "ID "+this.categoryID+"\nName "+this.categoryName;
	}
	
}
