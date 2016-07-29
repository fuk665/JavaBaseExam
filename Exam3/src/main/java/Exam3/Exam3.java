package Exam3;

import java.util.Date;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����������գ����ո�ʽ YYYY-MM-DD ����");
		
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
			System.out.println("����������ڸ�ʽ����ȷ�����������г���������ȷ�ĸ�ʽ");
			e.printStackTrace();
			return;
		}
		
		if(m>12&&d>31){
			System.out.println("����������ڸ�ʽ����ȷ�����������г���������ȷ�ĸ�ʽ");
			return;
		}
		
		if(y%4==0){	//����
			
			switch(m){
			
			case 1:System.out.println("�����������Ϊ��һ��ĵ�  "+d+"��");
					break;
			case 2:{
				if(m>29){
					System.out.println("�Բ���û����һ�죬���������г��򣬲�������ȷ����");
					return;
				}else{
					System.out.println("�����������Ϊ��һ��ĵ�  "+(31+d)+"��");
				}
			}
					break;
			case 3:System.out.println("�����������Ϊ��һ��ĵ�  "+(31+29+d)+"��");
					break;
			case 4:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*2+29+d)+"��");
					break;	
			case 5:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*2+29+d+30)+"��");
					break;	
			case 6:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*3+29+d+30)+"��");
					break;	
			case 7:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*3+29+d+30*2)+"��");
					break;	
			case 8:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*4+29+d+30*2)+"��");
					break;	
			case 9:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*5+29+d+30*2)+"��");
					break;	
			case 10:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*5+29+d+30*3)+"��");
					break;	
			case 11:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*6+29+d+30*3)+"��");
					break;	
			case 12:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*6+29+d+30*4)+"��");
					break;
					
			}
			
			
		}else{
			if(y%100==0){	//����
				switch(m){
				
				case 1:System.out.println("�����������Ϊ��һ��ĵ�  "+d+"��");
						break;
				case 2:{
					if(m>29){
						System.out.println("�Բ���û����һ�죬���������г��򣬲�������ȷ����");
						return;
					}else{
						System.out.println("�����������Ϊ��һ��ĵ�  "+(31+d)+"��");
					}
				}
						break;
				case 3:System.out.println("�����������Ϊ��һ��ĵ�  "+(31+29+d)+"��");
						break;
				case 4:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*2+29+d)+"��");
						break;	
				case 5:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*2+29+d+30)+"��");
						break;	
				case 6:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*3+29+d+30)+"��");
						break;	
				case 7:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*3+29+d+30*2)+"��");
						break;	
				case 8:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*4+29+d+30*2)+"��");
						break;	
				case 9:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*5+29+d+30*2)+"��");
						break;	
				case 10:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*5+29+d+30*3)+"��");
						break;	
				case 11:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*6+29+d+30*3)+"��");
						break;	
				case 12:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*6+29+d+30*4)+"��");
						break;
						
				}
			}else{	//ƽ��
				switch(m){
				
				case 1:System.out.println("�����������Ϊ��һ��ĵ�  "+d+"��");
						break;
				case 2:{
					if(m>28){
						System.out.println("�Բ���û����һ�죬���������г��򣬲�������ȷ����");
						return;
					}else{
						System.out.println("�����������Ϊ��һ��ĵ�  "+(31+d)+"��");
					}
				}
						break;
				case 3:System.out.println("�����������Ϊ��һ��ĵ�  "+(31+28+d)+"��");
						break;
				case 4:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*2+28+d)+"��");
						break;	
				case 5:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*2+28+d+30)+"��");
						break;	
				case 6:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*3+28+d+30)+"��");
						break;	
				case 7:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*3+28+d+30*2)+"��");
						break;	
				case 8:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*4+28+d+30*2)+"��");
						break;	
				case 9:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*5+28+d+30*2)+"��");
						break;	
				case 10:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*5+28+d+30*3)+"��");
						break;	
				case 11:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*6+28+d+30*3)+"��");
						break;	
				case 12:System.out.println("�����������Ϊ��һ��ĵ�  "+(31*6+28+d+30*4)+"��");
						break;
						
				}
			}
		}
		
	}
	
}
