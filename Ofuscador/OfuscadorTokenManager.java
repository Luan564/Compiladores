/* Generated By:JavaCC: Do not edit this line. OfuscadorTokenManager.java */

/** Token Manager. */
public class OfuscadorTokenManager implements OfuscadorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xf4ffe000L) != 0L)
         {
            jjmatchedKind = 12;
            return 2;
         }
         if ((active0 & 0xb000000L) != 0L)
         {
            jjmatchedKind = 32;
            return 2;
         }
         if ((active0 & 0x20L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x100000L) != 0L)
            return 2;
         if ((active0 & 0xffefe000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0xfbabe000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
            return 2;
         }
         if ((active0 & 0x4440000L) != 0L)
            return 2;
         return -1;
      case 3:
         if ((active0 & 0x20230000L) != 0L)
            return 2;
         if ((active0 & 0xdb88e000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x40884000L) != 0L)
            return 2;
         if ((active0 & 0x9b00a000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
            return 2;
         }
         return -1;
      case 5:
         if ((active0 & 0x8300a000L) != 0L)
            return 2;
         if ((active0 & 0x18000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 5;
            return 2;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 9);
      case 34:
         return jjStopAtPos(0, 42);
      case 37:
         return jjStopAtPos(0, 8);
      case 38:
         return jjStopAtPos(0, 10);
      case 40:
         return jjStopAtPos(0, 37);
      case 41:
         return jjStopAtPos(0, 38);
      case 42:
         return jjStopAtPos(0, 4);
      case 43:
         return jjStopAtPos(0, 1);
      case 45:
         return jjStopAtPos(0, 2);
      case 47:
         return jjStartNfaWithStates_0(0, 5, 7);
      case 58:
         return jjStopAtPos(0, 11);
      case 59:
         return jjStopAtPos(0, 41);
      case 60:
         return jjStopAtPos(0, 7);
      case 61:
         return jjStopAtPos(0, 3);
      case 62:
         return jjStopAtPos(0, 6);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x3000000L);
      case 91:
         return jjStopAtPos(0, 35);
      case 93:
         return jjStopAtPos(0, 36);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40480000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x140000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 123:
         return jjStopAtPos(0, 39);
      case 125:
         return jjStopAtPos(0, 40);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40020000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 102:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(1, 20, 2);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x284000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8040000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10410000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x24000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2008000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 103:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 2);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x830000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10080000L);
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1200000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x88000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 100:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 2);
         break;
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 2);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x10802000L);
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 2);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x40004000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x1008000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 2);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x11000000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0xa000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 2);
         break;
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 99:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 2);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 2);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 103:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 2);
         break;
      case 109:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 2);
         break;
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 28, 2);
         break;
      case 114:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(3);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if (curChar != 47)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0xffffffffffffd9ffL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(8);
                  break;
               case 9:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(2);
                  }
                  if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                  }
                  break;
               case 1:
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(2);
                  break;
               case 5:
               case 6:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAdd(6);
                  break;
               case 8:
                  if (kind > 47)
                     kind = 47;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 8:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\53", "\55", "\75", "\52", "\57", "\76", "\74", "\45", "\41", "\46", 
"\72", null, "\160\165\142\154\151\143", "\143\154\141\163\163", 
"\163\164\141\164\151\143", "\166\157\151\144", "\155\141\151\156", "\151\156\164", 
"\146\154\157\141\164", "\151\146", "\145\154\163\145", "\146\157\162", "\167\150\151\154\145", 
"\123\171\163\164\145\155", "\123\164\162\151\156\147", "\141\162\147", "\111\156\164\145\147\145\162", 
"\142\157\157\154\145\141\156", "\164\162\165\145", "\146\141\154\163\145", "\162\145\164\165\162\156", null, 
null, null, "\133", "\135", "\50", "\51", "\173", "\175", "\73", "\42", null, null, 
null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7ffffffffffL, 
};
static final long[] jjtoSkip = {
   0x1f80000000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[10];
static private final int[] jjstateSet = new int[20];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public OfuscadorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public OfuscadorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 10; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 48)
   {
      jjmatchedKind = 48;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 48 :
         if (image == null)
            image = new StringBuffer();
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
           System.out.print("Simbolo no valido");
         break;
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                     System.out.print(image);
         break;
      case 2 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                      System.out.print(image);
         break;
      case 3 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                      System.out.print(image);
         break;
      case 4 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[4]);
        lengthOfMatch = jjstrLiteralImages[4].length();
                               System.out.print(image);
         break;
      case 5 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
                         System.out.print(image);
         break;
      case 6 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
                          System.out.print(image);
         break;
      case 7 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                          System.out.print(image);
         break;
      case 8 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                       System.out.print(image);
         break;
      case 9 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                            System.out.print(image);
         break;
      case 10 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                          System.out.print(image);
         break;
      case 11 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                           System.out.print(image);
         break;
      case 12 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                System.out.print(image.charAt(0));
                System.out.print((int)image.charAt(0) + (int)image.charAt(image.length() - 1));
                System.out.print("x" + image.chars().sum());
                System.out.print(image.charAt(image.length() - 1));
         break;
      case 13 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                            System.out.print(image+" ");
         break;
      case 14 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                          System.out.print(image+" ");
         break;
      case 15 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                            System.out.print(image+" ");
         break;
      case 16 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                        System.out.print(image+" ");
         break;
      case 17 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                        System.out.print(image+" ");
         break;
      case 18 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                      System.out.print(image+" ");
         break;
      case 19 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                          System.out.print(image+" ");
         break;
      case 20 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                    System.out.print(image+" ");
         break;
      case 21 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                        System.out.print(image+" ");
         break;
      case 22 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                      System.out.print(image+" ");
         break;
      case 23 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                          System.out.print(image+" ");
         break;
      case 24 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                            System.out.print(image);
         break;
      case 25 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                            System.out.print(image+" ");
         break;
      case 26 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                      System.out.print(image);
         break;
      case 27 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                              System.out.print(image);
         break;
      case 28 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                              System.out.print(image+" ");
         break;
      case 29 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                        System.out.print(image+" ");
         break;
      case 30 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                          System.out.print(image+" ");
         break;
      case 31 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                            System.out.print(image+" ");
         break;
      case 32 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                System.out.print(image.charAt(0));
                System.out.print((int)image.charAt(0) + (int)image.charAt(image.length() - 1));
                System.out.print("x" + image.chars().sum());
                System.out.print(image.charAt(image.length() - 1));
         break;
      case 33 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                      System.out.print(image);
         break;
      case 34 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                System.out.print(image);
         break;
      case 35 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                          System.out.print(image);
         break;
      case 36 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                            System.out.print(image);
         break;
      case 37 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                                 System.out.print(image);
         break;
      case 38 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
                                 System.out.print(image);
         break;
      case 39 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[39]);
        lengthOfMatch = jjstrLiteralImages[39].length();
                               System.out.print(image);
         break;
      case 40 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[40]);
        lengthOfMatch = jjstrLiteralImages[40].length();
                               System.out.print(image);
         break;
      case 41 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[41]);
        lengthOfMatch = jjstrLiteralImages[41].length();
                                 System.out.print(image);
         break;
      case 42 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[42]);
        lengthOfMatch = jjstrLiteralImages[42].length();
                                 System.out.print(image);
         break;
      default : 
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
