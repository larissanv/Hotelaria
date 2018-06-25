/**
 */
package hotelariaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Atributo#getNome <em>Nome</em>}</li>
 *   <li>{@link hotelariaDSL.Atributo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo_Nome()
	 * @model required="true"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Atributo#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo_Tipo()
	 * @model required="true"
	 * @generated
	 */
	EList<Type> getTipo();

} // Atributo
