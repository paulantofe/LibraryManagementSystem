package Models;

public class Member {
    String firstName;
    String lastName;
    String CNP;

    public void printMemberName() {
        System.out.println(firstName + lastName);
    }

    public void printCNP() {
        System.out.println(CNP);
    }

    public void getFirstName(String name) {
        firstName = name;
    }

    public void getLastName(String name) {
        lastName = name;
    }

    public void getCNP(String cnp) {
        CNP = cnp;
    }
}
