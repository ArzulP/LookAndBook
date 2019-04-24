package ch.hearc.dev.services;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hearc.dev.entity.Artwork;
import ch.hearc.dev.repository.ArtworkRepository;


@Service("artworkService")
public class ArtworkServiceImpl implements ArtworkService{

	@Autowired
	private ArtworkRepository artworkRepository;

	@Override
	public Iterable<Artwork> findAll() {
		return artworkRepository.findAll();
	}

	@Override
	public void saveArtwork(Artwork artwork) {
		artworkRepository.save(artwork);
	}

	@Override
	public Artwork findArtworkById(long id) {
		return artworkRepository.findById(id).get();
	}

}
