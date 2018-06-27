/**
 */
package hotelariaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quarto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelariaDSL.Quarto#getCategorias <em>Categorias</em>}</li>
 * </ul>
 *
 * @see hotelariaDSL.HotelariaDSLPackage#getQuarto()
 * @model
 * @generated
 */
public interface Quarto extends Super {
	/**
	 * Returns the value of the '<em><b>Categorias</b></em>' reference list.
	 * The list contents are of type {@link hotelariaDSL.CategoriaQuarto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorias</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorias</em>' reference list.
	 * @see hotelariaDSL.HotelariaDSLPackage#getQuarto_Categorias()
	 * @model required="true"
	 * @generated
	 */
	EList<CategoriaQuarto> getCategorias();

} // Quarto
