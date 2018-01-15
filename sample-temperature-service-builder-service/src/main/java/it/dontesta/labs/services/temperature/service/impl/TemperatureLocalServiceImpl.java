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
import java.util.UUID;

import com.liferay.portal.kernel.exception.PortalException;

import it.dontesta.labs.services.temperature.model.Temperature;
import it.dontesta.labs.services.temperature.service.base.TemperatureLocalServiceBaseImpl;

/**
 * The implementation of the temperature local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.dontesta.labs.services.temperature.service.TemperatureLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureLocalServiceBaseImpl
 * @see it.dontesta.labs.services.temperature.service.TemperatureLocalServiceUtil
 */
public class TemperatureLocalServiceImpl extends TemperatureLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link it.dontesta.labs.services.temperature.service.TemperatureLocalServiceUtil} to access the temperature local service.
	 */
	
	@Override
	public List<Temperature> getEntries(String deviceId, int start, int end) {
		return temperaturePersistence.findBydeviceId(deviceId, start, end);
	}

	@Override
	public Temperature getEntry(long temperatureId) throws PortalException {
		long entryId = counterLocalService.increment();
		Temperature temperatureEntry = temperaturePersistence.create(entryId);
		
		temperatureEntry.setDeviceId(UUID.randomUUID().toString());
		temperatureEntry.setValue((int)(Math.random() * ((50 - 10) + 1)) + 10);
		
		return temperatureEntry;
	}

}