package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	
	Integerk myInt;
	State initialState;
	State currentState;
	List<State> allstates;
	
	public Machine(Integerk myInt, State initialState, State currentState, List<State> allstates) {
		this.myInt = myInt;
		this.initialState = initialState;
		this.currentState = initialState;
		this.allstates = allstates;
	}
	
	public Machine(List<State> allStates,State initial, Integerk myint) {
		this.allstates= new ArrayList<>();
		this.initialState=initial;
		this.myInt=myInt;
		
	}
	public Machine() {

	}

	public List<State> getStates() {
		// TODO Auto-generated method stub
		
		return allstates;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}

	public State getcurrentState() {
		return currentState;
	}
	public State getState(String string) {
		// TODO Auto-generated method stub
		return currentState;
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return myInt.getValue();
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return true;
	}

}
