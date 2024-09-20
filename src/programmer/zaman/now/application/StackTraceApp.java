package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "Sony",
                    "Darmawan"
            };

            System.out.println(names[100]);
        } catch ( Throwable throwable ) {
            StackTraceElement[] stackTraceElement = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
