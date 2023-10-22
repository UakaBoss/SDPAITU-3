public class Keyboard implements IKeyboard {
    @Override
    public void goUp() {
        System.out.println("'W' button");
    }
    @Override
    public void goDown() {
        System.out.println("'S' button");
    }
    @Override
    public void goLeft() {
        System.out.println("'A' button");
    }
    @Override
    public void goRight() {
        System.out.println("'D' button");
    }
    @Override
    public void attack() {
        System.out.println("'LMB' to attack");
    }
    @Override
    public void jump() {
        System.out.println("'SPACE' button to jump");
    }
}
