package com.in28minutes.rest.webservices.restfulwebservices.Query;

import java.util.Date;

public class Query {
	private long qid;
	private String username;
	private String que;
	private Date queryDate;
	
	public Query() {
		
	}
	public Query(long id, String username, String que, Date queryDate) {
		
		this.qid = id;
		this.username = username;
		this.que = que;
		this.queryDate = queryDate;
	}
	public long getId() {
		return qid;
	}
	public void setId(long id) {
		this.qid = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getQuestion() {
		return que;
	}
	public void setQuestion(String question) {
		this.que = question;
	}
	public Date getQuerytDate() {
		return queryDate;
	}
	public void setQueryDate(Date querydate) {
		this.queryDate = querydate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (qid ^ (qid >>> 32));
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
		if (qid != other.qid)
			return false;
		return true;
	}
	
	
}
