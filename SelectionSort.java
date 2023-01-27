
public class SelectionSort {
	
	public void SelectionSort(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			int minimum = arr[i];
			int minIndex = i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<minimum) {
					minimum=arr[j];
					minIndex =j;
				}
				
				}
			arr[minIndex] = arr[i];
			arr[i] = minimum;
			
			}
			}

	public static void main(String[] args) {
		SelectionSort select = new SelectionSort();
		int arr[] ={5,3,4,1,40,2,45,12,3,5,78,9,100,32,21,11,22,67,89};
		int size= arr.length;
		System.out.print("Array Before Sort \n");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		
			System.out.print("\n");
		
		select.SelectionSort(arr);
		System.out.print("Array After Sort \n");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		
	
	}

}
