package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {

        // Turning On Coffee Machine
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        // coffee Machine balance 
        int coffee_balance;
        int water_balance;
        int milk_balance;

        // take User inputs to prapare a coffee;
        Scanner scan = new Scanner(System.in);
        
        //Asking the user: How many ml of water in the coffe_machine?
        System.out.println("Write how many ml of water the coffee machine has:");
        water_balance = scan.nextInt();
        
        //Asking the user: How many ml of milk in the coffe_machine?
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk_balance = scan.nextInt();                   

        //Asking the user: How many gram of coffee in the coffe_machine?
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffee_balance = scan.nextInt(); 

        //Asking the user: for the numper of cups?
        System.out.println("Write how many cups of coffee you will need: ");
        int cups_numper = scan.nextInt();

        // check if the amount of ingredients is  enough;
        calcCoffeeIngredients(cups_numper, water_balance, milk_balance, coffee_balance);

    }


    public  static void calcCoffeeIngredients(int cupNum, int water_amount, int milk_amount, int coffee_amount){

        int water_possible = water_amount / 200;
        int milk_possible = milk_amount /  50;
        int coffee_possible = coffee_amount /15;

        int cup_possible = water_possible;
        
        if(milk_possible < water_possible){
            cup_possible = milk_possible;
        }
        if(coffee_possible < milk_possible){
            cup_possible = coffee_possible;
        }
        
        int more_cup_possible = cup_possible - cupNum;
        if(more_cup_possible < 0){
            System.out.println("No, I can make only " +  cup_possible + " cup(s) of coffee");
        }else if(more_cup_possible > 0 ){

            System.out.println("Yes, I can make that amount of coffee (and even " + more_cup_possible +" more than that)");
        }else{
            System.out.println("Yes, I can make that amount of coffee");
        }   
    }

}
