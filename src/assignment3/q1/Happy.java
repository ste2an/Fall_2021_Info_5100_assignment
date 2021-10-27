package assignment3.q1;

public class Happy extends Mood{

    @Override
    public String getMood() {
        return "I am happy!";
    }

    @Override
    public void ExpressFeeling() {
        System.out.println("heeehee....hahahah...HAHAHA!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

}
