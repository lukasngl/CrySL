/**
 * generated by Xtext 2.16.0
 */
package de.darmstadt.tu.crossing.crySL.impl;

import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.ForbMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmExecutable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forb Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.ForbMethodImpl#getJavaMeth <em>Java Meth</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.ForbMethodImpl#getRep <em>Rep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForbMethodImpl extends MinimalEObjectImpl.Container implements ForbMethod
{
  /**
   * The cached value of the '{@link #getJavaMeth() <em>Java Meth</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaMeth()
   * @generated
   * @ordered
   */
  protected JvmExecutable javaMeth;

  /**
   * The cached value of the '{@link #getRep() <em>Rep</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRep()
   * @generated
   * @ordered
   */
  protected Event rep;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForbMethodImpl()
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
    return CrySLPackage.Literals.FORB_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmExecutable getJavaMeth()
  {
    if (javaMeth != null && javaMeth.eIsProxy())
    {
      InternalEObject oldJavaMeth = (InternalEObject)javaMeth;
      javaMeth = (JvmExecutable)eResolveProxy(oldJavaMeth);
      if (javaMeth != oldJavaMeth)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrySLPackage.FORB_METHOD__JAVA_METH, oldJavaMeth, javaMeth));
      }
    }
    return javaMeth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmExecutable basicGetJavaMeth()
  {
    return javaMeth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaMeth(JvmExecutable newJavaMeth)
  {
    JvmExecutable oldJavaMeth = javaMeth;
    javaMeth = newJavaMeth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrySLPackage.FORB_METHOD__JAVA_METH, oldJavaMeth, javaMeth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getRep()
  {
    if (rep != null && rep.eIsProxy())
    {
      InternalEObject oldRep = (InternalEObject)rep;
      rep = (Event)eResolveProxy(oldRep);
      if (rep != oldRep)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrySLPackage.FORB_METHOD__REP, oldRep, rep));
      }
    }
    return rep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetRep()
  {
    return rep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRep(Event newRep)
  {
    Event oldRep = rep;
    rep = newRep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrySLPackage.FORB_METHOD__REP, oldRep, rep));
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
      case CrySLPackage.FORB_METHOD__JAVA_METH:
        if (resolve) return getJavaMeth();
        return basicGetJavaMeth();
      case CrySLPackage.FORB_METHOD__REP:
        if (resolve) return getRep();
        return basicGetRep();
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
      case CrySLPackage.FORB_METHOD__JAVA_METH:
        setJavaMeth((JvmExecutable)newValue);
        return;
      case CrySLPackage.FORB_METHOD__REP:
        setRep((Event)newValue);
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
      case CrySLPackage.FORB_METHOD__JAVA_METH:
        setJavaMeth((JvmExecutable)null);
        return;
      case CrySLPackage.FORB_METHOD__REP:
        setRep((Event)null);
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
      case CrySLPackage.FORB_METHOD__JAVA_METH:
        return javaMeth != null;
      case CrySLPackage.FORB_METHOD__REP:
        return rep != null;
    }
    return super.eIsSet(featureID);
  }

} //ForbMethodImpl
