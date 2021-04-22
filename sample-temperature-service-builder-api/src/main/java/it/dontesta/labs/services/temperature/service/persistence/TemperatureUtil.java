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

package it.dontesta.labs.services.temperature.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.dontesta.labs.services.temperature.model.Temperature;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the temperature service. This utility wraps <code>it.dontesta.labs.services.temperature.service.persistence.impl.TemperaturePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TemperaturePersistence
 * @generated
 */
public class TemperatureUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Temperature temperature) {
		getPersistence().clearCache(temperature);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Temperature> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Temperature> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Temperature> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Temperature> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Temperature update(Temperature temperature) {
		return getPersistence().update(temperature);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Temperature update(
		Temperature temperature, ServiceContext serviceContext) {

		return getPersistence().update(temperature, serviceContext);
	}

	/**
	 * Returns all the temperatures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching temperatures
	 */
	public static List<Temperature> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the temperatures where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @return the range of matching temperatures
	 */
	public static List<Temperature> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the temperatures where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the temperatures where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Temperature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findByUuid_First(
			String uuid, OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchByUuid_First(
		String uuid, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findByUuid_Last(
			String uuid, OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchByUuid_Last(
		String uuid, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where uuid = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public static Temperature[] findByUuid_PrevAndNext(
			long temperatureId, String uuid,
			OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUuid_PrevAndNext(
			temperatureId, uuid, orderByComparator);
	}

	/**
	 * Removes all the temperatures where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of temperatures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching temperatures
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTemperatureException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findByUUID_G(String uuid, long groupId)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the temperature where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the temperature that was removed
	 */
	public static Temperature removeByUUID_G(String uuid, long groupId)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of temperatures where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching temperatures
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching temperatures
	 */
	public static List<Temperature> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @return the range of matching temperatures
	 */
	public static List<Temperature> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Temperature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public static Temperature[] findByUuid_C_PrevAndNext(
			long temperatureId, String uuid, long companyId,
			OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByUuid_C_PrevAndNext(
			temperatureId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the temperatures where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching temperatures
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the temperatures where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the matching temperatures
	 */
	public static List<Temperature> findBydeviceId(String deviceId) {
		return getPersistence().findBydeviceId(deviceId);
	}

	/**
	 * Returns a range of all the temperatures where deviceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param deviceId the device ID
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @return the range of matching temperatures
	 */
	public static List<Temperature> findBydeviceId(
		String deviceId, int start, int end) {

		return getPersistence().findBydeviceId(deviceId, start, end);
	}

	/**
	 * Returns an ordered range of all the temperatures where deviceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param deviceId the device ID
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findBydeviceId(
		String deviceId, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().findBydeviceId(
			deviceId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the temperatures where deviceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param deviceId the device ID
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findBydeviceId(
		String deviceId, int start, int end,
		OrderByComparator<Temperature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBydeviceId(
			deviceId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findBydeviceId_First(
			String deviceId, OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findBydeviceId_First(
			deviceId, orderByComparator);
	}

	/**
	 * Returns the first temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchBydeviceId_First(
		String deviceId, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchBydeviceId_First(
			deviceId, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findBydeviceId_Last(
			String deviceId, OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findBydeviceId_Last(
			deviceId, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchBydeviceId_Last(
		String deviceId, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchBydeviceId_Last(
			deviceId, orderByComparator);
	}

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public static Temperature[] findBydeviceId_PrevAndNext(
			long temperatureId, String deviceId,
			OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findBydeviceId_PrevAndNext(
			temperatureId, deviceId, orderByComparator);
	}

	/**
	 * Removes all the temperatures where deviceId = &#63; from the database.
	 *
	 * @param deviceId the device ID
	 */
	public static void removeBydeviceId(String deviceId) {
		getPersistence().removeBydeviceId(deviceId);
	}

	/**
	 * Returns the number of temperatures where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the number of matching temperatures
	 */
	public static int countBydeviceId(String deviceId) {
		return getPersistence().countBydeviceId(deviceId);
	}

	/**
	 * Returns all the temperatures where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching temperatures
	 */
	public static List<Temperature> findBystatus(int status) {
		return getPersistence().findBystatus(status);
	}

	/**
	 * Returns a range of all the temperatures where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @return the range of matching temperatures
	 */
	public static List<Temperature> findBystatus(
		int status, int start, int end) {

		return getPersistence().findBystatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the temperatures where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findBystatus(
		int status, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().findBystatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the temperatures where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching temperatures
	 */
	public static List<Temperature> findBystatus(
		int status, int start, int end,
		OrderByComparator<Temperature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBystatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findBystatus_First(
			int status, OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchBystatus_First(
		int status, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public static Temperature findBystatus_Last(
			int status, OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public static Temperature fetchBystatus_Last(
		int status, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where status = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public static Temperature[] findBystatus_PrevAndNext(
			long temperatureId, int status,
			OrderByComparator<Temperature> orderByComparator)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findBystatus_PrevAndNext(
			temperatureId, status, orderByComparator);
	}

	/**
	 * Removes all the temperatures where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBystatus(int status) {
		getPersistence().removeBystatus(status);
	}

	/**
	 * Returns the number of temperatures where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching temperatures
	 */
	public static int countBystatus(int status) {
		return getPersistence().countBystatus(status);
	}

	/**
	 * Caches the temperature in the entity cache if it is enabled.
	 *
	 * @param temperature the temperature
	 */
	public static void cacheResult(Temperature temperature) {
		getPersistence().cacheResult(temperature);
	}

	/**
	 * Caches the temperatures in the entity cache if it is enabled.
	 *
	 * @param temperatures the temperatures
	 */
	public static void cacheResult(List<Temperature> temperatures) {
		getPersistence().cacheResult(temperatures);
	}

	/**
	 * Creates a new temperature with the primary key. Does not add the temperature to the database.
	 *
	 * @param temperatureId the primary key for the new temperature
	 * @return the new temperature
	 */
	public static Temperature create(long temperatureId) {
		return getPersistence().create(temperatureId);
	}

	/**
	 * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature that was removed
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public static Temperature remove(long temperatureId)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().remove(temperatureId);
	}

	public static Temperature updateImpl(Temperature temperature) {
		return getPersistence().updateImpl(temperature);
	}

	/**
	 * Returns the temperature with the primary key or throws a <code>NoSuchTemperatureException</code> if it could not be found.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public static Temperature findByPrimaryKey(long temperatureId)
		throws it.dontesta.labs.services.temperature.exception.
			NoSuchTemperatureException {

		return getPersistence().findByPrimaryKey(temperatureId);
	}

	/**
	 * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
	 */
	public static Temperature fetchByPrimaryKey(long temperatureId) {
		return getPersistence().fetchByPrimaryKey(temperatureId);
	}

	/**
	 * Returns all the temperatures.
	 *
	 * @return the temperatures
	 */
	public static List<Temperature> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the temperatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @return the range of temperatures
	 */
	public static List<Temperature> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the temperatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temperatures
	 */
	public static List<Temperature> findAll(
		int start, int end, OrderByComparator<Temperature> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the temperatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TemperatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of temperatures
	 * @param end the upper bound of the range of temperatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of temperatures
	 */
	public static List<Temperature> findAll(
		int start, int end, OrderByComparator<Temperature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the temperatures from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of temperatures.
	 *
	 * @return the number of temperatures
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TemperaturePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<TemperaturePersistence, TemperaturePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TemperaturePersistence.class);

		ServiceTracker<TemperaturePersistence, TemperaturePersistence>
			serviceTracker =
				new ServiceTracker
					<TemperaturePersistence, TemperaturePersistence>(
						bundle.getBundleContext(), TemperaturePersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}