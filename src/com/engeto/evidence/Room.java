package com.engeto.evidence;

public class Room {
    private final int roomNumber;
    private final int numberOfBeds;
    private final boolean hasBalcony;
    private final boolean hasSeaView;
    private final double pricePerNight;

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

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
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
