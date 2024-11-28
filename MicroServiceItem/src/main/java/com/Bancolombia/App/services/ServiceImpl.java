package com.Bancolombia.App.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancolombia.App.datasource.ItemRepository;
import com.Bancolombia.App.entities.Item;



@Service
public class ServiceImpl implements IService {
	@Autowired
	private ItemRepository repositorio;
	
	

	@Override
	public boolean insert(Item item) {
		return repositorio.insert(item);
	}

	@Override
	public List<Item> getAll() {
		return repositorio.getAll();
	}
	
	
}
