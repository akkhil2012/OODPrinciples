package com.test.tree;


/*
 * 
 * initialy keeping 2 schema to a database
 */
public class DatabaseNode extends Entity {
	
	@Override
	public String toString() {
		return "DatabaseNode [id=" + id + ", rightEntity=" + rightEntity.getId() + ", leftEntity=" 
	+ leftEntity.getId() + "]";
	}



	public String name;
	


	public DatabaseNode() {
		
	}
	
	public DatabaseNode(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
/*
	public SchemaNode getLeftSchemaNode() {
		return leftSchemaNode;
	}*/

	public void setLeftSchemaNode(SchemaNode leftSchemaNode) {
		super.leftEntity = leftSchemaNode;
	}



	
/*
	public SchemaNode getRightSchemaNode() {
		return rightSchemaNode;
	}*/

	public void setRightSchemaNode(SchemaNode rightSchemaNode) {
		super.rightEntity = rightSchemaNode;
	}

	

	public void setId(int id) {
		this.id = id;
	}



	private int id;
	
	///leftNode
	public SchemaNode leftSchemaNode;

	// rightNode
	public SchemaNode rightSchemaNode;

	@Override
	Entity getRoot() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
