package org.techsoft.sklad.db;

public class Query {
	
	private StringBuilder query;
	
	/**
	 * @param table
	 * @return
	 */
	public Query delete(String table) {
		query = new StringBuilder();
		query.append("DELETE FROM ");
		query.append(table);
		return this;

	}
	/**
	 * It adds requirement to SQL query
	 * @param requirement
	 * @return
	 */
	public Query where(String requirement) {
		if (requirement == "") {
		return this;	
		}else {
		query.append(" WHERE ");
		query.append(requirement);
		query.append(" = ?");
		return this;
		}

	}
	/**
	 * 
	 * @param table
	 * @return
	 */
	public Query update(String table) {
		query = new StringBuilder();
		query.append("UPDATE ");
		query.append(table);
		query.append(" SET ");
		return this;
	}
	/**
	 * Add columns
	 * @param columns
	 * @return
	 */
	public Query set(String[] columns){
		int count = columns.length;
		if(count == 0){
			throw new IllegalArgumentException("Bad count of insert params");
		}
		for (String column : columns) {
			query.append(column);
			query.append(" = ");
			query.append("?");
			query.append(", ");
		}
		query.deleteCharAt(query.lastIndexOf(", "));
		return this;
		
	}
	/**
	 * INSERT INTO SQL query
	 * @param table
	 * @return
	 */
	public Query insert(String table){
		query = new StringBuilder();
		query.append("INSERT INTO ");
		query.append(table);
		return this;
	}
	/**
	 * INSERT INTO SQL query with columns
	 * @param table
	 * @param columns
	 * @return
	 */
	public Query insert(String table, String[] columns){
		query = new StringBuilder();
		query.append("INSERT INTO ");
		query.append(table);
		query.append(" (");
		if (columns != null) {
			for (Object column : columns) {
				query.append(column);
				query.append(",");
			}
			query.deleteCharAt(query.lastIndexOf(","));
		}
		query.append(") ");
		return this;
	}
	/**
	 * Add values to SQL query
	 * @param params
	 * @return
	 */
	public Query values(Object[] params){
		query.append(" VALUES(");
		
		int count = params.length;
		if(count == 0){
			throw new IllegalArgumentException("Bad count of insert params");
		}
		
		for (int i = 0; i < count; i++) {
			query.append("?,");
		}
		query.deleteCharAt(query.lastIndexOf(","));
		query.append(");");
		return this;
	}
	/**
	 * 
	 * @param columns
	 * @return
	 */
	public Query select(Object[] columns){
		query = new StringBuilder();
		query.append("SELECT ");
		if (columns != null) {
			for (Object column : columns) {
				query.append(column);
				query.append(",");
			}
			query.deleteCharAt(query.lastIndexOf(","));	
		} else{
			query.append("*");
		}
		
		return this;		
	}
	
	public Query from(String table){
		query.append(" FROM ");
		query.append(table);
		return this;
	}
	
	
	
	/**
	 * 
	 * @return query in String
	 */
	public String getQuery(){
		return query.toString();
	}
}
