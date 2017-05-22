public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
    // your code
    int priceNew = startPriceNew;
    int priceOld = startPriceOld;
    int savingsTotal = 0;
    // monthsToSaveEnough = (priceNew - priceOld) / savingperMonth
    // priceNew = startPriceNew - depreciation
    double depreciationPercent = 1.5;      
    for(int month = 0; month < 1000; month++){
      // Depreciation amount changes every 2 months
      if((month % 2 == 0) && (month > 0)) {
      depreciationPercent += 0.5;
      }
      // Decrease the price of the cars 
      if (month > 0) {
      priceNew -= ((depreciationPercent / 100) * priceNew);
      priceOld -= ((depreciationPercent / 100) * priceOld);
      }
      // Increase the amount in savings
      if (month > 0) {
      savingsTotal += savingperMonth;
      }
      // Check to see if there is enough money to buy the new car
      if(priceNew - priceOld - savingsTotal <= 0) {
        int leftover = savingsTotal + priceOld - priceNew;
        int[] answerArray = {month, leftover};
        // return the number of months it took to buy the new car and the amount of money leftover
        return answerArray;
      }
    }
		return null;
	}
}