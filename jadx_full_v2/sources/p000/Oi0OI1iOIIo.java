            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class Oi0OI1iOIIo extends O01IIoOl {
                public static final Oi0OI1iOIIo I0000Il00O = new Oi0OI1iOIIo(OOoOl0i.I00000oIO.I00000oOI(Oi01i1OIl.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
/* 1 */             String strI00000oIO = Oilii1o1.I00000oIO(o01O0o1iI);
/* 5 */             if (strI00000oIO != null) {
/* 19 */                O0O01001OOII o0o01001ooii = (O0O01001OOII) ((Map) Oilii1o1.I00000oOI.getValue()).get(strI00000oIO);
/* 21 */                if (o0o01001ooii != null) {
/* 48 */                    return o0o01001ooii;
                        }
/* 35 */                O0O01001OOII o0o01001ooii2 = (O0O01001OOII) ((Map) Oilii1o1.I0000Il00O.getValue()).get(strI00000oIO);
                        return o0o01001ooii2 == null ? Ii0io0Ooi1I1.Companion.serializer() : o0o01001ooii2;
                    }
/* 49 */            O0Iioo1lO0o o0Iioo1lO0o = Oilii1o1.I00000oIO;
/* 55 */            OIOo1iiI oIOo1iiI = new OIOo1iiI(14);
/* 58 */            oIOo1iiI.I00iiI = o01O0o1iI;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            o0Iioo1lO0o.I000OOo1O(oIOo1iiI);
/* 186 */           throw new Oili1O("Missing 'method' for Request: " + o01O0o1iI);
                }
            }
