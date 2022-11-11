package HM9;

public class Gpu {
    private String brand;
    private int memorySize;

    public Gpu(String brand, int memorySize) {
        this.brand = brand;
        this.memorySize = memorySize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "производитель = '" + brand + '\'' +
                ", видеопамять = " + memorySize +
                '}';
    }
}
