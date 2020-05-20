package Unidade5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MatrizIdentidade {

	public static void main(String[] args) throws Exception{
		int i=0,j=0;
		int indentidade [][] = new int [3] [3];
		
		//arquivo para guardar as informações da matriz identidade
		FileWriter arq = new FileWriter("Matriz.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
 		
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				if (i!=j)
					indentidade [i] [j] = 0;
				
				else 
					indentidade [i] [j] = 1;
			}
		}
		
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			   gravaarq.print(+indentidade [i][j]);
			 gravaarq.println();  
			
		}
	  
		arq.close();
		gravaarq.close();

	}

}
