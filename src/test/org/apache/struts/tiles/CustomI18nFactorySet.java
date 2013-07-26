/*
 * $Id: CustomI18nFactorySet.java 267475 2005-09-03 15:55:40Z niallp $ 
 *
 * Copyright 2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.struts.tiles;

import java.util.Map;
import java.util.Locale;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import org.apache.struts.tiles.xmlDefinition.I18nFactorySet;
/**
 * <p>Test I18nFactorySet.</p>
 *
 * @version $Rev: 267475 $ $Date: 2005-09-04 00:55:40 +0900 (日, 04  9月 2005) $
 */

public class CustomI18nFactorySet extends I18nFactorySet {

    /**
     * Constructor.
     * Init the factory by reading appropriate configuration file.
     * @param servletContext Servlet context.
     * @param properties Map containing all properties.
     * @throws FactoryNotFoundException Can't find factory configuration file.
     */
    public CustomI18nFactorySet(ServletContext servletContext, Map properties)
        throws DefinitionsFactoryException {
        super(servletContext, properties);
    }

    public org.apache.struts.tiles.xmlDefinition.DefinitionsFactory createFactory(
        Object key,
        ServletRequest request,
        ServletContext servletContext)
        throws DefinitionsFactoryException {
        return super.createFactory(key, request, servletContext);
    }



}

