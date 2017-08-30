package wrong;

public class Main {

	public static void main(String[] args) {
		ACustomer premiumCustomer = new PremiumCustomer();
		ACustomer standartCustomer = new StandartCustomer();
		premiumCustomer.bonusPayment();
		//hata verecektir cunku boyle bir foksiyona destek veremektedir.
		standartCustomer.bonusPayment();
	}
}
