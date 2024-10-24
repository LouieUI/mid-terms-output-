import java.util.Scanner;


class BloodData {
    static String bloodType;
    static String rhFactor;

    
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

   
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

   
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}


public class RunBloodData {
    public static void main(String[] args) {
        Scanner lj = new Scanner(System.in);
        
       
        System.out.print("Enter blood type of patient: ");
        String inputBloodType = lj.nextLine();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String inputRhFactor = lj.nextLine();
        
        BloodData bd;
        
     
        if (inputBloodType.isEmpty() || inputRhFactor.isEmpty()) {
            bd = new BloodData();
        } else {
            bd = new BloodData(inputBloodType, inputRhFactor);
        }
        
        
        bd.display();
        
        lj.close();
    }
}
