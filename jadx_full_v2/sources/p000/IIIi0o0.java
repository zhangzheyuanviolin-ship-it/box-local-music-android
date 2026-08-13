            package p000;
            
            public abstract class IIIi0o0 {
                public static final OIo1i1 I00000oIO;
                public static final OIo1i1 I00000oOI;
                public static final float I0000Il00O;

                static {
/* 1 */             float f = I1oi0OIol.I00000oIO;
/* 3 */             float f2 = I1oi0OIol.I00000oOI;
/* 5 */             Oioi110io0l oioi110io0l = IIIiO10l0.I00000oIO;
/* 14 */            I00000oIO = new OIo1i1(f, 8.0f, f2, 8.0f);
/* 28 */            if (!(f2 >= 0.0f)) {
/* 30 */                IoliiIlI0O.I00000oIO("Padding must be non-negative");
                    }
/* 40 */            I00000oOI = new OIo1i1(12.0f, 8.0f, 12.0f, 8.0f);
/* 56 */            if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
/* 58 */                IoliiIlI0O.I00000oIO("Padding must be non-negative");
                    }
/* 63 */            I0000Il00O = 58.0f;
/* 65 */            int i = IIIiOO1O.I00000oIO;
/* 67 */            int i2 = IIIiII1.I00000oIO;
/* 69 */            int i3 = IIIi1lo.I00000oIO;
/* 71 */            int i4 = IIIiOI.I00000oIO;
                }

                public static IIIi0O0I1Oo I00000oIO(long j, long j2, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             long j3 = (i & 2) != 0 ? IOOiio0i.I000o00OoI0I : j2;
/* 10 */            long j4 = IOOiio0i.I000o00OoI0I;
/* 24 */            IIIi0O0I1Oo iIIi0O0I1OoI00000oOI = I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO);
/* 37 */            long j5 = j != 16 ? j : iIIi0O0I1OoI00000oOI.I00000oIO;
/* 42 */            if (j3 == 16) {
/* 46 */                j3 = iIIi0O0I1OoI00000oOI.I00000oOI;
                    }
/* 44 */            long j6 = j3;
/* 55 */            long j7 = j4 != 16 ? j4 : iIIi0O0I1OoI00000oOI.I0000Il00O;
/* 60 */            if (j4 == 16) {
/* 65 */                j4 = iIIi0O0I1OoI00000oOI.I0000O;
                    }
/* 70 */            return new IIIi0O0I1Oo(j5, j6, j7, j4);
                }

                public static IIIi0O0I1Oo I00000oOI(IOOl011 iOOl011) {
/* 1 */             IIIi0O0I1Oo iIIi0O0I1Oo = iOOl011.I00OIo;
/* 3 */             if (iIIi0O0I1Oo != null) {
/* 77 */                return iIIi0O0I1Oo;
                    }
/* 43 */            IIIi0O0I1Oo iIIi0O0I1Oo2 = new IIIi0O0I1Oo(IOOl0iiliOl.I0000O(iOOl011, IlIlIIi.I00000oIO), IOOl0iiliOl.I0000O(iOOl011, IlIlIIi.I000II), IOOiio0i.I0000Il00O(IlIlIIi.I0000Il00O, IOOl0iiliOl.I0000O(iOOl011, IlIlIIi.I00000oOI)), IOOiio0i.I0000Il00O(IlIlIIi.I0000oI00, IOOl0iiliOl.I0000O(iOOl011, IlIlIIi.I0000O)));
/* 46 */            iOOl011.I00OIo = iIIi0O0I1Oo2;
/* 48 */            return iIIi0O0I1Oo2;
                }

                public static float I0000Il00O() {
/* 13 */            if (((Boolean) OO1o1OiOOIi.I00000oIO.getValue()).booleanValue()) {
/* 15 */                return 36.0f;
                    }
/* 18 */            Oioi110io0l oioi110io0l = IIIiO10l0.I00000oIO;
/* 20 */            return 40.0f;
                }
            }
