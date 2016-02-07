// Lindsay Alvarez
// Hw02
//02/09/16
//Computing the cost of items bought at a grocery store
// setting up Arithmetic class

public class Arithmetic {
    public static void main(String [ ] args) {
        // Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants 
        double pantsPrice = 34.98;
        //Number of sweatshirts 
        int numShirts = 2;
        // Cost per shirt
        double shirtPrice = 24.99;
        //Number of belts
        int numBelts = 1;
        //cost per box of envelopes 
        double beltCost = 33.99;
        
        // the tax rate
        double paSalesTax = 0.06;
        
        //Total cost of pants 
        double totalCostOfPants;
        totalCostOfPants= (numPants*pantsPrice); // Gives total cost of pants 
        //Total cost of sweatshirts
        double TotalCostOfSweatshirts;
       TotalCostOfSweatshirts= (numShirts * shirtPrice);    // Gives total cost of sweatshirts
        //Total cost of belts
        double TotalCostOfBelts;
        TotalCostOfBelts= (numBelts*beltCost);
        // Sales tax charged on buying all of each kind of item
        double TaxOnPants= (numPants*pantsPrice)*paSalesTax; // Sales tax on buying all of the pants
        double TaxOnShirts=(numShirts*shirtPrice)*paSalesTax; // Sales tax on buying all of the sweatshirts
        double TaxOnBelts= (numBelts*beltCost)*paSalesTax; // Sales tax on buying all of the belts
        // Total cost of purchases before tax
        double TotalCostOfPurchasesBeforeTax= totalCostOfPants+TotalCostOfSweatshirts+TotalCostOfBelts; // Total Cost of purchases not including sales tax
        //Total Sales Tax
        double TotalSalesTax= (TaxOnPants+TaxOnShirts+TaxOnBelts); // Total amount of sales tax in transaction
        // Total amount paid for entire transaction including sales tax
        double TotalTransactionCost= TotalCostOfPurchasesBeforeTax+TotalSalesTax;
        // Print out the output data
        
        System.out.println(TotalCostOfBelts + "Total Cost of Belts");
        System.out.println(TotalCostOfSweatshirts + "Total Cost of Sweatshirts");
        System.out.println(totalCostOfPants + "Total Cost of Pants");
        System.out.println(TaxOnBelts + "Tax On Belts");
        System.out.println(TaxOnShirts + "Tax on Shirts");
        System.out.println(TaxOnPants + "Tax on Pants");
        System.out.println(TotalCostOfPurchasesBeforeTax + " Total Cost of Purchase Before Tax");
        System.out.println(TotalSalesTax + "Total Sales Tax");
        System.out.println(TotalTransactionCost + "Total Transaction Cost");
        
    } // end of main method

} // end of class 