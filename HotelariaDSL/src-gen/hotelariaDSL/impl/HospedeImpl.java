/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Hospede;
import hotelariaDSL.HotelariaDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospede</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.impl.HospedeImpl#getContaBanco <em>Conta Banco</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HospedeImpl extends SuperImpl implements Hospede {
	/**
	 * The default value of the '{@link #getContaBanco() <em>Conta Banco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaBanco()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTA_BANCO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContaBanco() <em>Conta Banco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaBanco()
	 * @generated
	 * @ordered
	 */
	protected String contaBanco = CONTA_BANCO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospedeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelariaDSLPackage.Literals.HOSPEDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContaBanco() {
		return contaBanco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContaBanco(String newContaBanco) {
		String oldContaBanco = contaBanco;
		contaBanco = newContaBanco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.HOSPEDE__CONTA_BANCO,
					oldContaBanco, contaBanco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HotelariaDSLPackage.HOSPEDE__CONTA_BANCO:
			return getContaBanco();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HotelariaDSLPackage.HOSPEDE__CONTA_BANCO:
			setContaBanco((String) newValue);
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
		case HotelariaDSLPackage.HOSPEDE__CONTA_BANCO:
			setContaBanco(CONTA_BANCO_EDEFAULT);
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
		case HotelariaDSLPackage.HOSPEDE__CONTA_BANCO:
			return CONTA_BANCO_EDEFAULT == null ? contaBanco != null : !CONTA_BANCO_EDEFAULT.equals(contaBanco);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contaBanco: ");
		result.append(contaBanco);
		result.append(')');
		return result.toString();
	}

} //HospedeImpl
