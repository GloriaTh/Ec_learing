package com.learing.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author Gloria
 *
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
