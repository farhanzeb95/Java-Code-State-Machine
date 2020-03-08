
public class Waiting implements State {

	@Override
	public void pressStart(Context wrapper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pressDelayed(Context wrapper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startWash(Context wrapper) {
		// TODO Auto-generated method stub
		wrapper.set_State(new Washing());
		
	}

	@Override
	public void washingComplete(Context wrapper) {
		// TODO Auto-generated method stub
		
	}

}
