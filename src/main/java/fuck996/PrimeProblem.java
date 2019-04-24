package fuck996;

import java.util.ArrayList;
import java.util.List;

/**
 * 某女的征婚问题
 * 
 * @author chen
 *
 */
public class PrimeProblem {

	/**
	 * 当前数数字是否为素数
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num) {
		return false;
	}

	/**
	 * 某一个数是否包含某个数字
	 * 
	 * @param num
	 * @param targetNum
	 *            0-9 的数字
	 * @return
	 */
	public static boolean containNum(int num, int targetNum) {

		return false;
	}

	public static void exec() {
		// 乘积的数
		int number = 707829217;
		// 对乘积的数求平方根 两个不同的数的乘积，必然一个小于乘积数的平方根，一个大于乘积数的平方根
		int sqrtNumber = (int) Math.sqrt(number);
		// 小数
		List<Integer> smallNumbers = new ArrayList<Integer>();
		// 结果数
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 2; i <= sqrtNumber; i++) {
			if (isPrime(i)) {
				smallNumbers.add(i);
			}
		}
		for (Integer i : smallNumbers) {

			if (number % i != 0) {
				continue;
			}

			int bigNumber = number / i;

			if (!isPrime(bigNumber)) {
				continue;
			}
			result.add(new Integer("" + bigNumber + i));
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		exec();
	}

}
