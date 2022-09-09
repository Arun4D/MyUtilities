package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Body {
    @JacksonXmlProperty(localName = "p")
    private String p;
    @JacksonXmlProperty(localName = "pdfcount")
    private String pdfcount;
    @JacksonXmlProperty(localName = "element1")
    private Element1 element1;

    public String getP() { return p; }
    public void setP(String value) { this.p = value; }

    public String getPdfcount() { return pdfcount; }
    public void setPdfcount(String value) { this.pdfcount = value; }

    public Element1 getElement1() { return element1; }
    public void setElement1(Element1 value) { this.element1 = value; }
}