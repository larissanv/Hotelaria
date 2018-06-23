/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Atributo;
import hotelariaDSL.HotelariaDSLPackage;
import hotelariaDSL.Super;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.impl.SuperImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link hotelariaDSL.impl.SuperImpl#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperImpl extends MinimalEObjectImpl.Container implements Super {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelariaDSLPackage.Literals.SUPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.SUPER__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectResolvingEList<Atributo>(Atributo.class, this, HotelariaDSLPackage.SUPER__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelariaDSLPackage.SUPER__NOME:
				return getNome();
			case HotelariaDSLPackage.SUPER__ATRIBUTOS:
				return getAtributos();
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
			case HotelariaDSLPackage.SUPER__NOME:
				setNome((String)newValue);
				return;
			case HotelariaDSLPackage.SUPER__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributo>)newValue);
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
			case HotelariaDSLPackage.SUPER__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case HotelariaDSLPackage.SUPER__ATRIBUTOS:
				getAtributos().clear();
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
			case HotelariaDSLPackage.SUPER__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case HotelariaDSLPackage.SUPER__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(')');
		return result.toString();
	}

} //SuperImpl
