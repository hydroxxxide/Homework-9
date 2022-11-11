package HM9;

public class Main {
    public static void main(String[] args) {
        Display pcDisplay = new Display(15.5, "LG", "Amoled");
        Brand pcBrand = new Brand("HYPER X");
        Color pcColor = new Color("Black");
        Ssd pcSsd = new Ssd(512, 2);
        Ram pcRam = new Ram(16, "Samsung");
        Gpu pcGpu = new Gpu("Nvidia", 16);
        Usb pcUsb = new Usb(3.0, 123);
        Keyboard pcKeyboard = new Keyboard(new String[] {"eng","rus","kg"}, true, true );

        Pc myPc = new Pc(pcDisplay,pcBrand,pcColor,pcSsd,pcRam,pcGpu,pcUsb, pcKeyboard);

        System.out.println(myPc);

    }
}
