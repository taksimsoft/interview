/*
Program: Write a program to find common elements between two arrays.

Description:

Write a program to identify common elements or numbers between
two given arrays. You should not use any inbuilt methods are list to
find common values.

*/
public class CommonElementsInJava {

	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5};
		int [] array2 = {3,5,7,8,9,4};
		
		new CommonElementsInJava().findCommonElements(array1,array2);
	}

	private void findCommonElements(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if( array1[i] == array2[j] ) {
					System.out.println(array1[i]);
				}
			}
		}
	}
}
