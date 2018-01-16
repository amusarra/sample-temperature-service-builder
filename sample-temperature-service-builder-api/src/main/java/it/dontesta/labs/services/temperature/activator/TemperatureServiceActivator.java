/**
 * 
 */
package it.dontesta.labs.services.temperature.activator;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import it.dontesta.labs.services.temperature.model.Temperature;
import it.dontesta.labs.services.temperature.service.TemperatureLocalServiceUtil;

public class TemperatureServiceActivator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {

		if (_log.isInfoEnabled()) {
			_log.info("Default companyId " + PortalUtil.getDefaultCompanyId());
			_log.info("Creating the entries for Temperature...");
		}
		
		try {
			
			User user = UserLocalServiceUtil.getDefaultUser(PortalUtil.getDefaultCompanyId());
			
			if (Validator.isNull(user)) {
				if (_log.isWarnEnabled()) {
					_log.warn("Can not get default user");
				}
			} else {

				for (int i = 0; i < 20; i++) {
					long temperatureId = CounterLocalServiceUtil.increment(Temperature.class.getName());
					Temperature temperatureEntry = TemperatureLocalServiceUtil.createTemperature(temperatureId);
					
					temperatureEntry.setUserId(user.getUserId());
					temperatureEntry.setUserName(user.getScreenName());
					temperatureEntry.setCompanyId(user.getCompanyId());
					temperatureEntry.setCreateDate(new Date());
					temperatureEntry.setDeviceId(UUID.randomUUID().toString());
					temperatureEntry.setValue(new Random().nextInt((50 - 10) + 1) + 10);
					temperatureEntry.setStatus(new Random().nextInt(2));
					
					TemperatureLocalServiceUtil.addTemperature(temperatureEntry);
					
					if (_log.isInfoEnabled()) {
						_log.info("The entry for Temperature created with id "
								+ temperatureId);
					}
	
				}
	
				if (_log.isInfoEnabled()) {
					_log.info("Creating the entries for Temperature...[END]");
				}
			}

		} catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error(e.getMessage(), e);
			}
			throw new BundleException(e.getMessage());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(TemperatureServiceActivator.class);

	@Override
	public void stop(BundleContext context) throws Exception {
		try {
			if (_log.isInfoEnabled()) {
				_log.info("Delete all the entries of Temperature...");
			}

			List<Temperature> temperatureList = TemperatureLocalServiceUtil.getTemperatures(-1, -1);
			
			for (Temperature temperature : temperatureList) {
				TemperatureLocalServiceUtil.deleteTemperature(temperature.getTemperatureId());
				
				if (_log.isInfoEnabled()) {
					_log.info("Delete of the entry " 
							+ temperature.getTemperatureId() 
							+ " of Temperature");
				}
			}

			if (_log.isInfoEnabled()) {
				_log.info("Delete all the entries of Temperature...[END]");
			}
		} catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error(e.getMessage(), e);
			}
			throw new BundleException(e.getMessage());
		}
	}
}
