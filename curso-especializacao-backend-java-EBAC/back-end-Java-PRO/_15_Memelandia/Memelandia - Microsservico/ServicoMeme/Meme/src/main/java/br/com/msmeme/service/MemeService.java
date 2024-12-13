package br.com.msmeme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.msmeme.entity.Meme;
import br.com.msmeme.repository.MemeRepository;

@Component
public class MemeService {

	@Autowired
	private final MemeRepository memeRepository;

	public MemeService(MemeRepository memeRepository) {
		this.memeRepository = memeRepository;
	}

	public Meme criarMeme(Meme meme) {
		return memeRepository.save(meme);
	}

	public Iterable<Meme> findAllMemes() {
		return memeRepository.findAll();
	}
}
