package my.company.mvchospital;

public class Medico {
    private String codigoIdentifiacion;
    private String nombre;
    private String apellidos;
    private String especialidad;
    private int numeroColegiado;
    private String cargo;
    private String observaciones;

    
    
    public Medico(String codigoIdentifiacion, String nombre, String apellidos, String especialidad,
            int numeroColegiado, String cargo, String observaciones) {
        this.codigoIdentifiacion = codigoIdentifiacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.numeroColegiado = numeroColegiado;
        this.cargo = cargo;
        this.observaciones = observaciones;
    }

    public Medico(String codigoIdentifiacion1) {
    }


    public String getCodigoIdentifiacion() {
        return codigoIdentifiacion;
    }
    public void setCodigoIdentifiacion(String codigoIdentificacion) {
        this.codigoIdentifiacion = codigoIdentificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getNumeroColegiado() {
        return numeroColegiado;
    }
    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

     

}

    

