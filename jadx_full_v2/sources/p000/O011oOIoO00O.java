            package p000;

            import java.util.concurrent.ConcurrentHashMap;
            
            public final class O011oOIoO00O implements OoO00iO0OOl0 {
                public static final O011loOIOI I00iiO;
                public IIlio101Io I00iOIl;
                public ConcurrentHashMap I00iiI;

                static {
/* 3 */             int i = 0;
/* 7 */             I00iiO = new O011loOIOI(i);
/* 11 */            new O011loOIOI(i);
                }

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 10 */            O011liOil o011liOil = (O011liOil) ooOilO.I00000oIO.getAnnotation(O011liOil.class);
/* 12 */            if (o011liOil == null) {
/* 14 */                return null;
                    }
/* 22 */            return I00000oOI(this.I00iOIl, ooIlIoo1oiOo, ooOilO, o011liOil, true);
                }

                public final OoO00O1IiOl I00000oOI(IIlio101Io iIlio101Io, OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO, O011liOil o011liOil, boolean z) {
                    OoO00O1IiOl ooO00O1IiOlI00000oIO;
/* 15 */            Object objI00000oOI = iIlio101Io.I00o0l1o1o0(new OoOilO(o011liOil.value()), true).I00000oOI();
/* 19 */            boolean zNullSafe = o011liOil.nullSafe();
/* 25 */            if (objI00000oOI instanceof OoO00O1IiOl) {
/* 27 */                ooO00O1IiOlI00000oIO = (OoO00O1IiOl) objI00000oOI;
                    } else {
/* 32 */                if (!(objI00000oOI instanceof OoO00iO0OOl0)) {
/* 966 */                   throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objI00000oOI.getClass().getName() + " as a @JsonAdapter for " + iIllolOO.I000O01llI0(ooOilO.I00000oOI) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                        }
/* 34 */                OoO00iO0OOl0 ooO00iO0OOl0 = (OoO00iO0OOl0) objI00000oOI;
/* 36 */                if (z) {
/* 46 */                    OoO00iO0OOl0 ooO00iO0OOl02 = (OoO00iO0OOl0) this.I00iiI.putIfAbsent(ooOilO.I00000oIO, ooO00iO0OOl0);
/* 48 */                    if (ooO00iO0OOl02 != null) {
/* 50 */                        ooO00iO0OOl0 = ooO00iO0OOl02;
                            }
                        }
/* 51 */                ooO00O1IiOlI00000oIO = ooO00iO0OOl0.I00000oIO(ooIlIoo1oiOo, ooOilO);
                    }
                    return (ooO00O1IiOlI00000oIO == null || !zNullSafe) ? ooO00O1IiOlI00000oIO : ooO00O1IiOlI00000oIO.I00000oIO();
                }
            }
