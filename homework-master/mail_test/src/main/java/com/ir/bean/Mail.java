package com.ir.bean;

import java.util.Map;

/**
 *@author ����
 *2017��7��6�� ����9:46:43
 *
 *
 *
 */
public class Mail {

	public static final String ENCODEING = "UTF-8"; 
	 
	  // ��������ַ 
	  private String host;
	  // �����˵����� 
	  private String sender; 
	  // �������ǳ� 
	  private String name; 
	  // �˺� 
	  private String username; 
	  // ���� 
	  private String password; 
	  // �ռ��˵����� 
	  private String receiver;
	  // �ռ��˵�����
	  private String receiverName;
	  // �ռ��˵�����(key)������(value)
	  private Map<String, String> to;
	  // ���� 
	  private String subject; 
	  // ��Ϣ(֧��HTML)
	  private String message;
	 
	  public String getHost() {
	    return host;
	  }
	  public void setHost(String host) {
	    this.host = host;
	  }
	  public String getSender() {
	    return sender;
	  }
	  public void setSender(String sender) {
	    this.sender = sender;
	  }
	  public String getReceiver() {
	    return receiver;
	  }
	  public void setReceiver(String receiver) {
	    this.receiver = receiver;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getUsername() {
	    return username;
	  }
	  public void setUsername(String username) {
	    this.username = username;
	  }
	  public String getPassword() {
	    return password;
	  }
	  public void setPassword(String password) {
	    this.password = password;
	  }
	  public String getSubject() {
	    return subject;
	  }
	  public void setSubject(String subject) {
	    this.subject = subject;
	  }
	  public String getMessage() {
	    return message;
	  }
	  public void setMessage(String message) {
	    this.message = message;
	  }
	  public String getReceiverName() {
	    return receiverName;
	  }
	  public void setReceiverName(String receiverName) {
	    this.receiverName = receiverName;
	  }
	  public Map<String, String> getTo() {
	    return to;
	  }
	  public void setTo(Map<String, String> to) {
	    this.to = to;
	  }
}
