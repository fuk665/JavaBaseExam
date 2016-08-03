package Exam2;

import java.util.Scanner;

@SuppressWarnings("all")
public class Exam2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的工资：");
		double money;
		try {
			money=scanner.nextDouble();
			if(money<0){
				System.out.println("你输入的金额不合法");
				return;
			}
		} catch (Exception e) {
			System.out.println("你输入的金额不合法");
			e.printStackTrace();
			return;
		}
		
		if((money-3500)<=0){
			System.out.println("你需要缴纳的税费为0");
		}else if((money-3500)<=1500){	//0-1500
			System.out.println("你需要缴纳的税费为："+(money-3500)*0.03);
		}else if((money-3500)<=4500){	//1500-4500
			System.out.println("你需要缴纳的税费为："+( (money-3500-1500)*0.1 + 45 ) );
		}else if( (money-3500)<=9000 ){	//4500-9000
			System.out.println("你需要缴纳的税费为："+ ( (money-3500-4500)*0.2 +  345 ));
		}else if( (money-3500)<=35000 ){
			System.out.println("你需要缴纳的税费为："+ ( (money-3500-9000)*0.25  + 1245 ));
		}else if( (money-3500)<=55000 ){
			System.out.println("你需要缴纳的税费为："+( (money-3500-35000)*0.3  + 7745 ));
		}else if( (money-3500)<=80000 ){
			System.out.println("你需要缴纳的税费为："+ ( (money-3500-55000)*0.35  + 13745));
		}else{
			System.out.println("你需要缴纳的税费为："+ ( (money-3500-80000)*0.45  + 22495 ));
		}
		
	}
	
}
