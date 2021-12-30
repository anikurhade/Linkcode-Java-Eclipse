
public class RedToGreen {
  static int RedOrGreen(int N, String S)
  {
    int pos=0;
    char[] c=S.toCharArray();
    int redcnt=0;
    int greencnt=0;
   for (int i = 0; i < c.length; i++) {
	if(c[i]=='R')
	{
	 redcnt++;	
	}
	else if(c[i]=='G')
	{
		greencnt++;
	}
	
}
   int strlen=S.length();
   if(greencnt>redcnt)
   {
	   pos=redcnt;
   }  
   else
   {
	   pos=greencnt;
   }
    return pos;
}
  public static void main(String[] args) {
	System.out.println(RedOrGreen(5, "RGRRG"));
}
}

