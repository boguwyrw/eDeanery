package pl.edu.home;

public class Teacher extends Person {

    private String degree;
    private Long id;

    private  static Long currentID = 1L;

    public Teacher(String firstName, String lastName, Long pesel, String degree) {
        super(firstName, lastName, pesel);
        this.degree = degree;
        id = currentID++;
    }

    public void info() {
        System.out.println("Nauczyciel akademicki nr " + id);
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Pesel: " + pesel);
        System.out.println("Stopień naukowy: " + degree);
        System.out.println();
    }

}
