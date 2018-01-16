/**
 * 
 */
package it.dontesta.labs.services.temperature.instance.lifecycle;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.instance.lifecycle.BasePortalInstanceLifecycleListener;
import com.liferay.portal.instance.lifecycle.PortalInstanceLifecycleListener;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.Portal;

import it.dontesta.labs.services.temperature.model.Temperature;
import it.dontesta.labs.services.temperature.service.TemperatureLocalService;

/**
 * 
 * @author amusarra
 *
 */
@Component(
		immediate = true, 
		service = PortalInstanceLifecycleListener.class
)
public class TemperatureServiceLifecycleListener extends BasePortalInstanceLifecycleListener {

	@Activate
	protected void activate(BundleContext bundleContext) throws BundleException {
		this.bundleContext = bundleContext;
		doCreateEntry();
	}

	@Deactivate
	protected void deactivate(BundleContext bundleContext) throws BundleException {
		doDeleteEntry();
	}

	/**
	 * Initialize database with entries
	 */
	protected void doCreateEntry() {

		try {
			if (_log.isInfoEnabled()) {
				_log.info("Creating the entries for Temperature...");
			}

			User user = _userLocalService.getDefaultUser(_portal.getDefaultCompanyId());
			
			for (int i = 0; i < 20; i++) {
				long temperatureId = CounterLocalServiceUtil.increment(Temperature.class.getName());
				Temperature temperatureEntry = _temperatureLocalService.createTemperature(temperatureId);

				temperatureEntry.setCompanyId(_portal.getDefaultCompanyId());
				temperatureEntry.setUserId(user.getUserId());
				temperatureEntry.setUserName(user.getScreenName());
				temperatureEntry.setCreateDate(new Date());
				temperatureEntry.setDeviceId(UUID.randomUUID().toString());
				temperatureEntry.setValue(new Random().nextInt((50 - 10) + 1) + 10);
				temperatureEntry.setStatus(new Random().nextInt(2));

				_temperatureLocalService.addTemperature(temperatureEntry);

				if (_log.isInfoEnabled()) {
					_log.info("The entry for Temperature created with id " + temperatureId);
				}
			}

			if (_log.isInfoEnabled()) {
				_log.info("Creating the entries for Temperature...[END]");
			}
		} catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error(e.getMessage(), e);
			}
		}
	}

	/**
	 * Deleted entry on the database
	 */
	protected void doDeleteEntry() {
		try {
			if (_log.isInfoEnabled()) {
				_log.info("Delete all the entries of Temperature...");
			}

			List<Temperature> temperatureList = _temperatureLocalService.getTemperatures(-1, -1);

			for (Temperature temperature : temperatureList) {
				_temperatureLocalService.deleteTemperature(temperature.getTemperatureId());

				if (_log.isInfoEnabled()) {
					_log.info("Delete of the entry " + temperature.getTemperatureId() + " of Temperature");
				}
			}

			if (_log.isInfoEnabled()) {
				_log.info("Delete all the entries of Temperature...[END]");
			}
		} catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error(e.getMessage(), e);
			}
		}
	}

	@Override
	public void portalInstanceRegistered(Company company) throws Exception {
	}
	
	@Reference
	protected void setTemperatureLocalService(
			TemperatureLocalService temperatureLocalService) {
		this._temperatureLocalService = temperatureLocalService;
	}

	@Reference
	protected void setPortal(
			Portal portal) {
		this._portal = portal;
	}

	@Reference
	protected void setUserLocalService(
			UserLocalService userLocalService) {
		this._userLocalService = userLocalService;
	}

	protected TemperatureLocalService _temperatureLocalService;
	protected Portal _portal;
	protected UserLocalService _userLocalService;
	protected BundleContext bundleContext;
	
	private static final Log _log = LogFactoryUtil.getLog(TemperatureServiceLifecycleListener.class);
}
