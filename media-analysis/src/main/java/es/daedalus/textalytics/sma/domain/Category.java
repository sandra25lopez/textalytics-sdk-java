package es.daedalus.textalytics.sma.domain;

import java.util.List;

public class Category {
	
	private String code;
	private List<String> labels;
	private int relevance;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getLabels() {
		return labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public int getRelevance() {
		return relevance;
	}
	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	@Override
	public String toString() {
		return "\nCategory [code=" + code + ", labels=" + labels + ", relevance="
				+ relevance + "]";
	}

}
