class SumArray {
    static int sum(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println("Sum = " + sum(arr));
    }
}
