package com.in28minutes.rest.webservices.restfulwebservices.Query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class QueryHardCodedService {

	private static List<Query> queries=new ArrayList();
	private static int idCounter=0;
	static {
		queries.add(new Query(++idCounter,"shubham","Java can be used in server side programming",new Date()));
		queries.add(new Query(++idCounter,"shubham","Problem solving can be done better in which programming language.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow567.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"sameeer","Is Queries Elucidator better than StackOverFlow 123.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"sameer","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"shubham","Is Queries Elucidator better than StackOverFlow.",new Date()));
		queries.add(new Query(++idCounter,"sameer","Is Queries Elucidator better than StackOverFlow.",new Date()));
		
	}
	
	public List<Query> findAll(){
		return queries;
	}
	
	public Query save(Query query) {
		if(query.getId()==-1 || query.getId()==0) {
			query.setId(++idCounter);
			query.setQueryDate(new Date());
			queries.add(query);
		}
		else {
			deleteById(query.getId());
			query.setQueryDate(new Date());
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
