package fuck996.sort;

import java.util.Arrays;
import java.util.List;

/**
 * ���ٲ���1000������У�����100��(�㷨)
 * 
 * @author chen
 *
 */
public class BigSort {

	private static final int lenth = 1000 * 1000 * 10;

	public static void main(String[] args) {

		int[] ints = new int[lenth];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		long time = System.currentTimeMillis();

		/*
		 * Arrays.sort(ints); for(int i=lenth-100;i<lenth;i++) {
		 * System.out.print(ints[i]+";"); } System.out.println();
		 */
		System.out.println(System.currentTimeMillis() - time);

	}

}



