package com.ivet.whatineed.entity.services;

import java.util.List;

import com.ivet.whatineed.entity.models.Whatineed;

public interface IWhatineedServices {
	
	public Whatineed get(long id);
	
	public List<Whatineed>getAllStuff();
	
	public void addStuff(Whatineed stuff);

	void deleteStuff(long id);
	
	public void put(Whatineed stuff, long id);

}
