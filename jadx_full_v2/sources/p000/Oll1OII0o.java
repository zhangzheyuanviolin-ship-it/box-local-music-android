            package p000;

            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class Oll1OII0o extends O1ooOo implements OO1io0l0, IiIooOOOI, OO1iloII0lOo {
                public Object I00o0iI0io1;
                public Object I00o0l1o1o0;
                public PointerInputEventHandler I00o101lO;
                public OlIl0i I00oI0i;
                public OO1Oooio101 I00oII = Oll10I.I00000oIO;
                public final OI110O0 I00oIiI10;
                public final OI110O0 I00oO101o;
                public final OI110O0 I00oOio10iI1;
                public OO1Oooio101 I00ol1;
                public long I00olI;

                public Oll1OII0o(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
/* 4 */             this.I00o0iI0io1 = obj;
/* 6 */             this.I00o0l1o1o0 = obj2;
/* 8 */             this.I00o101lO = pointerInputEventHandler;
/* 20 */            OI110O0 oi110o0 = new OI110O0(new Oll11lOlo[16]);
/* 23 */            this.I00oIiI10 = oi110o0;
/* 25 */            this.I00oO101o = oi110o0;
/* 34 */            this.I00oOio10iI1 = new OI110O0(new Oll11lOlo[16]);
/* 38 */            this.I00olI = 0L;
                }

                @Override
                public final float I00000oIO() {
/* 7 */             return il0lI1i1olii.I000O01llI0(this).I00oliIiO01i.I00000oIO();
                }

                @Override
                public final void I0000O() {
/* 1 */             I010lI0oi();
                }

                @Override
                public final void I001l0I00(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l, long j) {
/* 1 */             this.I00olI = j;
/* 5 */             if (oO1i0l == OO1i0l.I00iOIl) {
/* 7 */                 this.I00oII = oO1Oooio101;
                    }
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 12 */            if (this.I00oI0i == null) {
/* 32 */                this.I00oI0i = iOi1II01i0.I0000O(I00ooiO1I(), null, Ii01I10.I00iio, new O1iOlO(this, iOoil1iiIilo, 8), 1);
                    }
/* 34 */            I010l1ol111(oO1Oooio101, oO1i0l);
/* 37 */            List list = oO1Oooio101.I00000oIO;
/* 42 */            int size = list.size();
/* 46 */            int i = 0;
                    while (true) {
/* 47 */                if (i >= size) {
/* 65 */                    oO1Oooio101 = null;
                            break;
                        } else if (!lI1Ol11OOlll.I0000O((OO1il00lI) list.get(i))) {
                            break;
                        } else {
/* 62 */                    i++;
                        }
                    }
/* 66 */            this.I00ol1 = oO1Oooio101;
                }

                @Override
                public final void I00IO1oi11O() {
/* 3 */             OO1Oooio101 oO1Oooio101 = this.I00ol1;
/* 5 */             if (oO1Oooio101 == null) {
/* 7 */                 return;
                    }
/* 8 */             List list = oO1Oooio101.I00000oIO;
/* 13 */            int size = list.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 29 */                if (((OO1il00lI) list.get(i)).I0000O) {
/* 37 */                    ArrayList arrayList = new ArrayList(list.size());
/* 43 */                    int size2 = list.size();
/* 47 */                    for (int i2 = 0; i2 < size2; i2++) {
/* 53 */                        OO1il00lI oO1il00lI = (OO1il00lI) list.get(i2);
/* 55 */                        long j = oO1il00lI.I00000oIO;
/* 57 */                        long j2 = oO1il00lI.I0000Il00O;
/* 59 */                        long j3 = oO1il00lI.I00000oOI;
/* 61 */                        float f = oO1il00lI.I0000oI00;
/* 63 */                        boolean z = oO1il00lI.I0000O;
/* 88 */                        arrayList.add(new OO1il00lI(j, j3, j2, false, f, j3, j2, z, z, oO1il00lI.I000OOo1O, 0L, 1.0f, 0L));
                            }
/* 97 */                    OO1Oooio101 oO1Oooio1012 = new OO1Oooio101(arrayList, null);
/* 100 */                   this.I00oII = oO1Oooio1012;
/* 104 */                   I010l1ol111(oO1Oooio1012, OO1i0l.I00iOIl);
/* 109 */                   I010l1ol111(oO1Oooio1012, OO1i0l.I00iiI);
/* 114 */                   I010l1ol111(oO1Oooio1012, OO1i0l.I00iiO);
/* 117 */                   this.I00ol1 = null;
/* 119 */                   return;
                        }
                    }
                }

                @Override
                public final float I00Ol00() {
/* 7 */             return il0lI1i1olii.I000O01llI0(this).I00oliIiO01i.I00Ol00();
                }

                @Override
                public final void I00oIiI10() {
/* 1 */             I010lI0oi();
                }

                @Override
                public final void I010I0() {
/* 1 */             I010lI0oi();
                }

                public final Object I010l1O(IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 11 */            iIoOoIol0Io0.I00111O();
/* 16 */            Oll11lOlo oll11lOlo = new Oll11lOlo();
/* 19 */            oll11lOlo.I00ilO0 = this;
/* 21 */            oll11lOlo.I00iOIl = this;
/* 23 */            oll11lOlo.I00iiI = iIoOoIol0Io0;
/* 27 */            oll11lOlo.I00iio = OO1i0l.I00iiI;
/* 31 */            oll11lOlo.I00ilI0I1 = Il00o11.I00iOIl;
/* 33 */            VarHandle.storeStoreFence();
                    synchronized (this.I00oO101o) {
/* 41 */                this.I00oIiI10.I00000oOI(oll11lOlo);
/* 61 */                new OiIOol0(l00iIoI.I0000Il00O(l00iIoI.I00000oIO(oll11lOlo, oll11lOlo, illiIl1l11O)), Ii0111o.I00iOIl).resumeWith(OoiIlOl1iI.I00000oIO);
                    }
/* 68 */            OiI0lII1i oiI0lII1i = new OiI0lII1i(3);
/* 71 */            oiI0lII1i.I00iiI = oll11lOlo;
/* 73 */            VarHandle.storeStoreFence();
/* 76 */            iIoOoIol0Io0.I001IO000(oiI0lII1i);
/* 79 */            return iIoOoIol0Io0.I0010I0i();
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0021, B:17:0x0024, B:20:0x0030, B:22:0x0038, B:24:0x003c, B:25:0x0041, B:26:0x0044, B:28:0x004d, B:30:0x0055, B:32:0x0059), top: B:41:0x000d }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010l1ol111(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l) {
                    int i;
                    int i2;
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    IIoOoIol0Io0 iIoOoIol0Io02;
                    synchronized (this.I00oO101o) {
/* 4 */                 OI110O0 oi110o0 = this.I00oOio10iI1;
/* 10 */                oi110o0.I0000Il00O(oi110o0.I00iiO, this.I00oIiI10);
                    }
                    try {
/* 14 */                int iOrdinal = oO1i0l.ordinal();
/* 19 */                if (iOrdinal == 0) {
/* 69 */                    OI110O0 oi110o02 = this.I00oOio10iI1;
/* 71 */                    Object[] objArr = oi110o02.I00iOIl;
/* 73 */                    i = oi110o02.I00iiO;
/* 76 */                    for (i2 = 0; i2 < i; i2++) {
/* 80 */                        Oll11lOlo oll11lOlo = (Oll11lOlo) objArr[i2];
/* 84 */                        if (oO1i0l == oll11lOlo.I00iio && (iIoOoIol0Io0 = oll11lOlo.I00iiO) != null) {
/* 90 */                            oll11lOlo.I00iiO = null;
/* 92 */                            iIoOoIol0Io0.resumeWith(oO1Oooio101);
                                }
                            }
                        } else if (iOrdinal == 1) {
/* 37 */                    OI110O0 oi110o03 = this.I00oOio10iI1;
/* 41 */                    int i3 = oi110o03.I00iiO - 1;
/* 42 */                    Object[] objArr2 = oi110o03.I00iOIl;
/* 45 */                    if (i3 < objArr2.length) {
/* 47 */                        while (i3 >= 0) {
/* 51 */                            Oll11lOlo oll11lOlo2 = (Oll11lOlo) objArr2[i3];
/* 55 */                            if (oO1i0l == oll11lOlo2.I00iio && (iIoOoIol0Io02 = oll11lOlo2.I00iiO) != null) {
/* 61 */                                oll11lOlo2.I00iiO = null;
/* 63 */                                iIoOoIol0Io02.resumeWith(oO1Oooio101);
                                    }
                                    i3--;
                                }
                            }
                        } else {
/* 25 */                    if (iOrdinal != 2) {
/* 34 */                        throw new IOiIIo1l(6);
                            }
/* 69 */                    OI110O0 oi110o022 = this.I00oOio10iI1;
/* 71 */                    Object[] objArr3 = oi110o022.I00iOIl;
/* 73 */                    i = oi110o022.I00iiO;
/* 76 */                    while (i2 < i) {
                            }
                        }
/* 100 */               this.I00oOio10iI1.I000II();
                    } catch (Throwable th) {
/* 106 */               this.I00oOio10iI1.I000II();
/* 109 */               throw th;
                    }
                }

                public final void I010lI0oi() {
/* 1 */             OlIl0i olIl0i = this.I00oI0i;
/* 3 */             if (olIl0i != null) {
/* 13 */                olIl0i.I001IIilI0O(new O1ooo00oi10("Pointer input was reset", 2));
/* 17 */                this.I00oI0i = null;
                    }
                }
            }
