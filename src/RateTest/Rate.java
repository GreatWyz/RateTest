package RateTest;

import java.util.ArrayList;

/*
 * calculate�������󽻼�����ӡ���������󲢼�Ԫ�ظ���������󽻼�Ԫ�ظ����벢��Ԫ�ظ���֮��
 * @author ����չ
 * 2018/4/21
 */

public class Rate {
	public static void calculate(int[] a,int[] b) {
		int m = a.length;
		int n = b.length;
		ArrayList list = new ArrayList();//list�������뽻����Ԫ��
		Method.Bubble(a);
		Method.Bubble(b);
        int i = 0;
        int j = 0;
        while(i < m && j < n) {
        	if(a[i] < b[j]) {
        		i++;
        	}
        	else if (a[i] > b[j]) {
        		j++;
        	}
        	else {
        		list.add(a[i]);
        		i++;
        		j++;
        	}
        }
        System.out.println("�������ϵĽ���Ϊ��");
        for(int k = 0;k < list.size();k++) {
        System.out.print(list.get(k)+" ");
        }
        System.out.println();
        System.out.println("����Ԫ�ظ����벢��Ԫ�ظ���֮��Ϊ��");
        int unit = m + n - list.size();//unit�ǲ�����Ԫ�ظ���
        double rate = unit/list.size();
        System.out.println(rate);
	}
}
