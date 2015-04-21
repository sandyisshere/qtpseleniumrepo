package aqtpselenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class sananagram {

	
	@Test
	public void testanagram()
	{
		String[] str = {"ate","eat","sleep","mat","tap","pat"};
		
		HashMap<String , Integer> map = new HashMap<String, Integer>();
	    ArrayList<String> alstring= new ArrayList<String>();  
		for (int i = 0; i < str.length; i++) {
		char[] chrarry=	str[i].toCharArray();
		Arrays.sort(chrarry);
        String sortedstring = new String(chrarry);
         Integer iexist  = map.get(sortedstring);
         if(iexist==null)
         {
        	 map.put(sortedstring, i);
         }
         else
         {  
				if (iexist != -1) {
				 alstring.add(str[iexist]);
                 map.put(sortedstring, -1);
				}
        	 
        	 alstring.add(str[i]);
         }        
		}	
		
		System.out.println(alstring);
	}
	
	
	
}
