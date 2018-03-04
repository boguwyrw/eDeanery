package pl.edu.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubjectChoose {

    List<Subject> subjects = new ArrayList<>();
    Scanner input;
    int choiceSubject;

    public SubjectChoose(){
        input = new Scanner(System.in);
    }

    void showSubjectChoose () {

        do {
            choiceSubject = input.nextInt();
            switch (choiceSubject) {

                case 1:
                    System.out.println("Dodaj przedmiot");

                    String sub_name;

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Podaj nazwe przedmiotu: ");
                    sub_name = scanner.next();

                    Subject sub = new Subject(sub_name);

                    subjects.add(sub);

                    for (Subject subject : subjects){
                        subject.info();
                    }

                    System.out.println("Dodano przedmiot. Dokonaj ponownego wyboru");

                    break;

                case 2:
                    System.out.println("Aktualna lista przedmiotow");
                    System.out.println();

                    for (Subject subject : this.subjects){
                        subject.info();
                    }

                    System.out.println("Dokonaj ponownego wyboru");
                    break;

                case 0:
                    System.out.println("Powrociles do Menu Glownego");
                    break;

                default:
                    System.out.println("Bledny wybor - nie ma takiego numeru");
            }
        } while (choiceSubject != 0);
    }

}
