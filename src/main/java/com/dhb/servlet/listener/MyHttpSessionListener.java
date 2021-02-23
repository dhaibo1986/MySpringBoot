package com.dhb.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {
	
	public static int online = 0;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("创建session id is ["+se.getSession().getId()+"]");
		online ++;
		System.out.println("当前session总数：["+online+"]");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("销毁session id is ["+se.getSession().getId()+"]");
		online --;
		System.out.println("当前session总数：["+online+"]");
	}
}
