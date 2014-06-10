/*
 *                        AT&T - PROPRIETARY
 *          THIS FILE CONTAINS PROPRIETARY INFORMATION OF
 *        AT&T AND IS NOT TO BE DISCLOSED OR USED EXCEPT IN
 *             ACCORDANCE WITH APPLICABLE AGREEMENTS.
 *
 *          Copyright (c) 2013 AT&T Knowledge Ventures
 *              Unpublished and Not for Publication
 *                     All Rights Reserved
 */
package com.att.research.xacmlatt.pdp.util;

import com.att.research.xacml.util.XACMLProperties;

public class ATTPDPProperties extends XACMLProperties {
	public static final String PROP_EVALUATIONCONTEXTFACTORY	= "xacml.att.evaluationContextFactory";
	public static final String PROP_COMBININGALGORITHMFACTORY	= "xacml.att.combiningAlgorithmFactory";
	public static final String PROP_FUNCTIONDEFINITIONFACTORY	= "xacml.att.functionDefinitionFactory";
	public static final String PROP_POLICYFINDERFACTORY			= "xacml.att.policyFinderFactory";
	
	protected ATTPDPProperties() {
	}

}
