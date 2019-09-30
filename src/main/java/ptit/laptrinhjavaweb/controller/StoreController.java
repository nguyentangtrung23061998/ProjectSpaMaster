package ptit.laptrinhjavaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.repository.IStoreRepository;
import ptit.laptrinhjavaweb.service.IStoreService;

//@Controller
@RestController
public class StoreController {

//	@Autowired
//	private IStoreService storeService;
//	
	
	@Autowired
	private IStoreRepository storeService;
	
	@GetMapping("/list")
	public List<StoreEntity> showInfo() {
		return storeService.getStores();
	}
	
	@PostMapping("/list")
	public StoreEntity addStore(@RequestBody StoreEntity theStore) {
		storeService.saveStore(theStore);
		return theStore;
	}
	@PutMapping("/list")
	public StoreEntity updateStore(@RequestBody StoreEntity theStore) {
		storeService.saveStore(theStore);
		return theStore;
	}
	
	@DeleteMapping("/list/{listId}")
	public String deleteList(@PathVariable int listId) {
//		StoreEntity store = storeService.getStore(listId);
		storeService.deleteStore(listId);
		return "Success";
	}
	
	@GetMapping("list/{listId}")
	public StoreEntity listID(@PathVariable int listId) {
		return storeService.getStore(listId);
	}
}
