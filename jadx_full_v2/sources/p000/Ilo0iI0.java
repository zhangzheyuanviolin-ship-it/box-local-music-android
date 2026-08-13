            package p000;

            import java.security.spec.AlgorithmParameterSpec;
            import java.util.HashMap;
            
            public final class Ilo0iI0 implements AlgorithmParameterSpec {
                public static final HashMap I00000oIO;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             I00000oIO = map;
/* 12 */            map.put(Ii0i0o00.I0000oI00, "E-A");
/* 19 */            map.put(Ii0i0o00.I0001Ioi1lo, "E-B");
/* 26 */            map.put(Ii0i0o00.I000II, "E-C");
/* 33 */            map.put(Ii0i0o00.I000O01llI0, "E-D");
/* 40 */            map.put(OiI0I0OOoO0.I000OOo1O, "Param-Z");
                }

                public Ilo0iI0(I00O0i0ii i00O0i0ii, byte[] bArr) {
/* 7 */             String str = (String) I00000oIO.get(i00O0i0ii);
/* 10 */            if (str == null) {
/* 44 */                IioIoO10iOiI.I000OiO("unknown OID: ", i00O0i0ii);
/* 89 */                throw null;
                    }
/* 25 */            byte[] bArr2 = (byte[]) Ilo0i0.I00000oIO.get(OlOoIoi11.I00000oOI(str));
/* 27 */            if (bArr2 == null) {
/* 38 */                I000II.I000iOII("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
/* 41 */                throw null;
                    }
/* 29 */            iOO1iOiOl.I00000oIO(bArr2);
/* 32 */            iOO1iOiOl.I00000oIO(bArr);
                }
            }
