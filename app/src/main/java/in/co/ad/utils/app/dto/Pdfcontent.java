package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Pdfcontent {
    @JacksonXmlProperty(localName = "ImgDocUri")
    private String imgDocURI;
    //@JacksonXmlProperty(localName = "div")
    @JacksonXmlElementWrapper(useWrapping=false)
    private Div[] div;

    public String getImgDocURI() { return imgDocURI; }
    public void setImgDocURI(String value) { this.imgDocURI = value; }

    public Div[] getDiv() { return div; }
    public void setDiv(Div[] value) { this.div = value; }
}