/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.fulfilmentprocess.constants.ElectronicsFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class ElectronicsFulfilmentProcessManager extends GeneratedElectronicsFulfilmentProcessManager
{
	public static final ElectronicsFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ElectronicsFulfilmentProcessManager) em.getExtension(ElectronicsFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
