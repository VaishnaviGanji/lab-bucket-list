package service;

import java.util.*;

import model.*;

public class MapOperations {
	HashMap<String, TouristPlace> placeMap = new HashMap<String, TouristPlace>();
	public HashMap<String, TouristPlace> add(TouristPlace places) {
		placeMap.put(places.getName(), places);
		return placeMap;
	}
	public Map sortRandomly(HashMap places) {
		return places;
	}
	public Map sortInEntryOrder(HashMap places) {
		return places;
		
	}
	public Map sortAlphabetically(HashMap places) {
		TreeMap<String,TouristPlace> sortedplaces = new TreeMap<String,TouristPlace>(places);
        return sortedplaces;
		
	}
	public Object reset(HashMap places) {
		places.clear();
		return places;
		
	}
	public Map remove(TouristPlace places) {
		placeMap.remove(places.getName());
		return placeMap;
		
	}
}