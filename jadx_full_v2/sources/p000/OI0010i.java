            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class OI0010i {
                public static final ConcurrentHashMap I00000oIO = new ConcurrentHashMap();

                /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x023e  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0254  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0260  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0375  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0374 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OiII0Iii I00000oIO(Class cls) {
                    O0I0OOo o0I0OOo;
                    Oi01Iillli oi01Iillli;
                    i000OI i000oi;
                    O0I0OOo o0I0OOo2;
                    I0OI00O i0oi00oI00IlilI0i0i;
                    OO1I1O0ooilo oO1I1O0ooiloI00IlilI0i0i;
                    OiII0Iii oiII0Iii;
                    WeakReference weakReference;
/* 1 */             ClassLoader classLoaderI0000O = OOo1Io0I0.I0000O(cls);
/* 7 */             i000OI i000oi2 = new i000OI();
/* 15 */            i000oi2.I00000oIO = new WeakReference(classLoaderI0000O);
/* 21 */            i000oi2.I00000oOI = System.identityHashCode(classLoaderI0000O);
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            ConcurrentHashMap concurrentHashMap = I00000oIO;
/* 32 */            WeakReference weakReference2 = (WeakReference) concurrentHashMap.get(i000oi2);
/* 34 */            if (weakReference2 != null) {
/* 40 */                OiII0Iii oiII0Iii2 = (OiII0Iii) weakReference2.get();
/* 42 */                if (oiII0Iii2 != null) {
/* 44 */                    return oiII0Iii2;
                        }
/* 45 */                concurrentHashMap.remove(i000oi2, weakReference2);
                    }
/* 50 */            OOoOIoio1i oOoOIoio1i = new OOoOIoio1i(classLoaderI0000O);
/* 61 */            OOoOIoio1i oOoOIoio1i2 = new OOoOIoio1i(OoiIlOl1iI.class.getClassLoader());
/* 66 */            IOoI0IIOlolO iOoI0IIOlolO = new IOoI0IIOlolO();
/* 69 */            iOoI0IIOlolO.I00000oIO = classLoaderI0000O;
/* 71 */            VarHandle.storeStoreFence();
/* 88 */            iolOOiI iolooii = iolOOiI.I00ilO0;
/* 94 */            O1I0OloI o1I0OloI = new O1I0OloI("DeserializationComponentsForJava.ModuleData");
/* 99 */            O0I0IiOlO[] o0I0IiOlOArr = O0I0IiOlO.I00iOIl;
/* 101 */           O0I0OOo o0I0OOo3 = new O0I0OOo(o1I0OloI);
/* 108 */           I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(17);
/* 111 */           i01illiil1Oo.I00iiI = o0I0OOo3;
/* 113 */           i01illiil1Oo.I00iiO = o1I0OloI;
/* 115 */           VarHandle.storeStoreFence();
/* 123 */           o0I0OOo3.I000II = new O1I0II11i(o1I0OloI, i01illiil1Oo);
/* 125 */           VarHandle.storeStoreFence();
/* 155 */           OI0011 oi0011 = new OI0011(OI1Iio0ii1.I000II("<" + ("runtime module for " + classLoaderI0000O) + '>'), o1I0OloI, o0I0OOo3, 56);
/* 158 */           Ol0IlIoIIIoO ol0IlIoIIIoO = o1I0OloI.I00000oIO;
/* 160 */           ol0IlIoIIIoO.lock();
                    try {
/* 165 */               if (o0I0OOo3.I00000oIO != null) {
/* 936 */                   throw new AssertionError("Built-ins module is already set: " + o0I0OOo3.I00000oIO + " (attempting to reset to " + oi0011 + ")");
                        }
/* 167 */               o0I0OOo3.I00000oIO = oi0011;
/* 169 */               ol0IlIoIIIoO.unlock();
/* 175 */               O0I0Ii01Ioo o0I0Ii01Ioo = new O0I0Ii01Ioo(0);
/* 178 */               o0I0Ii01Ioo.I00iiI = oi0011;
/* 180 */               VarHandle.storeStoreFence();
/* 183 */               o0I0OOo3.I0001Ioi1lo = o0I0Ii01Ioo;
/* 188 */               IiOlOOll iiOlOOll = new IiOlOOll();
/* 195 */               O1OIll00i o1OIll00i = new O1OIll00i(23);
/* 200 */               o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0(o1I0OloI, oi0011);
/* 204 */               lOOlOoll loolooll = lOOlOoll.I00ilO0;
/* 213 */               O0iIolI o0iIolI = new O0iIolI(1, 9, 0);
/* 218 */               O00o0oOl1IO1 o00o0oOl1IO1 = O00o0lOioI.I0000O;
/* 220 */               O0iIolI o0iIolI2 = o00o0oOl1IO1.I00000oOI;
/* 222 */               if (o0iIolI2 != null) {
/* 226 */                   o0I0OOo = o0I0OOo3;
/* 231 */                   if (o0iIolI2.I00iio - o0iIolI.I00iio <= 0) {
/* 233 */                       oi01Iillli = o00o0oOl1IO1.I0000Il00O;
                            }
/* 249 */                   Oi01Iillli oi01Iillli2 = oi01Iillli != Oi01Iillli.I00iiI ? null : oi01Iillli;
/* 252 */                   O0I00OIIo o0I00OIIo = new O0I00OIIo();
/* 255 */                   o0I00OIIo.I00000oIO = oi01Iillli;
/* 257 */                   o0I00OIIo.I00000oOI = oi01Iillli2;
/* 263 */                   o0I00OIIo.I0000Il00O = Il011I1OiO0I.I00iOIl;
/* 265 */                   Oi01Iillli oi01Iillli3 = Oi01Iillli.I00iOIl;
/* 273 */                   boolean z = oi01Iillli != oi01Iillli3 && oi01Iillli2 == oi01Iillli3;
/* 274 */                   o0I00OIIo.I0000O = z;
/* 276 */                   VarHandle.storeStoreFence();
/* 281 */                   boolean z2 = z;
/* 285 */                   I00iiI i00iiI = new I00iiI(18);
/* 288 */                   i00iiI.I00iiI = o0iIolI;
/* 290 */                   VarHandle.storeStoreFence();
/* 294 */                   I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(4);
/* 297 */                   i0oO0iO1l0lo.I00iiO = o0I00OIIo;
/* 299 */                   i0oO0iO1l0lo.I00iio = i00iiI;
/* 315 */                   i0oO0iO1l0lo.I00iiI = !z2 || i00iiI.invoke(O00o0lOioI.I00000oIO) == oi01Iillli3;
/* 317 */                   VarHandle.storeStoreFence();
/* 325 */                   IOO0o0I1l iOO0o0I1l = new IOO0o0I1l();
/* 331 */                   OOoiOi oOoiOi = new OOoiOi();
/* 334 */                   oOoiOi.I00000oIO = o01l1iooo0;
/* 336 */                   O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 340 */                   i000oi = i000oi2;
/* 343 */                   O0I0Ii01Ioo o0I0Ii01Ioo2 = new O0I0Ii01Ioo(2);
/* 346 */                   o0I0Ii01Ioo2.I00iiI = oi0011;
/* 348 */                   VarHandle.storeStoreFence();
/* 355 */                   oOoiOi.I00000oOI = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o0I0Ii01Ioo2);
/* 364 */                   oOoiOi.I0000Il00O = new loIOiIO1O1(14);
/* 366 */                   VarHandle.storeStoreFence();
/* 371 */                   I11II1o i11II1o = new I11II1o();
/* 374 */                   i11II1o.I00000oIO = i0oO0iO1l0lo;
/* 381 */                   i11II1o.I00000oOI = new ConcurrentHashMap();
/* 383 */                   VarHandle.storeStoreFence();
/* 394 */                   lo1iloiI1 lo1iloii1 = new lo1iloiI1(12);
/* 397 */                   VarHandle.storeStoreFence();
/* 405 */                   Oi1ol0llI oi1ol0llI = new Oi1ol0llI(15, false);
/* 408 */                   oi1ol0llI.I00iiI = lo1iloii1;
/* 410 */                   VarHandle.storeStoreFence();
/* 415 */                   OIIiioOilI.I00000oOI.getClass();
/* 418 */                   O0I0OOo o0I0OOo4 = o0I0OOo;
/* 420 */                   OIIil1l0IioO oIIil1l0IioO = OIIiii0l1oI0.I00000oOI;
/* 445 */                   I0l1OOl1l10 i0l1OOl1l10 = new I0l1OOl1l10(o1I0OloI, iOoI0IIOlolO, oOoOIoio1i, iiOlOOll, iOO0o0I1l, o1OIll00i, loolooll, oi0011, oOoiOi, i11II1o, oi1ol0llI, oIIil1l0IioO, i0oO0iO1l0lo, new o0llIi(10));
/* 455 */                   O0lI11O o0lI11O = new O0lI11O();
/* 460 */                   liIoOiiO1Oi liiooiio1oi = liIoOiiO1Oi.I00io1l;
/* 465 */                   IIiO01 iIiO01 = new IIiO01(1);
/* 468 */                   VarHandle.storeStoreFence();
/* 474 */                   o0lI11O.I00000oIO = new o01l1ioOo0(i0l1OOl1l10, liiooiio1oi, iIiO01);
/* 484 */                   int i = 3;
/* 502 */                   o0lI11O.I00000oOI = new O1I00llOi((O1I0OloI) i0l1OOl1l10.I00000oIO, new ConcurrentHashMap(3, 1.0f, 2), new OoOi1I011O(13), 0);
/* 504 */                   VarHandle.storeStoreFence();
/* 507 */                   O1lili011o o1lili011o = O1lili011o.I000II;
/* 513 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(16);
/* 516 */                   i1I0i0Ilo1Oi.I00iiI = oOoOIoio1i;
/* 518 */                   i1I0i0Ilo1Oi.I00iiO = iiOlOOll;
/* 520 */                   VarHandle.storeStoreFence();
/* 525 */                   I0Oi111ii i0Oi111ii = new I0Oi111ii(i);
/* 528 */                   i0Oi111ii.I00iiI = oOoOIoio1i;
/* 533 */                   I00iiI i00iiI2 = new I00iiI(0);
/* 536 */                   i00iiI2.I00iiI = i0Oi111ii;
/* 538 */                   VarHandle.storeStoreFence();
/* 545 */                   i0Oi111ii.I00iiO = o1I0OloI.I00000oOI(i00iiI2);
/* 547 */                   i0Oi111ii.I00iio = oi0011;
/* 549 */                   i0Oi111ii.I00ilI0I1 = o01l1iooo0;
/* 556 */                   i0Oi111ii.I00ilO0 = new IIlio101Io(i, oi0011, o01l1iooo0);
/* 558 */                   VarHandle.storeStoreFence();
/* 561 */                   i0Oi111ii.I00io1l = o1lili011o;
/* 565 */                   List listSingletonList = Collections.singletonList(IiIO0OIIoo.I00000oIO);
/* 569 */                   O0i1lI0o1io o0i1lI0o1io = oi0011.I00iio;
/* 577 */                   o0I0OOo2 = o0i1lI0o1io instanceof O0I0OOo ? (O0I0OOo) o0i1lI0o1io : null;
/* 584 */                   IOO0o0I1l iOO0o0I1l2 = IOO0o0I1l.I00iiO;
/* 586 */                   if (o0I0OOo2 != null || (i0oi00oI00IlilI0i0i = o0I0OOo2.I00IlilI0i0i()) == null) {
/* 597 */                       i0oi00oI00IlilI0i0i = Iioi0lilII.I00iiI;
                            }
/* 594 */                   I0OI00O i0oi00o = i0oi00oI00IlilI0i0i;
/* 600 */                   if (o0I0OOo2 != null || (oO1I1O0ooiloI00IlilI0i0i = o0I0OOo2.I00IlilI0i0i()) == null) {
/* 609 */                       oO1I1O0ooiloI00IlilI0i0i = lolIo0.I00io1l;
                            }
/* 611 */                   Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 613 */                   String str = O1I0OloI.I0000O;
/* 624 */                   new ConcurrentHashMap(3, 1.0f, 2);
/* 647 */                   Ii10lIo0l1 ii10lIo0l1 = new Ii10lIo0l1(o1I0OloI, oi0011, i1I0i0Ilo1Oi, i0Oi111ii, o0lI11O, iolooii, iOO0o0I1l2, Il01100l.I00iOIl, o01l1iooo0, i0oi00o, oO1I1O0ooiloI00IlilI0i0i, il1lll0iI, oIIil1l0IioO, listSingletonList, i1O01oOIoI0I.I00oII);
/* 656 */                   iiOlOOll.I00000oIO = ii10lIo0l1;
/* 662 */                   IIOOoll iIOOoll = new IIOOoll(17);
/* 665 */                   iIOOoll.I00iiI = o0lI11O;
/* 667 */                   VarHandle.storeStoreFence();
/* 670 */                   o1OIll00i.I00iiI = iIOOoll;
/* 674 */                   O0I0iO0I1iI o0I0iO0I1iII00IlilI0i0i = o0I0OOo4.I00IlilI0i0i();
/* 678 */                   O0I0iO0I1iI o0I0iO0I1iII00IlilI0i0i2 = o0I0OOo4.I00IlilI0i0i();
/* 682 */                   String str2 = O1I0OloI.I0000O;
/* 687 */                   new ConcurrentHashMap(3, 1.0f, 2);
/* 690 */                   O0I0lI1IOool o0I0lI1IOool = new O0I0lI1IOool();
/* 693 */                   o0I0lI1IOool.I00000oIO = oOoOIoio1i2;
/* 695 */                   o0I0lI1IOool.I00000oOI = oi0011;
/* 699 */                   I00iiI i00iiI3 = new I00iiI(2);
/* 702 */                   i00iiI3.I00iiI = o0I0lI1IOool;
/* 704 */                   VarHandle.storeStoreFence();
/* 711 */                   o0I0lI1IOool.I0000O = o1I0OloI.I0000Il00O(i00iiI3);
/* 720 */                   IIloOI iIloOI = new IIloOI(o0I0lI1IOool, 12);
/* 725 */                   IIIOIlo1oo0 iIIOIlo1oo0 = IIIOIlo1oo0.I000lI;
/* 777 */                   o0I0lI1IOool.I0000Il00O = new Ii10lIo0l1(o1I0OloI, oi0011, iIloOI, new I1I0i0Ilo1Oi(oi0011, o01l1iooo0, iIIOIlo1oo0), o0I0lI1IOool, IOOi1I.I000O01llI0(new IIIOIiIlI(o1I0OloI, oi0011), new O0I0IOo(o1I0OloI, oi0011)), o01l1iooo0, o0I0iO0I1iII00IlilI0i0i, o0I0iO0I1iII00IlilI0i0i2, iIIOIlo1oo0.I00000oIO, oIIil1l0IioO, 262144);
/* 783 */                   List listI00IioO0OiOi = I1IoiO1l.I00IioO0OiOi(new OI0011[]{oi0011});
/* 791 */                   O1OIll00i o1OIll00i2 = new O1OIll00i(18);
/* 794 */                   o1OIll00i2.I00iiI = listI00IioO0OiOi;
/* 796 */                   VarHandle.storeStoreFence();
/* 799 */                   oi0011.I00io1l = o1OIll00i2;
/* 835 */                   oi0011.I00ioIO = new IOl1o0IioiI0(IOOi1I.I000O01llI0(o0lI11O, o0I0lI1IOool), "CompositeProvider@RuntimeModuleData for " + oi0011);
/* 843 */                   IOO000ilo iOO000ilo = new IOO000ilo(22);
/* 846 */                   iOO000ilo.I00iiI = iiOlOOll;
/* 848 */                   iOO000ilo.I00iiO = oOoOIoio1i;
/* 855 */                   iOO000ilo.I00iio = new ConcurrentHashMap();
/* 857 */                   VarHandle.storeStoreFence();
/* 860 */                   oiII0Iii = new OiII0Iii();
/* 863 */                   oiII0Iii.I00000oIO = ii10lIo0l1;
/* 865 */                   oiII0Iii.I00000oOI = iOO000ilo;
/* 867 */                   VarHandle.storeStoreFence();
                            while (true) {
/* 875 */                       i000OI i000oi3 = i000oi;
/* 881 */                       weakReference = (WeakReference) concurrentHashMap.putIfAbsent(i000oi3, new WeakReference(oiII0Iii));
/* 883 */                       if (weakReference != null) {
/* 885 */                           return oiII0Iii;
                                }
/* 890 */                       OiII0Iii oiII0Iii3 = (OiII0Iii) weakReference.get();
/* 892 */                       if (oiII0Iii3 != null) {
/* 894 */                           return oiII0Iii3;
                                }
/* 895 */                       concurrentHashMap.remove(i000oi3, weakReference);
/* 898 */                       i000oi = i000oi3;
                            }
                        } else {
/* 236 */                   o0I0OOo = o0I0OOo3;
                        }
/* 238 */               oi01Iillli = o00o0oOl1IO1.I00000oIO;
/* 249 */               if (oi01Iillli != Oi01Iillli.I00iiI) {
                        }
/* 252 */               O0I00OIIo o0I00OIIo2 = new O0I00OIIo();
/* 255 */               o0I00OIIo2.I00000oIO = oi01Iillli;
/* 257 */               o0I00OIIo2.I00000oOI = oi01Iillli2;
/* 263 */               o0I00OIIo2.I0000Il00O = Il011I1OiO0I.I00iOIl;
/* 265 */               Oi01Iillli oi01Iillli32 = Oi01Iillli.I00iOIl;
/* 273 */               if (oi01Iillli != oi01Iillli32) {
                        }
/* 274 */               o0I00OIIo2.I0000O = z;
/* 276 */               VarHandle.storeStoreFence();
/* 281 */               boolean z22 = z;
/* 285 */               I00iiI i00iiI4 = new I00iiI(18);
/* 288 */               i00iiI4.I00iiI = o0iIolI;
/* 290 */               VarHandle.storeStoreFence();
/* 294 */               I0oO0iO1l0lo i0oO0iO1l0lo2 = new I0oO0iO1l0lo(4);
/* 297 */               i0oO0iO1l0lo2.I00iiO = o0I00OIIo2;
/* 299 */               i0oO0iO1l0lo2.I00iio = i00iiI4;
/* 315 */               i0oO0iO1l0lo2.I00iiI = !z22 || i00iiI4.invoke(O00o0lOioI.I00000oIO) == oi01Iillli32;
/* 317 */               VarHandle.storeStoreFence();
/* 325 */               IOO0o0I1l iOO0o0I1l3 = new IOO0o0I1l();
/* 331 */               OOoiOi oOoiOi2 = new OOoiOi();
/* 334 */               oOoiOi2.I00000oIO = o01l1iooo0;
/* 336 */               O0oI01I0oo o0oI01I0oo2 = O0oI01I0oo.I00iOIl;
/* 340 */               i000oi = i000oi2;
/* 343 */               O0I0Ii01Ioo o0I0Ii01Ioo22 = new O0I0Ii01Ioo(2);
/* 346 */               o0I0Ii01Ioo22.I00iiI = oi0011;
/* 348 */               VarHandle.storeStoreFence();
/* 355 */               oOoiOi2.I00000oOI = l0oi0lOi11i.I00000oIO(o0oI01I0oo2, o0I0Ii01Ioo22);
/* 364 */               oOoiOi2.I0000Il00O = new loIOiIO1O1(14);
/* 366 */               VarHandle.storeStoreFence();
/* 371 */               I11II1o i11II1o2 = new I11II1o();
/* 374 */               i11II1o2.I00000oIO = i0oO0iO1l0lo2;
/* 381 */               i11II1o2.I00000oOI = new ConcurrentHashMap();
/* 383 */               VarHandle.storeStoreFence();
/* 394 */               lo1iloiI1 lo1iloii12 = new lo1iloiI1(12);
/* 397 */               VarHandle.storeStoreFence();
/* 405 */               Oi1ol0llI oi1ol0llI2 = new Oi1ol0llI(15, false);
/* 408 */               oi1ol0llI2.I00iiI = lo1iloii12;
/* 410 */               VarHandle.storeStoreFence();
/* 415 */               OIIiioOilI.I00000oOI.getClass();
/* 418 */               O0I0OOo o0I0OOo42 = o0I0OOo;
/* 420 */               OIIil1l0IioO oIIil1l0IioO2 = OIIiii0l1oI0.I00000oOI;
/* 445 */               I0l1OOl1l10 i0l1OOl1l102 = new I0l1OOl1l10(o1I0OloI, iOoI0IIOlolO, oOoOIoio1i, iiOlOOll, iOO0o0I1l3, o1OIll00i, loolooll, oi0011, oOoiOi2, i11II1o2, oi1ol0llI2, oIIil1l0IioO2, i0oO0iO1l0lo2, new o0llIi(10));
/* 455 */               O0lI11O o0lI11O2 = new O0lI11O();
/* 460 */               liIoOiiO1Oi liiooiio1oi2 = liIoOiiO1Oi.I00io1l;
/* 465 */               IIiO01 iIiO012 = new IIiO01(1);
/* 468 */               VarHandle.storeStoreFence();
/* 474 */               o0lI11O2.I00000oIO = new o01l1ioOo0(i0l1OOl1l102, liiooiio1oi2, iIiO012);
/* 484 */               int i2 = 3;
/* 502 */               o0lI11O2.I00000oOI = new O1I00llOi((O1I0OloI) i0l1OOl1l102.I00000oIO, new ConcurrentHashMap(3, 1.0f, 2), new OoOi1I011O(13), 0);
/* 504 */               VarHandle.storeStoreFence();
/* 507 */               O1lili011o o1lili011o2 = O1lili011o.I000II;
/* 513 */               I1I0i0Ilo1Oi i1I0i0Ilo1Oi2 = new I1I0i0Ilo1Oi(16);
/* 516 */               i1I0i0Ilo1Oi2.I00iiI = oOoOIoio1i;
/* 518 */               i1I0i0Ilo1Oi2.I00iiO = iiOlOOll;
/* 520 */               VarHandle.storeStoreFence();
/* 525 */               I0Oi111ii i0Oi111ii2 = new I0Oi111ii(i2);
/* 528 */               i0Oi111ii2.I00iiI = oOoOIoio1i;
/* 533 */               I00iiI i00iiI22 = new I00iiI(0);
/* 536 */               i00iiI22.I00iiI = i0Oi111ii2;
/* 538 */               VarHandle.storeStoreFence();
/* 545 */               i0Oi111ii2.I00iiO = o1I0OloI.I00000oOI(i00iiI22);
/* 547 */               i0Oi111ii2.I00iio = oi0011;
/* 549 */               i0Oi111ii2.I00ilI0I1 = o01l1iooo0;
/* 556 */               i0Oi111ii2.I00ilO0 = new IIlio101Io(i2, oi0011, o01l1iooo0);
/* 558 */               VarHandle.storeStoreFence();
/* 561 */               i0Oi111ii2.I00io1l = o1lili011o2;
/* 565 */               List listSingletonList2 = Collections.singletonList(IiIO0OIIoo.I00000oIO);
/* 569 */               O0i1lI0o1io o0i1lI0o1io2 = oi0011.I00iio;
/* 577 */               if (o0i1lI0o1io2 instanceof O0I0OOo) {
                        }
/* 584 */               IOO0o0I1l iOO0o0I1l22 = IOO0o0I1l.I00iiO;
/* 586 */               if (o0I0OOo2 != null) {
/* 597 */                   i0oi00oI00IlilI0i0i = Iioi0lilII.I00iiI;
                        }
/* 594 */               I0OI00O i0oi00o2 = i0oi00oI00IlilI0i0i;
/* 600 */               if (o0I0OOo2 != null) {
/* 609 */                   oO1I1O0ooiloI00IlilI0i0i = lolIo0.I00io1l;
                        }
/* 611 */               Il1lll0iI il1lll0iI2 = O0IO00o0OI0.I00000oIO;
/* 613 */               String str3 = O1I0OloI.I0000O;
/* 624 */               new ConcurrentHashMap(3, 1.0f, 2);
/* 647 */               Ii10lIo0l1 ii10lIo0l12 = new Ii10lIo0l1(o1I0OloI, oi0011, i1I0i0Ilo1Oi2, i0Oi111ii2, o0lI11O2, iolooii, iOO0o0I1l22, Il01100l.I00iOIl, o01l1iooo0, i0oi00o2, oO1I1O0ooiloI00IlilI0i0i, il1lll0iI2, oIIil1l0IioO2, listSingletonList2, i1O01oOIoI0I.I00oII);
/* 656 */               iiOlOOll.I00000oIO = ii10lIo0l12;
/* 662 */               IIOOoll iIOOoll2 = new IIOOoll(17);
/* 665 */               iIOOoll2.I00iiI = o0lI11O2;
/* 667 */               VarHandle.storeStoreFence();
/* 670 */               o1OIll00i.I00iiI = iIOOoll2;
/* 674 */               O0I0iO0I1iI o0I0iO0I1iII00IlilI0i0i3 = o0I0OOo42.I00IlilI0i0i();
/* 678 */               O0I0iO0I1iI o0I0iO0I1iII00IlilI0i0i22 = o0I0OOo42.I00IlilI0i0i();
/* 682 */               String str22 = O1I0OloI.I0000O;
/* 687 */               new ConcurrentHashMap(3, 1.0f, 2);
/* 690 */               O0I0lI1IOool o0I0lI1IOool2 = new O0I0lI1IOool();
/* 693 */               o0I0lI1IOool2.I00000oIO = oOoOIoio1i2;
/* 695 */               o0I0lI1IOool2.I00000oOI = oi0011;
/* 699 */               I00iiI i00iiI32 = new I00iiI(2);
/* 702 */               i00iiI32.I00iiI = o0I0lI1IOool2;
/* 704 */               VarHandle.storeStoreFence();
/* 711 */               o0I0lI1IOool2.I0000O = o1I0OloI.I0000Il00O(i00iiI32);
/* 720 */               IIloOI iIloOI2 = new IIloOI(o0I0lI1IOool2, 12);
/* 725 */               IIIOIlo1oo0 iIIOIlo1oo02 = IIIOIlo1oo0.I000lI;
/* 777 */               o0I0lI1IOool2.I0000Il00O = new Ii10lIo0l1(o1I0OloI, oi0011, iIloOI2, new I1I0i0Ilo1Oi(oi0011, o01l1iooo0, iIIOIlo1oo02), o0I0lI1IOool2, IOOi1I.I000O01llI0(new IIIOIiIlI(o1I0OloI, oi0011), new O0I0IOo(o1I0OloI, oi0011)), o01l1iooo0, o0I0iO0I1iII00IlilI0i0i3, o0I0iO0I1iII00IlilI0i0i22, iIIOIlo1oo02.I00000oIO, oIIil1l0IioO2, 262144);
/* 783 */               List listI00IioO0OiOi2 = I1IoiO1l.I00IioO0OiOi(new OI0011[]{oi0011});
/* 791 */               O1OIll00i o1OIll00i22 = new O1OIll00i(18);
/* 794 */               o1OIll00i22.I00iiI = listI00IioO0OiOi2;
/* 796 */               VarHandle.storeStoreFence();
/* 799 */               oi0011.I00io1l = o1OIll00i22;
/* 835 */               oi0011.I00ioIO = new IOl1o0IioiI0(IOOi1I.I000O01llI0(o0lI11O2, o0I0lI1IOool2), "CompositeProvider@RuntimeModuleData for " + oi0011);
/* 843 */               IOO000ilo iOO000ilo2 = new IOO000ilo(22);
/* 846 */               iOO000ilo2.I00iiI = iiOlOOll;
/* 848 */               iOO000ilo2.I00iiO = oOoOIoio1i;
/* 855 */               iOO000ilo2.I00iio = new ConcurrentHashMap();
/* 857 */               VarHandle.storeStoreFence();
/* 860 */               oiII0Iii = new OiII0Iii();
/* 863 */               oiII0Iii.I00000oIO = ii10lIo0l12;
/* 865 */               oiII0Iii.I00000oOI = iOO000ilo2;
/* 867 */               VarHandle.storeStoreFence();
                        while (true) {
/* 875 */                   i000OI i000oi32 = i000oi;
/* 881 */                   weakReference = (WeakReference) concurrentHashMap.putIfAbsent(i000oi32, new WeakReference(oiII0Iii));
/* 883 */                   if (weakReference != null) {
                            }
/* 895 */                   concurrentHashMap.remove(i000oi32, weakReference);
/* 898 */                   i000oi = i000oi32;
                        }
                    } finally {
                    }
                }
            }
