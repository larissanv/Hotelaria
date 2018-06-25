/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.CategoriaQuarto;
import hotelariaDSL.HotelariaDSLPackage;
import hotelariaDSL.Quarto;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quarto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.impl.QuartoImpl#getCategorias <em>Categorias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuartoImpl extends SuperImpl implements Quarto {
	/**
	 * The cached value of the '{@link #getCategorias() <em>Categorias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorias()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoriaQuarto> categorias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuartoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelariaDSLPackage.Literals.QUARTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoriaQuarto> getCategorias() {
		if (categorias == null) {
			categorias = new EObjectResolvingEList<CategoriaQuarto>(CategoriaQuarto.class, this, HotelariaDSLPackage.QUARTO__CATEGORIAS);
		}
		return categorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelariaDSLPackage.QUARTO__CATEGORIAS:
				return getCategorias();
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
			case HotelariaDSLPackage.QUARTO__CATEGORIAS:
				getCategorias().clear();
				getCategorias().addAll((Collection<? extends CategoriaQuarto>)newValue);
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
			case HotelariaDSLPackage.QUARTO__CATEGORIAS:
				getCategorias().clear();
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
			case HotelariaDSLPackage.QUARTO__CATEGORIAS:
				return categorias != null && !categorias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuartoImpl
