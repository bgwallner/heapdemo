import java.util.Arrays;

public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		System.out.println(Arrays.toString(a));
		
		HeapClass HeapObj = new HeapClass();
		HeapObj.buildHeap(a);
		
		System.out.println(Arrays.toString(a));

	}
}
