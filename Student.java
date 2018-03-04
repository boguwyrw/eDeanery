package pl.edu.home;

public class Student extends Person {

    private Integer albumNo;
    private Long id;

    private static Long currentID = 1L;

    public Student(String firstName, String lastName, Long pesel, Integer albumNO) {
        super(firstName, lastName, pesel);
        this.albumNo = albumNO;
        id = currentID++;
    }

    public void info() {

        System.out.println("Student nr " + id);
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Pesel: " + pesel);
        System.out.println("Numer albumu: " + albumNo);
        System.out.println();
    }

}
