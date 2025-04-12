public class LinearSearchWord {
    public static void main(String[] args) {
        //
        String[] sentences = {
                "Java is a versatile language.",
                "Python is great for AI applications.",
                "C++ is known for its performance.",
                "JavaScript is used for web development."
        };

        String targetWord = "No";

        String result = searchForWord(sentences, targetWord);
        System.out.println(result);
    }

    public static String searchForWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}