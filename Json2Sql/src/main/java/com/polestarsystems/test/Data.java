package com.polestarsystems.test;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
	@SerializedName("Name")
    private  String name;
	@SerializedName("AlarmColor")
    private  long alarmColor;
	@SerializedName("Id")
    private  int  id;
	@SerializedName("Parameters")
    private List<Parameter> parameters;
	@SerializedName("DatasourcesCount")
    private  int DatasourcesCount;
    @SerializedName("_alertIcon")
    private String alertIcon;
    @SerializedName("ElementCount")
    private  long  elementCount;
    @SerializedName("UniqueID")
    private String  uniqueID;

    public Data(String name, long alarmColor, int id, List<Parameter> parameters, int datasourcesCount, String alertIcon, long elementCount, String uniqueID) {
        this.name = name;
        this.alarmColor = alarmColor;
        this.id = id;
        this.parameters = parameters;
        DatasourcesCount = datasourcesCount;
        this.alertIcon = alertIcon;
        this.elementCount = elementCount;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAlarmColor() {
        return alarmColor;
    }

    public void setAlarmColor(long alarmColor) {
    	this.alarmColor = alarmColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
    	this.id = id;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
    	this.parameters = parameters;
    }

    public int getDatasourcesCount() {
        return DatasourcesCount;
    }

    public void setDatasourcesCount(int datasourcesCount) {
        DatasourcesCount = datasourcesCount;
    }

    public String getAlertIcon() {
        return alertIcon;
    }

    public void setAlertIcon(String alertIcon) {
        this.alertIcon = alertIcon;
    }

    public long getElementCount() {
        return elementCount;
    }

    public void setElementCount(long elementCount) {
        this.elementCount = elementCount;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
