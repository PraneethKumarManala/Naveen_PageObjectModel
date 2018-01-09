package com.collections.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.bytebuddy.implementation.bytecode.StackSize;

import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

             HashMap m= new HashMap();
             m.put("Praneeth", 100);
             m.put("Bindu", 200);
             m.put("Bindu1", 300);
             m.put("Bindu2", 400);
             m.put("Bindu3", 600);
             System.out.println(m);
             m.put("Bindu", 500);
             System.out.println(m);
             Set s= m.keySet();
             System.out.println(s);
             Collection v = m.values();
             System.out.println(v);
             Set e= m.entrySet();
             System.out.println(e);
             Iterator itr = e.iterator();
             while(itr.hasNext()){
            	 Map.Entry itr1 = (Map.Entry)itr.next();
            	 System.out.println(itr1.getKey()+"----"+itr1.getValue());
            	 if(itr1.getKey().equals("Praneeth")){
            		 itr1.setValue("4000");
            	 }
            	 
             }
             System.out.println(m);
	}

}
