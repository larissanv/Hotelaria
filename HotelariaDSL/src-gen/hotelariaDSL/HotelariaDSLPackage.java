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
	 * The meta object id for the '{@link hotelariaDSL.impl.AplicacaoImpl <em>Aplicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.AplicacaoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getAplicacao()
	 * @generated
	 */
	int APLICACAO = 8;

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
	 * The meta object id for the '{@link hotelariaDSL.impl.SuperImpl <em>Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.SuperImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getSuper()
	 * @generated
	 */
	int SUPER = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__TITULO = APLICACAO__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__CLASSES = APLICACAO__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__NOME = APLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__ATRIBUTOS = APLICACAO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__SUPERCLASSE = APLICACAO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_COUNT = APLICACAO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_OPERATION_COUNT = APLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.PessoaImpl <em>Pessoa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.PessoaImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getPessoa()
	 * @generated
	 */
	int PESSOA = 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA__SUPERCLASSE = SUPER__SUPERCLASSE;

	/**
	 * The number of structural features of the '<em>Pessoa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pessoa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESSOA_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.HospedeImpl <em>Hospede</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.HospedeImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getHospede()
	 * @generated
	 */
	int HOSPEDE = 2;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPEDE__SUPERCLASSE = SUPER__SUPERCLASSE;

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
	int RECEPCIONISTA = 3;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCIONISTA__SUPERCLASSE = SUPER__SUPERCLASSE;

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
	int QUARTO = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO__SUPERCLASSE = SUPER__SUPERCLASSE;

	/**
	 * The number of structural features of the '<em>Quarto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quarto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.QuartoSolteiroImpl <em>Quarto Solteiro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.QuartoSolteiroImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuartoSolteiro()
	 * @generated
	 */
	int QUARTO_SOLTEIRO = 5;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO__TITULO = QUARTO__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO__CLASSES = QUARTO__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO__NOME = QUARTO__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO__ATRIBUTOS = QUARTO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO__SUPERCLASSE = QUARTO__SUPERCLASSE;

	/**
	 * The number of structural features of the '<em>Quarto Solteiro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO_FEATURE_COUNT = QUARTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quarto Solteiro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_SOLTEIRO_OPERATION_COUNT = QUARTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.QuartoComunitarioImpl <em>Quarto Comunitario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.QuartoComunitarioImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuartoComunitario()
	 * @generated
	 */
	int QUARTO_COMUNITARIO = 6;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO__SUPERCLASSE = SUPER__SUPERCLASSE;

	/**
	 * The number of structural features of the '<em>Quarto Comunitario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quarto Comunitario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_COMUNITARIO_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.QuartoCasalImpl <em>Quarto Casal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.QuartoCasalImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuartoCasal()
	 * @generated
	 */
	int QUARTO_CASAL = 7;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL__SUPERCLASSE = SUPER__SUPERCLASSE;

	/**
	 * The number of structural features of the '<em>Quarto Casal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quarto Casal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTO_CASAL_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelariaDSL.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelariaDSL.impl.AtributoImpl
	 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 9;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TITULO = SUPER__TITULO;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__CLASSES = SUPER__CLASSES;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOME = SUPER__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ATRIBUTOS = SUPER__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Superclasse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__SUPERCLASSE = SUPER__SUPERCLASSE;

	/**
	 * The feature id for the '<em><b>Nome Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOME_ATRIBUTO = SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = SUPER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = SUPER_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the reference list '{@link hotelariaDSL.Super#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atributos</em>'.
	 * @see hotelariaDSL.Super#getAtributos()
	 * @see #getSuper()
	 * @generated
	 */
	EReference getSuper_Atributos();

	/**
	 * Returns the meta object for the reference list '{@link hotelariaDSL.Super#getSuperclasse <em>Superclasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superclasse</em>'.
	 * @see hotelariaDSL.Super#getSuperclasse()
	 * @see #getSuper()
	 * @generated
	 */
	EReference getSuper_Superclasse();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.Pessoa <em>Pessoa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pessoa</em>'.
	 * @see hotelariaDSL.Pessoa
	 * @generated
	 */
	EClass getPessoa();

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
	 * Returns the meta object for class '{@link hotelariaDSL.QuartoSolteiro <em>Quarto Solteiro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quarto Solteiro</em>'.
	 * @see hotelariaDSL.QuartoSolteiro
	 * @generated
	 */
	EClass getQuartoSolteiro();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.QuartoComunitario <em>Quarto Comunitario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quarto Comunitario</em>'.
	 * @see hotelariaDSL.QuartoComunitario
	 * @generated
	 */
	EClass getQuartoComunitario();

	/**
	 * Returns the meta object for class '{@link hotelariaDSL.QuartoCasal <em>Quarto Casal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quarto Casal</em>'.
	 * @see hotelariaDSL.QuartoCasal
	 * @generated
	 */
	EClass getQuartoCasal();

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
	 * Returns the meta object for the attribute '{@link hotelariaDSL.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see hotelariaDSL.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

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
		 * The meta object literal for the '<em><b>Atributos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER__ATRIBUTOS = eINSTANCE.getSuper_Atributos();

		/**
		 * The meta object literal for the '<em><b>Superclasse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER__SUPERCLASSE = eINSTANCE.getSuper_Superclasse();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.PessoaImpl <em>Pessoa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.PessoaImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getPessoa()
		 * @generated
		 */
		EClass PESSOA = eINSTANCE.getPessoa();

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
		 * The meta object literal for the '{@link hotelariaDSL.impl.QuartoSolteiroImpl <em>Quarto Solteiro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.QuartoSolteiroImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuartoSolteiro()
		 * @generated
		 */
		EClass QUARTO_SOLTEIRO = eINSTANCE.getQuartoSolteiro();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.QuartoComunitarioImpl <em>Quarto Comunitario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.QuartoComunitarioImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuartoComunitario()
		 * @generated
		 */
		EClass QUARTO_COMUNITARIO = eINSTANCE.getQuartoComunitario();

		/**
		 * The meta object literal for the '{@link hotelariaDSL.impl.QuartoCasalImpl <em>Quarto Casal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelariaDSL.impl.QuartoCasalImpl
		 * @see hotelariaDSL.impl.HotelariaDSLPackageImpl#getQuartoCasal()
		 * @generated
		 */
		EClass QUARTO_CASAL = eINSTANCE.getQuartoCasal();

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
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

	}

} //HotelariaDSLPackage
