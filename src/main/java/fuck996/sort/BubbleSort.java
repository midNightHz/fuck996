package fuck996.sort;

import java.util.Arrays;

/**
 * ц╟ещеепР
 * @author chen
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] ints = new int[10];

		for (int i = 0; i < ints.length; i++) {
			ints[i] = (int) (Math.random() * 1000.0f);
		}
		System.out.println(Arrays.toString(ints));
		int lenth = ints.length;
		int temp;
		for (int i = 0; i < lenth - 1; i++) {
			for (int j = i; j < lenth; j++) {
				if (ints[i] > ints[j]) {
					temp = ints[i];
					ints[i] = ints[j];
					ints[j]= temp;
				}
			}

		}
		System.out.println(Arrays.toString(ints));

	}

}
