            package p000;
            
            public final class Oi0IOl extends O01IIoOl {
                public static final Oi0IOl I0000Il00O = new Oi0IOl(OOoOl0i.I00000oIO.I00000oOI(Oi0IO1ii011.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
                    Long lValueOf;
/* 1 */             boolean z = o01O0o1iI instanceof O01lO1iO;
/* 3 */             if (z && ((O01lO1iO) o01O0o1iI).I0000O()) {
/* 16 */                return Oi0IO111o10.Companion.serializer();
                    }
/* 23 */            if (z) {
                        try {
/* 32 */                    lValueOf = Long.valueOf(O01O1110.I0001Ioi1lo((O01lO1iO) o01O0o1iI));
                        } catch (O01Io1OOi unused) {
/* 37 */                    lValueOf = null;
                        }
/* 38 */                if (lValueOf != null) {
/* 42 */                    return Oi0I1ollliiI.Companion.serializer();
                        }
                    }
/* 186 */           throw new Oili1O("Invalid RequestId type: " + o01O0o1iI);
                }
            }
