package Com.Spring.Dao;

import org.springframework.stereotype.Repository;

import Com.Spring.business.bean.LoginBean;

@Repository
public class LoginDAO {
	 public String validateLogin(LoginBean loginBean){

	        String uName = loginBean.getUserName();
	        String password = loginBean.getPassword();

	        if(uName.equals("MSD") && password.equals("MSD@123")){
	            return "success";
	        }
	        else{
	            return "faliure";
	        }
	    }
	}

