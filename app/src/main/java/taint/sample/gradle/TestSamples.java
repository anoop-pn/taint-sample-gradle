// package taint.sample.gradle;

// import edu.ucr.cs.riple.taint.ucrtainting.qual.RPolyTainted;
// import edu.ucr.cs.riple.taint.ucrtainting.qual.RTainted;
// import edu.ucr.cs.riple.taint.ucrtainting.qual.RUntainted;

// public class TestSamples {
    
//     @RUntainted String untaintedAssignee;
//     @RTainted String taintedStr;

//     public @RPolyTainted String testReturnTaintedString() {
//         String r= new StringBuffer("abcd").toString();
//         return r;
//     }

//     public @RPolyTainted String testReturnStringLiteral() {
//         return "abc";
//     }

//     public void testMethods() {
//         untaintedAssignee=testReturnStringLiteral();
//         untaintedAssignee=testReturnTaintedString();
//         untaintedAssignee=testReturnsTaintedString();
//     }

//     public @RTainted String testReturnsTaintedString() {
//         String r= new StringBuffer("abcd").toString();
//         return r;
//     } 
// }
