import java.util.function.Function;

public class HelloWorld {
    public static void main(String... args) {
        Function<String, String> addHeader = Letter::addHeader;
        // 先加上抬头，然后进行拼写检查，最后加上一个落款。
        // Function<String, String> transformationPipeline = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
        // 只加抬头、落款，而不做拼写检查。
        Function<String, String> transformationPipeline = addHeader.andThen(Letter::addFooter);
        String result = transformationPipeline.apply("Hello, labda!");
        System.out.println(result);
    }

    public static class Letter {
        public static String addHeader(String text) {
            return "From Raoul, Mario and Alan: " + text;
        }

        public static String addFooter(String text) {
            return text + " Kind regards";
        }

        public static String checkSpelling(String text) {
            return text.replaceAll("labda", "lambda");
        }
    }
}