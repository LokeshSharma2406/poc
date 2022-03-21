package com.example.poc.exceptions;

import java.util.Date;

public class ExceptionResponse {

  private String msg;
  private Date date;
  private String description;
  public ExceptionResponse(String msg, Date date, String description) {
    this.msg = msg;
    this.date = date;
    this.description = description;
  }
  public ExceptionResponse() {
    super();
    // TODO Auto-generated constructor stub
  }
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  
  
}
