
public class HeapClass {
	
	public void buildHeap(int A[]) {
		int heapsize, index;
		
		heapsize = A.length-1;
		
		for (index = A.length/2-1; index>=0; index--) {
			heapify(A, index);
		}
		
	}
	
	private void heapify(int A[], int i) {
		
		System.out.printf("Heapify called.\n");
		
		/* 'i' runs from 0->N-1 */
		
		int l, r, heapsize, largest, temp;
		
		/* Init variables */
		heapsize = A.length-1;
		l = left(i);
		r = right(i);
		
		System.out.printf("i=%d A[%d]=%d left=%d right=%d \n", i, i, A[i], l, r);
		
		/* Check left value if within heap-size */
		if(l <= heapsize && A[l] > A[i]) {
			largest = l;
		}
		else {
			largest = i;
		}
		
		/* Check right value if within heap-size */
		/* Compare with 'largest' value          */
		if (r <= heapsize && A[r] > A[largest]) {
			largest = r;
		}
		
		/* If 'largest' is not 'i', change */
		/* values                          */
		if (largest != i) {
			temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			/* Call recursively */
			heapify(A, largest);
		}
		
	}
	
	/* Parent, left, right for arrays 0->N-1 */
	private int parent(int i) {
		return (i+1)/2-1;
	}
	
    private int left(int i) {
		return 2*(i+1)-1;
	}
	
	public int right(int i) {
		return (2*(i+1)+1)-1;
	}

}
