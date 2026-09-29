public class StringReverser {
    public static void main(String[] args) {
        String originalText = "StringReverser";

        String reversed = reversed(originalText);
        System.out.println("Original: " + originalText);
        System.out.println("Reversed: " + reversed);
    }

    public static String reversed(String text){
        String result = "";
        for (int i = text.length() - 1; i >=0; i--){
            result = result + text.charAt(i);
        }

        return result;
    }
}
