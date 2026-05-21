public class ReverseSeq {
    public static void main(String[] args) {
        String str = "I love Java programming";

        // Split sentence into words
        String[] words = str.split(" ");

        // Reverse words
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}