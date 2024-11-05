public class Trashbin {
    private int height;
    private String location;
    private int clean;
    private String status;
    private int fullness;


    // Constructor
    public void Trashbin(int height, String location) {
        this.height = height;
        this.location = location;
        this.clean = 0;
        this.status = "empty";
    }

    // Get the % of fullness
    public void getPercentage(int soundReturn) {
        this.fullness = this.height - soundReturn;
    }

    // Cleans the trashbin
    public void cleanTrashbin() {
        this.status = "Empty";
        this.fullness = 0;
        this.clean += 1;
    }

    // Change status of the trash bin
    public void scanTrashbin(int trash) {
        if (this.fullness >= this.height / 100 * 80) {
            this.status = "Full";
        }
        if (this.fullness <= this.height / 100 * 20) {
            this.status = "Empty";
        } else {
            this.status = "Half Empty";
        }
    }

    public void printTrashbin() {
        System.out.println(this.status + " | " + this.location + " | " + this.clean + " | " + this.fullness + "%");
    }
}
