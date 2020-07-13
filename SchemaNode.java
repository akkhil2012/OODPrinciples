package com.test.tree;

public class SchemaNode extends Entity {

	public SchemaNode() {

	}

	@Override
	public String toString() {
		return "SchemaNode [id=" + id + "rightEntity=" + rightEntity.getLeftEntity().getId() + ", leftEntity="
				+ leftEntity.getRightEntity().getId() + "]";
	}

	private Entity parent;

	public SchemaNode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TableNode getLeftTableNode() {
		return leftTableNode;
	}

	public void setLeftTableNode(TableNode leftTableNode) {
		this.leftTableNode = leftTableNode;
	}

	public TableNode getRightTableNode() {
		return rightTableNode;
	}

	public void setRightTableNode(TableNode rightTableNode) {
		this.rightTableNode = rightTableNode;
	}

	private int id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private TableNode leftTableNode;

	private TableNode rightTableNode;

	public SchemaNode(int id, TableNode leftTableNode, TableNode rightTableNode) {
		super();
		this.id = id;
		this.leftTableNode = leftTableNode;
		this.rightTableNode = rightTableNode;
	}

	@Override
	Entity getRoot() {
		// TODO Auto-generated method stub
		return parent;
	}

	Entity setRoot(Entity root) {
		// TODO Auto-generated method stub
		return this.parent = root;
	}

	/*
	 * @Override Entity getLeftSchemaNode() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override Entity getRightSchemaNode() { // TODO Auto-generated method stub
	 * return null; }
	 */

	@Override
	int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
