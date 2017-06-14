/**
 * generated by Xtext 2.12.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forbidden Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ForbiddenBlock#getForb_methods <em>Forb methods</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getForbiddenBlock()
 * @model
 * @generated
 */
public interface ForbiddenBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Forb methods</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.ForbMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forb methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forb methods</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getForbiddenBlock_Forb_methods()
   * @model containment="true"
   * @generated
   */
  EList<ForbMethod> getForb_methods();

} // ForbiddenBlock
