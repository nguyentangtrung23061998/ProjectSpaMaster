package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.repository.IAuthCustomerRepository;
import ptit.laptrinhjavaweb.service.IAuthCustomerService;

@Service
public class AuthCustomerService implements IAuthCustomerService {

	@Autowired
	IAuthCustomerRepository authCustomer;
	
	@Override
	public CustomerEntity findUser(String uname, String upwd) {
		// TODO Auto-generated method stub
		return authCustomer.findUser(uname, upwd);
	}

}
