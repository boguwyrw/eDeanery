package pl.edu.home;

public class Main {

    public static void main(String[] args) {

        System.out.println("Witaj w MENU GLOWNYM");
        System.out.println("Prosze dokonaj wyboru:");
        System.out.println("MENU NAUCZYCIELA - Wcisnij 1");
        System.out.println("MENU STUDENTA - Wcisnij 2");
        System.out.println("MENU PRZEDMIOTU - Wcisnij 3");
        System.out.println("WYJSCIE - Wcisnij 0");

        Choose choice = new Choose();
        choice.showChoose();

    }
}
