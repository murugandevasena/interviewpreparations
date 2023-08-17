package InterviewQes_1;

public class Fibonacci {
   public static void main(String[] args) {
	int f=-1;
	int s=1;
	for(int i=0;i<=9;i++) {
		int t=f+s;
		System.out.println(t);
		f=s;
		s=t;
	}
}
   
}
