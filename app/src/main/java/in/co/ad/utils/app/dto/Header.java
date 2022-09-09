package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Header {
    @JacksonXmlProperty(localName = "common")
    private String common;
    @JacksonXmlProperty(localName = "middle")
    private String middle;

    public String getCommon() { return common; }
    public void setCommon(String value) { this.common = value; }

    public String getMiddle() { return middle; }
    public void setMiddle(String value) { this.middle = value; }
}
