package Lambda_test;

public class Java8Tester2 {
    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetingService1 = message ->
                System.out.println(salutation + message);
        greetingService1.sayMessage("Runoob");
    }

    interface GreetingService{
        void sayMessage(String message);
    }
}
