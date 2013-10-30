package es.daedalus.textalytics.sma.domain;

import java.util.List;

public class Entity {

	public enum EntityType {
		PERSON, LOCATION, ORGANIZATION, FACILITY, PRODUCT, EVENT, NATURAL_OBJECT, OTHER_ENTITY
	}
	
	private String form;
	private EntityType type;
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
	public EntityType getType() {
		return type;
	}
	public void setType(EntityType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "\nEntity [form=" + form + ", type=" + type + ", variants="
				+ variants + ", relevance=" + relevance + "]";
	}

}
