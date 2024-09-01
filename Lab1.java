import java.util.Scanner; //Import Scanner for User Input

class hotdogs {
    public static void main(String[] args) {
        
        

        //State item prices//

        double hotdog = 1.50;
        double chips = 2.00;
        double soda = 1.00;
    
        //HotDog //
        System.out.println("Welcome to Reeva's Hot Dog Stand!"); //Printing Welcome
        System.out.println("How many hot dogs would you like to buy?  ($1.50 each)"); //Hotdog prompt & price
        /// Get User Input Hotdog///
        Scanner prompt = new Scanner(System.in);
        int hotAmt = prompt.nextInt(); /// get input as int  

        System.out.println("How many bags of chips would you like to buy?  ($2.00 each)"); //Chips prompt & price
        /// chips///
        Scanner promptTwo = new Scanner(System.in);
        int chipAmt = promptTwo.nextInt(); /// get input as int

        System.out.println("How many sodas would you like to buy?  ($1.00 each)"); //Sodas prompt & price
        ///  Sodas///
        Scanner promptThree = new Scanner(System.in);
        int sodAmt = promptThree.nextInt(); /// get input as int


        /// CALCULATIONS ///
        double result=(hotdog*hotAmt)+(chips*chipAmt)+(soda*sodAmt);///Before Tax Calculation
        double afterTax = (result*0.065)+result;///After Tax Calculation

        System.out.printf("Your Total Before tax is: $%.2f ", result);///Print Before Tax
      
        System.out.printf("Your Total After Tax is: $%.2f ", afterTax);///Print After Tax


    }   
    
}
