package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable<T>> implements IArregloDinamico<T> {
		/**
		 * Capacidad maxima del arreglo
		 */
        private Integer tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private Integer tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private Integer elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( Integer max )
        {
               elementos = new Integer [max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( Integer dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    Integer[ ] copia = elementos;
                    elementos = new Integer[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		public Integer darElemento(Integer i) {
			Integer elemento=null;
			for(i=0;i<elementos.length;i++)
				{
				if(elementos[i]!=null)
				
					elemento=elementos[i];
				else
				
				
					elemento =null;
					
				}				
				
				// TODO implementar
		
			return elemento;
		}

		public Integer buscar(Integer dato) {
			// TODO implementar
			Integer buscado=null;
			boolean encontre=false;
			for(int i=0;i<elementos.length&&!encontre;i++)
			{
				
				if(elementos[i].compareTo(dato)==0)
					buscado=elementos[i];
				    encontre=true;
			  		
			}
			
			
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			return buscado;
		}

		public Integer eliminar(Integer dato) {
			// TODO implementar
			Integer eliminado=null;
			for(int i=0;i<tamanoAct;i++)
			{
			  if(elementos[i].compareTo(dato)==0)
			  {
				eliminado=elementos[i];
				for(int j=i; j<tamanoAct;j++)
				{
					elementos[j+1]=elementos[j];
				}
			  }
			}
			
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			return eliminado;
		}

}
