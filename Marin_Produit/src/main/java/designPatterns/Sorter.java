package designPatterns;

import java.util.ArrayList;

public class Sorter {
	
	private SortingStrategy strategy;
	
	public Sorter(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void changeSortingStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void trier (ArrayList<Resultat> result) {
		strategy.trier(result);
	}

}
