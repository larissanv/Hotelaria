/**
 */
package hotelariaDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hotelariaDSL.HotelariaDSLFactory
 * @model kind="package"
 * @generated
 */
public interface HotelariaDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hotelariaDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hotelariaDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hotelariaDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelariaDSLPackage eINSTANCE = hotelariaDSL.impl.HotelariaDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.SuperImpl <em>Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.SuperImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getSuper()
	 * @generated
	 */
	int SUPER = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__NOME = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__ATRIBUTOS = 1;

	/**
	 * The number of structural features of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.HospedeImpl <em>Hospede</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.HospedeImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospede()
	 * @generated
	 */
	int HOSPEDE = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Conta Banco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__CONTA_BANCO = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hospede</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE_FEATURE_COUNT = SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hospede</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.RecepcionistaImpl <em>Recepcionista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.RecepcionistaImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getRecepcionista()
	 * @generated
	 */
	int RECEPCIONISTA = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Recepcionista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recepcionista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.QuartoImpl <em>Quarto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.QuartoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuarto()
	 * @generated
	 */
	int QUARTO = 3;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Categorias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__CATEGORIAS = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quarto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_FEATURE_COUNT = SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quarto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.HospedagemImpl <em>Hospedagem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.HospedagemImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospedagem()
	 * @generated
	 */
	int HOSPEDAGEM = 9;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Recepcionista</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM__RECEPCIONISTA = SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hospede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM__HOSPEDE = SUPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quarto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM__QUARTO = SUPER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hospedagem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_FEATURE_COUNT = SUPER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hospedagem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.HospedagemPagoImpl <em>Hospedagem Pago</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.HospedagemPagoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospedagemPago()
	 * @generated
	 */
	int HOSPEDAGEM_PAGO = 4;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO__NOME = HOSPEDAGEM__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO__ATRIBUTOS = HOSPEDAGEM__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Recepcionista</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO__RECEPCIONISTA = HOSPEDAGEM__RECEPCIONISTA;

	/**
	 * The feature id for the '<em><b>Hospede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO__HOSPEDE = HOSPEDAGEM__HOSPEDE;

	/**
	 * The feature id for the '<em><b>Quarto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO__QUARTO = HOSPEDAGEM__QUARTO;

	/**
	 * The number of structural features of the '<em>Hospedagem Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO_FEATURE_COUNT = HOSPEDAGEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hospedagem Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_PAGO_OPERATION_COUNT = HOSPEDAGEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.CategoriaQuartoImpl <em>Categoria Quarto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.CategoriaQuartoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getCategoriaQuarto()
	 * @generated
	 */
	int CATEGORIA_QUARTO = 5;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_QUARTO__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_QUARTO__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Categoria Quarto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_QUARTO_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Categoria Quarto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_QUARTO_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.HospedagemComunitarioImpl <em>Hospedagem Comunitario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.HospedagemComunitarioImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospedagemComunitario()
	 * @generated
	 */
	int HOSPEDAGEM_COMUNITARIO = 6;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO__NOME = HOSPEDAGEM__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO__ATRIBUTOS = HOSPEDAGEM__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Recepcionista</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO__RECEPCIONISTA = HOSPEDAGEM__RECEPCIONISTA;

	/**
	 * The feature id for the '<em><b>Hospede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO__HOSPEDE = HOSPEDAGEM__HOSPEDE;

	/**
	 * The feature id for the '<em><b>Quarto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO__QUARTO = HOSPEDAGEM__QUARTO;

	/**
	 * The number of structural features of the '<em>Hospedagem Comunitario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO_FEATURE_COUNT = HOSPEDAGEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hospedagem Comunitario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDAGEM_COMUNITARIO_OPERATION_COUNT = HOSPEDAGEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.AplicacaoImpl <em>Aplicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.AplicacaoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getAplicacao()
	 * @generated
	 */
	int APLICACAO = 7;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACAO__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACAO__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Aplicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACAO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aplicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.AtributoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 8;

	/**
	 * The feature id for the '<em><b>Nome Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOME_ATRIBUTO = 0;

	/**
	 * The feature id for the '<em><b>Atributo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ATRIBUTO = 1;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Super <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super</em>'.
	 * @see hotelariaDSL.Super
	 * @generated
	 */
	EClass getSuper();

	/**
	 * Returns the meta object for the attribute '{@link hotelariaDSL.Super#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see hotelariaDSL.Super#getNome()
	 * @see #getSuper()
	 * @generated
	 */
	EAttribute getSuper_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link hotelariaDSL.Super#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see hotelariaDSL.Super#getAtributos()
	 * @see #getSuper()
	 * @generated
	 */
	EReference getSuper_Atributos();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Hospede <em>Hospede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospede</em>'.
	 * @see hotelariaDSL.Hospede
	 * @generated
	 */
	EClass getHospede();

	/**
	 * Returns the meta object for the attribute '{@link hotelariaDSL.Hospede#getContaBanco <em>Conta Banco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conta Banco</em>'.
	 * @see hotelariaDSL.Hospede#getContaBanco()
	 * @see #getHospede()
	 * @generated
	 */
	EAttribute getHospede_ContaBanco();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Recepcionista <em>Recepcionista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recepcionista</em>'.
	 * @see hotelariaDSL.Recepcionista
	 * @generated
	 */
	EClass getRecepcionista();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Quarto <em>Quarto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quarto</em>'.
	 * @see hotelariaDSL.Quarto
	 * @generated
	 */
	EClass getQuarto();

	/**
	 * Returns the meta object for the reference list '{@link hotelariaDSL.Quarto#getCategorias <em>Categorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categorias</em>'.
	 * @see hotelariaDSL.Quarto#getCategorias()
	 * @see #getQuarto()
	 * @generated
	 */
	EReference getQuarto_Categorias();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.HospedagemPago <em>Hospedagem Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospedagem Pago</em>'.
	 * @see hotelariaDSL.HospedagemPago
	 * @generated
	 */
	EClass getHospedagemPago();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.CategoriaQuarto <em>Categoria Quarto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria Quarto</em>'.
	 * @see hotelariaDSL.CategoriaQuarto
	 * @generated
	 */
	EClass getCategoriaQuarto();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.HospedagemComunitario <em>Hospedagem Comunitario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospedagem Comunitario</em>'.
	 * @see hotelariaDSL.HospedagemComunitario
	 * @generated
	 */
	EClass getHospedagemComunitario();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Aplicacao <em>Aplicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacao</em>'.
	 * @see hotelariaDSL.Aplicacao
	 * @generated
	 */
	EClass getAplicacao();

	/**
	 * Returns the meta object for the attribute '{@link hotelariaDSL.Aplicacao#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see hotelariaDSL.Aplicacao#getTitulo()
	 * @see #getAplicacao()
	 * @generated
	 */
	EAttribute getAplicacao_Titulo();

	/**
	 * Returns the meta object for the containment reference list '{@link hotelariaDSL.Aplicacao#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see hotelariaDSL.Aplicacao#getClasses()
	 * @see #getAplicacao()
	 * @generated
	 */
	EReference getAplicacao_Classes();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see hotelariaDSL.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link hotelariaDSL.Atributo#getNomeAtributo <em>Nome Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Atributo</em>'.
	 * @see hotelariaDSL.Atributo#getNomeAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_NomeAtributo();

	/**
	 * Returns the meta object for the reference list '{@link hotelariaDSL.Atributo#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atributo</em>'.
	 * @see hotelariaDSL.Atributo#getAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EReference getAtributo_Atributo();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Hospedagem <em>Hospedagem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospedagem</em>'.
	 * @see hotelariaDSL.Hospedagem
	 * @generated
	 */
	EClass getHospedagem();

	/**
	 * Returns the meta object for the reference '{@link hotelariaDSL.Hospedagem#getRecepcionista <em>Recepcionista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recepcionista</em>'.
	 * @see hotelariaDSL.Hospedagem#getRecepcionista()
	 * @see #getHospedagem()
	 * @generated
	 */
	EReference getHospedagem_Recepcionista();

	/**
	 * Returns the meta object for the reference list '{@link hotelariaDSL.Hospedagem#getHospede <em>Hospede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hospede</em>'.
	 * @see hotelariaDSL.Hospedagem#getHospede()
	 * @see #getHospedagem()
	 * @generated
	 */
	EReference getHospedagem_Hospede();

	/**
	 * Returns the meta object for the reference '{@link hotelariaDSL.Hospedagem#getQuarto <em>Quarto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quarto</em>'.
	 * @see hotelariaDSL.Hospedagem#getQuarto()
	 * @see #getHospedagem()
	 * @generated
	 */
	EReference getHospedagem_Quarto();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelariaDSLFactory getHotelariaDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.SuperImpl <em>Super</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.SuperImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getSuper()
		 * @generated
		 */
		EClass SUPER = eINSTANCE.getSuper();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER__NOME = eINSTANCE.getSuper_Nome();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER__ATRIBUTOS = eINSTANCE.getSuper_Atributos();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.HospedeImpl <em>Hospede</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.HospedeImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospede()
		 * @generated
		 */
		EClass HOSPEDE = eINSTANCE.getHospede();

		/**
		 * The meta object literal for the '<em><b>Conta Banco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPEDE__CONTA_BANCO = eINSTANCE.getHospede_ContaBanco();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.RecepcionistaImpl <em>Recepcionista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.RecepcionistaImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getRecepcionista()
		 * @generated
		 */
		EClass RECEPCIONISTA = eINSTANCE.getRecepcionista();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.QuartoImpl <em>Quarto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.QuartoImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuarto()
		 * @generated
		 */
		EClass QUARTO = eINSTANCE.getQuarto();

		/**
		 * The meta object literal for the '<em><b>Categorias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUARTO__CATEGORIAS = eINSTANCE.getQuarto_Categorias();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.HospedagemPagoImpl <em>Hospedagem Pago</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.HospedagemPagoImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospedagemPago()
		 * @generated
		 */
		EClass HOSPEDAGEM_PAGO = eINSTANCE.getHospedagemPago();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.CategoriaQuartoImpl <em>Categoria Quarto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.CategoriaQuartoImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getCategoriaQuarto()
		 * @generated
		 */
		EClass CATEGORIA_QUARTO = eINSTANCE.getCategoriaQuarto();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.HospedagemComunitarioImpl <em>Hospedagem Comunitario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.HospedagemComunitarioImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospedagemComunitario()
		 * @generated
		 */
		EClass HOSPEDAGEM_COMUNITARIO = eINSTANCE.getHospedagemComunitario();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.AplicacaoImpl <em>Aplicacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.AplicacaoImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getAplicacao()
		 * @generated
		 */
		EClass APLICACAO = eINSTANCE.getAplicacao();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACAO__TITULO = eINSTANCE.getAplicacao_Titulo();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACAO__CLASSES = eINSTANCE.getAplicacao_Classes();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.AtributoImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nome Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOME_ATRIBUTO = eINSTANCE.getAtributo_NomeAtributo();

		/**
		 * The meta object literal for the '<em><b>Atributo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO__ATRIBUTO = eINSTANCE.getAtributo_Atributo();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.HospedagemImpl <em>Hospedagem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.HospedagemImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospedagem()
		 * @generated
		 */
		EClass HOSPEDAGEM = eINSTANCE.getHospedagem();

		/**
		 * The meta object literal for the '<em><b>Recepcionista</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPEDAGEM__RECEPCIONISTA = eINSTANCE.getHospedagem_Recepcionista();

		/**
		 * The meta object literal for the '<em><b>Hospede</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPEDAGEM__HOSPEDE = eINSTANCE.getHospedagem_Hospede();

		/**
		 * The meta object literal for the '<em><b>Quarto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPEDAGEM__QUARTO = eINSTANCE.getHospedagem_Quarto();

	}

} //HotelariaDSLPackage
