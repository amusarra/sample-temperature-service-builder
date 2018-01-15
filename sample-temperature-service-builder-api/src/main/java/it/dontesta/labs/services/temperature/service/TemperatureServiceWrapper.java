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

package it.dontesta.labs.services.temperature.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TemperatureService}.
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureService
 * @generated
 */
@ProviderType
public class TemperatureServiceWrapper implements TemperatureService,
	ServiceWrapper<TemperatureService> {
	public TemperatureServiceWrapper(TemperatureService temperatureService) {
		_temperatureService = temperatureService;
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature getEntry(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _temperatureService.getEntry(temperatureId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _temperatureService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getEntries(
		java.lang.String deviceId, int start, int end) {
		return _temperatureService.getEntries(deviceId, start, end);
	}

	@Override
	public TemperatureService getWrappedService() {
		return _temperatureService;
	}

	@Override
	public void setWrappedService(TemperatureService temperatureService) {
		_temperatureService = temperatureService;
	}

	private TemperatureService _temperatureService;
}