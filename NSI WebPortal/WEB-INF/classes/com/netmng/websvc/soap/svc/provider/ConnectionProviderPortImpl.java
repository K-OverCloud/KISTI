
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.netmng.websvc.soap.svc.provider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.netmng.util.PropUtil;
import com.netmng.util.StrUtil;
import com.netmng.websvc.soap.param.types.GenericAcknowledgmentType;
import com.netmng.websvc.soap.param.types.QueryNotificationConfirmedType;
import com.netmng.websvc.soap.param.types.QueryNotificationType;
import com.netmng.websvc.soap.param.types.QuerySummaryConfirmedType;
import com.netmng.websvc.soap.param.types.QuerySummaryResultType;
import com.netmng.websvc.soap.param.types.QueryType;
import com.netmng.websvc.soap.param.types.ReservationRequestCriteriaType;
import com.netmng.websvc.soap.svc.Provider;
import com.netmng.websvc.soap.svc.header.CommonHeaderType;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.xml.internal.ws.api.message.Header;
import com.sun.xml.internal.ws.api.message.HeaderList;
import com.sun.xml.internal.ws.developer.JAXWSProperties;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-10-17T13:07:53.557+09:00
 * Generated source version: 2.7.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "ConnectionServiceProvider",
                      portName = "ConnectionServiceProviderPort",
                      targetNamespace = "http://schemas.ogf.org/nsi/2013/07/connection/provider",
                      /*wsdlLocation = "file:/c:/Users/TSOC/Downloads/apache-cxf-2.7.6/NSI r99-v2.9.1-WSDL-08.22/ConnectionService/ogf_nsi_connection_provider_v2_0.wsdl",*/
                      wsdlLocation = "http://nsi2.kisti.re.kr:80/ConnectionServiceProvider?wsdl",   
                      /*endpointInterface = "org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort")*/
                      endpointInterface = "com.netmng.websvc.soap.svc.provider.ConnectionProviderPort")
@HandlerChain(file="../requester/handler_chain.xml")
@SOAPBinding(style = Style.RPC)

public class ConnectionProviderPortImpl implements ConnectionProviderPort {

	@Resource
	private WebServiceContext context;
	
    private static final Logger LOG = Logger.getLogger(ConnectionProviderPortImpl.class.getName());

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#provision(java.lang.String  connectionId )*
     */
    public void provision(String connectionId) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation provision");
        System.out.println(connectionId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#reserveCommit(java.lang.String  connectionId )*
     */
    public void reserveCommit(String connectionId) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation reserveCommit");
        System.out.println(connectionId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#reserve(java.lang.String  connectionId ,)java.lang.String  globalReservationId ,)java.lang.String  description ,)org.ogf.schemas.nsi._2013._07.connection.types.ReservationRequestCriteriaType  criteria )*
     */
    public void reserve(javax.xml.ws.Holder<String> connectionId,
    					String globalReservationId,
    					String description,
    					ReservationRequestCriteriaType criteria) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation reserve");
        System.out.println(connectionId.value);
        System.out.println(globalReservationId);
        System.out.println(description);
        System.out.println(criteria);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#reserveAbort(java.lang.String  connectionId )*
     */
    public void reserveAbort(String connectionId) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation reserveAbort");
        System.out.println(connectionId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#release(java.lang.String  connectionId )*
     */
    public void release(String connectionId) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation release");
        System.out.println(connectionId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#terminate(java.lang.String  connectionId )*
     */
    public void terminate(String connectionId) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation terminate");
        System.out.println(connectionId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#querySummary(org.ogf.schemas.nsi._2013._07.connection.types.QueryType  querySummary )*
     */
    public GenericAcknowledgmentType querySummary(QueryType querySummary) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation querySummary");
        try {
        	System.out.println("=====>> from kisti to gnos : querySummary() call !!");
        	
        	Map map = new HashMap();
			map.put("service_type",		"querySummaryConfirmed");
			map.put("correlationId",	PropUtil.getGlobalVal("correlationId"));
			map.put("providerNSA",		PropUtil.getGlobalVal("providerNSA"));
			map.put("replyTo",			PropUtil.getGlobalVal("replyTo"));
			map.put("queryType",		querySummary);
			com.netmng.websvc.soap.svc.NewThread nt = new com.netmng.websvc.soap.svc.NewThread(map);
			nt.start();
        	
        	/*com.netmng.websvc.soap.param.types.GenericAcknowledgmentType _return = null;*/
        	GenericAcknowledgmentType _return = new GenericAcknowledgmentType();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#querySummarySync(org.ogf.schemas.nsi._2013._07.connection.types.QueryType  querySummarySync )*
     */
    public QuerySummaryConfirmedType querySummarySync(QueryType querySummary) throws com.netmng.websvc.soap.param._interface.QuerySummarySyncFailed    { 
        LOG.info("Executing operation querySummarySync");
        try {
        	System.out.println("=====>> from kisti to gnos : querySummarySync() call !!");

        	ApplicationContext appContext = new ClassPathXmlApplicationContext("config/spring/spring-app.xml"); 
	        com.netmng.svc.nsa.NsaService nsaService = (com.netmng.svc.nsa.NsaService) appContext.getBean("nsaService"); 
	        Provider provider = new Provider(	PropUtil.getGlobalVal("correlationId"), 
	        									PropUtil.getGlobalVal("providerNSA"), 
	        									(new PropUtil()).getProp("nsa.replyTo"), 
	        									PropUtil.getGlobalVal("replyTo"), 
	        									"requester"	);
	        List<QuerySummaryResultType> listQuerySummaryResult = nsaService.querySummaryConfirmed(querySummary);
	        
        	QuerySummaryConfirmedType _return = new QuerySummaryConfirmedType();
        	_return.getReservation().addAll(listQuerySummaryResult);
        	
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.QuerySummarySyncFailed("querySummarySyncFailed...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#queryRecursive(org.ogf.schemas.nsi._2013._07.connection.types.QueryType  queryRecursive )*
     */
    public GenericAcknowledgmentType queryRecursive(QueryType queryRecursive) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation queryRecursive");
        System.out.println(queryRecursive);
        try {
        	System.out.println("=====>> from kisti to gnos : queryRecursive() call !!");
        	
        	Map map = new HashMap();
			map.put("service_type",		"queryRecursiveConfirmed");
			map.put("correlationId",	PropUtil.getGlobalVal("correlationId"));
			map.put("providerNSA",		PropUtil.getGlobalVal("providerNSA"));
			map.put("replyTo",			PropUtil.getGlobalVal("replyTo"));
			map.put("queryType",		queryRecursive);
			com.netmng.websvc.soap.svc.NewThread nt = new com.netmng.websvc.soap.svc.NewThread(map);
			nt.start();
        	
        	GenericAcknowledgmentType _return = new GenericAcknowledgmentType();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#queryNotification(java.lang.String  connectionId ,)java.lang.Integer  startNotificationId ,)java.lang.Integer  endNotificationId )*
     */
    public void queryNotification(	java.lang.String connectionId,
    								java.lang.Integer startNotificationId,
    								java.lang.Integer endNotificationId) throws com.netmng.websvc.soap.param._interface.ServiceException    { 
        LOG.info("Executing operation queryNotification");
        System.out.println(connectionId);
        System.out.println(startNotificationId);
        System.out.println(endNotificationId);
        try {
        	System.out.println("=====>> from kisti to gnos : queryNotification() call !!");
        	
        	Map map = new HashMap();
			map.put("service_type",			"queryNotificationConfirmed");
			map.put("correlationId",		PropUtil.getGlobalVal("correlationId"));
			map.put("providerNSA",			PropUtil.getGlobalVal("providerNSA"));
			map.put("replyTo",				PropUtil.getGlobalVal("replyTo"));
			map.put("connectionId",			connectionId);
			map.put("startNotificationId",	startNotificationId);
			map.put("endNotificationId",	endNotificationId);
			com.netmng.websvc.soap.svc.NewThread nt = new com.netmng.websvc.soap.svc.NewThread(map);
			nt.start();
        	
        	//com.netmng.websvc.soap.param.types.GenericAcknowledgmentType _return = null;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see org.ogf.schemas.nsi._2013._07.connection.provider.ConnectionProviderPort#queryNotificationSync(org.ogf.schemas.nsi._2013._07.connection.types.QueryNotificationType  queryNotificationSync )*
     */
    public QueryNotificationConfirmedType queryNotificationSync(QueryNotificationType queryNotificationSync) throws com.netmng.websvc.soap.param._interface.QueryNotificationSyncFailed    { 
        LOG.info("Executing operation queryNotificationSync");
        try {
        	System.out.println("=====>> from kisti to gnos : queryNotificationSync() call !!");

        	ApplicationContext appContext = new ClassPathXmlApplicationContext("config/spring/spring-app.xml"); 
	        com.netmng.svc.nsa.NsaService nsaService = (com.netmng.svc.nsa.NsaService) appContext.getBean("nsaService"); 
	        Provider provider = new Provider(	PropUtil.getGlobalVal("correlationId"), 
	        									PropUtil.getGlobalVal("providerNSA"), 
	        									(new PropUtil()).getProp("nsa.replyTo"), 
	        									PropUtil.getGlobalVal("replyTo"), 
	        									"requester"	);
	        
	        String sConnectionId	= queryNotificationSync.getConnectionId();
	        int iStartNotificationId= queryNotificationSync.getStartNotificationId();
	        int iEndNotificationId	= queryNotificationSync.getEndNotificationId();
	        
	        QueryNotificationConfirmedType _return = nsaService.queryNotificationConfonfirmed(sConnectionId, iStartNotificationId, iEndNotificationId);
	        
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.ogf.schemas.nsi._2013._07.connection._interface.QueryNotificationSyncFailed("queryNotificationSyncFailed...");
    }
}
