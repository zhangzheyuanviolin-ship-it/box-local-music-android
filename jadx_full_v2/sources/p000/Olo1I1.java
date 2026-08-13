            package p000;

            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Size;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class Olo1I1 implements Iliol1ioii0i {
                public ArrayDeque I00iOIl;
                public IIloOI I00iiI;
                public I1ii1o0 I00iiO;
                public Oi0Oi10I I00iio;
                public ArrayList I00ilI0I1;
                public boolean I00ilO0;

                @Override
                public final void I00000oIO(Ilioo0O0O ilioo0O0O) {
/* 1 */             ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 8 */             Olo11OlI olo11OlI = new Olo11OlI(1);
/* 11 */            olo11OlI.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            ((Io11oioo) scheduledExecutorServiceI0000O).execute(olo11OlI);
                }

                public final void I00000oOI() {
                    int i;
/* 1 */             lOllIO.I00000oIO();
/* 10 */            Ioi1lIO ioi1lIO = new Ioi1lIO("Camera is closed.", null, 3);
/* 13 */            ArrayDeque arrayDeque = this.I00iOIl;
/* 15 */            Iterator it = arrayDeque.iterator();
                    while (true) {
/* 23 */                i = 19;
/* 25 */                if (!it.hasNext()) {
                            break;
                        }
/* 31 */                I1lO0I0 i1lO0I0 = (I1lO0I0) it.next();
/* 33 */                Executor executor = i1lO0I0.I0000Il00O;
/* 37 */                Io11iII11ll io11iII11ll = new Io11iII11ll(i);
/* 40 */                io11iII11ll.I00iiI = i1lO0I0;
/* 42 */                io11iII11ll.I00iiO = ioi1lIO;
/* 44 */                VarHandle.storeStoreFence();
/* 47 */                executor.execute(io11iII11ll);
                    }
/* 51 */            arrayDeque.clear();
/* 61 */            Iterator it2 = new ArrayList(this.I00ilI0I1).iterator();
/* 69 */            while (it2.hasNext()) {
/* 75 */                Oi0Oi10I oi0Oi10I = (Oi0Oi10I) it2.next();
/* 77 */                oi0Oi10I.getClass();
/* 80 */                lOllIO.I00000oIO();
/* 91 */                if (!oi0Oi10I.I0000O.I00iiI.isDone()) {
/* 94 */                    lOllIO.I00000oIO();
/* 98 */                    oi0Oi10I.I000II = true;
/* 100 */                   IO0oo1I0oIO iO0oo1I0oIO = oi0Oi10I.I000OOo1O;
/* 102 */                   Objects.requireNonNull(iO0oo1I0oIO);
/* 105 */                   iO0oo1I0oIO.cancel(true);
/* 110 */                   oi0Oi10I.I0000oI00.I0000O(ioi1lIO);
/* 115 */                   oi0Oi10I.I0001Ioi1lo.I00000oOI(null);
/* 118 */                   lOllIO.I00000oIO();
/* 121 */                   I1lO0I0 i1lO0I02 = oi0Oi10I.I00000oIO;
/* 123 */                   Executor executor2 = i1lO0I02.I0000Il00O;
/* 127 */                   Io11iII11ll io11iII11ll2 = new Io11iII11ll(i);
/* 130 */                   io11iII11ll2.I00iiI = i1lO0I02;
/* 132 */                   io11iII11ll2.I00iiO = ioi1lIO;
/* 134 */                   VarHandle.storeStoreFence();
/* 137 */                   executor2.execute(io11iII11ll2);
                        }
                    }
                }

                public final void I0000Il00O() {
                    I1lO0I0 i1lO0I0;
                    IIl1Ol iIl1Ol;
                    IoilI00 ioilI00;
/* 3 */             lOllIO.I00000oIO();
/* 8 */             if (this.I00iio == null && !this.I00ilO0) {
/* 16 */                I1ii1o0 i1ii1o0 = this.I00iiO;
/* 18 */                i1ii1o0.getClass();
/* 21 */                lOllIO.I00000oIO();
/* 32 */                if (((I0Oi111ii) i1ii1o0.I00iio).I001lIiIIo1O() == 0 || (i1lO0I0 = (I1lO0I0) this.I00iOIl.poll()) == null) {
/* 45 */                    return;
                        }
/* 48 */                Oi0Oi10I oi0Oi10I = new Oi0Oi10I();
/* 51 */                int i = 0;
/* 52 */                oi0Oi10I.I000II = false;
/* 54 */                oi0Oi10I.I000O01llI0 = false;
/* 56 */                oi0Oi10I.I00000oIO = i1lO0I0;
/* 58 */                oi0Oi10I.I00000oOI = this;
/* 62 */                Oi0OOlO100 oi0OOlO100 = new Oi0OOlO100(i);
/* 65 */                oi0OOlO100.I00iiI = oi0Oi10I;
/* 67 */                VarHandle.storeStoreFence();
/* 70 */                IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(oi0OOlO100);
/* 74 */                oi0Oi10I.I0000Il00O = iIiOiI0ilI00000oIO;
/* 79 */                Oi0OOlO100 oi0OOlO1002 = new Oi0OOlO100(1);
/* 82 */                oi0OOlO1002.I00iiI = oi0Oi10I;
/* 84 */                VarHandle.storeStoreFence();
/* 87 */                IIiOiI0il iIiOiI0ilI00000oIO2 = iOiiloIII0O.I00000oIO(oi0OOlO1002);
/* 91 */                oi0Oi10I.I0000O = iIiOiI0ilI00000oIO2;
/* 93 */                VarHandle.storeStoreFence();
/* 105 */               lII1OI11o1I.I0000oI00(null, !(this.I00iio != null));
/* 108 */               this.I00iio = oi0Oi10I;
/* 110 */               lOllIO.I00000oIO();
/* 115 */               Olo11OlI olo11OlI = new Olo11OlI(i);
/* 118 */               olo11OlI.I00iiI = this;
/* 120 */               VarHandle.storeStoreFence();
/* 129 */               iIiOiI0ilI00000oIO.I00iiI.addListener(olo11OlI, Iii11l.I00000oIO());
/* 134 */               this.I00ilI0I1.add(oi0Oi10I);
/* 137 */               lOllIO.I00000oIO();
/* 144 */               Io11iII11ll io11iII11ll = new Io11iII11ll(18);
/* 147 */               io11iII11ll.I00iiI = this;
/* 149 */               io11iII11ll.I00iiO = oi0Oi10I;
/* 151 */               VarHandle.storeStoreFence();
/* 160 */               iIiOiI0ilI00000oIO2.I00iiI.addListener(io11iII11ll, Iii11l.I00000oIO());
/* 163 */               I1ii1o0 i1ii1o02 = this.I00iiO;
/* 165 */               lOllIO.I00000oIO();
/* 168 */               i1ii1o02.getClass();
/* 175 */               lOllIO.I00000oIO();
/* 180 */               Ioi1iI0IiOl ioi1iI0IiOl = (Ioi1iI0IiOl) i1ii1o02.I00iiI;
/* 184 */               IO0IliOOlllI iO0IliOOlllI = new IO0IliOOlllI();
/* 196 */               iO0IliOOlllI.I00000oIO = new I0oiil10Ili().I0001Ioi1lo();
/* 198 */               VarHandle.storeStoreFence();
/* 207 */               List listAsList = Arrays.asList(iO0IliOOlllI);
/* 211 */               IIolo10 iIolo10 = new IIolo10();
/* 214 */               if (listAsList == null || listAsList.isEmpty()) {
/* 761 */                   I000II.I000iOII("Cannot set an empty CaptureStage list.");
/* 2498 */                  return;
                        }
/* 231 */               iIolo10.I00000oIO = Collections.unmodifiableList(new ArrayList(listAsList));
/* 233 */               VarHandle.storeStoreFence();
/* 242 */               IIolo10 iIolo102 = (IIolo10) ioi1iI0IiOl.I00000oOI(Ioi1iI0IiOl.I00iio, iIolo10);
/* 244 */               Objects.requireNonNull(iIolo102);
/* 247 */               List list = iIolo102.I00000oIO;
/* 249 */               int i2 = I1ii1o0.I00io1l;
/* 253 */               I1ii1o0.I00io1l = i2 + 1;
/* 257 */               I1ioOiOI i1ioOiOI = (I1ioOiOI) i1ii1o02.I00ilO0;
/* 261 */               ArrayList arrayList = new ArrayList();
/* 268 */               String strValueOf = String.valueOf(iIolo102.hashCode());
/* 272 */               Objects.requireNonNull(list);
/* 275 */               List<IO0IliOOlllI> list2 = list;
/* 285 */               for (IO0IliOOlllI iO0IliOOlllI2 : list2) {
/* 295 */                   I0oiil10Ili i0oiil10Ili = new I0oiil10Ili();
/* 300 */                   IIoo00iOol0 iIoo00iOol0 = (IIoo00iOol0) i1ii1o02.I00iiO;
/* 302 */                   I1ii1o0 i1ii1o03 = i1ii1o02;
/* 306 */                   i0oiil10Ili.I00iiI = iIoo00iOol0.I0000Il00O;
/* 310 */                   i0oiil10Ili.I0000oI00(iIoo00iOol0.I00000oOI);
/* 315 */                   i0oiil10Ili.I0000Il00O(i1lO0I0.I000iOII);
/* 318 */                   IoilI00 ioilI002 = i1ioOiOI.I0000Il00O;
/* 320 */                   int i3 = i1ioOiOI.I000II;
/* 322 */                   IIolo10 iIolo103 = iIolo102;
/* 324 */                   ArrayList arrayList2 = i1ioOiOI.I000O01llI0;
/* 326 */                   Objects.requireNonNull(ioilI002);
/* 335 */                   ((HashSet) i0oiil10Ili.I00iiO).add(ioilI002);
/* 343 */                   if (arrayList2.size() > 1 && (ioilI00 = i1ioOiOI.I0000O) != null) {
/* 353 */                       ((HashSet) i0oiil10Ili.I00iiO).add(ioilI00);
                            }
/* 356 */                   IoilI00 ioilI003 = i1ioOiOI.I0000oI00;
/* 358 */                   if (ioilI003 != null) {
/* 360 */                       Objects.requireNonNull(ioilI003);
/* 367 */                       ((HashSet) i0oiil10Ili.I00iiO).add(ioilI003);
                            }
/* 374 */                   if (ioOiOIli1i.I00000oOI(i3) || i3 == 32) {
/* 390 */                       if (((ImageCaptureRotationOptionQuirk) IiOol00iooil.I00000oIO.I00000oOI(ImageCaptureRotationOptionQuirk.class)) != null) {
/* 392 */                           I1ioiI i1ioiI = IIoo00iOol0.I0001Ioi1lo;
                                } else {
/* 407 */                           ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(IIoo00iOol0.I0001Ioi1lo, Integer.valueOf(i1lO0I0.I000II));
                                }
/* 410 */                       I1ioiI i1ioiI2 = IIoo00iOol0.I000II;
/* 412 */                       Rect rect = i1lO0I0.I0000oI00;
/* 414 */                       Size size = i1ioOiOI.I0001Ioi1lo;
/* 416 */                       RectF rectF = OoI0lIiO.I00000oIO;
/* 422 */                       if (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth()) {
/* 440 */                           rect.height();
/* 444 */                           size.getHeight();
                                }
/* 458 */                       ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(i1ioiI2, Integer.valueOf(i1lO0I0.I000O01llI0));
                            }
/* 465 */                   i0oiil10Ili.I0000oI00(iO0IliOOlllI2.I00000oIO.I00000oOI);
/* 474 */                   ((OI10ooIio) i0oiil10Ili.I00ilO0).I00000oIO.put(strValueOf, 0);
/* 489 */                   ((OI10ooIio) i0oiil10Ili.I00ilO0).I00000oIO.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i2));
/* 494 */                   i0oiil10Ili.I0000O(i1ioOiOI.I00000oIO);
/* 502 */                   if (arrayList2.size() > 1 && (iIl1Ol = i1ioOiOI.I00000oOI) != null) {
/* 508 */                       i0oiil10Ili.I0000O(iIl1Ol);
                            }
/* 515 */                   arrayList.add(i0oiil10Ili.I0001Ioi1lo());
/* 518 */                   i1ii1o02 = i1ii1o03;
/* 520 */                   iIolo102 = iIolo103;
                        }
/* 531 */               OlOO1i11110 olOO1i11110 = new OlOO1i11110(7);
/* 534 */               olOO1i11110.I00iiI = arrayList;
/* 536 */               olOO1i11110.I00iiO = oi0Oi10I;
/* 538 */               VarHandle.storeStoreFence();
/* 543 */               OOIo1Iiiil oOIo1Iiiil = new OOIo1Iiiil();
/* 547 */               oOIo1Iiiil.I000iOII = -1;
/* 549 */               oOIo1Iiiil.I00000oIO = i2;
/* 551 */               oOIo1Iiiil.I00000oOI = i1lO0I0;
/* 555 */               oOIo1Iiiil.I0000oI00 = i1lO0I0.I000O01llI0;
/* 559 */               oOIo1Iiiil.I0000O = i1lO0I0.I000II;
/* 563 */               oOIo1Iiiil.I0000Il00O = i1lO0I0.I0000oI00;
/* 567 */               oOIo1Iiiil.I0001Ioi1lo = i1lO0I0.I0001Ioi1lo;
/* 569 */               oOIo1Iiiil.I000II = oi0Oi10I;
/* 579 */               oOIo1Iiiil.I000O01llI0 = String.valueOf(iIolo102.hashCode());
/* 586 */               oOIo1Iiiil.I000OOo1O = new ArrayList();
/* 596 */               for (IO0IliOOlllI iO0IliOOlllI3 : list2) {
/* 604 */                   ArrayList arrayList3 = oOIo1Iiiil.I000OOo1O;
/* 606 */                   iO0IliOOlllI3.getClass();
/* 609 */                   arrayList3.add(0);
                        }
/* 613 */               oOIo1Iiiil.I000OiO = iIiOiI0ilI00000oIO;
/* 618 */               l11I11lO.I0000O(3, "ProcessingRequest");
/* 621 */               VarHandle.storeStoreFence();
/* 624 */               I1ii1o0 i1ii1o04 = this.I00iiO;
/* 626 */               i1ii1o04.getClass();
/* 629 */               lOllIO.I00000oIO();
/* 638 */               ((I1ioOiOI) i1ii1o04.I00ilO0).I000OiO.accept(oOIo1Iiiil);
/* 641 */               lOllIO.I00000oIO();
/* 648 */               Ioi1Io1o ioi1Io1o = (Ioi1Io1o) this.I00iiI.I00iiI;
                        synchronized (ioi1Io1o.I0010o) {
                            try {
/* 659 */                       if (ioi1Io1o.I0010o.get() == null) {
/* 675 */                           ioi1Io1o.I0010o.set(Integer.valueOf(ioi1Io1o.I00IOO()));
                                }
                            } finally {
                            }
                        }
/* 679 */               IIloOI iIloOI = this.I00iiI;
/* 683 */               ArrayList arrayList4 = (ArrayList) olOO1i11110.I00iiI;
/* 687 */               Ioi1Io1o ioi1Io1o2 = (Ioi1Io1o) iIloOI.I00iiI;
/* 689 */               lOllIO.I00000oIO();
/* 714 */               IO0oo1I0oIO iO0oo1I0oIOI000II = iIllIoiiIO.I000II(ioi1Io1o2.I0000oI00().I000O01llI0(arrayList4, ioi1Io1o2.I0010I0i, ioi1Io1o2.I00111O), new IoOOl0iOl1io(1), Iii11l.I00000oIO());
/* 722 */               OlOO1i11110 olOO1i111102 = new OlOO1i11110(29);
/* 725 */               olOO1i111102.I00iiO = this;
/* 727 */               olOO1i111102.I00iiI = olOO1i11110;
/* 729 */               VarHandle.storeStoreFence();
/* 736 */               iIllIoiiIO.I00000oIO(iO0oo1I0oIOI000II, olOO1i111102, O1OIIoio0i1.I0000O());
/* 739 */               lOllIO.I00000oIO();
/* 751 */               lII1OI11o1I.I0000oI00("CaptureRequestFuture can only be set once.", oi0Oi10I.I000OOo1O == null);
/* 754 */               oi0Oi10I.I000OOo1O = iO0oo1I0oIOI000II;
                    }
                }
            }
