class MaxArray {
    static int max(int arr[]) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m)
                m = arr[i];
        }
        return m;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 15};
        System.out.println("Max = " + max(arr));
    }
}
