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
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Generator implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Information about the application. Note: the short name may
     * not contain spaces
    **/
    private ApplicationInformation _applicationInformation;

    /**
     * Project build information
    **/
    private BuildInformation _buildInformation;

    /**
     * Meta-data describing each bean
    **/
    private java.util.ArrayList _beanList;

    /**
     * Meta-data describing the relationships between beans
    **/
    private java.util.ArrayList _relationshipList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Generator() {
        super();
        _beanList = new ArrayList();
        _relationshipList = new ArrayList();
    } //-- com.tomtessier.applications.generator.xml.Generator()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBean
    **/
    public void addBean(Bean vBean)
        throws java.lang.IndexOutOfBoundsException
    {
        _beanList.add(vBean);
    } //-- void addBean(Bean) 

    /**
     * 
     * 
     * @param index
     * @param vBean
    **/
    public void addBean(int index, Bean vBean)
        throws java.lang.IndexOutOfBoundsException
    {
        _beanList.add(index, vBean);
    } //-- void addBean(int, Bean) 

    /**
     * 
     * 
     * @param vRelationship
    **/
    public void addRelationship(Relationship vRelationship)
        throws java.lang.IndexOutOfBoundsException
    {
        _relationshipList.add(vRelationship);
    } //-- void addRelationship(Relationship) 

    /**
     * 
     * 
     * @param index
     * @param vRelationship
    **/
    public void addRelationship(int index, Relationship vRelationship)
        throws java.lang.IndexOutOfBoundsException
    {
        _relationshipList.add(index, vRelationship);
    } //-- void addRelationship(int, Relationship) 

    /**
    **/
    public void clearBean()
    {
        _beanList.clear();
    } //-- void clearBean() 

    /**
    **/
    public void clearRelationship()
    {
        _relationshipList.clear();
    } //-- void clearRelationship() 

    /**
    **/
    public java.util.Enumeration enumerateBean()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_beanList.iterator());
    } //-- java.util.Enumeration enumerateBean() 

    /**
    **/
    public java.util.Enumeration enumerateRelationship()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_relationshipList.iterator());
    } //-- java.util.Enumeration enumerateRelationship() 

    /**
     * Returns the value of field 'applicationInformation'. The
     * field 'applicationInformation' has the following
     * description: Information about the application. Note: the
     * short name may not contain spaces
     * 
     * @return the value of field 'applicationInformation'.
    **/
    public ApplicationInformation getApplicationInformation()
    {
        return this._applicationInformation;
    } //-- ApplicationInformation getApplicationInformation() 

    /**
     * 
     * 
     * @param index
    **/
    public Bean getBean(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _beanList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Bean) _beanList.get(index);
    } //-- Bean getBean(int) 

    /**
    **/
    public Bean[] getBean()
    {
        int size = _beanList.size();
        Bean[] mArray = new Bean[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Bean) _beanList.get(index);
        }
        return mArray;
    } //-- Bean[] getBean() 

    /**
     * Returns a reference to 'bean'. No type checking is performed
     * on any modications to the Collection.
     * 
     * @return returns a reference to the Collection.
    **/
    public java.util.ArrayList getBeanAsReference()
    {
        return _beanList;
    } //-- java.util.ArrayList getBeanAsReference() 

    /**
    **/
    public int getBeanCount()
    {
        return _beanList.size();
    } //-- int getBeanCount() 

    /**
     * Returns the value of field 'buildInformation'. The field
     * 'buildInformation' has the following description: Project
     * build information
     * 
     * @return the value of field 'buildInformation'.
    **/
    public BuildInformation getBuildInformation()
    {
        return this._buildInformation;
    } //-- BuildInformation getBuildInformation() 

    /**
     * 
     * 
     * @param index
    **/
    public Relationship getRelationship(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _relationshipList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (Relationship) _relationshipList.get(index);
    } //-- Relationship getRelationship(int) 

    /**
    **/
    public Relationship[] getRelationship()
    {
        int size = _relationshipList.size();
        Relationship[] mArray = new Relationship[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (Relationship) _relationshipList.get(index);
        }
        return mArray;
    } //-- Relationship[] getRelationship() 

    /**
     * Returns a reference to 'relationship'. No type checking is
     * performed on any modications to the Collection.
     * 
     * @return returns a reference to the Collection.
    **/
    public java.util.ArrayList getRelationshipAsReference()
    {
        return _relationshipList;
    } //-- java.util.ArrayList getRelationshipAsReference() 

    /**
    **/
    public int getRelationshipCount()
    {
        return _relationshipList.size();
    } //-- int getRelationshipCount() 

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
     * @param vBean
    **/
    public boolean removeBean(Bean vBean)
    {
        boolean removed = _beanList.remove(vBean);
        return removed;
    } //-- boolean removeBean(Bean) 

    /**
     * 
     * 
     * @param vRelationship
    **/
    public boolean removeRelationship(Relationship vRelationship)
    {
        boolean removed = _relationshipList.remove(vRelationship);
        return removed;
    } //-- boolean removeRelationship(Relationship) 

    /**
     * Sets the value of field 'applicationInformation'. The field
     * 'applicationInformation' has the following description:
     * Information about the application. Note: the short name may
     * not contain spaces
     * 
     * @param applicationInformation the value of field
     * 'applicationInformation'.
    **/
    public void setApplicationInformation(ApplicationInformation applicationInformation)
    {
        this._applicationInformation = applicationInformation;
    } //-- void setApplicationInformation(ApplicationInformation) 

    /**
     * 
     * 
     * @param index
     * @param vBean
    **/
    public void setBean(int index, Bean vBean)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _beanList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _beanList.set(index, vBean);
    } //-- void setBean(int, Bean) 

    /**
     * 
     * 
     * @param beanArray
    **/
    public void setBean(Bean[] beanArray)
    {
        //-- copy array
        _beanList.clear();
        for (int i = 0; i < beanArray.length; i++) {
            _beanList.add(beanArray[i]);
        }
    } //-- void setBean(Bean) 

    /**
     * Sets the value of 'bean' by copying the given ArrayList.
     * 
     * @param beanCollection the Vector to copy.
    **/
    public void setBean(java.util.ArrayList beanCollection)
    {
        //-- copy collection
        _beanList.clear();
        for (int i = 0; i < beanCollection.size(); i++) {
            _beanList.add((Bean)beanCollection.get(i));
        }
    } //-- void setBean(java.util.ArrayList) 

    /**
     * Sets the value of 'bean' by setting it to the given
     * ArrayList. No type checking is performed.
     * 
     * @param beanCollection the ArrayList to copy.
    **/
    public void setBeanAsReference(java.util.ArrayList beanCollection)
    {
        _beanList = beanCollection;
    } //-- void setBeanAsReference(java.util.ArrayList) 

    /**
     * Sets the value of field 'buildInformation'. The field
     * 'buildInformation' has the following description: Project
     * build information
     * 
     * @param buildInformation the value of field 'buildInformation'
    **/
    public void setBuildInformation(BuildInformation buildInformation)
    {
        this._buildInformation = buildInformation;
    } //-- void setBuildInformation(BuildInformation) 

    /**
     * 
     * 
     * @param index
     * @param vRelationship
    **/
    public void setRelationship(int index, Relationship vRelationship)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _relationshipList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _relationshipList.set(index, vRelationship);
    } //-- void setRelationship(int, Relationship) 

    /**
     * 
     * 
     * @param relationshipArray
    **/
    public void setRelationship(Relationship[] relationshipArray)
    {
        //-- copy array
        _relationshipList.clear();
        for (int i = 0; i < relationshipArray.length; i++) {
            _relationshipList.add(relationshipArray[i]);
        }
    } //-- void setRelationship(Relationship) 

    /**
     * Sets the value of 'relationship' by copying the given
     * ArrayList.
     * 
     * @param relationshipCollection the Vector to copy.
    **/
    public void setRelationship(java.util.ArrayList relationshipCollection)
    {
        //-- copy collection
        _relationshipList.clear();
        for (int i = 0; i < relationshipCollection.size(); i++) {
            _relationshipList.add((Relationship)relationshipCollection.get(i));
        }
    } //-- void setRelationship(java.util.ArrayList) 

    /**
     * Sets the value of 'relationship' by setting it to the given
     * ArrayList. No type checking is performed.
     * 
     * @param relationshipCollection the ArrayList to copy.
    **/
    public void setRelationshipAsReference(java.util.ArrayList relationshipCollection)
    {
        _relationshipList = relationshipCollection;
    } //-- void setRelationshipAsReference(java.util.ArrayList) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.tomtessier.applications.generator.xml.Generator unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.tomtessier.applications.generator.xml.Generator) Unmarshaller.unmarshal(com.tomtessier.applications.generator.xml.Generator.class, reader);
    } //-- com.tomtessier.applications.generator.xml.Generator unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
