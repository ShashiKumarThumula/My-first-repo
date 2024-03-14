package Practice_programs;

public class VarAndDatatypes4 {

	public static void main(String[] args) {
		
				/*
		 * int num=1; char c='a'; double d =1.3; String s="string"; boolean bool=false;
		 * System.out.println("the value of the string is:"+d);
		 */
         int [] a= new int[4];
         a[0]=1;
         a[1]=2;
         a[2]=3;
         a[3]=4;
			/* System.out.println(a[3]); */
         for(int i=0;i<a.length;i++)
         {
        	a[i]= 2*a[i];
        	System.out.println(a[i]);
         }
         String names[]= {"shashi","kumar","yadav"};
  //FOr loop with strings
         for(int i=0;i<names.length;i++)
         {
        	 System.out.println(names[i]);
         }
//Enhanced for loop
         for(int num:a)
         {
        	 System.out.println(num);
         }
	}

}
