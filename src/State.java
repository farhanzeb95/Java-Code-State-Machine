
public interface State {
	void pressStart(Context wrapper);
	void pressDelayed(Context wrapper);
	void startWash(Context wrapper);
	void washingComplete(Context wrapper);

}
