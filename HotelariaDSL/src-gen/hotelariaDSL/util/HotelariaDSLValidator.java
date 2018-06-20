/**
 */
package hotelariaDSL.util;

import hotelariaDSL.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
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
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case HotelariaDSLPackage.SUPER:
			return validateSuper((Super) value, diagnostics, context);
		case HotelariaDSLPackage.PESSOA:
			return validatePessoa((Pessoa) value, diagnostics, context);
		case HotelariaDSLPackage.HOSPEDE:
			return validateHospede((Hospede) value, diagnostics, context);
		case HotelariaDSLPackage.RECEPCIONISTA:
			return validateRecepcionista((Recepcionista) value, diagnostics, context);
		case HotelariaDSLPackage.QUARTO:
			return validateQuarto((Quarto) value, diagnostics, context);
		case HotelariaDSLPackage.QUARTO_SOLTEIRO:
			return validateQuartoSolteiro((QuartoSolteiro) value, diagnostics, context);
		case HotelariaDSLPackage.QUARTO_COMUNITARIO:
			return validateQuartoComunitario((QuartoComunitario) value, diagnostics, context);
		case HotelariaDSLPackage.QUARTO_CASAL:
			return validateQuartoCasal((QuartoCasal) value, diagnostics, context);
		case HotelariaDSLPackage.APLICACAO:
			return validateAplicacao((Aplicacao) value, diagnostics, context);
		case HotelariaDSLPackage.ATRIBUTO:
			return validateAtributo((Atributo) value, diagnostics, context);
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
		if (!validate_NoCircularContainment(super_, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(super_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(super_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePessoa(Pessoa pessoa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pessoa, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pessoa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(pessoa, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospede(Hospede hospede, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospede, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(hospede, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(hospede, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecepcionista(Recepcionista recepcionista, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recepcionista, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(recepcionista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(recepcionista, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuarto(Quarto quarto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quarto, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(quarto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(quarto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartoSolteiro(QuartoSolteiro quartoSolteiro, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quartoSolteiro, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(quartoSolteiro, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(quartoSolteiro, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartoComunitario(QuartoComunitario quartoComunitario, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quartoComunitario, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(quartoComunitario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(quartoComunitario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartoCasal(QuartoCasal quartoCasal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quartoCasal, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(quartoCasal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(quartoCasal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacao(Aplicacao aplicacao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aplicacao, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(aplicacao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(aplicacao, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TipoQuartoInvalido constraint of '<em>Aplicacao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAplicacao_TipoQuartoInvalido(Aplicacao aplicacao, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
		if (!validate_NoCircularContainment(atributo, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAplicacao_TipoQuartoInvalido(atributo, diagnostics, context);
		return result;
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
