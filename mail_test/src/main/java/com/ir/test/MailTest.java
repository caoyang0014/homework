package com.ir.test;

import org.junit.Test;

import com.ir.bean.Mail;
import com.ir.util.MailUtil;


/**
 *@author 曹洋
 *2017年7月6日 上午9:47:52
 *
 *
 *
 */
public class MailTest {
	
	  @Test
	  public void sendMail(){
	    Mail mail = new Mail();
	    // 设置邮件服务器 
	    mail.setHost("smtp.qq.com");
	    // 发件人邮件地址
	    mail.setSender("13683588016@163.com");
	    // 发件人名称
	    mail.setName("Java");
	    // 登录账号,一般都是和邮箱名一样吧 
	    mail.setUsername("13683588016@163.com");
	    // 发件人邮箱的登录密码 
	    mail.setPassword("caoyang960105");
	    // 接收人 
	    mail.setReceiver("564438733@qq.com");
	    mail.setReceiverName("曹洋");
	    mail.setSubject("最后一步测试");
	    mail.setMessage("希望能测试成功！");
	     
	    new MailUtil().send(mail);
	  }
}
