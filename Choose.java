package pl.edu.home;

import java.util.Scanner;

public class Choose {

    Scanner input;
    int choice;

    public Choose() {
        input = new Scanner(System.in);
    }

    void showChoose () {
        do {
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Witaj w MENU NAUCZYCIELA");
                    System.out.println("Prosze dokonaj wyboru:");
                    System.out.println("DODANIE NAUCZYCIELA - wcisnij 1");
                    System.out.println("WYSWIETLENIE LISTY NAUCZYCIELI - wcisnij 2");
                    System.out.println("WYJSCIE - wcisnij 0");

                    TeacherChoose teacherchoice = new TeacherChoose();
                    teacherchoice.showTeacherChoose();

                    break;

                case 2:
                    System.out.println("Witaj w MENU STUDENTA");
                    System.out.println("Prosze dokonaj wyboru:");
                    System.out.println("DODANIE STUDENTA - wcisnij 1");
                    System.out.println("WYSWIETLENIE LISTY STUDENTOW - wcisnij 2");
                    System.out.println("WYJSCIE - wcisnij 0");

                    StudentChoose studentchoice = new StudentChoose();
                    studentchoice.showStudentChoose();

                    break;

                case 3:
                    System.out.println("Witaj w MENU PRZEDMIOTU");
                    System.out.println("Prosze dokonaj wyboru:");
                    System.out.println("DODANIE PRZEDMIOTU - wcisnij 1");
                    System.out.println("WYSWIETLENIE LISTY PRZEDMIOTOW - wcisnij 2");
                    System.out.println("WYJSCIE - wcisnij 0");

                    SubjectChoose subjectchoice = new SubjectChoose();
                    subjectchoice.showSubjectChoose();

                    break;

                case 0:
                    System.out.println("Wyszedles z programu. Dziekujemy");
                    break;

                default:
                    System.out.println("Bledny wybor - nie ma takiego numeru");

            }
        } while (choice != 0);
    }

}
