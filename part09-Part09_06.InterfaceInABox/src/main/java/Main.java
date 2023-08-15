
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box box = new Box(10);

        box.add(new Box(2));
        box.add(new Box(1));
        box.add(new Box(0.7));

        box.add(new Box(0.1));
        box.add(new Box(0.1));
        box.add(new Box(0.1));

        System.out.println(box);

    }

}
