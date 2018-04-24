package ua.bookUnity.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Messages {
	
	private Integer messageID;
	private String content;
	private LocalDateTime createAt;
	private String loginFrom_fk;
	private String loginTo_fk;
	
	public Messages() {}
	
	public Messages(Integer messageID,String content,LocalDateTime createAt,String loginFrom_fk,String loginTo_fk) {
		this.messageID=messageID;
		this.content=content;
		this.createAt=createAt;
		this.loginFrom_fk=loginFrom_fk;
		this.loginTo_fk=loginTo_fk;
	}
	
	public String toString() {
		return "Create at: "+this.createAt+"\nFrom: "+this.loginFrom_fk+"\nTo: "+this.loginTo_fk;
	}
	
}
