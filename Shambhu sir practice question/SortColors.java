public class SortColors {

    public void sortColors(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Main method to run in VS Code / Notepad
    public static void main(String[] args) {
        SortColors obj = new SortColors();

        int[] arr = {2, 0, 2, 1, 1, 0};

        obj.sortColors(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}