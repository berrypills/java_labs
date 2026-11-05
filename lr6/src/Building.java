public class Building {
    private String address;
    private int floors;
    private double totalArea;
    private int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public Building(String address, int floors, double totalArea, int count){
        this(address, floors, totalArea);
        this.count=count;
    }

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double averageAreaPerFloor() {
        return totalArea / floors;
    }
}