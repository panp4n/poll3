package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Answers;
import com.briup.apps.poll.bean.AnswersExample;
import com.briup.apps.poll.dao.AnswersMapper;
import com.briup.apps.poll.service.IAnswersService;
@Service
public class AnswersServiceImpl implements IAnswersService {

	@Autowired
	private AnswersMapper answersMapper;

	@Override
	public List<Answers> findAll() throws Exception {
		// TODO Auto-generated method stub
		AnswersExample example=new AnswersExample();
		return answersMapper.selectByExample(example);
	}

	@Override
	public Answers findById(long id) throws Exception {
		// TODO Auto-generated method stub
		return answersMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Answers> query(String keywords) throws Exception {
		
		AnswersExample example=new AnswersExample();
	    example.createCriteria();
	    return answersMapper.selectByExample(example);
	}

	@Override
	public void saveOrUpdate(Answers answers) throws Exception {
		// TODO Auto-generated method stub
		if(answers.getId()!=null){
			answersMapper.updateByPrimaryKey(answers);
		}
		else{
			answersMapper.insert(answers);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		answersMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {
		// TODO Auto-generated method stub
		for(long id : ids){
			answersMapper.deleteByPrimaryKey(id);
		}
	}



}
