package RateTest;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 这个类包含了一个静态方法，用来实现动态数组的功能，用户不指定长度输入多个数字，用回车分隔，最后输入end结束输入，将接收到的数存入数组后返回该数组
 * @author 吴宜展
 * 2018/4/21
 */

public class Method {
	public static int[] shuru(){
		ArrayList a = new ArrayList();//ArrayList用来接收数，接收完成后把接收到的数传入数组c中
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
			System.out.print(c[i] + " ");//将数组接收到的数打印出来，数与数之间用空格分割
	}
		return c;//返回数组
	}
	
	public static void Bubble(int[] a) {//冒泡排序
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
