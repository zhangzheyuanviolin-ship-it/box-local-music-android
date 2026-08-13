            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.EnumMap;
            import java.util.HashMap;
            
            public final class O0i1ilIl1Ol implements IllOOo00lI {
                public final int I00iOIl;
                public O0i1lI0o1io I00iiI;

                public O0i1ilIl1Ol(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 117 */                   O0i1lI0o1io o0i1lI0o1io = this.I00iiI;
/* 163 */                   return Arrays.asList(o0i1lI0o1io.I000l1().I00i0ilIl0i(OlIlllOI1.I000l1), o0i1lI0o1io.I000l1().I00i0ilIl0i(OlIlllOI1.I000o00OoI0I), o0i1lI0o1io.I000l1().I00i0ilIl0i(OlIlllOI1.I000oI1ioi), o0i1lI0o1io.I000l1().I00i0ilIl0i(OlIlllOI1.I000lI));
                        default:
/* 6 */                     O0i1lI0o1io o0i1lI0o1io2 = this.I00iiI;
/* 12 */                    EnumMap enumMap = new EnumMap(OOIil01OI.class);
/* 17 */                    HashMap map = new HashMap();
/* 22 */                    HashMap map2 = new HashMap();
/* 31 */                    for (OOIil01OI oOIil01OI : OOIil01OI.values()) {
/* 37 */                        String strI00000oOI = oOIil01OI.I00iOIl.I00000oOI();
/* 44 */                        if (strI00000oOI == null) {
/* 100 */                           O0i1lI0o1io.I00000oIO(47);
/* 103 */                           throw null;
                                }
/* 50 */                        Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = o0i1lI0o1io2.I000iOII(strI00000oOI).I00Ol10();
/* 56 */                        if (ol0O0iI0l0OI00Ol10 == null) {
/* 96 */                            O0i1lI0o1io.I00000oIO(48);
/* 99 */                            throw null;
                                }
/* 60 */                        String strI00000oOI2 = oOIil01OI.I00iiI.I00000oOI();
/* 64 */                        if (strI00000oOI2 == null) {
/* 92 */                            O0i1lI0o1io.I00000oIO(47);
/* 95 */                            throw null;
                                }
/* 70 */                        Ol0O0iI0l0O ol0O0iI0l0OI00Ol102 = o0i1lI0o1io2.I000iOII(strI00000oOI2).I00Ol10();
/* 74 */                        if (ol0O0iI0l0OI00Ol102 == null) {
/* 88 */                            O0i1lI0o1io.I00000oIO(48);
/* 91 */                            throw null;
                                }
/* 76 */                        enumMap.put((EnumMap) oOIil01OI, (OOIil01OI) ol0O0iI0l0OI00Ol102);
/* 79 */                        map.put(ol0O0iI0l0OI00Ol10, ol0O0iI0l0OI00Ol102);
/* 82 */                        map2.put(ol0O0iI0l0OI00Ol102, ol0O0iI0l0OI00Ol10);
                            }
/* 106 */                   O0i1lI o0i1lI = new O0i1lI();
/* 109 */                   o0i1lI.I00000oIO = enumMap;
/* 111 */                   o0i1lI.I00000oOI = map2;
/* 113 */                   VarHandle.storeStoreFence();
/* 116 */                   return o0i1lI;
                    }
                }
            }
