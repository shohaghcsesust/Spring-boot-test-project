package com.shohagh.springboottest.mail;

public interface MailSender {
	void send(String to, String subject, String body);
}