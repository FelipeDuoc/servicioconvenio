/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Duoc
 */
@WebService(serviceName = "servicioConvenio")
public class servicioConvenio {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "validaCliente")
    public int  validaCliente(@WebParam(name = "rut") String rut,
                              @WebParam(name = "empresa") String empresa) {
        int retorno;
        switch (rut) {
            case "18905756":   
                    retorno = 1;
                     break;
            case "123456789": 
                    retorno = 0;
                     break;
                     
            default:
                    retorno = 1;
                     break;
        }
              
        return retorno;
        
    }
}
