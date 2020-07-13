package com.test.tree;

import java.util.HashMap;
import java.util.Map;

import com.ibm.db2.jcc.am.ca;

/*
 * 
 * Cache to maintain the RID with asset heirarhy
 */



public  class ImplDataSourceCache {
	static class  CacheMap{
	
	private  static Map<Long,Entity> cacheMap;

	static{
		cacheMap = new HashMap<>(5);
	}
	
	public static void invokeCache(int id,Entity asset) {
		if(cacheMap.isEmpty()) {
		  cacheMap.put((long) id, asset);
		  System.out.println("Cache Miss...........when cache is emty");
		  return;
		}  
		//for(Map.Entry<Long, Entity> mp : cacheMap.entrySet()) {
			if(cacheMap.containsKey((long) id)) {
				System.out.println("Cache hit..............>>>>>>>");
				return;
			}else {
				System.out.println("Cache Miss.............>>>>>>>");
				cacheMap.put((long) id, asset);
			}
		//}
		return;
		//System.out.println(" cache miss");
	}
	
	}
}
