package trashbin;

import trashbin.system.Trashbin;

public class Main {
    public static void main(String[] args) {
        Trashbin trash = new Trashbin();

        trash.setHeight(45);
        trash.setLocation("B1");
        trash.showInformation();

        trash.updateFullness(28);
        trash.showInformation();

        trash.cleanTrashbin();
        trash.showInformation();
    }
}
