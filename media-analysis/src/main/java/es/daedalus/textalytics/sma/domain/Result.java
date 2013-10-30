package es.daedalus.textalytics.sma.domain;

import java.util.List;

public class Result {

	private Sentiment sentiment;
	private List<Category> categorization;
	private List<Entity> entities;
	private List<Concept> concepts;
	private List<TimeExpression> timeExpressions;
	private List<MoneyExpression> moneyExpressions;
	private List<Uri> uris;
	private List<PhoneExpression> phoneExpressions;
	
	public Sentiment getSentiment() {
		return sentiment;
	}
	public void setSentiment(Sentiment sentiment) {
		this.sentiment = sentiment;
	}
	public List<Category> getCategorization() {
		return categorization;
	}
	public void setCategorization(List<Category> categories) {
		this.categorization = categories;
	}
	public List<Entity> getEntities() {
		return entities;
	}
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}
	public List<Concept> getConcepts() {
		return concepts;
	}
	public void setConcepts(List<Concept> concepts) {
		this.concepts = concepts;
	}
	public List<TimeExpression> getTimeExpressions() {
		return timeExpressions;
	}
	public void setTimeExpressions(List<TimeExpression> timeExpressions) {
		this.timeExpressions = timeExpressions;
	}
	public List<MoneyExpression> getMoneyExpressions() {
		return moneyExpressions;
	}
	public void setMoneyExpressions(List<MoneyExpression> moneyExpressions) {
		this.moneyExpressions = moneyExpressions;
	}
	public List<Uri> getUris() {
		return uris;
	}
	public void setUris(List<Uri> uris) {
		this.uris = uris;
	}
	public List<PhoneExpression> getPhoneExpressions() {
		return phoneExpressions;
	}
	public void setPhoneExpressions(List<PhoneExpression> phoneExpressions) {
		this.phoneExpressions = phoneExpressions;
	}
	
	private void printHelper(StringBuffer buffer, String name, Object o) {
		buffer.append("[ ").append(name).append(" = ");
		if (o == null) buffer.append("not requested");
		else buffer.append(o.toString());
		buffer.append("]\n");
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Result \n");
		printHelper(buffer, "sentiment", sentiment);
		printHelper(buffer, "categorization", categorization);
		printHelper(buffer, "entities", entities);
		printHelper(buffer, "timeExpressions", timeExpressions);
		printHelper(buffer, "moneyExpressions", moneyExpressions);
		printHelper(buffer, "uris", uris);
		printHelper(buffer, "phoneExpressions", phoneExpressions);

		return buffer.toString();
	}
	
	
	
}
