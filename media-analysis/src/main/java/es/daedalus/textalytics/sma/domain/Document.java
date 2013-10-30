package es.daedalus.textalytics.sma.domain;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Document {

	public enum Source {
		TWITTER,
		FACEBOOK,
		BLOG,
		NEWS,
		UNKNOWN, 
	}
	
	public enum Language {
		es,en
	}

	public enum InputTextFormat {
		txt,html
	}
	
	String id;
	String txt;
	Language language;
	Source source;
	String timeref;
	InputTextFormat itf;
	
	
	public Document(String id, String txt) {
		super();
		this.id = id;
		this.txt = txt;
	}
	public String toJsonString() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		StringWriter out = new StringWriter();

		// Object should be wrapped in document
		out.append("{\"document\":");
		mapper.writeValue(out, this);
		out.append("}");		
		
		return out.toString();
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public String getTimeref() {
		return timeref;
	}
	public void setTimeref(String timeref) {
		this.timeref = timeref;
	}
	
	public InputTextFormat getItf() {
		return itf;
	}
	public void setItf(InputTextFormat itf) {
		this.itf = itf;
	}
	
	@Override
	public String toString() {
		return "Document [id=" + id + ", txt=" + txt + ", language=" + language
				+ ", source=" + source + ", timeref=" + timeref + ", itf="
				+ itf + "]";
	}
	
	
	
}
