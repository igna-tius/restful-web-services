package com.in28minutes.rest.webservices.restfulwebservices.Query;

import java.util.Date;
import java.util.List;

public class Query {
	private long id;
	private String username;
	private String title;
	private Date date;
	private String description;
	private List<String> categoryList; 
	
	public Query() {
		
	}
	public Query(long id, String username, String title, String description,List <String> categoryList,Date date) {
		
		this.id = id;
		this.username = username;
		this.title = title;
		this.description = description;
		this.categoryList=categoryList;
		this.date=date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Query other = (Query) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
