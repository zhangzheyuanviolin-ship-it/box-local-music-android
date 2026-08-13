            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashSet;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Ii1IIiIoO implements IllOOo00lI {
                public final int I00iOIl;
                public Ii1OIIlOi I00iiI;

                public Ii1IIiIoO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ii1OIIlOi ii1OIIlOi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 19 */                    IlIi11li ilIi11li = ii1OIIlOi.I00000oIO;
/* 31 */                    File canonicalFile = ((File) ilIi11li.I0000Il00O.invoke()).getCanonicalFile();
                            synchronized (IlIi11li.I0000oI00) {
/* 38 */                        String absolutePath = canonicalFile.getAbsolutePath();
/* 42 */                        LinkedHashSet linkedHashSet = IlIi11li.I0000O;
/* 48 */                        if (linkedHashSet.contains(absolutePath)) {
/* 134 */                           throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                                }
/* 50 */                        linkedHashSet.add(absolutePath);
                            }
/* 56 */                    OiliO1i1iIII oiliO1i1iIII = ilIi11li.I00000oIO;
/* 64 */                    Ol0Oiooo ol0Oiooo = (Ol0Oiooo) ilIi11li.I00000oOI.invoke(canonicalFile);
/* 69 */                    IlIi0Il ilIi0Il = new IlIi0Il(0);
/* 72 */                    ilIi0Il.I00iiI = canonicalFile;
/* 74 */                    VarHandle.storeStoreFence();
/* 77 */                    IlIi1o0I110 ilIi1o0I110 = new IlIi1o0I110();
/* 80 */                    ilIi1o0I110.I00000oIO = canonicalFile;
/* 82 */                    ilIi1o0I110.I00000oOI = oiliO1i1iIII;
/* 84 */                    ilIi1o0I110.I0000Il00O = ol0Oiooo;
/* 86 */                    ilIi1o0I110.I0000O = ilIi0Il;
/* 93 */                    ilIi1o0I110.I0000oI00 = new AtomicBoolean(false);
/* 100 */                   ilIi1o0I110.I0001Ioi1lo = new OI1I0OoOl();
/* 102 */                   VarHandle.storeStoreFence();
/* 105 */                   return ilIi1o0I110;
                        default:
/* 16 */                    return ((IlIi1o0I110) ii1OIIlOi.I000OiO.getValue()).I0000Il00O;
                    }
                }
            }
