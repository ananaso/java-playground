package com.galvanize.exceptions;

public class TryCatch {
    public static void main(String[] args) {
        // 3: Working with try, catch, and finally
        try {
            // these were not provided/explained by Learn
            result = riskyProcess.run(input);
        } catch (NullPointerException e) {
            System.out.println("encountered null pointer");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
        } finally {
            System.out.println("Done");
        }
    }
}
