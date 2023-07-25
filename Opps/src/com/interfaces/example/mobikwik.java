package com.interfaces.example;
public interface mobikwik {
	void pay();
}
class cashOn implements mobikwik {
	@Override
	public void pay() {
		System.out.println("pay your ammount in cash");
	}
	void totalPay() {
		System.out.println("100");
	}
	
}
class netBanking implements mobikwik {
	@Override
	public void pay() {
		System.out.println("pay your ammount through netBanking");
	}
}
class creditCard implements mobikwik {
	@Override
	public void pay() {
		System.out.println("pay your ammount in creditCard");
	}
}
class debitCard implements mobikwik {

	@Override
	public void pay() {
		System.out.println("pay your ammount in debitCard");
	}
}