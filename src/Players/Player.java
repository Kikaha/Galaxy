package Players;

public abstract class Player {
    private int x;
    private int y;

    protected Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }


}
