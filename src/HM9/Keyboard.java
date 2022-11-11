package HM9;

import java.util.Arrays;

public class Keyboard {
    private String[] layout;
    private boolean checkBacklight;
    private boolean checkNumbers;

    public Keyboard(String[] layout, boolean checkBacklight, boolean checkNumbers) {
        this.layout = layout;
        this.checkBacklight = checkBacklight;
        this.checkNumbers = checkNumbers;
    }

    public String[] getLayout() {
        return layout;
    }

    public void setLayout(String[] layout) {
        this.layout = layout;
    }

    public boolean isCheckBacklight() {
        return checkBacklight;
    }

    public void setCheckBacklight(boolean checkBacklight) {
        this.checkBacklight = checkBacklight;
    }

    public boolean isCheckNumbers() {
        return checkNumbers;
    }

    public void setCheckNumbers(boolean checkNumbers) {
        this.checkNumbers = checkNumbers;
    }

    @Override
    public String toString() {
        return "раскладка = " + Arrays.toString(layout) +
                ", наличие подсветки = " + checkBacklight +
                ", наличие дополнительных цифр = " + checkNumbers +
                '}';
    }
}
