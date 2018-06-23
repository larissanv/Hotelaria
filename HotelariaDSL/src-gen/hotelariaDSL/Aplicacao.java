/**
 */
package hotelariaDSL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Aplicacao#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link hotelariaDSL.Aplicacao#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getAplicacao()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TipoQuartoInvalido'"
 * @generated
 */
public interface Aplicacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see hotelariaDSL.HotelariaDSLPackage#getAplicacao_Titulo()
	 * @model required="true"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link hotelariaDSL.Aplicacao#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link hotelariaDSL.Super}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getAplicacao_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Super> getClasses();

} // Aplicacao
