
public class MainColaDinamica 
{
	public static void main(String[] args)
	{
		ColaDinamica colaPersona = new ColaDinamica();
        ColaDinamica colaCarrito = new ColaDinamica();
        ColaDinamica colaSuper = new ColaDinamica();
        ColaDinamica colaCaja1 = new ColaDinamica();
        ColaDinamica colaCaja2 = new ColaDinamica();
        ColaDinamica colaCaja3 = new ColaDinamica();
		
		colaPersona.Inicializar();
        colaCarrito.Inicializar();
     

        //lleno el arreglo de personas con numeros consecutivos 
        //tamaño del arreglo aleatorio entre 5 y 50
        // los guardo en la cola colaPersona
        int tam = (int) (Math.random() * 46 + 5);
        int[] personas = new int[tam];
        for (int i = 0; i < tam; i++) {
            personas[i] = i + 1;
            colaPersona.Acolar(personas[i]);
        }
        System.out.println("Personas en la cola: ");
		MostrarCola(colaPersona);

        //lleno el arreglo de carritos con numeros de 1 - 25 y que cada numero este acompañado de una letra c al inicio
        //tamaño del arreglo 25
        // los guardo en la cola colaCarrito

        colaSuper.Inicializar();
        int[] carritos = new int[25];
        for (int i = 0; i < 25; i++) {
            carritos[i] = i + 1;
            colaCarrito.Acolar(carritos[i]);
        }
        System.out.println("Carritos en la cola: ");
        MostrarCola(colaCarrito);


        // //lleno el la cola colaSuper con los datos de las personas y los carritos
        // //solo se agregan personas y carritos si hay carritos disponibles 
        // //los guardo en la cola colaSuper
        // //filtro los numeros repetidos y se sacan de la cola colaSuper

        // int i = 0;
        // while (!colaPersona.ColaVacia() && !colaCarrito.ColaVacia()) {
        //     colaSuper.Acolar(colaPersona.Primero());
        //     colaSuper.Acolar(colaCarrito.Primero());
        //     colaPersona.Desacolar();
        //     colaCarrito.Desacolar();

        //     //quito los numeros repetidos de la cola colaSuper
        //     int j = 0;
        //     while (j < colaSuper.Tamanio()) {
        //         int dato = colaSuper.Primero();
        //         colaSuper.Desacolar();
        //         if (dato != colaSuper.Primero()) {
        //             colaSuper.Acolar(dato);
        //         }
        //         j++;
        //     }
        // }
        // System.out.println("Personas y carritos en la cola: ");
        // MostrarCola(colaSuper);   

        //lleno el arreglo supermercado con los datos de las personas y los carritos
        //solo se agregan personas y carritos si hay carritos disponibles
        //imptimo el arreglo supermercado

        int[] supermercado = new int[100];
        int i = 0;
        while (!colaPersona.ColaVacia() && !colaCarrito.ColaVacia()) {
            supermercado[i] = colaPersona.Primero();
            supermercado[i + 1] = colaCarrito.Primero();
            colaPersona.Desacolar();
            colaCarrito.Desacolar();
            i += 2;
        }
        System.out.println("Personas y carritos en el supermercado: ");
        //imprimo el arreglo supermercado
        for (int j = 0; j < supermercado.length; j++) {
            if (supermercado[j] != 0) {
                System.out.print(supermercado[j] + " ");
            }
        }
        System.out.println();

        //corrigo el arreglo supermercado
        // quito los numeros repetidosdel arreglo
        //imprimo el arreglo supermercado

        int j = 0;
        while (j < supermercado.length) {
            int dato = supermercado[j];
            if (dato != 0) {
                for (int k = j + 1; k < supermercado.length; k++) {
                    if (dato == supermercado[k]) {
                        supermercado[k] = 0;
                    }
                }
            }
            j++;
        }
        System.out.println("Personas y carritos en el supermercado corregido: ");
        //imprimo el arreglo supermercado
        for (int k = 0; k < supermercado.length; k++) {
            if (supermercado[k] != 0) {
                System.out.print(supermercado[k] + " ");
            }
        }
        System.out.println();

        //lleno la cola colaSuper con los datos del arreglo supermercado
        //imprimo la cola colaSuper

        for (int k = 0; k < supermercado.length; k++) {
            if (supermercado[k] != 0) {
                colaSuper.Acolar(supermercado[k]);
            }
        }
        System.out.println("Personas y carritos en la cola: ");
        MostrarCola(colaSuper);



       
      

     

        ColaDinamica colaFila = new ColaDinamica();
        colaFila.Inicializar();

        //lleno el arreglo fila con numeros sin repetir de la colaSuper

       

       

        
        System.out.println("Fila ");
        MostrarCola(colaFila);

        //
       

        //elimino los numeros repetidos de la cola colaSuper



        colaCaja1.Inicializar();
        colaCaja2.Inicializar();
        colaCaja3.Inicializar();


        //lleno las colas de las cajas con los datos de la cola colaSuper de forma equitativa
        //las guardo en la caja 1, 2 y 3
        //imprimo las colas de las cajas

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        while (!colaSuper.ColaVacia()) {
            if (caja1 <= caja2 && caja1 <= caja3) {
                colaCaja1.Acolar(colaSuper.Primero());
                caja1++;
            } else if (caja2 <= caja1 && caja2 <= caja3) {
                colaCaja2.Acolar(colaSuper.Primero());
                caja2++;
            } else if (caja3 <= caja1 && caja3 <= caja2) {
                colaCaja3.Acolar(colaSuper.Primero());
                caja3++;
            }
            colaSuper.Desacolar();
        }

        System.out.println("Fila de espera ");
        MostrarCola(colaPersona);
        System.out.println("Carritos Disponibles ");
        MostrarCola(colaCarrito);
        //muestro las colas de las cajas
        System.out.println("Caja 1: ");
        MostrarCola(colaCaja1);
        System.out.println("Caja 2: ");
        MostrarCola(colaCaja2);
        System.out.println("Caja 3: ");
        MostrarCola(colaCaja3);






        
        // System.out.println("Personas y carritos en la cola: ");
        // MostrarCola(colaSuper);

        // System.out.println("Personas en fila ");
        // MostrarCola(colaPersona);
        // System.out.println("Carritos en fila ");
        // MostrarCola(colaCarrito);



	}
	
	public static void PasarCola(ColaDinamica origen, ColaDinamica destino)
	{
		while (!origen.ColaVacia())
		{
			destino.Acolar(origen.Primero());
			origen.Desacolar();
		}
	}
	
	public static void CopiarCola(ColaDinamica origen, ColaDinamica destino)
	{
		ColaDinamica auxCola = new ColaDinamica();
		auxCola.Inicializar();
		
		PasarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			destino.Acolar(auxCola.Primero());
			origen.Acolar(auxCola.Primero());
			auxCola.Desacolar();
		}
	}
	
	public static void MostrarCola(ColaDinamica origen)
	{
		ColaDinamica auxCola = new ColaDinamica();
		auxCola.Inicializar();
		
		CopiarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			System.out.print(auxCola.Primero() + ", ");
			auxCola.Desacolar();
		}
		
		System.out.println();
	}
}