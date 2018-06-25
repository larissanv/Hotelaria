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
 *   <li>{@link hotelariaDSL.Atributo#getNomeAtributo <em>Nome Atributo</em>}</li>
 *   <li>{@link hotelariaDSL.Atributo#getAtributo <em>Atributo</em>}</li>
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
	 * Returns the value of the '<em><b>Atributo</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getAtributo_Atributo()
	 * @model required="true"
	 * @generated
	 */
	EList<Type> getAtributo();

} // Atributo
