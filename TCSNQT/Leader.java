// Write a program to find Leader in array.


 class Leader {

    public static void Lea(int[] arr) {
        int n = arr.length;
        int maxR = arr[n - 1];
        System.out.print(maxR + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxR) {
                maxR= arr[i];
                System.out.print(maxR + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        Lea(arr);
    }
}