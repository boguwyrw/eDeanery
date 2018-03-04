package pl.edu.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentChoose {

    List<Student> students = new ArrayList<>();
    Scanner input;
    int choiceStudent;

    public StudentChoose(){
        input = new Scanner(System.in);
    }

    void showStudentChoose () {

        do {
            choiceStudent = input.nextInt();
            switch (choiceStudent) {

                case 1:
                    System.out.println("Dodaj studenta");

                    String student_first;
                    String student_last;
                    Long student_pesel;
                    Integer album;

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Podaj imie: ");
                    student_first = scanner.next();
                    System.out.println("Podaj nazwisko: ");
                    student_last = scanner.next();
                    System.out.println("Podaj PESEL: ");
                    student_pesel = scanner.nextLong();
                    System.out.println("Podaj numer albumu: ");
                    album = scanner.nextInt();

                    Student s = new Student(student_first, student_last,student_pesel, album);

                    students.add(s);

                    for (Student student : students){
                        student.info();
                    }

                    System.out.println("Dodano studenta. Dokonaj ponownego wyboru");

                    break;

                case 2:
                    System.out.println("Aktualna lista studentow");
                    System.out.println();

                    for (Student student : this.students) {
                        student.info();
                    }

                    System.out.println("Dokonaj ponownego wyboru");
                    break;

                case 0:
                    System.out.println("Powrociles do Menu Glownego");
                    break;

                default:
                    System.out.println("Bledny wybor - nie ma takiego numeru");
            }
        } while (choiceStudent != 0);
    }

}
