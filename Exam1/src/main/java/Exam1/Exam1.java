package Exam1;

import java.awt.List;
import java.util.ArrayList;

public class Exam1 {

	public static void main(String[] args) {
		
		int counts = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=101;i<=200;i++){
			int count = 0;
			for(int j=1;j<=i;j++){
				
				if(i%j==0){
					count++;
				}
				
			}
			
			if(count<=2){
				counts++;
				list.add(i);
			}
			
		}
		
		System.out.print("101-200之间总共有  "+counts+" 个素数 ，分别是 ：");
		
		for (int i :list) {
			System.out.print(","+i);
		}
		
	}
	
}
