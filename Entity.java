package com.test.tree;

public abstract class Entity {
	
	protected Entity rightEntity;
	public Entity getRightEntity() {
		return rightEntity;
	}

	public void setRightEntity(Entity rightEntity) {
		this.rightEntity = rightEntity;
	}



	protected Entity leftEntity;

	public Entity getLeftEntity() {
		return leftEntity;
	}

	public void setLeftEntity(Entity leftEntity) {
		this.leftEntity = leftEntity;
	}

	abstract Entity getRoot();
	
	/*abstract Entity getLeftSchemaNode();
	
	abstract Entity getRightSchemaNode();*/
	
	

	abstract int getId();
}
