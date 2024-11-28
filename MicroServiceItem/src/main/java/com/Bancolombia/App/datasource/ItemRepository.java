package com.Bancolombia.App.datasource;

import org.springframework.stereotype.Component;

import com.Bancolombia.App.entities.Item;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemRepository {
	private final List<Item> lista=new ArrayList<>();
	
	public boolean insert(Item item) {
		return lista.add(item);
	}
	
		public List<Item> getAll(){
        return lista;
    }
}		