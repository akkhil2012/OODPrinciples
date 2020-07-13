package com.test.tree;

public class ImplDataSourceTree {
	private   DatabaseNode root;
	/*
	 * initilaize cache
	 */
	
	public DatabaseNode getRoot() {
		return root;
	}
	public void setRoot(DatabaseNode root) {
		this.root = root;
	}

	private ImplDataSourceCache implDataSourceCache = new ImplDataSourceCache();


	// iterate tree
	public void traverseTree(DatabaseNode root) {
		if(root!=null) {
			System.out.println(" "+ this.root.toString());
		}
		if(root.leftSchemaNode!=null) {
			System.out.println(" "+ this.root.leftEntity.toString());
		}
		if(root.rightSchemaNode!=null) {
			System.out.println(" "+ this.root.rightEntity.toString());
		}
	}
	//create Tree
	public Entity createNode(Entity root,String name,int id) {
		Entity node = insertRec(root,name,id);
	//	System.out.println(" Node created is " + ((DatabaseNode)node).getName());
		return node;
	}
	
	Entity insertRec(Entity root, String name, int key) {
		/* If the tree is empty, return a new node */
		if (root instanceof DatabaseNode) {
			root = new DatabaseNode(name, key);
			this.setRoot((DatabaseNode) root);
			// adding to cache
			ImplDataSourceCache.CacheMap.invokeCache(key, root);
			return root;
		}
		/* Otherwise, recur down the tree */
		else {
			//implDataSourceCache.invokeCache(key, root);
		 if(root instanceof SchemaNode) {
			DatabaseNode d = (DatabaseNode) this.root;
			if (key < d.getId()) {
			//	d.setLeftSchemaNode(new SchemaNode(key, name));
				d.setLeftEntity(new SchemaNode(key, name));
			} else {
			//	d.setRightSchemaNode(new SchemaNode(key, name));
				d.setRightEntity(new SchemaNode(key, name));
			//	d.getRightSchemaNode().setRoot(d);
			}
			/* return the (unchanged) node pointer */
			 return d;
		}else if(root instanceof TableNode) {
			SchemaNode s = (SchemaNode) this.root.getLeftEntity();
			if(key < s.getId()) {
				s.setLeftEntity(new TableNode(key, name));
			}
			else if(key > s.getId()) {
				s.setRightEntity(new TableNode(key, name));
			}
			return s;
		}
		
	  }
	  return null;	
	}

}
