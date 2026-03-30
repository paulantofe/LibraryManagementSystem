package Test;

import Models.Member;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberTests {
    try {
        FileWriter myWriter = new FileWriter("MemberPrintText.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();  // must close manually
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }



    Scanner input = new Scanner(System.in);

    Member m1 = new Member();

    public void main(String[] args) {
        System.out.println("Enter your first name:");
        String name = input.nextLine();
        m1.getFirstName(name);

        System.out.println("Enter your last name:");
        name = input.nextLine();
        m1.getLastName(name);

        System.out.println("Enter your CNP:");
        name = input.nextLine();
        m1.getCNP(name);
    }
}
