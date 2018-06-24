/**
 */
package hotelariaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospede</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Hospede#getContaBanco <em>Conta Banco</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getHospede()
 * @model
 * @generated
 */
public interface Hospede extends Super {
	/**
	 * Returns the value of the '<em><b>Conta Banco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conta Banco</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conta Banco</em>' attribute.
	 * @see #setContaBanco(String)
	 * @see hotelariaDSL.HotelariaDSLPackage#getHospede_ContaBanco()
	 * @model required="true"
	 * @generated
	 */
	String getContaBanco();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Hospede#getContaBanco <em>Conta Banco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conta Banco</em>' attribute.
	 * @see #getContaBanco()
	 * @generated
	 */
	void setContaBanco(String value);

} // Hospede
