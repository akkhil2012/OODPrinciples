package com.test.tree;

public class ImplApp {
	public static void main(String args[]) {
		ImplDataSourceTree implDataSourceTree 
		   = new ImplDataSourceTree();
		DatabaseNode root = (DatabaseNode) implDataSourceTree.createNode(new DatabaseNode(),"1_database", 2);
		// Adding right schema
		implDataSourceTree.createNode(new SchemaNode(),"1_schema_left", 3);
		// Adding left schema
		implDataSourceTree.createNode(new SchemaNode(),"1_schema_right", 1);
		
		// Adding table
		implDataSourceTree.createNode(new TableNode(),"1_Table_left", -11);
			
		implDataSourceTree.traverseTree(root);
		
		System.out.println(" ===================CREATE SECOND TREE===========================");
		ImplDataSourceTree implDataSourceTree1
		   = new ImplDataSourceTree();
		root = (DatabaseNode) implDataSourceTree1.createNode(new DatabaseNode(),"2_database", 2);
		// Adding right schema
		implDataSourceTree1.createNode(new SchemaNode(),"2_schema_right", 3);
		// Adding left schema
		implDataSourceTree1.createNode(new SchemaNode(),"2_schema_left", 1);
		
		// Adding table
				implDataSourceTree1.createNode(new TableNode(),"2_Table_left", -11);
				
				implDataSourceTree1.traverseTree(root);
				
				
		System.out.println(" ######### COMPARE THE HEIRRACHY########");
		
		// Case 1: Compare the Tree hierarchies
		// Compare tree heirarchies
		TreeUntils treeUntils = new TreeUntils();
		System.out.println("compare result ====> " + treeUntils.
				compareImpTree(implDataSourceTree.getRoot(), implDataSourceTree1.getRoot()));
		
		
		// Case 2: 
	}
}
