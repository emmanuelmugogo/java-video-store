import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title, String priceCode) {
		super(title, priceCode);
	}

	@Override
	public String getPriceCode() {
		return "childrens";
	}

	@Override
	public BigDecimal calculateFees(int days) {
		
		BigDecimal fees = new BigDecimal("1.50");
		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			BigDecimal extaFees = new BigDecimal("1.50");
			fees = fees.add((extaFees).multiply(extraDays));
		}
		return fees;
	}

}
