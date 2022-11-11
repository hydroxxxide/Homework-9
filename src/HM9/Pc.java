package HM9;

public class Pc {

    private Display display;
    private Brand brand;
    private Color color;
    private Ssd ssd;
    private Ram ram;
    private Gpu gpu;
    private Usb usb;
    private Keyboard keyboard;

    public Pc(Display display, Brand brand, Color color, Ssd ssd, Ram ram, Gpu gpu, Usb usb, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.gpu = gpu;
        this.usb = usb;
        this.keyboard = keyboard;
    }


    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Usb getUsb() {
        return usb;
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "Дисплей - " + display +
                ", Производитель - " + brand +
                ", Цвет - " + color +
                ", Жесткий диск - " + ssd +
                ", ОЗУ - " + ram +
                ", Видеокарта - " + gpu +
                ", USB - " + usb +
                ", Клавиатура - " + keyboard +
                '}';
    }
}
