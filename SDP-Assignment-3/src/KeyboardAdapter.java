public class KeyboardAdapter implements IXboxController {
    private IKeyboard ikeyboard;

    public KeyboardAdapter(IKeyboard ikeyboard) {
        this.ikeyboard = ikeyboard;
    }
    @Override
    public void moveUp() {
        ikeyboard.goUp();
    }
    @Override
    public void moveDown() {
        ikeyboard.goDown();
    }
    @Override
    public void moveLeft() {
        ikeyboard.goLeft();
    }
    @Override
    public void moveRight() {
        ikeyboard.goRight();
    }
    @Override
    public void attackMelee() {
        ikeyboard.attack();
    }
    @Override
    public void jump() {
        ikeyboard.jump();
    }
}
