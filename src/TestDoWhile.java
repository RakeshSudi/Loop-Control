import java.util.ArrayList;
import java.util.List;

public class TestDoWhile {
    public static void main(String args[]) {
        int x = 15;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(Integer s: list) {
            System.out.println(s);
        }
    }
}
