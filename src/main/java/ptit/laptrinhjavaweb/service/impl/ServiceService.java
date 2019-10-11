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

	@Override
	public ServiceEntity saveService(ServiceEntity service) {
		return serviceRepository.saveService(service);
	}

	@Override
	public void deleteService(int theId) {
		serviceRepository.deleteService(theId);
	}

	@Override
	public ServiceEntity updateService(ServiceEntity service) {
		// TODO Auto-generated method stub
		return serviceRepository.updateService(service);
	}
	
	
}
