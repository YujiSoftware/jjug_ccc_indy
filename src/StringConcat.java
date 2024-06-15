public class StringConcat {
    public static void main(String[] args) {
        String text = makeText(123);
        System.out.println(text);
    }

    private static String makeText(int count) {
        return "Total:" + count + "files";
    }
}
