package com.in28minutes.rest.webservices.restfulwebservices.Query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class QueryHardCodedService {

	private static List<Query> queries=new ArrayList();
	private static List<String> categoryList= new ArrayList();
	private static int idCounter=0;
	static {
		categoryList.add("java");
		categoryList.add("python");

		categoryList.add("C++");
		categoryList.add("C#");
		queries.add(new Query(++idCounter,"shubham","Why is java not working with react","sasta description",categoryList,new Date()));
		
		
	}
	
	public List<Query> findAll(){
		return queries;
	}
	
	public Query save(Query query) {
		if(query.getId()==-1 || query.getId()==0) {
			query.setId(++idCounter);
			query.setDate(new Date());
			queries.add(query);
		}
		else {
			deleteById(query.getId());
			query.setDate(new Date());
			queries.add(query);
		}
		return query;
	}
	
	
	public Query deleteById(long id) {
		Query query=findById(id);
		if(query==null) return null;
		if(queries.remove(query)) {
		return query;}
		return null;
	}

	public Query findById(long id) {
		for(Query query:queries) {
			if(query.getId()==id) {
				return query;
			}
		}
		return null;
	}
	
	public List<Query> findByUsername(String username) {
		ArrayList<Query> quer=new ArrayList();
		for(Query query:queries) {
			if(query.getUsername().equals(username)) {
				quer.add(query);
			}
		}
		return quer;
	}
}
