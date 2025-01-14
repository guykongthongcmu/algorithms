public class linearSearch {
    public static int search(int[] arr, int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1 = {56, 23, 87, 42, 19, 64, 91, 53, 29, 36};
        int key = 91;
        System.out.println(key+" is found at index "+ search(a1, key));
    }
}
