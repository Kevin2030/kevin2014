package com.kevin.jsptag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * JSP Tag
 * 
 * @author Kai.Zhao
 * @date Nov. 18th, 2014
 * @since 1.0
 */
public class HelloTag1 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		getJspContext().getOut().println(sw.toString());
	}

}
