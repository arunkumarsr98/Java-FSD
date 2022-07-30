package phase1_assisted_practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"AK");    
	      hm.put(2,"BK");    
	      hm.put(3,"CK");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Toy");  
	      ht.put(5,"Shark");  
	      ht.put(6,"Fish");  
	      ht.put(7,"Leopard");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Honey");    
	      map.put(9,"Nature");    
	      map.put(10,"Cat");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
