/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.resolve;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.resolve.AbstractResolveTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolve")
@InnerTestClasses({JetResolveTestGenerated.CandidatesPriority.class, JetResolveTestGenerated.DelegatedProperty.class, JetResolveTestGenerated.Imports.class, JetResolveTestGenerated.Labels.class, JetResolveTestGenerated.Regressions.class, JetResolveTestGenerated.Varargs.class})
public class JetResolveTestGenerated extends AbstractResolveTest {
    public void testAllFilesPresentInResolve() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve"), Pattern.compile("^(.+)\\.resolve$"), true);
    }
    
    @TestMetadata("Basic.resolve")
    public void testBasic() throws Exception {
        doTest("compiler/testData/resolve/Basic.resolve");
    }
    
    @TestMetadata("ClassObjects.resolve")
    public void testClassObjects() throws Exception {
        doTest("compiler/testData/resolve/ClassObjects.resolve");
    }
    
    @TestMetadata("Classifiers.resolve")
    public void testClassifiers() throws Exception {
        doTest("compiler/testData/resolve/Classifiers.resolve");
    }
    
    @TestMetadata("ErrorSupertype.resolve")
    public void testErrorSupertype() throws Exception {
        doTest("compiler/testData/resolve/ErrorSupertype.resolve");
    }
    
    @TestMetadata("ExtensionFunctions.resolve")
    public void testExtensionFunctions() throws Exception {
        doTest("compiler/testData/resolve/ExtensionFunctions.resolve");
    }
    
    @TestMetadata("FunctionVariable.resolve")
    public void testFunctionVariable() throws Exception {
        doTest("compiler/testData/resolve/FunctionVariable.resolve");
    }
    
    @TestMetadata("kt304.resolve")
    public void testKt304() throws Exception {
        doTest("compiler/testData/resolve/kt304.resolve");
    }
    
    @TestMetadata("LocalObjects.resolve")
    public void testLocalObjects() throws Exception {
        doTest("compiler/testData/resolve/LocalObjects.resolve");
    }
    
    @TestMetadata("Namespaces.resolve")
    public void testNamespaces() throws Exception {
        doTest("compiler/testData/resolve/Namespaces.resolve");
    }
    
    @TestMetadata("NestedObjects.resolve")
    public void testNestedObjects() throws Exception {
        doTest("compiler/testData/resolve/NestedObjects.resolve");
    }
    
    @TestMetadata("NoReferenceForErrorAnnotation.resolve")
    public void testNoReferenceForErrorAnnotation() throws Exception {
        doTest("compiler/testData/resolve/NoReferenceForErrorAnnotation.resolve");
    }
    
    @TestMetadata("Objects.resolve")
    public void testObjects() throws Exception {
        doTest("compiler/testData/resolve/Objects.resolve");
    }
    
    @TestMetadata("PrimaryConstructorParameters.resolve")
    public void testPrimaryConstructorParameters() throws Exception {
        doTest("compiler/testData/resolve/PrimaryConstructorParameters.resolve");
    }
    
    @TestMetadata("PrimaryConstructors.resolve")
    public void testPrimaryConstructors() throws Exception {
        doTest("compiler/testData/resolve/PrimaryConstructors.resolve");
    }
    
    @TestMetadata("Projections.resolve")
    public void testProjections() throws Exception {
        doTest("compiler/testData/resolve/Projections.resolve");
    }
    
    @TestMetadata("ResolveOfInfixExpressions.resolve")
    public void testResolveOfInfixExpressions() throws Exception {
        doTest("compiler/testData/resolve/ResolveOfInfixExpressions.resolve");
    }
    
    @TestMetadata("ResolveToJava.resolve")
    public void testResolveToJava() throws Exception {
        doTest("compiler/testData/resolve/ResolveToJava.resolve");
    }
    
    @TestMetadata("ResolveToJava2.resolve")
    public void testResolveToJava2() throws Exception {
        doTest("compiler/testData/resolve/ResolveToJava2.resolve");
    }
    
    @TestMetadata("ResolveToJava3.resolve")
    public void testResolveToJava3() throws Exception {
        doTest("compiler/testData/resolve/ResolveToJava3.resolve");
    }
    
    @TestMetadata("ResolveToJavaTypeTransform.resolve")
    public void testResolveToJavaTypeTransform() throws Exception {
        doTest("compiler/testData/resolve/ResolveToJavaTypeTransform.resolve");
    }
    
    @TestMetadata("ScopeInteraction.resolve")
    public void testScopeInteraction() throws Exception {
        doTest("compiler/testData/resolve/ScopeInteraction.resolve");
    }
    
    @TestMetadata("StringTemplates.resolve")
    public void testStringTemplates() throws Exception {
        doTest("compiler/testData/resolve/StringTemplates.resolve");
    }
    
    @TestMetadata("Super.resolve")
    public void testSuper() throws Exception {
        doTest("compiler/testData/resolve/Super.resolve");
    }
    
    @TestMetadata("TryCatch.resolve")
    public void testTryCatch() throws Exception {
        doTest("compiler/testData/resolve/TryCatch.resolve");
    }
    
    @TestMetadata("compiler/testData/resolve/candidatesPriority")
    public static class CandidatesPriority extends AbstractResolveTest {
        public void testAllFilesPresentInCandidatesPriority() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/candidatesPriority"), Pattern.compile("^(.+)\\.resolve$"), true);
        }
        
        @TestMetadata("classObjectOuterResolve.resolve")
        public void testClassObjectOuterResolve() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/classObjectOuterResolve.resolve");
        }
        
        @TestMetadata("closerReceiver1.resolve")
        public void testCloserReceiver1() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/closerReceiver1.resolve");
        }
        
        @TestMetadata("closerReceiver2.resolve")
        public void testCloserReceiver2() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/closerReceiver2.resolve");
        }
        
        @TestMetadata("closerReceiver3.resolve")
        public void testCloserReceiver3() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/closerReceiver3.resolve");
        }
        
        @TestMetadata("closerScope.resolve")
        public void testCloserScope() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/closerScope.resolve");
        }
        
        @TestMetadata("extensionToCloserReceiverVsMember.resolve")
        public void testExtensionToCloserReceiverVsMember() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/extensionToCloserReceiverVsMember.resolve");
        }
        
        @TestMetadata("implicitThisVsNoReceiver.resolve")
        public void testImplicitThisVsNoReceiver() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/implicitThisVsNoReceiver.resolve");
        }
        
        @TestMetadata("implicitThisVsNoReceiver2.resolve")
        public void testImplicitThisVsNoReceiver2() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/implicitThisVsNoReceiver2.resolve");
        }
        
        @TestMetadata("localVsImplicitThis.resolve")
        public void testLocalVsImplicitThis() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/localVsImplicitThis.resolve");
        }
        
        @TestMetadata("memberVsExtension1.resolve")
        public void testMemberVsExtension1() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/memberVsExtension1.resolve");
        }
        
        @TestMetadata("memberVsExtension2.resolve")
        public void testMemberVsExtension2() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/memberVsExtension2.resolve");
        }
        
        @TestMetadata("memberVsExtension3.resolve")
        public void testMemberVsExtension3() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/memberVsExtension3.resolve");
        }
        
        @TestMetadata("memberVsLocalExtension.resolve")
        public void testMemberVsLocalExtension() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/memberVsLocalExtension.resolve");
        }
        
        @TestMetadata("receiverVsThisObject.resolve")
        public void testReceiverVsThisObject() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/receiverVsThisObject.resolve");
        }
        
        @TestMetadata("receiverVsThisObject2.resolve")
        public void testReceiverVsThisObject2() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/receiverVsThisObject2.resolve");
        }
        
        @TestMetadata("wrongReceiverVsOtherError.resolve")
        public void testWrongReceiverVsOtherError() throws Exception {
            doTest("compiler/testData/resolve/candidatesPriority/wrongReceiverVsOtherError.resolve");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolve/delegatedProperty")
    public static class DelegatedProperty extends AbstractResolveTest {
        public void testAllFilesPresentInDelegatedProperty() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/delegatedProperty"), Pattern.compile("^(.+)\\.resolve$"), true);
        }
        
        @TestMetadata("delegationByCall.resolve")
        public void testDelegationByCall() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/delegationByCall.resolve");
        }
        
        @TestMetadata("delegationByConstructor.resolve")
        public void testDelegationByConstructor() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/delegationByConstructor.resolve");
        }
        
        @TestMetadata("delegationByFun.resolve")
        public void testDelegationByFun() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/delegationByFun.resolve");
        }
        
        @TestMetadata("delegationByObject.resolve")
        public void testDelegationByObject() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/delegationByObject.resolve");
        }
        
        @TestMetadata("delegationByProperty.resolve")
        public void testDelegationByProperty() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/delegationByProperty.resolve");
        }
        
        @TestMetadata("delegationInClass.resolve")
        public void testDelegationInClass() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/delegationInClass.resolve");
        }
        
        @TestMetadata("localDelegation.resolve")
        public void testLocalDelegation() throws Exception {
            doTest("compiler/testData/resolve/delegatedProperty/localDelegation.resolve");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolve/imports")
    public static class Imports extends AbstractResolveTest {
        public void testAllFilesPresentInImports() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/imports"), Pattern.compile("^(.+)\\.resolve$"), true);
        }
        
        @TestMetadata("ImportConflictAllPackage.resolve")
        public void testImportConflictAllPackage() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictAllPackage.resolve");
        }
        
        @TestMetadata("ImportConflictBetweenImportedAndRootPackage.resolve")
        public void testImportConflictBetweenImportedAndRootPackage() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictBetweenImportedAndRootPackage.resolve");
        }
        
        @TestMetadata("ImportConflictBetweenImportedAndSamePackage.resolve")
        public void testImportConflictBetweenImportedAndSamePackage() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictBetweenImportedAndSamePackage.resolve");
        }
        
        @TestMetadata("ImportConflictForFunctions.resolve")
        public void testImportConflictForFunctions() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictForFunctions.resolve");
        }
        
        @TestMetadata("ImportConflictPackageAndClass.resolve")
        public void testImportConflictPackageAndClass() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictPackageAndClass.resolve");
        }
        
        @TestMetadata("ImportConflictSameNameClass.resolve")
        public void testImportConflictSameNameClass() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictSameNameClass.resolve");
        }
        
        @TestMetadata("ImportConflictWithClassObject.resolve")
        public void testImportConflictWithClassObject() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictWithClassObject.resolve");
        }
        
        @TestMetadata("ImportConflictWithInFileClass.resolve")
        public void testImportConflictWithInFileClass() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictWithInFileClass.resolve");
        }
        
        @TestMetadata("ImportConflictWithInnerClass.resolve")
        public void testImportConflictWithInnerClass() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictWithInnerClass.resolve");
        }
        
        @TestMetadata("ImportConflictsWithMappedToJava.resolve")
        public void testImportConflictsWithMappedToJava() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportConflictsWithMappedToJava.resolve");
        }
        
        @TestMetadata("ImportNonBlockingAnalysis.resolve")
        public void testImportNonBlockingAnalysis() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportNonBlockingAnalysis.resolve");
        }
        
        @TestMetadata("ImportResolveOrderStable.resolve")
        public void testImportResolveOrderStable() throws Exception {
            doTest("compiler/testData/resolve/imports/ImportResolveOrderStable.resolve");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolve/labels")
    public static class Labels extends AbstractResolveTest {
        public void testAllFilesPresentInLabels() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/labels"), Pattern.compile("^(.+)\\.resolve$"), true);
        }
        
        @TestMetadata("labelForPropertyInGetter.resolve")
        public void testLabelForPropertyInGetter() throws Exception {
            doTest("compiler/testData/resolve/labels/labelForPropertyInGetter.resolve");
        }
        
        @TestMetadata("labelForPropertyInSetter.resolve")
        public void testLabelForPropertyInSetter() throws Exception {
            doTest("compiler/testData/resolve/labels/labelForPropertyInSetter.resolve");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolve/regressions")
    public static class Regressions extends AbstractResolveTest {
        public void testAllFilesPresentInRegressions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/regressions"), Pattern.compile("^(.+)\\.resolve$"), true);
        }
        
        @TestMetadata("kt300.resolve")
        public void testKt300() throws Exception {
            doTest("compiler/testData/resolve/regressions/kt300.resolve");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolve/varargs")
    public static class Varargs extends AbstractResolveTest {
        public void testAllFilesPresentInVarargs() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/varargs"), Pattern.compile("^(.+)\\.resolve$"), true);
        }
        
        @TestMetadata("MoreSpecificVarargsOfEqualLength.resolve")
        public void testMoreSpecificVarargsOfEqualLength() throws Exception {
            doTest("compiler/testData/resolve/varargs/MoreSpecificVarargsOfEqualLength.resolve");
        }
        
        @TestMetadata("NilaryVsVararg.resolve")
        public void testNilaryVsVararg() throws Exception {
            doTest("compiler/testData/resolve/varargs/NilaryVsVararg.resolve");
        }
        
        @TestMetadata("UnaryVsVararg.resolve")
        public void testUnaryVsVararg() throws Exception {
            doTest("compiler/testData/resolve/varargs/UnaryVsVararg.resolve");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetResolveTestGenerated");
        suite.addTestSuite(JetResolveTestGenerated.class);
        suite.addTestSuite(CandidatesPriority.class);
        suite.addTestSuite(DelegatedProperty.class);
        suite.addTestSuite(Imports.class);
        suite.addTestSuite(Labels.class);
        suite.addTestSuite(Regressions.class);
        suite.addTestSuite(Varargs.class);
        return suite;
    }
}
