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
 * Provides the local service utility for Temperature. This utility wraps
 * {@link it.dontesta.labs.services.temperature.service.impl.TemperatureLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureLocalService
 * @see it.dontesta.labs.services.temperature.service.base.TemperatureLocalServiceBaseImpl
 * @see it.dontesta.labs.services.temperature.service.impl.TemperatureLocalServiceImpl
 * @generated
 */
@ProviderType
public class TemperatureLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.dontesta.labs.services.temperature.service.impl.TemperatureLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of temperatures.
	*
	* @return the number of temperatures
	*/
	public static int getTemperaturesCount() {
		return getService().getTemperaturesCount();
	}

	/**
	* Adds the temperature to the database. Also notifies the appropriate model listeners.
	*
	* @param temperature the temperature
	* @return the temperature that was added
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature addTemperature(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return getService().addTemperature(temperature);
	}

	/**
	* Creates a new temperature with the primary key. Does not add the temperature to the database.
	*
	* @param temperatureId the primary key for the new temperature
	* @return the new temperature
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature createTemperature(
		long temperatureId) {
		return getService().createTemperature(temperatureId);
	}

	/**
	* Deletes the temperature from the database. Also notifies the appropriate model listeners.
	*
	* @param temperature the temperature
	* @return the temperature that was removed
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature deleteTemperature(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return getService().deleteTemperature(temperature);
	}

	/**
	* Deletes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param temperatureId the primary key of the temperature
	* @return the temperature that was removed
	* @throws PortalException if a temperature with the primary key could not be found
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature deleteTemperature(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTemperature(temperatureId);
	}

	public static it.dontesta.labs.services.temperature.model.Temperature fetchTemperature(
		long temperatureId) {
		return getService().fetchTemperature(temperatureId);
	}

	/**
	* Returns the temperature matching the UUID and group.
	*
	* @param uuid the temperature's UUID
	* @param groupId the primary key of the group
	* @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature fetchTemperatureByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchTemperatureByUuidAndGroupId(uuid, groupId);
	}

	public static it.dontesta.labs.services.temperature.model.Temperature getEntry(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEntry(temperatureId);
	}

	/**
	* Returns the temperature with the primary key.
	*
	* @param temperatureId the primary key of the temperature
	* @return the temperature
	* @throws PortalException if a temperature with the primary key could not be found
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature getTemperature(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTemperature(temperatureId);
	}

	/**
	* Returns the temperature matching the UUID and group.
	*
	* @param uuid the temperature's UUID
	* @param groupId the primary key of the group
	* @return the matching temperature
	* @throws PortalException if a matching temperature could not be found
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature getTemperatureByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTemperatureByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the temperature in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param temperature the temperature
	* @return the temperature that was updated
	*/
	public static it.dontesta.labs.services.temperature.model.Temperature updateTemperature(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return getService().updateTemperature(temperature);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getEntries(
		java.lang.String deviceId, int start, int end) {
		return getService().getEntries(deviceId, start, end);
	}

	/**
	* Returns a range of all the temperatures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @return the range of temperatures
	*/
	public static java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getTemperatures(
		int start, int end) {
		return getService().getTemperatures(start, end);
	}

	/**
	* Returns all the temperatures matching the UUID and company.
	*
	* @param uuid the UUID of the temperatures
	* @param companyId the primary key of the company
	* @return the matching temperatures, or an empty list if no matches were found
	*/
	public static java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getTemperaturesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getTemperaturesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of temperatures matching the UUID and company.
	*
	* @param uuid the UUID of the temperatures
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching temperatures, or an empty list if no matches were found
	*/
	public static java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getTemperaturesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<it.dontesta.labs.services.temperature.model.Temperature> orderByComparator) {
		return getService()
				   .getTemperaturesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TemperatureLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TemperatureLocalService, TemperatureLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TemperatureLocalService.class);
}