package Project;

public class Person {
    String ID;
    String Surname;
    String FirstName;
    String MiddleName;

    public Person(String ID, String surname, String firstName, String middleName) {
        this.ID = ID;
        Surname = surname;
        FirstName = firstName;
        MiddleName = middleName;
    }

    @Override
    public String toString() {
        return ID + " " + Surname + " " + FirstName + " " + MiddleName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }
}

