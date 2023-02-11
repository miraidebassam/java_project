package Observer;

import java.awt.*;
import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void notifyAllObservers(double result) {
		for (Observer observer : observers) {
			System.out.println("ok");
			observer.update(result);
		}
	}
 }
