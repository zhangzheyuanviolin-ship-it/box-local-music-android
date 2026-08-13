            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
/* 87 */    public abstract class IiOo0lO1 extends O1iio0 {
                public static final O0O00I1Ili[] I0001Ioi1lo;
                public final IiOili0lOO1 I00000oOI;
                public final IiOlooi I0000Il00O;
                public final O1I0II11i I0000O;
                public final O1I01I0o I0000oI00;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(IiOo0lO1.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 35 */            I0001Ioi1lo = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(IiOo0lO1.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, oOoOl1001II)};
                }

                public IiOo0lO1(IiOili0lOO1 iiOili0lOO1, List list, List list2, List list3, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00000oOI = iiOili0lOO1;
/* 14 */            ((i1O01oOIoI0I) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I0000Il00O).getClass();
/* 19 */            IiOlooi iiOlooi = new IiOlooi();
/* 22 */            iiOlooi.I000OOo1O = this;
/* 30 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 41 */            for (Object obj : list) {
/* 58 */                OI1Iio0ii1 oI1Iio0ii1I00000oOI = l1iI1lOO.I00000oOI((OI1IlOlol) iiOili0lOO1.I00iiO, ((OOOll1o0) ((I01Ilioliio) obj)).I00ilO0);
/* 62 */                Object arrayList = linkedHashMap.get(oI1Iio0ii1I00000oOI);
/* 66 */                if (arrayList == null) {
/* 70 */                    arrayList = new ArrayList();
/* 73 */                    linkedHashMap.put(oI1Iio0ii1I00000oOI, arrayList);
                        }
/* 78 */                ((List) arrayList).add(obj);
                    }
/* 86 */            iiOlooi.I00000oIO = IiOlooi.I00000oIO(linkedHashMap);
/* 94 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 105 */           for (Object obj2 : list2) {
/* 124 */               OI1Iio0ii1 oI1Iio0ii1I00000oOI2 = l1iI1lOO.I00000oOI((OI1IlOlol) this.I00000oOI.I00iiO, ((OOOo0i11Ol) ((I01Ilioliio) obj2)).I00ilO0);
/* 128 */               Object arrayList2 = linkedHashMap2.get(oI1Iio0ii1I00000oOI2);
/* 132 */               if (arrayList2 == null) {
/* 136 */                   arrayList2 = new ArrayList();
/* 139 */                   linkedHashMap2.put(oI1Iio0ii1I00000oOI2, arrayList2);
                        }
/* 144 */               ((List) arrayList2).add(obj2);
                    }
/* 152 */           iiOlooi.I00000oOI = IiOlooi.I00000oIO(linkedHashMap2);
/* 164 */           ((i1O01oOIoI0I) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I0000Il00O).getClass();
/* 173 */           LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 184 */           for (Object obj3 : list3) {
/* 203 */               OI1Iio0ii1 oI1Iio0ii1I00000oOI3 = l1iI1lOO.I00000oOI((OI1IlOlol) this.I00000oOI.I00iiO, ((OOi0IOIIOO) ((I01Ilioliio) obj3)).I00ilI0I1);
/* 207 */               Object arrayList3 = linkedHashMap3.get(oI1Iio0ii1I00000oOI3);
/* 211 */               if (arrayList3 == null) {
/* 215 */                   arrayList3 = new ArrayList();
/* 218 */                   linkedHashMap3.put(oI1Iio0ii1I00000oOI3, arrayList3);
                        }
/* 223 */               ((List) arrayList3).add(obj3);
                    }
/* 231 */           iiOlooi.I0000Il00O = IiOlooi.I00000oIO(linkedHashMap3);
/* 241 */           O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 245 */           int i = 0;
/* 246 */           IiOll00ol10O iiOll00ol10O = new IiOll00ol10O(i);
/* 249 */           iiOll00ol10O.I00iiI = iiOlooi;
/* 251 */           VarHandle.storeStoreFence();
/* 258 */           iiOlooi.I0000O = o1I0OloI.I00000oOI(iiOll00ol10O);
/* 268 */           O1I0OloI o1I0OloI2 = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 272 */           int i2 = 1;
/* 273 */           IiOll00ol10O iiOll00ol10O2 = new IiOll00ol10O(i2);
/* 276 */           iiOll00ol10O2.I00iiI = iiOlooi;
/* 278 */           VarHandle.storeStoreFence();
/* 285 */           iiOlooi.I0000oI00 = o1I0OloI2.I00000oOI(iiOll00ol10O2);
/* 295 */           O1I0OloI o1I0OloI3 = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 300 */           IiOll00ol10O iiOll00ol10O3 = new IiOll00ol10O(2);
/* 303 */           iiOll00ol10O3.I00iiI = iiOlooi;
/* 305 */           VarHandle.storeStoreFence();
/* 312 */           iiOlooi.I0001Ioi1lo = o1I0OloI3.I0000Il00O(iiOll00ol10O3);
/* 322 */           O1I0OloI o1I0OloI4 = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 326 */           IiOllll01 iiOllll01 = new IiOllll01(i);
/* 329 */           iiOllll01.I00iiI = iiOlooi;
/* 331 */           iiOllll01.I00iiO = this;
/* 333 */           VarHandle.storeStoreFence();
/* 336 */           o1I0OloI4.getClass();
/* 344 */           iiOlooi.I000II = new O1I0II11i(o1I0OloI4, iiOllll01);
/* 354 */           O1I0OloI o1I0OloI5 = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 358 */           IiOllll01 iiOllll012 = new IiOllll01(i2);
/* 361 */           iiOllll012.I00iiI = iiOlooi;
/* 363 */           iiOllll012.I00iiO = this;
/* 365 */           VarHandle.storeStoreFence();
/* 368 */           o1I0OloI5.getClass();
/* 376 */           iiOlooi.I000O01llI0 = new O1I0II11i(o1I0OloI5, iiOllll012);
/* 378 */           VarHandle.storeStoreFence();
/* 381 */           this.I0000Il00O = iiOlooi;
/* 391 */           O1I0OloI o1I0OloI6 = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 395 */           IiOliI0O0 iiOliI0O0 = new IiOliI0O0(i);
/* 398 */           iiOliI0O0.I00iiI = illOOo00lI;
/* 400 */           VarHandle.storeStoreFence();
/* 403 */           o1I0OloI6.getClass();
/* 411 */           this.I0000O = new O1I0II11i(o1I0OloI6, iiOliI0O0);
/* 421 */           O1I0OloI o1I0OloI7 = (O1I0OloI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00000oIO;
/* 427 */           I01iiIii10O i01iiIii10O = new I01iiIii10O(17);
/* 430 */           i01iiIii10O.I00iiI = this;
/* 432 */           VarHandle.storeStoreFence();
/* 435 */           o1I0OloI7.getClass();
/* 443 */           this.I0000oI00 = new O1I01I0o(o1I0OloI7, i01iiIii10O);
                }

                @Override
                public Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             IiOlooi iiOlooi = this.I0000Il00O;
/* 3 */             O1I0II11i o1I0II11i = iiOlooi.I000II;
/* 8 */             O0O00I1Ili o0O00I1Ili = IiOlooi.I000OiO[0];
                    return !((Set) o1I0II11i.invoke()).contains(oI1Iio0ii1) ? Il01100l.I00iOIl : (Collection) iiOlooi.I0000O.invoke(oI1Iio0ii1);
                }

                @Override
                public final Set I00000oOI() {
/* 3 */             O1I0II11i o1I0II11i = this.I0000Il00O.I000II;
/* 8 */             O0O00I1Ili o0O00I1Ili = IiOlooi.I000OiO[0];
/* 14 */            return (Set) o1I0II11i.invoke();
                }

                @Override
                public final Set I0000O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I0001Ioi1lo[1];
/* 12 */            return (Set) this.I0000oI00.invoke();
                }

                @Override
                public IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 6 */             if (!I00100o1O0lo(oI1Iio0ii1)) {
/* 43 */                IiOlooi iiOlooi = this.I0000Il00O;
/* 55 */                if (iiOlooi.I0000Il00O.keySet().contains(oI1Iio0ii1)) {
/* 63 */                    return (IiOoI0oI) iiOlooi.I0001Ioi1lo.invoke(oI1Iio0ii1);
                        }
/* 5 */                 return null;
                    }
/* 12 */            Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) this.I00000oOI.I00iiI;
/* 14 */            IOIOill iOIOillI000l1 = I000l1(oI1Iio0ii1);
/* 22 */            I1ooIoloo0 i1ooIoloo0 = ((IOIOiIiilIl) ii10lIo0l1.I0010o).I00000oOI;
/* 26 */            IOIOOIoOIO iOIOOIoOIO = new IOIOOIoOIO();
/* 29 */            iOIOOIoOIO.I00000oIO = iOIOillI000l1;
/* 31 */            iOIOOIoOIO.I00000oOI = null;
/* 33 */            VarHandle.storeStoreFence();
/* 40 */            return (OI000ilOol) i1ooIoloo0.invoke(iOIOOIoOIO);
                }

                @Override
                public Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             IiOlooi iiOlooi = this.I0000Il00O;
/* 3 */             O1I0II11i o1I0II11i = iiOlooi.I000O01llI0;
/* 8 */             O0O00I1Ili o0O00I1Ili = IiOlooi.I000OiO[1];
                    return !((Set) o1I0II11i.invoke()).contains(oI1Iio0ii1) ? Il01100l.I00iOIl : (Collection) iiOlooi.I0000oI00.invoke(oI1Iio0ii1);
                }

                @Override
                public final Set I000II() {
/* 3 */             O1I0II11i o1I0II11i = this.I0000Il00O.I000O01llI0;
/* 8 */             O0O00I1Ili o0O00I1Ili = IiOlooi.I000OiO[1];
/* 14 */            return (Set) o1I0II11i.invoke();
                }

                public abstract void I000O01llI0(ArrayList arrayList);

                public final Collection I000OOo1O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iOIl;
/* 6 */             ArrayList arrayList = new ArrayList(0);
/* 15 */            if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I0001Ioi1lo)) {
/* 17 */                I000O01llI0(arrayList);
                    }
/* 20 */            IiOlooi iiOlooi = this.I0000Il00O;
/* 22 */            iiOlooi.getClass();
/* 25 */            O1I0II11i o1I0II11i = iiOlooi.I000II;
/* 27 */            O1I0II11i o1I0II11i2 = iiOlooi.I000O01llI0;
/* 29 */            IliIiio1 iliIiio1 = IliIiio1.I00iio;
/* 33 */            boolean zI00000oIO = iiOOioIIO0.I00000oIO(IiOOioIIO0.I000OiO);
/* 37 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 39 */            if (zI00000oIO) {
/* 44 */                O0O00I1Ili o0O00I1Ili = IiOlooi.I000OiO[1];
/* 50 */                Set<OI1Iio0ii1> set = (Set) o1I0II11i2.invoke();
/* 56 */                ArrayList arrayList2 = new ArrayList();
/* 67 */                for (OI1Iio0ii1 oI1Iio0ii1 : set) {
/* 85 */                    if (((Boolean) function1.invoke(oI1Iio0ii1)).booleanValue()) {
/* 89 */                        O0O00I1Ili o0O00I1Ili2 = IiOlooi.I000OiO[1];
/* 113 */                       arrayList2.addAll(!((Set) o1I0II11i2.invoke()).contains(oI1Iio0ii1) ? il01100l : (Collection) iiOlooi.I0000oI00.invoke(oI1Iio0ii1));
                            }
                        }
/* 117 */               IOOiOil.I000oI1ioi(arrayList2, iliIiio1);
/* 120 */               arrayList.addAll(arrayList2);
                    }
/* 129 */           if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I000OOo1O)) {
/* 133 */               O0O00I1Ili o0O00I1Ili3 = IiOlooi.I000OiO[0];
/* 139 */               Set<OI1Iio0ii1> set2 = (Set) o1I0II11i.invoke();
/* 145 */               ArrayList arrayList3 = new ArrayList();
/* 156 */               for (OI1Iio0ii1 oI1Iio0ii12 : set2) {
/* 174 */                   if (((Boolean) function1.invoke(oI1Iio0ii12)).booleanValue()) {
/* 178 */                       O0O00I1Ili o0O00I1Ili4 = IiOlooi.I000OiO[0];
/* 202 */                       arrayList3.addAll(!((Set) o1I0II11i.invoke()).contains(oI1Iio0ii12) ? il01100l : (Collection) iiOlooi.I0000O.invoke(oI1Iio0ii12));
                            }
                        }
/* 206 */               IOOiOil.I000oI1ioi(arrayList3, iliIiio1);
/* 209 */               arrayList.addAll(arrayList3);
                    }
/* 218 */           if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I000l1)) {
/* 232 */               for (OI1Iio0ii1 oI1Iio0ii13 : I000lI()) {
/* 250 */                   if (((Boolean) function1.invoke(oI1Iio0ii13)).booleanValue()) {
/* 256 */                       Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) this.I00000oOI.I00iiI;
/* 258 */                       IOIOill iOIOillI000l1 = I000l1(oI1Iio0ii13);
/* 266 */                       I1ooIoloo0 i1ooIoloo0 = ((IOIOiIiilIl) ii10lIo0l1.I0010o).I00000oOI;
/* 270 */                       IOIOOIoOIO iOIOOIoOIO = new IOIOOIoOIO();
/* 273 */                       iOIOOIoOIO.I00000oIO = iOIOillI000l1;
/* 276 */                       iOIOOIoOIO.I00000oOI = null;
/* 278 */                       VarHandle.storeStoreFence();
/* 287 */                       iiIiiol0.I00000oIO(arrayList, (OI000ilOol) i1ooIoloo0.invoke(iOIOOIoOIO));
                            }
                        }
                    }
/* 297 */           if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I000II)) {
/* 313 */               for (OI1Iio0ii1 oI1Iio0ii14 : iiOlooi.I0000Il00O.keySet()) {
/* 331 */                   if (((Boolean) function1.invoke(oI1Iio0ii14)).booleanValue()) {
/* 341 */                       iiIiiol0.I00000oIO(arrayList, (IiOoI0oI) iiOlooi.I0001Ioi1lo.invoke(oI1Iio0ii14));
                            }
                        }
                    }
/* 345 */           return iiIiiol0.I00000oOI(arrayList);
                }

                public abstract IOIOill I000l1(OI1Iio0ii1 oI1Iio0ii1);

                public final Set I000lI() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I0001Ioi1lo[0];
/* 12 */            return (Set) this.I0000O.invoke();
                }

                public abstract Set I000o00OoI0I();

                public abstract Set I000oI1ioi();

                public abstract Set I00100l0();

                public boolean I00100o1O0lo(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return I000lI().contains(oI1Iio0ii1);
                }

                public boolean I0010I0i(IiOoI01 iiOoI01) {
/* 1 */             return true;
                }

/* 88 */        public void I000OiO(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
                }

/* 88 */        public void I000iOII(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
                }
            }
