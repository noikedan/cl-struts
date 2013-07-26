/*
 * $Id: SessionActionMapping.java 54929 2004-10-16 16:38:42Z germuska $ 
 *
 * Copyright 2000-2004 The Apache Software Foundation.
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


package org.apache.struts.action;


/**
 * <p>Subclass of <code>ActionMapping</code> that defaults the form bean
 * scope to <code>session</code>.</p>
 *
 * @version $Rev: 54929 $ $Date: 2004-10-17 01:38:42 +0900 (日, 17 10月 2004) $
 */

public class SessionActionMapping extends ActionMapping {


    /**
     * <p>Construct a new instance of this class with the desired default
     * form bean scope.</p>
     */
    public SessionActionMapping() {

        super();
        setScope("session");

    }

}
