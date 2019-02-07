import java.util.Random;

public class Week2ArrayChallenge {
    //prices
    static double burritoPrice = 3.00;
    static double ricePrice = .50;
    static double meatPrice = .50;
    static double beansPrice = .50;
    static double salsaPrice = .50;
    static double veggiePrice = .50;
    static double cheesePrice = .50;
    static double guacPrice = .50;
    static double quesoPrice = .50;
    static double creamPrice = .50;


    public static void rice(){
        //array for rice types
        String[] rice = new String[3];
        rice[0] = "White Rice";
        rice[1] = "Brown Rice";
        rice[2] = "No Rice";
        //generate random rice selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(rice.length);
        String riceChoice = rice[randomIndex];
        //print result of random rice selection
        System.out.println(riceChoice);
        //set price if no selection
        if(riceChoice == "No Rice"){
            ricePrice = 0;
        }
    }

    public static void meat(){
        //array for meat types
        String[] meat = new String[5];
        meat[0] = "Chicken";
        meat[1] = "Carnitas";
        meat[2] = "Chorizo";
        meat[3] = "Sofritas";
        meat[4] = "Veggies";
        //generate random meat selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(meat.length);
        String meatChoice = meat[randomIndex];
        //print result of random meat selection
        System.out.println(meatChoice);
    }

    public static void beans(){
        //array for bean types
        String[] beans = new String[3];
        beans[0] = "Pinto Beans";
        beans[1] = "Black Beans";
        beans[2] = "No Beans";
        //generate random bean selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(beans.length);
        String beanChoice = beans[randomIndex];
        //print result of random bean selection
        System.out.println(beanChoice);
        //set price if no selection
        if(beanChoice == "No Beans"){
            beansPrice = 0;
        }
    }

    public static void salsa(){
        //array for salsa types
        String[] salsa = new String[5];
        salsa[0] = "Mild Salsa";
        salsa[1] = "Medium Salsa";
        salsa[2] = "Hot Salsa";
        salsa[3] = "No Salsa";
        salsa[4] = "All Salsas";
        //generate random salsa selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(salsa.length);
        String salsaChoice = salsa[randomIndex];
        //print random salsa selection
        System.out.println(salsaChoice);
        //set price if no selection or all selection
        if(salsaChoice == "No Salsas"){
            salsaPrice = 0;
        } else if (salsaChoice == "All Salsas")
            salsaPrice = 2.00;
    }

     public static void veggies(){
        //array for veggie types
        String[] veggies = new String[4];
        veggies[0] = "Lettuce";
        veggies[1] = "Fajita Veggies";
        veggies[2] = "No Veggies";
        veggies[3] = "All Veggies";
        //generate random veggie selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(veggies.length);
        String veggieChoice = veggies[randomIndex];
        //print random array selection
         System.out.println(veggieChoice);
         //set price if no selection or all selection
         if(veggieChoice == "No Veggies"){
             veggiePrice = 0;
         } else if (veggieChoice == "All Salsas"){
             veggiePrice = 2.00;}
     }
    public static void cheese(){
        //array for cheese types
        String[] cheese = new String[2];
        cheese[0] = "Cheese";
        cheese[1] = "No Cheese";
        //generate random cheese selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(cheese.length);
        String cheeseChoice = cheese[randomIndex];
        //print random selection
        System.out.println(cheeseChoice);
        //set price if no selection
        if(cheeseChoice == "No Cheese"){
            cheesePrice = 0;
        }
    }

    public static void guac(){
        //array for guac types
        String[] guac = new String[2];
        guac[0] = "Guac";
        guac[1] = "No Guac";
        //generate random guac selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(guac.length);
        String guacChoice = guac[randomIndex];
        //print random selection
        System.out.println(guacChoice);
        //set price if no selection
        if(guacChoice == "No Guac"){
            guacPrice = 0;
        }
    }

    public static void queso(){
        //array for queso types
        String[] queso = new String[2];
        queso[0] = "Queso";
        queso[1] = "No Queso";
        //generate random queso selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(queso.length);
        String quesoChoice = queso[randomIndex];
        //print random selection
        System.out.println(quesoChoice);
        //set price if no selection
        if(quesoChoice == "No Queso"){
            quesoPrice = 0;
        }
    }

    public static void cream(){
        //array for sour cream
        String[] cream = new String[2];
        cream[0] = "Sour Cream";
        cream[1] = "No Sour Cream";
        //generate random cheese selection
        Random generator = new Random();
        int randomIndex = generator.nextInt(cream.length);
        String creamChoice = cream[randomIndex];
        //print random selection
        System.out.println(creamChoice);
        //set price if no selection
        if(creamChoice == "No Sour Cream"){
           creamPrice = 0;
        }
    }

//burrito making machine
    public static void burritoMachine(){
        //set starting price
         double totalPrice = 0;
         //set loop count to 0
         int i = 0;
         //set burrito count to 0
         int j = 0;
         //while loop is less than 25 count burritos. Then call method for each ingredient. Add price of selected
        //ingredients. Then print out total and start loop over.
         while(i < 25){
             j++;
             System.out.println("               ");
             System.out.println("BURRITO " + j + ": \n");
             rice();
             meat();
             beans();
             salsa();
             veggies();
             cheese();
             guac();
             totalPrice = (
                     burritoPrice + ricePrice + meatPrice + beansPrice + salsaPrice +
                     veggiePrice + cheesePrice + guacPrice + quesoPrice + creamPrice);
             System.out.println("TOTAL PRICE: " + "$" + totalPrice + "0");
             System.out.println("_______________");
             i++;
         }
    }

    public static void main(String[] args){
        //start burritoMachine method.
        burritoMachine();
    }
}
