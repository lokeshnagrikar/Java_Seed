package ArrayAssignment;

public class Array20 {
	public static void main(String[] args) {
	     int arr[]=new int[] {1, 2, 3, 4, 2, 7,1, 8, 8, 3};
	   int flag =1;
	     System.out.println();
	     
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j =i+1;j<arr.length;j++) {
	    		 	 if(arr[i]==arr[j])
	    		 		 flag=0;
//	    		 		
	    	 }
	    	 if(flag!=0) {
	    		  System.out.println("  "+arr[i]);
	    	 }
	    
	     }
		}
}
