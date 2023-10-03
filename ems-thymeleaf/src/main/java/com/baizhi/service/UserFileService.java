package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.original.UserFile;

public interface UserFileService {

    List<UserFile> findByUserName(String userName);

	int save(UserFile userFile);

	UserFile findById(int id);

	int update(UserFile userFile);

	int delete(int idInt);
}
