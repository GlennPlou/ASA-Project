/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.M2Package;
import asaproject.model.asa.M2.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.impl.ArchitecturalElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.impl.ArchitecturalElementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.impl.ArchitecturalElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.impl.ArchitecturalElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchitecturalElementImpl extends MinimalEObjectImpl.Container implements ArchitecturalElement {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalElement> elements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalElementImpl() {
		super();
	}
	
	public ArchitecturalElementImpl parent(ArchitecturalElement element) {
    	this.setParent(element);
    	return this;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ARCHITECTURAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					M2Package.ARCHITECTURAL_ELEMENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<ArchitecturalElement>(ArchitecturalElement.class, this,
					M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS, M2Package.ARCHITECTURAL_ELEMENT__PARENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalElement getParent() {
		if (eContainerFeatureID() != M2Package.ARCHITECTURAL_ELEMENT__PARENT)
			return null;
		return (ArchitecturalElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ArchitecturalElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, M2Package.ARCHITECTURAL_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ArchitecturalElement newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != M2Package.ARCHITECTURAL_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS,
						ArchitecturalElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ARCHITECTURAL_ELEMENT__PARENT, newParent,
					newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ARCHITECTURAL_ELEMENT__NAME, oldName,
					name));
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
		case M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElements()).basicAdd(otherEnd, msgs);
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((ArchitecturalElement) otherEnd, msgs);
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
		case M2Package.ARCHITECTURAL_ELEMENT__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			return eInternalContainer().eInverseRemove(this, M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS,
					ArchitecturalElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case M2Package.ARCHITECTURAL_ELEMENT__PROPERTIES:
			return getProperties();
		case M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS:
			return getElements();
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			return getParent();
		case M2Package.ARCHITECTURAL_ELEMENT__NAME:
			return getName();
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
		case M2Package.ARCHITECTURAL_ELEMENT__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ArchitecturalElement>) newValue);
			return;
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			setParent((ArchitecturalElement) newValue);
			return;
		case M2Package.ARCHITECTURAL_ELEMENT__NAME:
			setName((String) newValue);
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
		case M2Package.ARCHITECTURAL_ELEMENT__PROPERTIES:
			getProperties().clear();
			return;
		case M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS:
			getElements().clear();
			return;
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			setParent((ArchitecturalElement) null);
			return;
		case M2Package.ARCHITECTURAL_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
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
		case M2Package.ARCHITECTURAL_ELEMENT__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case M2Package.ARCHITECTURAL_ELEMENT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case M2Package.ARCHITECTURAL_ELEMENT__PARENT:
			return getParent() != null;
		case M2Package.ARCHITECTURAL_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalElementImpl
