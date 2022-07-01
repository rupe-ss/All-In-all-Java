package learning.java.opps.interfacePractice;

/*Create an interface  'Bank' with an abstract method 'getMiniStatement' returning array of int so that i can view salary of every month of the employee. Create BankA class implementing the Bank interface and set value of every month i.e. 12 month. Now create a main method and print value of 13th month.*/

interface Bank{
    int[] getMiniStatement();
}

class BankA implements Bank{
    @Override
    public int[] getMiniStatement() {
        int salary = 40000;
        int[] salaryArray = new int[12];
        for (int i = 0; i < salaryArray.length; i++){
            salaryArray[i] = salary;
        }
        return salaryArray;
    }
}
public class BankingMiniStatement {
    public static void main(String[] args) {
        Bank bank = new BankA();
        try{
            int[] everyMonthSalary = bank.getMiniStatement();
            System.out.println(everyMonthSalary[12]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured " + e.getMessage()+ e.getStackTrace());
        }
    }
}
