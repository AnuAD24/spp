package com.jsp1.jornal.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "journal_Entries")
public class JournalEntry {
	
	private Long id;
	private String title;
	private String content;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
