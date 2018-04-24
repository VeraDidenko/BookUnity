package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WishList {

	private String login_fk;
	private Integer book_fk;
	
	public WishList(){}
	
	public WishList(String login_fk,Integer book_fk) {
		this.login_fk=login_fk;
		this.book_fk=book_fk;
	}
	
	public String toString() {
		return "Login: "+this.login_fk+"\nBook: "+this.book_fk+"\n";
	}
}
