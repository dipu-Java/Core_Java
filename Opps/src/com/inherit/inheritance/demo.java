package com.inherit.inheritance;
class washer{
	void wash(Object obj) {
		if(obj instanceof wa)		
		System.out.println(obj.getClass().getSimpleName()+ " wash");
	}
}
interface wa{
}
class truck implements wa{
}
class car implements wa{
}
class mobile{
}
public class demo {

	public static void main(String[] args) {
          washer w=new washer();
          w.wash(new truck());
	}

}
