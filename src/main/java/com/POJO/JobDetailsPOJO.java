package com.POJO;

import java.util.Objects;

public class JobDetailsPOJO {
    private String OEM;
    private String JobNumber;
    private String SerialNo;
    private String 	Product;
    private String	Model;
    private String	WarrantyStatus;
    private String	ActionStatus;

    public JobDetailsPOJO(String OEM, String jobNumber, String serialNo, String product, String model,
                          String warrantyStatus, String actionStatus) {
        this.OEM = OEM;
        JobNumber = jobNumber;
        SerialNo = serialNo;
        Product = product;
        Model = model;
        WarrantyStatus = warrantyStatus;
        ActionStatus = actionStatus;
    }

    public String getOEM() {
        return OEM;
    }

    public void setOEM(String OEM) {
        this.OEM = OEM;
    }

    public String getJobNumber() {
        return JobNumber;
    }

    public void setJobNumber(String jobNumber) {
        JobNumber = jobNumber;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getWarrantyStatus() {
        return WarrantyStatus;
    }

    public void setWarrantyStatus(String warrantyStatus) {
        WarrantyStatus = warrantyStatus;
    }

    public String getActionStatus() {
        return ActionStatus;
    }

    public void setActionStatus(String actionStatus) {
        ActionStatus = actionStatus;
    }


    @Override
    public String toString() {
        return "jobDetailsPOJO{" +
                "OEM='" + OEM + '\'' +
                ", JobNumber='" + JobNumber + '\'' +
                ", SerialNo='" + SerialNo + '\'' +
                ", Product='" + Product + '\'' +
                ", Model='" + Model + '\'' +
                ", WarrantyStatus='" + WarrantyStatus + '\'' +
                ", ActionStatus='" + ActionStatus + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        JobDetailsPOJO that = (JobDetailsPOJO) o;
        return Objects.equals(OEM, that.OEM) && Objects.equals(JobNumber, that.JobNumber)
                && Objects.equals(SerialNo, that.SerialNo) && Objects.equals(Product, that.Product)
                && Objects.equals(Model, that.Model) && Objects.equals(WarrantyStatus, that.WarrantyStatus)
                && Objects.equals(ActionStatus, that.ActionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(OEM, JobNumber, SerialNo, Product, Model, WarrantyStatus, ActionStatus);
    }
}
