package Unidade4;

public class PopulacaoAB {

	public static void main(String[] args) {
		double hab_a=5000000,hab_b=7000000;
		int cont=0;
		
		
		while (hab_b>hab_a)
		{
			hab_a=(hab_a+(hab_a*0.03));
			hab_b=(hab_b+(hab_b*0.02));
			cont++;
		}
		
		System.out.println("Ser�o necess�rios "+cont+" anos para que a popula��o de A se torne maior que a de B");
		
		
		
		
		
		

	}

}
