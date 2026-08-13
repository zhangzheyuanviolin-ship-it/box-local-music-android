            package p000;

            import java.lang.invoke.VarHandle;
            
/* 30 */    public final class Oool0iOoooIo {
                public static final loIOiIO1O1 I00000oOI = new loIOiIO1O1(16);
                public final iOliil I00000oIO;

                public Oool0iOoooIo(Oool0l1iOIOl oool0l1iOIOl, Oool0IIIO0o oool0IIIO0o, Ii0OO1I1iOo ii0OO1I1iOo) {
/* 5 */             iOliil ioliil = new iOliil(14);
/* 8 */             ioliil.I00iiI = oool0l1iOIOl;
/* 10 */            ioliil.I00iiO = oool0IIIO0o;
/* 12 */            ioliil.I00iio = ii0OO1I1iOo;
/* 21 */            ioliil.I00ilI0I1 = new loilIl10Ii(15);
/* 23 */            VarHandle.storeStoreFence();
/* 29 */            this.I00000oIO = ioliil;
                }

                public final OooioIIoi0O I00000oIO(O0IOli0o0 o0IOli0o0) {
/* 1 */             String strI000O01llI0 = o0IOli0o0.I000O01llI0();
/* 5 */             if (strI000O01llI0 != null) {
/* 15 */                return this.I00000oIO.I001i1O0Ol(o0IOli0o0, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI000O01llI0));
                    }
/* 22 */            I000II.I000iOII("Local and anonymous classes can not be ViewModels");
/* 25 */            return null;
                }

                public final OooioIIoi0O I00000oOI(Class cls) {
/* 7 */             return I00000oIO(OOoOl0i.I00000oIO.I00000oOI(cls));
                }

/* 31 */        public Oool0iOoooIo(Oool0l1iOIOl oool0l1iOIOl, Oool0IIIO0o oool0IIIO0o) {
/* 33 */            this(oool0l1iOIOl, oool0IIIO0o, Ii0OIl0li.I00000oOI);
                }

/* 33 */        public Oool0iOoooIo(Oool1Ii0I oool1Ii0I) {
/* 37 */            this(oool1Ii0I.I000II(), li1iolIo.I00000oOI(oool1Ii0I), li1iolIo.I00000oIO(oool1Ii0I));
                }
            }
