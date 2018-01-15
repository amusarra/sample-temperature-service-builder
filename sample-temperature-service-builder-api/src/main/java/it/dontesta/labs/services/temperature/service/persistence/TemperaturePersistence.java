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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.dontesta.labs.services.temperature.exception.NoSuchTemperatureException;
import it.dontesta.labs.services.temperature.model.Temperature;

/**
 * The persistence interface for the temperature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.dontesta.labs.services.temperature.service.persistence.impl.TemperaturePersistenceImpl
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
	public java.util.List<Temperature> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the temperatures where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @return the range of matching temperatures
	*/
	public java.util.List<Temperature> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the temperatures where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temperatures
	*/
	public java.util.List<Temperature> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns an ordered range of all the temperatures where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching temperatures
	*/
	public java.util.List<Temperature> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first temperature in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Returns the first temperature in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns the last temperature in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Returns the last temperature in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns the temperatures before and after the current temperature in the ordered set where uuid = &#63;.
	*
	* @param temperatureId the primary key of the current temperature
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temperature
	* @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	*/
	public Temperature[] findByUuid_PrevAndNext(long temperatureId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Removes all the temperatures where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of temperatures where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching temperatures
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the temperature where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTemperatureException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTemperatureException;

	/**
	* Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the temperature where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the temperature that was removed
	*/
	public Temperature removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTemperatureException;

	/**
	* Returns the number of temperatures where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching temperatures
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the temperatures where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching temperatures
	*/
	public java.util.List<Temperature> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the temperatures where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @return the range of matching temperatures
	*/
	public java.util.List<Temperature> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the temperatures where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temperatures
	*/
	public java.util.List<Temperature> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns an ordered range of all the temperatures where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching temperatures
	*/
	public java.util.List<Temperature> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

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
	public Temperature[] findByUuid_C_PrevAndNext(long temperatureId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Removes all the temperatures where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of temperatures where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching temperatures
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the temperatures where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the matching temperatures
	*/
	public java.util.List<Temperature> findBydeviceId(java.lang.String deviceId);

	/**
	* Returns a range of all the temperatures where deviceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deviceId the device ID
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @return the range of matching temperatures
	*/
	public java.util.List<Temperature> findBydeviceId(
		java.lang.String deviceId, int start, int end);

	/**
	* Returns an ordered range of all the temperatures where deviceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deviceId the device ID
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temperatures
	*/
	public java.util.List<Temperature> findBydeviceId(
		java.lang.String deviceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns an ordered range of all the temperatures where deviceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deviceId the device ID
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching temperatures
	*/
	public java.util.List<Temperature> findBydeviceId(
		java.lang.String deviceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first temperature in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findBydeviceId_First(java.lang.String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Returns the first temperature in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchBydeviceId_First(java.lang.String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns the last temperature in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temperature
	* @throws NoSuchTemperatureException if a matching temperature could not be found
	*/
	public Temperature findBydeviceId_Last(java.lang.String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Returns the last temperature in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	*/
	public Temperature fetchBydeviceId_Last(java.lang.String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns the temperatures before and after the current temperature in the ordered set where deviceId = &#63;.
	*
	* @param temperatureId the primary key of the current temperature
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temperature
	* @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	*/
	public Temperature[] findBydeviceId_PrevAndNext(long temperatureId,
		java.lang.String deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException;

	/**
	* Removes all the temperatures where deviceId = &#63; from the database.
	*
	* @param deviceId the device ID
	*/
	public void removeBydeviceId(java.lang.String deviceId);

	/**
	* Returns the number of temperatures where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the number of matching temperatures
	*/
	public int countBydeviceId(java.lang.String deviceId);

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
	* Returns the temperature with the primary key or throws a {@link NoSuchTemperatureException} if it could not be found.
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

	@Override
	public java.util.Map<java.io.Serializable, Temperature> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temperatures
	*/
	public java.util.List<Temperature> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator);

	/**
	* Returns an ordered range of all the temperatures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TemperatureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temperatures
	* @param end the upper bound of the range of temperatures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of temperatures
	*/
	public java.util.List<Temperature> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache);

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

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}