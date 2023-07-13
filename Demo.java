abstract class phone{
	public abstract void brand();
	public void Model(){
		System.out.println("S12");
	}
}


class Samsung extends phone{
	public void brand(){
		System.out.println("Samsung");
	}
}





public class Demo{
	public static void main(String[] args) {
		
		phone p = new Samsung();
		p.brand();
		p.Model();



	}

}