package assignment3.q1;

public class Psychiatrist {

    public void examine(Mood mood){
        System.out.println(mood.getMood());
        System.out.println();
    }

    public void observe(Mood mood){
        mood.ExpressFeeling();
        if(mood.getMood().equals("I am happy!")){
            System.out.println("Observation: Subject laughs a lot");
        }

        if(mood.getMood().equals("I am so sad!")){
            System.out.println("Observation: Subject cries a lot");
        }
    }

    public String toString(){
        return "";
    }
}
