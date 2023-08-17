package InterviewQes_1;

public class Prime {
	public static void main(String[] args) {
       
	   int num=17;
	   int c=1;
	   for(int i=2;i<num;i++) {
		   if(num%i==0) {
			   c++;
		   }
	   }
	   if(c==1) {System.out.println("Prime");}
	   else System.out.println("Not Prime");
	}
}
