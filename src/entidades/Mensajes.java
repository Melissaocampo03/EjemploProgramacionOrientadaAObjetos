package entidades;

public enum Mensajes {

    MENSAJE_PETICION_HORAS("Ingresa las horas trabajadas:"),
    MENSAJES_PETICION_VALOR_HORA ("Ingresa el valor de la hora trabajada:"),
    MENSAJES_SALARIO_PAGAR("El salario a pagar es:");
    private String mensaje;


    Mensajes(String s) {
        this.mensaje= s;

    }

    public String getMensajes() {
        return mensaje;
    }

}
