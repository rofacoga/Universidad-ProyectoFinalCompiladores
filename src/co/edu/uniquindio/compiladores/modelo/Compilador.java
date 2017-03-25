/* Generated By:JavaCC: Do not edit this line. Compilador.java */
package co.edu.uniquindio.compiladores.modelo;

class Compilador implements CompiladorConstants {
        public static void main( String[] arg ) throws ParseException, TokenMgrError {
                Compilador parser = new Compilador( System.in );
                parser.start();
        }

  static final public void start() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUMA:
      case NUMERO:
      case RESTA:
      case DIVISION:
      case MULTIPLICACION:
      case EXPONENTE:
      case FINAL_LINEA:
      case SENO:
      case COSENO:
      case TANGENTE:
      case SECANTE:
      case COSECANTE:
      case COTAGENTE:
      case PARENTESIS_IZQUIERDO:
      case PARENTESIS_DERECHO:
      case LLAVE_IZQUIERDA:
      case LLAVE_DERECHA:
      case CORCHETE_IZQUIERDO:
      case CORCHETE_DERECHO:
      case RAIZ:
      case ENTERO:
      case DOBLE:
      case FLOTANTE:
      case INTEGRAL:
      case ASIGNACION:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUMA:
        jj_consume_token(SUMA);
        break;
      case NUMERO:
        jj_consume_token(NUMERO);
        break;
      case RESTA:
        jj_consume_token(RESTA);
        break;
      case DIVISION:
        jj_consume_token(DIVISION);
        break;
      case MULTIPLICACION:
        jj_consume_token(MULTIPLICACION);
        break;
      case EXPONENTE:
        jj_consume_token(EXPONENTE);
        break;
      case FINAL_LINEA:
        jj_consume_token(FINAL_LINEA);
        break;
      case SENO:
        jj_consume_token(SENO);
        break;
      case COSENO:
        jj_consume_token(COSENO);
        break;
      case TANGENTE:
        jj_consume_token(TANGENTE);
        break;
      case SECANTE:
        jj_consume_token(SECANTE);
        break;
      case COSECANTE:
        jj_consume_token(COSECANTE);
        break;
      case COTAGENTE:
        jj_consume_token(COTAGENTE);
        break;
      case PARENTESIS_IZQUIERDO:
        jj_consume_token(PARENTESIS_IZQUIERDO);
        break;
      case PARENTESIS_DERECHO:
        jj_consume_token(PARENTESIS_DERECHO);
        break;
      case LLAVE_IZQUIERDA:
        jj_consume_token(LLAVE_IZQUIERDA);
        break;
      case LLAVE_DERECHA:
        jj_consume_token(LLAVE_DERECHA);
        break;
      case CORCHETE_IZQUIERDO:
        jj_consume_token(CORCHETE_IZQUIERDO);
        break;
      case CORCHETE_DERECHO:
        jj_consume_token(CORCHETE_DERECHO);
        break;
      case RAIZ:
        jj_consume_token(RAIZ);
        break;
      case ENTERO:
        jj_consume_token(ENTERO);
        break;
      case DOBLE:
        jj_consume_token(DOBLE);
        break;
      case FLOTANTE:
        jj_consume_token(FLOTANTE);
        break;
      case INTEGRAL:
        jj_consume_token(INTEGRAL);
        break;
      case ASIGNACION:
        jj_consume_token(ASIGNACION);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x7fffffc0,0x7fffffc0,};
   }

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
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
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
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
    Token t = token;
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

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[32];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 32; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}