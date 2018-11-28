/**
 * generated by Xtext 2.15.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.LitList;
import de.darmstadt.tu.crossing.cryptSL.LiteralExpression;
import de.darmstadt.tu.crossing.cryptSL.SuperType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getLitsleft <em>Litsleft</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getPart <em>Part</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getInd <em>Ind</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getLit <em>Lit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralExpressionImpl extends ConstraintImpl implements LiteralExpression
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EObject name;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SuperType value;

  /**
   * The cached value of the '{@link #getCons() <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCons()
   * @generated
   * @ordered
   */
  protected EObject cons;

  /**
   * The cached value of the '{@link #getLitsleft() <em>Litsleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitsleft()
   * @generated
   * @ordered
   */
  protected LitList litsleft;

  /**
   * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected static final String PART_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected String part = PART_EDEFAULT;

  /**
   * The default value of the '{@link #getInd() <em>Ind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInd()
   * @generated
   * @ordered
   */
  protected static final String IND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInd() <em>Ind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInd()
   * @generated
   * @ordered
   */
  protected String ind = IND_EDEFAULT;

  /**
   * The default value of the '{@link #getSplit() <em>Split</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSplit()
   * @generated
   * @ordered
   */
  protected static final String SPLIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSplit() <em>Split</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSplit()
   * @generated
   * @ordered
   */
  protected String split = SPLIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected LiteralExpression lit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralExpressionImpl()
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
    return CryptSLPackage.Literals.LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(EObject newName, NotificationChain msgs)
  {
    EObject oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(EObject newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (SuperType)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.LITERAL_EXPRESSION__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SuperType newValue)
  {
    SuperType oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getCons()
  {
    return cons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCons(EObject newCons, NotificationChain msgs)
  {
    EObject oldCons = cons;
    cons = newCons;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__CONS, oldCons, newCons);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCons(EObject newCons)
  {
    if (newCons != cons)
    {
      NotificationChain msgs = null;
      if (cons != null)
        msgs = ((InternalEObject)cons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__CONS, null, msgs);
      if (newCons != null)
        msgs = ((InternalEObject)newCons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__CONS, null, msgs);
      msgs = basicSetCons(newCons, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__CONS, newCons, newCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LitList getLitsleft()
  {
    return litsleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLitsleft(LitList newLitsleft, NotificationChain msgs)
  {
    LitList oldLitsleft = litsleft;
    litsleft = newLitsleft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, oldLitsleft, newLitsleft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitsleft(LitList newLitsleft)
  {
    if (newLitsleft != litsleft)
    {
      NotificationChain msgs = null;
      if (litsleft != null)
        msgs = ((InternalEObject)litsleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, null, msgs);
      if (newLitsleft != null)
        msgs = ((InternalEObject)newLitsleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, null, msgs);
      msgs = basicSetLitsleft(newLitsleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, newLitsleft, newLitsleft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPart()
  {
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPart(String newPart)
  {
    String oldPart = part;
    part = newPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__PART, oldPart, part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInd()
  {
    return ind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInd(String newInd)
  {
    String oldInd = ind;
    ind = newInd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__IND, oldInd, ind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSplit()
  {
    return split;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSplit(String newSplit)
  {
    String oldSplit = split;
    split = newSplit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__SPLIT, oldSplit, split));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLit(LiteralExpression newLit, NotificationChain msgs)
  {
    LiteralExpression oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__LIT, oldLit, newLit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLit(LiteralExpression newLit)
  {
    if (newLit != lit)
    {
      NotificationChain msgs = null;
      if (lit != null)
        msgs = ((InternalEObject)lit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__LIT, null, msgs);
      if (newLit != null)
        msgs = ((InternalEObject)newLit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__LIT, null, msgs);
      msgs = basicSetLit(newLit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__LIT, newLit, newLit));
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        return basicSetName(null, msgs);
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        return basicSetCons(null, msgs);
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        return basicSetLitsleft(null, msgs);
      case CryptSLPackage.LITERAL_EXPRESSION__LIT:
        return basicSetLit(null, msgs);
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        return getName();
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        return getCons();
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        return getLitsleft();
      case CryptSLPackage.LITERAL_EXPRESSION__PART:
        return getPart();
      case CryptSLPackage.LITERAL_EXPRESSION__IND:
        return getInd();
      case CryptSLPackage.LITERAL_EXPRESSION__SPLIT:
        return getSplit();
      case CryptSLPackage.LITERAL_EXPRESSION__LIT:
        return getLit();
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        setName((EObject)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        setValue((SuperType)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        setCons((EObject)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        setLitsleft((LitList)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__PART:
        setPart((String)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__IND:
        setInd((String)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__SPLIT:
        setSplit((String)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__LIT:
        setLit((LiteralExpression)newValue);
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        setName((EObject)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        setValue((SuperType)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        setCons((EObject)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        setLitsleft((LitList)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__PART:
        setPart(PART_EDEFAULT);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__IND:
        setInd(IND_EDEFAULT);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__SPLIT:
        setSplit(SPLIT_EDEFAULT);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__LIT:
        setLit((LiteralExpression)null);
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        return name != null;
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        return value != null;
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        return cons != null;
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        return litsleft != null;
      case CryptSLPackage.LITERAL_EXPRESSION__PART:
        return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
      case CryptSLPackage.LITERAL_EXPRESSION__IND:
        return IND_EDEFAULT == null ? ind != null : !IND_EDEFAULT.equals(ind);
      case CryptSLPackage.LITERAL_EXPRESSION__SPLIT:
        return SPLIT_EDEFAULT == null ? split != null : !SPLIT_EDEFAULT.equals(split);
      case CryptSLPackage.LITERAL_EXPRESSION__LIT:
        return lit != null;
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
    result.append(" (part: ");
    result.append(part);
    result.append(", ind: ");
    result.append(ind);
    result.append(", split: ");
    result.append(split);
    result.append(')');
    return result.toString();
  }

} //LiteralExpressionImpl
