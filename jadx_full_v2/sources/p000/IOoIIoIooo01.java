            package p000;
            
            public final class IOoIIoIooo01 extends O01IIoOl {
                public static final IOoIIoIooo01 I0000Il00O = new IOoIIoIooo01(OOoOl0i.I00000oIO.I00000oOI(IOoI1l1oi0.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
/* 1 */             String strI00000oOI = Oilii1o1.I00000oOI(o01O0o1iI);
/* 5 */             if (strI00000oOI == null) {
/* 112 */               I000II.I000iOII("Missing required 'type' field");
/* 115 */               return null;
                    }
/* 7 */             IOoOoO0OO iOoOoO0OO = IOoOoo0.Companion;
/* 15 */            if (strI00000oOI.equals("text")) {
/* 19 */                return OloiioiOI1.Companion.serializer();
                    }
/* 32 */            if (strI00000oOI.equals("image")) {
/* 36 */                return IoiI00.Companion.serializer();
                    }
/* 49 */            if (strI00000oOI.equals("audio")) {
/* 53 */                return I1i1oo0O.Companion.serializer();
                    }
/* 66 */            if (strI00000oOI.equals("resource_link")) {
/* 70 */                return Oi0lO0Il.Companion.serializer();
                    }
/* 83 */            if (strI00000oOI.equals("resource")) {
/* 87 */                return IiolIiOioiOO.Companion.serializer();
                    }
/* 109 */           throw new Oili1O(IIl001iO0Io.I000o00OoI0I("Unknown content block type: ", Oilii1o1.I00000oOI(o01O0o1iI)));
                }
            }
