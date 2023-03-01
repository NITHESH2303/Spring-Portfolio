package com.example.nitheshportfolio.models;

public class ServiceDetailModel {
    private String ServiceName;
    private String ServiceDescription;

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getServiceDescription() {
        return ServiceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        ServiceDescription = serviceDescription;
    }
    public ServiceDetailModel(){

    }

    @Override
    public String toString() {
        return "ServiceDetailModel{" +
                "ServiceName='" + ServiceName + '\'' +
                ", ServiceDescription='" + ServiceDescription + '\'' +
                '}';
    }
}
