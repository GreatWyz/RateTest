package RateTest;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����������һ����̬����������ʵ�ֶ�̬����Ĺ��ܣ��û���ָ���������������֣��ûس��ָ����������end�������룬�����յ�������������󷵻ظ�����
 * @author ����չ
 * 2018/4/21
 */

public class Method {
	public static int[] shuru(){
		ArrayList a = new ArrayList();//ArrayList������������������ɺ�ѽ��յ�������������c��
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt ()) {
			int number = in.nextInt();
			a.add(number);
		}
		int b = a.size();
		int[] c = new int[b];
		for(int i = 0;i < b;i++) {
			c[i] = (int)a.get(i);
			}
		for(int i = 0;i < b;i++) {
			System.out.print(c[i] + " ");//��������յ�������ӡ������������֮���ÿո�ָ�
	}
		return c;//��������
	}
	
	public static void Bubble(int[] a) {//ð������
		   for(int i = 0;i < a.length;i++) {
			   for(int j = 0;j < a.length - i - 1;j++) {
				   if(a[j] > a[j+1]) {
					   int temp = a[j];
					   a[j] = a[j+1];
					   a[j+1] = temp;
				   }
			   }
		   }
	   }
}
