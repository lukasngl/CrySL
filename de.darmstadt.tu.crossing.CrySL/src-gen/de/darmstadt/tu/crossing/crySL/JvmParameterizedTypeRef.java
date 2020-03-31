/**
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jvm Parameterized Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.JvmParameterizedTypeRef#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getJvmParameterizedTypeRef()
 * @model
 * @generated
 */
public interface JvmParameterizedTypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.crySL.JvmTypeReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getJvmParameterizedTypeRef_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<JvmTypeReference> getArguments();

} // JvmParameterizedTypeRef