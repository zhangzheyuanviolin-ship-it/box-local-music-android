            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OI10IIoI {
                public static final OI10IIoI I00000oOI;
                public AtomicReference I00000oIO;

                static {
/* 3 */             OI10IIoI oI10IIoI = new OI10IIoI();
/* 10 */            HashMap map = new HashMap();
/* 15 */            HashMap map2 = new HashMap();
/* 20 */            HashMap map3 = new HashMap();
/* 25 */            HashMap map4 = new HashMap();
/* 30 */            OiliIllol oiliIllol = new OiliIllol();
/* 38 */            oiliIllol.I00000oIO = new HashMap(map);
/* 45 */            oiliIllol.I00000oOI = new HashMap(map2);
/* 52 */            oiliIllol.I0000Il00O = new HashMap(map3);
/* 59 */            oiliIllol.I0000O = new HashMap(map4);
/* 61 */            VarHandle.storeStoreFence();
/* 67 */            oI10IIoI.I00000oIO = new AtomicReference(oiliIllol);
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            I00000oOI = oI10IIoI;
                }

                public final l0il1i0011O I00000oIO(OOi1OoI0loOi oOi1OoI0loOi) {
/* 1 */             AtomicReference atomicReference = this.I00000oIO;
/* 7 */             OiliIllol oiliIllol = (OiliIllol) atomicReference.get();
/* 9 */             oiliIllol.getClass();
/* 14 */            IIOIlli0IO iIOIlli0IO = oOi1OoI0loOi.I00000oOI;
/* 27 */            if (!oiliIllol.I00000oOI.containsKey(new OiliI10iIo(OOi1OoI0loOi.class, iIOIlli0IO))) {
                        try {
/* 31 */                    O0oIl000 o0oIl000 = new O0oIl000();
/* 36 */                    oOi1OoI0loOi.I0000O.ordinal();
/* 39 */                    return o0oIl000;
                        } catch (GeneralSecurityException e) {
/* 50 */                    throw new IOiIIo1l("Creating a LegacyProtoKey failed", e, 9);
                        }
                    }
/* 55 */            OiliIllol oiliIllol2 = (OiliIllol) atomicReference.get();
/* 57 */            oiliIllol2.getClass();
/* 62 */            OiliI10iIo oiliI10iIo = new OiliI10iIo(OOi1OoI0loOi.class, iIOIlli0IO);
/* 65 */            HashMap map = oiliIllol2.I00000oOI;
/* 71 */            if (map.containsKey(oiliI10iIo)) {
/* 81 */                return ((O0OI0O) map.get(oiliI10iIo)).I00000oOI.I00000oOI(oOi1OoI0loOi);
                    }
/* 90 */            OIiilo1Ool0o.I000oI1ioi(oiliI10iIo, "No Key Parser for requested key type ", " available");
/* 93 */            return null;
                }

                public final synchronized void I00000oOI(O0OI0O o0oi0o) {
/* 12 */            OillOo0 oillOo0 = new OillOo0((OiliIllol) this.I00000oIO.get());
/* 17 */            o0oi0o.getClass();
/* 24 */            OiliI10iIo oiliI10iIo = new OiliI10iIo(OOi1OoI0loOi.class, o0oi0o.I00000oIO);
/* 29 */            HashMap map = (HashMap) oillOo0.I00iiO;
/* 35 */            if (map.containsKey(oiliI10iIo)) {
/* 41 */                O0OI0O o0oi0o2 = (O0OI0O) map.get(oiliI10iIo);
/* 47 */                if (!o0oi0o2.equals(o0oi0o) || o0oi0o != o0oi0o2) {
/* 54 */                    IoOOl0iOl1io.I001i1O0Ol("Attempt to register non-equal parser for already existing object of type: ", oiliI10iIo);
                        }
                    } else {
/* 58 */                map.put(oiliI10iIo, o0oi0o);
                    }
/* 67 */            this.I00000oIO.set(oillOo0.I000O01llI0());
                }

                public final synchronized void I0000Il00O(O0OI1o1Ii o0OI1o1Ii) {
/* 12 */            OillOo0 oillOo0 = new OillOo0((OiliIllol) this.I00000oIO.get());
/* 21 */            OiliIOOIli1o oiliIOOIli1o = new OiliIOOIli1o(o0OI1o1Ii.I00000oIO, OOi1OoI0loOi.class);
/* 26 */            HashMap map = (HashMap) oillOo0.I00iiI;
/* 32 */            if (map.containsKey(oiliIOOIli1o)) {
/* 38 */                O0OI1o1Ii o0OI1o1Ii2 = (O0OI1o1Ii) map.get(oiliIOOIli1o);
/* 44 */                if (!o0OI1o1Ii2.equals(o0OI1o1Ii) || o0OI1o1Ii != o0OI1o1Ii2) {
/* 51 */                    IoOOl0iOl1io.I001i1O0Ol("Attempt to register non-equal serializer for already existing object of type: ", oiliIOOIli1o);
                        }
                    } else {
/* 55 */                map.put(oiliIOOIli1o, o0OI1o1Ii);
                    }
/* 64 */            this.I00000oIO.set(oillOo0.I000O01llI0());
                }

                public final synchronized void I0000O(OIolI1l1 oIolI1l1) {
/* 12 */            OillOo0 oillOo0 = new OillOo0((OiliIllol) this.I00000oIO.get());
/* 17 */            oIolI1l1.getClass();
/* 24 */            OiliI10iIo oiliI10iIo = new OiliI10iIo(OOi1ii000oOI.class, oIolI1l1.I00000oIO);
/* 29 */            HashMap map = (HashMap) oillOo0.I00ilI0I1;
/* 35 */            if (map.containsKey(oiliI10iIo)) {
/* 41 */                OIolI1l1 oIolI1l12 = (OIolI1l1) map.get(oiliI10iIo);
/* 47 */                if (!oIolI1l12.equals(oIolI1l1) || oIolI1l1 != oIolI1l12) {
/* 54 */                    IoOOl0iOl1io.I001i1O0Ol("Attempt to register non-equal parser for already existing object of type: ", oiliI10iIo);
                        }
                    } else {
/* 58 */                map.put(oiliI10iIo, oIolI1l1);
                    }
/* 67 */            this.I00000oIO.set(oillOo0.I000O01llI0());
                }

                public final synchronized void I0000oI00(OIolII0 oIolII0) {
/* 12 */            OillOo0 oillOo0 = new OillOo0((OiliIllol) this.I00000oIO.get());
/* 21 */            OiliIOOIli1o oiliIOOIli1o = new OiliIOOIli1o(oIolII0.I00000oIO, OOi1ii000oOI.class);
/* 26 */            HashMap map = (HashMap) oillOo0.I00iio;
/* 32 */            if (map.containsKey(oiliIOOIli1o)) {
/* 38 */                OIolII0 oIolII02 = (OIolII0) map.get(oiliIOOIli1o);
/* 44 */                if (!oIolII02.equals(oIolII0) || oIolII0 != oIolII02) {
/* 51 */                    IoOOl0iOl1io.I001i1O0Ol("Attempt to register non-equal serializer for already existing object of type: ", oiliIOOIli1o);
                        }
                    } else {
/* 55 */                map.put(oiliIOOIli1o, oIolII0);
                    }
/* 64 */            this.I00000oIO.set(oillOo0.I000O01llI0());
                }
            }
