package bureauErgonomiqueBis;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		BureauElectrique bureau1 = new BureauElectrique();
		BureauElectrique bureauWafae = new BureauElectrique(BigDecimal(80), BigDecimal(100), BigDecimal(100), BigDecimal(100),
				BigDecimal(64), true, BigDecimal(75), BigDecimal(75), BigDecimal(100));
		BureauElectrique bureauJP = new BureauElectrique(BigDecimal(80), BigDecimal(100), BigDecimal(100), BigDecimal(120),
				BigDecimal(70), true, BigDecimal(70), BigDecimal(73), BigDecimal(110));
		
		
		
		boolean bureauMonte = bureauWafae.monterLeBureau(BigDecimal(10));


	}



}
