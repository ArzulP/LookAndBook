package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.hearc.dev.entity.Artwork;

public interface ArtworkRepository extends JpaRepository <Artwork, Long>{
	
}
