package assignment3.q1;

public class main {
    public static void main(String[] args) {

        Psychiatrist p1 = new Psychiatrist();
        Psychiatrist p2 = new Psychiatrist();

        Mood mood1 = new Happy();
        Mood mood2 = new Sad();

        mood1.queryMood();
        p1.examine(mood1);
        p1.observe(mood1);

        mood2.queryMood();
        p2.examine(mood2);
        p2.observe(mood2);

    }


}
