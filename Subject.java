package pl.edu.home;

public class Subject {

    private String subname;

    public Subject(String subname){
        this.subname = subname;
    }

    public void info(){
        System.out.println("Nazwa przedmiotu: " + subname);
        System.out.println();
    }

}
