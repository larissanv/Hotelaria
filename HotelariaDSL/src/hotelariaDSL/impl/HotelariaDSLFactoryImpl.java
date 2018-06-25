/**
 */
package hotelariaDSL.impl;

import hotelariaDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelariaDSLFactoryImpl extends EFactoryImpl implements HotelariaDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelariaDSLFactory init() {
		try {
			HotelariaDSLFactory theHotelariaDSLFactory = (HotelariaDSLFactory)EPackage.Registry.INSTANCE.getEFactory(HotelariaDSLPackage.eNS_URI);
			if (theHotelariaDSLFactory != null) {
				return theHotelariaDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelariaDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HotelariaDSLPackage.HOSPEDE: return createHospede();
			case HotelariaDSLPackage.RECEPCIONISTA: return createRecepcionista();
			case HotelariaDSLPackage.QUARTO: return createQuarto();
			case HotelariaDSLPackage.HOSPEDAGEM_PAGO: return createHospedagemPago();
			case HotelariaDSLPackage.CATEGORIA_QUARTO: return createCategoriaQuarto();
			case HotelariaDSLPackage.HOSPEDAGEM_COMUNITARIO: return createHospedagemComunitario();
			case HotelariaDSLPackage.APLICACAO: return createAplicacao();
			case HotelariaDSLPackage.ATRIBUTO: return createAtributo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospede createHospede() {
		HospedeImpl hospede = new HospedeImpl();
		return hospede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recepcionista createRecepcionista() {
		RecepcionistaImpl recepcionista = new RecepcionistaImpl();
		return recepcionista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quarto createQuarto() {
		QuartoImpl quarto = new QuartoImpl();
		return quarto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospedagemPago createHospedagemPago() {
		HospedagemPagoImpl hospedagemPago = new HospedagemPagoImpl();
		return hospedagemPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriaQuarto createCategoriaQuarto() {
		CategoriaQuartoImpl categoriaQuarto = new CategoriaQuartoImpl();
		return categoriaQuarto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospedagemComunitario createHospedagemComunitario() {
		HospedagemComunitarioImpl hospedagemComunitario = new HospedagemComunitarioImpl();
		return hospedagemComunitario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacao createAplicacao() {
		AplicacaoImpl aplicacao = new AplicacaoImpl();
		return aplicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLPackage getHotelariaDSLPackage() {
		return (HotelariaDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelariaDSLPackage getPackage() {
		return HotelariaDSLPackage.eINSTANCE;
	}

} //HotelariaDSLFactoryImpl
