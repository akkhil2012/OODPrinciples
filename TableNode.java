package com.test.tree;

public class TableNode extends Entity{
	
	private int id;

	
	@Override
	public String toString() {
		return "TableNode [id=" + id + ", name=" + name + "]";
	}

	private String name;
	
	public TableNode() {
		
	}

	public TableNode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TableNode(int id) {
		super();
		this.id = id;
	}


	@Override
	int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	Entity getRoot() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
