package JavaSessions;

import JavaSessions.Inner.inner2;
import JavaSessions.Inner.inner3;

public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inner i = new Inner();
		i.m1();
		
		inner2 i1 = i.new inner2();
		i1.m2();
		
		inner3 i3 = i.new inner3();

	}

}
