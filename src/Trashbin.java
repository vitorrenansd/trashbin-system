public class Trashbin {
    private final int height;
    private final String location;
    private int clean;
    private String status;
    private int fullness;


    // Constructor
    public Trashbin(int heightCM, String location) {
        this.height = heightCM;
        this.location = location;
        this.clean = 0;
        this.status = "Empty";
        this.fullness = 0;
    }

    // Set the % of fullness
    public void setPercentage(int soundReturn) {
        this.fullness = (this.height - soundReturn) * 100 / this.height;
        scanTrashbin();
    }

    // Cleans the trash bin
    public void cleanTrashbin() {
        this.fullness = 0;
        this.clean += 1;
        System.out.println("Cleaning " + this.location + " trash bin...");
        scanTrashbin();
    }

    // Change status of the trash bin
    private void scanTrashbin() {
        if (this.fullness >= this.height / 100 * 80) {
            this.status = "Full";
            printTrashbin();
        } else if (this.fullness <= this.height / 100 * 20) {
            this.status = "Empty";
            printTrashbin();
        } else {
            this.status = "Half Empty";
            printTrashbin();
        }
    }

    // Method to print all the attributes
    private void printTrashbin() {
        System.out.println("Status: " + this.status + " | Location: " + this.location + " | Cleaned: " + this.clean + " | Fullness: " + this.fullness + "%");
    }

}
