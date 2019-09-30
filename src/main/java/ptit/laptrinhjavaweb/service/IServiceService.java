package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.ServiceEntity;

public interface IServiceService {
	public List<ServiceEntity> getServices();
	public ServiceEntity getService(int id);
}
