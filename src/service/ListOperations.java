package service;

import java.util.*;
import model.*;

public class ListOperations {
	ArrayList<TouristPlace> bucketList = new ArrayList<TouristPlace>();
	public ArrayList<TouristPlace> add(TouristPlace places) {
		bucketList.add(places);
		return bucketList;
	}
	public List<TouristPlace> remove(TouristPlace places) {
		bucketList.remove(places);
		return bucketList;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(TouristPlace place1,TouristPlace place2) -> place1.getDestination().compareTo(place2.getDestination()));
		return places;
	}
	public Object sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(TouristPlace place1,TouristPlace place2) -> place1.getRank().compareTo(place2.getRank()));
		return places;
	}
	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}