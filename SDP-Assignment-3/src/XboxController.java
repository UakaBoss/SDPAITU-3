public class XboxController implements IXboxController {
    @Override
    public void moveUp() {
        System.out.println("Left stick up");
    }
    @Override
    public void moveDown() {
        System.out.println("Left stick down");
    }
    @Override
    public void moveLeft() {
        System.out.println("Left stick left");
    }
    @Override
    public void moveRight() {
        System.out.println("Left stick right");
    }
    @Override
    public void attackMelee() {
        System.out.println("'X' button to attack");
    }
    @Override
    public void jump() {
        System.out.println("'A' button to jump");
    }
}
