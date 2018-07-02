/**
 */
package hotelariaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospedagem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Hospedagem#getRecepcionista <em>Recepcionista</em>}</li>
 *   <li>{@link hotelariaDSL.Hospedagem#getHospedes <em>Hospedes</em>}</li>
 *   <li>{@link hotelariaDSL.Hospedagem#getQuarto <em>Quarto</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getHospedagem()
 * @model abstract="true"
 * @generated
 */
public interface Hospedagem extends Super {
	/**
	 * Returns the value of the '<em><b>Recepcionista</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recepcionista</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recepcionista</em>' reference.
	 * @see #setRecepcionista(Recepcionista)
	 * @see hotelariaDSL.HotelariaDSLPackage#getHospedagem_Recepcionista()
	 * @model required="true"
	 * @generated
	 */
	Recepcionista getRecepcionista();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Hospedagem#getRecepcionista <em>Recepcionista</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recepcionista</em>' reference.
	 * @see #getRecepcionista()
	 * @generated
	 */
	void setRecepcionista(Recepcionista value);

	/**
	 * Returns the value of the '<em><b>Hospedes</b></em>' reference list.
	 * The list contents are of type {@link hotelariaDSL.Hospede}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hospedes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospedes</em>' reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getHospedagem_Hospedes()
	 * @model required="true"
	 * @generated
	 */
	EList<Hospede> getHospedes();

	/**
	 * Returns the value of the '<em><b>Quarto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quarto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quarto</em>' reference.
	 * @see #setQuarto(Quarto)
	 * @see hotelariaDSL.HotelariaDSLPackage#getHospedagem_Quarto()
	 * @model required="true"
	 * @generated
	 */
	Quarto getQuarto();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Hospedagem#getQuarto <em>Quarto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quarto</em>' reference.
	 * @see #getQuarto()
	 * @generated
	 */
	void setQuarto(Quarto value);

} // Hospedagem
