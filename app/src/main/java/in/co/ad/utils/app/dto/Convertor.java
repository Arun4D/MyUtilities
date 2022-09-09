package in.co.ad.utils.app.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Convertor {
    private ServiceResponse serviceResponse;

    public ServiceResponse getServiceResponse() { return serviceResponse; }
    public void setServiceResponse(ServiceResponse value) { this.serviceResponse = value; }
}
