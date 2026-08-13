            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.Collections;
            
            public abstract class il101lI0looi {
                /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IIiOlII I00000oIO(IiO1ol0i10 iiO1ol0i10, boolean z) throws NoSuchMethodException, SecurityException {
                    O0I1IIl1i0oo o0I1IIl1i0oo;
                    Method method;
                    IIiOlII iIiii0lI;
                    O0III0iooOOi o0III0iooOOi;
                    Method methodI001lllioOl;
/* 13 */            if (O0IiOio0lo0.I00iOIl.I0000O(iiO1ol0i10.I00IOO().I00l0OO0IO)) {
/* 15 */                return Oo10ill.I00000oIO;
                    }
/* 18 */            IOIOill iOIOill = OiII0lO1i1.I00000oIO;
/* 28 */            l0OOiIiiO0 l0ooiiiio0I00000oOI = OiII0lO1i1.I00000oOI(iiO1ol0i10.I00IOO().I001lloI());
/* 36 */            if (l0ooiiiio0I00000oOI instanceof O0II0l) {
/* 38 */                O0II0l o0II0l = (O0II0l) l0ooiiiio0I00000oOI;
/* 40 */                OI1IlOlol oI1IlOlol = o0II0l.I0000O;
/* 42 */                O0IIO0lO o0IIO0lO = o0II0l.I0000Il00O;
/* 44 */                if (z) {
/* 55 */                    o0III0iooOOi = o0IIO0lO.I000OOo1O() ? o0IIO0lO.I00ilI0I1 : null;
/* 91 */                    methodI001lllioOl = o0III0iooOOi == null ? iiO1ol0i10.I00IOO().I00ioIO.I001lllioOl(oI1IlOlol.getString(o0III0iooOOi.I00iiO), oI1IlOlol.getString(o0III0iooOOi.I00iio)) : null;
/* 92 */                    if (methodI001lllioOl == null) {
/* 347 */                       iIiii0lI = !Modifier.isStatic(methodI001lllioOl.getModifiers()) ? lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiii0lI(I0000O(iiO1ol0i10), methodI001lllioOl) : new IIil1I01iI(methodI001lllioOl, 0) : iiO1ol0i10.I00IOO().I001lloI().getAnnotations().I001l0I00(Oolli0oi0.I00000oIO) ? lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiil1l0i(methodI001lllioOl) : new IIil1I01iI(methodI001lllioOl) : lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiio1(methodI001lllioOl, false, I0000O(iiO1ol0i10)) : new IIil1I01iI(methodI001lllioOl, 2);
                            } else if (Ioll0il1OI.I0000O(iiO1ol0i10.I00IOO().I001lloI()) && O0000Ioio00.I0000O(iiO1ol0i10.I00IOO().I001lloI().I000OiO(), IiOiioI.I0000O)) {
/* 140 */                       Class clsI000II = li1O10Oli1i1.I000II(iiO1ol0i10.I00IOO().I001lloI().I000lI());
/* 144 */                       if (clsI000II == null) {
/* 225 */                           throw new Ii01OOool("Underlying property of inline class " + iiO1ol0i10.I00IOO() + " should have a field");
                                }
/* 154 */                       Method methodI0000O = li1O10Oli1i1.I0000O(clsI000II, iiO1ol0i10.I00IOO().I001lloI());
/* 162 */                       if (lIll0lII1.I00000oIO(iiO1ol0i10)) {
/* 166 */                           Object objI0000O = I0000O(iiO1ol0i10);
/* 172 */                           Iooll1 iooll1 = new Iooll1(methodI0000O, Il01100l.I00iOIl);
/* 175 */                           iooll1.I0000O = objI0000O;
/* 177 */                           VarHandle.storeStoreFence();
                                    iIiii0lI = iooll1;
                                } else {
/* 192 */                           iIiii0lI = new IoollilI(methodI0000O, Collections.singletonList(methodI0000O.getDeclaringClass()));
                                }
                            } else {
/* 236 */                       Field field = (Field) iiO1ol0i10.I00IOO().I00ll1.getValue();
/* 238 */                       if (field == null) {
/* 252 */                           IOOlIIilOl0.I000OOo1O("No accessors or field is found for property ", iiO1ol0i10.I00IOO());
/* 35 */                            return null;
                                }
/* 240 */                       iIiii0lI = I00000oOI(iiO1ol0i10, z, field);
                            }
                        } else {
/* 62 */                    if ((o0IIO0lO.I00iiI & 8) == 8) {
/* 64 */                        o0III0iooOOi = o0IIO0lO.I00ilO0;
                            }
/* 91 */                    if (o0III0iooOOi == null) {
                            }
/* 92 */                    if (methodI001lllioOl == null) {
                            }
                        }
                    } else if (l0ooiiiio0I00000oOI instanceof O0I1oo) {
/* 359 */               iIiii0lI = I00000oOI(iiO1ol0i10, z, ((O0I1oo) l0ooiiiio0I00000oOI).I00000oIO);
                    } else {
/* 366 */               if (!(l0ooiiiio0I00000oOI instanceof O0II000oIi)) {
/* 421 */                   if (!(l0ooiiiio0I00000oOI instanceof O0II0lI)) {
/* 503 */                       I000II.I00000oIO();
/* 35 */                        return null;
                            }
/* 423 */                   if (z) {
/* 427 */                       o0I1IIl1i0oo = ((O0II0lI) l0ooiiiio0I00000oOI).I00000oIO;
                            } else {
/* 432 */                       o0I1IIl1i0oo = ((O0II0lI) l0ooiiiio0I00000oOI).I00000oOI;
/* 434 */                       if (o0I1IIl1i0oo == null) {
/* 499 */                           IOOlIIilOl0.I000OOo1O("No setter found for property ", iiO1ol0i10.I00IOO());
/* 35 */                            return null;
                                }
                            }
/* 440 */                   O0IiOio0lo0 o0IiOio0lo0 = iiO1ol0i10.I00IOO().I00ioIO;
/* 442 */                   O0I1Ii1l0 o0I1Ii1l0 = o0I1IIl1i0oo.I00000oIO;
/* 448 */                   Method methodI001lllioOl2 = o0IiOio0lo0.I001lllioOl(o0I1Ii1l0.I00000oOI, o0I1Ii1l0.I0000Il00O);
/* 452 */                   if (methodI001lllioOl2 != null) {
/* 458 */                       Modifier.isStatic(methodI001lllioOl2.getModifiers());
                                return lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiii0lI(I0000O(iiO1ol0i10), methodI001lllioOl2) : new IIil1I01iI(methodI001lllioOl2, 0);
                            }
/* 489 */                   IOOlIIilOl0.I000OOo1O("No accessor found for property ", iiO1ol0i10.I00IOO());
/* 35 */                    return null;
                        }
/* 368 */               if (z) {
/* 372 */                   method = ((O0II000oIi) l0ooiiiio0I00000oOI).I00000oIO;
                        } else {
/* 375 */                   O0II000oIi o0II000oIi = (O0II000oIi) l0ooiiiio0I00000oOI;
/* 377 */                   method = o0II000oIi.I00000oOI;
/* 379 */                   if (method == null) {
/* 415 */                       IOOlIIilOl0.I000OOo1O("No source found for setter of Java method property: ", o0II000oIi.I00000oIO);
/* 35 */                        return null;
                            }
                        }
/* 399 */               iIiii0lI = lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiii0lI(I0000O(iiO1ol0i10), method) : new IIil1I01iI(method, 0);
                    }
/* 406 */           return li1O10Oli1i1.I00000oOI(iIiii0lI, iiO1ol0i10.I00IO1oi11O(), false);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IIil1l I00000oOI(IiO1ol0i10 iiO1ol0i10, boolean z, Field field) {
/* 5 */             OOOO01l oOOO01lI001lloI = iiO1ol0i10.I00IOO().I001lloI();
/* 9 */             Ii1Ool1 ii1Ool1I000lI = oOOO01lI001lloI.I000lI();
/* 19 */            if (IiOiIO0i1Oil.I000iOII(ii1Ool1I000lI)) {
/* 22 */                Ii1Ool1 ii1Ool1I000lI2 = ii1Ool1I000lI.I000lI();
/* 32 */                if ((IiOiIO0i1Oil.I000l1(ii1Ool1I000lI2, IOIOllO1oli.I00iiI) || IiOiIO0i1Oil.I000l1(ii1Ool1I000lI2, IOIOllO1oli.I00ilI0I1)) && (!(oOOO01lI001lloI instanceof IiOo1oO101oi) || !O0IO00o0OI0.I0000O(((IiOo1oO101oi) oOOO01lI001lloI).I00oo1iO0ll))) {
                        }
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        return iiO1ol0i10.I00IOO().I001lloI().getAnnotations().I001l0I00(Oolli0oi0.I00000oIO) ? z ? lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiOoOOoOO(field, false) : new IIiOoioio0(field, true, 1) : lIll0lII1.I00000oIO(iiO1ol0i10) ? new IIiiIoOll1I(field, I0000Il00O(iiO1ol0i10), false) : new IIiiOO0i11(field, I0000Il00O(iiO1ol0i10), true, 1) : z ? new IIiOoioio0(field, false, 2) : new IIiiOO0i11(field, I0000Il00O(iiO1ol0i10), false, 2);
                    }
/* 67 */            if (z) {
/* 73 */                if (!lIll0lII1.I00000oIO(iiO1ol0i10)) {
/* 92 */                    return new IIiOoioio0(field, true, 0);
                        }
/* 77 */                Object objI0000O = I0000O(iiO1ol0i10);
/* 81 */                IIiOoO1llO1 iIiOoO1llO1 = new IIiOoO1llO1(field, false);
/* 84 */                iIiOoO1llO1.I0000oI00 = objI0000O;
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                return iIiOoO1llO1;
                    }
/* 100 */           if (!lIll0lII1.I00000oIO(iiO1ol0i10)) {
/* 127 */               return new IIiiOO0i11(field, I0000Il00O(iiO1ol0i10), true, 0);
                    }
/* 104 */           boolean zI0000Il00O = I0000Il00O(iiO1ol0i10);
/* 108 */           Object objI0000O2 = I0000O(iiO1ol0i10);
/* 112 */           IIiiI0Oooo iIiiI0Oooo = new IIiiI0Oooo(field, zI0000Il00O, false);
/* 115 */           iIiiI0Oooo.I000II = objI0000O2;
/* 117 */           VarHandle.storeStoreFence();
/* 120 */           return iIiiI0Oooo;
                }

                public static final boolean I0000Il00O(IiO1ol0i10 iiO1ol0i10) {
/* 17 */            return !OoOilo0Oliii.I0000oI00(iiO1ol0i10.I00IOO().I001lloI().getType());
                }

                public static final Object I0000O(IiO1ol0i10 iiO1ol0i10) {
/* 1 */             IiOO0iilOO1 iiOO0iilOO1I00IOO = iiO1ol0i10.I00IOO();
/* 11 */            return li1O10Oli1i1.I00000oIO(iiOO0iilOO1I00IOO.I00li1OI, iiOO0iilOO1I00IOO.I001lloI());
                }
            }
