package ch14;

import java.util.*;

public class R14_22 {

    public static void main(String[] args) {
	int[] a = ArrayUtil.randomIntArray(20, 100);
	System.out.println(Arrays.toString(a));

	RadixSorter.sort(a);

	System.out.println(Arrays.toString(a));

    }

}
