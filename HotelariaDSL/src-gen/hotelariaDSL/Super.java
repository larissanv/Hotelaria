/**
 */
package hotelariaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Super#getNome <em>Nome</em>}</li>
 *   <li>{@link hotelariaDSL.Super#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link hotelariaDSL.Super#getSuperclasse <em>Superclasse</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getSuper()
 * @model abstract="true"
 * @generated
 */
public interface Super extends Aplicacao {
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
	 * @see hotelariaDSL.HotelariaDSLPackage#getSuper_Nome()
	 * @model required="true"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Super#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' reference list.
	 * The list contents are of type {@link hotelariaDSL.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getSuper_Atributos()
	 * @model
	 * @generated
	 */
	EList<Atributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Superclasse</b></em>' reference list.
	 * The list contents are of type {@link hotelariaDSL.Super}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasse</em>' reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getSuper_Superclasse()
	 * @model
	 * @generated
	 */
	EList<Super> getSuperclasse();

} // Super
