package InterviewQes_1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Any three Digit Number");
     int num=s.nextInt();
     int n1,n2,n3,temp,result;
      temp=num;
       n1=temp%10;
       temp=temp/10;
       n2=temp%10;
       temp=temp/10;
       n3=temp%10;
       
       result =(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
     
       if(num==result) {System.out.println("Given Number Is ARMSTRONG");}
       else
    	   System.out.println("It is Not ARMSTRONG NUMBER");
}
}