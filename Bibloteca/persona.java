package bibloteca;
public class persona{
    private int idPersona;
    private string nombre;
    private string telefono;

    public persona(){

    }

    public persona(int idPersona, stringnombre, string telefono){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.telefono = telefono;

    }
    public boolen SolicitarPrestamo(libro libro){
        return this;
    }
    public boolen devolerlibro (libro libro){
        return this;
    }
    public int getIdPersona(){
        return this.idPersona;

    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;

    }

    }

    
}