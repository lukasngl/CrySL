/**
 * generated by Xtext 2.15.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.ComparingOperator;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparing Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl#getLESS <em>LESS</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl#getLESS_OR_EQUAL <em>LESS OR EQUAL</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl#getGREATER_OR_EQUAL <em>GREATER OR EQUAL</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl#getGREATER <em>GREATER</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl#getEQUAL <em>EQUAL</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl#getUNEQUAL <em>UNEQUAL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparingOperatorImpl extends MinimalEObjectImpl.Container implements ComparingOperator
{
  /**
   * The default value of the '{@link #getLESS() <em>LESS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLESS()
   * @generated
   * @ordered
   */
  protected static final String LESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLESS() <em>LESS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLESS()
   * @generated
   * @ordered
   */
  protected String less = LESS_EDEFAULT;

  /**
   * The default value of the '{@link #getLESS_OR_EQUAL() <em>LESS OR EQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLESS_OR_EQUAL()
   * @generated
   * @ordered
   */
  protected static final String LESS_OR_EQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLESS_OR_EQUAL() <em>LESS OR EQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLESS_OR_EQUAL()
   * @generated
   * @ordered
   */
  protected String lesS_OR_EQUAL = LESS_OR_EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getGREATER_OR_EQUAL() <em>GREATER OR EQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGREATER_OR_EQUAL()
   * @generated
   * @ordered
   */
  protected static final String GREATER_OR_EQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGREATER_OR_EQUAL() <em>GREATER OR EQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGREATER_OR_EQUAL()
   * @generated
   * @ordered
   */
  protected String greateR_OR_EQUAL = GREATER_OR_EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getGREATER() <em>GREATER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGREATER()
   * @generated
   * @ordered
   */
  protected static final String GREATER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGREATER() <em>GREATER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGREATER()
   * @generated
   * @ordered
   */
  protected String greater = GREATER_EDEFAULT;

  /**
   * The default value of the '{@link #getEQUAL() <em>EQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEQUAL()
   * @generated
   * @ordered
   */
  protected static final String EQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEQUAL() <em>EQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEQUAL()
   * @generated
   * @ordered
   */
  protected String equal = EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getUNEQUAL() <em>UNEQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUNEQUAL()
   * @generated
   * @ordered
   */
  protected static final String UNEQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUNEQUAL() <em>UNEQUAL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUNEQUAL()
   * @generated
   * @ordered
   */
  protected String unequal = UNEQUAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparingOperatorImpl()
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
    return CryptSLPackage.Literals.COMPARING_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLESS()
  {
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLESS(String newLESS)
  {
    String oldLESS = less;
    less = newLESS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.COMPARING_OPERATOR__LESS, oldLESS, less));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLESS_OR_EQUAL()
  {
    return lesS_OR_EQUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLESS_OR_EQUAL(String newLESS_OR_EQUAL)
  {
    String oldLESS_OR_EQUAL = lesS_OR_EQUAL;
    lesS_OR_EQUAL = newLESS_OR_EQUAL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.COMPARING_OPERATOR__LESS_OR_EQUAL, oldLESS_OR_EQUAL, lesS_OR_EQUAL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGREATER_OR_EQUAL()
  {
    return greateR_OR_EQUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGREATER_OR_EQUAL(String newGREATER_OR_EQUAL)
  {
    String oldGREATER_OR_EQUAL = greateR_OR_EQUAL;
    greateR_OR_EQUAL = newGREATER_OR_EQUAL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.COMPARING_OPERATOR__GREATER_OR_EQUAL, oldGREATER_OR_EQUAL, greateR_OR_EQUAL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGREATER()
  {
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGREATER(String newGREATER)
  {
    String oldGREATER = greater;
    greater = newGREATER;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.COMPARING_OPERATOR__GREATER, oldGREATER, greater));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEQUAL()
  {
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEQUAL(String newEQUAL)
  {
    String oldEQUAL = equal;
    equal = newEQUAL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.COMPARING_OPERATOR__EQUAL, oldEQUAL, equal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUNEQUAL()
  {
    return unequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUNEQUAL(String newUNEQUAL)
  {
    String oldUNEQUAL = unequal;
    unequal = newUNEQUAL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.COMPARING_OPERATOR__UNEQUAL, oldUNEQUAL, unequal));
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
      case CryptSLPackage.COMPARING_OPERATOR__LESS:
        return getLESS();
      case CryptSLPackage.COMPARING_OPERATOR__LESS_OR_EQUAL:
        return getLESS_OR_EQUAL();
      case CryptSLPackage.COMPARING_OPERATOR__GREATER_OR_EQUAL:
        return getGREATER_OR_EQUAL();
      case CryptSLPackage.COMPARING_OPERATOR__GREATER:
        return getGREATER();
      case CryptSLPackage.COMPARING_OPERATOR__EQUAL:
        return getEQUAL();
      case CryptSLPackage.COMPARING_OPERATOR__UNEQUAL:
        return getUNEQUAL();
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
      case CryptSLPackage.COMPARING_OPERATOR__LESS:
        setLESS((String)newValue);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__LESS_OR_EQUAL:
        setLESS_OR_EQUAL((String)newValue);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__GREATER_OR_EQUAL:
        setGREATER_OR_EQUAL((String)newValue);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__GREATER:
        setGREATER((String)newValue);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__EQUAL:
        setEQUAL((String)newValue);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__UNEQUAL:
        setUNEQUAL((String)newValue);
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
      case CryptSLPackage.COMPARING_OPERATOR__LESS:
        setLESS(LESS_EDEFAULT);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__LESS_OR_EQUAL:
        setLESS_OR_EQUAL(LESS_OR_EQUAL_EDEFAULT);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__GREATER_OR_EQUAL:
        setGREATER_OR_EQUAL(GREATER_OR_EQUAL_EDEFAULT);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__GREATER:
        setGREATER(GREATER_EDEFAULT);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__EQUAL:
        setEQUAL(EQUAL_EDEFAULT);
        return;
      case CryptSLPackage.COMPARING_OPERATOR__UNEQUAL:
        setUNEQUAL(UNEQUAL_EDEFAULT);
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
      case CryptSLPackage.COMPARING_OPERATOR__LESS:
        return LESS_EDEFAULT == null ? less != null : !LESS_EDEFAULT.equals(less);
      case CryptSLPackage.COMPARING_OPERATOR__LESS_OR_EQUAL:
        return LESS_OR_EQUAL_EDEFAULT == null ? lesS_OR_EQUAL != null : !LESS_OR_EQUAL_EDEFAULT.equals(lesS_OR_EQUAL);
      case CryptSLPackage.COMPARING_OPERATOR__GREATER_OR_EQUAL:
        return GREATER_OR_EQUAL_EDEFAULT == null ? greateR_OR_EQUAL != null : !GREATER_OR_EQUAL_EDEFAULT.equals(greateR_OR_EQUAL);
      case CryptSLPackage.COMPARING_OPERATOR__GREATER:
        return GREATER_EDEFAULT == null ? greater != null : !GREATER_EDEFAULT.equals(greater);
      case CryptSLPackage.COMPARING_OPERATOR__EQUAL:
        return EQUAL_EDEFAULT == null ? equal != null : !EQUAL_EDEFAULT.equals(equal);
      case CryptSLPackage.COMPARING_OPERATOR__UNEQUAL:
        return UNEQUAL_EDEFAULT == null ? unequal != null : !UNEQUAL_EDEFAULT.equals(unequal);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (LESS: ");
    result.append(less);
    result.append(", LESS_OR_EQUAL: ");
    result.append(lesS_OR_EQUAL);
    result.append(", GREATER_OR_EQUAL: ");
    result.append(greateR_OR_EQUAL);
    result.append(", GREATER: ");
    result.append(greater);
    result.append(", EQUAL: ");
    result.append(equal);
    result.append(", UNEQUAL: ");
    result.append(unequal);
    result.append(')');
    return result.toString();
  }

} //ComparingOperatorImpl
