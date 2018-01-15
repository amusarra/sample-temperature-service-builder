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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Temperature. This utility wraps
 * {@link it.dontesta.labs.services.temperature.service.impl.TemperatureServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureService
 * @see it.dontesta.labs.services.temperature.service.base.TemperatureServiceBaseImpl
 * @see it.dontesta.labs.services.temperature.service.impl.TemperatureServiceImpl
 * @generated
 */
@ProviderType
public class TemperatureServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.dontesta.labs.services.temperature.service.impl.TemperatureServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static it.dontesta.labs.services.temperature.model.Temperature getEntry(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEntry(temperatureId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getEntries(
		java.lang.String deviceId, int start, int end) {
		return getService().getEntries(deviceId, start, end);
	}

	public static TemperatureService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TemperatureService, TemperatureService> _serviceTracker =
		ServiceTrackerFactory.open(TemperatureService.class);
}