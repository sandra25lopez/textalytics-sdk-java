package es.daedalus.textalytics.sma.domain;

import java.util.List;

public class Concept {

	private String form;
	private List<String> variants;
	private int relevance;
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public List<String> getVariants() {
		return variants;
	}
	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	public int getRelevance() {
		return relevance;
	}
	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	@Override
	public String toString() {
		return "\nConcept [form=" + form + ", variants=" + variants
				+ ", relevance=" + relevance + "]";
	}
	
	
	
}
