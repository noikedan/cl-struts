/*
 * $Id: MockServletContext.java 54929 2004-10-16 16:38:42Z germuska $ 
 *
 * Copyright 1999-2004 The Apache Software Foundation.
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


package org.apache.struts.mock;


import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * <p>Mock <strong>ServletContext</strong> object for low-level unit tests
 * of Struts controller components.  Coarser grained tests should be
 * implemented in terms of the Cactus framework, instead of the mock
 * object classes.</p>
 *
 * <p><strong>WARNING</strong> - Only the minimal set of methods needed to
 * create unit tests is provided, plus additional methods to configure this
 * object as necessary.  Methods for unsupported operations will throw
 * <code>UnsupportedOperationException</code>.</p>
 *
 * <p><strong>WARNING</strong> - Because unit tests operate in a single
 * threaded environment, no synchronization is performed.</p>
 *
 * @version $Rev: 54929 $ $Date: 2004-10-17 01:38:42 +0900 (日, 17 10月 2004) $
 */

public class MockServletContext implements ServletContext {



    // ----------------------------------------------------- Instance Variables


    /**
     * The set of servlet context attributes.
     */
    protected HashMap attributes = new HashMap();


    /**
     * Default destination for <code>log()</code> output.
     */
    protected Log log = LogFactory.getLog(MockServletContext.class);


    /**
     * The set of context initialization parameters.
     */
    protected HashMap parameters = new HashMap();


    // --------------------------------------------------------- Public Methods


    public void addInitParameter(String name, String value) {
        parameters.put(name, value);
    }


    public void setLog(Log log) {
        this.log = log;
    }



    // ------------------------------------------------- ServletContext Methods


    public Object getAttribute(String name) {
        return (attributes.get(name));
    }


    public Enumeration getAttributeNames() {
        return (new MockEnumeration(attributes.keySet().iterator()));
    }


    public ServletContext getContext(String uripath) {
        throw new UnsupportedOperationException();
    }


    public String getInitParameter(String name) {
        return ((String) parameters.get(name));
    }


    public Enumeration getInitParameterNames() {
        return (new MockEnumeration(parameters.keySet().iterator()));
    }


    public int getMajorVersion() {
        return (2);
    }


    public String getMimeType(String file) {
        throw new UnsupportedOperationException();
    }


    public int getMinorVersion() {
        return (3);
    }


    public RequestDispatcher getNamedDispatcher(String name) {
        throw new UnsupportedOperationException();
    }


    public String getRealPath(String path) {
        throw new UnsupportedOperationException();
    }


    public RequestDispatcher getRequestDispatcher(String path) {
        throw new UnsupportedOperationException();
    }


    public URL getResource(String path) {
      return this.getClass().getResource(path);
        //throw new UnsupportedOperationException();
    }


    public InputStream getResourceAsStream(String path) {
      return this.getClass().getResourceAsStream(path);
        //throw new UnsupportedOperationException();
    }


    public Set getResourcePaths(String path) {
        throw new UnsupportedOperationException();
    }


    public String getServerInfo() {
        return ("MockServletContext/$Version$");
    }


    public Servlet getServlet(String name) {
        throw new UnsupportedOperationException();
    }


    public String getServletContextName() {
        return (getServerInfo());
    }


    public Enumeration getServletNames() {
        throw new UnsupportedOperationException();
    }


    public Enumeration getServlets() {
        throw new UnsupportedOperationException();
    }


    public void log(Exception exception, String message) {
        log(message, exception);
    }


    public void log(String message) {
        log.info(message);
    }


    public void log(String message, Throwable throwable) {
        log.error(message, throwable);
    }


    public void removeAttribute(String name) {
        attributes.remove(name);
    }


    public void setAttribute(String name, Object value) {
        if (value == null) {
            attributes.remove(name);
        } else {
            attributes.put(name, value);
        }
    }



}
