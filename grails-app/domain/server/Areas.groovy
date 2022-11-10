package server

class Areas GormEntity<Areas> {

    Integer id_area
    String nombre
    Boolean status

    // static constraints = {
    //     id_area(unique:true)
    //     nombre(blank:false)
    // }
}
