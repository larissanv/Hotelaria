/**
 */
package hotelariaDSL.util;

import hotelariaDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hotelariaDSL.HotelariaDSLPackage
 * @generated
 */
public class HotelariaDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelariaDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HotelariaDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelariaDSLSwitch<Adapter> modelSwitch =
		new HotelariaDSLSwitch<Adapter>() {
			@Override
			public Adapter caseSuper(Super object) {
				return createSuperAdapter();
			}
			@Override
			public Adapter caseHospede(Hospede object) {
				return createHospedeAdapter();
			}
			@Override
			public Adapter caseRecepcionista(Recepcionista object) {
				return createRecepcionistaAdapter();
			}
			@Override
			public Adapter caseQuarto(Quarto object) {
				return createQuartoAdapter();
			}
			@Override
			public Adapter caseHospedagemPago(HospedagemPago object) {
				return createHospedagemPagoAdapter();
			}
			@Override
			public Adapter caseCategoriaQuarto(CategoriaQuarto object) {
				return createCategoriaQuartoAdapter();
			}
			@Override
			public Adapter caseHospedagemComunitario(HospedagemComunitario object) {
				return createHospedagemComunitarioAdapter();
			}
			@Override
			public Adapter caseAplicacao(Aplicacao object) {
				return createAplicacaoAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseHospedagem(Hospedagem object) {
				return createHospedagemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Super <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Super
	 * @generated
	 */
	public Adapter createSuperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Hospede <em>Hospede</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Hospede
	 * @generated
	 */
	public Adapter createHospedeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Recepcionista <em>Recepcionista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Recepcionista
	 * @generated
	 */
	public Adapter createRecepcionistaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Quarto <em>Quarto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Quarto
	 * @generated
	 */
	public Adapter createQuartoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.HospedagemPago <em>Hospedagem Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.HospedagemPago
	 * @generated
	 */
	public Adapter createHospedagemPagoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.CategoriaQuarto <em>Categoria Quarto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.CategoriaQuarto
	 * @generated
	 */
	public Adapter createCategoriaQuartoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.HospedagemComunitario <em>Hospedagem Comunitario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.HospedagemComunitario
	 * @generated
	 */
	public Adapter createHospedagemComunitarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Aplicacao <em>Aplicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Aplicacao
	 * @generated
	 */
	public Adapter createAplicacaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelariaDSL.Hospedagem <em>Hospedagem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelariaDSL.Hospedagem
	 * @generated
	 */
	public Adapter createHospedagemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HotelariaDSLAdapterFactory
