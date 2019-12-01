/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.Component;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.IComponent;
import asaproject.model.asa.M2.M2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.impl.ComponentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.impl.ComponentImpl#getIcomponents <em>Icomponents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ArchitecturalElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getIcomponents() <em>Icomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<IComponent> icomponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}
	
	public ComponentImpl(String name) {
		super();
		this.name = name;
	}
	
	public ComponentImpl(String name, Configuration configuration) {
		super();
		this.name = name;
		this.configuration = configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject) configuration;
			configuration = (Configuration) eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.COMPONENT__CONFIGURATION,
							oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.COMPONENT__CONFIGURATION, oldConfiguration,
					configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IComponent> getIcomponents() {
		if (icomponents == null) {
			icomponents = new EObjectContainmentWithInverseEList<IComponent>(IComponent.class, this,
					M2Package.COMPONENT__ICOMPONENTS, M2Package.ICOMPONENT__COMPONENT);
		}
		return icomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case M2Package.COMPONENT__ICOMPONENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIcomponents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case M2Package.COMPONENT__ICOMPONENTS:
			return ((InternalEList<?>) getIcomponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case M2Package.COMPONENT__CONFIGURATION:
			if (resolve)
				return getConfiguration();
			return basicGetConfiguration();
		case M2Package.COMPONENT__ICOMPONENTS:
			return getIcomponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case M2Package.COMPONENT__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case M2Package.COMPONENT__ICOMPONENTS:
			getIcomponents().clear();
			getIcomponents().addAll((Collection<? extends IComponent>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case M2Package.COMPONENT__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case M2Package.COMPONENT__ICOMPONENTS:
			getIcomponents().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case M2Package.COMPONENT__CONFIGURATION:
			return configuration != null;
		case M2Package.COMPONENT__ICOMPONENTS:
			return icomponents != null && !icomponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
