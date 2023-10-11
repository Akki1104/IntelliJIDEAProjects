package Practicals;

// Java program to demonstrate user defined exception
// This program throws an exception whenever balance
// amount is below Rs 1000
class User_Defined_Exception extends Exception {
    //store account information
    private final static int[] accno = {1001, 1002, 1003, 1004, 1005};
    private final static String[] name = {"Nishant", "Shubha", "Sushma", "Anant", "Akash"};
    private final static double[] bal = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    // default constructor
    User_Defined_Exception() {
    }

    // parameterized constructor
    User_Defined_Exception(String str) {
        super(str);
    }

    // write main()
    public static void main(String[] args) {
        try {
            // display the heading for the table
            System.out.println("ACCOUNT NUMBER" + "\t" + "CUSTOMER NAME" + "\t" + "BALANCE");
            // display the actual account information
            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t\t\t" + name[i] + "\t\t\t" + bal[i]);
                // display own exception if balance < 1000
                if (bal[i] < 1000) {
                    throw new User_Defined_Exception("Balance is less than 1000");
                }
            }
        } //end of try
        catch (User_Defined_Exception e) {
            e.printStackTrace();
        }
    }
}