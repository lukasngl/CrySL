/**
 * generated by Xtext 2.28.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pred Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.PredLit#getCons <em>Cons</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.PredLit#getNot <em>Not</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.PredLit#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getPredLit()
 * @model
 * @generated
 */
public interface PredLit extends ReqPred
{
  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(EObject)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getPredLit_Cons()
   * @model containment="true"
   * @generated
   */
  EObject getCons();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.PredLit#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(EObject value);

  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(String)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getPredLit_Not()
   * @model
   * @generated
   */
  String getNot();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.PredLit#getNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #getNot()
   * @generated
   */
  void setNot(String value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(Pred)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getPredLit_Pred()
   * @model containment="true"
   * @generated
   */
  Pred getPred();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.PredLit#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(Pred value);

} // PredLit
