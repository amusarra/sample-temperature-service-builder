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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TemperatureLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureLocalService
 * @generated
 */
public class TemperatureLocalServiceWrapper
	implements ServiceWrapper<TemperatureLocalService>,
			   TemperatureLocalService {

	public TemperatureLocalServiceWrapper(
		TemperatureLocalService temperatureLocalService) {

		_temperatureLocalService = temperatureLocalService;
	}

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
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
		addTemperature(
			it.dontesta.labs.services.temperature.model.Temperature
				temperature) {

		return _temperatureLocalService.addTemperature(temperature);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new temperature with the primary key. Does not add the temperature to the database.
	 *
	 * @param temperatureId the primary key for the new temperature
	 * @return the new temperature
	 */
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
		createTemperature(long temperatureId) {

		return _temperatureLocalService.createTemperature(temperatureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
			deleteTemperature(long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.deleteTemperature(temperatureId);
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
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
		deleteTemperature(
			it.dontesta.labs.services.temperature.model.Temperature
				temperature) {

		return _temperatureLocalService.deleteTemperature(temperature);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _temperatureLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _temperatureLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _temperatureLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _temperatureLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _temperatureLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _temperatureLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
		fetchTemperature(long temperatureId) {

		return _temperatureLocalService.fetchTemperature(temperatureId);
	}

	/**
	 * Returns the temperature matching the UUID and group.
	 *
	 * @param uuid the temperature's UUID
	 * @param groupId the primary key of the group
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
		fetchTemperatureByUuidAndGroupId(String uuid, long groupId) {

		return _temperatureLocalService.fetchTemperatureByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _temperatureLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<it.dontesta.labs.services.temperature.model.Temperature> getEntries(
			String deviceId, int start, int end) {

		return _temperatureLocalService.getEntries(deviceId, start, end);
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature getEntry(
			long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.getEntry(temperatureId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _temperatureLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _temperatureLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _temperatureLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the temperature with the primary key.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature
	 * @throws PortalException if a temperature with the primary key could not be found
	 */
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
			getTemperature(long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.getTemperature(temperatureId);
	}

	/**
	 * Returns the temperature matching the UUID and group.
	 *
	 * @param uuid the temperature's UUID
	 * @param groupId the primary key of the group
	 * @return the matching temperature
	 * @throws PortalException if a matching temperature could not be found
	 */
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
			getTemperatureByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _temperatureLocalService.getTemperatureByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List
		<it.dontesta.labs.services.temperature.model.Temperature>
			getTemperatures(int start, int end) {

		return _temperatureLocalService.getTemperatures(start, end);
	}

	/**
	 * Returns all the temperatures matching the UUID and company.
	 *
	 * @param uuid the UUID of the temperatures
	 * @param companyId the primary key of the company
	 * @return the matching temperatures, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<it.dontesta.labs.services.temperature.model.Temperature>
			getTemperaturesByUuidAndCompanyId(String uuid, long companyId) {

		return _temperatureLocalService.getTemperaturesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List
		<it.dontesta.labs.services.temperature.model.Temperature>
			getTemperaturesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<it.dontesta.labs.services.temperature.model.Temperature>
						orderByComparator) {

		return _temperatureLocalService.getTemperaturesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of temperatures.
	 *
	 * @return the number of temperatures
	 */
	@Override
	public int getTemperaturesCount() {
		return _temperatureLocalService.getTemperaturesCount();
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
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature
		updateTemperature(
			it.dontesta.labs.services.temperature.model.Temperature
				temperature) {

		return _temperatureLocalService.updateTemperature(temperature);
	}

	@Override
	public TemperatureLocalService getWrappedService() {
		return _temperatureLocalService;
	}

	@Override
	public void setWrappedService(
		TemperatureLocalService temperatureLocalService) {

		_temperatureLocalService = temperatureLocalService;
	}

	private TemperatureLocalService _temperatureLocalService;

}