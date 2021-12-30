
public class Findquadrsaticequation {
	 public static  double[]  FindRoots(int a, int b, int c)
	    {
	        
	        double ans[]=new double[2];
	        double root1, root2;
	        double determinant = b * b - 4 * a * c;
	       
	        if (determinant > 0) {

	  	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	  	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
	  	      if(a>0)
	  	      {	  
	  	      ans[1]=root1;
	  	      ans[0]=root2;
	  	      }
	  	      else
	  	      {
	  	    	ans[0]=root1;
		  	      ans[1]=root2; 
	  	      }
	  	      System.out.println("1");
	  	       }

	  	    else if (determinant == 0) {

	  	      root1 = root2 = -b / (2 * a);
	  	      ans[0]=root1;
	  	      ans[1]=root2;
	  	      System.out.println("2");
	  	    }
	  	    else {

	  	      double real = -b / (2 * a);
	  	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	  	      if(real==0.0)
	  	      {
	  	    	ans[0]=(int)-1;
	  	    	
	  	      } 
	  	      else
	  	      {  
	  	      ans[0]=real;
	  	      ans[1]=imaginary;
	  	      }
	  	      System.out.println("3");
	  	    }
	       
	        
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]=FindRoots(-7,-3,-6);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
