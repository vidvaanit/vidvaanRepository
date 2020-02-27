package com.vidvaan.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	private static SessionFactory sfFactory = null;

	static {
		Configuration cfg = new Configuration();
		sfFactory = cfg.configure("com/vidvaan/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
	}

	public static Session getSession() {
		return sfFactory.openSession();
	}

	public static void close(Session session) {
		session.close();
	}

}
