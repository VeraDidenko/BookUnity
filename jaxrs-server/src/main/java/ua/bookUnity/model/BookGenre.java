package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookGenre {
	
	private Integer book_fk;
	private Integer genre_fk;
	private Integer subcategory_fk;
	
	public BookGenre() {}
	
	public BookGenre(Integer book_fk,Integer genre_fk,Integer subcategory_fk) {
		this.book_fk=book_fk;
		this.genre_fk=genre_fk;
		this.subcategory_fk=subcategory_fk;
	}
	
	
	public String toString() {
		return "Book "+this.book_fk+"\nGenre: "+this.genre_fk+"\nSubCat: "+this.subcategory_fk+"\n";
	}
}
