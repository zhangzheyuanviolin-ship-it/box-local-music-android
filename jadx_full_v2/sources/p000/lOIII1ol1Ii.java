            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class lOIII1ol1Ii implements I1Oll0OOO {
                public static final lOIII1ol1Ii I00000oOI = new lOIII1ol1Ii(0);
                public static final lOIII1ol1Ii I0000Il00O = new lOIII1ol1Ii(1);
                public final int I00000oIO;

                public lOIII1ol1Ii(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture apply(Object obj) {
                    String strValueOf;
                    switch (this.I00000oIO) {
                        case 0:
/* 15 */                    I11OiOl i11OiOl = (I11OiOl) obj;
/* 21 */                    int i = i11OiOl.I00iOIl.I00iOIl;
/* 23 */                    String message = i11OiOl.getMessage();
/* 27 */                    if (message != null) {
/* 46 */                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + message.length());
/* 49 */                        sb.append(i);
/* 54 */                        sb.append(": ");
/* 57 */                        sb.append(message);
/* 60 */                        strValueOf = sb.toString();
                            } else {
/* 65 */                        strValueOf = String.valueOf(i);
                            }
/* 69 */                    lOI1111l loi1111l = new lOI1111l(strValueOf, i11OiOl);
/* 72 */                    loi1111l.I00iOIl = i;
/* 74 */                    VarHandle.storeStoreFence();
/* 77 */                    throw loi1111l;
                        default:
/* 10 */                    return IlloOoiiO.I0000Il00O("");
                    }
                }
            }
