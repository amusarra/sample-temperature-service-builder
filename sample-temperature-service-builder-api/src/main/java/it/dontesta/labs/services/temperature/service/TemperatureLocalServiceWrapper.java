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
 * Provides a wrapper for {@link TemperatureLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureLocalService
 * @generated
 */
@ProviderType
public class TemperatureLocalServiceWrapper implements TemperatureLocalService,
	ServiceWrapper<TemperatureLocalService> {
	public TemperatureLocalServiceWrapper(
		TemperatureLocalService temperatureLocalService) {
		_temperatureLocalService = temperatureLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _temperatureLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _temperatureLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _temperatureLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _temperatureLocalService.getIndexableActionableDynamicQuery();
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

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _temperatureLocalService.getPersistedModel(primaryKeyObj);
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
	* Adds the temperature to the database. Also notifies the appropriate model listeners.
	*
	* @param temperature the temperature
	* @return the temperature that was added
	*/
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature addTemperature(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return _temperatureLocalService.addTemperature(temperature);
	}

	/**
	* Creates a new temperature with the primary key. Does not add the temperature to the database.
	*
	* @param temperatureId the primary key for the new temperature
	* @return the new temperature
	*/
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature createTemperature(
		long temperatureId) {
		return _temperatureLocalService.createTemperature(temperatureId);
	}

	/**
	* Deletes the temperature from the database. Also notifies the appropriate model listeners.
	*
	* @param temperature the temperature
	* @return the temperature that was removed
	*/
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature deleteTemperature(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return _temperatureLocalService.deleteTemperature(temperature);
	}

	/**
	* Deletes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param temperatureId the primary key of the temperature
	* @return the temperature that was removed
	* @throws PortalException if a temperature with the primary key could not be found
	*/
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature deleteTemperature(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _temperatureLocalService.deleteTemperature(temperatureId);
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature fetchTemperature(
		long temperatureId) {
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
	public it.dontesta.labs.services.temperature.model.Temperature fetchTemperatureByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _temperatureLocalService.fetchTemperatureByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature getEntry(
		long temperatureId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _temperatureLocalService.getEntry(temperatureId);
	}

	/**
	* Returns the temperature with the primary key.
	*
	* @param temperatureId the primary key of the temperature
	* @return the temperature
	* @throws PortalException if a temperature with the primary key could not be found
	*/
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature getTemperature(
		long temperatureId)
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
	public it.dontesta.labs.services.temperature.model.Temperature getTemperatureByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _temperatureLocalService.getTemperatureByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the temperature in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param temperature the temperature
	* @return the temperature that was updated
	*/
	@Override
	public it.dontesta.labs.services.temperature.model.Temperature updateTemperature(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return _temperatureLocalService.updateTemperature(temperature);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _temperatureLocalService.getOSGiServiceIdentifier();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _temperatureLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getEntries(
		java.lang.String deviceId, int start, int end) {
		return _temperatureLocalService.getEntries(deviceId, start, end);
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
	@Override
	public java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getTemperatures(
		int start, int end) {
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
	public java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getTemperaturesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _temperatureLocalService.getTemperaturesByUuidAndCompanyId(uuid,
			companyId);
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
	public java.util.List<it.dontesta.labs.services.temperature.model.Temperature> getTemperaturesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<it.dontesta.labs.services.temperature.model.Temperature> orderByComparator) {
		return _temperatureLocalService.getTemperaturesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _temperatureLocalService.dynamicQueryCount(dynamicQuery,
			projection);
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