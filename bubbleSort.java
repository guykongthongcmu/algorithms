public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {37
            ,125
            ,42
            ,89
            ,23
            ,567
            ,19
            ,90
            ,4
            ,77};

        int temp;
        int boundary = arr.length;

        for(int i = 0; i < boundary; i++) {
            for(int j = 0; j < (boundary - i - 1); j++) { 
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i : arr) {
            System.out.println(i);
        }
        }
            }


