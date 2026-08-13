            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.util.AbstractCollection;
            import java.util.AbstractSet;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class O0l1oloIi extends O0lIlO1i {
                public static final int I001IO000 = 0;
                public final OI000ilOol I000o00OoI0I;
                public final OOo1oliI I000oI1ioi;
                public final boolean I00100l0;
                public final O1I0II11i I00100o1O0lo;
                public final O1I0II11i I0010I0i;
                public final O1I0II11i I0010o;
                public final O1I0II11i I00111O;
                public final I1ooIoloo0 I001IIilI0O;

                public O0l1oloIi(o01l1ioOo0 o01l1iooo0, OI000ilOol oI000ilOol, OOo1oliI oOo1oliI, boolean z, O0l1oloIi o0l1oloIi) {
/* 1 */             super(o01l1iooo0, o0l1oloIi);
/* 4 */             this.I000o00OoI0I = oI000ilOol;
/* 6 */             this.I000oI1ioi = oOo1oliI;
/* 8 */             this.I00100l0 = z;
/* 16 */            O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO;
/* 22 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(21);
/* 25 */            i01illiil1Oo.I00iiO = this;
/* 27 */            i01illiil1Oo.I00iiI = o01l1iooo0;
/* 29 */            VarHandle.storeStoreFence();
/* 37 */            this.I00100o1O0lo = new O1I0II11i(o1I0OloI, i01illiil1Oo);
/* 41 */            int i = 0;
/* 42 */            O0l1iillll0 o0l1iillll0 = new O0l1iillll0(i);
/* 45 */            o0l1iillll0.I00iiI = this;
/* 47 */            VarHandle.storeStoreFence();
/* 55 */            this.I0010I0i = new O1I0II11i(o1I0OloI, o0l1iillll0);
/* 59 */            O0l1iloO o0l1iloO = new O0l1iloO(i);
/* 62 */            o0l1iloO.I00iiI = o01l1iooo0;
/* 64 */            VarHandle.storeStoreFence();
/* 72 */            this.I0010o = new O1I0II11i(o1I0OloI, o0l1iloO);
/* 77 */            O0l1iillll0 o0l1iillll02 = new O0l1iillll0(1);
/* 80 */            o0l1iillll02.I00iiI = this;
/* 82 */            VarHandle.storeStoreFence();
/* 90 */            this.I00111O = new O1I0II11i(o1I0OloI, o0l1iillll02);
/* 96 */            I01i01OoI i01i01OoI = new I01i01OoI(15);
/* 99 */            i01i01OoI.I00iiI = this;
/* 101 */           i01i01OoI.I00iiO = o01l1iooo0;
/* 103 */           VarHandle.storeStoreFence();
/* 110 */           this.I001IIilI0O = o1I0OloI.I0000Il00O(i01i01OoI);
                }

                public static Ol0IioOo I001iOo1i0O(Ol0IioOo ol0IioOo, Illlil illlil, AbstractCollection abstractCollection) {
/* 5 */             if (abstractCollection.isEmpty()) {
/* 215 */               return ol0IioOo;
                    }
/* 8 */             Iterator it = abstractCollection.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                Ol0IioOo ol0IioOo2 = (Ol0IioOo) it.next();
/* 28 */                if (!ol0IioOo.equals(ol0IioOo2) && ol0IioOo2.I00ooIo0 == null && I001lllioOl(ol0IioOo2, illlil)) {
/* 52 */                    return (Ol0IioOo) ol0IioOo.I00iio().I000oI1ioi().build();
                        }
                    }
/* 215 */           return ol0IioOo;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Ol0IioOo I001l0I00(Ol0IioOo ol0IioOo) {
/* 9 */             Ooo00oi0O ooo00oi0O = (Ooo00oi0O) IOOi0Ool1i.I00IoIO0lI(ol0IioOo.I00Iooi00oi());
/* 12 */            if (ooo00oi0O != null) {
/* 22 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooo00oi0O.getType().I00iOIl().I00100o1O0lo();
/* 26 */                if (iOIiO1lIl0lI00100o1O0lo != null) {
/* 28 */                    int i = IiOiOOIo.I00000oIO;
/* 30 */                    Ill0OI0lo ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo);
/* 38 */                    if (!ill0OI0loI0001Ioi1lo.I0000O()) {
/* 41 */                        ill0OI0loI0001Ioi1lo = null;
                            }
/* 49 */                    Ill0IO ill0IOI000OOo1O = ill0OI0loI0001Ioi1lo != null ? ill0OI0loI0001Ioi1lo.I000OOo1O() : null;
/* 56 */                    if (!O0000Ioio00.I0000O(ill0IOI000OOo1O, OlIlllOI1.I000II)) {
/* 59 */                        ooo00oi0O = null;
                            }
/* 60 */                    if (ooo00oi0O != null) {
/* 106 */                       Ol0IioOo ol0IioOo2 = (Ol0IioOo) ol0IioOo.I00iio().I00000oIO(IOOi0Ool1i.I001l0I00(ol0IioOo.I00Iooi00oi())).I000o00OoI0I(((OoOi1Ol) ooo00oi0O.getType().I00OIl().get(0)).I00000oOI()).build();
/* 108 */                       if (ol0IioOo2 != null) {
/* 111 */                           ol0IioOo2.I00oO101o = true;
                                }
/* 113 */                       return ol0IioOo2;
                            }
                        }
                    }
/* 11 */            return null;
                }

                public static boolean I001lllioOl(Illlil illlil, Illlil illlil2) {
                    return OIlIlOllioi.I0000Il00O.I000o00OoI0I(illlil2, illlil, true).I00000oOI() == 1 && !l01II1ii.I00000oIO(illlil2, illlil);
                }

                public static boolean I001lloI(Ol0IioOo ol0IioOo, Ol0IioOo ol0IioOo2) {
/* 1 */             int i = IIIOoO.I000l1;
/* 17 */            if (O0000Ioio00.I0000O(ol0IioOo.getName().I00000oOI(), "removeAt") && O0000Ioio00.I0000O(l1OOo1o1l.I00000oOI(ol0IioOo), OlIIlo.I000II.I0000oI00)) {
/* 33 */                ol0IioOo2 = ol0IioOo2.I00000oIO();
                    }
/* 37 */            return I001lllioOl(ol0IioOo2, ol0IioOo);
                }

                public static Ol0IioOo I00II0Ol1O0l(OOOO01l oOOO01l, String str, Function1 function1) {
                    Ol0IioOo ol0IioOo;
/* 11 */            Iterator it = ((Iterable) function1.invoke(OI1Iio0ii1.I0000oI00(str))).iterator();
/* 58 */            do {
/* 19 */                ol0IioOo = null;
/* 20 */                if (!it.hasNext()) {
                            break;
                        }
/* 26 */                Ol0IioOo ol0IioOo2 = (Ol0IioOo) it.next();
/* 36 */                if (ol0IioOo2.I00Iooi00oi().size() == 0) {
/* 39 */                    OIIil1l0IioO oIIil1l0IioO = O0iIo00.I00000oIO;
/* 41 */                    O0iIl1 o0iIl1 = ol0IioOo2.I00io1l;
/* 55 */                    if (o0iIl1 == null ? false : oIIil1l0IioO.I00000oOI(o0iIl1, oOOO01l.getType())) {
/* 57 */                        ol0IioOo = ol0IioOo2;
                            }
                        }
/* 58 */            } while (ol0IioOo == null);
/* 215 */           return ol0IioOo;
                }

                public static Ol0IioOo I00IO1(OOOO01l oOOO01l, Function1 function1) {
                    Ol0IioOo ol0IioOo;
                    O0iIl1 o0iIl1;
/* 5 */             String strI00000oOI = oOOO01l.getName().I00000oOI();
/* 41 */            Iterator it = ((Iterable) function1.invoke(OI1Iio0ii1.I0000oI00("set".concat(O0I00o0.I00000oOI(strI00000oOI) ? strI00000oOI.substring(2) : iOl0l0o0o.I00000oIO(strI00000oOI))))).iterator();
/* 113 */           do {
/* 49 */                ol0IioOo = null;
/* 50 */                if (!it.hasNext()) {
                            break;
                        }
/* 56 */                Ol0IioOo ol0IioOo2 = (Ol0IioOo) it.next();
/* 67 */                if (ol0IioOo2.I00Iooi00oi().size() == 1 && (o0iIl1 = ol0IioOo2.I00io1l) != null) {
/* 75 */                    OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 83 */                    if (O0i1lI0o1io.I00II0Ol1O0l(o0iIl1, OlIllOO11lOl.I0000O) && O0iIo00.I00000oIO.I00000oIO(((Ooo00oi0O) IOOi0Ool1i.I00OilO00Il(ol0IioOo2.I00Iooi00oi())).getType(), oOOO01l.getType())) {
/* 112 */                       ol0IioOo = ol0IioOo2;
                            }
                        }
/* 113 */           } while (ol0IioOo == null);
/* 551 */           return ol0IioOo;
                }

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             Object obj = this.I00000oOI.I00iOIl;
/* 5 */             return super.I00000oIO(oI1Iio0ii1, oIIl0iOOlo);
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    I1ooIoloo0 i1ooIoloo0;
                    OI000ilOol oI000ilOol;
/* 3 */             Object obj = this.I00000oOI.I00iOIl;
/* 7 */             O0l1oloIi o0l1oloIi = (O0l1oloIi) this.I0000Il00O;
                    return (o0l1oloIi == null || (i1ooIoloo0 = o0l1oloIi.I001IIilI0O) == null || (oI000ilOol = (OI000ilOol) i1ooIoloo0.invoke(oI1Iio0ii1)) == null) ? (IOIiO1lIl0l) this.I001IIilI0O.invoke(oI1Iio0ii1) : oI000ilOol;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             Object obj = this.I00000oOI.I00iOIl;
/* 5 */             return super.I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo);
                }

                @Override
                public final Set I000O01llI0(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 23 */            return Oio0lI.I0000oI00((Set) this.I0010I0i.invoke(), ((Map) this.I00111O.invoke()).keySet());
                }

                @Override
                public final Set I000OOo1O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 7 */             Collection collectionI0000oI00 = this.I000o00OoI0I.I000OOo1O().I0000oI00();
/* 15 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 18 */            Iterator it = collectionI0000oI00.iterator();
/* 26 */            while (it.hasNext()) {
/* 44 */                IOOii0O10Io0.I00100l0(linkedHashSet, ((O0iIl1) it.next()).I00IoiI().I00000oOI());
                    }
/* 48 */            O1I0II11i o1I0II11i = this.I0000oI00;
/* 62 */            linkedHashSet.addAll(((Ii1i1O0lI) o1I0II11i.invoke()).I00000oIO());
/* 77 */            linkedHashSet.addAll(((Ii1i1O0lI) o1I0II11i.invoke()).I0000oI00());
/* 84 */            linkedHashSet.addAll(I000O01llI0(iiOOioIIO0, function1));
/* 89 */            Object obj = this.I00000oOI.I00iOIl;
/* 96 */            linkedHashSet.addAll(new ArrayList());
/* 551 */           return linkedHashSet;
                }

                @Override
                public final void I000OiO(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) throws Throwable {
/* 7 */             boolean zI000II = this.I000oI1ioi.I000II();
/* 11 */            o01l1ioOo0 o01l1iooo0 = this.I00000oOI;
/* 13 */            if (zI000II) {
/* 15 */                O1I0II11i o1I0II11i = this.I0000oI00;
/* 27 */                if (((Ii1i1O0lI) o1I0II11i.invoke()).I00000oOI(oI1Iio0ii1) != null) {
/* 33 */                    if (arrayList.isEmpty()) {
/* 69 */                        OOoIlIOlOI oOoIlIOlOII00000oOI = ((Ii1i1O0lI) o1I0II11i.invoke()).I00000oOI(oI1Iio0ii1);
/* 88 */                        O00loo1i111O o00loo1i111OI011IOil = O00loo1i111O.I011IOil(this.I000o00OoI0I, l0oOo1lI000l.I00000oIO(o01l1iooo0, oOoIlIOlOII00000oOI), oOoIlIOlOII00000oOI.I0000Il00O(), l1I0oI.I000OiO(oOoIlIOlOII00000oOI), true);
/* 109 */                       O0iIl1 o0iIl1I001lloI = ((iOliil) o01l1iooo0.I00iio).I001lloI(oOoIlIOlOII00000oOI.I0001Ioi1lo(), l01ill.I00000oIO(OoOilOl1.I00iiI, false, null, 6));
/* 113 */                       O0ioOi0Oo1ii o0ioOi0Oo1iiI000oI1ioi = I000oI1ioi();
/* 119 */                       O1oIIloii0.I00iOIl.getClass();
/* 122 */                       O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00iio;
/* 124 */                       IiOiOloo0 iiOiOloo0 = IiOiioI.I0000oI00;
/* 129 */                       Il01100l il01100l = Il01100l.I00iOIl;
/* 133 */                       o00loo1i111OI011IOil.I011IO1I11OI(null, o0ioOi0Oo1iiI000oI1ioi, il01100l, il01100l, il01100l, o0iIl1I001lloI, o1oIIloii0, iiOiOloo0, null);
/* 136 */                       o00loo1i111OI011IOil.I00oooO = 1;
/* 140 */                       arrayList.add(o00loo1i111OI011IOil);
                            } else {
/* 36 */                        Iterator it = arrayList.iterator();
/* 44 */                        while (it.hasNext()) {
/* 60 */                            if (((Ol0IioOo) it.next()).I00Iooi00oi().isEmpty()) {
                                        break;
                                    }
                                }
/* 69 */                        OOoIlIOlOI oOoIlIOlOII00000oOI2 = ((Ii1i1O0lI) o1I0II11i.invoke()).I00000oOI(oI1Iio0ii1);
/* 88 */                        O00loo1i111O o00loo1i111OI011IOil2 = O00loo1i111O.I011IOil(this.I000o00OoI0I, l0oOo1lI000l.I00000oIO(o01l1iooo0, oOoIlIOlOII00000oOI2), oOoIlIOlOII00000oOI2.I0000Il00O(), l1I0oI.I000OiO(oOoIlIOlOII00000oOI2), true);
/* 109 */                       O0iIl1 o0iIl1I001lloI2 = ((iOliil) o01l1iooo0.I00iio).I001lloI(oOoIlIOlOII00000oOI2.I0001Ioi1lo(), l01ill.I00000oIO(OoOilOl1.I00iiI, false, null, 6));
/* 113 */                       O0ioOi0Oo1ii o0ioOi0Oo1iiI000oI1ioi2 = I000oI1ioi();
/* 119 */                       O1oIIloii0.I00iOIl.getClass();
/* 122 */                       O1oIIloii0 o1oIIloii02 = O1oIIloii0.I00iio;
/* 124 */                       IiOiOloo0 iiOiOloo02 = IiOiioI.I0000oI00;
/* 129 */                       Il01100l il01100l2 = Il01100l.I00iOIl;
/* 133 */                       o00loo1i111OI011IOil2.I011IO1I11OI(null, o0ioOi0Oo1iiI000oI1ioi2, il01100l2, il01100l2, il01100l2, o0iIl1I001lloI2, o1oIIloii02, iiOiOloo02, null);
/* 136 */                       o00loo1i111OI011IOil2.I00oooO = 1;
/* 140 */                       arrayList.add(o00loo1i111OI011IOil2);
                            }
                        }
                    }
/* 143 */           Object obj = o01l1iooo0.I00iOIl;
                }

                @Override
                public final Ii1i1O0lI I000iOII() {
/* 7 */             return new IOIO1iII(this.I000oI1ioi, IiOi0I1.I00o101lO);
                }

                @Override
                public final void I000l1(LinkedHashSet linkedHashSet, OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             LinkedHashSet linkedHashSetI00IO1oi11O = I00IO1oi11O(oI1Iio0ii1);
/* 11 */            if (!OlIIlo.I000OiO.contains(oI1Iio0ii1)) {
/* 13 */                int i = IIIOol.I000l1;
/* 21 */                if (!OlIIlo.I0000oI00.contains(oI1Iio0ii1)) {
/* 27 */                    if (!linkedHashSetI00IO1oi11O.isEmpty()) {
/* 30 */                        Iterator it = linkedHashSetI00IO1oi11O.iterator();
/* 38 */                        while (it.hasNext()) {
/* 50 */                            if (((Illlil) it.next()).I00100l0()) {
                                    }
                                }
                            }
/* 55 */                    ArrayList arrayList = new ArrayList();
/* 66 */                    for (Object obj : linkedHashSetI00IO1oi11O) {
/* 79 */                        if (I00IioO0OiOi((Ol0IioOo) obj)) {
/* 81 */                            arrayList.add(obj);
                                }
                            }
/* 86 */                    I001IO000(linkedHashSet, oI1Iio0ii1, arrayList, false);
/* 89 */                    return;
                        }
                    }
/* 92 */            Ol1OI1II0ll ol1OI1II0ll = new Ol1OI1II0ll();
/* 116 */           LinkedHashSet linkedHashSetI0000O = il10lII0iIi.I0000O(oI1Iio0ii1, linkedHashSetI00IO1oi11O, Il01100l.I00iOIl, this.I000o00OoI0I, Il0oiOlO1ooI.I000oI1ioi, ((OIIil1l0IioO) ((OIIiioOilI) ((I0l1OOl1l10) this.I00000oOI.I00iOIl).I000l1)).I0000O);
/* 127 */           Class<O0l1oloIi> cls = O0l1oloIi.class;
/* 145 */           I001i1O0Ol(oI1Iio0ii1, linkedHashSet, linkedHashSetI0000O, linkedHashSet, new I00oII(1, this, cls, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 11));
/* 170 */           I001i1O0Ol(oI1Iio0ii1, linkedHashSet, linkedHashSetI0000O, ol1OI1II0ll, new I00oII(1, this, cls, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 12));
/* 175 */           ArrayList arrayList2 = new ArrayList();
/* 186 */           for (Object obj2 : linkedHashSetI00IO1oi11O) {
/* 199 */               if (I00IioO0OiOi((Ol0IioOo) obj2)) {
/* 201 */                   arrayList2.add(obj2);
                        }
                    }
/* 210 */           I001IO000(linkedHashSet, oI1Iio0ii1, IOOi0Ool1i.I00O10llo(arrayList2, ol1OI1II0ll), true);
                }

                @Override
                public final void I000lI(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) throws Throwable {
                    OI1Iio0ii1 oI1Iio0ii12;
/* 9 */             boolean zIsAnnotation = this.I000oI1ioi.I00000oIO.isAnnotation();
/* 14 */            o01l1ioOo0 o01l1iooo0 = this.I00000oOI;
/* 17 */            if (zIsAnnotation) {
/* 27 */                oI1Iio0ii12 = oI1Iio0ii1;
/* 39 */                OOoIOiO0 oOoIOiO0 = (OOoIOiO0) IOOi0Ool1i.I00Oio(((Ii1i1O0lI) this.I0000oI00.invoke()).I0000Il00O(oI1Iio0ii12));
/* 41 */                if (oOoIOiO0 != null) {
/* 44 */                    iOloo0O0O ioloo0o0o = O1oIIloii0.I00iOIl;
/* 70 */                    O00o11il o00o11ilI01101olii = O00o11il.I01101olii(this.I000o00OoI0I, l0oOo1lI000l.I00000oIO(o01l1iooo0, oOoIOiO0), li11ilIiI0.I00000oIO(oOoIOiO0.I0000oI00()), false, oOoIOiO0.I0000Il00O(), l1I0oI.I000OiO(oOoIOiO0), false);
/* 76 */                    OOOOI1ioIo oOOOI1ioIoI0000Il00O = il0ol10l.I0000Il00O(o00o11ilI01101olii, i1i0olI.I00iiO);
/* 80 */                    o00o11ilI01101olii.I010l1ol111(oOOOI1ioIoI0000Il00O, null, null, null);
/* 87 */                    o01l1ioOo0 o01l1iooo0I00000oIO = iioIlooliI.I00000oIO(o01l1iooo0, o00o11ilI01101olii, oOoIOiO0, 0, (O0ioIllo0i1) o01l1iooo0.I00iiO);
/* 126 */                   O0iIl1 o0iIl1I001lloI = ((iOliil) o01l1iooo0I00000oIO.I00iio).I001lloI(lIli0ooiOill.I00000oIO(oOoIOiO0.I00000oIO.getGenericReturnType()), l01ill.I00000oIO(OoOilOl1.I00iiI, ((Method) oOoIOiO0.I00000oOI()).getDeclaringClass().isAnnotation(), null, 6));
/* 130 */                   O0ioOi0Oo1ii o0ioOi0Oo1iiI000oI1ioi = I000oI1ioi();
/* 136 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 140 */                   o00o11ilI01101olii.I01101IOlO(o0iIl1I001lloI, il01100l, o0ioOi0Oo1iiI000oI1ioi, null, il01100l);
/* 145 */                   oOOOI1ioIoI0000Il00O.I00lli11 = o0iIl1I001lloI;
/* 147 */                   arrayList.add(o00o11ilI01101olii);
                        }
                    } else {
/* 151 */               oI1Iio0ii12 = oI1Iio0ii1;
                    }
/* 153 */           Set setI00IOO = I00IOO(oI1Iio0ii1);
/* 161 */           if (setI00IOO.isEmpty()) {
/* 163 */               return;
                    }
/* 166 */           Ol1OI1II0ll ol1OI1II0ll = new Ol1OI1II0ll();
/* 171 */           AbstractCollection ol1OI1II0ll2 = new Ol1OI1II0ll();
/* 176 */           O0l1l1IOl o0l1l1IOl = new O0l1l1IOl(0);
/* 179 */           o0l1l1IOl.I00iiI = this;
/* 181 */           VarHandle.storeStoreFence();
/* 184 */           I001i1lo1io(setI00IOO, arrayList, ol1OI1II0ll, o0l1l1IOl);
/* 187 */           Set setI0000Il00O = Oio0lI.I0000Il00O(setI00IOO, ol1OI1II0ll);
/* 194 */           O0l1l1IOl o0l1l1IOl2 = new O0l1l1IOl(1);
/* 197 */           o0l1l1IOl2.I00iiI = this;
/* 199 */           VarHandle.storeStoreFence();
/* 202 */           I001i1lo1io(setI0000Il00O, ol1OI1II0ll2, null, o0l1l1IOl2);
/* 205 */           LinkedHashSet linkedHashSetI0000oI00 = Oio0lI.I0000oI00(setI00IOO, ol1OI1II0ll2);
/* 211 */           I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 225 */           OI1Iio0ii1 oI1Iio0ii13 = oI1Iio0ii12;
/* 230 */           arrayList.addAll(il10lII0iIi.I0000O(oI1Iio0ii13, linkedHashSetI0000oI00, arrayList, this.I000o00OoI0I, iolOOiI.I00ilO0, ((OIIil1l0IioO) ((OIIiioOilI) i0l1OOl1l10.I000l1)).I0000O));
                }

                @Override
                public final Set I000o00OoI0I() {
/* 9 */             if (this.I000oI1ioi.I00000oIO.isAnnotation()) {
/* 11 */                return I00000oOI();
                    }
/* 32 */            LinkedHashSet linkedHashSet = new LinkedHashSet(((Ii1i1O0lI) this.I0000oI00.invoke()).I0001Ioi1lo());
/* 47 */            Iterator it = this.I000o00OoI0I.I000OOo1O().I0000oI00().iterator();
/* 55 */            while (it.hasNext()) {
/* 73 */                IOOii0O10Io0.I00100l0(linkedHashSet, ((O0iIl1) it.next()).I00IoiI().I000II());
                    }
/* 113 */           return linkedHashSet;
                }

                @Override
                public final O0ioOi0Oo1ii I000oI1ioi() {
/* 1 */             OI000ilOol oI000ilOol = this.I000o00OoI0I;
/* 3 */             if (oI000ilOol != null) {
/* 5 */                 int i = IiOiIO0i1Oil.I00000oIO;
/* 7 */                 return oI000ilOol.I00iiI();
                    }
/* 13 */            IiOiIO0i1Oil.I00000oIO(0);
/* 29 */            throw null;
                }

                @Override
                public final Ii1Ool1 I00100l0() {
/* 1 */             return this.I000o00OoI0I;
                }

                @Override
                public final boolean I00100o1O0lo(O00loo1i111O o00loo1i111O) {
/* 9 */             if (this.I000oI1ioi.I00000oIO.isAnnotation()) {
/* 11 */                return false;
                    }
/* 13 */            return I00IioO0OiOi(o00loo1i111O);
                }

                @Override
                public final O0lIl0li I0010I0i(ArrayList arrayList, O0iIl1 o0iIl1, List list) {
/* 3 */             Object obj = this.I00000oOI.I00iOIl;
/* 15 */            if (this.I000o00OoI0I != null) {
/* 17 */                List list2 = Collections.EMPTY_LIST;
/* 19 */                if (list2 != null) {
/* 23 */                    return new O0lIl0li(o0iIl1, list, arrayList, list2);
                        }
/* 39 */                OIiilo1Ool0o.I000l1("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
/* 42 */                return null;
                    }
/* 44 */            Object[] objArr = new Object[3];
                    switch (1) {
                        case 1:
/* 79 */                    objArr[0] = "owner";
                            break;
                        case 2:
/* 74 */                    objArr[0] = "returnType";
                            break;
                        case 3:
/* 69 */                    objArr[0] = "valueParameters";
                            break;
                        case 4:
/* 64 */                    objArr[0] = "typeParameters";
                            break;
                        case 5:
/* 59 */                    objArr[0] = "descriptor";
                            break;
                        case 6:
/* 54 */                    objArr[0] = "signatureErrors";
                            break;
                        default:
/* 51 */                    objArr[0] = "method";
                            break;
                    }
/* 83 */            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
/* 87 */            objArr[2] = "resolvePropagatedSignature";
/* 98 */            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                public final void I001IIilI0O(ArrayList arrayList, O00l1io11 o00l1io11, int i, OOoIOiO0 oOoIOiO0, O0iIl1 o0iIl1, O0iIl1 o0iIl12) {
/* 5 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 7 */             OI1Iio0ii1 oI1Iio0ii1I0000Il00O = oOoIOiO0.I0000Il00O();
/* 12 */            if (o0iIl1 == null) {
/* 70 */                OoOilo0Oliii.I00000oIO(2);
/* 1294 */              throw null;
                    }
/* 15 */            Ooioo0o1l0 ooioo0o1l0I000O01llI0 = OoOilo0Oliii.I000O01llI0(o0iIl1, false);
/* 23 */            Object defaultValue = oOoIOiO0.I00000oIO.getDefaultValue();
/* 39 */            boolean z = (defaultValue != null ? lIl1l1IolOi.I00000oIO(null, defaultValue) : null) != null;
/* 42 */            Ooioo0o1l0 ooioo0o1l0I000O01llI02 = o0iIl12 != null ? OoOilo0Oliii.I000O01llI0(o0iIl12, false) : null;
/* 49 */            Object obj = this.I00000oOI.I00iOIl;
/* 65 */            arrayList.add(new Ooo00oi0O(o00l1io11, null, i, i11IiIloOo, oI1Iio0ii1I0000Il00O, ooioo0o1l0I000O01llI0, z, false, false, ooioo0o1l0I000O01llI02, l1I0oI.I000OiO(oOoIOiO0)));
                }

                public final void I001IO000(LinkedHashSet linkedHashSet, OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList, boolean z) {
/* 22 */            LinkedHashSet<Ol0IioOo> linkedHashSetI0000O = il10lII0iIi.I0000O(oI1Iio0ii1, arrayList, linkedHashSet, this.I000o00OoI0I, iolOOiI.I00ilO0, ((OIIil1l0IioO) ((OIIiioOilI) ((I0l1OOl1l10) this.I00000oOI.I00iOIl).I000l1)).I0000O);
/* 26 */            if (!z) {
/* 28 */                linkedHashSet.addAll(linkedHashSetI0000O);
/* 31 */                return;
                    }
/* 32 */            ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(linkedHashSet, linkedHashSetI0000O);
/* 44 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(linkedHashSetI0000O, 10));
/* 55 */            for (Ol0IioOo ol0IioOoI001iOo1i0O : linkedHashSetI0000O) {
/* 63 */                IIiO00o1o iIiO00o1oI00000oOI = lOO1li.I00000oOI(ol0IioOoI001iOo1i0O);
/* 67 */                if (iIiO00o1oI00000oOI == null) {
/* 70 */                    int i = IIIOol.I000l1;
/* 88 */                    iIiO00o1oI00000oOI = !OlIIlo.I0000oI00.contains(ol0IioOoI001iOo1i0O.getName()) ? null : IiOiOOIo.I00000oOI(ol0IioOoI001iOo1i0O, OOo1l011.I00oo1iO0ll);
                        }
/* 92 */                Ol0IioOo ol0IioOo = (Ol0IioOo) iIiO00o1oI00000oOI;
/* 94 */                if (ol0IioOo != null) {
/* 97 */                    ol0IioOoI001iOo1i0O = I001iOo1i0O(ol0IioOoI001iOo1i0O, ol0IioOo, arrayListI00O10llo);
                        }
/* 101 */               arrayList2.add(ol0IioOoI001iOo1i0O);
                    }
/* 105 */           linkedHashSet.addAll(arrayList2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001i1O0Ol(OI1Iio0ii1 oI1Iio0ii1, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
                    Ol0IioOo ol0IioOoI001iOo1i0O;
                    Object next;
                    Ol0IioOo ol0IioOo;
                    Ol0IioOo ol0IioOoI001iOo1i0O2;
/* 1 */             Iterator it = linkedHashSet2.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                Ol0IioOo ol0IioOo2 = (Ol0IioOo) it.next();
/* 21 */                Ol0IioOo ol0IioOo3 = (Ol0IioOo) lOO1li.I00000oOI(ol0IioOo2);
/* 23 */                Ol0IioOo ol0IioOo4 = null;
/* 24 */                if (ol0IioOo3 == null) {
/* 26 */                    ol0IioOoI001iOo1i0O = null;
                        } else {
/* 42 */                    Iterator it2 = ((Collection) function1.invoke(OI1Iio0ii1.I0000oI00(lOO1li.I00000oIO(ol0IioOo3)))).iterator();
/* 50 */                    while (it2.hasNext()) {
/* 58 */                        Illli0oiOOi illli0oiOOiI00iio = ((Ol0IioOo) it2.next()).I00iio();
/* 62 */                        illli0oiOOiI00iio.I00100o1O0lo(oI1Iio0ii1);
/* 65 */                        illli0oiOOiI00iio.I0010I0i();
/* 68 */                        illli0oiOOiI00iio.I0001Ioi1lo();
/* 75 */                        Ol0IioOo ol0IioOo5 = (Ol0IioOo) illli0oiOOiI00iio.build();
/* 81 */                        if (I001lloI(ol0IioOo3, ol0IioOo5)) {
/* 83 */                            ol0IioOoI001iOo1i0O = I001iOo1i0O(ol0IioOo5, ol0IioOo3, linkedHashSet);
                                    break;
                                }
                            }
/* 26 */                    ol0IioOoI001iOo1i0O = null;
                        }
/* 87 */                iiIiiol0.I00000oIO(abstractSet, ol0IioOoI001iOo1i0O);
/* 90 */                Illlil illlilI00000oIO = IIIOol.I00000oIO(ol0IioOo2);
/* 94 */                if (illlilI00000oIO == 0) {
/* 96 */                    ol0IioOoI001iOo1i0O2 = null;
                        } else {
/* 112 */                   Iterator it3 = ((Iterable) function1.invoke(((Ii1Ooli) illlilI00000oIO).getName())).iterator();
                            while (true) {
/* 120 */                       if (!it3.hasNext()) {
/* 155 */                           next = null;
                                    break;
                                }
/* 122 */                       next = it3.next();
/* 127 */                       Ol0IioOo ol0IioOo6 = (Ol0IioOo) next;
/* 146 */                       if (l1OOo1o1l.I00000oIO(ol0IioOo6, 2).equals(l1OOo1o1l.I00000oIO(illlilI00000oIO.I010i10l(), 2)) && !I001lllioOl(ol0IioOo6, illlilI00000oIO)) {
                                    break;
                                }
                            }
/* 156 */                   Ol0IioOo ol0IioOo7 = (Ol0IioOo) next;
/* 158 */                   if (ol0IioOo7 != null) {
/* 160 */                       Illli0oiOOi illli0oiOOiI00iio2 = ol0IioOo7.I00iio();
/* 164 */                       List listI00Iooi00oi = illlilI00000oIO.I00Iooi00oi();
/* 178 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00Iooi00oi, 10));
/* 181 */                       Iterator it4 = listI00Iooi00oi.iterator();
/* 189 */                       while (it4.hasNext()) {
/* 201 */                           arrayList.add(((Ooo00oi0O) it4.next()).getType());
                                }
/* 215 */                       illli0oiOOiI00iio2.I00000oIO(li0ol1IO.I00000oIO(arrayList, ol0IioOo7.I00Iooi00oi(), illlilI00000oIO));
/* 218 */                       illli0oiOOiI00iio2.I0010I0i();
/* 221 */                       illli0oiOOiI00iio2.I0001Ioi1lo();
/* 224 */                       illli0oiOOiI00iio2.I000II();
/* 231 */                       ol0IioOo = (Ol0IioOo) illli0oiOOiI00iio2.build();
                            } else {
/* 234 */                       ol0IioOo = null;
                            }
/* 235 */                   if (ol0IioOo != null) {
/* 241 */                       if (!I00IioO0OiOi(ol0IioOo)) {
/* 244 */                           ol0IioOo = null;
                                }
/* 245 */                       if (ol0IioOo != null) {
/* 247 */                           ol0IioOoI001iOo1i0O2 = I001iOo1i0O(ol0IioOo, illlilI00000oIO, linkedHashSet);
                                }
                            }
                        }
/* 251 */               iiIiiol0.I00000oIO(abstractSet, ol0IioOoI001iOo1i0O2);
/* 258 */               if (ol0IioOo2.I00100l0()) {
/* 271 */                   Iterator it5 = ((Iterable) function1.invoke(ol0IioOo2.getName())).iterator();
                            while (true) {
/* 279 */                       if (!it5.hasNext()) {
                                    break;
                                }
/* 287 */                       Ol0IioOo ol0IioOoI001l0I00 = I001l0I00((Ol0IioOo) it5.next());
/* 291 */                       if (ol0IioOoI001l0I00 == null || !I001lllioOl(ol0IioOoI001l0I00, ol0IioOo2)) {
/* 300 */                           ol0IioOoI001l0I00 = null;
                                }
/* 301 */                       if (ol0IioOoI001l0I00 != null) {
/* 303 */                           ol0IioOo4 = ol0IioOoI001l0I00;
                                    break;
                                }
                            }
                        }
/* 304 */               iiIiiol0.I00000oIO(abstractSet, ol0IioOo4);
                    }
                }

                public final void I001i1lo1io(Set set, AbstractCollection abstractCollection, Ol1OI1II0ll ol1OI1II0ll, Function1 function1) {
                    OOOOOO0O oooooo0oI000OiO;
                    O00loo0o o00loo0o;
/* 7 */             Iterator it = set.iterator();
/* 15 */            while (it.hasNext()) {
/* 21 */                OOOO01l oOOO01l = (OOOO01l) it.next();
/* 27 */                if (I001lIiIIo1O(oOOO01l, function1)) {
/* 32 */                    Ol0IioOo ol0IioOoI00II0oii1o = I00II0oii1o(oOOO01l, function1);
/* 47 */                    Ol0IioOo ol0IioOoI00IO1 = oOOO01l.I00OIo() ? I00IO1(oOOO01l, function1) : null;
/* 48 */                    if (ol0IioOoI00IO1 != null) {
/* 50 */                        ol0IioOoI00IO1.I001IO000();
/* 53 */                        ol0IioOoI00II0oii1o.I001IO000();
                            }
/* 100 */                   O00loo0o o00loo0o2 = new O00loo0o(this.I000o00OoI0I, i1i0olI.I00iiO, ol0IioOoI00II0oii1o.I001IO000(), ol0IioOoI00II0oii1o.I000OiO(), ol0IioOoI00IO1 != null, oOOO01l.getName(), ol0IioOoI00II0oii1o.I0010I0i(), null, 1, false, null);
/* 103 */                   O0iIl1 o0iIl1 = ol0IioOoI00II0oii1o.I00io1l;
/* 105 */                   O0ioOi0Oo1ii o0ioOi0Oo1iiI000oI1ioi = I000oI1ioi();
/* 110 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 113 */                   o00loo0o2.I01101IOlO(o0iIl1, il01100l, o0ioOi0Oo1iiI000oI1ioi, null, il01100l);
/* 124 */                   OOOOI1ioIo oOOOI1ioIoI000OOo1O = il0ol10l.I000OOo1O(o00loo0o2, ol0IioOoI00II0oii1o.getAnnotations(), false, ol0IioOoI00II0oii1o.I0010I0i());
/* 128 */                   oOOOI1ioIoI000OOo1O.I00ll1 = ol0IioOoI00II0oii1o;
/* 134 */                   oOOOI1ioIoI000OOo1O.I010l10O(o00loo0o2.getType());
/* 137 */                   if (ol0IioOoI00IO1 != null) {
/* 147 */                       Ooo00oi0O ooo00oi0O = (Ooo00oi0O) IOOi0Ool1i.I00II0Ol1O0l(ol0IioOoI00IO1.I00Iooi00oi());
/* 149 */                       if (ooo00oi0O == null) {
/* 178 */                           IoOOl0iOl1io.I001i1lo1io("No parameter found for ", ol0IioOoI00IO1);
/* 181 */                           return;
                                } else {
/* 168 */                           oooooo0oI000OiO = il0ol10l.I000OiO(o00loo0o2, ol0IioOoI00IO1.getAnnotations(), ooo00oi0O.getAnnotations(), false, ol0IioOoI00IO1.I000OiO(), ol0IioOoI00IO1.I0010I0i());
/* 172 */                           oooooo0oI000OiO.I00ll1 = ol0IioOoI00IO1;
                                }
                            } else {
/* 182 */                       oooooo0oI000OiO = null;
                            }
/* 184 */                   o00loo0o2.I010l1ol111(oOOOI1ioIoI000OOo1O, oooooo0oI000OiO, null, null);
/* 187 */                   o00loo0o = o00loo0o2;
                        } else {
/* 29 */                    o00loo0o = null;
                        }
/* 190 */               if (o00loo0o != null) {
/* 192 */                   abstractCollection.add(o00loo0o);
/* 195 */                   if (ol1OI1II0ll != null) {
/* 197 */                       ol1OI1II0ll.add(oOOO01l);
/* 483 */                       return;
                            }
/* 483 */                   return;
                        }
                    }
                }

                public final boolean I001lIiIIo1O(OOOO01l oOOO01l, Function1 function1) {
/* 5 */             if (l011Ol0O.I00000oIO(oOOO01l)) {
/* 40 */                return false;
                    }
/* 8 */             Ol0IioOo ol0IioOoI00II0oii1o = I00II0oii1o(oOOO01l, function1);
/* 12 */            Ol0IioOo ol0IioOoI00IO1 = I00IO1(oOOO01l, function1);
/* 16 */            if (ol0IioOoI00II0oii1o == null) {
/* 40 */                return false;
                    }
/* 23 */            if (oOOO01l.I00OIo()) {
                        return ol0IioOoI00IO1 != null && ol0IioOoI00IO1.I001IO000() == ol0IioOoI00II0oii1o.I001IO000();
                    }
/* 38 */            return true;
                }

                public final Ol0IioOo I00II0oii1o(OOOO01l oOOO01l, Function1 function1) {
                    OI1Iio0ii1 oI1Iio0ii1;
/* 1 */             OOOOI1ioIo oOOOI1ioIoI00000oOI = oOOO01l.I00000oOI();
/* 5 */             String strI00000oOI = null;
/* 15 */            OOOOI1ioIo oOOOI1ioIo = oOOOI1ioIoI00000oOI != null ? (OOOOI1ioIo) lOO1li.I00000oOI(oOOOI1ioIoI00000oOI) : null;
/* 16 */            if (oOOOI1ioIo != null) {
/* 18 */                O0i1lI0o1io.I001l0I00(oOOOI1ioIo);
/* 27 */                IIiO00o1o iIiO00o1oI00000oOI = IiOiOOIo.I00000oOI(IiOiOOIo.I000OOo1O(oOOOI1ioIo), I0ollliOo0.I00oII);
/* 31 */                if (iIiO00o1oI00000oOI != null && (oI1Iio0ii1 = (OI1Iio0ii1) IIIOooO0ol.I00000oIO.get(IiOiOOIo.I000II(iIiO00o1oI00000oOI))) != null) {
/* 48 */                    strI00000oOI = oI1Iio0ii1.I00000oOI();
                        }
                    }
                    return (strI00000oOI == null || lOO1li.I0000Il00O(this.I000o00OoI0I, oOOOI1ioIo)) ? I00II0Ol1O0l(oOOO01l, O0I00o0.I00000oIO(oOOO01l.getName().I00000oOI()), function1) : I00II0Ol1O0l(oOOO01l, strI00000oOI, function1);
                }

                public final LinkedHashSet I00IO1oi11O(OI1Iio0ii1 oI1Iio0ii1) {
                    Collection collectionI0000oI00;
/* 1 */             boolean z = this.I00100l0;
/* 3 */             OI000ilOol oI000ilOol = this.I000o00OoI0I;
/* 5 */             if (z) {
/* 11 */                collectionI0000oI00 = oI000ilOol.I000OOo1O().I0000oI00();
                    } else {
/* 18 */                Object obj = this.I00000oOI.I00iOIl;
/* 24 */                collectionI0000oI00 = oI000ilOol.I000OOo1O().I0000oI00();
                    }
/* 32 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 35 */            Iterator it = collectionI0000oI00.iterator();
/* 43 */            while (it.hasNext()) {
/* 63 */                IOOii0O10Io0.I00100l0(linkedHashSet, ((O0iIl1) it.next()).I00IoiI().I00000oIO(oI1Iio0ii1, OIIl0iOOlo.I00ilI0I1));
                    }
/* 186 */           return linkedHashSet;
                }

                public final Set I00IOO(OI1Iio0ii1 oI1Iio0ii1) {
                    Collection collectionI0000oI00;
/* 1 */             boolean z = this.I00100l0;
/* 3 */             OI000ilOol oI000ilOol = this.I000o00OoI0I;
/* 5 */             if (z) {
/* 11 */                collectionI0000oI00 = oI000ilOol.I000OOo1O().I0000oI00();
                    } else {
/* 18 */                Object obj = this.I00000oOI.I00iOIl;
/* 24 */                collectionI0000oI00 = oI000ilOol.I000OOo1O().I0000oI00();
                    }
/* 32 */            ArrayList arrayList = new ArrayList();
/* 35 */            Iterator it = collectionI0000oI00.iterator();
/* 43 */            while (it.hasNext()) {
/* 57 */                Collection collectionI0001Ioi1lo = ((O0iIl1) it.next()).I00IoiI().I0001Ioi1lo(oI1Iio0ii1, OIIl0iOOlo.I00ilI0I1);
/* 71 */                ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(collectionI0001Ioi1lo, 10));
/* 74 */                Iterator it2 = collectionI0001Ioi1lo.iterator();
/* 82 */                while (it2.hasNext()) {
/* 90 */                    arrayList2.add((OOOO01l) it2.next());
                        }
/* 94 */                IOOii0O10Io0.I00100l0(arrayList, arrayList2);
                    }
/* 98 */            return IOOi0Ool1i.I00iio(arrayList);
                }

                /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x01cc A[ORIG_RETURN, RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00IioO0OiOi(Ol0IioOo ol0IioOo) {
                    Iterable iterableI000OOo1O;
                    OI1Iio0ii1 oI1Iio0ii1;
                    Ol0IioOo ol0IioOoI001l0I00;
/* 1 */             OI1Iio0ii1 name = ol0IioOo.getName();
/* 5 */             String strI00000oOI = name.I00000oOI();
/* 9 */             Ill0IO ill0IO = O0I00o0.I00000oIO;
/* 23 */            if (OlOolloIIOl0.I000l1(strI00000oOI, "get", false) || OlOolloIIOl0.I000l1(strI00000oOI, "is", false)) {
/* 71 */                OI1Iio0ii1 oI1Iio0ii1I00000oIO = lIO1i10I1o1o.I00000oIO(name, "get", null, 12);
/* 75 */                if (oI1Iio0ii1I00000oIO == null) {
/* 79 */                    oI1Iio0ii1I00000oIO = lIO1i10I1o1o.I00000oIO(name, "is", null, 8);
                        }
/* 83 */                iterableI000OOo1O = IOOi1I.I000OOo1O(oI1Iio0ii1I00000oIO);
                    } else if (OlOolloIIOl0.I000l1(strI00000oOI, "set", false)) {
/* 51 */                iterableI000OOo1O = I1IoiO1l.I001IIilI0O(new OI1Iio0ii1[]{lIO1i10I1o1o.I00000oIO(name, "set", null, 4), lIO1i10I1o1o.I00000oIO(name, "set", "is", 4)});
                    } else {
/* 62 */                iterableI000OOo1O = (List) IIIOooO0ol.I00000oOI.get(name);
/* 64 */                if (iterableI000OOo1O == null) {
/* 66 */                    iterableI000OOo1O = Il01100l.I00iOIl;
                        }
                    }
/* 87 */            Iterable iterable = iterableI000OOo1O;
/* 91 */            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
/* 197 */               ArrayList arrayList = OlIIlo.I00000oIO;
/* 209 */               oI1Iio0ii1 = (OI1Iio0ii1) OlIIlo.I000iOII.get(ol0IioOo.getName());
/* 211 */               if (oI1Iio0ii1 != null) {
                        }
                    } else {
/* 103 */               Iterator it = iterable.iterator();
/* 111 */               loop5: while (it.hasNext()) {
/* 119 */                   Set<OOOO01l> setI00IOO = I00IOO((OI1Iio0ii1) it.next());
/* 127 */                   if (!(setI00IOO instanceof Collection) || !setI00IOO.isEmpty()) {
/* 147 */                       for (OOOO01l oOOO01l : setI00IOO) {
/* 159 */                           I01i01OoI i01i01OoI = new I01i01OoI(16);
/* 162 */                           i01i01OoI.I00iiI = ol0IioOo;
/* 164 */                           i01i01OoI.I00iiO = this;
/* 166 */                           VarHandle.storeStoreFence();
/* 173 */                           if (I001lIiIIo1O(oOOO01l, i01i01OoI) && (oOOO01l.I00OIo() || !OlOolloIIOl0.I000l1(ol0IioOo.getName().I00000oOI(), "set", false))) {
                                        break loop5;
                                    }
                                }
                            }
                        }
/* 197 */               ArrayList arrayList2 = OlIIlo.I00000oIO;
/* 209 */               oI1Iio0ii1 = (OI1Iio0ii1) OlIIlo.I000iOII.get(ol0IioOo.getName());
/* 211 */               if (oI1Iio0ii1 != null) {
/* 307 */                   int i = IIIOol.I000l1;
/* 319 */                   if (OlIIlo.I0000oI00.contains(ol0IioOo.getName())) {
/* 326 */                       LinkedHashSet linkedHashSetI00IO1oi11O = I00IO1oi11O(ol0IioOo.getName());
/* 332 */                       ArrayList arrayList3 = new ArrayList();
/* 335 */                       Iterator it2 = linkedHashSetI00IO1oi11O.iterator();
/* 343 */                       while (it2.hasNext()) {
/* 351 */                           Illlil illlilI00000oIO = IIIOol.I00000oIO((Ol0IioOo) it2.next());
/* 355 */                           if (illlilI00000oIO != null) {
/* 357 */                               arrayList3.add(illlilI00000oIO);
                                    }
                                }
/* 365 */                       if (!arrayList3.isEmpty()) {
/* 368 */                           Iterator it3 = arrayList3.iterator();
/* 376 */                           while (it3.hasNext()) {
/* 382 */                               Illlil illlil = (Illlil) it3.next();
/* 401 */                               if (l1OOo1o1l.I00000oIO(ol0IioOo, 2).equals(l1OOo1o1l.I00000oIO(illlil.I010i10l(), 2)) && !I001lllioOl(ol0IioOo, illlil)) {
/* 13 */                                    return false;
                                        }
                                    }
                                }
                            }
/* 410 */                   ol0IioOoI001l0I00 = I001l0I00(ol0IioOo);
/* 414 */                   if (ol0IioOoI001l0I00 != null) {
/* 461 */                       return true;
                            }
/* 421 */                   LinkedHashSet<Ol0IioOo> linkedHashSetI00IO1oi11O2 = I00IO1oi11O(ol0IioOo.getName());
/* 429 */                   if (linkedHashSetI00IO1oi11O2.isEmpty()) {
/* 461 */                       return true;
                            }
/* 440 */                   for (Ol0IioOo ol0IioOo2 : linkedHashSetI00IO1oi11O2) {
/* 452 */                       if (!ol0IioOo2.I00100l0() || !I001lllioOl(ol0IioOoI001l0I00, ol0IioOo2)) {
                                }
                            }
/* 461 */                   return true;
                        }
/* 214 */               LinkedHashSet linkedHashSetI00IO1oi11O3 = I00IO1oi11O(oI1Iio0ii1);
/* 220 */               ArrayList arrayList4 = new ArrayList();
/* 231 */               for (Object obj : linkedHashSetI00IO1oi11O3) {
/* 244 */                   if (lOO1li.I00000oOI((Ol0IioOo) obj) != null) {
/* 246 */                       arrayList4.add(obj);
                            }
                        }
/* 254 */               if (!arrayList4.isEmpty()) {
/* 257 */                   Illli0oiOOi illli0oiOOiI00iio = ol0IioOo.I00iio();
/* 261 */                   illli0oiOOiI00iio.I00100o1O0lo(oI1Iio0ii1);
/* 264 */                   illli0oiOOiI00iio.I0010I0i();
/* 267 */                   illli0oiOOiI00iio.I0001Ioi1lo();
/* 274 */                   Ol0IioOo ol0IioOo3 = (Ol0IioOo) illli0oiOOiI00iio.build();
/* 280 */                   if (!arrayList4.isEmpty()) {
/* 283 */                       Iterator it4 = arrayList4.iterator();
/* 291 */                       while (it4.hasNext()) {
/* 303 */                           if (I001lloI((Ol0IioOo) it4.next(), ol0IioOo3)) {
                                        break;
                                    }
                                }
/* 307 */                       int i2 = IIIOol.I000l1;
/* 319 */                       if (OlIIlo.I0000oI00.contains(ol0IioOo.getName())) {
                                }
/* 410 */                       ol0IioOoI001l0I00 = I001l0I00(ol0IioOo);
/* 414 */                       if (ol0IioOoI001l0I00 != null) {
                                }
                            }
                        }
                    }
/* 13 */            return false;
                }

                public final ArrayList I00IlilI0i0i(OI1Iio0ii1 oI1Iio0ii1) {
/* 9 */             Collection collectionI0000Il00O = ((Ii1i1O0lI) this.I0000oI00.invoke()).I0000Il00O(oI1Iio0ii1);
/* 23 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionI0000Il00O, 10));
/* 26 */            Iterator it = collectionI0000Il00O.iterator();
/* 34 */            while (it.hasNext()) {
/* 46 */                arrayList.add(I0010o((OOoIOiO0) it.next()));
                    }
/* 186 */           return arrayList;
                }

                public final ArrayList I00Io1lO(OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             LinkedHashSet linkedHashSetI00IO1oi11O = I00IO1oi11O(oI1Iio0ii1);
/* 7 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (Object obj : linkedHashSetI00IO1oi11O) {
/* 25 */                Ol0IioOo ol0IioOo = (Ol0IioOo) obj;
/* 31 */                if (lOO1li.I00000oOI(ol0IioOo) == null && IIIOol.I00000oIO(ol0IioOo) == null) {
/* 41 */                    arrayList.add(obj);
                        }
                    }
/* 49 */            return arrayList;
                }

                @Override
                public final String toString() {
/* 17 */            return "Lazy Java member scope for " + this.I000oI1ioi.I0000Il00O();
                }
            }
