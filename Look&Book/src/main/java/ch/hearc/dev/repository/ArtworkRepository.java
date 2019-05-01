package ch.hearc.dev.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import ch.hearc.dev.entity.Artwork;

@Repository("artworkRepository")
public interface ArtworkRepository extends JpaRepository <Artwork, Long>{
	@Modifying
	@Transactional
	void deleteById(Long id);
}
