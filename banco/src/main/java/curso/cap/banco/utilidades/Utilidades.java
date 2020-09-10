package curso.cap.banco.utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilidades
{
	
	public static String leerConsola() {
		
		String salida= null;
		try(BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in)))
		{
			salida=bufferedReader.readLine();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return salida;
	}
	
}
