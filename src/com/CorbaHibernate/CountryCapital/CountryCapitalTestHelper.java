package com.CorbaHibernate.CountryCapital;


/**
* CountryCapital/CountryCapitalTestHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CountryCapital.idl
* Tuesday, January 23, 2024 2:40:06 PM CET
*/

abstract public class CountryCapitalTestHelper
{
  private static String  _id = "IDL:CountryCapital/CountryCapitalTest:1.0";

  public static void insert (org.omg.CORBA.Any a, com.CorbaHibernate.CountryCapital.CountryCapitalTest that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.CorbaHibernate.CountryCapital.CountryCapitalTest extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (com.CorbaHibernate.CountryCapital.CountryCapitalTestHelper.id (), "CountryCapitalTest");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.CorbaHibernate.CountryCapital.CountryCapitalTest read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CountryCapitalTestStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.CorbaHibernate.CountryCapital.CountryCapitalTest value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static com.CorbaHibernate.CountryCapital.CountryCapitalTest narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.CorbaHibernate.CountryCapital.CountryCapitalTest)
      return (com.CorbaHibernate.CountryCapital.CountryCapitalTest)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.CorbaHibernate.CountryCapital._CountryCapitalTestStub stub = new com.CorbaHibernate.CountryCapital._CountryCapitalTestStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static com.CorbaHibernate.CountryCapital.CountryCapitalTest unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.CorbaHibernate.CountryCapital.CountryCapitalTest)
      return (com.CorbaHibernate.CountryCapital.CountryCapitalTest)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.CorbaHibernate.CountryCapital._CountryCapitalTestStub stub = new com.CorbaHibernate.CountryCapital._CountryCapitalTestStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
