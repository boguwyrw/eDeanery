package pl.edu.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherChoose {

    List<Teacher> teachers = new ArrayList<>();
    Scanner input;
    int choiceTeacher;

    public TeacherChoose(){
        input = new Scanner(System.in);
    }

    void showTeacherChoose () {

        do {
            choiceTeacher = input.nextInt();
            switch (choiceTeacher) {

                case 1:
                    System.out.println("Dodaj nauczyciela");

                    String teacher_first;
                    String teacher_last;
                    Long teacher_pesel;
                    String t_degree;

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Podaj imie: ");
                    teacher_first = scanner.next();
                    System.out.println("Podaj nazwisko: ");
                    teacher_last = scanner.next();
                    System.out.println("Podaj PESEL: ");
                    teacher_pesel = scanner.nextLong();
                    System.out.println("Podaj stopien naukowy: ");
                    t_degree = scanner.next();

                    Teacher t = new Teacher(teacher_first, teacher_last, teacher_pesel, t_degree);

                    teachers.add(t);

                    for (Teacher teacher : teachers) {
                        teacher.info();
                    }

                    System.out.println("Dodano nauczyciela. Dokonaj ponownego wyboru");

                    break;

                case 2:
                    System.out.println("Aktualna lista nauczycieli");
                    System.out.println();

                    for (Teacher teacher : this.teachers) {
                        teacher.info();
                    }

                    System.out.println("Dokonaj ponownego wyboru");
                    break;

                case 0:
                    System.out.println("Powrociles do Menu Glownego");
                    break;

                default:
                    System.out.println("Bledny wybor - nie ma takiego numeru");
            }
        } while (choiceTeacher != 0);
    }

}
