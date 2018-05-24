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
 * Information about the application. Note: the short name may not
 * contain spaces
 * 
 * @version $Revision$ $Date$
**/
public class ApplicationInformation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _name;

    private java.lang.String _shortName;

    private java.lang.String _version;

    private java.lang.String _author;

    private java.lang.String _company;


      //----------------/
     //- Constructors -/
    //----------------/

    public ApplicationInformation() {
        super();
    } //-- com.tomtessier.applications.generator.xml.ApplicationInformation()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'author'.
     * 
     * @return the value of field 'author'.
    **/
    public java.lang.String getAuthor()
    {
        return this._author;
    } //-- java.lang.String getAuthor() 

    /**
     * Returns the value of field 'company'.
     * 
     * @return the value of field 'company'.
    **/
    public java.lang.String getCompany()
    {
        return this._company;
    } //-- java.lang.String getCompany() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'shortName'.
     * 
     * @return the value of field 'shortName'.
    **/
    public java.lang.String getShortName()
    {
        return this._shortName;
    } //-- java.lang.String getShortName() 

    /**
     * Returns the value of field 'version'.
     * 
     * @return the value of field 'version'.
    **/
    public java.lang.String getVersion()
    {
        return this._version;
    } //-- java.lang.String getVersion() 

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
     * Sets the value of field 'author'.
     * 
     * @param author the value of field 'author'.
    **/
    public void setAuthor(java.lang.String author)
    {
        this._author = author;
    } //-- void setAuthor(java.lang.String) 

    /**
     * Sets the value of field 'company'.
     * 
     * @param company the value of field 'company'.
    **/
    public void setCompany(java.lang.String company)
    {
        this._company = company;
    } //-- void setCompany(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'shortName'.
     * 
     * @param shortName the value of field 'shortName'.
    **/
    public void setShortName(java.lang.String shortName)
    {
        this._shortName = shortName;
    } //-- void setShortName(java.lang.String) 

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
    **/
    public void setVersion(java.lang.String version)
    {
        this._version = version;
    } //-- void setVersion(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.tomtessier.applications.generator.xml.ApplicationInformation unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.tomtessier.applications.generator.xml.ApplicationInformation) Unmarshaller.unmarshal(com.tomtessier.applications.generator.xml.ApplicationInformation.class, reader);
    } //-- com.tomtessier.applications.generator.xml.ApplicationInformation unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
