package ua.bookUnity.model;

import java.io.File;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Foto {

	private Integer fotoID;
	private File foto;
	private String fotoName;
	private Integer book_fk;
	
	public Foto() {}
	
	public Foto(Integer fotoID,File foto,String fotoName,Integer book_fk) {
		this.fotoID = fotoID;
		this.foto=foto;
		this.fotoName=fotoName;
		this.book_fk=book_fk;
	}
	
	public String toString() {
		return "Foto: "+this.foto.getName()+"\nBook: "+this.book_fk;
	}
}
