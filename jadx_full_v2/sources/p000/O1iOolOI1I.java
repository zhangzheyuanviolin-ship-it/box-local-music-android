            package p000;
            
            public final class O1iOolOI1I extends O01IIoOl {
                public static final O1iOolOI1I I0000Il00O = new O1iOolOI1I(OOoOl0i.I00000oIO.I00000oOI(O1iOol1.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
/* 1 */             String strI00000oOI = Oilii1o1.I00000oOI(o01O0o1iI);
/* 5 */             if (strI00000oOI == null) {
/* 78 */                I000II.I000iOII("Missing required 'type' field");
/* 81 */                return null;
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
/* 75 */            throw new Oili1O(IIl001iO0Io.I000o00OoI0I("Unknown media content type: ", Oilii1o1.I00000oOI(o01O0o1iI)));
                }
            }
