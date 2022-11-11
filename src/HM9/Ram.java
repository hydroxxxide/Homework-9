package HM9;

public class Ram {
    private int memorySize;
    private String brand;

    public Ram(int memorySize, String brand) {
        this.memorySize = memorySize;
        this.brand = brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "объем памяти = " + memorySize +
                ", производитель = '" + brand + '\'' +
                '}';
    }
}
