import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randInt1 = random.nextInt(0, 100);
        int randInt2 = random.nextInt(0, 200);

        Trashbin trash1 = new Trashbin(100, "Las Vegas");
        Trashbin trash2 = new Trashbin(200,"London");
        
        trash1.setPercentage(randInt1);
        trash1.cleanTrashbin();
        trash1.setPercentage(randInt1);
        trash1.cleanTrashbin();
        trash1.cleanTrashbin();

        trash2.setPercentage(randInt2);
        trash2.cleanTrashbin();
        

    }
}
