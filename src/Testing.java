
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context contextObj = new Context();
		System.out.println(contextObj.get_State().toString());
		contextObj.pressDelayed();
		System.out.println(contextObj.get_State().toString());
		contextObj.pressStart();
		System.out.println(contextObj.get_State().toString());
		contextObj.startWash();
		System.out.println(contextObj.get_State().toString());
		contextObj.washingComplete();
		System.out.println(contextObj.get_State().toString());
	}

}
