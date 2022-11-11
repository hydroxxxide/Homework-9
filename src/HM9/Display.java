package HM9;

public class Display {
    private double diagonal;
    private String brand;
    private String typeOfMatrix;

    public Display(double diagonal, String brand, String typeOfMatrix) {
        this.diagonal = diagonal;
        this.brand = brand;
        this.typeOfMatrix = typeOfMatrix;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }

    @Override
    public String toString() {
        return  "диагональ = " + diagonal +
                ", марка = '" + brand + '\'' +
                ", тип матрицы = '" + typeOfMatrix + '\'' +
                '}';
    }
}
