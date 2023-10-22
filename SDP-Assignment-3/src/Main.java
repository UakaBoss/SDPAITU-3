// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IXboxController xboxController = new XboxController();
        IKeyboard keyboard = new Keyboard();

        IXboxController adaptedXboxController = new KeyboardAdapter(keyboard);

        xboxController.moveUp();
        xboxController.moveDown();
        xboxController.moveLeft();
        xboxController.moveRight();
        xboxController.attackMelee();
        xboxController.jump();

        System.out.println("-----------------------");

        adaptedXboxController.moveUp();
        adaptedXboxController.moveDown();
        adaptedXboxController.moveLeft();
        adaptedXboxController.moveRight();
        adaptedXboxController.attackMelee();
        adaptedXboxController.jump();
    }
}