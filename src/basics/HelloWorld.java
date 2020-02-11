package basics;

public class HelloWorld {
    // main() -> you must have this method to run your java program
    // psvm + tab, main() if you do not have 'main method' you cannot run (only one per class)
    public static void main(String[] args) {
        // sout + tab   println -> print with newline
        System.out.println("Hello, World!");
        System.out.print("Bye!\n"); // without new line, if want a new line '/n'
        // printf -> print with format
        // %s: string, %d: decimal int, %f: float
        System.out.printf("%s starts at %02d:%02d\n", "Java Class", 8, 45);
        // printf --> print with format, '02' if you want two digits

    }
    // python - interpreted language
    // java - compiled language
    //      - source code -> 'byte code'
    //      - runs on JVM (Java Virtual Machine)
    //      - 'portable'
    //      - 1990s James Gosling (Canadian) designed Java
    //      - 'Enterprise' sized Application
    //      - 'Object-Oriented' Programming Language
}
