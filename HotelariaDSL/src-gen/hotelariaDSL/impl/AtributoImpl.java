/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Atributo;
import hotelariaDSL.HotelariaDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.impl.AtributoImpl#getNomeAtributo <em>Nome Atributo</em>}</li>
 *   <li>{@link hotelariaDSL.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends SuperImpl implements Atributo {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO,
					oldNomeAtributo, nomeAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.ATRIBUTO__TIPO, oldTipo, tipo));
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
		case HotelariaDSLPackage.ATRIBUTO__TIPO:
			return getTipo();
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
		case HotelariaDSLPackage.ATRIBUTO__NOME_ATRIBUTO:
			setNomeAtributo((String) newValue);
			return;
		case HotelariaDSLPackage.ATRIBUTO__TIPO:
			setTipo((String) newValue);
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
		case HotelariaDSLPackage.ATRIBUTO__TIPO:
			setTipo(TIPO_EDEFAULT);
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
		case HotelariaDSLPackage.ATRIBUTO__TIPO:
			return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
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
		result.append(" (nomeAtributo: ");
		result.append(nomeAtributo);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
