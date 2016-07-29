package Exam2;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println("请输入工资：");
		Scanner scanner=new Scanner(System.in);
		
		float m;
		try {
			m = scanner.nextFloat();
			if(m<=0){
				System.out.println("请输入正确的工资后并重新运行程序");
				return;
			}
		} catch (Exception e) {
			System.out.println("请输入正确的工资后并重新运行程序");
			e.printStackTrace();
			return;
		}
		
		float m1=m-3500;
		float s=0;
		if(m<3500){
			System.out.println("你不用交税");
			//低于1500
		}else if(m1<=1500){
			s=(float) (m1*0.03);
			//1500-4500
		}else if(1500<m1&&m1<=4500){
			s=(float) (45+(m1-1500)*0.1);
			//4500-9000
		}else if(4500<m1&&m1<=9000){
			s=(float) (45+300+(m1-4500)*0.2);
			//9000-35000
		}else if(9000<m1&&m1<=35000){
			s=(float) (45+300+900+(m1-9000)*0.25);
			//35000-55000
		}else if(35000<m1&&m1<=55000){
			s=(float) (45+300+900+6500+(m1-35000)*0.3);
			//55000-80000
		}else if(55000<m1&&m1<=80000){
			s=(float) (45+300+900+6500+4000+(m1-55000)*0.35);
		}else if(m1>80000){
			s=(float) (45+300+900+6500+4000+8750+(m1-80000)*0.45);
		}
		System.out.println("所需缴纳的税费是："+s+"元");
	}

	
}
