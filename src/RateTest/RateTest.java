package RateTest;

/*
 * main������������
 * @author ����չ
 * 2018/4/21
 */

public class RateTest  {
	public static void main(String[] args) {
		System.out.println("�������һ�����飬����֮���ûس��ָ����������end�������룺");
        int a[] = Method.shuru();
        System.out.println("������ڶ������飬����֮���ûس��ָ����������end�������룺");
        int b[] = Method.shuru();
        Rate.calculate(a, b);
		}
}
