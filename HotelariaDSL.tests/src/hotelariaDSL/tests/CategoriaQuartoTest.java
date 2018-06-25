/**
 */
package hotelariaDSL.tests;

import hotelariaDSL.CategoriaQuarto;
import hotelariaDSL.HotelariaDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Categoria Quarto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoriaQuartoTest extends SuperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CategoriaQuartoTest.class);
	}

	/**
	 * Constructs a new Categoria Quarto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriaQuartoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Categoria Quarto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CategoriaQuarto getFixture() {
		return (CategoriaQuarto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HotelariaDSLFactory.eINSTANCE.createCategoriaQuarto());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CategoriaQuartoTest
