package com.ir.util;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.ir.bean.Mail;

/**
 *@author ����
 *2017��7��6�� ����9:47:03
 *
 *
 *
 */
public class MailUtil {

	public boolean send(Mail mail){
	    HtmlEmail email = new HtmlEmail();
	    try {
	      // ������SMTP���ͷ����������֣�163�����£�"smtp.163.com" 
	      email.setHostName(mail.getHost());
	      // �ַ����뼯������ 
	      email.setCharset(Mail.ENCODEING);
	      // �����˵����� 
	      email.setFrom(mail.getSender(), mail.getName()); 
	      // �����Ҫ��֤��Ϣ�Ļ���������֤���û���-���롣�ֱ�Ϊ���������ʼ��������ϵ�ע�����ƺ����� 
	      email.setAuthentication(mail.getUsername(), mail.getPassword());
	 
	      // �����ռ�����Ϣ
	      setTo(email, mail);
	      // Ҫ���͵��ʼ����� 
	      email.setSubject(mail.getSubject());
	      // Ҫ���͵���Ϣ������ʹ����HtmlEmail���������ʼ�������ʹ��HTML��ǩ 
	      email.setHtmlMsg(mail.getMessage());
	      // ���� 
	      email.send();
	      
	      return true;
	    } catch (Exception e) {
	      e.printStackTrace();
	      return false;
	    }

}

	
	
	private void setTo(HtmlEmail email, Mail mail) throws EmailException{
	    // �ռ��˲�Ϊ��

	    if (StringUtils.isNotEmpty(mail.getReceiver())) {
	      // �ռ������Ʋ�Ϊ��
	      if (StringUtils.isNotEmpty(mail.getReceiverName())) {
	        email.addTo(mail.getReceiver(), mail.getReceiverName());
	      } else {
	        email.addTo(mail.getReceiver());
	      }
	    }
	    // �ռ��� Map ��Ϊ��
	    if (mail.getTo() != null) {
	      for (Map.Entry<String, String> entry : mail.getTo().entrySet()) {
	        // �ռ������Ʋ�Ϊ��
	        if (StringUtils.isNotEmpty(entry.getValue())) {
	          email.addTo(entry.getKey(), entry.getValue());
	        } else {
	          email.addTo(entry.getKey());
	        }
	      }
	    }
	}
	
}
