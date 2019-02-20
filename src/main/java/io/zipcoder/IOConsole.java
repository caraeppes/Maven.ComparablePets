package io.zipcoder;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args);
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        print(val + "\n", args);
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        print(prompt);
        return this.scanner.nextLine();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
        print(prompt);
        return this.scanner.nextInt();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
        print(prompt);
        return this.scanner.nextDouble();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */ // TODO - Change recursion to iteration
    public Float getFloatInput(String prompt, Object... args) {
        print(prompt);
        return this.scanner.nextFloat();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */ // TODO - Change recursion to iteration
    public Long getLongInput(String prompt, Object... args) {
        print(prompt);
        return this.scanner.nextLong();
    }
}