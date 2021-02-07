import java.io.*;

public class ComSciRecord {

    private int top = 0;
    private static final int MAXRecords = 100;
    private StudentRecord[] list;

    public static void main(String[] args) {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ComSciRecord get = new ComSciRecord();
        String act = "";
        while (true) {
//displays menu
            System.out.println("\n[1] Add Record");
            System.out.println("[2] Delete Record");
            System.out.println("[3] View all Records");
            System.out.println("[4] Update Record");
            System.out.println("[X] Close");
            System.out.print("Enter desired action: ");
            try{
//input the choice
                
            act = R.readLine();
            } catch (Exception e) {
                System.out.println("Error");
            }
            switch (act) {
                case "1":
                    get.addRecord();
                    break;
                case "2":
                    get.delRecord();
                    break;
                case "3":
                    get.viewRecords();
                    break;
                case "4":
                    get.updateRecord();
                    break;
                case "X":
                case "x":
                    System.exit(0);
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }

    public ComSciRecord() {
        list = new StudentRecord[MAXRecords];
    }


    public void addRecord() {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        String address = "";
        int age = 0;
        double mathGrade = 0;
        double englishGrade = 0;
        double scienceGrade = 0;
    
        if (top == MAXRecords) {
            System.out.println("Address Book is full");
            return;
        }

        try {
            System.out.print("Name: ");
            name = R.readLine();
            System.out.print("Address: ");
            address = R.readLine();
            System.out.print("Age: ");
            age = Integer.parseInt(R.readLine());
            System.out.print("Math Grade: ");
            mathGrade = Double.parseDouble(R.readLine());
            System.out.print("English Grade: ");
            englishGrade = Double.parseDouble(R.readLine());
            System.out.print("Science Grade: ");
            scienceGrade = Double.parseDouble(R.readLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        StudentRecord record = new StudentRecord(name, address, age, mathGrade, englishGrade, scienceGrade);
        list[top] = record;
        top++;
    }

    public void delRecord() {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;

        if (top == 0) {
            System.out.println("Student Record Empty");
            return;
        }
//asks for the Student number which is to be deleted
        try {
//shows the current records
            viewRecords();
            System.out.print("\nEnter Student Number: ");
            index = Integer.parseInt(R.readLine()) - 1;
        } catch (Exception e) {
        }

        if (index < 0 || index >= top) {
            System.out.println("Index Out Of Bounds");
            return;
        } else {
            for (int i = index; i < top; i++) {
                list[i] = list[i + 1];
            }
            list[top] = null;
            top--;
        }
    }

    public void viewRecords() {
        for (int index = 0; index < top; index++) {
            System.out.println((index + 1) + " Name:"
                    + list[index].getName());
            System.out.println("Address:"
                    + list[index].getAddress());
            System.out.println("Age:"
                    + list[index].getAge());
            System.out.println("Math Grade:"
                    + list[index].getMathGrade());
            System.out.println("English Grade:"
                    + list[index].getEnglishGrade());
            System.out.println("Science Grade:"
                    + list[index].getScienceGrade());
            System.out.println("Average:"
                    + list[index].getAverage());
        }
    }

 
    public void updateRecord() {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        String address = "";
        int age = 0;
        int index = 0;
        double mathGrade = 0;
        double englishGrade = 0;
        double scienceGrade = 0;
        
//asks for the Records data
        try {
            System.out.print("Student Number: ");
            index = Integer.parseInt(R.readLine()) - 1;
            if (index < 0 || index >= top) {
                System.out.println("Index Out Of Bounds");
                return;
            }
            System.out.print("Name: ");
            name = R.readLine();
            System.out.print("Address: ");
            address = R.readLine();
            System.out.print("Age: ");
            age = Integer.parseInt(R.readLine());
            System.out.print("Math Grade: ");
            mathGrade = Double.parseDouble(R.readLine());
            System.out.print("English Grade: ");
            englishGrade = Double.parseDouble(R.readLine());
            System.out.print("Science Grade: ");
            scienceGrade = Double.parseDouble(R.readLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
//updates the Record
        StudentRecord record = new StudentRecord(name, address, age, mathGrade, englishGrade, scienceGrade);
        list[index] = record;
    }
}