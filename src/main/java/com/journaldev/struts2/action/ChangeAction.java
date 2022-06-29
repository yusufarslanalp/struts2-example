package main.java.com.journaldev.struts2.action;

import com.opensymphony.xwork2.Action;

public class ChangeAction implements Action {

    @Override
    public String execute() throws Exception {
        return "change";
    }

    private String EmpName;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    //Java Bean to hold the form parameters
    private String name;
    private String pwd;
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

}

