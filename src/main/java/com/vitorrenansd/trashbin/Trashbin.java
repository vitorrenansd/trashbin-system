package com.vitorrenansd.trashbin;

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
    public void setLocation(String location) {
        this.location = location;
    }

    public void setFullness(int soundReturn) {
        // var soundReturn is the distance value returned by the ultrasonic sensor
        this.fullness = (this.height - soundReturn) * 100 / this.height;
        updateStatus();
    }

    public void cleanTrashbin() {
        this.fullness = 0;
        this.cleaned += 1;
        System.out.println("Cleaning " + this.location + " trash bin...");
        updateStatus();
    }

    // Change status of the trash bin
    private void updateStatus() {
        if (this.fullness >= this.height / 100 * 80) {
            this.status = "Full";
        } else if (this.fullness <= this.height / 100 * 20) {
            this.status = "Empty";
        } else {
            this.status = "Half Empty";
        }
    }
}