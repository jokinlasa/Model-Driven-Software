package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	String name;
	List<Transition> when;

	public State(String name) {
		super();
		this.name = name;
		when = new ArrayList<>();
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public List<Transition> getTransitions() {
		// TODO Auto-generated method stub
		return this.when;
	}
	
	public void addTransition(String transition) {
		when.add(new Transition(transition));
		
	}
	
	public void addTransition(Transition transition) {
		when.add(transition);
		
	}

	public Transition getTransitionByEvent(String string) {
		// TODO Auto-generated method stub
		int i=0;
		while(string!=when.get(i).getEvent()) {
			i++;
			
		}
		Transition trans= when.get(i);

		return trans;
	}

}
