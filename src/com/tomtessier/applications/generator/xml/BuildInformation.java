/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.tomtessier.applications.generator.xml;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Project build information
 * 
 * @version $Revision$ $Date$
**/
public class BuildInformation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _appServer;

    private java.lang.String _datasource;

    private java.lang.String _typeMapping;

    private java.lang.String _outputDirectory;

    private java.lang.String _package;
    
    private java.lang.String _module;


      //----------------/
     //- Constructors -/
    //----------------/

    public BuildInformation() {
        super();
    } //-- com.tomtessier.applications.generator.xml.BuildInformation()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'appServer'.
     * 
     * @return the value of field 'appServer'.
    **/
    public java.lang.String getAppServer()
    {
        return this._appServer;
    } //-- java.lang.String getAppServer() 

    /**
     * Returns the value of field 'datasource'.
     * 
     * @return the value of field 'datasource'.
    **/
    public java.lang.String getDatasource()
    {
        return this._datasource;
    } //-- java.lang.String getDatasource() 

    /**
     * Returns the value of field 'outputDirectory'.
     * 
     * @return the value of field 'outputDirectory'.
    **/
    public java.lang.String getOutputDirectory()
    {
        return this._outputDirectory;
    } //-- java.lang.String getOutputDirectory() 

    /**
     * Returns the value of field 'package'.
     * 
     * @return the value of field 'package'.
    **/
    public java.lang.String getPackage()
    {
        return this._package;
    } //-- java.lang.String getPackage() 

    public java.lang.String getModule()
    {
        return this._module;
    } //-- java.lang.String getModule() 
    
    /**
     * Returns the value of field 'typeMapping'.
     * 
     * @return the value of field 'typeMapping'.
    **/
    public java.lang.String getTypeMapping()
    {
        return this._typeMapping;
    } //-- java.lang.String getTypeMapping() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'appServer'.
     * 
     * @param appServer the value of field 'appServer'.
    **/
    public void setAppServer(java.lang.String appServer)
    {
        this._appServer = appServer;
    } //-- void setAppServer(java.lang.String) 

    /**
     * Sets the value of field 'datasource'.
     * 
     * @param datasource the value of field 'datasource'.
    **/
    public void setDatasource(java.lang.String datasource)
    {
        this._datasource = datasource;
    } //-- void setDatasource(java.lang.String) 

    /**
     * Sets the value of field 'outputDirectory'.
     * 
     * @param outputDirectory the value of field 'outputDirectory'.
    **/
    public void setOutputDirectory(java.lang.String outputDirectory)
    {
        this._outputDirectory = outputDirectory;
    } //-- void setOutputDirectory(java.lang.String) 

    /**
     * Sets the value of field 'package'.
     * 
     * @param _package
     * @param package the value of field 'package'.
    **/
    public void setPackage(java.lang.String _package)
    {
        this._package = _package;
    } //-- void setPackage(java.lang.String) 

    /**
     * Sets the value of field 'module'.
     * 
     * @param _module
     * @param package the value of field 'module'.
    **/
    public void setModule(java.lang.String _module)
    {
        this._module = _module;
    } //-- void setModule(java.lang.String) 

    /**
     * Sets the value of field 'typeMapping'.
     * 
     * @param typeMapping the value of field 'typeMapping'.
    **/
    public void setTypeMapping(java.lang.String typeMapping)
    {
        this._typeMapping = typeMapping;
    } //-- void setTypeMapping(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.tomtessier.applications.generator.xml.BuildInformation unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.tomtessier.applications.generator.xml.BuildInformation) Unmarshaller.unmarshal(com.tomtessier.applications.generator.xml.BuildInformation.class, reader);
    } //-- com.tomtessier.applications.generator.xml.BuildInformation unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
