public class Trashbin {
    private int height;
    private String location;
    private int clean;
    private String status;

    // Constructor
    public void Trashbin(int height, String location) {
        this.height = height;
        this.location = location;
        this.clean = 0;
        this.status = "empty";
    }

    // Get the % of fullness
    public int getPercentage(int soundReturn) {
        return (this.height - soundReturn);
    }

    // Return the status of the trash bin with %
    public void scanTrashbin(int trash) {
        if (getPercentage(trash) >= this.height - (this.height / 100 * 90)) {

        }
    }


}
