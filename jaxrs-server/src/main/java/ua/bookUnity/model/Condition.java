package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Condition {
	
	private Integer conditionID;
	private String conditionName;
	
	public Condition() {}
	
	public Condition(Integer conditionID,String conditionName) {
		this.conditionID=conditionID;
		this.conditionName=conditionName;
	}
	
	public String toString() {
		return "ID "+this.conditionID+"\nName "+this.conditionName;
	}
}
