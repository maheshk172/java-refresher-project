
public static int appearanceCount(int input1,int input2,String input3,String input4)
    {
	    int totalCount = 0 ;
	   char [] input3Array = input3.toCharArray();
	    Arrays.sort(input3Array);
	    
	    if(input1 > input2) {
	        return totalCount;
	    } else {
	        for(int i = 0 ; i <= (input2 - 4); i++) {
	            String str = input4.substring(i, i+4);
	           [] tempCharArray = str.toCharArray();
	            Arrays.sort(tempCharArray);
	            if(Arrays.equals(tempCharArray, input3Array)) {
	                totalCount = totalCount + 1;
	            }
	        }    
	    }
	    
	    return totalCount;
	    
	    
    }