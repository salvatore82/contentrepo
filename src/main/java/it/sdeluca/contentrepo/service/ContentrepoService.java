package it.sdeluca.contentrepo.service;

import org.springframework.web.multipart.MultipartFile;

import it.sdeluca.contentrepo.dto.Document;
import it.sdeluca.contentrepo.exceptions.ContentrepoFileNotFoundException;

public interface ContentrepoService {

	String store(MultipartFile file) throws ContentrepoFileNotFoundException;

	// Path load(String identifier);

	Document load(String identifier) throws ContentrepoFileNotFoundException;
}