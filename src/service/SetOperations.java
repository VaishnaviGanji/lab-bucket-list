package service;

import java.util.*;

import model.TouristPlace;

public class SetOperations{
	HashSet<TouristPlace> placeSet = new HashSet<TouristPlace>();
	public HashSet add(TouristPlace places) {
		placeSet.add(places);
		return placeSet;
	}
	public HashSet remove(TouristPlace place) {
		placeSet.remove(place);
		return placeSet;
	}
	public Object sortByDestination(HashSet places) {
		ArrayList<TouristPlace> list=new ArrayList<TouristPlace>();
		list.sort((TouristPlace place1,TouristPlace place2)->place1.getDestination().compareTo(place2.getDestination()));
		return new LinkedHashSet<TouristPlace>(list);
	}
	public Object sortByRank(HashSet places) {
		ArrayList<TouristPlace> list=new ArrayList<TouristPlace>();
		list.sort((TouristPlace place1,TouristPlace place2)->place1.getRank().compareTo(place2.getRank()));
		return new LinkedHashSet<TouristPlace>(list);
	}
	public Object reset(HashSet places) {
		places.clear();
		return places;
	}
}