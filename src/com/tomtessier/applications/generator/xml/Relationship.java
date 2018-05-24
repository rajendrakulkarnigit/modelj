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
 * Meta-data describing the relationships between beans
 * 
 * @version $Revision$ $Date$
**/
public class Relationship implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _parentBeanName;

    private java.lang.String _parentMultiplicity;

    private java.lang.String _childBeanName;

    private java.lang.String _childMultiplicity;

    private java.lang.String _navigation;


      //----------------/
     //- Constructors -/
    //----------------/

    public Relationship() {
        super();
    } //-- com.tomtessier.applications.generator.xml.Relationship()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'childBeanName'.
     * 
     * @return the value of field 'childBeanName'.
    **/
    public java.lang.String getChildBeanName()
    {
        return this._childBeanName;
    } //-- java.lang.String getChildBeanName() 

    /**
     * Returns the value of field 'childMultiplicity'.
     * 
     * @return the value of field 'childMultiplicity'.
    **/
    public java.lang.String getChildMultiplicity()
    {
        return this._childMultiplicity;
    } //-- java.lang.String getChildMultiplicity() 

    /**
     * Returns the value of field 'navigation'.
     * 
     * @return the value of field 'navigation'.
    **/
    public java.lang.String getNavigation()
    {
        return this._navigation;
    } //-- java.lang.String getNavigation() 

    /**
     * Returns the value of field 'parentBeanName'.
     * 
     * @return the value of field 'parentBeanName'.
    **/
    public java.lang.String getParentBeanName()
    {
        return this._parentBeanName;
    } //-- java.lang.String getParentBeanName() 

    /**
     * Returns the value of field 'parentMultiplicity'.
     * 
     * @return the value of field 'parentMultiplicity'.
    **/
    public java.lang.String getParentMultiplicity()
    {
        return this._parentMultiplicity;
    } //-- java.lang.String getParentMultiplicity() 

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
     * Sets the value of field 'childBeanName'.
     * 
     * @param childBeanName the value of field 'childBeanName'.
    **/
    public void setChildBeanName(java.lang.String childBeanName)
    {
        this._childBeanName = childBeanName;
    } //-- void setChildBeanName(java.lang.String) 

    /**
     * Sets the value of field 'childMultiplicity'.
     * 
     * @param childMultiplicity the value of field
     * 'childMultiplicity'.
    **/
    public void setChildMultiplicity(java.lang.String childMultiplicity)
    {
        this._childMultiplicity = childMultiplicity;
    } //-- void setChildMultiplicity(java.lang.String) 

    /**
     * Sets the value of field 'navigation'.
     * 
     * @param navigation the value of field 'navigation'.
    **/
    public void setNavigation(java.lang.String navigation)
    {
        this._navigation = navigation;
    } //-- void setNavigation(java.lang.String) 

    /**
     * Sets the value of field 'parentBeanName'.
     * 
     * @param parentBeanName the value of field 'parentBeanName'.
    **/
    public void setParentBeanName(java.lang.String parentBeanName)
    {
        this._parentBeanName = parentBeanName;
    } //-- void setParentBeanName(java.lang.String) 

    /**
     * Sets the value of field 'parentMultiplicity'.
     * 
     * @param parentMultiplicity the value of field
     * 'parentMultiplicity'.
    **/
    public void setParentMultiplicity(java.lang.String parentMultiplicity)
    {
        this._parentMultiplicity = parentMultiplicity;
    } //-- void setParentMultiplicity(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.tomtessier.applications.generator.xml.Relationship unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.tomtessier.applications.generator.xml.Relationship) Unmarshaller.unmarshal(com.tomtessier.applications.generator.xml.Relationship.class, reader);
    } //-- com.tomtessier.applications.generator.xml.Relationship unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
