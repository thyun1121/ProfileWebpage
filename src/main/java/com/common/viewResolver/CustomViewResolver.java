package com.common.viewResolver;

import java.util.Locale;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 
 * @author thyun.ahn
 *
 */
public class CustomViewResolver extends UrlBasedViewResolver implements Ordered{
	
	/**
	 * UrlBasedViewResolver의 loadView 오버라이딩
	 * 
	 * 기존 loadView에서는 suffix에 매칭되는 URL 없으면 Exception 호출하므로, 타 Resolver가 호출되지 않음.
	 * 그러므로, null을 return 하도록 수정해야 함.
	 */
	protected View loadView(String viewName, Locale locale) throws Exception{
		AbstractUrlBasedView view = buildView(viewName);
		View viewObj = (View) getApplicationContext().getAutowireCapableBeanFactory().initializeBean(view, viewName);
		if(viewObj instanceof JstlView){
			
			JstlView jv = (JstlView) viewObj;
			if(jv.getUrl().indexOf("worldCup") > -1)	//worldcup이 있는 경우, client에서 보낸 beanName jv.getBeanName()으로 호출
				return null;	//jsp resolver 실행
		}
		return viewObj;			
	}
}
