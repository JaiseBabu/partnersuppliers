package com.ust.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.spring.model.Partner;
import com.ust.spring.model.UploadFile;


public interface FileUploadDAO {
    public void save(UploadFile uploadFile);
}