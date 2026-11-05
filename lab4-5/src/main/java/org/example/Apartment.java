package org.example;

class Apartment {
    private String address;
    private int rooms;
    private double area;

    public Apartment(String address, int rooms, double area) {
        this.address = address;
        this.rooms = rooms;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public int getRooms() {
        return rooms;
    }

    public double getArea() {
        return area;
    }

    public double pricePerSquareMeter(double totalPrice) {
        return totalPrice / area;
    }
    @Override
    public String toString(){
        return "Квартира"+address+"комнат"+rooms+"площадь"+area+"кв.м";
    }
}
