/**
 * generated by Xtext 2.16.0
 */
package de.darmstadt.tu.crossing.crySL.impl;

import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.LogicalImply;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Imply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.LogicalImplyImpl#getIMPLIES <em>IMPLIES</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalImplyImpl extends MinimalEObjectImpl.Container implements LogicalImply
{
  /**
   * The default value of the '{@link #getIMPLIES() <em>IMPLIES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIMPLIES()
   * @generated
   * @ordered
   */
  protected static final String IMPLIES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIMPLIES() <em>IMPLIES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIMPLIES()
   * @generated
   * @ordered
   */
  protected String implies = IMPLIES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalImplyImpl()
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
    return CrySLPackage.Literals.LOGICAL_IMPLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIMPLIES()
  {
    return implies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIMPLIES(String newIMPLIES)
  {
    String oldIMPLIES = implies;
    implies = newIMPLIES;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrySLPackage.LOGICAL_IMPLY__IMPLIES, oldIMPLIES, implies));
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
      case CrySLPackage.LOGICAL_IMPLY__IMPLIES:
        return getIMPLIES();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CrySLPackage.LOGICAL_IMPLY__IMPLIES:
        setIMPLIES((String)newValue);
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
      case CrySLPackage.LOGICAL_IMPLY__IMPLIES:
        setIMPLIES(IMPLIES_EDEFAULT);
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
      case CrySLPackage.LOGICAL_IMPLY__IMPLIES:
        return IMPLIES_EDEFAULT == null ? implies != null : !IMPLIES_EDEFAULT.equals(implies);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (IMPLIES: ");
    result.append(implies);
    result.append(')');
    return result.toString();
  }

} //LogicalImplyImpl
