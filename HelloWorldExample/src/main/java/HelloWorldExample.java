public class HelloWorldExample {
    public static void main(String[] args) {
        System.out.println(helloConcat("World"));
    }

    public static String helloConcat(String text) {
        text = "Hello " +text;
        return text;
    }
}