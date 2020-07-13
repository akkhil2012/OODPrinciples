package com.test.tree;

public class TreeUntils {

	
	
	public boolean compareImpTree(Entity a,Entity b) {
		
		 if (a == null && b == null) 
	            return true; 
	              
	        /* 2. both non-empty -> compare them */
	        if (a != null && b != null)  
	            /*return (a.getId() == b.getId() 
	                    && compareImpTree(a.getLeftSchemaNode(), b.getLeftSchemaNode()) 
	                    && compareImpTree(a.getRightSchemaNode(), b.getRightSchemaNode())); */
	        	return (a.getId() == b.getId() 
                && compareImpTree(a.getLeftEntity(), b.getLeftEntity()) 
                && compareImpTree(a.getRightEntity(), b.getRightEntity())); 
	   
	        /* 3. one empty, one not -> false */
	        return false; 
		
		
	}
}
