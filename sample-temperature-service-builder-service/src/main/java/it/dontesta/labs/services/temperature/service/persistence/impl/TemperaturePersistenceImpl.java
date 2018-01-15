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

package it.dontesta.labs.services.temperature.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import it.dontesta.labs.services.temperature.exception.NoSuchTemperatureException;
import it.dontesta.labs.services.temperature.model.Temperature;
import it.dontesta.labs.services.temperature.model.impl.TemperatureImpl;
import it.dontesta.labs.services.temperature.model.impl.TemperatureModelImpl;
import it.dontesta.labs.services.temperature.service.persistence.TemperaturePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the temperature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TemperaturePersistence
 * @see it.dontesta.labs.services.temperature.service.persistence.TemperatureUtil
 * @generated
 */
@ProviderType
public class TemperaturePersistenceImpl extends BasePersistenceImpl<Temperature>
	implements TemperaturePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TemperatureUtil} to access the temperature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TemperatureImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TemperatureModelImpl.UUID_COLUMN_BITMASK |
			TemperatureModelImpl.DEVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temperatures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching temperatures
	 */
	@Override
	public List<Temperature> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Temperature> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Temperature> findByUuid(String uuid, int start, int end,
		OrderByComparator<Temperature> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Temperature> findByUuid(String uuid, int start, int end,
		OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Temperature> list = null;

		if (retrieveFromCache) {
			list = (List<Temperature>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Temperature temperature : list) {
					if (!Objects.equals(uuid, temperature.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TEMPERATURE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TemperatureModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	@Override
	public Temperature findByUuid_First(String uuid,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchByUuid_First(uuid, orderByComparator);

		if (temperature != null) {
			return temperature;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTemperatureException(msg.toString());
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchByUuid_First(String uuid,
		OrderByComparator<Temperature> orderByComparator) {
		List<Temperature> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	@Override
	public Temperature findByUuid_Last(String uuid,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchByUuid_Last(uuid, orderByComparator);

		if (temperature != null) {
			return temperature;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTemperatureException(msg.toString());
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchByUuid_Last(String uuid,
		OrderByComparator<Temperature> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Temperature> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Temperature[] findByUuid_PrevAndNext(long temperatureId,
		String uuid, OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = findByPrimaryKey(temperatureId);

		Session session = null;

		try {
			session = openSession();

			Temperature[] array = new TemperatureImpl[3];

			array[0] = getByUuid_PrevAndNext(session, temperature, uuid,
					orderByComparator, true);

			array[1] = temperature;

			array[2] = getByUuid_PrevAndNext(session, temperature, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Temperature getByUuid_PrevAndNext(Session session,
		Temperature temperature, String uuid,
		OrderByComparator<Temperature> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPERATURE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TemperatureModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(temperature);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Temperature> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temperatures where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Temperature temperature : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(temperature);
		}
	}

	/**
	 * Returns the number of temperatures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching temperatures
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPERATURE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "temperature.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "temperature.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(temperature.uuid IS NULL OR temperature.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TemperatureModelImpl.UUID_COLUMN_BITMASK |
			TemperatureModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTemperatureException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	@Override
	public Temperature findByUUID_G(String uuid, long groupId)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchByUUID_G(uuid, groupId);

		if (temperature == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTemperatureException(msg.toString());
		}

		return temperature;
	}

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the temperature where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Temperature) {
			Temperature temperature = (Temperature)result;

			if (!Objects.equals(uuid, temperature.getUuid()) ||
					(groupId != temperature.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TEMPERATURE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Temperature> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Temperature temperature = list.get(0);

					result = temperature;

					cacheResult(temperature);

					if ((temperature.getUuid() == null) ||
							!temperature.getUuid().equals(uuid) ||
							(temperature.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, temperature);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Temperature)result;
		}
	}

	/**
	 * Removes the temperature where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the temperature that was removed
	 */
	@Override
	public Temperature removeByUUID_G(String uuid, long groupId)
		throws NoSuchTemperatureException {
		Temperature temperature = findByUUID_G(uuid, groupId);

		return remove(temperature);
	}

	/**
	 * Returns the number of temperatures where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching temperatures
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPERATURE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "temperature.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "temperature.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(temperature.uuid IS NULL OR temperature.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "temperature.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			TemperatureModelImpl.UUID_COLUMN_BITMASK |
			TemperatureModelImpl.COMPANYID_COLUMN_BITMASK |
			TemperatureModelImpl.DEVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching temperatures
	 */
	@Override
	public List<Temperature> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Temperature> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<Temperature> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Temperature> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Temperature> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Temperature> list = null;

		if (retrieveFromCache) {
			list = (List<Temperature>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Temperature temperature : list) {
					if (!Objects.equals(uuid, temperature.getUuid()) ||
							(companyId != temperature.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TEMPERATURE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TemperatureModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Temperature findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (temperature != null) {
			return temperature;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTemperatureException(msg.toString());
	}

	/**
	 * Returns the first temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator) {
		List<Temperature> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Temperature findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (temperature != null) {
			return temperature;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTemperatureException(msg.toString());
	}

	/**
	 * Returns the last temperature in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Temperature> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Temperature[] findByUuid_C_PrevAndNext(long temperatureId,
		String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = findByPrimaryKey(temperatureId);

		Session session = null;

		try {
			session = openSession();

			Temperature[] array = new TemperatureImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, temperature, uuid,
					companyId, orderByComparator, true);

			array[1] = temperature;

			array[2] = getByUuid_C_PrevAndNext(session, temperature, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Temperature getByUuid_C_PrevAndNext(Session session,
		Temperature temperature, String uuid, long companyId,
		OrderByComparator<Temperature> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TEMPERATURE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TemperatureModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(temperature);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Temperature> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temperatures where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Temperature temperature : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(temperature);
		}
	}

	/**
	 * Returns the number of temperatures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching temperatures
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPERATURE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "temperature.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "temperature.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(temperature.uuid IS NULL OR temperature.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "temperature.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydeviceId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID =
		new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, TemperatureImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydeviceId",
			new String[] { String.class.getName() },
			TemperatureModelImpl.DEVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydeviceId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temperatures where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the matching temperatures
	 */
	@Override
	public List<Temperature> findBydeviceId(String deviceId) {
		return findBydeviceId(deviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<Temperature> findBydeviceId(String deviceId, int start, int end) {
		return findBydeviceId(deviceId, start, end, null);
	}

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
	@Override
	public List<Temperature> findBydeviceId(String deviceId, int start,
		int end, OrderByComparator<Temperature> orderByComparator) {
		return findBydeviceId(deviceId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Temperature> findBydeviceId(String deviceId, int start,
		int end, OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID;
			finderArgs = new Object[] { deviceId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID;
			finderArgs = new Object[] { deviceId, start, end, orderByComparator };
		}

		List<Temperature> list = null;

		if (retrieveFromCache) {
			list = (List<Temperature>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Temperature temperature : list) {
					if (!Objects.equals(deviceId, temperature.getDeviceId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TEMPERATURE_WHERE);

			boolean bindDeviceId = false;

			if (deviceId == null) {
				query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_1);
			}
			else if (deviceId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_3);
			}
			else {
				bindDeviceId = true;

				query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TemperatureModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeviceId) {
					qPos.add(deviceId);
				}

				if (!pagination) {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	@Override
	public Temperature findBydeviceId_First(String deviceId,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchBydeviceId_First(deviceId,
				orderByComparator);

		if (temperature != null) {
			return temperature;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deviceId=");
		msg.append(deviceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTemperatureException(msg.toString());
	}

	/**
	 * Returns the first temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchBydeviceId_First(String deviceId,
		OrderByComparator<Temperature> orderByComparator) {
		List<Temperature> list = findBydeviceId(deviceId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature
	 * @throws NoSuchTemperatureException if a matching temperature could not be found
	 */
	@Override
	public Temperature findBydeviceId_Last(String deviceId,
		OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchBydeviceId_Last(deviceId,
				orderByComparator);

		if (temperature != null) {
			return temperature;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deviceId=");
		msg.append(deviceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTemperatureException(msg.toString());
	}

	/**
	 * Returns the last temperature in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temperature, or <code>null</code> if a matching temperature could not be found
	 */
	@Override
	public Temperature fetchBydeviceId_Last(String deviceId,
		OrderByComparator<Temperature> orderByComparator) {
		int count = countBydeviceId(deviceId);

		if (count == 0) {
			return null;
		}

		List<Temperature> list = findBydeviceId(deviceId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Temperature[] findBydeviceId_PrevAndNext(long temperatureId,
		String deviceId, OrderByComparator<Temperature> orderByComparator)
		throws NoSuchTemperatureException {
		Temperature temperature = findByPrimaryKey(temperatureId);

		Session session = null;

		try {
			session = openSession();

			Temperature[] array = new TemperatureImpl[3];

			array[0] = getBydeviceId_PrevAndNext(session, temperature,
					deviceId, orderByComparator, true);

			array[1] = temperature;

			array[2] = getBydeviceId_PrevAndNext(session, temperature,
					deviceId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Temperature getBydeviceId_PrevAndNext(Session session,
		Temperature temperature, String deviceId,
		OrderByComparator<Temperature> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPERATURE_WHERE);

		boolean bindDeviceId = false;

		if (deviceId == null) {
			query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_1);
		}
		else if (deviceId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_3);
		}
		else {
			bindDeviceId = true;

			query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TemperatureModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDeviceId) {
			qPos.add(deviceId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(temperature);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Temperature> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temperatures where deviceId = &#63; from the database.
	 *
	 * @param deviceId the device ID
	 */
	@Override
	public void removeBydeviceId(String deviceId) {
		for (Temperature temperature : findBydeviceId(deviceId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(temperature);
		}
	}

	/**
	 * Returns the number of temperatures where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the number of matching temperatures
	 */
	@Override
	public int countBydeviceId(String deviceId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEID;

		Object[] finderArgs = new Object[] { deviceId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPERATURE_WHERE);

			boolean bindDeviceId = false;

			if (deviceId == null) {
				query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_1);
			}
			else if (deviceId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_3);
			}
			else {
				bindDeviceId = true;

				query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeviceId) {
					qPos.add(deviceId);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_1 = "temperature.deviceId IS NULL";
	private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_2 = "temperature.deviceId = ?";
	private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_3 = "(temperature.deviceId IS NULL OR temperature.deviceId = '')";

	public TemperaturePersistenceImpl() {
		setModelClass(Temperature.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the temperature in the entity cache if it is enabled.
	 *
	 * @param temperature the temperature
	 */
	@Override
	public void cacheResult(Temperature temperature) {
		entityCache.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureImpl.class, temperature.getPrimaryKey(), temperature);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { temperature.getUuid(), temperature.getGroupId() },
			temperature);

		temperature.resetOriginalValues();
	}

	/**
	 * Caches the temperatures in the entity cache if it is enabled.
	 *
	 * @param temperatures the temperatures
	 */
	@Override
	public void cacheResult(List<Temperature> temperatures) {
		for (Temperature temperature : temperatures) {
			if (entityCache.getResult(
						TemperatureModelImpl.ENTITY_CACHE_ENABLED,
						TemperatureImpl.class, temperature.getPrimaryKey()) == null) {
				cacheResult(temperature);
			}
			else {
				temperature.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temperatures.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TemperatureImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temperature.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Temperature temperature) {
		entityCache.removeResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureImpl.class, temperature.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TemperatureModelImpl)temperature, true);
	}

	@Override
	public void clearCache(List<Temperature> temperatures) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Temperature temperature : temperatures) {
			entityCache.removeResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
				TemperatureImpl.class, temperature.getPrimaryKey());

			clearUniqueFindersCache((TemperatureModelImpl)temperature, true);
		}
	}

	protected void cacheUniqueFindersCache(
		TemperatureModelImpl temperatureModelImpl) {
		Object[] args = new Object[] {
				temperatureModelImpl.getUuid(),
				temperatureModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			temperatureModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		TemperatureModelImpl temperatureModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					temperatureModelImpl.getUuid(),
					temperatureModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((temperatureModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					temperatureModelImpl.getOriginalUuid(),
					temperatureModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new temperature with the primary key. Does not add the temperature to the database.
	 *
	 * @param temperatureId the primary key for the new temperature
	 * @return the new temperature
	 */
	@Override
	public Temperature create(long temperatureId) {
		Temperature temperature = new TemperatureImpl();

		temperature.setNew(true);
		temperature.setPrimaryKey(temperatureId);

		String uuid = PortalUUIDUtil.generate();

		temperature.setUuid(uuid);

		temperature.setCompanyId(companyProvider.getCompanyId());

		return temperature;
	}

	/**
	 * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature that was removed
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	@Override
	public Temperature remove(long temperatureId)
		throws NoSuchTemperatureException {
		return remove((Serializable)temperatureId);
	}

	/**
	 * Removes the temperature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temperature
	 * @return the temperature that was removed
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	@Override
	public Temperature remove(Serializable primaryKey)
		throws NoSuchTemperatureException {
		Session session = null;

		try {
			session = openSession();

			Temperature temperature = (Temperature)session.get(TemperatureImpl.class,
					primaryKey);

			if (temperature == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTemperatureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(temperature);
		}
		catch (NoSuchTemperatureException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Temperature removeImpl(Temperature temperature) {
		temperature = toUnwrappedModel(temperature);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(temperature)) {
				temperature = (Temperature)session.get(TemperatureImpl.class,
						temperature.getPrimaryKeyObj());
			}

			if (temperature != null) {
				session.delete(temperature);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (temperature != null) {
			clearCache(temperature);
		}

		return temperature;
	}

	@Override
	public Temperature updateImpl(Temperature temperature) {
		temperature = toUnwrappedModel(temperature);

		boolean isNew = temperature.isNew();

		TemperatureModelImpl temperatureModelImpl = (TemperatureModelImpl)temperature;

		if (Validator.isNull(temperature.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			temperature.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (temperature.getCreateDate() == null)) {
			if (serviceContext == null) {
				temperature.setCreateDate(now);
			}
			else {
				temperature.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!temperatureModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				temperature.setModifiedDate(now);
			}
			else {
				temperature.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (temperature.isNew()) {
				session.save(temperature);

				temperature.setNew(false);
			}
			else {
				temperature = (Temperature)session.merge(temperature);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!TemperatureModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { temperatureModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					temperatureModelImpl.getUuid(),
					temperatureModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { temperatureModelImpl.getDeviceId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((temperatureModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						temperatureModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { temperatureModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((temperatureModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						temperatureModelImpl.getOriginalUuid(),
						temperatureModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						temperatureModelImpl.getUuid(),
						temperatureModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((temperatureModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						temperatureModelImpl.getOriginalDeviceId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
					args);

				args = new Object[] { temperatureModelImpl.getDeviceId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
					args);
			}
		}

		entityCache.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
			TemperatureImpl.class, temperature.getPrimaryKey(), temperature,
			false);

		clearUniqueFindersCache(temperatureModelImpl, false);
		cacheUniqueFindersCache(temperatureModelImpl);

		temperature.resetOriginalValues();

		return temperature;
	}

	protected Temperature toUnwrappedModel(Temperature temperature) {
		if (temperature instanceof TemperatureImpl) {
			return temperature;
		}

		TemperatureImpl temperatureImpl = new TemperatureImpl();

		temperatureImpl.setNew(temperature.isNew());
		temperatureImpl.setPrimaryKey(temperature.getPrimaryKey());

		temperatureImpl.setUuid(temperature.getUuid());
		temperatureImpl.setTemperatureId(temperature.getTemperatureId());
		temperatureImpl.setGroupId(temperature.getGroupId());
		temperatureImpl.setCompanyId(temperature.getCompanyId());
		temperatureImpl.setUserId(temperature.getUserId());
		temperatureImpl.setUserName(temperature.getUserName());
		temperatureImpl.setCreateDate(temperature.getCreateDate());
		temperatureImpl.setModifiedDate(temperature.getModifiedDate());
		temperatureImpl.setDeviceId(temperature.getDeviceId());
		temperatureImpl.setValue(temperature.getValue());

		return temperatureImpl;
	}

	/**
	 * Returns the temperature with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temperature
	 * @return the temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	@Override
	public Temperature findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTemperatureException {
		Temperature temperature = fetchByPrimaryKey(primaryKey);

		if (temperature == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTemperatureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return temperature;
	}

	/**
	 * Returns the temperature with the primary key or throws a {@link NoSuchTemperatureException} if it could not be found.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature
	 * @throws NoSuchTemperatureException if a temperature with the primary key could not be found
	 */
	@Override
	public Temperature findByPrimaryKey(long temperatureId)
		throws NoSuchTemperatureException {
		return findByPrimaryKey((Serializable)temperatureId);
	}

	/**
	 * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temperature
	 * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
	 */
	@Override
	public Temperature fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
				TemperatureImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Temperature temperature = (Temperature)serializable;

		if (temperature == null) {
			Session session = null;

			try {
				session = openSession();

				temperature = (Temperature)session.get(TemperatureImpl.class,
						primaryKey);

				if (temperature != null) {
					cacheResult(temperature);
				}
				else {
					entityCache.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
						TemperatureImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
					TemperatureImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return temperature;
	}

	/**
	 * Returns the temperature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param temperatureId the primary key of the temperature
	 * @return the temperature, or <code>null</code> if a temperature with the primary key could not be found
	 */
	@Override
	public Temperature fetchByPrimaryKey(long temperatureId) {
		return fetchByPrimaryKey((Serializable)temperatureId);
	}

	@Override
	public Map<Serializable, Temperature> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Temperature> map = new HashMap<Serializable, Temperature>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Temperature temperature = fetchByPrimaryKey(primaryKey);

			if (temperature != null) {
				map.put(primaryKey, temperature);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
					TemperatureImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Temperature)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TEMPERATURE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Temperature temperature : (List<Temperature>)q.list()) {
				map.put(temperature.getPrimaryKeyObj(), temperature);

				cacheResult(temperature);

				uncachedPrimaryKeys.remove(temperature.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TemperatureModelImpl.ENTITY_CACHE_ENABLED,
					TemperatureImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the temperatures.
	 *
	 * @return the temperatures
	 */
	@Override
	public List<Temperature> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Temperature> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Temperature> findAll(int start, int end,
		OrderByComparator<Temperature> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Temperature> findAll(int start, int end,
		OrderByComparator<Temperature> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Temperature> list = null;

		if (retrieveFromCache) {
			list = (List<Temperature>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TEMPERATURE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPERATURE;

				if (pagination) {
					sql = sql.concat(TemperatureModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Temperature>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the temperatures from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Temperature temperature : findAll()) {
			remove(temperature);
		}
	}

	/**
	 * Returns the number of temperatures.
	 *
	 * @return the number of temperatures
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TEMPERATURE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TemperatureModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the temperature persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TemperatureImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TEMPERATURE = "SELECT temperature FROM Temperature temperature";
	private static final String _SQL_SELECT_TEMPERATURE_WHERE_PKS_IN = "SELECT temperature FROM Temperature temperature WHERE temperatureId IN (";
	private static final String _SQL_SELECT_TEMPERATURE_WHERE = "SELECT temperature FROM Temperature temperature WHERE ";
	private static final String _SQL_COUNT_TEMPERATURE = "SELECT COUNT(temperature) FROM Temperature temperature";
	private static final String _SQL_COUNT_TEMPERATURE_WHERE = "SELECT COUNT(temperature) FROM Temperature temperature WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "temperature.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Temperature exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Temperature exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TemperaturePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}