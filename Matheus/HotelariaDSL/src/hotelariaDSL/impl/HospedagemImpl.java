/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Hospedagem;
import hotelariaDSL.Hospede;
import hotelariaDSL.HotelariaDSLPackage;
import hotelariaDSL.Quarto;
import hotelariaDSL.Recepcionista;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospedagem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.impl.HospedagemImpl#getRecepcionista <em>Recepcionista</em>}</li>
 *   <li>{@link hotelariaDSL.impl.HospedagemImpl#getHospede <em>Hospede</em>}</li>
 *   <li>{@link hotelariaDSL.impl.HospedagemImpl#getQuarto <em>Quarto</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HospedagemImpl extends SuperImpl implements Hospedagem {
	/**
	 * The cached value of the '{@link #getRecepcionista() <em>Recepcionista</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecepcionista()
	 * @generated
	 * @ordered
	 */
	protected Recepcionista recepcionista;

	/**
	 * The cached value of the '{@link #getHospede() <em>Hospede</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospede()
	 * @generated
	 * @ordered
	 */
	protected EList<Hospede> hospede;

	/**
	 * The cached value of the '{@link #getQuarto() <em>Quarto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuarto()
	 * @generated
	 * @ordered
	 */
	protected Quarto quarto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospedagemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelariaDSLPackage.Literals.HOSPEDAGEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recepcionista getRecepcionista() {
		if (recepcionista != null && recepcionista.eIsProxy()) {
			InternalEObject oldRecepcionista = (InternalEObject)recepcionista;
			recepcionista = (Recepcionista)eResolveProxy(oldRecepcionista);
			if (recepcionista != oldRecepcionista) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelariaDSLPackage.HOSPEDAGEM__RECEPCIONISTA, oldRecepcionista, recepcionista));
			}
		}
		return recepcionista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recepcionista basicGetRecepcionista() {
		return recepcionista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecepcionista(Recepcionista newRecepcionista) {
		Recepcionista oldRecepcionista = recepcionista;
		recepcionista = newRecepcionista;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.HOSPEDAGEM__RECEPCIONISTA, oldRecepcionista, recepcionista));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hospede> getHospede() {
		if (hospede == null) {
			hospede = new EObjectResolvingEList<Hospede>(Hospede.class, this, HotelariaDSLPackage.HOSPEDAGEM__HOSPEDE);
		}
		return hospede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quarto getQuarto() {
		if (quarto != null && quarto.eIsProxy()) {
			InternalEObject oldQuarto = (InternalEObject)quarto;
			quarto = (Quarto)eResolveProxy(oldQuarto);
			if (quarto != oldQuarto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelariaDSLPackage.HOSPEDAGEM__QUARTO, oldQuarto, quarto));
			}
		}
		return quarto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quarto basicGetQuarto() {
		return quarto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuarto(Quarto newQuarto) {
		Quarto oldQuarto = quarto;
		quarto = newQuarto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelariaDSLPackage.HOSPEDAGEM__QUARTO, oldQuarto, quarto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelariaDSLPackage.HOSPEDAGEM__RECEPCIONISTA:
				if (resolve) return getRecepcionista();
				return basicGetRecepcionista();
			case HotelariaDSLPackage.HOSPEDAGEM__HOSPEDE:
				return getHospede();
			case HotelariaDSLPackage.HOSPEDAGEM__QUARTO:
				if (resolve) return getQuarto();
				return basicGetQuarto();
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
			case HotelariaDSLPackage.HOSPEDAGEM__RECEPCIONISTA:
				setRecepcionista((Recepcionista)newValue);
				return;
			case HotelariaDSLPackage.HOSPEDAGEM__HOSPEDE:
				getHospede().clear();
				getHospede().addAll((Collection<? extends Hospede>)newValue);
				return;
			case HotelariaDSLPackage.HOSPEDAGEM__QUARTO:
				setQuarto((Quarto)newValue);
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
			case HotelariaDSLPackage.HOSPEDAGEM__RECEPCIONISTA:
				setRecepcionista((Recepcionista)null);
				return;
			case HotelariaDSLPackage.HOSPEDAGEM__HOSPEDE:
				getHospede().clear();
				return;
			case HotelariaDSLPackage.HOSPEDAGEM__QUARTO:
				setQuarto((Quarto)null);
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
			case HotelariaDSLPackage.HOSPEDAGEM__RECEPCIONISTA:
				return recepcionista != null;
			case HotelariaDSLPackage.HOSPEDAGEM__HOSPEDE:
				return hospede != null && !hospede.isEmpty();
			case HotelariaDSLPackage.HOSPEDAGEM__QUARTO:
				return quarto != null;
		}
		return super.eIsSet(featureID);
	}

} //HospedagemImpl
