package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Element1 {
    @JacksonXmlProperty(localName = "header")
    private Header header;
    @JacksonXmlProperty(localName = "LogOnHeader")
    private String logOnHeader;
    @JacksonXmlProperty(localName = "pdfcontent")
    private Pdfcontent pdfcontent;

    public Header getHeader() { return header; }
    public void setHeader(Header value) { this.header = value; }

    public String getLogOnHeader() { return logOnHeader; }
    public void setLogOnHeader(String value) { this.logOnHeader = value; }

    public Pdfcontent getPdfcontent() { return pdfcontent; }
    public void setPdfcontent(Pdfcontent value) { this.pdfcontent = value; }
}