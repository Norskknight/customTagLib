package customTagLib;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;


/**
 * The type Date tag.
 */
public class DateTag extends SimpleTagSupport {
    @Override

    public void doTag() throws JspException, IOException {
        super.doTag();
        LocalDate today = LocalDate.now();
        JspWriter out = getJspContext().getOut();
       String outputString = "<input type=\"date\" id=\"date\" name=\"date\" default=\"" + today + "\">";
        out.print(outputString);
    }
}
