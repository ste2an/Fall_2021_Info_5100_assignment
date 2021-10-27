package assignment3.q1;

public class Sad extends Mood{

    @Override
    public String getMood() {
        return "I am so sad!";
    }

    @Override
    public void ExpressFeeling() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    public String toString(){
        return "Subject cries a lot";
    }


}
