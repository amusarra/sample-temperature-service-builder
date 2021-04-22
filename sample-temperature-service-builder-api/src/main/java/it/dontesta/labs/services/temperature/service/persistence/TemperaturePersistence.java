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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.dontesta.labs.services.temperature.exception.NoSuchTemperatureException;
import it.dontesta.labs.services.temperature.model.Temperature;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the temperature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TemperatureUtil
 * @generated
 */
@ProviderType
public interface TemperaturePersistence extends BasePersistence<Temperature> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TemperatureUtil} to access the temperature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the temperatures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching temperatures
	 */
	public java.util.List<Temperature> findByUuid(String uuid);

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
	public java.util.List<Temperature> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Temperature> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

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
	public java.util.List<Temperature> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where uuid = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public Temperature[] findByUuid_PrevAndNext(
			long temperatureId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Removes all the temperatures where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of temperatures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching temperatures
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTemperatureException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findByUUID_G(String uuid, long groupId)
		throws NoSuchTemperatureException;

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the temperature where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the temperature that was removed
	 */
	public Temperature removeByUUID_G(String uuid, long groupId)
		throws NoSuchTemperatureException;

	/**
	 * Returns the number of temperatures where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching temperatures
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching temperatures
	 */
	public java.util.List<Temperature> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Temperature> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Temperature> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

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
	public java.util.List<Temperature> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

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
	public Temperature[] findByUuid_C_PrevAndNext(
			long temperatureId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Removes all the temperatures where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching temperatures
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the temperatures where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the matching temperatures
	 */
	public java.util.List<Temperature> findBydeviceId(String deviceId);

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
	public java.util.List<Temperature> findBydeviceId(
		String deviceId, int start, int end);

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
	public java.util.List<Temperature> findBydeviceId(
		String deviceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

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
	public java.util.List<Temperature> findBydeviceId(
		String deviceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findBydeviceId_First(
			String deviceId,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the first temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchBydeviceId_First(
		String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the last temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findBydeviceId_Last(
			String deviceId,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the last temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchBydeviceId_Last(
		String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public Temperature[] findBydeviceId_PrevAndNext(
			long temperatureId, String deviceId,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Removes all the temperatures where deviceId = &#63; from the database.
	 *
	 * @param deviceId the device ID
	 */
	public void removeBydeviceId(String deviceId);

	/**
	 * Returns the number of temperatures where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the number of matching temperatures
	 */
	public int countBydeviceId(String deviceId);

	/**
	 * Returns all the temperatures where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching temperatures
	 */
	public java.util.List<Temperature> findBystatus(int status);

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
	public java.util.List<Temperature> findBystatus(
		int status, int start, int end);

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
	public java.util.List<Temperature> findBystatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

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
	public java.util.List<Temperature> findBystatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findBystatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the first temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchBystatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the last temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	public Temperature findBystatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Returns the last temperature in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	public Temperature fetchBystatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

	/**
	 * Returns the temperatures before and after the current temperature in the ordered set where status = &#63;.
	 *
	 * @param temperatureId the primary key of the current temperature
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public Temperature[] findBystatus_PrevAndNext(
			long temperatureId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Temperature>
				orderByComparator)
		throws NoSuchTemperatureException;

	/**
	 * Removes all the temperatures where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBystatus(int status);

	/**
	 * Returns the number of temperatures where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching temperatures
	 */
	public int countBystatus(int status);

	/**
	 * Caches the temperature in the entity cache if it is enabled.
	 *
	 * @param temperature the temperature
	 */
	public void cacheResult(Temperature temperature);

	/**
	 * Caches the temperatures in the entity cache if it is enabled.
	 *
	 * @param temperatures the temperatures
	 */
	public void cacheResult(java.util.List<Temperature> temperatures);

	/**
	 * Creates a new temperature with the primary key. Does not add the temperature to the database.
	 *
	 * @param temperatureId the primary key for the new temperature
	 * @return the new temperature
	 */
	public Temperature create(long temperatureId);

	/**
	 * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature that was removed
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public Temperature remove(long temperatureId)
		throws NoSuchTemperatureException;

	public Temperature updateImpl(Temperature temperature);

	/**
	 * Returns the temperature with the primary key or throws a <code>NoSuchTemperatureException</code> if it could not be found.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	public Temperature findByPrimaryKey(long temperatureId)
		throws NoSuchTemperatureException;

	/**
	 * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
	 */
	public Temperature fetchByPrimaryKey(long temperatureId);

	/**
	 * Returns all the temperatures.
	 *
	 * @return the temperatures
	 */
	public java.util.List<Temperature> findAll();

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
	public java.util.List<Temperature> findAll(int start, int end);

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
	public java.util.List<Temperature> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator);

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
	public java.util.List<Temperature> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the temperatures from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of temperatures.
	 *
	 * @return the number of temperatures
	 */
	public int countAll();

}