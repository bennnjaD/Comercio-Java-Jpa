package com.mycompany.comercio.logica;

import com.mycompany.comercio.model.Ganancia;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-19T01:32:13", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Ganancia.class)
public class Ganancia_ { 

    public static volatile SingularAttribute<Ganancia, LocalDate> fecha;
    public static volatile SingularAttribute<Ganancia, Long> id;
    public static volatile SingularAttribute<Ganancia, String> ganancia;

}