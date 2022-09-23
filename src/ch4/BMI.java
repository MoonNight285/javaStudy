package ch4;

public class BMI {
    public String name;
    public double height;
    public int weight;
    private double bmi;

    public double getBmi() {
        return bmi;
    }

    public void setMyInfo(double height, int weight) {
        this.height = height / 100;
        this.weight = weight;
        calcBmi(this.height, this.weight);
    }

    private void calcBmi(double height, int weight) {
        this.bmi = (double) weight / ((height * height));
    }
}
