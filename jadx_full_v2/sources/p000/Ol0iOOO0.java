            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Ol0iOOO0 {
                public static final IlIl1Io0lii1 I00000oIO = new IlIl1Io0lii1(Iii1I1O0.I00iiI, 1.0f);
                public static final IlIl1Io0lii1 I00000oOI = new IlIl1Io0lii1(Iii1I1O0.I00iOIl, 1.0f);
                public static final IlIl1Io0lii1 I0000Il00O = new IlIl1Io0lii1(Iii1I1O0.I00iiO, 1.0f);
                public static final i01illii1lI1 I0000O = iO1OlI011Oo1.I0000Il00O(i1O01oOIoI0I.I00o0l1o1o0);
                public static final i01illii1lI1 I0000oI00 = iO1OlI011Oo1.I0000Il00O(i1O01oOIoI0I.I00o0iI0io1);
                public static final i01illii1lI1 I0001Ioi1lo = iO1OlI011Oo1.I00000oIO(i1O01oOIoI0I.I00lli11);
                public static final i01illii1lI1 I000II = iO1OlI011Oo1.I00000oIO(i1O01oOIoI0I.I00ll1);
                public static final i01illii1lI1 I000O01llI0 = iO1OlI011Oo1.I00000oOI(i1O01oOIoI0I.I00io1l);
                public static final i01illii1lI1 I000OOo1O = iO1OlI011Oo1.I00000oOI(i1O01oOIoI0I.I00iiO);

                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, float f, float f2) {
/* 3 */             OoilloII ooilloII = new OoilloII();
/* 6 */             ooilloII.I00000oIO = f;
/* 8 */             ooilloII.I00000oOI = f2;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return o1ooiI111i.I0000O(ooilloII);
                }

                public static O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, float f, float f2, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 f = Float.NaN;
                    }
/* 10 */            if ((i & 2) != 0) {
/* 12 */                f2 = Float.NaN;
                    }
/* 13 */            return I00000oIO(o1ooiI111i, f, f2);
                }

                public static final O1ooiI111i I0000Il00O(O1ooiI111i o1ooiI111i, float f) {
/* 18 */            return o1ooiI111i.I0000O(f == 1.0f ? I00000oOI : new IlIl1Io0lii1(Iii1I1O0.I00iOIl, f));
                }

                public static O1ooiI111i I0000O(O1ooiI111i o1ooiI111i) {
/* 3 */             return o1ooiI111i.I0000O(I0000Il00O);
                }

                public static final O1ooiI111i I0000oI00(O1ooiI111i o1ooiI111i, float f) {
/* 18 */            return o1ooiI111i.I0000O(f == 1.0f ? I00000oIO : new IlIl1Io0lii1(Iii1I1O0.I00iiI, f));
                }

                public static final O1ooiI111i I000II(O1ooiI111i o1ooiI111i, float f) {
/* 12 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(0.0f, f, 0.0f, f, true, 5));
                }

                public static final O1ooiI111i I000O01llI0(O1ooiI111i o1ooiI111i, float f, float f2) {
/* 12 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(0.0f, f, 0.0f, f2, true, 5));
                }

                public static O1ooiI111i I000OOo1O(O1ooiI111i o1ooiI111i, float f, float f2, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 f = Float.NaN;
                    }
/* 10 */            if ((i & 2) != 0) {
/* 12 */                f2 = Float.NaN;
                    }
/* 13 */            return I000O01llI0(o1ooiI111i, f, f2);
                }

                public static final O1ooiI111i I000OiO(O1ooiI111i o1ooiI111i, float f) {
/* 12 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(0.0f, f, 0.0f, f, false, 5));
                }

                public static final O1ooiI111i I000iOII(O1ooiI111i o1ooiI111i, float f) {
/* 11 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, f, f, f, false));
                }

                public static O1ooiI111i I000l1(O1ooiI111i o1ooiI111i, float f, float f2, float f3, float f4, int i) {
/* 31 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
                }

                public static final O1ooiI111i I000lI(O1ooiI111i o1ooiI111i, float f) {
/* 11 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, f, f, f, true));
                }

                public static final O1ooiI111i I000o00OoI0I(O1ooiI111i o1ooiI111i, float f, float f2) {
/* 11 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, f2, f, f2, true));
                }

                public static final O1ooiI111i I000oI1ioi(O1ooiI111i o1ooiI111i, float f, float f2, float f3, float f4) {
/* 11 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, f2, f3, f4, true));
                }

                public static O1ooiI111i I00100l0(O1ooiI111i o1ooiI111i, float f, float f2, float f3, int i) {
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 f2 = Float.NaN;
                    }
/* 10 */            if ((i & 4) != 0) {
/* 12 */                f3 = Float.NaN;
                    }
/* 13 */            return I000oI1ioi(o1ooiI111i, f, f2, f3, Float.NaN);
                }

                public static final O1ooiI111i I00100o1O0lo(O1ooiI111i o1ooiI111i, float f) {
/* 13 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, 0.0f, f, 0.0f, true, 10));
                }

                public static final O1ooiI111i I0010I0i(O1ooiI111i o1ooiI111i, float f, float f2) {
/* 13 */            return o1ooiI111i.I0000O(new Ol0iIolO0ii1(f, 0.0f, f2, 0.0f, true, 10));
                }

                public static O1ooiI111i I0010o(O1ooiI111i o1ooiI111i) {
/* 1 */             II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 27 */            return o1ooiI111i.I0000O(O0000Ioio00.I0000O(iI0O000iIl, iI0O000iIl) ? I0001Ioi1lo : O0000Ioio00.I0000O(iI0O000iIl, i1O01oOIoI0I.I00ll1) ? I000II : iO1OlI011Oo1.I00000oIO(iI0O000iIl));
                }

                public static O1ooiI111i I00111O(O1ooiI111i o1ooiI111i, II0O01li0 iI0O01li0, int i) {
/* 1 */             II0O01li0 iI0O01li02 = i1O01oOIoI0I.I00io1l;
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 iI0O01li0 = iI0O01li02;
                    }
/* 32 */            return o1ooiI111i.I0000O(iI0O01li0.equals(iI0O01li02) ? I000O01llI0 : iI0O01li0.equals(i1O01oOIoI0I.I00iiO) ? I000OOo1O : iO1OlI011Oo1.I00000oOI(iI0O01li0));
                }

                public static O1ooiI111i I001IIilI0O(O1ooiI111i o1ooiI111i) {
/* 1 */             II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0l1o1o0;
/* 27 */            return o1ooiI111i.I0000O(O0000Ioio00.I0000O(iI0IlloOiO0i, iI0IlloOiO0i) ? I0000O : O0000Ioio00.I0000O(iI0IlloOiO0i, i1O01oOIoI0I.I00o0iI0io1) ? I0000oI00 : iO1OlI011Oo1.I0000Il00O(iI0IlloOiO0i));
                }
            }
