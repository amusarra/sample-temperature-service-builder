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

package it.dontesta.labs.services.temperature.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import it.dontesta.labs.services.temperature.exception.NoSuchTemperatureException;
import it.dontesta.labs.services.temperature.model.Temperature;
import it.dontesta.labs.services.temperature.service.TemperatureLocalServiceUtil;
import it.dontesta.labs.services.temperature.service.persistence.TemperaturePersistence;
import it.dontesta.labs.services.temperature.service.persistence.TemperatureUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class TemperaturePersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED,
				"it.dontesta.labs.services.temperature.service"));

	@Before
	public void setUp() {
		_persistence = TemperatureUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Temperature> iterator = _temperatures.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Temperature temperature = _persistence.create(pk);

		Assert.assertNotNull(temperature);

		Assert.assertEquals(temperature.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Temperature newTemperature = addTemperature();

		_persistence.remove(newTemperature);

		Temperature existingTemperature = _persistence.fetchByPrimaryKey(
			newTemperature.getPrimaryKey());

		Assert.assertNull(existingTemperature);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addTemperature();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Temperature newTemperature = _persistence.create(pk);

		newTemperature.setUuid(RandomTestUtil.randomString());

		newTemperature.setGroupId(RandomTestUtil.nextLong());

		newTemperature.setCompanyId(RandomTestUtil.nextLong());

		newTemperature.setUserId(RandomTestUtil.nextLong());

		newTemperature.setUserName(RandomTestUtil.randomString());

		newTemperature.setCreateDate(RandomTestUtil.nextDate());

		newTemperature.setModifiedDate(RandomTestUtil.nextDate());

		newTemperature.setDeviceId(RandomTestUtil.randomString());

		newTemperature.setValue(RandomTestUtil.nextInt());

		newTemperature.setStatus(RandomTestUtil.nextInt());

		_temperatures.add(_persistence.update(newTemperature));

		Temperature existingTemperature = _persistence.findByPrimaryKey(
			newTemperature.getPrimaryKey());

		Assert.assertEquals(
			existingTemperature.getUuid(), newTemperature.getUuid());
		Assert.assertEquals(
			existingTemperature.getTemperatureId(),
			newTemperature.getTemperatureId());
		Assert.assertEquals(
			existingTemperature.getGroupId(), newTemperature.getGroupId());
		Assert.assertEquals(
			existingTemperature.getCompanyId(), newTemperature.getCompanyId());
		Assert.assertEquals(
			existingTemperature.getUserId(), newTemperature.getUserId());
		Assert.assertEquals(
			existingTemperature.getUserName(), newTemperature.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingTemperature.getCreateDate()),
			Time.getShortTimestamp(newTemperature.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingTemperature.getModifiedDate()),
			Time.getShortTimestamp(newTemperature.getModifiedDate()));
		Assert.assertEquals(
			existingTemperature.getDeviceId(), newTemperature.getDeviceId());
		Assert.assertEquals(
			existingTemperature.getValue(), newTemperature.getValue());
		Assert.assertEquals(
			existingTemperature.getStatus(), newTemperature.getStatus());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountBydeviceId() throws Exception {
		_persistence.countBydeviceId("");

		_persistence.countBydeviceId("null");

		_persistence.countBydeviceId((String)null);
	}

	@Test
	public void testCountBystatus() throws Exception {
		_persistence.countBystatus(RandomTestUtil.nextInt());

		_persistence.countBystatus(0);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Temperature newTemperature = addTemperature();

		Temperature existingTemperature = _persistence.findByPrimaryKey(
			newTemperature.getPrimaryKey());

		Assert.assertEquals(existingTemperature, newTemperature);
	}

	@Test(expected = NoSuchTemperatureException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Temperature> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"DNTLABS_Temperature", "uuid", true, "temperatureId", true,
			"groupId", true, "companyId", true, "userId", true, "userName",
			true, "createDate", true, "modifiedDate", true, "deviceId", true,
			"value", true, "status", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Temperature newTemperature = addTemperature();

		Temperature existingTemperature = _persistence.fetchByPrimaryKey(
			newTemperature.getPrimaryKey());

		Assert.assertEquals(existingTemperature, newTemperature);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Temperature missingTemperature = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingTemperature);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Temperature newTemperature1 = addTemperature();
		Temperature newTemperature2 = addTemperature();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTemperature1.getPrimaryKey());
		primaryKeys.add(newTemperature2.getPrimaryKey());

		Map<Serializable, Temperature> temperatures =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, temperatures.size());
		Assert.assertEquals(
			newTemperature1, temperatures.get(newTemperature1.getPrimaryKey()));
		Assert.assertEquals(
			newTemperature2, temperatures.get(newTemperature2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Temperature> temperatures =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(temperatures.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Temperature newTemperature = addTemperature();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTemperature.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Temperature> temperatures =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, temperatures.size());
		Assert.assertEquals(
			newTemperature, temperatures.get(newTemperature.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Temperature> temperatures =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(temperatures.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Temperature newTemperature = addTemperature();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTemperature.getPrimaryKey());

		Map<Serializable, Temperature> temperatures =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, temperatures.size());
		Assert.assertEquals(
			newTemperature, temperatures.get(newTemperature.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			TemperatureLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Temperature>() {

				@Override
				public void performAction(Temperature temperature) {
					Assert.assertNotNull(temperature);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Temperature newTemperature = addTemperature();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Temperature.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"temperatureId", newTemperature.getTemperatureId()));

		List<Temperature> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Temperature existingTemperature = result.get(0);

		Assert.assertEquals(existingTemperature, newTemperature);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Temperature.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"temperatureId", RandomTestUtil.nextLong()));

		List<Temperature> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Temperature newTemperature = addTemperature();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Temperature.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("temperatureId"));

		Object newTemperatureId = newTemperature.getTemperatureId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"temperatureId", new Object[] {newTemperatureId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingTemperatureId = result.get(0);

		Assert.assertEquals(existingTemperatureId, newTemperatureId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Temperature.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("temperatureId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"temperatureId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Temperature newTemperature = addTemperature();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newTemperature.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		Temperature newTemperature = addTemperature();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Temperature.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"temperatureId", newTemperature.getTemperatureId()));

		List<Temperature> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Temperature temperature) {
		Assert.assertEquals(
			temperature.getUuid(),
			ReflectionTestUtil.invoke(
				temperature, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(temperature.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				temperature, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected Temperature addTemperature() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Temperature temperature = _persistence.create(pk);

		temperature.setUuid(RandomTestUtil.randomString());

		temperature.setGroupId(RandomTestUtil.nextLong());

		temperature.setCompanyId(RandomTestUtil.nextLong());

		temperature.setUserId(RandomTestUtil.nextLong());

		temperature.setUserName(RandomTestUtil.randomString());

		temperature.setCreateDate(RandomTestUtil.nextDate());

		temperature.setModifiedDate(RandomTestUtil.nextDate());

		temperature.setDeviceId(RandomTestUtil.randomString());

		temperature.setValue(RandomTestUtil.nextInt());

		temperature.setStatus(RandomTestUtil.nextInt());

		_temperatures.add(_persistence.update(temperature));

		return temperature;
	}

	private List<Temperature> _temperatures = new ArrayList<Temperature>();
	private TemperaturePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}