package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ServiceStatus {
    @JacksonXmlProperty(localName = "Code")
    private String code;
    @JacksonXmlProperty(localName = "Message")
    private String message;

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }
}