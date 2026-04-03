class SecLar{
    public static int SecondLargest(int[] arr) {

        int f= Integer.MIN_VALUE;
        int s= Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > f) {
                s = f;
                f = num;
            } 
            else if (num > s && num != f) {
                s = num;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,3,89,93,74,31,90,90,1,34,54,32,67};
     //   int[] arr={10,9,9,9};
    // int[] arr={10,10,10,10};
        System.out.println(SecondLargest(arr));
    }
}
