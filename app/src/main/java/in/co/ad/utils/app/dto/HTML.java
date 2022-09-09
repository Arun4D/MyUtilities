package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class HTML {
    @JacksonXmlProperty(localName = "body")
    private Body body;

    public Body getBody() { return body; }
    public void setBody(Body value) { this.body = value; }
}