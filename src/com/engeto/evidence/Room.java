package com.engeto.evidence;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private double pricePerNight;

    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, boolean hasSeaView, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isHasSeaView() {
        if(this.hasSeaView){
            return true;
        }
        else return false;
    }
    public String hasView(){
        if(!isHasSeaView()){
            return "ne";
        }else return "ano";
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return "number"+roomNumber +
                ", numberOfBeds: " + numberOfBeds +
                ", hasBalcony: " + hasBalcony +
                ", hasSeaView: " + hasSeaView +
                ", pricePerNight: " + pricePerNight;
    }
}
