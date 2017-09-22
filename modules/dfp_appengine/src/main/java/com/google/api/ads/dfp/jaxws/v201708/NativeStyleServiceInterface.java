// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.dfp.jaxws.v201708;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating and retrieving {@link NativeStyle} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NativeStyleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NativeStyleServiceInterface {


    /**
     * 
     *         Creates new {@link NativeStyle} objects.
     *         
     *         @param nativeStyles the native styles to create
     *         @return the created native styles with their IDs filled in
     *       
     * 
     * @param nativeStyles
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201708.NativeStyle>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
    @RequestWrapper(localName = "createNativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfacecreateNativeStyles")
    @ResponseWrapper(localName = "createNativeStylesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfacecreateNativeStylesResponse")
    public List<NativeStyle> createNativeStyles(
        @WebParam(name = "nativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
        List<NativeStyle> nativeStyles)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link NativeStylePage NativeStylePage} of {@link NativeStyle} objects that satisfy
     *         the given {@link Statement}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link NativeStyle#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link NativeStyle#name}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter a set of
     *         native styles.
     *         @return the native styles that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201708.NativeStylePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
    @RequestWrapper(localName = "getNativeStylesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfacegetNativeStylesByStatement")
    @ResponseWrapper(localName = "getNativeStylesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfacegetNativeStylesByStatementResponse")
    public NativeStylePage getNativeStylesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link NativeStyle native styles} that match the given {@link Statement}.
     *         
     *         @param nativeStyleAction the action to perform
     *         @param filterStatement a Publisher Query Language statement to filter a set of native styles
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param nativeStyleAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201708.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
    @RequestWrapper(localName = "performNativeStyleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfaceperformNativeStyleAction")
    @ResponseWrapper(localName = "performNativeStyleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfaceperformNativeStyleActionResponse")
    public UpdateResult performNativeStyleAction(
        @WebParam(name = "nativeStyleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
        NativeStyleAction nativeStyleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link NativeStyle} objects.
     *         
     *         @param nativeStyles the native styles to be updated
     *         @return the updated native styles
     *       
     * 
     * @param nativeStyles
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201708.NativeStyle>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
    @RequestWrapper(localName = "updateNativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfaceupdateNativeStyles")
    @ResponseWrapper(localName = "updateNativeStylesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708", className = "com.google.api.ads.dfp.jaxws.v201708.NativeStyleServiceInterfaceupdateNativeStylesResponse")
    public List<NativeStyle> updateNativeStyles(
        @WebParam(name = "nativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v201708")
        List<NativeStyle> nativeStyles)
        throws ApiException_Exception
    ;

}