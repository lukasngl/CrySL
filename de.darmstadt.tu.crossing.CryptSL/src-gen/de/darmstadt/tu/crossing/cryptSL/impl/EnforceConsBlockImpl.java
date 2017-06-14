/**
 * generated by Xtext 2.12.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.Constraint;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.EnforceConsBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enforce Cons Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.EnforceConsBlockImpl#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnforceConsBlockImpl extends MinimalEObjectImpl.Container implements EnforceConsBlock
{
  /**
   * The cached value of the '{@link #getReq() <em>Req</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq()
   * @generated
   * @ordered
   */
  protected EList<Constraint> req;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnforceConsBlockImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CryptSLPackage.Literals.ENFORCE_CONS_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getReq()
  {
    if (req == null)
    {
      req = new EObjectContainmentEList<Constraint>(Constraint.class, this, CryptSLPackage.ENFORCE_CONS_BLOCK__REQ);
    }
    return req;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CryptSLPackage.ENFORCE_CONS_BLOCK__REQ:
        return ((InternalEList<?>)getReq()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CryptSLPackage.ENFORCE_CONS_BLOCK__REQ:
        return getReq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CryptSLPackage.ENFORCE_CONS_BLOCK__REQ:
        getReq().clear();
        getReq().addAll((Collection<? extends Constraint>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CryptSLPackage.ENFORCE_CONS_BLOCK__REQ:
        getReq().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CryptSLPackage.ENFORCE_CONS_BLOCK__REQ:
        return req != null && !req.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnforceConsBlockImpl
