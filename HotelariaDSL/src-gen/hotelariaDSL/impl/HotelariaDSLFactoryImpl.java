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
			HotelariaDSLFactory theHotelariaDSLFactory = (HotelariaDSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(HotelariaDSLPackage.eNS_URI);
			if (theHotelariaDSLFactory != null) {
				return theHotelariaDSLFactory;
			}
		} catch (Exception exception) {
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
		case HotelariaDSLPackage.HOSPEDE:
			return createHospede();
		case HotelariaDSLPackage.RECEPCIONISTA:
			return createRecepcionista();
		case HotelariaDSLPackage.QUARTO:
			return createQuarto();
		case HotelariaDSLPackage.QUARTO_SOLTEIRO:
			return createQuartoSolteiro();
		case HotelariaDSLPackage.QUARTO_COMUNITARIO:
			return createQuartoComunitario();
		case HotelariaDSLPackage.QUARTO_CASAL:
			return createQuartoCasal();
		case HotelariaDSLPackage.APLICACAO:
			return createAplicacao();
		case HotelariaDSLPackage.ATRIBUTO:
			return createAtributo();
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
	public QuartoSolteiro createQuartoSolteiro() {
		QuartoSolteiroImpl quartoSolteiro = new QuartoSolteiroImpl();
		return quartoSolteiro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuartoComunitario createQuartoComunitario() {
		QuartoComunitarioImpl quartoComunitario = new QuartoComunitarioImpl();
		return quartoComunitario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuartoCasal createQuartoCasal() {
		QuartoCasalImpl quartoCasal = new QuartoCasalImpl();
		return quartoCasal;
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
		return (HotelariaDSLPackage) getEPackage();
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
