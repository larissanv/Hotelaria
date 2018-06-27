/**
 */
package hotelariaDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hotelariaDSL.HotelariaDSLPackage
 * @generated
 */
public interface HotelariaDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelariaDSLFactory eINSTANCE = hotelariaDSL.impl.HotelariaDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hospede</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospede</em>'.
	 * @generated
	 */
	Hospede createHospede();

	/**
	 * Returns a new object of class '<em>Recepcionista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recepcionista</em>'.
	 * @generated
	 */
	Recepcionista createRecepcionista();

	/**
	 * Returns a new object of class '<em>Quarto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quarto</em>'.
	 * @generated
	 */
	Quarto createQuarto();

	/**
	 * Returns a new object of class '<em>Hospedagem Pago</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospedagem Pago</em>'.
	 * @generated
	 */
	HospedagemPago createHospedagemPago();

	/**
	 * Returns a new object of class '<em>Categoria Quarto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categoria Quarto</em>'.
	 * @generated
	 */
	CategoriaQuarto createCategoriaQuarto();

	/**
	 * Returns a new object of class '<em>Hospedagem Comunitario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospedagem Comunitario</em>'.
	 * @generated
	 */
	HospedagemComunitario createHospedagemComunitario();

	/**
	 * Returns a new object of class '<em>Aplicacao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicacao</em>'.
	 * @generated
	 */
	Aplicacao createAplicacao();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HotelariaDSLPackage getHotelariaDSLPackage();

} //HotelariaDSLFactory
