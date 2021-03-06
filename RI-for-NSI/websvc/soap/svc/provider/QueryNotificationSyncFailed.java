
package com.netmng.websvc.soap.svc.provider;

import javax.xml.ws.WebFault;
import com.netmng.websvc.soap.param.types.QueryFailedType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "queryNotificationSyncFailed", targetNamespace = "http://schemas.ogf.org/nsi/2013/07/connection/types")
public class QueryNotificationSyncFailed
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private QueryFailedType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public QueryNotificationSyncFailed(String message, QueryFailedType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public QueryNotificationSyncFailed(String message, QueryFailedType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.ogf.schemas.nsi._2013._07.connection.types.QueryFailedType
     */
    public QueryFailedType getFaultInfo() {
        return faultInfo;
    }

}
