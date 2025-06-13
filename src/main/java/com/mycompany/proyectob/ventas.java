package com.mycompany.proyectob;

import java.io.Serializable;

/**
 *
 * @author emely
 */
public class ventas implements Serializable {
    private static final long serialVersionUID = 1L; 

    public String vendedor;
    public String cliente_nombre;
    public String cliente_nit;
    public String cliente_dirreción;
    public double cliente_total;
    public double cliente_sIva;
    public String fecha;
    public String valor_descuento; 
}
