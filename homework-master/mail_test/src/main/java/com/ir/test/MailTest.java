package com.ir.test;

import org.junit.Test;

import com.ir.bean.Mail;
import com.ir.util.MailUtil;


/**
 *@author ����
 *2017��7��6�� ����9:47:52
 *
 *
 *
 */
public class MailTest {
	
	  @Test
	  public void sendMail(){
	    Mail mail = new Mail();
	    // �����ʼ������� 
	    mail.setHost("smtp.qq.com");
	    // �������ʼ���ַ
	    mail.setSender("13683588016@163.com");
	    // ����������
	    mail.setName("Java");
	    // ��¼�˺�,һ�㶼�Ǻ�������һ���� 
	    mail.setUsername("13683588016@163.com");
	    // ����������ĵ�¼���� 
	    mail.setPassword("caoyang960105");
	    // ������ 
	    mail.setReceiver("564438733@qq.com");
	    mail.setReceiverName("����");
	    mail.setSubject("���һ������");
	    mail.setMessage("ϣ���ܲ��Գɹ���");
	     
	    new MailUtil().send(mail);
	  }
}
