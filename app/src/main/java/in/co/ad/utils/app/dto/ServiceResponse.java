package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ServiceResponse {
    @JacksonXmlProperty(localName = "ServiceStatus")
    private ServiceStatus serviceStatus;
    @JacksonXmlProperty(localName = "html")
    private HTML html;

    public ServiceStatus getServiceStatus() { return serviceStatus; }
    public void setServiceStatus(ServiceStatus value) { this.serviceStatus = value; }

    public HTML getHTML() { return html; }
    public void setHTML(HTML value) { this.html = value; }
}
