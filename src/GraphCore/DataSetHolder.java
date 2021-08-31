package GraphCore;

/**
* GraphCore/DataSetHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/GraphCore.idl
* Tuesday, August 31, 2021 9:44:40 PM CEST
*/

public final class DataSetHolder implements org.omg.CORBA.portable.Streamable
{
  public GraphCore.DataSet value = null;

  public DataSetHolder ()
  {
  }

  public DataSetHolder (GraphCore.DataSet initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GraphCore.DataSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GraphCore.DataSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GraphCore.DataSetHelper.type ();
  }

}
