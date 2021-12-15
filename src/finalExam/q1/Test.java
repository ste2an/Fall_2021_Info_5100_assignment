package finalExam.q1;

public class Test {

    public static void main(String[] args) {
        int[][] rooms = new int[4][4];
        rooms[0] = new int[]{0,0,1,1};
        rooms[1] = new int[]{0,-1,0,1};
        rooms[2] = new int[]{0,0,-1,1};
        rooms[3] = new int[]{1,0,0,0};

        RoomBa r = new RoomBa(rooms);
        System.out.println(r.move()); // move down -> true

        r.clean();
        System.out.println(r.move()); // move down -> true
        System.out.println(r.move()); // move down -> true
        System.out.println(r.move()); // move down -> false

        r.turnLeft();
        System.out.println(r.move()); // move left -> false

        r.turnRight();
        System.out.println(r.move());// move right -> true
        System.out.println(r.move());// move right -> true
        System.out.println(r.move());// move right -> true
        System.out.println(r.move());// move right -> false

    }

}
