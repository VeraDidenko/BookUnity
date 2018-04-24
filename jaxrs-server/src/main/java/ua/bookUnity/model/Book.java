package ua.bookUnity.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
	
	private Integer bookID;
	private String bookName;
	private String author;
	private String language;
	private Integer yearIssue;
	private String publishingHouse;
	private String description;
	private Integer numberOfPages;
	private BigDecimal price;
	private String impression;
	private String account_fk;
	private Integer condition_fk;
	private Integer category_fk;
	
	public Book() {}
	
	public Book(Integer bookID,String bookName,String author,String language,Integer yearIssue,String publishingHouse,String description,Integer numberOfPages,BigDecimal price,String impression,String account_fk,Integer condition_fk,Integer category_fk) {
		this.bookID=bookID;
		this.bookName=bookName;
		this.author = author;
		this.language=language;
		this.yearIssue=yearIssue;
		this.publishingHouse = publishingHouse;
		this.description=description;
		this.numberOfPages=numberOfPages;
		this.price=price;
		this.impression=impression;
		this.account_fk=account_fk;
		this.condition_fk=condition_fk;
		this.category_fk=category_fk;
	}
	
	
	public String toString() {
		
		return "Book id "+this.bookID+"\naccount fk "+this.account_fk +"\nprice "+this.price;
	}
	
}
