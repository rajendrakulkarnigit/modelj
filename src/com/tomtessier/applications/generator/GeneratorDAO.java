/*
 * ModelJ - the RAD tool for J2EE.
 * Copyright (C) 2003 Tom Tessier
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 */

package com.tomtessier.applications.generator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.XMLException;

import com.tomtessier.applications.generator.xml.Generator;

/**
 * Handles Data Access to the application XML objects
 */
public class GeneratorDAO {

  /**
   * Create a Generator XML tree based on a file name
   *
   * @param filename Name of the file
   *
   * @return an object of type Generator
   * 
   * @exception FileNotFoundException Thrown if the file can not be found
   * @exception XMLException Thrown if there were an error during the loading
   */
  public Generator load(String filename) throws FileNotFoundException, XMLException {
    try {
      System.out.println("GeneratorDAO Generator load(String filename) " + filename);	
      Generator tree = null;
      InputStream in = null;

      in = new FileInputStream(filename);
      InputStreamReader reader = new InputStreamReader(in);

      tree = (Generator)Unmarshaller.unmarshal(Generator.class, reader);

      reader.close();

      return tree;
    } catch (MarshalException e) {
      System.out.println(e.getMessage());
      throw new XMLException("Unable to unmarshal " + filename, e);
    } catch (ValidationException e) {
      System.out.println(e.getMessage());
      throw new XMLException("Unable to validate " + filename, e);
    } catch (IOException e) {
      System.out.println(e.getMessage());
      throw new XMLException("Unable to open file" + filename, e);
    }
  }

}
