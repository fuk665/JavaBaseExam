package Exam3;

import java.util.Date;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入年月日，按照格式 YYYY-MM-DD 输入");
		
		String str = scanner.next();
		
		String s1 = str.substring(0, 4);
		String s2 = str.substring(5, 7);
		String s3 = str.substring(8, 10);
		//System.out.println(s1+" "+s2+" "+s3);
		int y,m,d;
		
		try {
			y = Integer.parseInt(s1);
			m = Integer.parseInt(s2);
			d = Integer.parseInt(s3);
		} catch (NumberFormatException e) {
			System.out.println("你输入的日期格式不正确，请重新运行程序输入正确的格式");
			e.printStackTrace();
			return;
		}
		
		if(m>12&&d>31){
			System.out.println("你输入的日期格式不正确，请重新运行程序输入正确的格式");
			return;
		}
		
		if(y%4==0){	//闰年
			
			switch(m){
			
			case 1:System.out.println("你输入的日期为这一年的第  "+d+"天");
					break;
			case 2:{
				if(d>29){
					System.out.println("对不起，没有这一天，请重新运行程序，并输入正确日期");
					return;
				}else{
					System.out.println("你输入的日期为这一年的第  "+(31+d)+"天");
				}
			}
					break;
			case 3:System.out.println("你输入的日期为这一年的第  "+(31+29+d)+"天");
					break;
			case 4:System.out.println("你输入的日期为这一年的第  "+(31*2+29+d)+"天");
					break;	
			case 5:System.out.println("你输入的日期为这一年的第  "+(31*2+29+d+30)+"天");
					break;	
			case 6:System.out.println("你输入的日期为这一年的第  "+(31*3+29+d+30)+"天");
					break;	
			case 7:System.out.println("你输入的日期为这一年的第  "+(31*3+29+d+30*2)+"天");
					break;	
			case 8:System.out.println("你输入的日期为这一年的第  "+(31*4+29+d+30*2)+"天");
					break;	
			case 9:System.out.println("你输入的日期为这一年的第  "+(31*5+29+d+30*2)+"天");
					break;	
			case 10:System.out.println("你输入的日期为这一年的第  "+(31*5+29+d+30*3)+"天");
					break;	
			case 11:System.out.println("你输入的日期为这一年的第  "+(31*6+29+d+30*3)+"天");
					break;	
			case 12:System.out.println("你输入的日期为这一年的第  "+(31*6+29+d+30*4)+"天");
					break;
					
			}
			
			
		}else{
			if(y%100==0){	//闰年
				switch(m){
				
				case 1:System.out.println("你输入的日期为这一年的第  "+d+"天");
						break;
				case 2:{
					if(d>29){
						System.out.println("对不起，没有这一天，请重新运行程序，并输入正确日期");
						return;
					}else{
						System.out.println("你输入的日期为这一年的第  "+(31+d)+"天");
					}
				}
						break;
				case 3:System.out.println("你输入的日期为这一年的第  "+(31+29+d)+"天");
						break;
				case 4:System.out.println("你输入的日期为这一年的第  "+(31*2+29+d)+"天");
						break;	
				case 5:System.out.println("你输入的日期为这一年的第  "+(31*2+29+d+30)+"天");
						break;	
				case 6:System.out.println("你输入的日期为这一年的第  "+(31*3+29+d+30)+"天");
						break;	
				case 7:System.out.println("你输入的日期为这一年的第  "+(31*3+29+d+30*2)+"天");
						break;	
				case 8:System.out.println("你输入的日期为这一年的第  "+(31*4+29+d+30*2)+"天");
						break;	
				case 9:System.out.println("你输入的日期为这一年的第  "+(31*5+29+d+30*2)+"天");
						break;	
				case 10:System.out.println("你输入的日期为这一年的第  "+(31*5+29+d+30*3)+"天");
						break;	
				case 11:System.out.println("你输入的日期为这一年的第  "+(31*6+29+d+30*3)+"天");
						break;	
				case 12:System.out.println("你输入的日期为这一年的第  "+(31*6+29+d+30*4)+"天");
						break;
						
				}
			}else{	//平年
				switch(m){
				
				case 1:System.out.println("你输入的日期为这一年的第  "+d+"天");
						break;
				case 2:{
					if(d>28){
						System.out.println("对不起，没有这一天，请重新运行程序，并输入正确日期");
						return;
					}else{
						System.out.println("你输入的日期为这一年的第  "+(31+d)+"天");
					}
				}
						break;
				case 3:System.out.println("你输入的日期为这一年的第  "+(31+28+d)+"天");
						break;
				case 4:System.out.println("你输入的日期为这一年的第  "+(31*2+28+d)+"天");
						break;	
				case 5:System.out.println("你输入的日期为这一年的第  "+(31*2+28+d+30)+"天");
						break;	
				case 6:System.out.println("你输入的日期为这一年的第  "+(31*3+28+d+30)+"天");
						break;	
				case 7:System.out.println("你输入的日期为这一年的第  "+(31*3+28+d+30*2)+"天");
						break;	
				case 8:System.out.println("你输入的日期为这一年的第  "+(31*4+28+d+30*2)+"天");
						break;	
				case 9:System.out.println("你输入的日期为这一年的第  "+(31*5+28+d+30*2)+"天");
						break;	
				case 10:System.out.println("你输入的日期为这一年的第  "+(31*5+28+d+30*3)+"天");
						break;	
				case 11:System.out.println("你输入的日期为这一年的第  "+(31*6+28+d+30*3)+"天");
						break;	
				case 12:System.out.println("你输入的日期为这一年的第  "+(31*6+28+d+30*4)+"天");
						break;
						
				}
			}
		}
		
	}
	
}
