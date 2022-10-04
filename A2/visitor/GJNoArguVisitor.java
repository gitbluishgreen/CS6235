//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> ( Query() )*
    * f3 -> <EOF>
    */
   public R visit(Goal n);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "String"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> "{"
    * f14 -> "try"
    * f15 -> "{"
    * f16 -> ( VarDeclaration() )*
    * f17 -> ( QParStatement() )*
    * f18 -> "}"
    * f19 -> "catch"
    * f20 -> "("
    * f21 -> Identifier()
    * f22 -> Identifier()
    * f23 -> ")"
    * f24 -> "{"
    * f25 -> "}"
    * f26 -> "}"
    * f27 -> "}"
    */
   public R visit(MainClass n);

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public R visit(TypeDeclaration n);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( VarDeclaration() )*
    * f4 -> "}"
    */
   public R visit(ClassDeclaration n);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "extends"
    * f3 -> "Thread"
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( MethodDeclaration() )*
    * f7 -> "}"
    */
   public R visit(ClassExtendsDeclaration n);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n);

   /**
    * f0 -> "public"
    * f1 -> "void"
    * f2 -> "run"
    * f3 -> "("
    * f4 -> ")"
    * f5 -> "{"
    * f6 -> "try"
    * f7 -> "{"
    * f8 -> ( VarDeclaration() )*
    * f9 -> ( QParStatement() )*
    * f10 -> "}"
    * f11 -> "catch"
    * f12 -> "("
    * f13 -> Identifier()
    * f14 -> Identifier()
    * f15 -> ")"
    * f16 -> "{"
    * f17 -> "}"
    * f18 -> "}"
    */
   public R visit(MethodDeclaration n);

   /**
    * f0 -> BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n);

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n);

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n);

   /**
    * f0 -> ( Ann() )*
    * f1 -> Statement()
    */
   public R visit(QParStatement n);

   /**
    * f0 -> <SCOMMENT1>
    * f1 -> Label()
    * f2 -> <SCOMMENT2>
    */
   public R visit(Ann n);

   /**
    * f0 -> Identifier()
    * f1 -> ":"
    */
   public R visit(Label n);

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | FieldAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | MessageSend()
    *       | PrintStatement()
    *       | SynchStatement()
    */
   public R visit(Statement n);

   /**
    * f0 -> "{"
    * f1 -> ( QParStatement() )*
    * f2 -> "}"
    */
   public R visit(Block n);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "="
    * f4 -> Identifier()
    * f5 -> ";"
    */
   public R visit(FieldAssignmentStatement n);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public R visit(IfStatement n);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n);

   /**
    * f0 -> "synchronized"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(SynchStatement n);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n);

   /**
    * f0 -> AndExpression()
    *       | CompareExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | FieldRead()
    *       | PrimaryExpression()
    */
   public R visit(Expression n);

   /**
    * f0 -> Identifier()
    * f1 -> "&&"
    * f2 -> Identifier()
    */
   public R visit(AndExpression n);

   /**
    * f0 -> Identifier()
    * f1 -> "<"
    * f2 -> Identifier()
    */
   public R visit(CompareExpression n);

   /**
    * f0 -> Identifier()
    * f1 -> "+"
    * f2 -> Identifier()
    */
   public R visit(PlusExpression n);

   /**
    * f0 -> Identifier()
    * f1 -> "-"
    * f2 -> Identifier()
    */
   public R visit(MinusExpression n);

   /**
    * f0 -> Identifier()
    * f1 -> "*"
    * f2 -> Identifier()
    */
   public R visit(TimesExpression n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    */
   public R visit(FieldRead n);

   /**
    * f0 -> callStartMethod()
    *       | callNotifyMethod()
    *       | callNotifyAllMethod()
    *       | callWaitMethod()
    *       | callJoinMethod()
    */
   public R visit(MessageSend n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "start"
    * f3 -> "("
    * f4 -> ")"
    * f5 -> ";"
    */
   public R visit(callStartMethod n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "notify"
    * f3 -> "("
    * f4 -> ")"
    * f5 -> ";"
    */
   public R visit(callNotifyMethod n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "notifyAll"
    * f3 -> "("
    * f4 -> ")"
    * f5 -> ";"
    */
   public R visit(callNotifyAllMethod n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "wait"
    * f3 -> "("
    * f4 -> ")"
    * f5 -> ";"
    */
   public R visit(callWaitMethod n);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "join"
    * f3 -> "("
    * f4 -> ")"
    * f5 -> ";"
    */
   public R visit(callJoinMethod n);

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    */
   public R visit(PrimaryExpression n);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n);

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n);

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n);

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n);

   /**
    * f0 -> "!"
    * f1 -> Identifier()
    */
   public R visit(NotExpression n);

   /**
    * f0 -> <SCOMMENT1>
    * f1 -> Identifier()
    * f2 -> "mhp?"
    * f3 -> Identifier()
    * f4 -> <SCOMMENT2>
    */
   public R visit(Query n);

}

