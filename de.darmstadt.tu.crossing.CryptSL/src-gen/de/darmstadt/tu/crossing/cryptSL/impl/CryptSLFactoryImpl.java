/**
 * generated by Xtext 2.15.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.Aggregate;
import de.darmstadt.tu.crossing.cryptSL.ArithmeticExpression;
import de.darmstadt.tu.crossing.cryptSL.ArithmeticOperator;
import de.darmstadt.tu.crossing.cryptSL.ArrayElements;
import de.darmstadt.tu.crossing.cryptSL.ComparingOperator;
import de.darmstadt.tu.crossing.cryptSL.ComparisonExpression;
import de.darmstadt.tu.crossing.cryptSL.Constraint;
import de.darmstadt.tu.crossing.cryptSL.CryptSLFactory;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.DestroysBlock;
import de.darmstadt.tu.crossing.cryptSL.Domainmodel;
import de.darmstadt.tu.crossing.cryptSL.EnforceConsBlock;
import de.darmstadt.tu.crossing.cryptSL.EnsuresBlock;
import de.darmstadt.tu.crossing.cryptSL.Event;
import de.darmstadt.tu.crossing.cryptSL.Expression;
import de.darmstadt.tu.crossing.cryptSL.ForbMethod;
import de.darmstadt.tu.crossing.cryptSL.ForbiddenBlock;
import de.darmstadt.tu.crossing.cryptSL.LitList;
import de.darmstadt.tu.crossing.cryptSL.Literal;
import de.darmstadt.tu.crossing.cryptSL.LiteralExpression;
import de.darmstadt.tu.crossing.cryptSL.LogicalImply;
import de.darmstadt.tu.crossing.cryptSL.LogicalOperator;
import de.darmstadt.tu.crossing.cryptSL.Method;
import de.darmstadt.tu.crossing.cryptSL.ObjectDecl;
import de.darmstadt.tu.crossing.cryptSL.Order;
import de.darmstadt.tu.crossing.cryptSL.Par;
import de.darmstadt.tu.crossing.cryptSL.ParList;
import de.darmstadt.tu.crossing.cryptSL.PreDefinedPredicates;
import de.darmstadt.tu.crossing.cryptSL.Pred;
import de.darmstadt.tu.crossing.cryptSL.ReqPred;
import de.darmstadt.tu.crossing.cryptSL.RequiredBlock;
import de.darmstadt.tu.crossing.cryptSL.RequiresBlock;
import de.darmstadt.tu.crossing.cryptSL.SimpleOrder;
import de.darmstadt.tu.crossing.cryptSL.SuPar;
import de.darmstadt.tu.crossing.cryptSL.SuParList;
import de.darmstadt.tu.crossing.cryptSL.SuperType;
import de.darmstadt.tu.crossing.cryptSL.UnaryOperator;
import de.darmstadt.tu.crossing.cryptSL.UnaryPreExpression;
import de.darmstadt.tu.crossing.cryptSL.UseBlock;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptSLFactoryImpl extends EFactoryImpl implements CryptSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CryptSLFactory init()
  {
    try
    {
      CryptSLFactory theCryptSLFactory = (CryptSLFactory)EPackage.Registry.INSTANCE.getEFactory(CryptSLPackage.eNS_URI);
      if (theCryptSLFactory != null)
      {
        return theCryptSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CryptSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CryptSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CryptSLPackage.DOMAINMODEL: return createDomainmodel();
      case CryptSLPackage.USE_BLOCK: return createUseBlock();
      case CryptSLPackage.FORBIDDEN_BLOCK: return createForbiddenBlock();
      case CryptSLPackage.REQUIRED_BLOCK: return createRequiredBlock();
      case CryptSLPackage.ENFORCE_CONS_BLOCK: return createEnforceConsBlock();
      case CryptSLPackage.REQUIRES_BLOCK: return createRequiresBlock();
      case CryptSLPackage.ENSURES_BLOCK: return createEnsuresBlock();
      case CryptSLPackage.DESTROYS_BLOCK: return createDestroysBlock();
      case CryptSLPackage.OBJECT_DECL: return createObjectDecl();
      case CryptSLPackage.FORB_METHOD: return createForbMethod();
      case CryptSLPackage.EVENT: return createEvent();
      case CryptSLPackage.SUPER_TYPE: return createSuperType();
      case CryptSLPackage.METHOD: return createMethod();
      case CryptSLPackage.PAR_LIST: return createParList();
      case CryptSLPackage.PAR: return createPar();
      case CryptSLPackage.EXPRESSION: return createExpression();
      case CryptSLPackage.CONSTRAINT: return createConstraint();
      case CryptSLPackage.LOGICAL_IMPLY: return createLogicalImply();
      case CryptSLPackage.LOGICAL_OPERATOR: return createLogicalOperator();
      case CryptSLPackage.COMPARING_OPERATOR: return createComparingOperator();
      case CryptSLPackage.ARITHMETIC_OPERATOR: return createArithmeticOperator();
      case CryptSLPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case CryptSLPackage.PRE_DEFINED_PREDICATES: return createPreDefinedPredicates();
      case CryptSLPackage.LITERAL: return createLiteral();
      case CryptSLPackage.UNARY_OPERATOR: return createUnaryOperator();
      case CryptSLPackage.ARRAY_ELEMENTS: return createArrayElements();
      case CryptSLPackage.LIT_LIST: return createLitList();
      case CryptSLPackage.PRED: return createPred();
      case CryptSLPackage.REQ_PRED: return createReqPred();
      case CryptSLPackage.SU_PAR_LIST: return createSuParList();
      case CryptSLPackage.SU_PAR: return createSuPar();
      case CryptSLPackage.AGGREGATE: return createAggregate();
      case CryptSLPackage.ORDER: return createOrder();
      case CryptSLPackage.SIMPLE_ORDER: return createSimpleOrder();
      case CryptSLPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case CryptSLPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
      case CryptSLPackage.UNARY_PRE_EXPRESSION: return createUnaryPreExpression();
      case CryptSLPackage.OBJECT: return createObject();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseBlock createUseBlock()
  {
    UseBlockImpl useBlock = new UseBlockImpl();
    return useBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForbiddenBlock createForbiddenBlock()
  {
    ForbiddenBlockImpl forbiddenBlock = new ForbiddenBlockImpl();
    return forbiddenBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredBlock createRequiredBlock()
  {
    RequiredBlockImpl requiredBlock = new RequiredBlockImpl();
    return requiredBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnforceConsBlock createEnforceConsBlock()
  {
    EnforceConsBlockImpl enforceConsBlock = new EnforceConsBlockImpl();
    return enforceConsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiresBlock createRequiresBlock()
  {
    RequiresBlockImpl requiresBlock = new RequiresBlockImpl();
    return requiresBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnsuresBlock createEnsuresBlock()
  {
    EnsuresBlockImpl ensuresBlock = new EnsuresBlockImpl();
    return ensuresBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DestroysBlock createDestroysBlock()
  {
    DestroysBlockImpl destroysBlock = new DestroysBlockImpl();
    return destroysBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDecl createObjectDecl()
  {
    ObjectDeclImpl objectDecl = new ObjectDeclImpl();
    return objectDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForbMethod createForbMethod()
  {
    ForbMethodImpl forbMethod = new ForbMethodImpl();
    return forbMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType createSuperType()
  {
    SuperTypeImpl superType = new SuperTypeImpl();
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParList createParList()
  {
    ParListImpl parList = new ParListImpl();
    return parList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Par createPar()
  {
    ParImpl par = new ParImpl();
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalImply createLogicalImply()
  {
    LogicalImplyImpl logicalImply = new LogicalImplyImpl();
    return logicalImply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOperator createLogicalOperator()
  {
    LogicalOperatorImpl logicalOperator = new LogicalOperatorImpl();
    return logicalOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparingOperator createComparingOperator()
  {
    ComparingOperatorImpl comparingOperator = new ComparingOperatorImpl();
    return comparingOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticOperator createArithmeticOperator()
  {
    ArithmeticOperatorImpl arithmeticOperator = new ArithmeticOperatorImpl();
    return arithmeticOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreDefinedPredicates createPreDefinedPredicates()
  {
    PreDefinedPredicatesImpl preDefinedPredicates = new PreDefinedPredicatesImpl();
    return preDefinedPredicates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperator createUnaryOperator()
  {
    UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
    return unaryOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayElements createArrayElements()
  {
    ArrayElementsImpl arrayElements = new ArrayElementsImpl();
    return arrayElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LitList createLitList()
  {
    LitListImpl litList = new LitListImpl();
    return litList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pred createPred()
  {
    PredImpl pred = new PredImpl();
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqPred createReqPred()
  {
    ReqPredImpl reqPred = new ReqPredImpl();
    return reqPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuParList createSuParList()
  {
    SuParListImpl suParList = new SuParListImpl();
    return suParList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuPar createSuPar()
  {
    SuParImpl suPar = new SuParImpl();
    return suPar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate createAggregate()
  {
    AggregateImpl aggregate = new AggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Order createOrder()
  {
    OrderImpl order = new OrderImpl();
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleOrder createSimpleOrder()
  {
    SimpleOrderImpl simpleOrder = new SimpleOrderImpl();
    return simpleOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonExpression createComparisonExpression()
  {
    ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticExpression createArithmeticExpression()
  {
    ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
    return arithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPreExpression createUnaryPreExpression()
  {
    UnaryPreExpressionImpl unaryPreExpression = new UnaryPreExpressionImpl();
    return unaryPreExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.darmstadt.tu.crossing.cryptSL.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CryptSLPackage getCryptSLPackage()
  {
    return (CryptSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CryptSLPackage getPackage()
  {
    return CryptSLPackage.eINSTANCE;
  }

} //CryptSLFactoryImpl
