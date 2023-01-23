public class BinarySearch {

    public int binary_search(int arr[],int Num ){
        int low = 0;
        int high = arr.length - 1;
        int itr = 0 ;

        while (low<=high){
            int mid= (low+high) / 2;
            if(arr[mid] == Num){
            	System.out.println("Number of i=Iteratoins are: "+ itr);
               return mid;
            }

            if(arr[mid] < Num)
                low = mid + 1;
            if(arr[mid] > Num)
                high = mid - 1;
            itr++;
        }
        return -1;
    }
    public int normal_search(int arr[],int Num ){
        int i = arr.length;
        int z=0;
        int itr =0;
        while (z <i){

          if(Num == arr[z]) {
        	  System.out.println("Number of i=Iteratoins are: "+ itr);
               return z;
          }

           z++;
           itr++;

       }
        return -1;
    }


    public static void main(String args[]){
    	//If the The number we are searching for is Less than log n , It is better to use Normal search
    	//If Num=1 , noarmalSearch will take 1 iteration , while Binary will take 18 Iterations.
        BinarySearch bin = new BinarySearch();

        int[] arr = new int[1000000];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }


        System.out.println(bin.binary_search(arr,999999));
        System.out.println(bin.normal_search(arr,999999));
       
    }
}
