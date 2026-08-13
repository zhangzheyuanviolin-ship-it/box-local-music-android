            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class O1lll1OOooOI implements O0O01001OOII {
                public static final O1lll1OOooOI I00000oIO = new O1lll1OOooOI();
                public static final OOIii1ili I00000oOI = lO1o10lllO0I.I00000oIO("io.modelcontextprotocol.kotlin.sdk.types.Method");
                public static final OllO00oiil I0000Il00O = new OllO00oiil(new O0o0Ol0(25));

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             String strI0010o = ii1iO1O.I0010o();
/* 17 */            O1llOIO o1llOIO = (O1llOIO) ((Map) I0000Il00O.getValue()).get(strI0010o);
/* 19 */            if (o1llOIO != null) {
/* 21 */                return o1llOIO;
                    }
/* 24 */            O1llI1iI0il o1llI1iI0il = new O1llI1iI0il();
/* 27 */            o1llI1iI0il.I00iOIl = strI0010o;
/* 29 */            VarHandle.storeStoreFence();
/* 49 */            return o1llI1iI0il;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 7 */             il0I1ii.I001lloI(((O1llOlOo) obj).getValue());
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return I00000oOI;
                }
            }
