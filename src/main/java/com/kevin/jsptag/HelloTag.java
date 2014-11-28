package com.kevin.jsptag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * JSP Tag
 * 
 * @author Kai.Zhao
 * @date Nov. 18th, 2014
 * @since 1.0
 */
public class HelloTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("Hello Kevin");
	}

}
