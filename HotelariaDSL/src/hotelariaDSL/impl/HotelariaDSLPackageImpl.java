/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.Aplicacao;
import hotelariaDSL.Atributo;
import hotelariaDSL.CategoriaQuarto;
import hotelariaDSL.Hospedagem;
import hotelariaDSL.HospedagemComunitario;
import hotelariaDSL.HospedagemPago;
import hotelariaDSL.Hospede;
import hotelariaDSL.HotelariaDSLFactory;
import hotelariaDSL.HotelariaDSLPackage;
import hotelariaDSL.Quarto;
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
	private EClass hospedagemPagoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriaQuartoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospedagemComunitarioEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospedagemEClass = null;

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
		if (isInited) return (HotelariaDSLPackage)EPackage.Registry.INSTANCE.getEPackage(HotelariaDSLPackage.eNS_URI);

		// Obtain or create and register package
		HotelariaDSLPackageImpl theHotelariaDSLPackage = (HotelariaDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelariaDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelariaDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHotelariaDSLPackage.createPackageContents();

		// Initialize created meta-data
		theHotelariaDSLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHotelariaDSLPackage, 
			 new EValidator.Descriptor() {
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
		return (EAttribute)superEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuper_Atributos() {
		return (EReference)superEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute)hospedeEClass.getEStructuralFeatures().get(0);
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
	public EReference getQuarto_Categorias() {
		return (EReference)quartoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospedagemPago() {
		return hospedagemPagoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoriaQuarto() {
		return categoriaQuartoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospedagemComunitario() {
		return hospedagemComunitarioEClass;
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
		return (EAttribute)aplicacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacao_Classes() {
		return (EReference)aplicacaoEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAtributo_Nome() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Tipo() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHospedagem() {
		return hospedagemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospedagem_Recepcionista() {
		return (EReference)hospedagemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospedagem_Hospedes() {
		return (EReference)hospedagemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHospedagem_Quarto() {
		return (EReference)hospedagemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLFactory getHotelariaDSLFactory() {
		return (HotelariaDSLFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		superEClass = createEClass(SUPER);
		createEAttribute(superEClass, SUPER__NOME);
		createEReference(superEClass, SUPER__ATRIBUTOS);

		hospedeEClass = createEClass(HOSPEDE);
		createEAttribute(hospedeEClass, HOSPEDE__CONTA_BANCO);

		recepcionistaEClass = createEClass(RECEPCIONISTA);

		quartoEClass = createEClass(QUARTO);
		createEReference(quartoEClass, QUARTO__CATEGORIAS);

		hospedagemPagoEClass = createEClass(HOSPEDAGEM_PAGO);

		categoriaQuartoEClass = createEClass(CATEGORIA_QUARTO);

		hospedagemComunitarioEClass = createEClass(HOSPEDAGEM_COMUNITARIO);

		aplicacaoEClass = createEClass(APLICACAO);
		createEAttribute(aplicacaoEClass, APLICACAO__TITULO);
		createEReference(aplicacaoEClass, APLICACAO__CLASSES);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOME);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);

		hospedagemEClass = createEClass(HOSPEDAGEM);
		createEReference(hospedagemEClass, HOSPEDAGEM__RECEPCIONISTA);
		createEReference(hospedagemEClass, HOSPEDAGEM__HOSPEDES);
		createEReference(hospedagemEClass, HOSPEDAGEM__QUARTO);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hospedeEClass.getESuperTypes().add(this.getSuper());
		recepcionistaEClass.getESuperTypes().add(this.getSuper());
		quartoEClass.getESuperTypes().add(this.getSuper());
		hospedagemPagoEClass.getESuperTypes().add(this.getHospedagem());
		categoriaQuartoEClass.getESuperTypes().add(this.getSuper());
		hospedagemComunitarioEClass.getESuperTypes().add(this.getHospedagem());
		hospedagemEClass.getESuperTypes().add(this.getSuper());

		// Initialize classes, features, and operations; add parameters
		initEClass(superEClass, Super.class, "Super", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuper_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, Super.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuper_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, Super.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospedeEClass, Hospede.class, "Hospede", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHospede_ContaBanco(), ecorePackage.getEString(), "contaBanco", null, 1, 1, Hospede.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recepcionistaEClass, Recepcionista.class, "Recepcionista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quartoEClass, Quarto.class, "Quarto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuarto_Categorias(), this.getCategoriaQuarto(), null, "categorias", null, 1, -1, Quarto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospedagemPagoEClass, HospedagemPago.class, "HospedagemPago", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoriaQuartoEClass, CategoriaQuarto.class, "CategoriaQuarto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hospedagemComunitarioEClass, HospedagemComunitario.class, "HospedagemComunitario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aplicacaoEClass, Aplicacao.class, "Aplicacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAplicacao_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, Aplicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacao_Classes(), this.getSuper(), null, "classes", null, 0, -1, Aplicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospedagemEClass, Hospedagem.class, "Hospedagem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHospedagem_Recepcionista(), this.getRecepcionista(), null, "recepcionista", null, 1, 1, Hospedagem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospedagem_Hospedes(), this.getHospede(), null, "hospedes", null, 1, -1, Hospedagem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHospedagem_Quarto(), this.getQuarto(), null, "quarto", null, 1, 1, Hospedagem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addAnnotation
		  (aplicacaoEClass, 
		   source, 
		   new String[] {
			 "constraints", "HospedagemUnica"
		   });
	}

} //HotelariaDSLPackageImpl
