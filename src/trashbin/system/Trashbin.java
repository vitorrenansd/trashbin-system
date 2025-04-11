package trashbin.system;

public class Trashbin {
    private int height; // Height of the trashbin
    private int fullness = 0; // % of fullness
    private int cleaned = 0; // How many times was clean
    private String status = "Empty"; // Updated status
    private String location; // Identification


    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height can't be 0 or less");
        }
        this.height = height;
    }
    private int getHeight() {
        return this.height;
    }

    private void setFullness(int fullness) {
        this.fullness = fullness;
    }
    private int getFullness() {
        return this.fullness;
    }

    private void setCleaned(int cleaned) {
        this.cleaned = cleaned;
    }
    private int getCleaned() {
        return this.cleaned;
    }

    private void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }


    public void cleanTrashbin() {
        setFullness(0);
        setCleaned(getCleaned() + 1);

        updateStatus();
    }

    public void updateFullness(int soundReturn) {
        // var soundReturn is the distance value returned by the ultrasonic sensor
        if (soundReturn >= getHeight() || soundReturn < 0) {
            throw new SensorException("Ultrasonic sensor failure: value out of expected range"); 
        }

        int percent = (getHeight() - soundReturn) * 100 / getHeight();
        
        setFullness(percent);
        updateStatus();
    }

    // Change status of the trash bin
    private void updateStatus() {
        if (getFullness() >= (getHeight()  * 0.80)) {
            setStatus("Full");
        } else if (getFullness() <= (getHeight() * 0.20)) {
            setStatus("Empty");
        } else {
            setStatus("Half Empty");
        }
    }

    public void showInformation() {
        System.out.printf("LOCATION: %s | CLEANED: %dx | FULLNESS: %d%% | STATUS: %s \n", getLocation(), getCleaned(), getFullness(), getStatus());
    }
}