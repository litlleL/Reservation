package fr.party.spring.admin.filter;

import javax.servlet.annotation.WebFilter;

import org.springframework.web.filter.CharacterEncodingFilter;

@WebFilter("/mvc/*")
public class EncodingFilter extends CharacterEncodingFilter {

	public EncodingFilter() {
		super("UTF-8", true);
	}
}
