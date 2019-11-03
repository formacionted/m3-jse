package com.jse.sintaxis;

/**
 * Clase para probar la sintaxis general
 * @author alan.sastre
 *	@see app.SintaxisControl2
 *	@since 1.0
 */
public class EjerciciosSintaxis2 {



	private static final double IMPUESTO_1 = 0.25;
	private static final double IMPUESTO_2 = 0.22;
	private static final double MATRIX_X = 5;
	private static final double MATRIX_Y = 100;

	public static void main(String[] args) {
		
		
		/*1 - 
		 * Crear un array de long con 5 números
		 * Iterar el array y sumar en una variable los números pares y en
		 * otra variable los números impares
		 * Imprimir ambas variables
		 * */

		long[] numeros = new long[]{1,4,33,50,40};
		long sumaPares = 0;
		long sumaImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				sumaPares = sumaPares + numeros[i];
			} else {
				sumaImpares = sumaImpares + numeros[i];
			}
		}

			System.out.println("La suma de todos los pares es: " + sumaPares);
			System.out.println("La suma de todos los impares es: " +sumaImpares);
		/*
		 * 2 - 
		 * Crear una constante que almacene un impuesto del 25%
		 * Crear otra constante que almacene un impuesto del 22%
		 * Crear una variable con un precio cualquier
		 * Crear una variable que almacene el precio mas los dos impuestos aplicados a ese precio
		 * */
			double precio = 76.55;
			double impuesto1 = precio * IMPUESTO_1;
			double impuesto2 = precio * IMPUESTO_2;
			double precioFinal = precio + impuesto1 + impuesto2;
			System.out.println("El precio final con impuestos es: " + precioFinal);


		/* 3 - 
		 * Crear un array que almacene 5 nombres de Coches
		 * Imprimir los nombres utilizando un bucle foreach
		 * */
			String[] coches = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"};
			for (String coche : coches) {
				System.out.println(coche);
			}

			
		/* 4 - Crear una clase con main que lea 5 nombres de Coches utilizando Scanner y metodo nextLine
		 * Imprimir los nombres utilizando un bucle while */
		
		/* 5 - Crear una clase con main que lea 5 nombres de Coches utilizando Scanner y metodo next
		 * Imprimir los nombres utilizando un bucle while */
		
		/* 6 -
		 *  Crear  2 arrays de 4 enteros cada uno, con valores cualesquiera
		 *  Crear 1 array de int con longitud 4 pero sin añadir valores
		 * Iterar con for y los dos primeros arrays y 
		 * sumar los elementos que están en la misma posición
		 * almacenando la suma en la posición del tercer array
		 * */
		int[] valores1 = {1 ,5 ,7, 9};
		int[] valores2 = {2 ,4 ,2, 4};
		int[] resultadoValores = new int[4];
		for (int i = 0; i < 4; i++) {
			resultadoValores[i] = valores1[i] + valores2[i];
			System.out.println(resultadoValores[i]);
		}

			
		/*
		 * 7 - Crear un array con 5 nombres que el tercero de ellos sea "BMW"
		 *  Hacer un for imprimiendo los nombres y con la condición de que cuando el nombre sea
		 *   "BMW" haremos un continue
		 * 
		 * */
		String[] cochesContinue = {"Volvo", "Mercedes", "BMW", "Carro", "triciclo"};
		for (int i = 0; i < 5; i++) {
			if (cochesContinue[i] == "BMW") {
				continue;
			}
			System.out.println(cochesContinue[i] );
		}
		
		
		
		/* 8 - Añadir Javadoc a la clase actual y al método main actual y 
		 * Generar la documentación Javadoc desde eclipse en el escritorio*/
		
		
		
		/* 9 - Crear un método que reciba un precio por parámetro y que 
		 * devuelve ese precio con el IVA aplicado.*/
		imprimirHola(); //imprime Hola
		imprimirAdios(); // imprime Adios
		imprimirNombre("Alan"); // Imprime un nombre pasado por parametro  ("Alan")
		
		double precioConIva = obtenerPrecioIva(100.00); //Obtiene un precio pasado por parametro con IVA y lo...
		System.out.println(precioConIva);
		// equivalente al anterior
		System.out.println(obtenerPrecioIva(100.00)); // Obtiene el precio con iva y lo imprime por consola
		
		/* 10 - Crear dos arrays de string de longitud 4, el primero con nombres
		 * y el segundo con apellidos
		 * Crear un bucle for que imprima el nombre y apellido de la misma posición
		 * concatenados con un espacio*/
			
			String[] nombres = {"Alan", "Miguel", "David", "Carlos"};
			String[] apellidos = {"Sastre", "Alba", "Álvarez", "Otero"};
			for (int i = 0; i < 4; i++) {
				String nombreApellido = nombres[i] + " " + apellidos[i];
				System.out.println(nombreApellido);
			}
		
		
		
		
			/* 11 - Generar un número aleatorio de 0 a 400 haciendo uso de la clase Math*/
			System.out.println(Math.random()*400);

		
		

		
			/*
			 * 12 - crear un array de 2 dimensiones que sea de double y de longitudes 5 y 10
			 * e inicializar todas las posiciones de la primera dimensión con numeros aleatorios 
			 * de 0 a 5
			 *  Corrección: Inicializar todos los de la posicion 0 de la primera dimension
			 * inicializar todas las posiciones de la segunda dimensión con numeros aleatorios 
			 * de 0 a 100
			 * */
			
			double[][] array2d = new double[5][10];
			for (int i = 0; i < array2d.length; i++) {
				for (int j = 0; j < array2d.length; j++) {
					if (i == 0) {
						array2d[i][j] = Math.random()*MATRIX_X;
					}else {
						array2d[i][j] = Math.random()*MATRIX_Y;
					}
					System.out.println(" pruebaMatriz[" + i + "][" + j + "]=" + array2d[i][j]);
				}
				System.out.println("===========");
			}
			
	
			
			
			
			/*13 - 
			 * Crear una clase ArrayUtil.java sin main
			 * Crear dentro un metodo publico, es decir, accesible para el resto de clases
			 * Ese metodo recibe un array de int y un numero int
			 * El metodo devuelve boolean
			 * Dentro se verifica si el array contiene ese numero y devuelve true si está 
			 * o false si no está
			 * 
			 * Crear un método que reciba dos parametros, el primero un array de int
			 * el segundo un número int
			 * el método debe verificar si el array contiene ese número int
			 * devuelve true si está o false si no está
			 * 
			 * Llamar desde aquí al método 2 veces, una con un array que sí contenga un numero
			 * y otra que no lo contenga y verificar que efectivamente devuelve true o false
			 * cuando corresponde.
			 * */
			// creamos el array de enteros
			int[] enteros = {5, 6, 7, 8 ,9};
			// creamos el entero a comprobar
			int numero = 6;
			// Llamar a metodo que comprueba si el array contiene el entero
			boolean resultExist = ArrayUtil.arrayContains(enteros, numero);
			// Imprimir resultado
			System.out.println(resultExist);
			
			
			/* 14 - Crear una clase con metodo main
			 * Leer de la consola un numero entero
			 * Crear un bucle for que sume todos los numeros pares desde 1 incluido
			 * hasta el numero leido
			 */
			
			
			
			
			
			
			/*15 - 
			 * Crear un array de 10 enteros, repitiendo alguno de ellos
			 * Crear una variable con un entero que sepamos que está repetido en el array
			 * 
			 *  Crear un metodo que reciba por parametros ese array y el entero y 
			 *  devuelva cuantas veces está repetido el entero dentro del array
			 *  
			 *  Imprimir cuantas veces está repetido*/
			
			int[] enteros10 = {5, 6, 9, 8 ,9, 5, 6, 7, 8 ,9};
			int numToCheck = 9;
			int resultRepeated = ArrayUtil.checkRepeated(enteros10, numToCheck);
			System.out.println(resultRepeated);
	}


	private static double obtenerPrecioIva(double precio) {
		System.out.println("Calculando IVA");
		 double resultado =  precio + (precio * 0.21);
		 System.out.println("Calculo IVA finalizado");
		 return resultado;
	}

	private static void imprimirNombre(String nombre) {
		System.out.println("Hola " + nombre);
	}

	private static void imprimirAdios() {
System.out.println("adios");		
	}

	/**
	 * Método que imprime la palabra "Hola"
	 */
	private static void imprimirHola() {
		System.out.println("Hola");
	}




}
