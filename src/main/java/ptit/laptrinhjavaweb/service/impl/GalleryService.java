package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.GalleryEntity;
import ptit.laptrinhjavaweb.repository.IGalleryReposiory;
import ptit.laptrinhjavaweb.service.IGalleryService;

@Service
public class GalleryService implements IGalleryService{

	@Autowired
	private IGalleryReposiory galleryRepository;
	
	@Override
	public List<GalleryEntity> getGalleryService() {
		// TODO Auto-generated method stub
		return galleryRepository.getGallerys();
	}

}
