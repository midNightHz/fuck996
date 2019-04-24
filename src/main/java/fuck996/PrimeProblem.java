package fuck996;

import java.util.ArrayList;
import java.util.List;

/**
 * ĳŮ����������
 * 
 * @author chen
 *
 */
public class PrimeProblem {

	/**
	 * ��ǰ�������Ƿ�Ϊ����
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2 || num == 3) {
			return true;
		}

		int sqrt = (int) Math.sqrt(num);

		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ĳһ�����Ƿ����ĳ������
	 * 
	 * @param num
	 * @param targetNum
	 *            0-9 ������
	 * @return
	 */
	public static boolean containNum(int num, int targetNum) {
		if (targetNum < 0 || targetNum > 9) {
			return false;
		}
		if (num == 0 && targetNum == 0) {
			return true;
		}
		while (num != 0) {
			int a = num % 10;

			if (a == targetNum) {
				return true;
			}
			num /= 10;

		}

		return false;
	}

	public static void exec() {
		// �˻�����
		int number = 707829217;
		// �Գ˻�������ƽ���� ������ͬ�����ĳ˻�����Ȼһ��С�ڳ˻�����ƽ������һ�����ڳ˻�����ƽ����
		int sqrtNumber = (int) Math.sqrt(number);
		// С��
		List<Integer> smallNumbers = new ArrayList<Integer>();
		// �����
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
			// System.out.println(i);
			result.add(new Integer("" + bigNumber + i));
		}

		System.out.println("�����һ�����⣺" + result);

		for (Integer i : result) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					continue;
				}
				boolean contain = containNum(j, 3);
				if (contain) {
					count++;
				}
			}
			System.out.println("����ڶ�������Ĵ𰸣�" + count);
		}

	}

	public static void main(String[] args) {
		exec();
	}

}
