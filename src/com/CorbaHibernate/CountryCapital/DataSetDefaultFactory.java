package com.CorbaHibernate.CountryCapital;

import com.CorbaHibernate.Model.DataSetModel;

/**
* CountryCapital/DataSetDefaultFactory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CountryCapital.idl
* Tuesday, January 23, 2024 2:40:06 PM CET
*/

public class DataSetDefaultFactory implements org.omg.CORBA.portable.ValueFactory {

  public java.io.Serializable read_value (org.omg.CORBA_2_3.portable.InputStream is)
  {
    return is.read_value(new DataSetModel ());
  }
}
