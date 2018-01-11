import java.util.Iterator;

/**
 * Created by khx on 17-10-25.
 */
public class SortTest {
    public void quickSort(int[] arr,int low,int hight){
        if(low<hight) {
            int pivot = splitArray(arr, low, hight);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,hight);
        }
    }

    private int splitArray(int[] arr, int low, int hight) {
        int pivot=arr[low];
        while(low<hight){
            while(low<hight&&arr[hight]>=pivot){
                hight--;
            }
            arr[low]=arr[hight];
            while(low<hight&&arr[low]<pivot){
                low++;
            }
            arr[hight]=arr[low];
        }
        arr[low]=pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] array={1,5,2,6,8,3,8,3,7,9,3,2,7,9,6};
        SortTest sortTest=new SortTest();
        sortTest.quickSort(array,0,array.length-1);
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}
