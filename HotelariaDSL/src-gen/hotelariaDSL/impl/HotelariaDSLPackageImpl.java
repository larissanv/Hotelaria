/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Aplicacao;
import hotelariaDSL.Atributo;
import hotelariaDSL.Hospede;
import hotelariaDSL.HotelariaDSLFactory;
import hotelariaDSL.HotelariaDSLPackage;
import hotelariaDSL.Pessoa;
import hotelariaDSL.Quarto;
import hotelariaDSL.QuartoCasal;
import hotelariaDSL.QuartoComunitario;
import hotelariaDSL.QuartoSolteiro;
import hotelariaDSL.Recepcionista;
import hotelariaDSL.Super;

import hotelariaDSL.util.HotelariaDSLValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelariaDSLPackageImpl extends EPackageImpl implements HotelariaDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pessoaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospedeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recepcionistaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quartoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quartoSolteiroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quartoComunitarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quartoCasalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hotelariaDSL.HotelariaDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelariaDSLPackageImpl() {
		super(eNS_URI, HotelariaDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HotelariaDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelariaDSLPackage init() {
		if (isInited)
			return (HotelariaDSLPackage) EPackage.Registry.INSTANCE.getEPackage(HotelariaDSLPackage.eNS_URI);

		// Obtain or create and register package
		HotelariaDSLPackageImpl theHotelariaDSLPackage = (HotelariaDSLPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof HotelariaDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new HotelariaDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHotelariaDSLPackage.createPackageContents();

		// Initialize created meta-data
		theHotelariaDSLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theHotelariaDSLPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return HotelariaDSLValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theHotelariaDSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelariaDSLPackage.eNS_URI, theHotelariaDSLPackage);
		return theHotelariaDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuper() {
		return superEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuper_Nome() {
		return (EAttribute) superEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuper_Atributos() {
		return (EReference) superEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuper_Superclasse() {
		return (EReference) superEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPessoa() {
		return pessoaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospede() {
		return hospedeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHospede_ContaBanco() {
		return (EAttribute) hospedeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecepcionista() {
		return recepcionistaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuarto() {
		return quartoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuartoSolteiro() {
		return quartoSolteiroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuartoComunitario() {
		return quartoComunitarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuartoCasal() {
		return quartoCasalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicacao() {
		return aplicacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacao_Titulo() {
		return (EAttribute) aplicacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacao_Classes() {
		return (EReference) aplicacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_NomeAtributo() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Tipo() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLFactory getHotelariaDSLFactory() {
		return (HotelariaDSLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		superEClass = createEClass(SUPER);
		createEAttribute(superEClass, SUPER__NOME);
		createEReference(superEClass, SUPER__ATRIBUTOS);
		createEReference(superEClass, SUPER__SUPERCLASSE);

		pessoaEClass = createEClass(PESSOA);

		hospedeEClass = createEClass(HOSPEDE);
		createEAttribute(hospedeEClass, HOSPEDE__CONTA_BANCO);

		recepcionistaEClass = createEClass(RECEPCIONISTA);

		quartoEClass = createEClass(QUARTO);

		quartoSolteiroEClass = createEClass(QUARTO_SOLTEIRO);

		quartoComunitarioEClass = createEClass(QUARTO_COMUNITARIO);

		quartoCasalEClass = createEClass(QUARTO_CASAL);

		aplicacaoEClass = createEClass(APLICACAO);
		createEAttribute(aplicacaoEClass, APLICACAO__TITULO);
		createEReference(aplicacaoEClass, APLICACAO__CLASSES);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOME_ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		superEClass.getESuperTypes().add(this.getAplicacao());
		pessoaEClass.getESuperTypes().add(this.getSuper());
		hospedeEClass.getESuperTypes().add(this.getSuper());
		hospedeEClass.getESuperTypes().add(this.getPessoa());
		recepcionistaEClass.getESuperTypes().add(this.getSuper());
		recepcionistaEClass.getESuperTypes().add(this.getPessoa());
		quartoEClass.getESuperTypes().add(this.getSuper());
		quartoSolteiroEClass.getESuperTypes().add(this.getQuarto());
		quartoSolteiroEClass.getESuperTypes().add(this.getSuper());
		quartoComunitarioEClass.getESuperTypes().add(this.getSuper());
		quartoComunitarioEClass.getESuperTypes().add(this.getQuarto());
		quartoCasalEClass.getESuperTypes().add(this.getSuper());
		quartoCasalEClass.getESuperTypes().add(this.getQuarto());
		atributoEClass.getESuperTypes().add(this.getSuper());

		// Initialize classes, features, and operations; add parameters
		initEClass(superEClass, Super.class, "Super", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuper_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, Super.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuper_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, Super.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuper_Superclasse(), this.getSuper(), null, "superclasse", null, 0, -1, Super.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pessoaEClass, Pessoa.class, "Pessoa", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hospedeEClass, Hospede.class, "Hospede", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHospede_ContaBanco(), ecorePackage.getEString(), "contaBanco", null, 1, 1, Hospede.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recepcionistaEClass, Recepcionista.class, "Recepcionista", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(quartoEClass, Quarto.class, "Quarto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quartoSolteiroEClass, QuartoSolteiro.class, "QuartoSolteiro", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(quartoComunitarioEClass, QuartoComunitario.class, "QuartoComunitario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(quartoCasalEClass, QuartoCasal.class, "QuartoCasal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aplicacaoEClass, Aplicacao.class, "Aplicacao", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAplicacao_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, Aplicacao.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacao_Classes(), this.getSuper(), null, "classes", null, 0, -1, Aplicacao.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_NomeAtributo(), ecorePackage.getEString(), "nomeAtributo", null, 1, 1,
				Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(aplicacaoEClass, source, new String[] { "constraints", "TipoQuartoInvalido" });
	}

} //HotelariaDSLPackageImpl
