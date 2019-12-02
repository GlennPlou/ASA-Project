/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.Connector;
import asaproject.model.asa.M2.Glue;
import asaproject.model.asa.M2.IConnector;
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
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.impl.ConnectorImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.impl.ConnectorImpl#getIconnectors <em>Iconnectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends ArchitecturalElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * The cached value of the '{@link #getIconnectors() <em>Iconnectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<IConnector> iconnectors;
	
	private RequiredRoleImpl caller;
	private ProvidedRoleImpl called;

    

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorImpl() {
		super();
	}
	
	public ConnectorImpl(String name) {
		super();
		this.setName(name);
		this.caller = new RequiredRoleImpl("caller").connector(this);
		this.called = new ProvidedRoleImpl("called").connector(this);
	}
	
	public RequiredRoleImpl getCaller() {
        return caller;
    }

    public ProvidedRoleImpl getCalled() {
        return called;
    }
    
    public ConnectorImpl parent(ArchitecturalElement element) {
    	super.parent(element);
    	return this;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.CONNECTOR__GLUE,
					oldGlue, newGlue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject) glue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.CONNECTOR__GLUE,
						null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject) newGlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.CONNECTOR__GLUE,
						null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.CONNECTOR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IConnector> getIconnectors() {
		if (iconnectors == null) {
			iconnectors = new EObjectContainmentWithInverseEList<IConnector>(IConnector.class, this,
					M2Package.CONNECTOR__ICONNECTORS, M2Package.ICONNECTOR__CONNECTOR);
		}
		return iconnectors;
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
		case M2Package.CONNECTOR__ICONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIconnectors()).basicAdd(otherEnd, msgs);
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
		case M2Package.CONNECTOR__GLUE:
			return basicSetGlue(null, msgs);
		case M2Package.CONNECTOR__ICONNECTORS:
			return ((InternalEList<?>) getIconnectors()).basicRemove(otherEnd, msgs);
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
		case M2Package.CONNECTOR__GLUE:
			return getGlue();
		case M2Package.CONNECTOR__ICONNECTORS:
			return getIconnectors();
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
		case M2Package.CONNECTOR__GLUE:
			setGlue((Glue) newValue);
			return;
		case M2Package.CONNECTOR__ICONNECTORS:
			getIconnectors().clear();
			getIconnectors().addAll((Collection<? extends IConnector>) newValue);
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
		case M2Package.CONNECTOR__GLUE:
			setGlue((Glue) null);
			return;
		case M2Package.CONNECTOR__ICONNECTORS:
			getIconnectors().clear();
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
		case M2Package.CONNECTOR__GLUE:
			return glue != null;
		case M2Package.CONNECTOR__ICONNECTORS:
			return iconnectors != null && !iconnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
