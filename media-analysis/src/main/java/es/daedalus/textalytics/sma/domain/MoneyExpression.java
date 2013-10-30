package es.daedalus.textalytics.sma.domain;

public class MoneyExpression {

	private String form;
	private long amount;
	private String currency;
	

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "\nMoneyExpression [form=" + form + ", amount=" + amount
				+ ", currency=" + currency + "]";
	}
	
	

	
}
