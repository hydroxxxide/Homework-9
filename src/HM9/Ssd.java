package HM9;

public class Ssd {
    private int memorySize;
    private int howManyDisks;

    public Ssd(int memorySize, int howManyDisks) {
        this.memorySize = memorySize;
        this.howManyDisks = howManyDisks;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getHowManyDisks() {
        return howManyDisks;
    }

    public void setHowManyDisks(int howManyDisks) {
        this.howManyDisks = howManyDisks;
    }

    @Override
    public String toString() {
        return "объем памяти = " + memorySize +
                ", диск разделен на = " + howManyDisks +
                '}';
    }
}
