/* ZkSpringNamespaceHandler.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Oct 2, 2008 2:40:59 PM, Created by henrichen
}}IS_NOTE

Copyright (C) 2008 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.spring.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Registers the bean definition parsers for the ZK + Spring namespace.
 * (http://www.zkoss.org/2008/zkspring"). 
 * @author henrichen
 * @since 1.0
 */
public class ZkSpringNamespaceHandler extends NamespaceHandlerSupport {
	public void init() {
		registerBeanDefinitionParser("zk-config", new ZkConfigDefinitionParser());
	}
}
