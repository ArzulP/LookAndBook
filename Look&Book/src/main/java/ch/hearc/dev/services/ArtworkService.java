package ch.hearc.dev.services;

import ch.hearc.dev.entity.Artwork;

public interface ArtworkService {
	public Artwork findArtworkById(long id);
	public void saveArtwork(Artwork artwork);
	public Iterable<Artwork> findAll();
}
