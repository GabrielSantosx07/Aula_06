package entidade;

import entidade.Funcionario;
import entidade.Cargo;


public class pj extends Funcionario {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub


		private double adicional;

		public pj(String nome, double salario, Cargo cargo, double adicional) {
			super(nome, salario, cargo);
			this.adicional = adicional;
		}

		public double receber() {

			return super.receber(salario + adicional);

		}



}

