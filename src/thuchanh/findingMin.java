package thuchanh;

public class findingMin {
    public static int findingMin(int[] list) {
        int min = list[0];
        for (int i=0; i<list.length;i++){
            if(list[i] < min){
                min = list[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,8,5,3,4,2,9};
        System.out.println("The smallest number in the array is "+findingMin(arr));
    }
}
