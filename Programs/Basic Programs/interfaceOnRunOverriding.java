interface demo {
	void f1();
}


public class interfaceOnRunOverriding {
	public static void main(String[] args){
		funTakesInterface(new demo(){
			@Override
			public void f1(){
				System.out.println("Hey man");
			}
		});
	}

	public static void funTakesInterface(demo d){
		d.f1();
	}
}