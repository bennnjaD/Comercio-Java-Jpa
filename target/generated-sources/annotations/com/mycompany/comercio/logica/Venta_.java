package com.mycompany.comercio.logica;

import com.mycompany.comercio.logica.Producto;
import com.mycompany.comercio.logica.Venta.MedioDePago;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-18T20:47:08", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, LocalDate> fecha;
    public static volatile SingularAttribute<Venta, Integer> precioCompra;
    public static volatile SingularAttribute<Venta, Long> id;
    public static volatile SingularAttribute<Venta, Producto> producto;
    public static volatile SingularAttribute<Venta, Integer> cantidad;
    public static volatile SingularAttribute<Venta, Integer> precioVenta;
    public static volatile SingularAttribute<Venta, MedioDePago> medioDePago;

}