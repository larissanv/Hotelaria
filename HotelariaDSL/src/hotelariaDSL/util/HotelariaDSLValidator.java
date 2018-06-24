/**
 */
package hotelariaDSL.util;

import hotelariaDSL.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see hotelariaDSL.HotelariaDSLPackage
 * @generated
 */
public class HotelariaDSLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HotelariaDSLValidator INSTANCE = new HotelariaDSLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "hotelariaDSL";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelariaDSLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HotelariaDSLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case HotelariaDSLPackage.SUPER:
				return validateSuper((Super)value, diagnostics, context);
			case HotelariaDSLPackage.HOSPEDE:
				return validateHospede((Hospede)value, diagnostics, context);
			case HotelariaDSLPackage.RECEPCIONISTA:
				return validateRecepcionista((Recepcionista)value, diagnostics, context);
			case HotelariaDSLPackage.QUARTO:
				return validateQuarto((Quarto)value, diagnostics, context);
			case HotelariaDSLPackage.QUARTO_SOLTEIRO:
				return validateQuartoSolteiro((QuartoSolteiro)value, diagnostics, context);
			case HotelariaDSLPackage.QUARTO_COMUNITARIO:
				return validateQuartoComunitario((QuartoComunitario)value, diagnostics, context);
			case HotelariaDSLPackage.QUARTO_CASAL:
				return validateQuartoCasal((QuartoCasal)value, diagnostics, context);
			case HotelariaDSLPackage.APLICACAO:
				return validateAplicacao((Aplicacao)value, diagnostics, context);
			case HotelariaDSLPackage.ATRIBUTO:
				return validateAtributo((Atributo)value, diagnostics, context);
			case HotelariaDSLPackage.HOSPEDAGEM:
				return validateHospedagem((Hospedagem)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuper(Super super_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(super_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospede(Hospede hospede, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hospede, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecepcionista(Recepcionista recepcionista, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recepcionista, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuarto(Quarto quarto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quarto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartoSolteiro(QuartoSolteiro quartoSolteiro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quartoSolteiro, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartoComunitario(QuartoComunitario quartoComunitario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quartoComunitario, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartoCasal(QuartoCasal quartoCasal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quartoCasal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacao(Aplicacao aplicacao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aplicacao, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aplicacao, diagnostics, context);
		if (result || diagnostics != null) result &= validateAplicacao_TipoQuartoInvalido(aplicacao, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TipoQuartoInvalido constraint of '<em>Aplicacao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacao_TipoQuartoInvalido(Aplicacao aplicacao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		boolean quartoC = false;
		boolean quartoSCa = false;
		
		for(Super e : aplicacao.getClasses()) {
			if(e instanceof QuartoComunitario) {
				quartoC = true;
			}else
			if(e instanceof QuartoSolteiro) {
				quartoSCa = true;					
			}else
			if(e instanceof QuartoCasal) {
				quartoSCa = true;
			}
		}
		
		if(quartoC && quartoSCa) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "TipoQuartoInvalido", "Conflito de tipos de quarto: tipo comunitário é exclusivo" },
								new Object[] { aplicacao }, context));
			}
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atributo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospedagem(Hospedagem hospedagem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hospedagem, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HotelariaDSLValidator
