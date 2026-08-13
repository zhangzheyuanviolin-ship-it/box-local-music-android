            package p000;

            import java.util.List;
            
            public final class IlilIIiIiO implements Comparable {
                public static final IlilIIiIiO I00iiI;
                public static final IlilIIiIiO I00iiO;
                public static final IlilIIiIiO I00iio;
                public static final IlilIIiIiO I00ilI0I1;
                public static final IlilIIiIiO I00ilO0;
                public static final IlilIIiIiO I00io1l;
                public static final IlilIIiIiO I00ioIO;
                public static final IlilIIiIiO I00l0I0l0lO1;
                public static final IlilIIiIiO I00l0OO0IO;
                public static final IlilIIiIiO I00li1OI;
                public static final IlilIIiIiO I00ll1;
                public static final IlilIIiIiO I00lli11;
                public static final List I00lll10;
                public final int I00iOIl;

                static {
/* 5 */             IlilIIiIiO ililIIiIiO = new IlilIIiIiO(100);
/* 12 */            IlilIIiIiO ililIIiIiO2 = new IlilIIiIiO(200);
/* 19 */            IlilIIiIiO ililIIiIiO3 = new IlilIIiIiO(300);
/* 26 */            IlilIIiIiO ililIIiIiO4 = new IlilIIiIiO(400);
/* 29 */            I00iiI = ililIIiIiO4;
/* 35 */            IlilIIiIiO ililIIiIiO5 = new IlilIIiIiO(500);
/* 38 */            I00iiO = ililIIiIiO5;
/* 44 */            IlilIIiIiO ililIIiIiO6 = new IlilIIiIiO(600);
/* 47 */            I00iio = ililIIiIiO6;
/* 53 */            IlilIIiIiO ililIIiIiO7 = new IlilIIiIiO(700);
/* 60 */            IlilIIiIiO ililIIiIiO8 = new IlilIIiIiO(800);
/* 67 */            IlilIIiIiO ililIIiIiO9 = new IlilIIiIiO(900);
/* 70 */            I00ilI0I1 = ililIIiIiO;
/* 72 */            I00ilO0 = ililIIiIiO2;
/* 74 */            I00io1l = ililIIiIiO3;
/* 76 */            I00ioIO = ililIIiIiO4;
/* 78 */            I00l0I0l0lO1 = ililIIiIiO5;
/* 80 */            I00l0OO0IO = ililIIiIiO6;
/* 82 */            I00li1OI = ililIIiIiO7;
/* 84 */            I00ll1 = ililIIiIiO8;
/* 86 */            I00lli11 = ililIIiIiO9;
/* 96 */            I00lll10 = IOOi1I.I000O01llI0(ililIIiIiO, ililIIiIiO2, ililIIiIiO3, ililIIiIiO4, ililIIiIiO5, ililIIiIiO6, ililIIiIiO7, ililIIiIiO8, ililIIiIiO9);
                }

                public IlilIIiIiO(int i) {
/* 4 */             this.I00iOIl = i;
/* 6 */             boolean z = false;
/* 8 */             if (1 <= i && i < 1001) {
/* 14 */                z = true;
                    }
/* 15 */            if (z) {
/* 77 */                return;
                    }
/* 31 */            Ioliol.I00000oIO("Font weight can be in range [1, 1000]. Current value: " + i);
                }

                @Override
                public final int compareTo(IlilIIiIiO ililIIiIiO) {
/* 5 */             return O0000Ioio00.I0000oI00(this.I00iOIl, ililIIiIiO.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof IlilIIiIiO) {
                        return this.I00iOIl == ((IlilIIiIiO) obj).I00iOIl;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             return this.I00iOIl;
                }

                public final String toString() {
/* 7 */             return IIlIOloOOO.I00100l0("FontWeight(weight=", this.I00iOIl, ")");
                }
            }
