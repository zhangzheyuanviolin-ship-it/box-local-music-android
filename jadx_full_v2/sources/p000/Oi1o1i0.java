            package p000;

            import android.app.ActivityManager;
            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.RandomAccess;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            public final class Oi1o1i0 {
                public final O0IOli0o0 I00000oIO;
                public final Context I00000oOI;
                public final String I0000Il00O;
                public Executor I0001Ioi1lo;
                public Executor I000II;
                public Olil0oi I000O01llI0;
                public boolean I000OOo1O;
                public final O100010Iili I000l1;
                public final LinkedHashSet I000lI;
                public final LinkedHashSet I000o00OoI0I;
                public final ArrayList I000oI1ioi;
                public boolean I00100l0;
                public boolean I00100o1O0lo;
                public boolean I0010I0i;
                public final boolean I0010o;
                public final ArrayList I0000O = new ArrayList();
                public final ArrayList I0000oI00 = new ArrayList();
                public final Oi1oIOIoI0o I000OiO = Oi1oIOIoI0o.I00iOIl;
                public final long I000iOII = -1;

                public Oi1o1i0(Context context, Class cls, String str) {
/* 28 */            O100010Iili o100010Iili = new O100010Iili();
/* 36 */            o100010Iili.I00000oIO = new LinkedHashMap();
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            this.I000l1 = o100010Iili;
/* 48 */            this.I000lI = new LinkedHashSet();
/* 55 */            this.I000o00OoI0I = new LinkedHashSet();
/* 62 */            this.I000oI1ioi = new ArrayList();
/* 65 */            this.I00100l0 = true;
/* 67 */            this.I0010o = true;
/* 75 */            this.I00000oIO = OOoOl0i.I00000oIO.I00000oOI(cls);
/* 77 */            this.I00000oOI = context;
/* 79 */            this.I0000Il00O = str;
                }

                public final void I00000oIO(O1loO1O1OO... o1loO1O1OOArr) {
/* 4 */             for (O1loO1O1OO o1loO1O1OO : o1loO1O1OOArr) {
/* 10 */                Integer numValueOf = Integer.valueOf(o1loO1O1OO.I00000oIO);
/* 14 */                LinkedHashSet linkedHashSet = this.I000o00OoI0I;
/* 16 */                linkedHashSet.add(numValueOf);
/* 25 */                linkedHashSet.add(Integer.valueOf(o1loO1O1OO.I00000oOI));
                    }
/* 36 */            O1loO1O1OO[] o1loO1O1OOArr2 = (O1loO1O1OO[]) Arrays.copyOf(o1loO1O1OOArr, o1loO1O1OOArr.length);
/* 38 */            O100010Iili o100010Iili = this.I000l1;
/* 40 */            o100010Iili.getClass();
/* 44 */            for (O1loO1O1OO o1loO1O1OO2 : o1loO1O1OOArr2) {
/* 48 */                o100010Iili.I00000oIO(o1loO1O1OO2);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:118:0x0284, code lost:
                
                    p000.I000II.I000iOII("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x0289, code lost:
                
                    return null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oi1oIiOiIi0 I00000oOI() {
                    String name;
                    IioliO10l iioliO10lI0000oI00;
                    boolean zContainsKey;
/* 3 */             Executor executor = this.I0001Ioi1lo;
/* 5 */             if (executor == null && this.I000II == null) {
/* 11 */                I1Ii1lIoOI i1Ii1lIoOI = I1IiIl.I0000Il00O;
/* 13 */                this.I000II = i1Ii1lIoOI;
/* 15 */                this.I0001Ioi1lo = i1Ii1lIoOI;
                    } else if (executor != null && this.I000II == null) {
/* 24 */                this.I000II = executor;
                    } else if (executor == null) {
/* 31 */                this.I0001Ioi1lo = this.I000II;
                    }
/* 33 */            LinkedHashSet linkedHashSet = this.I000o00OoI0I;
/* 35 */            boolean zIsEmpty = linkedHashSet.isEmpty();
/* 39 */            LinkedHashSet linkedHashSet2 = this.I000lI;
/* 41 */            Olil10OiIi1l olil10OiIi1l = null;
/* 42 */            if (!zIsEmpty) {
/* 44 */                Iterator it = linkedHashSet.iterator();
/* 52 */                while (it.hasNext()) {
/* 60 */                    int iIntValue = ((Number) it.next()).intValue();
/* 72 */                    if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
/* 81 */                        I000II.I0010I0i(Oi010OO0.I000oI1ioi(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
/* 41 */                        return null;
                            }
                        }
                    }
/* 85 */            Olil0oi iioi0lilII = this.I000O01llI0;
/* 87 */            if (iioi0lilII == null) {
/* 93 */                iioi0lilII = new Iioi0lilII(12);
                    }
/* 107 */           boolean z = this.I000iOII > 0;
/* 108 */           String str = this.I0000Il00O;
/* 112 */           if (z) {
/* 114 */               if (str != null) {
/* 116 */                   I000II.I000iOII("Required value was null.");
/* 41 */                    return null;
                        }
/* 122 */               I000II.I000iOII("Cannot create auto-closing database for an in-memory database.");
/* 41 */                return null;
                    }
/* 128 */           boolean z2 = this.I000OOo1O;
/* 130 */           Oi1oIOIoI0o oi1oIOIoI0o = this.I000OiO;
/* 132 */           oi1oIOIoI0o.getClass();
/* 135 */           Oi1oIOIoI0o oi1oIOIoI0o2 = Oi1oIOIoI0o.I00iOIl;
/* 137 */           Context context = this.I00000oOI;
/* 139 */           if (oi1oIOIoI0o == oi1oIOIoI0o2) {
/* 144 */               Object systemService = context.getSystemService("activity");
/* 155 */               ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
/* 167 */               oi1oIOIoI0o = (activityManager == null || activityManager.isLowRamDevice()) ? Oi1oIOIoI0o.I00iiI : Oi1oIOIoI0o.I00iiO;
                    }
/* 169 */           Executor executor2 = this.I0001Ioi1lo;
/* 171 */           if (executor2 == null) {
/* 1126 */              I000II.I000iOII("Required value was null.");
/* 41 */                return null;
                    }
/* 173 */           Executor executor3 = this.I000II;
/* 175 */           if (executor3 == null) {
/* 1122 */              I000II.I000iOII("Required value was null.");
/* 41 */                return null;
                    }
/* 177 */           boolean z3 = this.I00100l0;
/* 179 */           boolean z4 = this.I00100o1O0lo;
/* 181 */           boolean z5 = this.I0010I0i;
/* 183 */           Ii1OiOOl1 ii1OiOOl1 = new Ii1OiOOl1();
/* 188 */           ii1OiOOl1.I00000oIO = this.I000l1;
/* 190 */           ii1OiOOl1.I0000Il00O = z2;
/* 192 */           ii1OiOOl1.I0000O = oi1oIOIoI0o;
/* 194 */           ii1OiOOl1.I0000oI00 = executor2;
/* 196 */           ii1OiOOl1.I0001Ioi1lo = executor3;
/* 198 */           ii1OiOOl1.I000II = z3;
/* 200 */           ii1OiOOl1.I000O01llI0 = z4;
/* 202 */           ii1OiOOl1.I000OOo1O = linkedHashSet2;
/* 206 */           ii1OiOOl1.I000OiO = this.I0000oI00;
/* 210 */           ii1OiOOl1.I000iOII = this.I000oI1ioi;
/* 212 */           ii1OiOOl1.I000l1 = z5;
/* 214 */           VarHandle.storeStoreFence();
/* 219 */           ii1OiOOl1.I000lI = this.I0010o;
/* 225 */           Class clsI001l0I00 = ((IOIO10iOi1) this.I00000oIO).I001l0I00();
/* 229 */           Package r5 = clsI001l0I00.getPackage();
/* 235 */           if (r5 == null || (name = r5.getName()) == null) {
/* 233 */               name = "";
                    }
/* 244 */           String canonicalName = clsI001l0I00.getCanonicalName();
/* 252 */           if (name.length() != 0) {
/* 260 */               canonicalName = canonicalName.substring(name.length() + 1);
                    }
/* 274 */           String strConcat = canonicalName.replace('.', '_').concat("_Impl");
                    try {
/* 320 */               Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsI001l0I00.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
/* 324 */               oi1oIiOiIi0.I000iOII = ii1OiOOl1.I000lI;
                        try {
/* 326 */                   iioliO10lI0000oI00 = oi1oIiOiIi0.I0000oI00();
                        } catch (OIO01O unused) {
/* 331 */                   iioliO10lI0000oI00 = null;
                        }
/* 332 */               int i = 17;
/* 334 */               int i2 = 11;
/* 336 */               RandomAccess randomAccess = this.I0000O;
/* 339 */               RandomAccess randomAccess2 = Il01100l.I00iOIl;
/* 341 */               if (iioliO10lI0000oI00 == null) {
/* 345 */                   I0Oi111ii i0Oi111ii = new I0Oi111ii(i2);
/* 348 */                   i0Oi111ii.I00iiI = ii1OiOOl1;
/* 355 */                   i0Oi111ii.I00iiO = new Oi1o01o("", -1, "");
/* 362 */                   i0Oi111ii.I00iio = randomAccess == null ? randomAccess2 : randomAccess;
/* 366 */                   OIoO1Ol oIoO1Ol = new OIoO1Ol(17);
/* 369 */                   oIoO1Ol.I00iiI = i0Oi111ii;
/* 371 */                   VarHandle.storeStoreFence();
/* 374 */                   if (randomAccess == null) {
/* 376 */                       randomAccess = randomAccess2;
                            }
/* 381 */                   IOIio10l0I1I iOIio10l0I1I = new IOIio10l0I1I(1);
/* 384 */                   iOIio10l0I1I.I00000oOI = oIoO1Ol;
/* 386 */                   VarHandle.storeStoreFence();
/* 389 */                   IOOi0Ool1i.I00OI1((Collection) randomAccess, iOIio10l0I1I);
/* 397 */                   throw new OIO01O();
                        }
/* 416 */               IliI1Ii1II iliI1Ii1II = new IliI1Ii1II(2, oi1oIiOiIi0, Oi1oIiilI.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 7);
/* 421 */               I0Oi111ii i0Oi111ii2 = new I0Oi111ii(i2);
/* 424 */               i0Oi111ii2.I00iiI = ii1OiOOl1;
/* 426 */               i0Oi111ii2.I00iiO = iioliO10lI0000oI00;
/* 428 */               if (randomAccess == null) {
/* 430 */                   randomAccess = randomAccess2;
                        }
/* 431 */               i0Oi111ii2.I00iio = randomAccess;
/* 437 */               O1I1OO o1i1oo = new O1I1OO(i0Oi111ii2, iioliO10lI0000oI00.I00000oIO);
/* 442 */               Olil0oI0110I olil0oI0110I = new Olil0oI0110I();
/* 445 */               olil0oI0110I.I00000oIO = context;
/* 447 */               olil0oI0110I.I00000oOI = str;
/* 449 */               olil0oI0110I.I0000Il00O = o1i1oo;
/* 452 */               olil0oI0110I.I0000O = false;
/* 454 */               olil0oI0110I.I0000oI00 = false;
/* 456 */               VarHandle.storeStoreFence();
/* 459 */               Olil10OiIi1l olil10OiIi1lI00IoIO0lI = iioi0lilII.I00IoIO0lI(olil0oI0110I);
/* 463 */               i0Oi111ii2.I00ilO0 = olil10OiIi1lI00IoIO0lI;
/* 469 */               Oi1ol0llI oi1ol0llI = new Oi1ol0llI(i, false);
/* 472 */               oi1ol0llI.I00iiI = olil10OiIi1lI00IoIO0lI;
/* 474 */               VarHandle.storeStoreFence();
/* 477 */               if (str == null) {
/* 479 */                   str = ":memory:";
                        }
/* 481 */               OO01l1 oO01l1 = new OO01l1();
/* 484 */               oO01l1.I00iOIl = oi1ol0llI;
/* 486 */               oO01l1.I00iiI = str;
/* 488 */               oO01l1.I00iiO = iliI1Ii1II;
/* 492 */               OIOo1iiI oIOo1iiI = new OIOo1iiI(1);
/* 495 */               oIOo1iiI.I00iiI = oO01l1;
/* 497 */               VarHandle.storeStoreFence();
/* 505 */               oO01l1.I00iio = new OllO00oiil(oIOo1iiI);
/* 507 */               VarHandle.storeStoreFence();
/* 510 */               i0Oi111ii2.I00ilI0I1 = oO01l1;
/* 521 */               olil10OiIi1lI00IoIO0lI.setWriteAheadLoggingEnabled(ii1OiOOl1.I0000O == Oi1oIOIoI0o.I00iiO);
/* 524 */               VarHandle.storeStoreFence();
/* 527 */               oi1oIiOiIi0.I0000oI00 = i0Oi111ii2;
/* 533 */               oi1oIiOiIi0.I0001Ioi1lo = oi1oIiOiIi0.I0000O();
/* 535 */               O100010Iili o100010Iili = ii1OiOOl1.I00000oIO;
/* 539 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 542 */               Set<O0IOli0o0> setI000OOo1O = oi1oIiOiIi0.I000OOo1O();
/* 546 */               List list = ii1OiOOl1.I000iOII;
/* 548 */               int size = list.size();
/* 552 */               boolean[] zArr = new boolean[size];
/* 562 */               for (O0IOli0o0 o0IOli0o0 : setI000OOo1O) {
                            int size2 = list.size() - 1;
/* 578 */                   if (size2 >= 0) {
                                while (true) {
                                    int i3 = size2 - 1;
/* 590 */                           if (o0IOli0o0.I001i1O0Ol(list.get(size2))) {
/* 592 */                               zArr[size2] = true;
                                        break;
                                    }
/* 595 */                           if (i3 < 0) {
                                        break;
                                    }
/* 598 */                           size2 = i3;
                                }
/* 600 */                       size2 = -1;
                            } else {
/* 600 */                       size2 = -1;
                            }
/* 601 */                   if (size2 < 0) {
/* 619 */                       OIiilo1Ool0o.I0010o(o0IOli0o0.I000O01llI0(), "A required auto migration spec (", ") is missing in the database configuration.");
/* 41 */                        return null;
                            }
/* 607 */                   linkedHashMap.put(o0IOli0o0, list.get(size2));
                        }
                        int size3 = list.size() - 1;
/* 630 */               if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
/* 634 */                       if (size3 >= size || !zArr[size3]) {
                                    break;
                                }
/* 640 */                       if (i4 < 0) {
                                    break;
                                }
/* 643 */                       size3 = i4;
                            }
                        }
/* 663 */               for (O1loO1O1OO o1loO1O1OO : oi1oIiOiIi0.I0000Il00O(linkedHashMap)) {
/* 671 */                   int i5 = o1loO1O1OO.I00000oIO;
/* 673 */                   int i6 = o1loO1O1OO.I00000oOI;
/* 675 */                   o100010Iili.getClass();
/* 678 */                   LinkedHashMap linkedHashMap2 = o100010Iili.I00000oIO;
/* 688 */                   if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
/* 698 */                       Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
/* 700 */                       if (map == null) {
/* 702 */                           map = Il011I1OiO0I.I00iOIl;
                                }
/* 708 */                       zContainsKey = map.containsKey(Integer.valueOf(i6));
                            } else {
/* 713 */                       zContainsKey = false;
                            }
/* 714 */                   if (!zContainsKey) {
/* 716 */                       o100010Iili.I00000oIO(o1loO1O1OO);
                            }
                        }
/* 720 */               LinkedHashMap linkedHashMapI000OiO = oi1oIiOiIi0.I000OiO();
/* 724 */               List list2 = ii1OiOOl1.I000OiO;
/* 730 */               boolean[] zArr2 = new boolean[list2.size()];
/* 744 */               for (Map.Entry entry : linkedHashMapI000OiO.entrySet()) {
/* 756 */                   O0IOli0o0 o0IOli0o02 = (O0IOli0o0) entry.getKey();
/* 772 */                   for (O0IOli0o0 o0IOli0o03 : (List) entry.getValue()) {
                                int size4 = list2.size() - 1;
/* 788 */                       if (size4 >= 0) {
                                    while (true) {
                                        int i7 = size4 - 1;
/* 800 */                               if (o0IOli0o03.I001i1O0Ol(list2.get(size4))) {
/* 802 */                                   zArr2[size4] = true;
                                            break;
                                        }
/* 805 */                               if (i7 < 0) {
                                            break;
                                        }
/* 808 */                               size4 = i7;
                                    }
/* 810 */                           size4 = -1;
                                } else {
/* 810 */                           size4 = -1;
                                }
/* 811 */                       if (size4 < 0) {
/* 837 */                           OIiilo1Ool0o.I000OiO("A required type converter (", o0IOli0o03.I000O01llI0(), ") for ", o0IOli0o02.I000O01llI0(), " is missing in the database configuration.");
/* 41 */                            return null;
                                }
/* 819 */                       oi1oIiOiIi0.I000OiO.put(o0IOli0o03, list2.get(size4));
                            }
                        }
                        int size5 = list2.size() - 1;
/* 849 */               if (size5 >= 0) {
                            while (true) {
                                int i8 = size5 - 1;
/* 855 */                       if (!zArr2[size5]) {
/* 870 */                           OoOil11Ol1o.I000OOo1O(list2.get(size5), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
/* 41 */                            return null;
                                }
/* 857 */                       if (i8 < 0) {
                                    break;
                                }
/* 860 */                       size5 = i8;
                            }
                        }
/* 876 */               oi1oIiOiIi0.I0000Il00O = ii1OiOOl1.I0000oI00;
/* 880 */               Executor executor4 = ii1OiOOl1.I0001Ioi1lo;
/* 882 */               OilOol oilOol = new OilOol(1);
/* 885 */               oilOol.I00iiI = executor4;
/* 892 */               oilOol.I00iiO = new ArrayDeque();
/* 899 */               oilOol.I00ilI0I1 = new Object();
/* 901 */               VarHandle.storeStoreFence();
/* 904 */               oi1oIiOiIi0.I0000O = oilOol;
/* 906 */               Executor executor5 = oi1oIiOiIi0.I0000Il00O;
/* 908 */               if (executor5 == null) {
/* 1027 */                  O0000Ioio00.I000OOo1O("internalQueryExecutor");
/* 1030 */                  throw null;
                        }
/* 922 */               IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(ilIl1O1ii0Oo.I00000oIO(executor5), lOi1li0o0.I00000oIO()));
/* 926 */               oi1oIiOiIi0.I00000oIO = iIOlO1iiI00000oIO;
/* 928 */               Ii00l101O ii00l101O = iIOlO1iiI00000oIO.I00iiI;
/* 930 */               OilOol oilOol2 = oi1oIiOiIi0.I0000O;
/* 932 */               if (oilOol2 == null) {
/* 1021 */                  O0000Ioio00.I000OOo1O("internalTransactionExecutor");
/* 1024 */                  throw null;
                        }
/* 942 */               oi1oIiOiIi0.I00000oOI = ii00l101O.I00ioIO(ilIl1O1ii0Oo.I00000oIO(oilOol2));
/* 946 */               oi1oIiOiIi0.I000O01llI0 = ii1OiOOl1.I0000Il00O;
/* 948 */               I0Oi111ii i0Oi111ii3 = oi1oIiOiIi0.I0000oI00;
/* 952 */               if (i0Oi111ii3 == null) {
/* 1015 */                  O0000Ioio00.I000OOo1O("connectionManager");
/* 1018 */                  throw null;
                        }
/* 956 */               Olil10OiIi1l olil10OiIi1lI00000oIO = (Olil10OiIi1l) i0Oi111ii3.I00ilO0;
/* 958 */               if (olil10OiIi1lI00000oIO == null) {
/* 960 */                   olil10OiIi1lI00000oIO = null;
                            break;
                        }
/* 964 */               while (!(olil10OiIi1lI00000oIO instanceof OO1o10l111)) {
/* 969 */                   if (!(olil10OiIi1lI00000oIO instanceof IiIl00)) {
/* 960 */                       olil10OiIi1lI00000oIO = null;
                                break;
                            }
/* 973 */                   olil10OiIi1lI00000oIO = ((IiIl00) olil10OiIi1lI00000oIO).I00000oIO();
                        }
/* 980 */               I0Oi111ii i0Oi111ii4 = oi1oIiOiIi0.I0000oI00;
/* 982 */               if (i0Oi111ii4 == null) {
/* 1011 */                  O0000Ioio00.I000OOo1O("connectionManager");
/* 1014 */                  throw null;
                        }
/* 986 */               Olil10OiIi1l olil10OiIi1lI00000oIO2 = (Olil10OiIi1l) i0Oi111ii4.I00ilO0;
/* 988 */               if (olil10OiIi1lI00000oIO2 != null) {
                            while (true) {
/* 993 */                       if (olil10OiIi1lI00000oIO2 instanceof I1iiil111olo) {
/* 995 */                           olil10OiIi1l = olil10OiIi1lI00000oIO2;
                                    break;
                                }
/* 999 */                       if (!(olil10OiIi1lI00000oIO2 instanceof IiIl00)) {
                                    break;
                                }
/* 1003 */                      olil10OiIi1lI00000oIO2 = ((IiIl00) olil10OiIi1lI00000oIO2).I00000oIO();
                            }
                        }
/* 1010 */              return oi1oIiOiIi0;
                    } catch (ClassNotFoundException e) {
/* 1121 */              throw new RuntimeException("Cannot find implementation for " + clsI001l0I00.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
                    } catch (IllegalAccessException e2) {
/* 1084 */              throw new RuntimeException("Cannot access the constructor " + clsI001l0I00.getCanonicalName(), e2);
                    } catch (InstantiationException e3) {
/* 1060 */              throw new RuntimeException("Failed to create an instance of " + clsI001l0I00.getCanonicalName(), e3);
                    }
                }
            }
