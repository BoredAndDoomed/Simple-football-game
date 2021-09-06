package com.polestarsystems.test;

import com.google.gson.annotations.SerializedName;

public class Parameter {
	@SerializedName("Key")
   private String key;
	@SerializedName("Value")
   private  String  value;
   public Parameter(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

    
}
