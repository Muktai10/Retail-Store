package retail_Store1;

public class mainclasss {

	public static void main (String[] args) {
		
		SalesAnalzer s=new SalesAnalzer();
		
		s.Addamount();
//	    s.AddDay();
//	    s.printDaysAndAmounts();
		s.CalculateTotalSales();
		s.DisplaySalesReport();
		
        

	}
}
