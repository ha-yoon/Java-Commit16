package generic;

class Box<E> {
	
	private E obj;
	
	public E getObj() {
		return obj;
	}
	
	public void setObj (E Obj) {
		this.obj = obj;
	}
}



public class Ex01 {

	public static void main(String[] args) {
		

		
		Box<String> box = new Box<String>();
		
		box.setObj("안녕하세요");
		String str = box.getObj();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setObj(100);
		int value = box2.getObj();
		System.out.println(value);
	}

}
