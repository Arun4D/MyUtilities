package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Div {
    
    @JacksonXmlProperty(localName = "br")
    private String br;
    @JacksonXmlProperty(localName = "ImgDocUri")
    private String imgDocURI;

    public String getBr() { return br; }
    public void setBr(String value) { this.br = value; }

    public String getImgDocURI() { return imgDocURI; }
    public void setImgDocURI(String value) { this.imgDocURI = value; }
}
