package InterviewQes_1;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_Remove_In_Two_Array {
    public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {2,7,8,9,6};
		int count=1;
		int c[]=new int [a.length+b.length];
		List<Integer>li=new ArrayList<>();
		for(int c_i=0,a_i=0,b_i=0;c_i<c.length;c_i++) {
			if(c_i<a.length) {
				c[c_i]=a[a_i++];
			}
			else
				c[c_i]=b[b_i++];
		
		//System.out.println(c[c_i]);
		}
		for(int i=0;i<c.length;i++) {
			count=1;
			if(c[i]!=-1) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]&&c[j]!=-1) {
					count++;
					c[j]=-1;
					//c[i]=-1;
					
				}
//				else if(c[i]!=c[j]) {
//					li.add(c[i]);
//				}
				}
			}

			 if(count==1&&c[i]!=-1)
				System.out.println(c[i]);
		}
		
	}
}
