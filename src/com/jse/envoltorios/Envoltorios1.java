package com.jse.envoltorios;

/**
 * Si queremos tratar los tipos primitivos como objetos, necesitaremos crearlos como tal
 * Para ello existen las clases envoltorio. Ver tabla:
 * 
 * Tipo primitivo 	Clase envoltorio
		boolean 	Boolean
		byte 	Byte
		char 	Character
		short 	Short
		int 	Integer
		long 	Long
		float 	Float
		double 	Double
		
	Cuando podriamo necesitar envoltorios? Por ejemplo cuando trabajamos con colecciones
	como por ejemplo ArrayList donde la coleccion solo permite trabajar con objetos.
	
	Tambien cuando queremos que puedan ser null. 
 */
public class Envoltorios1 {

	public static void main(String[] args) {

		/*
		 * https://www.w3schools.com/java/java_wrapper_classes.asp
		 */
		
		// Autoboxing - Asignacion directa del tipo primitivo a clase envoltorio
	    Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
        Long myLong = 5l;
        Boolean myBoolean = true;
        Short myShort = 5;
        Float myFloat = 4f;
        Byte myByte = 100;
        
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	    System.out.println(myLong);
	    System.out.println(myBoolean);
	    System.out.println(myShort);
	    System.out.println(myFloat);
	    System.out.println(myByte);
	    
	    System.out.println("==========================");
	    
	    int ejemploInt = 4;
        Integer envoltorioInteger = Integer.valueOf(ejemploInt);
        
        short ejemploShort = 5;
        Short envoltorioShort = Short.valueOf(ejemploShort);
        
        long ejemploLong = 5l;
        Long envoltorioLong = Long.valueOf(ejemploLong);
        
        byte ejemploByte = 100;
        Byte envoltorioByte = Byte.valueOf(ejemploByte);
        
        double ejemploDouble = 5.99;
        Double envoltorioDouble = Double.valueOf(ejemploDouble);
        
        float ejemploFloat = 5f;
        Float envoltorioFloat = Float.valueOf(ejemploFloat);
        
        char ejemploChar = 'c';
        Character envoltorioChar = Character.valueOf(ejemploChar);
        
        boolean check1 = true, check2 = false;
        Boolean envoltorioBoolean1 = Boolean.valueOf(check1);
        Boolean envoltorioBoolean2 = Boolean.valueOf(check2);
        
        System.out.println(envoltorioInteger);
        System.out.println(envoltorioShort);
        System.out.println(envoltorioLong);
        System.out.println(envoltorioByte);
        System.out.println(envoltorioDouble);
        System.out.println(envoltorioFloat);
        System.out.println(envoltorioChar);
        System.out.println(envoltorioBoolean1);
        System.out.println(envoltorioBoolean2);

	    System.out.println("==========================");

		/*
		 * Unboxing - Convertir de envoltorio a tipo primitivo
		 * byteValue(), shortValue(), intValue(), longValue(), floatValue(), doubleValue()
		 */
		int entero1 = envoltorioInteger.intValue();
       short short1 = envoltorioShort.shortValue();
       long long1 = envoltorioLong.longValue();
       byte byte1 = envoltorioByte.byteValue();
       double double1 = envoltorioDouble.doubleValue();
       float float1 = envoltorioFloat.floatValue();
       char char1 = envoltorioChar.charValue();
       boolean boolean1 = envoltorioBoolean1.booleanValue();
       
        System.out.println(entero1);
        System.out.println(short1);
        System.out.println(long1);
        System.out.println(byte1);
        System.out.println(double1);
        System.out.println(float1);
        System.out.println(char1);
        System.out.println(boolean1);
        
        
		/*
		 * Convertir a String
		 */
        Integer integer1 = 100;
        String myString = integer1.toString();
        System.out.println(myString.length());
		

		
	}

}
