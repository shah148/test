/*******************************************************************************
 * Copyright (c) 2013-2015 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thierry Monteil (Project co-founder) - Management and initial specification,
 *         conception and documentation.
 *     Mahdi Ben Alaya (Project co-founder) - Management and initial specification,
 *         conception, implementation, test and documentation.
 *     Khalil Drira - Management and initial specification.
 *     Guillaume Garzone - Initial specification, conception, implementation, test
 *         and documentation.
 *     François Aïssaoui - Initial specification, conception, implementation, test
 *         and documentation.
 *******************************************************************************/
package org.eclipse.om2m.commons.constants;

import java.math.BigInteger;

/**
 * Constants for Response types
 *
 */
public class ResponseType {
	
	/** Private constructor */
	private ResponseType(){}
	
	public static final BigInteger NON_BLOCKING_REQUEST_SYNCH = BigInteger.valueOf(1);
	public static final BigInteger NON_BLOCKING_REQUEST_ASYNCH = BigInteger.valueOf(2);
	public static final BigInteger BLOCKING_REQUEST = BigInteger.valueOf(3);
	

}