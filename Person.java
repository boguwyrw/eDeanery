package pl.edu.home;

public class Person {

    protected String firstName;
    protected String lastName;
    protected Long pesel;
// ponizej konstruktor z argumentami
    public Person (String firstName, String lastName, Long pesel){

        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

}
