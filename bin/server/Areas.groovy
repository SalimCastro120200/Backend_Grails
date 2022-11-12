package server

class Areas {

    String nombre
    Boolean status
    Date dateCreated
    Date lastUpdated

    static constraints = {
        nombre(blank:false, nullable:false)
    }

    static belongsTo = Empleados
    static hasMany = [empleados:Empleados]

    static mapping = {
        addresses lazy: false
    }

}
