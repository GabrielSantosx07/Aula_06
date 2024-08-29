package principal;

import entidade.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		
		Pessoa v = new Pessoa("Duda", 10,10);
		
		System.out.println(v);
			
		}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	
		
	}
}

