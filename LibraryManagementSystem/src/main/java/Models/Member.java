package Models;

public class Member {
    String firstName;
    String secondName;
    String CNP;

    public void printMemberName() {
        System.out.println(firstName + secondName);
    }

    public void printCNP() {
        System.out.println(CNP);
    }

    public void getFirstName(String name) {
        firstName = name;
    }

    public void getSecondName(String name) {
        secondName = name;
    }

    public void getCNP(String cnp) {
        CNP = cnp;
    }
}
