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
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Attribute implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _primaryKey;
    private java.lang.String _name;
    private java.lang.String _title;
    private java.lang.String _type;
    private java.lang.String _width;
    private java.lang.String _htmlType;    
    
      //----------------/
     //- Constructors -/
    //----------------/

    public Attribute() {
        super();
    } //-- com.tomtessier.applications.generator.xml.Attribute()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'primaryKey'.
     * 
     * @return the value of field 'primaryKey'.
    **/
    public java.lang.String getPrimaryKey()
    {
        return this._primaryKey;
    } //-- java.lang.String getPrimaryKey() 

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'title'.
    **/
    public java.lang.String getTitle()
    {
        return this._title;
    } //-- java.lang.String getTitle() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'type'.
    **/
    public java.lang.String getType()
    {
        return this._type;
    } //-- java.lang.String getType() 

    
    /**
     * Returns the value of field 'width'.
     * 
     * @return the value of field 'width'.
    **/
    public java.lang.String getWidth()
    {
        return this._width;
    } //-- java.lang.String getWidth() 

    public java.lang.String getHtmlType()
    {
        return this._htmlType;
    }  
    
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'primaryKey'.
     * 
     * @param primaryKey the value of field 'primaryKey'.
    **/
    public void setPrimaryKey(java.lang.String primaryKey)
    {
        this._primaryKey = primaryKey;
    } //-- void setPrimaryKey(java.lang.String) 

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
    **/
    public void setTitle(java.lang.String title)
    {
        this._title = title;
    } //-- void setTitle(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
    **/
    public void setType(java.lang.String type)
    {
        this._type = type;
    } //-- void setType(java.lang.String) 

    /**
     * Sets the value of field 'width'.
     * 
     * @param type the value of field 'width'.
    **/
    public void setWidth(java.lang.String width)
    {
        this._width = width;
    } //-- void setWidth(java.lang.String) 

    public void setHtmlType(java.lang.String htmlType)
    {
        this._htmlType = htmlType;
    }  

    /**
     * 
     * 
     * @param reader
    **/
    public static com.tomtessier.applications.generator.xml.Attribute unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.tomtessier.applications.generator.xml.Attribute) Unmarshaller.unmarshal(com.tomtessier.applications.generator.xml.Attribute.class, reader);
    } //-- com.tomtessier.applications.generator.xml.Attribute unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
