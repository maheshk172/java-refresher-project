
public static int GetJumpCount(final int input1,final int input2, final int[] input3Array)
    {
        int totalNoOfJumps = 0;
        int i=0;
                    
	    for(i = 0; i< input3Array.length(); i++) {
	        int singleJump = getSingleJumpCount(input1, input2, input3Array[i]);
	        totalNoOfJumps = totalNoOfJumps + singleJump;
	    }
	    
	    return totalNoOfJumps;
    }
    
    /**
     *  Function to get jumps required per wall
     */
    public static int getSingleJumpCount(final int input1, final int input2, final int input3) {
        int >