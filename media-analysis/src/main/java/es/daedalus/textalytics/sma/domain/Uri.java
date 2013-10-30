package es.daedalus.textalytics.sma.domain;

public class Uri {

	public enum UriType {
		URL,EMAIL
	}
	
	private String form;
	private UriType type;

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public UriType getType() {
		return type;
	}

	public void setType(UriType type) {
		this.type = type;
	}
	
	
}
