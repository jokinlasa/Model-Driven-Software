package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {

	private Machine machine;
	private State currentState;
	
	public MachineInterpreter(Machine m) {
		this.machine=m;
	}
	public MachineInterpreter() {
		this.machine=new Machine();
	}
	public void run(Machine m) {
		// TODO Auto-generated method stub
		this.machine = m;
		currentState = machine.getInitialState();		
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return machine.getcurrentState();
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		Transition t =machine.getcurrentState().getTransitionByEvent(string);
		currentState=t.getTarget();
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
