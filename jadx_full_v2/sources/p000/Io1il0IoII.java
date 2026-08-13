            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Io1il0IoII implements Oool0IIIO0o {
                public static final i1O01oOIoI0I I0000O = new i1O01oOIoI0I(12);
                public final O0ioO00I I00000oIO;
                public final Oool0IIIO0o I00000oOI;
                public final I0IOoio1iool I0000Il00O;

                public Io1il0IoII(O0ioO00I o0ioO00I, Oool0IIIO0o oool0IIIO0o, I0IIiO0iI i0IIiO0iI) {
/* 4 */             this.I00000oIO = o0ioO00I;
/* 6 */             this.I00000oOI = oool0IIIO0o;
/* 11 */            I0IOoio1iool i0IOoio1iool = new I0IOoio1iool(1);
/* 14 */            i0IOoio1iool.I00000oOI = i0IIiO0iI;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I0000Il00O = i0IOoio1iool;
                }

                @Override
                public final OooioIIoi0O I00000oIO(Class cls) {
/* 7 */             if (!this.I00000oIO.containsKey(cls)) {
/* 11 */                return this.I00000oOI.I00000oIO(cls);
                    }
/* 18 */            this.I0000Il00O.I00000oIO(cls);
/* 29 */            throw null;
                }

                @Override
                public final OooioIIoi0O I00000oOI(Class cls, OI0l1OOllOo oI0l1OOllOo) {
                    return this.I00000oIO.containsKey(cls) ? this.I0000Il00O.I00000oOI(cls, oI0l1OOllOo) : this.I00000oOI.I00000oOI(cls, oI0l1OOllOo);
                }
            }
