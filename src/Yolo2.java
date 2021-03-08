import java.util.Arrays;

public class Yolo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for (int i = 0; i<array.length; i++) {
			array[i]=(int)(1+100*Math.random());
		}
		
		System.out.println(Arrays.toString(array));
//		selection sort, bubble sort
//		insertion sort
//		quick sort
//		radix sort
//		counting sort
//		merge sort
//		heap sort
//		binary sort
		System.out.println("After sorting....");
		for (int i=0; i<array.length;i++) {
			int minIdx=i;
			for (int j=i+1; j<array.length;j++) {
				if (array[j]<array[minIdx]) {
					minIdx = j;
				}
			}
			int temp= array[i];
			array[i]=array[minIdx];
			array[minIdx]=temp;
		}
		System.out.println(Arrays.toString(array));

	}

}
