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

import java.util.Calendar;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;
import org.apache.velocity.texen.ant.TexenTask;

import com.tomtessier.applications.generator.xml.Generator;

public class GeneratorTask extends TexenTask {

    /**
     * 	Called from build.xml
     *  XML that describes the database model, this is transformed
     *  into the application model object.
     */
    private String xmlFile;


    /**
     * Get the xml schema describing the application model.
     *
     * @return  String xml schema file.
     */
    public String getXmlFile()
    {
        return xmlFile;
    }

    /**
     * Set the xml schema describing the application model.
     *
     * @param xmlFile The new XmlFile value
     */
    public void setXmlFile(String xmlFile)
    {
        this.xmlFile = project.resolveFile(xmlFile).toString();
    }

    /**
     * Set up the initial context for the templates 
     *
     * @return the context
     * @throws Exception
     */
    public Context initControlContext() throws Exception
    {
        GeneratorDAO dao = new GeneratorDAO();
        Generator generator = dao.load(xmlFile);

        VelocityContext context = new VelocityContext();

        // Place our generator model into the context for use in our templates
        context.put("root", generator);
        context.put("package", generator.getBuildInformation().getPackage());
        context.put("module", generator.getBuildInformation().getModule());
        context.put("build", generator.getBuildInformation());
        context.put("application", generator.getApplicationInformation());
        context.put("date", Calendar.getInstance());
        context.put("year", String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        
        System.out.println("VelocityContext " + context);	
        
        return context;
    }

}