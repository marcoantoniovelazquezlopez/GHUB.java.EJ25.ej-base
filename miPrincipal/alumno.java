package miPrincipal;
public class Alumno extends persona{
    private String curso;
    private int[] notas;

    //Metodo contructor 
    //Vacio
    public Alumno(){

    }
    //LLeno 
    public Alumno(String nombre, int edad, String dni, String curso){
        super(nombre, edad, dni);//Invoca al constructor de la clase base
        this.curso=curso;
        this.notas=new int[5];//Ejemplo para alumno que tiene 5 calificaciones



    }
    //metodo personalizado
    public void estudiar (){
        System.out.println("el alumno esta estudiando");


    }
}