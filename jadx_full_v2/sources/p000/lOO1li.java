            package p000;

            import java.util.ArrayDeque;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class lOO1li {
                public static final String I00000oIO(Illlil illlil) {
                    OI1Iio0ii1 oI1Iio0ii1;
/* 13 */            IIiO00o1o iIiO00o1oI00000oOI = O0i1lI0o1io.I001l0I00(illlil) ? I00000oOI(illlil) : null;
/* 14 */            if (iIiO00o1oI00000oOI != null) {
/* 16 */                IIiO00o1o iIiO00o1oI000OOo1O = IiOiOOIo.I000OOo1O(iIiO00o1oI00000oOI);
/* 22 */                if (iIiO00o1oI000OOo1O instanceof OOOO01l) {
/* 24 */                    O0i1lI0o1io.I001l0I00(iIiO00o1oI000OOo1O);
/* 33 */                    IIiO00o1o iIiO00o1oI00000oOI2 = IiOiOOIo.I00000oOI(IiOiOOIo.I000OOo1O(iIiO00o1oI000OOo1O), I0ollliOo0.I00oII);
/* 37 */                    if (iIiO00o1oI00000oOI2 != null && (oI1Iio0ii1 = (OI1Iio0ii1) IIIOooO0ol.I00000oIO.get(IiOiOOIo.I000II(iIiO00o1oI00000oOI2))) != null) {
/* 54 */                        return oI1Iio0ii1.I00000oOI();
                            }
                        } else if (iIiO00o1oI000OOo1O instanceof Ol0IioOo) {
/* 63 */                    int i = IIIOoO.I000l1;
/* 67 */                    LinkedHashMap linkedHashMap = OlIIlo.I000OOo1O;
/* 69 */                    String strI00000oOI = l1OOo1o1l.I00000oOI((Ol0IioOo) iIiO00o1oI000OOo1O);
/* 81 */                    OI1Iio0ii1 oI1Iio0ii12 = strI00000oOI == null ? null : (OI1Iio0ii1) linkedHashMap.get(strI00000oOI);
/* 83 */                    if (oI1Iio0ii12 != null) {
/* 85 */                        return oI1Iio0ii12.I00000oOI();
                            }
                        }
                    }
/* 5 */             return null;
                }

                public static final IIiO00o1o I00000oOI(IIiO00o1o iIiO00o1o) {
/* 11 */            if (!OlIIlo.I000OiO.contains(iIiO00o1o.getName()) && !IIIOooO0ol.I0000O.contains(IiOiOOIo.I000OOo1O(iIiO00o1o).getName())) {
/* 50 */                return null;
                    }
/* 32 */            if ((iIiO00o1o instanceof OOOO01l) || (iIiO00o1o instanceof OOOIoo1o1)) {
/* 54 */                return IiOiOOIo.I00000oOI(iIiO00o1o, OOo1l011.I00oli);
                    }
/* 41 */            if (iIiO00o1o instanceof Ol0IioOo) {
/* 45 */                return IiOiOOIo.I00000oOI(iIiO00o1o, OOo1l011.I00oliIiO01i);
                    }
/* 50 */            return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
                
                    if (r6 == null) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
                
                    return !p000.O0i1lI0o1io.I001l0I00(r13);
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I0000Il00O(OI000ilOol oI000ilOol, IIiO00o1o iIiO00o1o) {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = ((OI000ilOol) iIiO00o1o.I000lI()).I00Ol10();
/* 11 */            OI000ilOol oI000ilOolI000OOo1O = IiOiIO0i1Oil.I000OOo1O(oI000ilOol);
/* 16 */            while (oI000ilOolI000OOo1O != null) {
/* 20 */                if (!(oI000ilOolI000OOo1O instanceof O0l1i0l)) {
/* 22 */                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol102 = oI000ilOolI000OOo1O.I00Ol10();
/* 28 */                    if (ol0O0iI0l0OI00Ol102 == null) {
/* 336 */                       OIiilo1Ool0o.I000l1("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"});
/* 15 */                        return false;
                            }
/* 32 */                    ArrayDeque arrayDeque = new ArrayDeque();
/* 37 */                    Ooioo0o1l0 ooioo0o1l0I000O01llI0 = null;
/* 41 */                    arrayDeque.add(new OliOilOO0i(ol0O0iI0l0OI00Ol102, null));
/* 44 */                    OoOIOoO1I ooOIOoO1II00iOIl = ol0O0iI0l0OI00Ol10.I00iOIl();
                            while (true) {
/* 52 */                        if (arrayDeque.isEmpty()) {
                                    break;
                                }
/* 58 */                        OliOilOO0i oliOilOO0i = (OliOilOO0i) arrayDeque.poll();
/* 60 */                        O0iIl1 o0iIl1I0001Ioi1lo = oliOilOO0i.I00000oIO;
/* 62 */                        OoOIOoO1I ooOIOoO1II00iOIl2 = o0iIl1I0001Ioi1lo.I00iOIl();
/* 66 */                        if (ooOIOoO1II00iOIl2 == null) {
/* 307 */                           lOoi00O.I00000oIO(3);
/* 310 */                           throw null;
                                }
/* 68 */                        if (ooOIOoO1II00iOIl == null) {
/* 303 */                           lOoi00O.I00000oIO(4);
/* 306 */                           throw null;
                                }
/* 74 */                        if (ooOIOoO1II00iOIl2.equals(ooOIOoO1II00iOIl)) {
/* 76 */                            boolean zI00iiI = o0iIl1I0001Ioi1lo.I00iiI();
/* 82 */                            for (OliOilOO0i oliOilOO0i2 = oliOilOO0i.I00000oOI; oliOilOO0i2 != null; oliOilOO0i2 = oliOilOO0i2.I00000oOI) {
/* 84 */                                O0iIl1 o0iIl1 = oliOilOO0i2.I00000oIO;
/* 86 */                                List listI00OIl = o0iIl1.I00OIl();
/* 92 */                                boolean z = listI00OIl instanceof Collection;
/* 94 */                                i1O01oOIoI0I i1o01ooioi0i = OoOIlIi1.I00000oOI;
/* 96 */                                if (z && listI00OIl.isEmpty()) {
/* 185 */                                   o0iIl1I0001Ioi1lo = new OoOilII0(i1o01ooioi0i.I000O01llI0(o0iIl1.I00iOIl(), o0iIl1.I00OIl())).I0001Ioi1lo(o0iIl1I0001Ioi1lo, Ooo0Ioii0o0.I00iiO);
                                        } else {
/* 108 */                                   Iterator it = listI00OIl.iterator();
/* 116 */                                   while (it.hasNext()) {
/* 124 */                                       Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO = ((OoOi1Ol) it.next()).I00000oIO();
/* 128 */                                       Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 130 */                                       if (ooo0Ioii0o0I00000oIO != ooo0Ioii0o0) {
/* 163 */                                           o0iIl1I0001Ioi1lo = (O0iIl1) iOl0o00I.I00000oIO(new OoOilII0(iOl0oOOO1.I00000oOI(i1o01ooioi0i.I000O01llI0(o0iIl1.I00iOIl(), o0iIl1.I00OIl()))).I0001Ioi1lo(o0iIl1I0001Ioi1lo, ooo0Ioii0o0)).I00000oOI;
                                                    break;
                                                }
                                            }
/* 185 */                                   o0iIl1I0001Ioi1lo = new OoOilII0(i1o01ooioi0i.I000O01llI0(o0iIl1.I00iOIl(), o0iIl1.I00OIl())).I0001Ioi1lo(o0iIl1I0001Ioi1lo, Ooo0Ioii0o0.I00iiO);
                                        }
/* 200 */                               zI00iiI = zI00iiI || o0iIl1.I00iiI();
                                    }
/* 204 */                           OoOIOoO1I ooOIOoO1II00iOIl3 = o0iIl1I0001Ioi1lo.I00iOIl();
/* 208 */                           if (ooOIOoO1II00iOIl3 == null) {
/* 269 */                               lOoi00O.I00000oIO(3);
/* 272 */                               throw null;
                                    }
/* 214 */                           if (!ooOIOoO1II00iOIl3.equals(ooOIOoO1II00iOIl)) {
/* 268 */                               throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + li1IIilIo1.I00000oIO(ooOIOoO1II00iOIl3) + ", \n\nsupertype: " + li1IIilIo1.I00000oIO(ooOIOoO1II00iOIl) + " \n" + ooOIOoO1II00iOIl3.equals(ooOIOoO1II00iOIl));
                                    }
/* 216 */                           ooioo0o1l0I000O01llI0 = OoOilo0Oliii.I000O01llI0(o0iIl1I0001Ioi1lo, zI00iiI);
                                } else {
/* 277 */                           Iterator it2 = ooOIOoO1II00iOIl2.I0000oI00().iterator();
/* 285 */                           while (it2.hasNext()) {
/* 298 */                               arrayDeque.add(new OliOilOO0i((O0iIl1) it2.next(), oliOilOO0i));
                                    }
                                }
                            }
                        }
/* 340 */               oI000ilOolI000OOo1O = IiOiIO0i1Oil.I000OOo1O(oI000ilOolI000OOo1O);
                    }
/* 15 */            return false;
                }
            }
