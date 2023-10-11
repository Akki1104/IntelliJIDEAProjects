package Practicals;
public class MyException extends Exception {
    static int[] accNo={1001,1002,1003,1004,1005};
    static String[] name={"Rohit","Vivek","Vishnu","Sunil","Akash"};
    static double[] bal={10000,2000,5332,999,1100.55};
    MyException(){
    }
    MyException(String str){
        super(str);
    }
    public static void main(String[] args) {
        try{
            System.out.println("Account Number \tCustomer \tBalance");
            for(int i=0; i < 5; i++){
                System.out.println(accNo[i]+"\t\t\t"+name[i]+"\t\t"+bal[i]);
                if(bal[i] < 1000){
                    MyException me = new MyException("The Balance is less than 1000.");
                    throw me;
                }
            }
        }
        catch(MyException e){
            e.printStackTrace();
        }
    }
}
