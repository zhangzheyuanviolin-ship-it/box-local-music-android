            package p000;
            
            public final class O00OoiI extends O01IIoOl {
                public static final O00OoiI I0000Il00O = new O00OoiI(OOoOl0i.I00000oIO.I00000oOI(O00OoO.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
/* 1 */             O01ioO1o0i11 o01ioO1o0i11I0000O = O01O1110.I0000O(o01O0o1iI);
/* 11 */            if (o01ioO1o0i11I0000O.containsKey("error")) {
/* 15 */                return O00Ol10IiOoi.Companion.serializer();
                    }
/* 28 */            if (o01ioO1o0i11I0000O.containsKey("result")) {
/* 32 */                return O00illI0o000.Companion.serializer();
                    }
/* 45 */            if (o01ioO1o0i11I0000O.containsKey("method") && o01ioO1o0i11I0000O.containsKey("id")) {
/* 57 */                return O00iOil.Companion.serializer();
                    }
/* 68 */            if (o01ioO1o0i11I0000O.containsKey("method")) {
/* 72 */                return O00i1OoOll1I.Companion.serializer();
                    }
/* 186 */           throw new Oili1O("Invalid JSONRPCMessage type: " + o01ioO1o0i11I0000O.I00iOIl.keySet());
                }
            }
