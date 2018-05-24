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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Meta-data describing each bean
 * 
 * @version $Revision$ $Date$
**/
public class Bean implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _name;
    
    private java.lang.String _className;

    private java.lang.String _description;

    private java.util.ArrayList _attributeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Bean() {
        super();
        _attributeList = new ArrayList();
    } //-- com.tomtessier.applications.generator.xml.Bean()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAttribute
    **/
    public void addAttribute(Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        _attributeList.add(vAttribute);
    } //-- void addAttribute(Attribute) 

    /**
     * 
     * 
     * @param index
     * @param vAttribute
    **/
    public void addAttribute(int index, Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        _attributeList.add(index, vAttribute);
    } //-- void addAttribute(int, Attribute) 

    /**
    **/
    public void clearAttribute()
    {
        _attributeList.clear();
    } //-- void clearAttribute() 

    /**
    **/
    public java.util.Enumeration enumerateAttribute()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_attributeList.iterator());
    } //-- java.util.Enumeration enumerateAttribute() 

    /**
     * 
     * 
     * @param index
    **/
    public Attribute getAttribute(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _attributeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Attribute) _attributeList.get(index);
    } //-- Attribute getAttribute(int) 

    /**
    **/
    public Attribute[] getAttribute()
    {
        int size = _attributeList.size();
        Attribute[] mArray = new Attribute[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Attribute) _attributeList.get(index);
        }
        return mArray;
    } //-- Attribute[] getAttribute() 

    /**
     * Returns a reference to 'attribute'. No type checking is
     * performed on any modications to the Collection.
     * 
     * @return returns a reference to the Collection.
    **/
    public java.util.ArrayList getAttributeAsReference()
    {
        return _attributeList;
    } //-- java.util.ArrayList getAttributeAsReference() 

    /**
    **/
    public int getAttributeCount()
    {
        return _attributeList.size();
    } //-- int getAttributeCount() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'description'.
    **/
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
    **/
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    
    public java.lang.String getClassName()
    {
        return this._className;
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
     * 
     * 
     * @param vAttribute
    **/
    public boolean removeAttribute(Attribute vAttribute)
    {
        boolean removed = _attributeList.remove(vAttribute);
        return removed;
    } //-- boolean removeAttribute(Attribute) 

    /**
     * 
     * 
     * @param index
     * @param vAttribute
    **/
    public void setAttribute(int index, Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _attributeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _attributeList.set(index, vAttribute);
    } //-- void setAttribute(int, Attribute) 

    /**
     * 
     * 
     * @param attributeArray
    **/
    public void setAttribute(Attribute[] attributeArray)
    {
        //-- copy array
        _attributeList.clear();
        for (int i = 0; i < attributeArray.length; i++) {
            _attributeList.add(attributeArray[i]);
        }
    } //-- void setAttribute(Attribute) 

    /**
     * Sets the value of 'attribute' by copying the given
     * ArrayList.
     * 
     * @param attributeCollection the Vector to copy.
    **/
    public void setAttribute(java.util.ArrayList attributeCollection)
    {
        //-- copy collection
        _attributeList.clear();
        for (int i = 0; i < attributeCollection.size(); i++) {
            _attributeList.add((Attribute)attributeCollection.get(i));
        }
    } //-- void setAttribute(java.util.ArrayList) 

    /**
     * Sets the value of 'attribute' by setting it to the given
     * ArrayList. No type checking is performed.
     * 
     * @param attributeCollection the ArrayList to copy.
    **/
    public void setAttributeAsReference(java.util.ArrayList attributeCollection)
    {
        _attributeList = attributeCollection;
    } //-- void setAttributeAsReference(java.util.ArrayList) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
    **/
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
    **/
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    public void setClassName(java.lang.String className)
    {
        this._className = className;
    } //-- void setName(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.tomtessier.applications.generator.xml.Bean unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.tomtessier.applications.generator.xml.Bean) Unmarshaller.unmarshal(com.tomtessier.applications.generator.xml.Bean.class, reader);
    } //-- com.tomtessier.applications.generator.xml.Bean unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
