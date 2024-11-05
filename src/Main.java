import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Trashbin trash1 = new Trashbin(100, "Las Vegas");
        Trashbin trash2 = new Trashbin(500,"London");

        // Tests
        trash1.setPercentage(random.nextInt(0, 100));
        trash1.cleanTrashbin();
        trash1.setPercentage(random.nextInt(0, 100));

        trash2.setPercentage(random.nextInt(0, 500));
        trash2.cleanTrashbin();
        trash2.setPercentage(random.nextInt(0, 500));
        trash2.cleanTrashbin();


    }
}
