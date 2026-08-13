            package p000;

            import android.util.Log;
            import javax.crypto.Cipher;
            import kotlin.jvm.functions.Function1;
            
/* 8 */     public final class II0O1i0I1 implements Function1 {
                public final int I00iOIl;
                public Function1 I00iiI;

                public II0O1i0I1(Function1 function1) {
/* 2 */             this.I00iOIl = 5;
/* 7 */             this.I00iiI = function1;
                }

                @Override
                public final Object invoke(Object obj) {
                    Cipher cipher;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Function1 function1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 201 */                   I1ii1o0 i1ii1o0 = ((II0iil1) obj).I00000oIO;
/* 203 */                   if (i1ii1o0 != null && (cipher = (Cipher) i1ii1o0.I00iiO) != null) {
/* 211 */                       function1.invoke(cipher);
                            }
/* 214 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 195 */                   return new IiloOlIoIool((IiloiO) obj, function1);
                        case 2:
/* 152 */                   OoIOloiIii ooIOloiIii = (OoIOloiIii) obj;
/* 157 */                   if (!(ooIOloiIii instanceof Io01I1Olo0)) {
/* 187 */                       I000II.I001IO000("Node is not a GestureNode instance");
/* 156 */                       return null;
                            }
/* 161 */                   Io011oOlO01 io011oOlO01 = ((Io01I1Olo0) ooIOloiIii).I00o0iI0io1;
/* 163 */                   Io011oOlO01 io011oOlO012 = io011oOlO01 != null ? io011oOlO01 : null;
/* 180 */                   return Boolean.valueOf(io011oOlO012 == null ? true : ((Boolean) function1.invoke(io011oOlO012)).booleanValue());
                        case 3:
/* 129 */                   Exception exc = (Exception) obj;
/* 135 */                   Log.e("BoxLlamaCppModelHelper", "Failed to load GGUF model", exc);
/* 138 */                   String message = exc.getMessage();
/* 146 */                   function1.invoke(message != null ? message : "Failed to load GGUF model");
/* 149 */                   return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 106 */                   Exception exc2 = (Exception) obj;
/* 112 */                   Log.e("BoxLlamaCppModelHelper", "Inference error", exc2);
/* 115 */                   String message2 = exc2.getMessage();
/* 123 */                   function1.invoke(message2 != null ? message2 : "Inference error");
/* 126 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 100 */                   function1.invoke((String) obj);
/* 103 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 87 */                    Boolean bool = (Boolean) obj;
/* 89 */                    bool.booleanValue();
/* 92 */                    function1.invoke(bool);
/* 95 */                    return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 76 */                    Boolean bool2 = (Boolean) obj;
/* 78 */                    bool2.booleanValue();
/* 81 */                    function1.invoke(bool2);
/* 84 */                    return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 65 */                    Boolean bool3 = (Boolean) obj;
/* 67 */                    bool3.booleanValue();
/* 70 */                    function1.invoke(bool3);
/* 73 */                    return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 43 */                    Ol1il1o1 ol1il1o1 = (Ol1il1o1) function1.invoke((Ol1l0OoOo) obj);
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 58 */                        Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I000iOII(ol1il1o1.I000II());
                            }
/* 61 */                    return ol1il1o1;
                        case 10:
/* 27 */                    Long l = (Long) obj;
/* 29 */                    l.getClass();
/* 32 */                    return function1.invoke(l);
                        case 11:
/* 21 */                    function1.invoke((String) obj);
/* 24 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 8 */                     Integer num = (Integer) obj;
/* 10 */                    num.intValue();
/* 13 */                    function1.invoke(num);
/* 16 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

/* 9 */         public II0O1i0I1(int i) {
/* 10 */            this.I00iOIl = i;
                }
            }
