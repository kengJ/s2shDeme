package com.oa.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.oa.entity.OaUser;
import com.oa.util.CookieHelp;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 登录拦截器
 * 检测是否登录
 * @author heyanzhu
 *
 */
@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor{
	@Resource
	private CookieHelp cookieHelp;
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		/**
		 * 拦截器
		 * 检查是否已登录
		 */
		HttpSession session = ServletActionContext.getPageContext().getSession();
		//获取当前user对象
		OaUser user = (OaUser) session.getAttribute("OA_LocalUser");
		if(user==null){
			return "toLogin";
		}
		return null;
		
	}
}
