package main.java.com.journaldev.struts2.action;

import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

public class LoginAction implements Action {



	@Override
	public String execute() throws Exception {

		if( pageName != null )
		{
			return pageName;
		}

		if("pankaj".equals(getName()) && "admin".equals(getPwd()))
		return "SUCCESS";
		else return "ERROR";
	}
	
	//Java Bean to hold the form parameters
	private String name;
	private String pwd;
	private String pageName;
	private List<String> searchEngine;
	private String yourSearchEngine;
	private String yourMonth;

	public LoginAction() {
		searchEngine = new ArrayList<String>();
		searchEngine.add("google.com");
		searchEngine.add("bing.com");
		searchEngine.add("yahoo.com");
		searchEngine.add("baidu.com");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public List<String> getSearchEngine() {
		return searchEngine;
	}

	public void setSearchEngine(List<String> searchEngine) {
		this.searchEngine = searchEngine;
	}

	public String getYourSearchEngine() {
		return yourSearchEngine;
	}

	public void setYourSearchEngine(String yourSearchEngine) {
		this.yourSearchEngine = yourSearchEngine;
	}

	public String getYourMonth() {
		return yourMonth;
	}

	public void setYourMonth(String yourMonth) {
		this.yourMonth = yourMonth;
	}
}
