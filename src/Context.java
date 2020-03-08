
public class Context {

	private State currentState;
	
		Context(){
			currentState = new Locking();
		}
		
			public String get_State(){
				return currentState.toString();		
			}
			
			public void set_State(State s){
				currentState = s;
			}
			
			
			public void pressStart(){
				currentState.pressStart(this);
			}
			
			public void pressDelayed(){
				currentState.pressDelayed(this);
			}
			
			public void startWash() {
				this.currentState.startWash(this);
			}
			
			public void washingComplete() {
				this.currentState.washingComplete(this);
			}
}
