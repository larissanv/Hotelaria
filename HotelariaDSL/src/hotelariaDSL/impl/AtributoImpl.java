/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Atributo;
import hotelariaDSL.HotelariaDSLPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.impl.AtributoImpl#getNomeAtributo <em>Nome Atributo</em>}</li>
 *   <li>{@link hotelariaDSL.impl.AtributoImpl#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #getNomeAtributo() <em>Nome Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_ATRIBUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeAtributo() <em>Nome Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeAtributo()
	 * @generated
	 * @ordered
	 */
	protected String nomeAtributo = NOME_ATRIBUTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> atributo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelariaDSLPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeAtributo() {
		return nomeAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeAtributo(String newNomeAtributo) {
		String oldNomeAtributo = nomeAtributo;
		nomeAtributo = newNomeAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO, oldNomeAtributo, nomeAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getAtributo() {
		if (atributo == null) {
			atributo = new EObjectResolvingEList<Type>(Type.class, this, HotelariaDSLPackage.ATRIBUTO__ATRIBUTO);
		}
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO:
				return getNomeAtributo();
			case HotelariaDSLPackage.ATRIBUTO__ATRIBUTO:
				return getAtributo();
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
			case HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO:
				setNomeAtributo((String)newValue);
				return;
			case HotelariaDSLPackage.ATRIBUTO__ATRIBUTO:
				getAtributo().clear();
				getAtributo().addAll((Collection<? extends Type>)newValue);
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
			case HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO:
				setNomeAtributo(NOME_ATRIBUTO_EDEFAULT);
				return;
			case HotelariaDSLPackage.ATRIBUTO__ATRIBUTO:
				getAtributo().clear();
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
			case HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO:
				return NOME_ATRIBUTO_EDEFAULT == null ? nomeAtributo != null : !NOME_ATRIBUTO_EDEFAULT.equals(nomeAtributo);
			case HotelariaDSLPackage.ATRIBUTO__ATRIBUTO:
				return atributo != null && !atributo.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nomeAtributo: ");
		result.append(nomeAtributo);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
