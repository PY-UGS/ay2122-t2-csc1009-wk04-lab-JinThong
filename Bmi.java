import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter weight in pounds: ");
            Double weight = scanner.nextDouble();
            System.out.print("Enter height in inches: ");
            Double height = scanner.nextDouble();
            Bmi bmi = new Bmi(height,weight);
            System.out.println("BMI is "+ String.format("%.2f", bmi.getBmi()));
            System.out.println(bmi.getInterpretation());
        }
    }
    private double height;
    private double weight;

    public Bmi(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height*0.0254;
    }

    public void setHeight(double height) {
        this.height = height*0.0254;
    }

    public double getWeight() {
        return weight*0.45359237;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi(){
        return (this.weight/this.height);
    }

    


    public String getInterpretation(){
        double a = this.getBmi();
        if(18.5>a) {
            return "UnderWeight";
        }else if(25.0>a){
            return "Normal";
        }else if(30>a){
            return "Overweight";
        }else{
            return "Obese";
        }
    }
    
}
