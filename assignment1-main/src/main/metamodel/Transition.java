package main.metamodel;

public class Transition {
	String event;
	State target;
	OperationType type;
	
	public Transition(String event) {
		this.event=event;
	}
	
	public Object getEvent() {
		// TODO Auto-generated method stub
		return event;
	}

	public State getTarget() {
		// TODO Auto-generated method stub
		return target;
	}

	public void setTarget(State target) {
		this.target = target;
	}
	
	public void setOperation(String op) {
		type = OperationType.valueOf(op);
	}
	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		
		if(type == OperationType.SET) {
			return true;
		}
		return false;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		if(type == OperationType.INCREMENT) {
			return true;
		}
		return false;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		if(type == OperationType.DECREMENT) {
			return true;
		}
		return false;
	}

	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
		return type;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integerk getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return false;
	}

}
