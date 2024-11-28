/* Generated By:JavaCC: Do not edit this line. lexicoSintactico.java */
        public class lexicoSintactico implements lexicoSintacticoConstants {
                public static void main (String[] args) throws ParseException{
                lexicoSintactico anLex = new lexicoSintactico(System.in);
                anLex.inicia();
                System.out.println("sintaxis v\u00e1lida.");
                }

//Inicio analisis sintactico
  static final public void inicia() throws ParseException {
    PROGRAM();
  }

  static final public void PROGRAM() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOLEAN:
      case VOID:
      case STRING:
      case DEF:
      case FLOAT:
      case BOOL:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOLEAN:
      case VOID:
      case STRING:
      case FLOAT:
      case BOOL:
        VAR();
        break;
      case DEF:
        FUNC();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void VAR() throws ParseException {
    TYPE();
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CORCHETE_I:
      jj_consume_token(CORCHETE_I);
      jj_consume_token(NUMERO_ENTERO);
      jj_consume_token(CORCHETE_D);
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMA);
      jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CORCHETE_I:
        jj_consume_token(CORCHETE_I);
        jj_consume_token(NUMERO_ENTERO);
        jj_consume_token(CORCHETE_D);
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
    }
    jj_consume_token(PUNTOCOMA);
  }

  static final public void TYPE() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case VOID:
      jj_consume_token(VOID);
      break;
    case FLOAT:
      jj_consume_token(FLOAT);
      break;
    case STRING:
      jj_consume_token(STRING);
      break;
    case BOOL:
      jj_consume_token(BOOL);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void FUNC() throws ParseException {
    jj_consume_token(DEF);
    TYPE();
    jj_consume_token(ID);
    jj_consume_token(PARENTESIS_I);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case BOOLEAN:
    case VOID:
    case STRING:
    case FLOAT:
    case BOOL:
      PARAMS();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    jj_consume_token(PARENTESIS_D);
    BLOCK();
  }

  static final public void PARAMS() throws ParseException {
    TYPE();
    jj_consume_token(ID);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_3;
      }
      jj_consume_token(COMA);
      TYPE();
      jj_consume_token(ID);
    }
  }

  static final public void BLOCK() throws ParseException {
    jj_consume_token(LLAVE_I);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case BOOLEAN:
      case VOID:
      case STRING:
      case FLOAT:
      case BOOL:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      VAR();
    }
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case BREAK:
      case RETURN:
      case CONTINUE:
      case ID:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_5;
      }
      STMT();
    }
    jj_consume_token(LLAVE_D);
  }

  static final public void STMT() throws ParseException {
    if (jj_2_1(2)) {
      LOC();
      jj_consume_token(IGUAL);
      EXPR();
      jj_consume_token(PUNTOCOMA);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        FUNCCALL();
        jj_consume_token(PUNTOCOMA);
        break;
      case IF:
        jj_consume_token(IF);
        jj_consume_token(PARENTESIS_I);
        EXPR();
        jj_consume_token(PARENTESIS_D);
        BLOCK();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ELSE:
          jj_consume_token(ELSE);
          BLOCK();
          break;
        default:
          jj_la1[10] = jj_gen;
          ;
        }
        break;
      case WHILE:
        jj_consume_token(WHILE);
        jj_consume_token(PARENTESIS_I);
        EXPR();
        jj_consume_token(PARENTESIS_D);
        BLOCK();
        break;
      case RETURN:
        jj_consume_token(RETURN);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case TRUE:
        case FALSE:
        case STRLIT:
        case ID:
        case NUMERO_ENTERO:
        case NUMERO_HEXA:
        case NUMERO_FLOT:
        case INCREMENTO:
        case DECREMENTO:
        case NEGACION:
        case PARENTESIS_I:
          EXPR();
          break;
        default:
          jj_la1[11] = jj_gen;
          ;
        }
        jj_consume_token(PUNTOCOMA);
        break;
      case BREAK:
        jj_consume_token(BREAK);
        jj_consume_token(PUNTOCOMA);
        break;
      case CONTINUE:
        jj_consume_token(CONTINUE);
        jj_consume_token(PUNTOCOMA);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void EXPR() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INCREMENTO:
    case DECREMENTO:
    case NEGACION:
      UNOP();
      BASEEXPR();
      EXPRP();
      break;
    case TRUE:
    case FALSE:
    case STRLIT:
    case ID:
    case NUMERO_ENTERO:
    case NUMERO_HEXA:
    case NUMERO_FLOT:
    case PARENTESIS_I:
      BASEEXPR();
      EXPRP();
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void EXPRP() throws ParseException {
    label_6:
    while (true) {
      if (jj_2_2(2)) {
        ;
      } else {
        break label_6;
      }
      BINOP();
      EXPR();
      EXPRP();
    }
  }

  static final public void BASEEXPR() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARENTESIS_I:
      jj_consume_token(PARENTESIS_I);
      EXPR();
      jj_consume_token(PARENTESIS_D);
      break;
    default:
      jj_la1[14] = jj_gen;
      if (jj_2_3(2)) {
        FUNCCALL();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
          LOC();
          break;
        case TRUE:
        case FALSE:
        case STRLIT:
        case NUMERO_ENTERO:
        case NUMERO_HEXA:
        case NUMERO_FLOT:
          LIT();
          break;
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
  }

  static final public void LOC() throws ParseException {
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CORCHETE_I:
      jj_consume_token(CORCHETE_I);
      EXPR();
      jj_consume_token(CORCHETE_D);
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
  }

  static final public void FUNCCALL() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(PARENTESIS_I);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
    case FALSE:
    case STRLIT:
    case ID:
    case NUMERO_ENTERO:
    case NUMERO_HEXA:
    case NUMERO_FLOT:
    case INCREMENTO:
    case DECREMENTO:
    case NEGACION:
    case PARENTESIS_I:
      ARGS();
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    jj_consume_token(PARENTESIS_D);
  }

  static final public void ARGS() throws ParseException {
    EXPR();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMA:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_7;
      }
      jj_consume_token(COMA);
      EXPR();
    }
  }

  static final public void LIT() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO_ENTERO:
      jj_consume_token(NUMERO_ENTERO);
      break;
    case NUMERO_HEXA:
      jj_consume_token(NUMERO_HEXA);
      break;
    case STRLIT:
      jj_consume_token(STRLIT);
      break;
    case TRUE:
      jj_consume_token(TRUE);
      break;
    case FALSE:
      jj_consume_token(FALSE);
      break;
    case NUMERO_FLOT:
      jj_consume_token(NUMERO_FLOT);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void UNOP() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NEGACION:
      jj_consume_token(NEGACION);
      break;
    case INCREMENTO:
      jj_consume_token(INCREMENTO);
      break;
    case DECREMENTO:
      jj_consume_token(DECREMENTO);
      break;
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void BINOP() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SUMA:
      jj_consume_token(SUMA);
      break;
    case RESTA:
      jj_consume_token(RESTA);
      break;
    case MUL:
      jj_consume_token(MUL);
      break;
    case DIVISION:
      jj_consume_token(DIVISION);
      break;
    case MODULO:
      jj_consume_token(MODULO);
      break;
    case AND:
      jj_consume_token(AND);
      break;
    case OR:
      jj_consume_token(OR);
      break;
    case IGUAL:
      jj_consume_token(IGUAL);
      break;
    case IGUALDAD:
      jj_consume_token(IGUALDAD);
      break;
    case DIFERENTE:
      jj_consume_token(DIFERENTE);
      break;
    case MENORQUE:
      jj_consume_token(MENORQUE);
      break;
    case MAYORQUE:
      jj_consume_token(MAYORQUE);
      break;
    case MENORIGUAL:
      jj_consume_token(MENORIGUAL);
      break;
    case MAYORIGUAL:
      jj_consume_token(MAYORIGUAL);
      break;
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_3_2() {
    if (jj_3R_9()) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(49)) {
    jj_scanpos = xsp;
    if (jj_scan_token(50)) {
    jj_scanpos = xsp;
    if (jj_scan_token(46)) {
    jj_scanpos = xsp;
    if (jj_scan_token(16)) {
    jj_scanpos = xsp;
    if (jj_scan_token(17)) {
    jj_scanpos = xsp;
    if (jj_scan_token(51)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_14() {
    if (jj_3R_16()) return true;
    return false;
  }

  static private boolean jj_3R_13() {
    if (jj_3R_15()) return true;
    return false;
  }

  static private boolean jj_3R_10() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_3R_14()) return true;
    }
    return false;
  }

  static private boolean jj_3R_12() {
    if (jj_scan_token(CORCHETE_I)) return true;
    return false;
  }

  static private boolean jj_3R_11() {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(PARENTESIS_I)) return true;
    return false;
  }

  static private boolean jj_3R_8() {
    if (jj_scan_token(ID)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_12()) jj_scanpos = xsp;
    return false;
  }

  static private boolean jj_3R_19() {
    if (jj_3R_20()) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_8()) return true;
    if (jj_scan_token(IGUAL)) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_3R_11()) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(59)) {
    jj_scanpos = xsp;
    if (jj_scan_token(69)) {
    jj_scanpos = xsp;
    if (jj_scan_token(75)) {
    jj_scanpos = xsp;
    if (jj_scan_token(70)) {
    jj_scanpos = xsp;
    if (jj_scan_token(67)) {
    jj_scanpos = xsp;
    if (jj_scan_token(73)) {
    jj_scanpos = xsp;
    if (jj_scan_token(74)) {
    jj_scanpos = xsp;
    if (jj_scan_token(61)) {
    jj_scanpos = xsp;
    if (jj_scan_token(60)) {
    jj_scanpos = xsp;
    if (jj_scan_token(71)) {
    jj_scanpos = xsp;
    if (jj_scan_token(64)) {
    jj_scanpos = xsp;
    if (jj_scan_token(66)) {
    jj_scanpos = xsp;
    if (jj_scan_token(63)) {
    jj_scanpos = xsp;
    if (jj_scan_token(65)) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_scan_token(PARENTESIS_I)) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_15() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(72)) {
    jj_scanpos = xsp;
    if (jj_scan_token(58)) {
    jj_scanpos = xsp;
    if (jj_scan_token(68)) return true;
    }
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public lexicoSintacticoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  /** Whether we are looking ahead. */
  static private boolean jj_lookingAhead = false;
  static private boolean jj_semLA;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[22];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20003800,0x20003800,0x0,0x0,0x0,0x20003800,0x20003800,0x0,0x20003800,0xc520,0x80,0x30000,0xc520,0x30000,0x0,0x30000,0x0,0x30000,0x0,0x30000,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x1804,0x1804,0x0,0x800000,0x0,0x1800,0x1800,0x800000,0x1800,0x10000,0x0,0x40f4000,0x10000,0x40f4000,0x0,0xf4000,0x0,0x40f4000,0x800000,0xe4000,0x4000000,0xb8000000,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,0x4000,0x0,0x4000,0x0,0x0,0x0,0x0,0x0,0x0,0x1110,0x0,0x1110,0x1000,0x0,0x4000,0x1110,0x0,0x0,0x110,0xeef,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[3];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public lexicoSintactico(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public lexicoSintactico(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new lexicoSintacticoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public lexicoSintactico(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new lexicoSintacticoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public lexicoSintactico(lexicoSintacticoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(lexicoSintacticoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = jj_lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[87];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 22; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 87; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

        }