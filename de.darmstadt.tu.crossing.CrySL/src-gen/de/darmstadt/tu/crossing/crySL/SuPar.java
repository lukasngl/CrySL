/**
 * generated by Xtext 2.16.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Su Par</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.SuPar#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getSuPar()
 * @model
 * @generated
 */
public interface SuPar extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(LiteralExpression)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getSuPar_Val()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getVal();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.SuPar#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(LiteralExpression value);

} // SuPar
