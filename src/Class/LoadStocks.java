package Class;

import java.io.IOException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class LoadStocks {

	public static void main(String[] args) throws IOException {
		//YahooFinance.

		Stock aapl = YahooFinance.get("AAPL");
		Stock msft = YahooFinance.get("MSFT");
		Stock goog = YahooFinance.get("GOOG");
		System.out.println(aapl.getName());
		System.out.println(msft.getName());
		System.out.println(goog.getName());
		System.out.println(aapl.getQuote().getPrice());
		System.out.println(msft.getQuote().getPrice());
		System.out.println(goog.getQuote().getPrice());
	}

}
