package server

class Empleados {

    Integer codigoempleado
    String nombres
    String apaterno
    String amaterno
    String direccion
    Date fechanacimiento
    Date dateCreated
    Date lastUpdated
    Boolean status

    static hasMany=[areas:Areas]

    static constraints = {
        nombres(blank:false,nullable:false,maxSize:140)
        apaterno(blank:false,nullable:false,maxSize:110)
        amaterno(blank:false,nullable:false,maxSize:150)
        direccion(blank:false,maxSize:1000)
        fechanacimiento(nullable:false)
    }

    
    static mapping = { 
        addresses lazy: false 
    } 
}
