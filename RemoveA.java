package com.epam.test
class RemoveA {

	
	public String removeA(String str) {
	    String result = str;
        int length = str.length();
		if(length>=2) 
		{
		    if(str.substring(0, 2).equalsIgnoreCase("AA")) {
				result = str.substring(2);
				
			}
			else if(str.charAt(0)=='a'||str.charAt(0)=='A') {
				result = str.substring(1);
			}
			else if(str.charAt(1)=='a'||str.charAt(1)=='A') {
				result = str.substring(0,1)+str.substring(2);
			}
		}
		else if(length==1) {
			if(str.charAt(0)=='A')
				result="";
		}
		else if(length==0)
		    result="";
	
	return result;
	}
}