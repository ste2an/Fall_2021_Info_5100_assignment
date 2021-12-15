package finalExam.q1;

public class RoomBa implements iRobot{

    private int[][] room;
    private direction dir;

    private int i;
    private int j;

    private int col;
    private int row;

    public enum direction{
        Down,
        Up,
        Left,
        Right
    }

    public RoomBa(int[][] room) {
        this.i = 0;
        this.j = 0;
        this.room = room;
        this.dir = direction.Down;
        this.row = room.length;
        this.col = room[0].length;
    }

    @Override
    public boolean move() {

        switch (this.dir){
            case Up -> {
                if(j - 1 < 0 || room[i][j - 1] == -1){
                    return false;
                }else{
                    this.j = j - 1;
                    return true;
                }
            }
            case Down -> {
                if(j + 1 >= row || room[i][j + 1] == -1){
                    return false;
                }else{
                    this.j = j + 1;
                    return true;
                }
            }

            case Left -> {
                if(i - 1 < 0 || room[i - 1][j] == -1){
                    return false;
                }else{
                    this.i = i - 1;
                    return true;
                }
            }
            case Right -> {
                if(i + 1 >= col || room[i + 1][j] == -1){
                    return false;
                }else{
                    this.i = i + 1;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public void turnLeft() {
        this.dir = direction.Left;
    }

    @Override
    public void turnRight() {
        this.dir = direction.Right;
    }

    @Override
    public void clean() {
        room[i][j] = 1;
    }
}
