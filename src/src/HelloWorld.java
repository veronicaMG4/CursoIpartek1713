import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;

public class HelloWorld {

	public static void main(String[] args) throws PerroException {
		// TODO Auto-generated method stub
		String nombre = "Ander";
		System.out.println("HelloWorld " + nombre);

		Person p1 = new Person();
		p1.setNombre("manuel");

		System.out.println(p1.saludar());
		System.out.println(p1.getNombre());
		
		Perro chucho1=new Perro();
		chucho1.setNombre("lagun");
		chucho1.setEdad(10);
		chucho1.setRaza("pastor aleman");
		chucho1.setVacunado(true);
		
		System.out.println(chucho1.toString());

		
		Perro chucho2=new Perro();
		chucho2.setNombre("laika");
		chucho2.setEdad(8);
		chucho2.setRaza("pomerania");
		chucho2.setVacunado(false);
		
		System.out.println(chucho2.toString());
		
		PerroPresa buba= new PerroPresa();
		buba.setNombre(nombre);
	}

}
