            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.regex.Pattern;
            
            public final class I1lOoOI01 implements IollO0 {
                public static final Pattern I00000oIO = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
                public static final Pattern I00000oOI = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

                @Override
                public final OlOO1i11110 I00000oIO(IollOIOOI00 iollOIOOI00) {
/* 1 */             iOlI10l ioli10l = iollOIOOI00.I0000oI00;
/* 3 */             ioli10l.I000II();
/* 6 */             IIOOoI iIOOoII000iOII = ioli10l.I000iOII();
/* 17 */            if (ioli10l.I00000oOI('>') > 0) {
/* 23 */                OlII11110Iol olII11110IolI0000Il00O = ioli10l.I0000Il00O(iIOOoII000iOII, ioli10l.I000iOII());
/* 27 */                String strI00000oIO = olII11110IolI0000Il00O.I00000oIO();
/* 31 */                ioli10l.I000II();
/* 67 */                String strConcat = I00000oIO.matcher(strI00000oIO).matches() ? strI00000oIO : I00000oOI.matcher(strI00000oIO).matches() ? "mailto:".concat(strI00000oIO) : null;
/* 68 */                if (strConcat != null) {
/* 72 */                    O0ooOoi1Oo1 o0ooOoi1Oo1 = new O0ooOoi1Oo1(strConcat, null);
/* 77 */                    OloOO10o oloOO10o = new OloOO10o(strI00000oIO);
/* 84 */                    oloOO10o.I000II(olII11110IolI0000Il00O.I00000oOI());
/* 87 */                    o0ooOoi1Oo1.I0000Il00O(oloOO10o);
/* 90 */                    IIOOoI iIOOoII000iOII2 = ioli10l.I000iOII();
/* 98 */                    OlOO1i11110 olOO1i11110 = new OlOO1i11110(22);
/* 101 */                   olOO1i11110.I00iiI = o0ooOoi1Oo1;
/* 103 */                   olOO1i11110.I00iiO = iIOOoII000iOII2;
/* 105 */                   VarHandle.storeStoreFence();
/* 108 */                   return olOO1i11110;
                        }
                    }
/* 16 */            return null;
                }
            }
