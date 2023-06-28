class Ball{
    private int posX;
    private int posY;
    private int speed;
    private int size = 22;

    Ball(int speed, int posY, int size){
        posX = 0;
        this.speed = speed;
        this.posY = posY;
        this.size = size;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getSize() {
        return size;
    }

    void updatePosX(){
        this.posX += this.speed;
    }

}