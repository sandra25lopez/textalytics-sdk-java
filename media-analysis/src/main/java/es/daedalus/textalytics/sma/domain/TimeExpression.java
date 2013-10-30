package es.daedalus.textalytics.sma.domain;

public class TimeExpression {

	private String form;
	private String date;
	private String time;
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "\nTimeExpression [form=" + form + ", date=" + date + ", time="
				+ time + "]";
	}
	
	
	
}
