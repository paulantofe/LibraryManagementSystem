package Test;

import Models.Member;


import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class MemberTests {

    Scanner input = new Scanner(System.in);

    Member m1 = new Member();

    public void main(String[] args) {
        PrintStream membersOut = null;
        try {
            membersOut = new PrintStream(new File("memberPrintTest.txt"));
            System.setOut(membersOut);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Enter your first name:");
        String name = input.nextLine();
        m1.getFirstName(name);

        System.out.println("Enter your last name:");
        name = input.nextLine();
        m1.getLastName(name);

        System.out.println("Enter your CNP:");
        name = input.nextLine();
        m1.getCNP(name);

        assert membersOut != null;
        membersOut.println(m1);
    }
}
