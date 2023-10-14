package com.baizhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.original.UserFileMapper;
import com.baizhi.entity.original.UserFile;
import com.baizhi.entity.original.UserFileExample;

@Service
@Transactional
public class UserFileServiceImpl  implements UserFileService{

    private UserFileMapper mapper;

    @Autowired
    public UserFileServiceImpl(UserFileMapper mapper) {
        this.mapper = mapper;
    }

	@Override
	public List<UserFile> findByUserName(String userName) {
		
		UserFileExample example = new UserFileExample();
		UserFileExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		return mapper.selectByExample(example);
	}

	@Override
	public int save(UserFile userFile) {
		
		String isImg = userFile.getType().startsWith("image")?"Y":"N";
		userFile.setIsImg(isImg);
		return mapper.insertSelective(userFile);
	}

	@Override
	public UserFile findById(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(UserFile userFile) {
		return mapper.updateByPrimaryKeySelective(userFile);
		
	}

	@Override
	public int delete(int id) {
		return mapper.deleteByPrimaryKey(id);
		
	}
}
