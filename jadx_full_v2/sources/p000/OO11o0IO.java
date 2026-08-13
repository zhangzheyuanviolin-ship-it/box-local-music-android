            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class OO11o0IO implements IiIooOOOI {
                public boolean I00iOIl;

                public static void I000OiO(OO11o0IO oO11o0IO, OO1I0001000i oO1I0001000i, long j) {
/* 1 */             oO11o0IO.I000II(oO1I0001000i);
/* 12 */            oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00(j, oO1I0001000i.I00ilI0I1), 0.0f, null);
                }

                public static void I000iOII(OO11o0IO oO11o0IO, OO1I0001000i oO1I0001000i, int i, int i2) {
/* 12 */            long j = (i << 32) | (i2 & 4294967295L);
/* 21 */            if (oO11o0IO.I0000O() == O0iOOoiioO.I00iOIl || oO11o0IO.I0001Ioi1lo() == 0) {
/* 62 */                oO11o0IO.I000II(oO1I0001000i);
/* 71 */                oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00(j, oO1I0001000i.I00ilI0I1), 0.0f, null);
                    } else {
/* 40 */                int iI0001Ioi1lo = (oO11o0IO.I0001Ioi1lo() - oO1I0001000i.I00iOIl) - ((int) (j >> 32));
/* 49 */                oO11o0IO.I000II(oO1I0001000i);
/* 58 */                oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00((iI0001Ioi1lo << 32) | (((int) (j & 4294967295L)) & 4294967295L), oO1I0001000i.I00ilI0I1), 0.0f, null);
                    }
                }

                public static void I000l1(OO11o0IO oO11o0IO, OO1I0001000i oO1I0001000i, int i, int i2, Function1 function1, int i3) {
/* 3 */             if ((i3 & 8) != 0) {
/* 5 */                 function1 = OO1I000OIiO.I00000oIO;
                    }
/* 18 */            long j = (i << 32) | (i2 & 4294967295L);
/* 26 */            if (oO11o0IO.I0000O() == O0iOOoiioO.I00iOIl || oO11o0IO.I0001Ioi1lo() == 0) {
/* 67 */                oO11o0IO.I000II(oO1I0001000i);
/* 76 */                oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00(j, oO1I0001000i.I00ilI0I1), 0.0f, function1);
                    } else {
/* 54 */                oO11o0IO.I000II(oO1I0001000i);
/* 63 */                oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00((((oO11o0IO.I0001Ioi1lo() - oO1I0001000i.I00iOIl) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), oO1I0001000i.I00ilI0I1), 0.0f, function1);
                    }
                }

                public static void I000oI1ioi(OO11o0IO oO11o0IO, OO1I0001000i oO1I0001000i, long j) {
/* 1 */             OI1lOo oI1lOo = OO1I000OIiO.I00000oIO;
/* 10 */            if (oO11o0IO.I0000O() == O0iOOoiioO.I00iOIl || oO11o0IO.I0001Ioi1lo() == 0) {
/* 58 */                oO11o0IO.I000II(oO1I0001000i);
/* 67 */                oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00(j, oO1I0001000i.I00ilI0I1), 0.0f, oI1lOo);
                    } else {
/* 31 */                int iI0001Ioi1lo = (oO11o0IO.I0001Ioi1lo() - oO1I0001000i.I00iOIl) - ((int) (j >> 32));
/* 45 */                oO11o0IO.I000II(oO1I0001000i);
/* 54 */                oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00((((int) (j & 4294967295L)) & 4294967295L) | (iI0001Ioi1lo << 32), oO1I0001000i.I00ilI0I1), 0.0f, oI1lOo);
                    }
                }

                public static void I0010o(OO11o0IO oO11o0IO, OO1I0001000i oO1I0001000i, int i, int i2, Function1 function1, int i3) {
/* 3 */             if ((i3 & 8) != 0) {
/* 5 */                 function1 = OO1I000OIiO.I00000oIO;
                    }
/* 19 */            oO11o0IO.I000II(oO1I0001000i);
/* 29 */            oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00((i2 & 4294967295L) | (i << 32), oO1I0001000i.I00ilI0I1), 0.0f, function1);
                }

                public static void I001IIilI0O(OO11o0IO oO11o0IO, OO1I0001000i oO1I0001000i, long j) {
/* 1 */             OI1lOo oI1lOo = OO1I000OIiO.I00000oIO;
/* 3 */             oO11o0IO.I000II(oO1I0001000i);
/* 13 */            oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00(j, oO1I0001000i.I00ilI0I1), 0.0f, oI1lOo);
                }

                public float I00000oOI(IoI1O1i1 ioI1O1i1) {
/* 1 */             return Float.NaN;
                }

                public abstract O0iOOo0Ii I0000Il00O();

                public abstract O0iOOoiioO I0000O();

                public abstract int I0001Ioi1lo();

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000II(OO1I0001000i oO1I0001000i) {
/* 3 */             if (oO1I0001000i instanceof OI01OioIIoo) {
/* 9 */                 ((OI01OioIIoo) oO1I0001000i).I00IO1(this.I00iOIl);
                    }
                }

                public final void I000O01llI0(OO1I0001000i oO1I0001000i, int i, int i2, float f) {
/* 13 */            I000II(oO1I0001000i);
/* 23 */            oO1I0001000i.I00iIi0i1o(IooO0O.I0000oI00((i2 & 4294967295L) | (i << 32), oO1I0001000i.I00ilI0I1), f, null);
                }
            }
