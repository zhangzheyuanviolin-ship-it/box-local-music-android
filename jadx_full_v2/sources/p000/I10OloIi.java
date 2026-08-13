            package p000;

            import android.hardware.camera2.CameraDevice;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import java.util.Arrays;
            import java.util.Objects;
            import kotlin.jvm.functions.Function1;
            
            public final class I10OloIi extends Oll0io implements Function1 {
                public final int I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10OloIi(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiO;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 48 */                    return new I10OloIi((I10i01) obj2, obj, iOoil1iiIilo, 0);
                        case 1:
/* 39 */                    return new I10OloIi((CameraDevice) obj2, (OOo0l0ii10l) obj, iOoil1iiIilo, 1);
                        case 2:
/* 28 */                    return new I10OloIi((IO0Il0o1OI) obj2, (IO0I001I0) obj, iOoil1iiIilo, 2);
                        default:
/* 17 */                    return new I10OloIi((IO0Il0o1OI) obj2, (I0oiil10Ili) obj, iOoil1iiIilo, 3);
                    }
                }

                @Override
                public final Object invoke(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                        case 0:
/* 46 */                    ((I10OloIi) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 36 */                    ((I10OloIi) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 26 */                    ((I10OloIi) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 16 */                    ((I10OloIi) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 19 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    switch (this.I00iOIl) {
                        case 0:
/* 290 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 292 */                   lIoii1l01l0i.I00000oOI(obj);
/* 297 */                   I10i01 i10i01 = (I10i01) this.I00iiI;
/* 299 */                   i10i01.I0000Il00O();
/* 304 */                   Object objI00000oOI = i10i01.I00000oOI(this.I00iiO);
/* 312 */                   i10i01.I0000Il00O.I00iiI.setValue(objI00000oOI);
/* 317 */                   i10i01.I0000oI00.setValue(objI00000oOI);
/* 320 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 152 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 154 */                   lIoii1l01l0i.I00000oOI(obj);
/* 159 */                   CameraDevice cameraDevice = (CameraDevice) this.I00iiI;
/* 166 */                   if (cameraDevice != null) {
/* 186 */                       Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
/* 208 */                       String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
/* 212 */                       long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                try {
/* 222 */                           Trace.beginSection(str);
                                    try {
/* 225 */                               cameraDevice.close();
                                    } catch (NullPointerException e) {
/* 234 */                               Log.w("CXCP", "NPE encountered during CameraDevice.close()", e);
                                    }
                                } finally {
/* 277 */                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                                }
                            }
/* 285 */                   ((OOo0l0ii10l) this.I00iiO).I00iOIl = true;
/* 287 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 100 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 102 */                   lIoii1l01l0i.I00000oOI(obj);
/* 107 */                   StringBuilder sb = new StringBuilder();
/* 112 */                   IO0Il0o1OI iO0Il0o1OI = (IO0Il0o1OI) this.I00iiI;
/* 114 */                   sb.append(iO0Il0o1OI);
/* 119 */                   sb.append(" CameraCaptureSessionWrapper#close");
/* 122 */                   String string = sb.toString();
/* 128 */                   IO0I001I0 io0i001i0 = (IO0I001I0) this.I00iiO;
                            try {
/* 130 */                       Trace.beginSection(string);
/* 133 */                       Objects.toString(iO0Il0o1OI);
/* 138 */                       IIl001iO0Io.I001iOo1i0O(io0i001i0.I00000oIO);
/* 141 */                       Trace.endSection();
/* 144 */                       return OoiIlOl1iI.I00000oIO;
                            } finally {
                            }
                        default:
/* 6 */                     Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 8 */                     lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    StringBuilder sb2 = new StringBuilder();
/* 18 */                    IO0Il0o1OI iO0Il0o1OI2 = (IO0Il0o1OI) this.I00iiI;
/* 20 */                    sb2.append(iO0Il0o1OI2);
/* 25 */                    sb2.append(" stopRepeating");
/* 28 */                    String string2 = sb2.toString();
/* 34 */                    I0oiil10Ili i0oiil10Ili = (I0oiil10Ili) this.I00iiO;
                            try {
/* 36 */                        Trace.beginSection(string2);
/* 41 */                        IIl00O iIl00O = (IIl00O) i0oiil10Ili.I00iiO;
                                synchronized (iIl00O.I000OiO) {
/* 46 */                            iIl00O.toString();
/* 51 */                            iIl00O.I00000oIO.I00ilI0I1();
                                }
/* 55 */                        Trace.endSection();
                                try {
/* 75 */                            Trace.beginSection(iO0Il0o1OI2 + " abortCaptures");
/* 78 */                            i0oiil10Ili.I00000oOI();
/* 81 */                            Trace.endSection();
/* 84 */                            return OoiIlOl1iI.I00000oIO;
                                } finally {
                                }
                            } finally {
                            }
                    }
                }
            }
