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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.dontesta.labs.services.temperature.model.Temperature;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Temperature. This utility wraps
 * <code>it.dontesta.labs.services.temperature.service.impl.TemperatureLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureLocalService
 * @generated
 */
public class TemperatureLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.dontesta.labs.services.temperature.service.impl.TemperatureLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the temperature to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TemperatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param temperature the temperature
	 * @return the temperature that was added
	 */
	public static Temperature addTemperature(Temperature temperature) {
		return getService().addTemperature(temperature);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new temperature with the primary key. Does not add the temperature to the database.
	 *
	 * @param temperatureId the primary key for the new temperature
	 * @return the new temperature
	 */
	public static Temperature createTemperature(long temperatureId) {
		return getService().createTemperature(temperatureId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TemperatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature that was removed
	 * @throws PortalException if a temperature with the primary key could not be found
	 */
	public static Temperature deleteTemperature(long temperatureId)
		throws PortalException {

		return getService().deleteTemperature(temperatureId);
	}

	/**
	 * Deletes the temperature from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TemperatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param temperature the temperature
	 * @return the temperature that was removed
	 */
	public static Temperature deleteTemperature(Temperature temperature) {
		return getService().deleteTemperature(temperature);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
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
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Temperature fetchTemperature(long temperatureId) {
		return getService().fetchTemperature(temperatureId);
	}

	/**
	 * Returns the temperature matching the UUID and group.
	 *
	 * @param uuid the temperature's UUID
	 * @param groupId the primary key of the group
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchTemperatureByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchTemperatureByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<Temperature> getEntries(
		String deviceId, int start, int end) {

		return getService().getEntries(deviceId, start, end);
	}

	public static Temperature getEntry(long temperatureId)
		throws PortalException {

		return getService().getEntry(temperatureId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the temperature with the primary key.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature
	 * @throws PortalException if a temperature with the primary key could not be found
	 */
	public static Temperature getTemperature(long temperatureId)
		throws PortalException {

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
	public static Temperature getTemperatureByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getTemperatureByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the temperatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @return the range of temperatures
	 */
	public static List<Temperature> getTemperatures(int start, int end) {
		return getService().getTemperatures(start, end);
	}

	/**
	 * Returns all the temperatures matching the UUID and company.
	 *
	 * @param uuid the UUID of the temperatures
	 * @param companyId the primary key of the company
	 * @return the matching temperatures, or an empty list if no matches were found
	 */
	public static List<Temperature> getTemperaturesByUuidAndCompanyId(
		String uuid, long companyId) {

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
	public static List<Temperature> getTemperaturesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {

		return getService().getTemperaturesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
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
	 * Updates the temperature in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TemperatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param temperature the temperature
	 * @return the temperature that was updated
	 */
	public static Temperature updateTemperature(Temperature temperature) {
		return getService().updateTemperature(temperature);
	}

	public static TemperatureLocalService getService() {
		return _service;
	}

	private static volatile TemperatureLocalService _service;

}