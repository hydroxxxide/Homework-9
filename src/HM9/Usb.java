package HM9;

public class Usb {
    private double typeOfPorts;
    private int idOfPort;

    public Usb(double typeOfPorts, int idOfPort) {
        this.typeOfPorts = typeOfPorts;
        this.idOfPort = idOfPort;
    }

    public double getTypeOfPorts() {
        return typeOfPorts;
    }

    public void setTypeOfPorts(double typeOfPorts) {
        this.typeOfPorts = typeOfPorts;
    }

    public int getIdOfPort() {
        return idOfPort;
    }

    public void setIdOfPort(int idOfPort) {
        this.idOfPort = idOfPort;
    }

    @Override
    public String toString() {
        return "тип портов = " + typeOfPorts +
                ", id портов = " + idOfPort +
                '}';
    }
}
