package com.ivet.whatineed.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ivet.whatineed.entity.dao.IWhatineedDao;
import com.ivet.whatineed.entity.models.Whatineed;

@Service
public class WhatineedServices implements IWhatineedServices{

	@Autowired
	private IWhatineedDao whatineedDao;
	
	@Override
	public List<Whatineed> getAllStuff(){
		
		return (List<Whatineed>)whatineedDao.findAll();
		
	}
	
	@Override
	public void addStuff(Whatineed stuff) {
		
		whatineedDao.save(stuff);
		
	}

	@Override
	public void deleteStuff(long id) {

		whatineedDao.deleteById(id);
		
	}

	@Override
	public void put(Whatineed stuff, long id) {
		
		whatineedDao.findById(id).ifPresent((x)->{		//Busca la id y si la encuentra
			
			stuff.setId(id);		//Le coloco un nuevo id
			whatineedDao.save(stuff);		//Y entonces guardo de nuevo el objeto
			
		});		
	}

	@Override
	public Whatineed get(long id) {
		
		return whatineedDao.findById(id).get();
	}


	
}
