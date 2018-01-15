/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.dontesta.labs.services.temperature.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;

import it.dontesta.labs.services.temperature.model.Temperature;
import it.dontesta.labs.services.temperature.service.base.TemperatureServiceBaseImpl;

/**
 * The implementation of the temperature remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.dontesta.labs.services.temperature.service.TemperatureService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureServiceBaseImpl
 * @see it.dontesta.labs.services.temperature.service.TemperatureServiceUtil
 */
public class TemperatureServiceImpl extends TemperatureServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link it.dontesta.labs.services.temperature.service.TemperatureServiceUtil} to access the temperature remote service.
	 */
	@Override
	public List<Temperature> getEntries(String deviceId, int start, int end) {
		// @TODO Add Code for Permission Checker
		
		return temperatureLocalService.getEntries(deviceId, start, end);
	}

	@Override
	public Temperature getEntry(long temperatureId) throws PortalException {
		// @TODO Add Code for Permission Checker

		return temperatureLocalService.getEntry(temperatureId);
	}
	
}