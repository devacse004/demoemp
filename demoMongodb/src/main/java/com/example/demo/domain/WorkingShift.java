package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")

@ApiModel(description="This class details about WorkingShift ")

public class WorkingShift {
	   @Id 
	   @ApiModelProperty(note =" The separate Id  for WorkingShift")
	   private String e_id;
	   @ApiModelProperty(note =" The name for WorkingShift")
	   private String e_name;
	   
	   
	   public String gete_id() {
		return e_id;
	   }
	    public void sete_id(String e_id) {
	    	this.e_id=e_id;
	    }
	    @ApiModelProperty(note =" The Employee  for WorkingShift")
		   private String ws_mng;
		   @ApiModelProperty(note =" The Employee for WorkingShift")
		   private String ws_eve;
		   public String getws_mng() {
			return ws_mng;
		   }
		   public void setws_mng(String ws_mng) {
			   this.ws_mng=ws_mng;
		   }
		   public String getws_eve() {
				return ws_eve;
			   }
			   public void setws_eve(String ws_eve) {
				   this.ws_eve=ws_eve;
			   }
			   public String gete_name() {
					return e_name;
				   }
				    public void sete_name(String e_name) {
				    	this.e_name=e_name;
				    }
			   @Override
			   public String toString() {
			   return "WorkShift[ws_mng="+ ws_mng + ", ws_eve="+ ws_eve +" ,e_id="+e_id+", e_name="+ e_name +"]";
}
		   
			   
		
		   
	   }
	   
	   
	   


