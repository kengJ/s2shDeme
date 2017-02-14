package com.oa.util;

import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface CookieHelp {
	public Cookie[] getCookies(HttpServletRequest request);
	public void addCookie(HttpServletResponse respons,Map<String, String> prams,int time);
	public List<Map<String,String>> getCookie(HttpServletRequest request);
	public Map<String,String> getCookieForName(HttpServletRequest request,String Name);
}
