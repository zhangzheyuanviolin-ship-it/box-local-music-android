            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.os.Trace;
            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public final class IIll0oO implements AutoCloseable, IIlOIo0OlliO {
                public final Io0oi0 I00iOIl;
                public final Io0oi0 I00iiI;
                public final OlOO00iI0lI I00iiO;
                public final OlioOlO1 I00iio;
                public final IIioIlI0 I00ilI0I1;
                public final IllI1oI I00ilO0;
                public final IllI1OilO0O I00io1l;
                public final I1iIilO0io01 I00ioIO;
                public final IIll0Oilo I00l0I0l0lO1;
                public final IIll10 I00l0OO0IO;
                public final IIll1I0 I00li1OI;
                public final Io0olIl I00ll1;
                public final Ii0110 I00lli11;
                public final IOol1Ol I00lll10;
                public final I1Ool1IoO110 I00o0iI0io1;

                public IIll0oO(IIliIi1O0OiO iIliIi1O0OiO, IIlo0i0ll iIlo0i0ll, Io0oi0 io0oi0, Io0oi0 io0oi02, OlOO00iI0lI olOO00iI0lI, OlioOlO1 olioOlO1, IIioIlI0 iIioIlI0, IllI1oI illI1oI, IllI1OilO0O illI1OilO0O, I1iIilO0io01 i1iIilO0io01, IIll0Oilo iIll0Oilo, IIll10 iIll10, IIll1I0 iIll1I0, Io0olIl io0olIl, Ii0110 ii0110, IOol1Ol iOol1Ol) {
                    String strI00000oOI;
                    Iterator it;
                    List list;
                    int i = iIliIi1O0OiO.I000O01llI0;
                    List list2 = olOO00iI0lI.I00ilO0;
/* 2 */             this.I00iOIl = io0oi0;
/* 3 */             this.I00iiI = io0oi02;
/* 4 */             this.I00iiO = olOO00iI0lI;
/* 5 */             this.I00iio = olioOlO1;
/* 6 */             this.I00ilI0I1 = iIioIlI0;
/* 7 */             this.I00ilO0 = illI1oI;
/* 8 */             this.I00io1l = illI1OilO0O;
/* 9 */             this.I00ioIO = i1iIilO0io01;
/* 10 */            this.I00l0I0l0lO1 = iIll0Oilo;
/* 11 */            this.I00l0OO0IO = iIll10;
/* 12 */            this.I00li1OI = iIll1I0;
/* 13 */            this.I00ll1 = io0olIl;
/* 14 */            this.I00lli11 = ii0110;
/* 15 */            this.I00lll10 = iOol1Ol;
/* 16 */            this.I00o0iI0io1 = iOOOIOoiIlII.I00000oIO(false);
/* 17 */            String str = iIliIi1O0OiO.I00000oIO;
                    IIioli iIioli = (IIioli) iIlo0i0ll;
/* 18 */            Integer num = (Integer) iIioli.I0000O(CameraCharacteristics.LENS_FACING);
/* 19 */            String str2 = "External";
                    String str3 = "Unknown";
                    int i2 = 1;
/* 21 */            String str4 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
/* 22 */            Integer num2 = (Integer) iIioli.I0000O(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
/* 23 */            if (num2 != null && num2.intValue() == 0) {
                        str2 = "Limited";
                    } else if (num2 != null && num2.intValue() == 1) {
                        str2 = "Full";
                    } else if (num2 != null && num2.intValue() == 2) {
                        str2 = "Legacy";
                    } else if (num2 != null && num2.intValue() == 3) {
                        str2 = "Level 3";
                    } else if (num2 == null || num2.intValue() != 4) {
                        str2 = "Unknown";
                    }
                    if (i == 1) {
/* 28 */                str3 = "High Speed";
                    } else if (i == 0) {
/* 29 */                str3 = OIllioIilO.I01IO1il;
                    } else if (i == 2) {
/* 30 */                str3 = "Extension";
                    }
/* 31 */            int[] iArr = (int[]) iIioli.I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 34 */            String str5 = (iArr == null || !I1IoiO1l.I0000oI00(iArr, 11)) ? "Physical" : "Logical";
/* 35 */            StringBuilder sb = new StringBuilder();
                    sb.append(this + " (Camera " + str + ")\n");
/* 37 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("  Facing:    ", str4, " (", str5, ", ");
/* 39 */            sbI00111O.append(str2);
                    sbI00111O.append(")\n");
                    sb.append(sbI00111O.toString());
                    sb.append("  Mode:      " + str3 + '\n');
/* 41 */            sb.append("Outputs:\n");
/* 43 */            Iterator it2 = olOO00iI0lI.I00io1l.iterator();
                    while (true) {
                        int i3 = 12;
                        if (!it2.hasNext()) {
                            List<OlOIloo1i> list3 = list2;
                            int i4 = i2;
/* 86 */                    if (!list3.isEmpty()) {
/* 87 */                        sb.append("Inputs:\n");
                                for (OlOIloo1i olOIloo1i : list3) {
/* 89 */                            sb.append(" ");
/* 92 */                            sb.append(OlOoOIi0o.I00II0oii1o(12, "Input-" + olOIloo1i.I00000oIO));
/* 94 */                            sb.append(OlOoOIi0o.I00II0oii1o(12, OlOIOoII1i.I0000Il00O(olOIloo1i.I00000oOI)));
/* 95 */                            sb.append(OlOoOIi0o.I00II0oii1o(12, String.valueOf(i4)));
/* 96 */                            sb.append("\n");
                                }
                            }
                            sb.append("Session Template: " + Oi0OO1IIl1.I00000oOI(iIliIi1O0OiO.I0001Ioi1lo) + '\n');
/* 102 */                   il0O10I11O0.I00000oIO(sb, "Session Parameters", iIliIi1O0OiO.I000II);
                            sb.append("Default Template: " + Oi0OO1IIl1.I00000oOI(i4) + '\n');
/* 106 */                   il0O10I11O0.I00000oIO(sb, "Default Parameters", iIliIi1O0OiO.I000OOo1O);
/* 109 */                   il0O10I11O0.I00000oIO(sb, "Required Parameters", iIliIi1O0OiO.I000l1);
/* 111 */                   Log.i("CXCP", sb.toString());
                            if (i == i4) {
/* 114 */                       if (this.I00iiO.I00ioIO.isEmpty()) {
/* 130 */                           I000II.I000iOII("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                                    throw null;
                                }
/* 117 */                       int size = this.I00iiO.I00ioIO.size();
/* 118 */                       OlOO00iI0lI olOO00iI0lI2 = this.I00iiO;
                                if (size > 2) {
/* 128 */                           OIiilo1Ool0o.I000O01llI0("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ", olOO00iI0lI2.I00ioIO);
                                    throw null;
                                }
/* 119 */                       ArrayList arrayList = olOO00iI0lI2.I00ioIO;
/* 120 */                       if (arrayList == null || !arrayList.isEmpty()) {
/* 121 */                           Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
/* 122 */                               if (!((OlOIo0l1O0Ol) it3.next()).I00000oIO()) {
/* 125 */                                   OIiilo1Ool0o.I000O01llI0("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ", this.I00iiO.I00ioIO);
                                            throw null;
                                        }
                                    }
                                }
                            }
/* 131 */                   ArrayList arrayList2 = iIliIi1O0OiO.I0000O;
/* 132 */                   if (arrayList2 != null && arrayList2.isEmpty()) {
/* 134 */                       I000II.I000iOII("At least one InputConfiguration is required for reprocessing");
                                throw null;
                            }
/* 137 */                   if (this.I00iiO.I00ilI0I1.isEmpty()) {
                                return;
                            }
/* 138 */                   this.I00iio.I00000oIO();
                            return;
                        }
                        int i5 = 0;
                        for (Object obj : ((IIo1loI0) it2.next()).I00000oOI) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
/* 85 */                        IOOi1I.I000lI();
                                throw null;
                            }
                            OlOIo0l1O0Ol olOIo0l1O0Ol = (OlOIo0l1O0Ol) obj;
/* 46 */                    sb.append("  ");
                            if (i5 == 0) {
/* 47 */                        IIo1loI0 iIo1loI0 = olOIo0l1O0Ol.I000OiO;
                                if (iIo1loI0 == null) {
/* 50 */                            O0000Ioio00.I000OOo1O("stream");
                                    throw null;
                                }
/* 49 */                        strI00000oOI = OlOO0I1.I00000oOI(iIo1loI0.I00000oIO);
                            } else {
/* 51 */                        strI00000oOI = "";
                            }
/* 52 */                    sb.append(OlOoOIi0o.I00II0oii1o(i3, strI00000oOI));
/* 53 */                    int i7 = olOIo0l1O0Ol.I00000oIO;
                            String str6 = olOIo0l1O0Ol.I0000O;
/* 54 */                    sb.append(OlOoOIi0o.I00II0oii1o(i3, OIl1lI0ll101.I00000oOI(i7)));
/* 56 */                    sb.append(OlOoOIi0o.I00II0oii1o(i3, olOIo0l1O0Ol.I00000oOI.toString()));
                            int i8 = i2;
/* 58 */                    sb.append(OlOoOIi0o.I00II0oii1o(16, OlOIOoII1i.I00000oOI(olOIo0l1O0Ol.I0000Il00O)));
/* 59 */                    OIlIOlIi oIlIOlIi = olOIo0l1O0Ol.I0000oI00;
                            if (oIlIOlIi != null) {
/* 61 */                        int i9 = oIlIOlIi.I00000oIO;
/* 62 */                        StringBuilder sb2 = new StringBuilder(" [");
                                it = it2;
/* 64 */                        sb2.append((Object) ("MirrorMode(value=" + i9 + ')'));
                                sb2.append(']');
                                sb.append(sb2.toString());
                            } else {
                                it = it2;
                            }
/* 65 */                    OIlII1I1 oIlII1I1 = olOIo0l1O0Ol.I0001Ioi1lo;
                            if (oIlII1I1 != null) {
/* 66 */                        long j = oIlII1I1.I00000oIO;
/* 67 */                        StringBuilder sb3 = new StringBuilder(" [");
                                list = list2;
/* 69 */                        sb3.append((Object) ("DynamicRangeProfile(value=" + j + ')'));
                                sb3.append(']');
                                sb.append(sb3.toString());
                            } else {
                                list = list2;
                            }
/* 70 */                    OIlIOo oIlIOo = olOIo0l1O0Ol.I000II;
                            if (oIlIOo != null) {
/* 71 */                        long j2 = oIlIOo.I00000oIO;
/* 72 */                        StringBuilder sb4 = new StringBuilder(" [");
/* 74 */                        sb4.append((Object) ("StreamUseCase(value=" + j2 + ')'));
                                sb4.append(']');
                                sb.append(sb4.toString());
                            }
/* 75 */                    OIlIOoOil oIlIOoOil = olOIo0l1O0Ol.I000OOo1O;
                            if (oIlIOoOil != null) {
/* 76 */                        long j3 = oIlIOoOil.I00000oIO;
/* 77 */                        StringBuilder sb5 = new StringBuilder(" [");
/* 79 */                        sb5.append((Object) ("StreamUseHint(value=" + j3 + ')'));
                                sb5.append(']');
                                sb.append(sb5.toString());
                            }
/* 80 */                    if (!str6.equals(str)) {
/* 81 */                        sb.append(" [");
/* 82 */                        sb.append(IIllI0o.I00000oIO(str6));
/* 83 */                        sb.append("]");
                            }
/* 84 */                    sb.append("\n");
                            i2 = i8;
                            it2 = it;
                            i5 = i6;
                            list2 = list;
                            i3 = 12;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IOoilo iOoilo) throws Throwable {
                    IIll0i1oIo iIll0i1oIo;
/* 3 */             if (iOoilo instanceof IIll0i1oIo) {
/* 6 */                 iIll0i1oIo = (IIll0i1oIo) iOoilo;
/* 8 */                 int i = iIll0i1oIo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIll0i1oIo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIll0i1oIo = new IIll0i1oIo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = iIll0i1oIo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIll0i1oIo.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 50 */                iIll0i1oIo.I00iiO = 1;
/* 54 */                objI00000oIO = this.I00ll1.I00000oIO(iIll0i1oIo);
/* 58 */                if (objI00000oIO == ii0111o) {
/* 60 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 65 */            IIll1i iIll1i = new IIll1i();
/* 68 */            iIll1i.I00iOIl = (OI1I11lO1i) objI00000oIO;
/* 72 */            iIll1i.I00iiI = this.I00iOIl;
/* 76 */            iIll1i.I00iiO = this.I00lll10;
/* 80 */            iIll1i.I00iio = this.I00l0OO0IO;
/* 84 */            iIll1i.I00ilI0I1 = this.I00li1OI;
/* 86 */            I1OollilIo i1OollilIo = IIll1io0i1I1.I00000oIO;
/* 88 */            i1OollilIo.getClass();
/* 97 */            iIll1i.I00ilO0 = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 99 */            VarHandle.storeStoreFence();
/* 168 */           return iIll1i;
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(int i, Surface surface) throws Exception {
                    String str;
                    AutoCloseable autoCloseable;
                    boolean zIsTerminated;
/* 22 */            Trace.beginSection(((Object) OlOO0I1.I00000oOI(i)) + "#setSurface");
/* 25 */            if (surface != null && !surface.isValid()) {
/* 60 */                Log.w("CXCP", this + "#setSurface: " + surface + " is invalid");
                    }
/* 63 */            OlioOlO1 olioOlO1 = this.I00iio;
/* 87 */            if (olioOlO1.I00iio.keySet().contains(OlOO0I1.I00000oIO(i))) {
/* 384 */               StringBuilder sb = new StringBuilder("Cannot configure surface for ");
/* 391 */               sb.append((Object) OlOO0I1.I00000oOI(i));
/* 406 */               I000II.I000oI1ioi(sb, ", it is permanently assigned to ", olioOlO1.I00iio.get(OlOO0I1.I00000oIO(i)));
/* 900 */               return;
                    }
                    synchronized (olioOlO1.I00ilI0I1) {
/* 94 */                if (!olioOlO1.I00l0I0l0lO1) {
/* 141 */                   if (surface != null) {
/* 163 */                       str = "Configured " + ((Object) OlOO0I1.I00000oOI(i)) + " with " + surface;
                            } else {
/* 180 */                       str = "Removed surface for " + ((Object) OlOO0I1.I00000oOI(i));
                            }
/* 184 */                   Log.i("CXCP", str);
/* 187 */                   LinkedHashMap linkedHashMap = olioOlO1.I00ilO0;
/* 189 */                   if (surface == null) {
/* 199 */                       Surface surface2 = (Surface) linkedHashMap.remove(OlOO0I1.I00000oIO(i));
/* 304 */                       autoCloseable = (!olioOlO1.I00ioIO || surface2 == null) ? null : (AutoCloseable) olioOlO1.I00io1l.remove(surface2);
/* 306 */                       olioOlO1.I00000oIO();
/* 309 */                       if (autoCloseable != null) {
/* 313 */                           if (autoCloseable instanceof AutoCloseable) {
/* 315 */                               autoCloseable.close();
                                    } else {
/* 321 */                               if (!(autoCloseable instanceof ExecutorService)) {
/* 370 */                                   OIiilo1Ool0o.I00100o1O0lo();
/* 373 */                                   return;
                                        }
/* 323 */                               ExecutorService executorService = (ExecutorService) autoCloseable;
/* 329 */                               if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 338 */                                   executorService.shutdown();
/* 341 */                                   boolean z = false;
/* 342 */                                   while (!zIsTerminated) {
                                                try {
/* 348 */                                           zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
/* 353 */                                           if (!z) {
/* 355 */                                               executorService.shutdownNow();
/* 358 */                                               z = true;
                                                    }
                                                }
                                            }
/* 360 */                                   if (z) {
/* 366 */                                       Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                            } else {
/* 224 */                       Surface surface3 = (Surface) linkedHashMap.get(OlOO0I1.I00000oIO(i));
/* 232 */                       olioOlO1.I00ilO0.put(OlOO0I1.I00000oIO(i), surface);
/* 237 */                       if (olioOlO1.I00ioIO && !O0000Ioio00.I0000O(surface3, surface)) {
/* 251 */                           if (olioOlO1.I00io1l.containsKey(surface)) {
/* 303 */                               throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                                    }
/* 263 */                           autoCloseable = (AutoCloseable) OoOOI1100oI0.I00000oIO(olioOlO1.I00io1l).remove(surface3);
/* 273 */                           olioOlO1.I00io1l.put(surface, olioOlO1.I00iiO.I00000oIO(surface));
                                }
/* 306 */                       olioOlO1.I00000oIO();
/* 309 */                       if (autoCloseable != null) {
                                }
                            }
                        } else if (surface != null) {
/* 129 */                   Log.w("CXCP", "Refusing to configure " + ((Object) OlOO0I1.I00000oOI(i)) + " with " + surface + " after close!");
                        }
                    }
/* 374 */           Trace.endSection();
                }

                /* JADX WARN: Removed duplicated region for block: B:55:0x00ea A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:6:0x003b, B:11:0x0046, B:13:0x0059, B:16:0x0060, B:18:0x0064, B:19:0x0067, B:21:0x006d, B:22:0x0070, B:24:0x0076, B:25:0x0079, B:27:0x0082, B:45:0x00be, B:47:0x00c9, B:49:0x00d5, B:51:0x00df, B:55:0x00ea, B:28:0x0088, B:30:0x008c, B:33:0x0095, B:35:0x009b, B:38:0x00a1, B:43:0x00b3, B:41:0x00ac, B:44:0x00bb), top: B:77:0x003b, inners: #1 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void close() {
                    int i;
                    IOoil1iiIilo iOoil1iiIilo;
                    boolean zIsTerminated;
/* 7 */             if (this.I00o0iI0io1.I00000oIO()) {
/* 26 */                Trace.beginSection(this + "#close");
/* 35 */                StringBuilder sb = new StringBuilder("Closing ");
/* 38 */                sb.append(this);
/* 45 */                Log.i("CXCP", sb.toString());
/* 52 */                this.I00iOIl.I0000Il00O.close();
/* 55 */                IIioIlI0 iIioIlI0 = this.I00ilI0I1;
                        synchronized (iIioIlI0.I000oI1ioi) {
                            try {
/* 64 */                        i = 1;
/* 65 */                        iOoil1iiIilo = null;
/* 66 */                        if (!iIioIlI0.I0000Il00O()) {
/* 73 */                            iIioIlI0.I00100o1O0lo = IIlOIi0oI1Io.I00000oOI;
/* 75 */                            iIioIlI0.toString();
/* 78 */                            OoooIIOo10 ooooIIOo10 = iIioIlI0.I001i1O0Ol;
/* 80 */                            IO0Il0o1OI iO0Il0o1OI = iIioIlI0.I001i1lo1io;
/* 82 */                            iIioIlI0.I001i1O0Ol = null;
/* 84 */                            iIioIlI0.I001i1lo1io = null;
/* 86 */                            OlIl0i olIl0i = iIioIlI0.I001IIilI0O;
/* 88 */                            if (olIl0i != null) {
/* 90 */                                olIl0i.I000II(null);
                                    }
/* 97 */                            OlIl0i olIl0i2 = iIioIlI0.I001l0I00;
/* 99 */                            if (olIl0i2 != null) {
/* 101 */                               olIl0i2.I000II(null);
                                    }
/* 104 */                           iIioIlI0.I001l0I00 = null;
/* 106 */                           OlIl0i olIl0i3 = iIioIlI0.I001lIiIIo1O;
/* 108 */                           if (olIl0i3 != null) {
/* 110 */                               olIl0i3.I000II(null);
                                    }
/* 113 */                           iIioIlI0.I001lIiIIo1O = null;
/* 115 */                           OlIl0i olIl0i4 = iIioIlI0.I001lllioOl;
/* 117 */                           if (olIl0i4 != null) {
/* 119 */                               olIl0i4.I000II(null);
                                    }
/* 122 */                           iIioIlI0.I001lllioOl = null;
/* 124 */                           AutoCloseable autoCloseable = iIioIlI0.I0001Ioi1lo;
/* 128 */                           boolean z = false;
/* 129 */                           if (autoCloseable instanceof AutoCloseable) {
/* 133 */                               autoCloseable.close();
                                    } else if (autoCloseable instanceof ExecutorService) {
/* 141 */                               ExecutorService executorService = (ExecutorService) autoCloseable;
/* 147 */                               if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 156 */                                   executorService.shutdown();
/* 159 */                                   boolean z2 = false;
/* 160 */                                   while (!zIsTerminated) {
                                                try {
/* 166 */                                           zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
/* 171 */                                           if (!z2) {
/* 173 */                                               executorService.shutdownNow();
/* 176 */                                               z2 = true;
                                                    }
                                                }
                                            }
/* 178 */                                   if (z2) {
/* 184 */                                       Thread.currentThread().interrupt();
                                            }
                                        }
                                    } else {
/* 188 */                               OIiilo1Ool0o.I00100o1O0lo();
                                    }
/* 191 */                           iIioIlI0.I00000oOI(iO0Il0o1OI, ooooIIOo10);
/* 194 */                           IIliIi1O0OiO iIliIi1O0OiO = iIioIlI0.I0000Il00O;
/* 200 */                           if (!iIliIi1O0OiO.I000o00OoI0I.I0000oI00) {
/* 202 */                               String str = iIliIi1O0OiO.I00000oIO;
/* 212 */                               if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1")) {
/* 232 */                                   z = true;
                                        }
/* 233 */                               if (z) {
/* 239 */                                   IIllI0o.I0000Il00O(iIioIlI0.I0000Il00O.I00000oIO);
/* 242 */                                   iIioIlI0.toString();
/* 251 */                                   iIioIlI0.I000OOo1O.I00000oIO(iIioIlI0.I0000Il00O.I00000oIO);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 336 */                       throw th;
                            }
                        }
/* 258 */               this.I00ilO0.close();
/* 263 */               this.I00io1l.close();
/* 268 */               this.I00iio.close();
/* 273 */               this.I00iiO.close();
/* 276 */               I1iIilO0io01 i1iIilO0io01 = this.I00ioIO;
                        synchronized (i1iIilO0io01.I0000Il00O) {
/* 281 */                   I1iIilil i1iIililI00000oIO = i1iIilO0io01.I00000oIO();
/* 287 */                   i1iIilO0io01.I0000O.remove(this);
/* 290 */                   I1iIilil i1iIililI00000oIO2 = i1iIilO0io01.I00000oIO();
/* 294 */                   if (i1iIililI00000oIO2 != null && !i1iIililI00000oIO2.equals(i1iIililI00000oIO)) {
/* 319 */                       iOi1II01i0.I0000O(i1iIilO0io01.I00000oIO, null, Ii01I10.I00iio, new O1o1iI(i1iIilO0io01.I00000oOI, new I1iIil1I(i1iIilO0io01, i1iIililI00000oIO2, iOoil1iiIilo, i), iOoil1iiIilo, 2), 1);
                            }
                        }
/* 325 */               il001oo1.I00000oOI(this.I00lli11, null);
/* 328 */               Trace.endSection();
                    }
                }

                public final String toString() {
/* 3 */             return this.I00l0I0l0lO1.I00000oIO;
                }
            }
