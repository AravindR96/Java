package Com.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Spring.Dao.LoginDAO;
import Com.Spring.business.bean.LoginBean;

@Service
public class LoginService {
	    @Autowired
	    private LoginDAO loginDAO;

	 

	        public String validateLogin(LoginBean loginBean){

	            return loginDAO.validateLogin(loginBean);

	        }


	}

