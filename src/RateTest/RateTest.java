package RateTest;

/*
 * main方法用来测试
 * @author 吴宜展
 * 2018/4/21
 */

public class RateTest  {
	public static void main(String[] args) {
		System.out.println("请输入第一个数组，数字之间用回车分隔，最后输入end结束输入：");
        int a[] = Method.shuru();
        System.out.println("请输入第二个数组，数字之间用回车分隔，最后输入end结束输入：");
        int b[] = Method.shuru();
        Rate.calculate(a, b);
		}
}
