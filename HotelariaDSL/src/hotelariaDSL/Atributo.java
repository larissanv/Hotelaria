/**
 */
package hotelariaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Atributo#getNomeAtributo <em>Nome Atributo</em>}</li>
 *   <li>{@link hotelariaDSL.Atributo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Atributo</em>' attribute.
	 * @see #setNomeAtributo(String)
	 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo_NomeAtributo()
	 * @model required="true"
	 * @generated
	 */
	String getNomeAtributo();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Atributo#getNomeAtributo <em>Nome Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Atributo</em>' attribute.
	 * @see #getNomeAtributo()
	 * @generated
	 */
	void setNomeAtributo(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo_Tipo()
	 * @model required="true"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

} // Atributo
