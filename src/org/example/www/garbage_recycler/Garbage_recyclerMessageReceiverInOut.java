
/**
 * Garbage_recyclerMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.garbage_recycler;

        /**
        *  Garbage_recyclerMessageReceiverInOut message receiver
        */

        public class Garbage_recyclerMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        Garbage_recyclerSkeleton skel = (Garbage_recyclerSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("registerUser".equals(methodName)){
                
                org.example.www.garbage_recycler.RegisterUserResponse registerUserResponse17 = null;
	                        org.example.www.garbage_recycler.RegisterUser wrappedParam =
                                                             (org.example.www.garbage_recycler.RegisterUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbage_recycler.RegisterUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerUserResponse17 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerUserResponse17, false, new javax.xml.namespace.QName("http://www.example.org/garbage_recycler/",
                                                    "registerUser"));
                                    } else 

            if("addRecyclingToUser".equals(methodName)){
                
                org.example.www.garbage_recycler.AddRecyclingToUserResponse addRecyclingToUserResponse19 = null;
	                        org.example.www.garbage_recycler.AddRecyclingToUser wrappedParam =
                                                             (org.example.www.garbage_recycler.AddRecyclingToUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbage_recycler.AddRecyclingToUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addRecyclingToUserResponse19 =
                                                   
                                                   
                                                         skel.addRecyclingToUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addRecyclingToUserResponse19, false, new javax.xml.namespace.QName("http://www.example.org/garbage_recycler/",
                                                    "addRecyclingToUser"));
                                    } else 

            if("getAllRecyclingFromUser".equals(methodName)){
                
                org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse getAllRecyclingFromUserResponse21 = null;
	                        org.example.www.garbage_recycler.GetAllRecyclingFromUser wrappedParam =
                                                             (org.example.www.garbage_recycler.GetAllRecyclingFromUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbage_recycler.GetAllRecyclingFromUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRecyclingFromUserResponse21 =
                                                   
                                                   
                                                         skel.getAllRecyclingFromUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRecyclingFromUserResponse21, false, new javax.xml.namespace.QName("http://www.example.org/garbage_recycler/",
                                                    "getAllRecyclingFromUser"));
                                    } else 

            if("getTotalRecycling".equals(methodName)){
                
                org.example.www.garbage_recycler.GetTotalRecyclingResponse getTotalRecyclingResponse23 = null;
	                        org.example.www.garbage_recycler.GetTotalRecycling wrappedParam =
                                                             (org.example.www.garbage_recycler.GetTotalRecycling)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.garbage_recycler.GetTotalRecycling.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTotalRecyclingResponse23 =
                                                   
                                                   
                                                         skel.getTotalRecycling(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTotalRecyclingResponse23, false, new javax.xml.namespace.QName("http://www.example.org/garbage_recycler/",
                                                    "getTotalRecycling"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.RegisterUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.RegisterUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.RegisterUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.RegisterUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.AddRecyclingToUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.AddRecyclingToUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.AddRecyclingToUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.AddRecyclingToUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.GetAllRecyclingFromUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.GetAllRecyclingFromUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.GetTotalRecycling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.GetTotalRecycling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.garbage_recycler.GetTotalRecyclingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.garbage_recycler.GetTotalRecyclingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbage_recycler.RegisterUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbage_recycler.RegisterUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbage_recycler.RegisterUserResponse wrapregisterUser(){
                                org.example.www.garbage_recycler.RegisterUserResponse wrappedElement = new org.example.www.garbage_recycler.RegisterUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbage_recycler.AddRecyclingToUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbage_recycler.AddRecyclingToUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbage_recycler.AddRecyclingToUserResponse wrapaddRecyclingToUser(){
                                org.example.www.garbage_recycler.AddRecyclingToUserResponse wrappedElement = new org.example.www.garbage_recycler.AddRecyclingToUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse wrapgetAllRecyclingFromUser(){
                                org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse wrappedElement = new org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.garbage_recycler.GetTotalRecyclingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.garbage_recycler.GetTotalRecyclingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.garbage_recycler.GetTotalRecyclingResponse wrapgetTotalRecycling(){
                                org.example.www.garbage_recycler.GetTotalRecyclingResponse wrappedElement = new org.example.www.garbage_recycler.GetTotalRecyclingResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.garbage_recycler.RegisterUser.class.equals(type)){
                
                           return org.example.www.garbage_recycler.RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.RegisterUserResponse.class.equals(type)){
                
                           return org.example.www.garbage_recycler.RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.AddRecyclingToUser.class.equals(type)){
                
                           return org.example.www.garbage_recycler.AddRecyclingToUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.AddRecyclingToUserResponse.class.equals(type)){
                
                           return org.example.www.garbage_recycler.AddRecyclingToUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.GetAllRecyclingFromUser.class.equals(type)){
                
                           return org.example.www.garbage_recycler.GetAllRecyclingFromUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse.class.equals(type)){
                
                           return org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.GetTotalRecycling.class.equals(type)){
                
                           return org.example.www.garbage_recycler.GetTotalRecycling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.garbage_recycler.GetTotalRecyclingResponse.class.equals(type)){
                
                           return org.example.www.garbage_recycler.GetTotalRecyclingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    