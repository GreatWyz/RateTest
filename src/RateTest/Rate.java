package RateTest;

import java.util.ArrayList;

/*
 * calculate方法先求交集，打印出来，再求并集元素个数，最后求交集元素个数与并集元素个数之比
 * @author 吴宜展
 * 2018/4/21
 */

public class Rate {
	public static void calculate(int[] a,int[] b) {
		int m = a.length;
		int n = b.length;
		ArrayList list = new ArrayList();//list用来放入交集的元素
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
        System.out.println("两个集合的交集为：");
        for(int k = 0;k < list.size();k++) {
        System.out.print(list.get(k)+" ");
        }
        System.out.println();
        System.out.println("交集元素个数与并集元素个数之比为：");
        int unit = m + n - list.size();//unit是并集的元素个数
        double rate = unit/list.size();
        System.out.println(rate);
	}
}
