            package p000;
            
            public final class OOo1I1o extends O01IIoOl {
                public static final OOo1I1o I0000Il00O = new OOo1I1o(OOoOl0i.I00000oIO.I00000oOI(OOo11oi0ilIO.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
/* 1 */             String strI00000oOI = Oilii1o1.I00000oOI(o01O0o1iI);
/* 5 */             if (strI00000oOI == null) {
/* 61 */                I000II.I000iOII("Missing required 'type' field");
/* 64 */                return null;
                    }
/* 7 */             OOo1IOl oOo1IOl = OOo1IiIOoo1.Companion;
/* 15 */            if (strI00000oOI.equals("ref/prompt")) {
/* 19 */                return OOOI0l.Companion.serializer();
                    }
/* 32 */            if (strI00000oOI.equals("ref/resource")) {
/* 36 */                return Oi0o1OOlIO.Companion.serializer();
                    }
/* 58 */            throw new Oili1O(IIl001iO0Io.I000o00OoI0I("Unknown reference type: ", Oilii1o1.I00000oOI(o01O0o1iI)));
                }
            }
