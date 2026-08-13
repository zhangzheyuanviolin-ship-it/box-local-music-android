            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentMap;
            
            public final class IOIIllIl0 implements OOIil101I0I {
                public static final IOIIllIl0 I00000oOI = new IOIIllIl0(0);
                public static final IOIIllIl0 I0000Il00O = new IOIIllIl0(1);
                public final int I00000oIO;

                public IOIIllIl0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Class I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     return IOIIl1O00.class;
                        default:
/* 6 */                     return OlOiOooOO1.class;
                    }
                }

                @Override
                public final Class I00000oOI() {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     return IOIIl1O00.class;
                        default:
/* 6 */                     return OlOiOooOO1.class;
                    }
                }

                @Override
                public final Object I0000Il00O(IOO000ilo iOO000ilo) throws GeneralSecurityException {
                    switch (this.I00000oIO) {
                        case 0:
/* 32 */                    if (((OOIiiiO) iOO000ilo.I00iiO) == null) {
/* 87 */                        IioIoO10iOiI.I000oI1ioi("no primary in primitive set");
                                break;
                            } else {
/* 42 */                        Iterator it = ((ConcurrentMap) iOO000ilo.I00iiI).values().iterator();
/* 50 */                        while (it.hasNext()) {
/* 58 */                            Iterator it2 = ((List) it.next()).iterator();
/* 66 */                            while (it2.hasNext()) {
                                    }
                                }
                                break;
                            }
                        default:
/* 9 */                     OlOiiilIl olOiiilIl = new OlOiiilIl();
/* 16 */                    if (((OOIiiiO) iOO000ilo.I00iiO) == null) {
/* 24 */                        IioIoO10iOiI.I000oI1ioi("Missing primary primitive.");
                                break;
                            } else {
/* 18 */                        olOiiilIl.I00000oIO = iOO000ilo;
                                break;
                            }
                    }
/* 3 */             return null;
                }
            }
