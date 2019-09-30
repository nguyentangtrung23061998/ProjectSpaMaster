package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.HibernateTemplate;

import ptit.laptrinhjavaweb.service.IAuthService;

public class AuthService implements IAuthService {
	private HibernateTemplate hibernateTemplate;
	private static Logger log = Logger.getLogger(AuthService.class);
	private AuthService() {
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@SuppressWarnings({ "unchecked", "deprecation" })
	public boolean findUser(String uname, String upwd) {
		boolean isValidUser = false;
		String sqlQuery = "from customer u where u.username=? and u.password=?";
		try {
			 List userObj = (List) hibernateTemplate.find(sqlQuery, uname, upwd);
		} catch (Exception e) {
			isValidUser = false;
			log.error("An error occurred while fetching the user details from the database", e);
		}
		return false;
	}

}
