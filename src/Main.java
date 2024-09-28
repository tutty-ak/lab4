import ru.mirea.leonidova.Movable;
import ru.mirea.leonidova.MovableCircle;
import ru.mirea.leonidova.MovablePoint;
import ru.mirea.leonidova.MovableRectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movable m = new MovableCircle(5, new MovablePoint(7, 4, 9, 12));
        System.out.println(m);
        m.moveLeft();
        m.moveUp();
        System.out.println(m);

        Movable rect = new MovableRectangle(4, 6, 3, 9, 4, 8);
        System.out.println(rect);
        rect.moveDown();
        rect.moveRight();
        System.out.println(rect);
    }
}