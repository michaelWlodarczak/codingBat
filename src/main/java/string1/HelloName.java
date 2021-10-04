package string1;

/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
public class HelloName {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        HelloName helloName = new HelloName();

        System.out.println(helloName.helloName("Bob"));
        System.out.println(helloName.helloName("Alice"));
        System.out.println(helloName.helloName("X"));
    }
}
