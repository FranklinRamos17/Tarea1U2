package repetitivas1;
import java.io.*;
import java.util.Scanner;

public class repetitivas1 {
    static  Scanner lt=new Scanner(System.in);
    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void ejercicio41JQR() {
        double i;
		double SI;
		double SR;
		double año;
		for (i=1;i<=6;i++) {
			System.out.println(+i);
			SI = 1500;
			año = i;
			SR = SI*Math.pow((1.1),(año));
			System.out.println("Salario inicial: "+SI);
			System.out.println("Salario del año: "+SR);
			System.out.println("año: "+año);
		
        }
    }
    public static void ejercicio42JQR(){

		int hamburguesa;
		int n;
		int tarjeta;
		double total=0;
		double x;
		System.out.print("Cuantas hamburguesas desea comprar: ");
		n = lt.nextInt();
		for (x=1;x<=n;x++) {
			System.out.println("Seleccione el numero del tipo de hamburguesa: ");
			System.out.println("  1.- S sencilla s/. 10");
			System.out.println("  2.- D doble s/.12");
			System.out.println("  3.- T triples s/.14 ");
			hamburguesa = lt.nextInt();
			switch (hamburguesa) {
			case 1:
				total = total+10;
				break;
			case 2:
				total = total+12;
				break;
			case 3:
				total = total+14;
				break;
			default:
			}
		}
		System.out.println("Elige el tipo de pago:");
		System.out.println("    1.- Efectivo");
		System.out.println("    2.- Tarjeta de credito");
		tarjeta = lt.nextInt();
		switch (tarjeta) {
		case 1:
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
		case 2:
			total = total+(total*.05);
			System.out.println("El total a pagar es de: "+total+" soles");
			break;
		default:
        }
    }
    public static void ejercicio43JQR() {
    int cantNumMayorcero=0, cantNumMenorIgualCero=0;
    double numN=0;
    String continuar="S";
    while (continuar.equals("S")) {
        System.out.println("Ingrese un numero:");
        numN=lt.nextDouble();
        if (numN<=0) {
            cantNumMenorIgualCero++;
        }else{
            cantNumMayorcero++;
        }
        System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
        continuar=lt.next().toUpperCase().equals("S")?"S":"N";
    }  
    System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
    System.out.println("Cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
    System.out.println("Total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));
 }
    public static void ejercicio44JQR() {
        int cantfocoV=0, cantfocoB=0, cantfocoR=0;
        String colorF="";
        String continuar="S";
        
        while (continuar.equals("S")) {
            System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR-Rojo");
            colorF=lt.next().toUpperCase();
            if (colorF.charAt(0)=='V') {
                cantfocoV++;
            }else if (colorF.charAt(0)=='B') {
                cantfocoB++;
            } else if (colorF.charAt(0)=='R') {
                cantfocoR++;
            }else{
                System.err.println("No es correcto el color de foco");
            }

            System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("La cantidad de focos de color Verde es: "+cantfocoV);
        System.out.println("La cantidad de focos de color Blanco es:" +cantfocoB);
        System.out.println("La cantidad de focos de color Rojo es: "+cantfocoR);
        System.out.println("La cantidad Total de focos son: "+(cantfocoV+cantfocoB+cantfocoR));
    }
    public static void ejercicio47JQR() {
        int i, n;
        double costo, descuento, pago_por_todo, precio;
        pago_por_todo = 0;
        System.out.print("Ingresa el valor del articulo: ");
        n = lt.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print(+ i);
            System.out.print("Ingresa el  precio: ");
            precio = lt.nextDouble();
            descuento=precio*0.1;
            if(precio>=200)
                descuento=precio*0.15;
            if(precio>100&&precio<200)
                descuento=precio*0.12;
            costo=precio-descuento;
            pago_por_todo=pago_por_todo+costo;
            System.out.println("costo: " + costo);
            System.out.println("descuento: " + descuento);
            System.out.println();
        }
        System.out.println("total a pagar: " + pago_por_todo);
    }
    public static void ejercicio48JQR() {
        int i, n;
        double enero, febrero, marzo, abril, mayo;
        double junio, julio, agosto, septiembre, octubre;
        double noviembre, diciembre, intereses, inversion_final, total;
        total = 0;
        System.out.print(" Ingrese los años que invirtio: ");
        n = lt.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print(+ i);
            System.out.print(" Ingresa el valor de cantidad enero: ");
            enero = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad febrero: ");
            febrero = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad marzo: ");
            marzo = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad abril: ");
            abril = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad mayo: ");
            mayo = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad junio: ");
            junio = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad julio: ");
            julio = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad agosto: ");
            agosto = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad septiembre: ");
            septiembre = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad octubre: ");
            octubre = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad noviembre: ");
            noviembre = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad diciembre: ");
            diciembre = lt.nextDouble();
            intereses=total*0.1;
            total=total+intereses+enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre;
            inversion_final=total;
            System.out.println("intereses: " + intereses);
            System.out.println("inversion final: " + inversion_final);
            System.out.println();
        }
        System.out.println("Inversion total: " + total);
}
    public static void ejercicio49JQR()  {
        int alumnos=0;
		int edad;
		int n;
		int salones;
		int suma;
		int total=0;
		int x;
		System.out.println("Ingresa el total de salones");
		salones = lt.nextInt();
		while (salones>0) {
			System.out.println("Ingresa el numero de alumnos");
			n = lt.nextInt();
			suma = 0;
			for (x=1;x<=n;x++) {
				System.out.println("Ingresa la edad "+x);
				edad = lt.nextInt();
				suma = suma+edad;
			}
			System.out.println("El promedio del salon "+salones+" es: "+suma/n+" añoss");
			alumnos = alumnos+n;
			total = total+suma;
			salones = salones-1;
		}
		System.out.println("El promedio de toda la escuela es: "+total/alumnos+" años");
    }
    public static void ejercicio411JQR() {
        int B200, B100, B50, B20, B10;
        int Md1, Md050, Md2, Md5; 
        double total;
        System.out.print("Ingresa cantidad de billetes de 200: ");
        B200 = lt.nextInt();
        System.out.print("Ingresa cantidad de billetes de 100: ");
        B100 = lt.nextInt();
        System.out.print("Ingresa cantidad de billetes de 50: ");
        B50 = lt.nextInt();
        System.out.print("Ingresa cantidad de billetes de 20: ");
        B20 = lt.nextInt();
        System.out.print("Ingresa cantidad de billetes de 10: ");
        B10 = lt.nextInt();
        System.out.print("Ingresa cantidad de monedas de 5: ");
        Md5 = lt.nextInt();
        System.out.print("Ingresa cantidad de monedas de 2: ");
        Md2 = lt.nextInt();
        System.out.print("Ingresa cantidad de monedas de 1: ");
        Md1 = lt.nextInt();
        System.out.print("Ingresa cantidad de monedas de 0.50: ");
        Md050 = lt.nextInt();
        
        total=B200*200+B100*100+B50*50+B20*20+B10*10+Md5*5+Md2*2+Md1*1+Md050*0.50;
        System.out.println("Valor de total: " + total);
    }
    public static void ejercicio412JQR() {
        int i, n, v10000, v20000;
        double montototal, monto10000, monto20000, venta;
        v10000 = 0;
        v20000 = 0;
        monto10000 = 0;
        monto20000 = 0;
        montototal = 0;
        System.out.print("Ingresa el valor de n: ");
        n = lt.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print(+ i);
            System.out.print("Ingresa el valor de venta: ");
            venta = lt.nextDouble();
            
            if(venta<=10000)
            {
                v10000=v10000+1;
                monto10000=monto10000+venta;
            }
            if(venta>10000&&venta<=20000)
            {
                v20000=v20000+1;
                monto20000=monto20000+venta;
            }
            montototal=montototal+venta;
            System.out.println();
        }
        System.out.println(" Monto de ventas de 0 a 10000: " + v10000);
        System.out.println(" Monto de ventas de 10000 a 20000: " + v20000);
        System.out.println(" Monto ventas de 0 a 10000: " + monto10000);
        System.out.println(" Monto ventas de 10000 a 20000: " + monto20000);
        System.out.println(" Monto total: " + montototal);
    }
    public static void ejercicio414JQR() {
        int i, n;
        double descuento, HrsTrabajo, sueldoxhora, sueldoxsemana;
        String nombretrabajador;
        System.out.print("Ingresa el valor de numero de trabajadores: ");
        n = lt.nextInt();
        
        for (i=1; i<=n; i++) {
            System.out.print(+ i);
            System.out.print("Ingresa el nombre del trabajador: ");
            nombretrabajador = lt.nextLine();
            System.out.print("Ingresa las horas trabajadas: ");
            HrsTrabajo = lt.nextDouble();
            System.out.print("Ingresa el sueldo por hora: ");
            sueldoxhora = lt.nextDouble();
            sueldoxsemana=HrsTrabajo*sueldoxhora;
            descuento=0;
            if(sueldoxsemana>0&&sueldoxsemana<=150)
                descuento=sueldoxsemana*0.05;
            if(sueldoxsemana>150&&sueldoxsemana<=300)
                descuento=sueldoxsemana*0.07;
            if(sueldoxsemana>300&&sueldoxsemana<=450)
                descuento=sueldoxsemana*0.09;
            sueldoxsemana=sueldoxsemana-descuento;
            System.out.println("Nombre del trabajador: " + nombretrabajador);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println("Valor de sueldo semanal: " + sueldoxsemana);
            System.out.println("");
        }
    }
    public static void ejercicio417JQR() {
        double P, ahorros, i;
        int n;
        n=2022-1961;
        P=1500.0;
        i=0.15;
        ahorros=P*Math.pow(1+i,n);
        System.out.println("Dinero colocado al banco: " + P);
        System.out.println("Su inversion ahora vale: " + ahorros);
        System.out.println("Paga: " + i+"% anual");
        System.out.println(+ n+" Años invertidos: " );
    }
    public static void ejercicio422JQR() {
        int i = 0;
    
        while(i <= 100) {
          System.out.println(i);
          i+=5;
        }
    }
    public static void ejercicio423JQR() {
        for(int i = 320; i >= 160; i-=20) {
            System.out.println(i);
        }
    }
    public static void ejercicio426JQR() {
        System.out.print("Introduzca un número: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
        System.out.println("   n  |  cuadrado  |  cubo");
    
        System.out.println(" ____________________________ ");
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
          System.out.printf("%5d |%7d |%8d\n", i, i * i, i * i * i);
        }
    }
    public static void main(String[] args) {
       case 1: ejercicio426JQR(); break;
       
    }
    
}