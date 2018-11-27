package ru.itpark.domain;

public class House {
    private int id;
    private String district;
    private int rooms;
    private int area;
    private int price;
    private boolean newBuilding;

    public House(int id, String district, int rooms, int area, int price, boolean newBuilding) {
        this.id = id;
        this.district = district;
        this.rooms = rooms;
        this.area = area;
        this.price = price;
        this.newBuilding = newBuilding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNewBuilding() {
        return newBuilding;
    }

    public void setNewBuilding(boolean newBuilding) {
        this.newBuilding = newBuilding;
    }

    @Override
    public String toString() {
        return "\nHouse{" +
                "id=" + id +
                ", district='" + district + '\'' +
                ", rooms=" + rooms +
                ", area=" + area +
                ", price=" + price +
                ", newBuilding=" + newBuilding +
                '}';
    }
}
