            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l0I00OIIlII {
                public static final O01IlO I00000oIO(Ii1iO1O ii1iO1O) {
/* 10 */            O01IlO o01IlO = ii1iO1O instanceof O01IlO ? (O01IlO) ii1iO1O : null;
/* 11 */            if (o01IlO != null) {
/* 13 */                return o01IlO;
                    }
/* 31 */            I000II.I001IO000(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ii1iO1O.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
/* 3 */             return null;
                }

                public static final void I00000oOI(Il0I1ii il0I1ii) {
/* 10 */            if ((il0I1ii instanceof O01OOloli ? (O01OOloli) il0I1ii : null) != null) {
/* 12 */                return;
                    }
/* 30 */            I000II.I001IO000(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, il0I1ii.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
                }

                public static final O01OI0O I0000Il00O(IllOOo00lI illOOo00lI) {
/* 3 */             O01OI0O o01oi0o = new O01OI0O();
/* 11 */            o01oi0o.I00000oIO = new OllO00oiil(illOOo00lI);
/* 13 */            VarHandle.storeStoreFence();
/* 49 */            return o01oi0o;
                }
            }
