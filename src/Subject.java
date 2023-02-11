import java.awt.Color;
import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private Color state ; 
	public Color getState() {return state;}
	
	public void setState(Color state) {
		this.state = state; 
		notifyAllObservers(); 
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
 }
