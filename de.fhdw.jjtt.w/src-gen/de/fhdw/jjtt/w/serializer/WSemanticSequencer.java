/*
 * generated by Xtext 2.12.0
 */
package de.fhdw.jjtt.w.serializer;

import com.google.inject.Inject;
import de.fhdw.jjtt.w.services.WGrammarAccess;
import de.fhdw.jjtt.w.w.Assignment;
import de.fhdw.jjtt.w.w.Constant;
import de.fhdw.jjtt.w.w.Loop;
import de.fhdw.jjtt.w.w.Sequence;
import de.fhdw.jjtt.w.w.Variable;
import de.fhdw.jjtt.w.w.WPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class WSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case WPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case WPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case WPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			case WPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Program returns Assignment
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (toBeAssigned=Variable var=Variable op=Operator const=Constant)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.ASSIGNMENT__TO_BE_ASSIGNED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.ASSIGNMENT__TO_BE_ASSIGNED));
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.ASSIGNMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.ASSIGNMENT__VAR));
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.ASSIGNMENT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.ASSIGNMENT__OP));
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.ASSIGNMENT__CONST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.ASSIGNMENT__CONST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getToBeAssignedVariableParserRuleCall_0_0(), semanticObject.getToBeAssigned());
		feeder.accept(grammarAccess.getAssignmentAccess().getVarVariableParserRuleCall_2_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssignmentAccess().getOpOperatorParserRuleCall_3_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAssignmentAccess().getConstConstantParserRuleCall_4_0(), semanticObject.getConst());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (var=Variable const=Constant prog=Program)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.LOOP__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.LOOP__VAR));
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.LOOP__CONST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.LOOP__CONST));
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.LOOP__PROG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.LOOP__PROG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoopAccess().getVarVariableParserRuleCall_1_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getLoopAccess().getConstConstantParserRuleCall_3_0(), semanticObject.getConst());
		feeder.accept(grammarAccess.getLoopAccess().getProgProgramParserRuleCall_5_0(), semanticObject.getProg());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Sequence
	 *     Sequence returns Sequence
	 *
	 * Constraint:
	 *     ((p1=Assignment | p1=Loop) p2=Program)
	 */
	protected void sequence_Sequence(ISerializationContext context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
