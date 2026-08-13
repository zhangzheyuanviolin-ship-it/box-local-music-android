            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            
            public final class O0I0iO0I1iI implements I0OI00O, OO1I1O0ooilo {
                public static final O0O00I1Ili[] I00ioIO;
                public OI0011 I00iOIl;
                public O1I0II11i I00iiI;
                public Ol0O0iI0l0O I00iiO;
                public O1I0II11i I00iio;
                public O1I00llOi I00ilI0I1;
                public O1I0II11i I00ilO0;
                public O1I00llOi I00io1l;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(O0I0iO0I1iI.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 46 */            I00ioIO = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(O0I0iO0I1iI.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, oOoOl1001II), IIl001iO0Io.I0001Ioi1lo(O0I0iO0I1iI.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, oOoOl1001II)};
                }

                public final O0l1i0l I00000oIO(OI000ilOol oI000ilOol) {
                    Ill0IO ill0IOI00000oIO;
/* 2 */             if (oI000ilOol == null) {
/* 70 */                O0i1lI0o1io.I00000oIO(108);
/* 186 */               throw null;
                    }
/* 10 */            if (!O0i1lI0o1io.I00000oOI(oI000ilOol, OlIllOO11lOl.I00000oIO) && O0i1lI0o1io.I00IioO0OiOi(oI000ilOol)) {
/* 20 */                int i = IiOiOOIo.I00000oIO;
/* 22 */                Ill0OI0lo ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol);
/* 30 */                if (ill0OI0loI0001Ioi1lo.I0000O()) {
/* 33 */                    String str = O00oO0liO11.I00000oIO;
/* 35 */                    IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(ill0OI0loI0001Ioi1lo);
/* 39 */                    if (iOIOillI000O01llI0 != null && (ill0IOI00000oIO = iOIOillI000O01llI0.I00000oIO()) != null) {
/* 52 */                        OI0011 oi0011 = I00000oOI().I00000oIO;
/* 54 */                        OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iOIl;
/* 56 */                        OI000ilOol oI000ilOolI00000oOI = il110i0l.I00000oOI(oi0011, ill0IOI00000oIO);
/* 62 */                        if (oI000ilOolI00000oOI instanceof O0l1i0l) {
/* 64 */                            return (O0l1i0l) oI000ilOolI00000oOI;
                                }
                            }
                        }
                    }
/* 1 */             return null;
                }

                public final O0I0OI I00000oOI() {
/* 1 */             O1I0II11i o1I0II11i = this.I00iiI;
/* 6 */             O0O00I1Ili o0O00I1Ili = I00ioIO[0];
/* 12 */            return (O0I0OI) o1I0II11i.invoke();
                }

                @Override
                public final boolean I000OOo1O(OI000ilOol oI000ilOol, IiOoI01 iiOoI01) {
/* 1 */             O0l1i0l o0l1i0lI00000oIO = I00000oIO(oI000ilOol);
/* 5 */             if (o0l1i0lI00000oIO == null || !iiOoI01.getAnnotations().I001l0I00(OO1II0lllOI.I00000oIO)) {
/* 89 */                return true;
                    }
/* 25 */            I00000oOI().getClass();
/* 29 */            String strI00000oIO = l1OOo1o1l.I00000oIO(iiOoI01, 3);
/* 43 */            Collection collectionI00000oIO = o0l1i0lI00000oIO.I00oIiI10().I00000oIO(iiOoI01.getName(), OIIl0iOOlo.I00iOIl);
/* 51 */            if ((collectionI00000oIO instanceof Collection) && collectionI00000oIO.isEmpty()) {
/* 91 */                return false;
                    }
/* 63 */            Iterator it = collectionI00000oIO.iterator();
/* 71 */            while (it.hasNext()) {
/* 87 */                if (l1OOo1o1l.I00000oIO((Ol0IioOo) it.next(), 3).equals(strI00000oIO)) {
/* 89 */                    return true;
                        }
                    }
/* 91 */            return false;
                }

                @Override
                public final Collection I00II0oii1o(OI000ilOol oI000ilOol) {
                    Ill0OI0lo ill0OI0loI0001Ioi1lo;
/* 1 */             lOOlOoll loolooll = lOOlOoll.I00ioIO;
/* 9 */             if (oI000ilOol.I00II0oii1o() == IOIOllO1oli.I00iOIl) {
/* 15 */                I00000oOI().getClass();
/* 18 */                O0l1i0l o0l1i0lI00000oIO = I00000oIO(oI000ilOol);
/* 22 */                if (o0l1i0lI00000oIO != null) {
/* 26 */                    Ill0IO ill0IOI000II = IiOiOOIo.I000II(o0l1i0lI00000oIO);
/* 30 */                    IlII1I00O1 ilII1I00O1 = IlII1I00O1.I0001Ioi1lo;
/* 32 */                    String str = O00oO0liO11.I00000oIO;
/* 34 */                    IOIOill iOIOillI000II = O00oO0liO11.I000II(ill0IOI000II);
/* 50 */                    OI000ilOol oI000ilOolI000OiO = iOIOillI000II != null ? ilII1I00O1.I000OiO(iOIOillI000II.I00000oIO()) : null;
/* 51 */                    if (oI000ilOolI000OiO != null) {
/* 61 */                        OoOilII0 ooOilII0 = new OoOilII0(l11o1O1.I00000oIO(oI000ilOolI000OiO, o0l1i0lI00000oIO));
/* 72 */                        List list = (List) o0l1i0lI00000oIO.I00o101lO.I00100o1O0lo.invoke();
/* 78 */                        ArrayList arrayList = new ArrayList();
/* 93 */                        for (Object obj : list) {
/* 100 */                           IOIO10lo iOIO10lo = (IOIO10lo) obj;
/* 110 */                           if (iOIO10lo.I000OiO().I00000oIO.I00iiI) {
/* 112 */                               Collection collectionI000II = oI000ilOolI000OiO.I000II();
/* 120 */                               if (!(collectionI000II instanceof Collection) || !collectionI000II.isEmpty()) {
/* 132 */                                   Iterator it = collectionI000II.iterator();
/* 140 */                                   while (it.hasNext()) {
/* 156 */                                       if (OIlIlOllioi.I000OiO((IOIO10lo) it.next(), iOIO10lo.I0000oI00(ooOilII0)) == 1) {
                                                    break;
                                                }
                                            }
                                        }
/* 167 */                               if (iOIO10lo.I00Iooi00oi().size() == 1) {
/* 187 */                                   IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((Ooo00oi0O) IOOi0Ool1i.I00OilO00Il(iOIO10lo.I00Iooi00oi())).getType().I00iOIl().I00100o1O0lo();
/* 191 */                                   if (iOIiO1lIl0lI00100o1O0lo != null) {
/* 193 */                                       int i = IiOiOOIo.I00000oIO;
/* 195 */                                       ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo);
                                            } else {
/* 200 */                                       ill0OI0loI0001Ioi1lo = null;
                                            }
/* 201 */                                   int i2 = IiOiOOIo.I00000oIO;
/* 211 */                                   if (O0000Ioio00.I0000O(ill0OI0loI0001Ioi1lo, IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol))) {
                                            }
                                        }
/* 219 */                               if (!O0i1lI0o1io.I001lloI(iOIO10lo)) {
/* 221 */                                   LinkedHashSet linkedHashSet = O0I0lii0l0.I0001Ioi1lo;
/* 223 */                                   String strI00000oIO = l1OOo1o1l.I00000oIO(iOIO10lo, 3);
/* 227 */                                   String str2 = O00oO0liO11.I00000oIO;
/* 235 */                                   IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(IiOiOOIo.I000II(o0l1i0lI00000oIO).I00000oIO);
/* 269 */                                   if (!linkedHashSet.contains((iOIOillI000O01llI0 != null ? O0I0oiO1I.I0000oI00(iOIOillI000O01llI0) : il0oill0io.I00000oIO(o0l1i0lI00000oIO, loolooll)) + '.' + strI00000oIO)) {
/* 271 */                                       arrayList.add(obj);
                                            }
                                        }
                                    }
                                }
/* 284 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 287 */                       Iterator it2 = arrayList.iterator();
/* 295 */                       while (it2.hasNext()) {
/* 301 */                           IOIO10lo iOIO10lo2 = (IOIO10lo) it2.next();
/* 303 */                           iOIO10lo2.getClass();
/* 308 */                           IllliloOi illliloOiI010o0o0oO = iOIO10lo2.I010o0o0oO(OoOilII0.I00000oOI);
/* 314 */                           illliloOiI010o0o0oO.I00iiI = oI000ilOol;
/* 320 */                           illliloOiI010o0o0oO.I000o00OoI0I(oI000ilOol.I00Ol10());
/* 323 */                           illliloOiI010o0o0oO.I00o0iI0io1 = true;
/* 327 */                           illliloOiI010o0o0oO.I00iOIl = ooOilII0.I00000oIO;
/* 329 */                           LinkedHashSet linkedHashSet2 = O0I0lii0l0.I000II;
/* 331 */                           String strI00000oIO2 = l1OOo1o1l.I00000oIO(iOIO10lo2, 3);
/* 335 */                           String str3 = O00oO0liO11.I00000oIO;
/* 343 */                           IOIOill iOIOillI000O01llI02 = O00oO0liO11.I000O01llI0(IiOiOOIo.I000II(o0l1i0lI00000oIO).I00000oIO);
/* 377 */                           if (!linkedHashSet2.contains((iOIOillI000O01llI02 != null ? O0I0oiO1I.I0000oI00(iOIOillI000O01llI02) : il0oill0io.I00000oIO(o0l1i0lI00000oIO, loolooll)) + '.' + strI00000oIO2)) {
/* 379 */                               O1I0II11i o1I0II11i = this.I00ilO0;
/* 384 */                               O0O00I1Ili o0O00I1Ili = I00ioIO[2];
/* 392 */                               illliloOiI010o0o0oO.I000l1((I11IlOOO) o1I0II11i.invoke());
                                    }
/* 403 */                           arrayList2.add((IOIO10lo) illliloOiI010o0o0oO.I00olI.I010l1O(illliloOiI010o0o0oO));
                                }
/* 407 */                       return arrayList2;
                            }
                        }
                    }
/* 408 */           return Il01100l.I00iOIl;
                }

                @Override
                public final Collection I00IOO(OI000ilOol oI000ilOol) {
                    Set setI00000oOI;
/* 5 */             I00000oOI().getClass();
/* 8 */             O0l1i0l o0l1i0lI00000oIO = I00000oIO(oI000ilOol);
/* 12 */            if (o0l1i0lI00000oIO == null || (setI00000oOI = o0l1i0lI00000oIO.I00oIiI10().I00000oOI()) == null) {
/* 24 */                setI00000oOI = Il01llIol0.I00iOIl;
                    }
/* 26 */            return setI00000oOI;
                }

                @Override
                public final Collection I00O0o1oo(OI000ilOol oI000ilOol) {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0O = this.I00iiO;
/* 3 */             int i = IiOiOOIo.I00000oIO;
/* 5 */             Ill0OI0lo ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol);
/* 9 */             LinkedHashSet linkedHashSet = O0I0lii0l0.I00000oIO;
/* 11 */            Ill0OI0lo ill0OI0lo = OlIllOO11lOl.I000II;
/* 17 */            boolean zIsAssignableFrom = false;
/* 19 */            if (!ill0OI0loI0001Ioi1lo.equals(ill0OI0lo)) {
/* 21 */                HashMap map = OlIllOO11lOl.I00i0ilIl0i;
/* 27 */                if (map.get(ill0OI0loI0001Ioi1lo) == null) {
/* 34 */                    if (ill0OI0loI0001Ioi1lo.equals(ill0OI0lo) || map.get(ill0OI0loI0001Ioi1lo) != null) {
/* 71 */                        zIsAssignableFrom = true;
                            } else {
/* 43 */                        String str = O00oO0liO11.I00000oIO;
/* 45 */                        IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(ill0OI0loI0001Ioi1lo);
/* 49 */                        if (iOIOillI000O01llI0 != null) {
                                    try {
/* 66 */                                zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(iOIOillI000O01llI0.I00000oIO().I00000oIO.I00000oIO));
                                    } catch (ClassNotFoundException unused) {
                                    }
                                }
                            }
                            return zIsAssignableFrom ? Collections.singletonList(ol0O0iI0l0O) : Il01100l.I00iOIl;
                        }
                    }
/* 84 */            O1I0II11i o1I0II11i = this.I00iio;
/* 88 */            O0O00I1Ili o0O00I1Ili = I00ioIO[1];
/* 103 */           return IOOi1I.I000O01llI0((Ol0O0iI0l0O) o1I0II11i.invoke(), ol0O0iI0l0O);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Collection I00OOll1(OI1Iio0ii1 oI1Iio0ii1, OI000ilOol oI000ilOol) {
                    List listSingleton;
                    Object obj;
                    OI000ilOol oI000ilOol2;
                    Collection collection;
                    boolean zBooleanValue;
                    Object obj2;
                    I11IlOOO i11IlOOO;
/* 7 */             O1I00llOi o1I00llOi = this.I00io1l;
/* 11 */            boolean zEquals = oI1Iio0ii1.equals(IOO0ll.I0000oI00);
/* 15 */            O0O00I1Ili[] o0O00I1IliArr = I00ioIO;
/* 18 */            Il01100l<Ol0IioOo> il01100l = Il01100l.I00iOIl;
/* 20 */            if (zEquals && (oI000ilOol instanceof IiOlI10iOI) && (O0i1lI0o1io.I00000oOI(oI000ilOol, OlIllOO11lOl.I000II) || O0i1lI0o1io.I0010I0i(oI000ilOol) != null)) {
/* 40 */                IiOlI10iOI iiOlI10iOI = (IiOlI10iOI) oI000ilOol;
/* 44 */                List list = iiOlI10iOI.I00ilI0I1.I00o101lO;
/* 50 */                if (!(list instanceof Collection) || !list.isEmpty()) {
/* 62 */                    Iterator it = list.iterator();
/* 70 */                    while (it.hasNext()) {
/* 96 */                        if (l1iI1lOO.I00000oOI((OI1IlOlol) iiOlI10iOI.I00ll1.I00iiO, ((OOOll1o0) it.next()).I00ilO0).equals(IOO0ll.I0000oI00)) {
/* 98 */                            return il01100l;
                                }
                            }
                        }
/* 99 */                O1I0II11i o1I0II11i = this.I00iio;
/* 101 */               O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[1];
/* 127 */               Illli0oiOOi illli0oiOOiI00iio = ((Ol0IioOo) IOOi0Ool1i.I00OOll1(((Ol0O0iI0l0O) o1I0II11i.invoke()).I00IoiI().I00000oIO(oI1Iio0ii1, OIIl0iOOlo.I00iOIl))).I00iio();
/* 131 */               illli0oiOOiI00iio.I00100l0(iiOlI10iOI);
/* 136 */               illli0oiOOiI00iio.I000OOo1O(IiOiioI.I0000oI00);
/* 143 */               illli0oiOOiI00iio.I000o00OoI0I(iiOlI10iOI.I00Ol10());
/* 150 */               illli0oiOOiI00iio.I0000oI00(iiOlI10iOI.I00iiI());
/* 159 */               return Collections.singletonList((Ol0IioOo) illli0oiOOiI00iio.build());
                    }
/* 170 */           I00000oOI().getClass();
/* 173 */           O0l1i0l o0l1i0lI00000oIO = I00000oIO(oI000ilOol);
/* 178 */           if (o0l1i0lI00000oIO == null) {
/* 180 */               collection = null;
                    } else {
/* 184 */               Ill0IO ill0IOI000II = IiOiOOIo.I000II(o0l1i0lI00000oIO);
/* 188 */               IlII1I00O1 ilII1I00O1 = IlII1I00O1.I0001Ioi1lo;
/* 190 */               String str = O00oO0liO11.I00000oIO;
/* 192 */               IOIOill iOIOillI000II = O00oO0liO11.I000II(ill0IOI000II);
/* 207 */               OI000ilOol oI000ilOolI000OiO = iOIOillI000II != null ? ilII1I00O1.I000OiO(iOIOillI000II.I00000oIO()) : null;
/* 208 */               if (oI000ilOolI000OiO == null) {
/* 210 */                   listSingleton = Il01llIol0.I00iOIl;
                        } else {
/* 217 */                   Ill0IO ill0IOI000OOo1O = O00oO0liO11.I000OOo1O(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOolI000OiO));
/* 238 */                   listSingleton = ill0IOI000OOo1O == null ? Collections.singleton(oI000ilOolI000OiO) : IOOi1I.I000O01llI0(oI000ilOolI000OiO, ilII1I00O1.I000OiO(ill0IOI000OOo1O));
                        }
/* 244 */               Iterable iterable = listSingleton;
/* 248 */               if (iterable instanceof List) {
/* 251 */                   List list2 = (List) iterable;
/* 266 */                   obj = list2.isEmpty() ? null : list2.get(list2.size() - 1);
/* 298 */                   oI000ilOol2 = (OI000ilOol) obj;
/* 300 */                   if (oI000ilOol2 == null) {
/* 303 */                       int i = Ol1OI1II0ll.I00iiO;
/* 313 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 316 */                       Iterator it2 = iterable.iterator();
/* 324 */                       while (it2.hasNext()) {
/* 336 */                           arrayList.add(IiOiOOIo.I000II((OI000ilOol) it2.next()));
                                }
/* 342 */                       Ol1OI1II0ll ol1OI1II0ll = new Ol1OI1II0ll();
/* 345 */                       ol1OI1II0ll.addAll(arrayList);
/* 348 */                       String str2 = O00oO0liO11.I00000oIO;
/* 356 */                       boolean zContainsKey = O00oO0liO11.I000OiO.containsKey(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol));
/* 360 */                       O1I00llOi o1I00llOi2 = this.I00ilI0I1;
/* 362 */                       Ill0IO ill0IOI000II2 = IiOiOOIo.I000II(o0l1i0lI00000oIO);
/* 370 */                       I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(19);
/* 373 */                       i01illiil1Oo.I00iiO = o0l1i0lI00000oIO;
/* 375 */                       i01illiil1Oo.I00iiI = oI000ilOol2;
/* 377 */                       VarHandle.storeStoreFence();
/* 392 */                       Collection collectionI00000oIO = ((OI000ilOol) o1I00llOi2.I000II(ill0IOI000II2, i01illiil1Oo)).I00l0OO0IO().I00000oIO(oI1Iio0ii1, OIIl0iOOlo.I00iOIl);
/* 400 */                       ArrayList arrayList2 = new ArrayList();
/* 411 */                       for (Object obj3 : collectionI00000oIO) {
/* 418 */                           Ol0IioOo ol0IioOo = (Ol0IioOo) obj3;
/* 424 */                           if (ol0IioOo.I000oI1ioi() == 1 && ol0IioOo.I000OiO().I00000oIO.I00iiI && !O0i1lI0o1io.I001lloI(ol0IioOo)) {
/* 447 */                               Collection collectionI000o00OoI0I = ol0IioOo.I000o00OoI0I();
/* 455 */                               if (!(collectionI000o00OoI0I instanceof Collection) || !collectionI000o00OoI0I.isEmpty()) {
/* 467 */                                   Iterator it3 = collectionI000o00OoI0I.iterator();
/* 475 */                                   while (it3.hasNext()) {
/* 495 */                                       if (ol1OI1II0ll.contains(IiOiOOIo.I000II(((Illlil) it3.next()).I000lI()))) {
                                                }
                                            }
                                        }
/* 502 */                               OI000ilOol oI000ilOol3 = (OI000ilOol) ol0IioOo.I000lI();
/* 504 */                               String strI00000oIO = l1OOo1o1l.I00000oIO(ol0IioOo, 3);
/* 508 */                               LinkedHashSet linkedHashSet = O0I0lii0l0.I0000oI00;
/* 510 */                               String str3 = O00oO0liO11.I00000oIO;
/* 520 */                               IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(IiOiOOIo.I000II(oI000ilOol3).I00000oIO);
/* 559 */                               if (linkedHashSet.contains((iOIOillI000O01llI0 != null ? O0I0oiO1I.I0000oI00(iOIOillI000O01llI0) : il0oill0io.I00000oIO(oI000ilOol3, lOOlOoll.I00ioIO)) + '.' + strI00000oIO) ^ zContainsKey) {
/* 561 */                                   zBooleanValue = true;
                                        } else {
/* 563 */                                   List listSingletonList = Collections.singletonList(ol0IioOo);
/* 569 */                                   i1O01Ill i1o01ill = i1O01Ill.I00ilI0I1;
/* 575 */                                   OoOi1I011O ooOi1I011O = new OoOi1I011O(12);
/* 578 */                                   VarHandle.storeStoreFence();
/* 585 */                                   zBooleanValue = il01o0io.I0000Il00O(listSingletonList, i1o01ill, ooOi1I011O).booleanValue();
                                        }
/* 589 */                               if (!zBooleanValue) {
/* 591 */                                   arrayList2.add(obj3);
                                        }
                                    }
                                }
/* 596 */                       collection = null;
/* 598 */                       il01100l = arrayList2;
                            }
                        } else {
/* 271 */                   Iterator it4 = iterable.iterator();
/* 279 */                   if (it4.hasNext()) {
/* 282 */                       Object next = it4.next();
/* 290 */                       while (it4.hasNext()) {
/* 292 */                           next = it4.next();
                                }
/* 297 */                       obj = next;
                            }
/* 298 */                   oI000ilOol2 = (OI000ilOol) obj;
/* 300 */                   if (oI000ilOol2 == null) {
                            }
                        }
                    }
/* 603 */           ArrayList arrayList3 = new ArrayList();
/* 614 */           for (Ol0IioOo ol0IioOo2 : il01100l) {
/* 643 */               Illli0oiOOi illli0oiOOiI00iio2 = ((Ol0IioOo) ol0IioOo2.I0000oI00(new OoOilII0(l11o1O1.I00000oIO((OI000ilOol) ol0IioOo2.I000lI(), oI000ilOol)))).I00iio();
/* 647 */               illli0oiOOiI00iio2.I00100l0(oI000ilOol);
/* 654 */               illli0oiOOiI00iio2.I0000oI00(oI000ilOol.I00iiI());
/* 657 */               illli0oiOOiI00iio2.I0001Ioi1lo();
/* 664 */               OI000ilOol oI000ilOol4 = (OI000ilOol) ol0IioOo2.I000lI();
/* 666 */               String strI00000oIO2 = l1OOo1o1l.I00000oIO(ol0IioOo2, 3);
/* 672 */               OOo0ooi oOo0ooi = new OOo0ooi();
/* 675 */               List listSingletonList2 = Collections.singletonList(oI000ilOol4);
/* 683 */               iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 686 */               iiolilo0iiil.I00iOIl = this;
/* 688 */               VarHandle.storeStoreFence();
/* 694 */               Ii100Ol ii100Ol = new Ii100Ol(2);
/* 697 */               ii100Ol.I00000oOI = strI00000oIO2;
/* 699 */               ii100Ol.I0000Il00O = oOo0ooi;
/* 701 */               VarHandle.storeStoreFence();
/* 710 */               int iOrdinal = ((O0I0i0ilo) il01o0io.I00000oIO(listSingletonList2, iiolilo0iiil, ii100Ol)).ordinal();
/* 714 */               if (iOrdinal != 0) {
/* 716 */                   if (iOrdinal != 1) {
/* 718 */                       if (iOrdinal == 2) {
/* 747 */                           OI1Iio0ii1 name = ol0IioOo2.getName();
/* 757 */                           if (O0000Ioio00.I0000O(name, O0I0il11i.I00000oIO)) {
/* 778 */                               i11IlOOO = (I11IlOOO) o1I00llOi.invoke(new OIoi0IIoi(ol0IioOo2.getName().I00000oOI(), "first"));
                                    } else {
/* 787 */                               if (!O0000Ioio00.I0000O(name, O0I0il11i.I00000oOI)) {
/* 820 */                                   OIiilo1Ool0o.I00100l0("Unexpected name: ", ol0IioOo2.getName());
/* 823 */                                   return collection;
                                        }
/* 808 */                               i11IlOOO = (I11IlOOO) o1I00llOi.invoke(new OIoi0IIoi(ol0IioOo2.getName().I00000oOI(), "last"));
                                    }
/* 810 */                           illli0oiOOiI00iio2.I000l1(i11IlOOO);
                                } else if (iOrdinal != 3) {
/* 723 */                           if (iOrdinal != 4) {
/* 729 */                               I000II.I00000oIO();
/* 732 */                               return collection;
                                    }
/* 725 */                           obj2 = collection;
                                } else {
/* 733 */                           O1I0II11i o1I0II11i2 = this.I00ilO0;
/* 735 */                           O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[2];
/* 743 */                           illli0oiOOiI00iio2.I000l1((I11IlOOO) o1I0II11i2.invoke());
                                }
                            }
/* 848 */                   obj2 = (Ol0IioOo) illli0oiOOiI00iio2.build();
                        } else {
/* 830 */                   if (oI000ilOol.I001IO000() != O1oIIloii0.I00iiI || oI000ilOol.I00II0oii1o() == IOIOllO1oli.I00iiO) {
/* 841 */                       illli0oiOOiI00iio2.I000O01llI0();
/* 848 */                       obj2 = (Ol0IioOo) illli0oiOOiI00iio2.build();
                            }
/* 725 */                   obj2 = collection;
                        }
/* 850 */               if (obj2 != null) {
/* 852 */                   arrayList3.add(obj2);
                        }
                    }
/* 2988 */          return arrayList3;
                }
            }
