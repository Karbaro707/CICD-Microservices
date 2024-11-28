package com.Bancolombia.App.services;

import java.util.List;

import com.Bancolombia.App.entities.Item;

public interface IService {
	boolean insert(Item item);
	List<Item> getAll ();
}
