/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladores;

/**
 *
 * @author Lalo_
 */
public class Simuladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "java";//Se declara un String
        String [] str2 = {"j","a","v","a"};
         
        String str3 = "";//Se declara otra variable String con valor vacio.
        
        for(String str : str2){ /**Se inicia el foreach el cual solo recorre
         * arreglos y coleccion, las cuales las recorre por completo. ok
         * Se agrega otra variable de tipo String la cual recorreo uno a uno lo
         * que contiene el str2.
         */
            str3 += str; /** en la variable con el valor vacio, le asignamos lo
             * que contenga dicha variable mas la variable que se esta iterando en el foreach
             * cada que itera la variable arreglo de string lo vaa almacenando
             * en la variable vacia. Nota, se debe de asiganar el mismo y despues
             * asigarle el valor de la variable que se usa de iterador, aqui
             * se creo una nueva instancia al asiganarse a si mismo. \
             * Si no le asignaos le valor asis mismo de la variable vacia, solo
             * tomaria el ultimo valor de iteracion en este caso "a".
             */
        }
        boolean b1 = (str1 == str3);/**Para comparar dos String con el operador ==
         * se tiene que ver de donde parte el String en este caso es falso ya que el 
         * operador == no verifica el valor que tiene el String verifica de donde
         * proviene dicho String, y el Str1 proviene de una declaracion simple,
         * el el str3 proviene de una instancia por asignarse a si mismo lo cual ya no 
         * proviene de donde mismo que el srt1.
         * Para que esto sea verdadero despues que que vea de donde proviene dicho String
         * verifica el valor de el, si ninguno de los dos no estan instanciados
         * por default el compilador java agrega un new para los dos esto hace que 
         * sean iguales y si elvalor tambien es igual da verdadero.
         */
        
         boolean b2 = (str1.equals(str3));/** El metodo equals solo verifica lo que
          * hay dentro de dicho String no le importa de donde venga solo el contenido
          * en este caso dara verdarero.
          * Para que de lo contrario hay que cambiar el texto de cualquier String.
          */
         System.out.println(b1 + "," + b2);
    }
    
}
