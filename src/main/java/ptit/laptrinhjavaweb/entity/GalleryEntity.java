package ptit.laptrinhjavaweb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gallery")
public class GalleryEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="imagepath")
	private String imagePath;
	
	@Column(name="content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "storekeeperid")
	private StorekeeperEntity storekeeper;

	public GalleryEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public StorekeeperEntity getStoreKeeper() {
		return storekeeper;
	}

	public void setStoreKeeper(StorekeeperEntity storekeeper) {
		this.storekeeper = storekeeper;
	}
	
	
}
