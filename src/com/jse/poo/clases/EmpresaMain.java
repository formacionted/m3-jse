package com.jse.poo.clases;

public class EmpresaMain {

	public static void main(String[] args) {

		/*
		 *  * Crear objetos de tipo Empresa haciendo uso del constructor y otros dando
 * 	valor directamente a sus propiedades
		 */
		Empresa empresa1 = new Empresa();
		empresa1.nombreLegal = "DESARROLLOS COSMICOS S.L.";
		empresa1.cif = "B56HJ34F7GHS";
		empresa1.costeAnual = 5000;
		empresa1.facturacionAnual = 10000;
		empresa1.fecha = 2019;
		empresa1.numEmpleados = 3;
		empresa1.numProductos = 2;

		System.out.println(empresa1);
		
		Empresa empresa2 = new Empresa("JUANITO Y COMPAÑIA S.L.", "BHG34DF67J", 2019, 30, 20, 500000, 100000); 
		System.out.println(empresa2);

		// Crear objetos de tipo Empresa2 haciendo uso de constructor y haciendo uso de metodos setter
		
		
		Empresa2 rintintinCompany = new Empresa2();
		rintintinCompany.setCif("DFFB5YRHR65Y");
		rintintinCompany.setCosteAnual(360000);
		rintintinCompany.setFacturacionAnual(500000);
		rintintinCompany.setFecha(2019);
		rintintinCompany.setNombreLegal("RINTINTIN S.L.");
		rintintinCompany.setNumEmpleados(45);
		rintintinCompany.setNumProductos(600);
		System.out.println(rintintinCompany);


		
	}

}
