package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;

public interface IServiceRepository {
	public List<ServiceEntity> getserviceRepositorys();
	public ServiceEntity getService(int id);
	public ServiceEntity saveService(ServiceEntity service);
	public void deleteService(int theId);
	public ServiceEntity updateService(ServiceEntity service); 
}
