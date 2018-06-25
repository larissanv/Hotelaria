/**
 */
package hotelariaDSL.util;

import hotelariaDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hotelariaDSL.HotelariaDSLPackage
 * @generated
 */
public class HotelariaDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelariaDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = HotelariaDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HotelariaDSLPackage.SUPER: {
				Super super_ = (Super)theEObject;
				T result = caseSuper(super_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.HOSPEDE: {
				Hospede hospede = (Hospede)theEObject;
				T result = caseHospede(hospede);
				if (result == null) result = caseSuper(hospede);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.RECEPCIONISTA: {
				Recepcionista recepcionista = (Recepcionista)theEObject;
				T result = caseRecepcionista(recepcionista);
				if (result == null) result = caseSuper(recepcionista);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.QUARTO: {
				Quarto quarto = (Quarto)theEObject;
				T result = caseQuarto(quarto);
				if (result == null) result = caseSuper(quarto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.HOSPEDAGEM_PAGO: {
				HospedagemPago hospedagemPago = (HospedagemPago)theEObject;
				T result = caseHospedagemPago(hospedagemPago);
				if (result == null) result = caseHospedagem(hospedagemPago);
				if (result == null) result = caseSuper(hospedagemPago);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.CATEGORIA_QUARTO: {
				CategoriaQuarto categoriaQuarto = (CategoriaQuarto)theEObject;
				T result = caseCategoriaQuarto(categoriaQuarto);
				if (result == null) result = caseSuper(categoriaQuarto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.HOSPEDAGEM_COMUNITARIO: {
				HospedagemComunitario hospedagemComunitario = (HospedagemComunitario)theEObject;
				T result = caseHospedagemComunitario(hospedagemComunitario);
				if (result == null) result = caseHospedagem(hospedagemComunitario);
				if (result == null) result = caseSuper(hospedagemComunitario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.APLICACAO: {
				Aplicacao aplicacao = (Aplicacao)theEObject;
				T result = caseAplicacao(aplicacao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelariaDSLPackage.HOSPEDAGEM: {
				Hospedagem hospedagem = (Hospedagem)theEObject;
				T result = caseHospedagem(hospedagem);
				if (result == null) result = caseSuper(hospedagem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuper(Super object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospede</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospede</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospede(Hospede object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recepcionista</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recepcionista</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecepcionista(Recepcionista object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quarto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quarto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuarto(Quarto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospedagem Pago</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospedagem Pago</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospedagemPago(HospedagemPago object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categoria Quarto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categoria Quarto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoriaQuarto(CategoriaQuarto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospedagem Comunitario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospedagem Comunitario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospedagemComunitario(HospedagemComunitario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aplicacao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aplicacao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAplicacao(Aplicacao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospedagem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospedagem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospedagem(Hospedagem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HotelariaDSLSwitch
