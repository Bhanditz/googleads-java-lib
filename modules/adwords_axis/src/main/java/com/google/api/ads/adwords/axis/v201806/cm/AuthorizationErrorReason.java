// Copyright 2018 Google LLC
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

/**
 * AuthorizationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public class AuthorizationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthorizationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNABLE_TO_AUTHORIZE = "UNABLE_TO_AUTHORIZE";
    public static final java.lang.String _NO_ADWORDS_ACCOUNT_FOR_CUSTOMER = "NO_ADWORDS_ACCOUNT_FOR_CUSTOMER";
    public static final java.lang.String _USER_PERMISSION_DENIED = "USER_PERMISSION_DENIED";
    public static final java.lang.String _EFFECTIVE_USER_PERMISSION_DENIED = "EFFECTIVE_USER_PERMISSION_DENIED";
    public static final java.lang.String _CUSTOMER_NOT_ACTIVE = "CUSTOMER_NOT_ACTIVE";
    public static final java.lang.String _USER_HAS_READONLY_PERMISSION = "USER_HAS_READONLY_PERMISSION";
    public static final java.lang.String _NO_CUSTOMER_FOUND = "NO_CUSTOMER_FOUND";
    public static final java.lang.String _SERVICE_ACCESS_DENIED = "SERVICE_ACCESS_DENIED";
    public static final java.lang.String _TWO_STEP_VERIFICATION_NOT_ENROLLED = "TWO_STEP_VERIFICATION_NOT_ENROLLED";
    public static final java.lang.String _ADVANCED_PROTECTION_NOT_ENROLLED = "ADVANCED_PROTECTION_NOT_ENROLLED";
    public static final AuthorizationErrorReason UNABLE_TO_AUTHORIZE = new AuthorizationErrorReason(_UNABLE_TO_AUTHORIZE);
    public static final AuthorizationErrorReason NO_ADWORDS_ACCOUNT_FOR_CUSTOMER = new AuthorizationErrorReason(_NO_ADWORDS_ACCOUNT_FOR_CUSTOMER);
    public static final AuthorizationErrorReason USER_PERMISSION_DENIED = new AuthorizationErrorReason(_USER_PERMISSION_DENIED);
    public static final AuthorizationErrorReason EFFECTIVE_USER_PERMISSION_DENIED = new AuthorizationErrorReason(_EFFECTIVE_USER_PERMISSION_DENIED);
    public static final AuthorizationErrorReason CUSTOMER_NOT_ACTIVE = new AuthorizationErrorReason(_CUSTOMER_NOT_ACTIVE);
    public static final AuthorizationErrorReason USER_HAS_READONLY_PERMISSION = new AuthorizationErrorReason(_USER_HAS_READONLY_PERMISSION);
    public static final AuthorizationErrorReason NO_CUSTOMER_FOUND = new AuthorizationErrorReason(_NO_CUSTOMER_FOUND);
    public static final AuthorizationErrorReason SERVICE_ACCESS_DENIED = new AuthorizationErrorReason(_SERVICE_ACCESS_DENIED);
    public static final AuthorizationErrorReason TWO_STEP_VERIFICATION_NOT_ENROLLED = new AuthorizationErrorReason(_TWO_STEP_VERIFICATION_NOT_ENROLLED);
    public static final AuthorizationErrorReason ADVANCED_PROTECTION_NOT_ENROLLED = new AuthorizationErrorReason(_ADVANCED_PROTECTION_NOT_ENROLLED);
    public java.lang.String getValue() { return _value_;}
    public static AuthorizationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthorizationErrorReason enumeration = (AuthorizationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthorizationErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorizationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AuthorizationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
