package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.repository.IServiceRepository;
import ptit.laptrinhjavaweb.service.IServiceService;

@Service
public class ServiceService implements IServiceService{
	
	@Autowired 
	private IServiceRepository serviceRepository;
	
	
	@Override
	public List<ServiceEntity> getServices() {
		return serviceRepository.getserviceRepositorys();
	}

	@Override
	public ServiceEntity getService(int id) {
		return serviceRepository.getService(id);
	}
	
	
}
