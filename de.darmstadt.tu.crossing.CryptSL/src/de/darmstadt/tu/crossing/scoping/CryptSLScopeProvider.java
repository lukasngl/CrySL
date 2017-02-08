/*
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.scoping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import de.darmstadt.tu.crossing.cryptSL.Domainmodel;
import de.darmstadt.tu.crossing.cryptSL.ForbMethod;
import de.darmstadt.tu.crossing.cryptSL.Method;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class CryptSLScopeProvider extends AbstractCryptSLScopeProvider {
	IScope scope_ForbMethod_javaMeth(ForbMethod fm , EReference reference) {
		EObject cont = fm.eContainer();
		Set<IEObjectDescription> descriptions = new HashSet<IEObjectDescription>();
		
		if (cont instanceof Domainmodel) {
			JvmType jvmType = ((Domainmodel) cont).getJavaType();
			if (jvmType instanceof JvmGenericType) {
				descriptions = iterateThroughSuperTypes((JvmGenericType)jvmType, descriptions, true);
			}
		}
		return new SimpleScope(descriptions);
	}
	
	IScope scope_Method_methName(Method fm, EReference reference) {
		EObject cont = fm.eContainer().eContainer();
		Set<IEObjectDescription> descriptions = new HashSet<IEObjectDescription>();
		
		if (cont instanceof Domainmodel) {
			JvmType jvmType = ((Domainmodel) cont).getJavaType();
			if (jvmType instanceof JvmGenericType) {
				descriptions = iterateThroughSuperTypes((JvmGenericType)jvmType, descriptions, false);
				
			}
		}
		return new SimpleScope(descriptions);
	}
	
	private Set<IEObjectDescription> iterateThroughSuperTypes(JvmGenericType jvmType, Set<IEObjectDescription> descriptions, boolean FQN) {
		if (FQN) {
			descriptions.addAll(collectMethodsFQN(jvmType));
		} else {
			descriptions.addAll(collectMethodsSimpleName(jvmType));
		}
		for (JvmTypeReference superType: jvmType.getSuperTypes()) {
			 return iterateThroughSuperTypes((JvmGenericType)superType.getType(), descriptions, FQN);
		}
		return descriptions;
	}
	
	private Set<IEObjectDescription> collectMethodsFQN(JvmGenericType jvmType) {
		Set<IEObjectDescription> methods = new HashSet<IEObjectDescription>();
		for (JvmConstructor member : jvmType.getDeclaredConstructors()) {
			String memidentifier = member.getIdentifier();
			String classdotname = memidentifier.substring(memidentifier.indexOf(jvmType.getSimpleName()));
			String name = classdotname.substring(classdotname.indexOf(".") + 1);
			methods.add(EObjectDescription.create(name.replace(".", "_"), member));
		}
		
		for (JvmOperation member : jvmType.getDeclaredOperations()) {
			String memidentifier = member.getIdentifier();
			String classdotname = memidentifier.substring(memidentifier.indexOf(jvmType.getSimpleName()));
			String name = classdotname.substring(classdotname.indexOf(".") + 1);
			methods.add(EObjectDescription.create(name.replace(".", "_"), member));
		}
		return methods;
	}
	


	private Set<IEObjectDescription> collectMethodsSimpleName(JvmGenericType gt) {
		Set<IEObjectDescription> descriptions = new HashSet<IEObjectDescription>();
		for (JvmConstructor member : gt.getDeclaredConstructors()) {
			descriptions.add(EObjectDescription.create(member.getSimpleName(), member));
		}
		for (JvmOperation member : gt.getDeclaredOperations()) {
			descriptions.add(EObjectDescription.create(member.getSimpleName(), member));
		}
		return descriptions;
	}
	
}