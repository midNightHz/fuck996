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
		return false;
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
			result.add(new Integer("" + bigNumber + i));
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		exec();
	}

}
