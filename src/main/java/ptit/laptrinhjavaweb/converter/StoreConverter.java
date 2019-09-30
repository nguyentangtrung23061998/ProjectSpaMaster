package ptit.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import ptit.laptrinhjavaweb.dto.StoreDTO;
import ptit.laptrinhjavaweb.entity.StoreEntity;

public class StoreConverter {
	public StoreDTO convertoToDTO(StoreEntity storeEntity) {
		ModelMapper modelMapper = new ModelMapper();
		StoreDTO result = modelMapper.map(storeEntity,StoreDTO.class);
		return result;
	}
	public StoreEntity converToEntity(StoreDTO storeDTO) {
		ModelMapper modelMapper = new ModelMapper();
		StoreEntity result = modelMapper.map(storeDTO,StoreEntity.class);
		return result;
	}
}
