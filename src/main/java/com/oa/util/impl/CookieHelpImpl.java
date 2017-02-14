package com.oa.util.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oa.util.CookieHelp;

public class CookieHelpImpl implements CookieHelp {
	
	/**
	 * 获取所有cookie信息
	 */
	@Override
	public Cookie[] getCookies(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies==null ){
			return null;
		}else if(cookies.length==0){
			return null;
		}else{
			return cookies;
		}
	}
	/**
	 * 添加cookie信息
	 */
	@Override
	public void addCookie(HttpServletResponse respons, Map<String, String> prams,int time) {
		if(prams!=null && prams.size()!=0){
			for(String key : prams.keySet()){
				Cookie cookie = new Cookie(key, prams.get(key));
				cookie.setMaxAge(time);
				respons.addCookie(cookie);
			}
		}
	}
	
	/**
	 * 获取所有的cookie信息
	 */
	@Override
	public List<Map<String, String>> getCookie(HttpServletRequest request) {
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		Cookie[] cookies =  getCookies(request);
		if(cookies != null && cookies.length==0){
			for(Cookie cookie : cookies){
				Map<String, String> map = new HashMap<String, String>();
				map.put("CookieName", cookie.getName());
				map.put("CookieValue", cookie.getValue());
				list.add(map);
			}
			return list;
		}
		
		return null;
	}
	
	/**
	 * 根据cookieName获取cookie的信息
	 */
	@Override
	public Map<String, String> getCookieForName(HttpServletRequest request,String Name) {
		List<Map<String, String>> list =  getCookie(request);
		for(Map<String, String> map : list){
			String MapName = map.get("CookieName");
			if(MapName.equals(Name)){
				return map;
			}
		}
		return null;
	}
}
