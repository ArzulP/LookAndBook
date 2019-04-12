package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.hearc.dev.entity.Artwork;

@Repository("artworkRepository")
public interface ArtworkRepository extends JpaRepository <Artwork, Long>{
	
}
