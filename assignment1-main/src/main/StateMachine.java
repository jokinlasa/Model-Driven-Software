package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Integerk;
import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private List<State> states;
	private State current;
	private State initial;
	private String currentEvent;
	private Integerk myInt;

	public Machine build() {
		// TODO Auto-generated method stub
		return new Machine(states, initial,myInt);
	}

	public StateMachine state(String string) {
		// TODO Auto-generated method stub
		State nuevo = new State(string);
		states.add(nuevo);
		return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		initial=current;
		return this;
	}

	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		current.addTransition(string);
		return this;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		Transition t =current.getTransitionByEvent(string);
		t.setTarget(new State(string));
		current.addTransition(t);
		return this;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		this.myInt= new Integerk(string,0);
		
		return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		myInt.setValue(i);
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		Transition t =current.getTransitionByEvent(string);
		t.setOperation(string);
		current.addTransition(t);
		
		int value = myInt.getValue();
		myInt.setValue(value++);
				
		return this;
	}

	public StateMachine decrement(String string) {
		Transition t =current.getTransitionByEvent(string);
		t.setOperation(string);
		current.addTransition(t);
				
		int value = myInt.getValue();
		myInt.setValue(value++);
		
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
