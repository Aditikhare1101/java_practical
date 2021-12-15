import java.io.*;
public class Practical_19 {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Swarangi Tathe";
        e.address = "Rajapeth, Nagpur";
        e.SSN = 11122333;
        e.number = 1907048;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved Successfully!XD");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}