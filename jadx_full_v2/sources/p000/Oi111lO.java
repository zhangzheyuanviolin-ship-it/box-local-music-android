            package p000;

            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.concurrent.CopyOnWriteArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Oi111lO {
                public static final o0llIi I000II = new o0llIi(14);
                public IIo11l1iO I00000oIO;
                public IIl0l10l I00000oOI;
                public o01l1ioOo0 I0000Il00O;
                public I0o0l0loiO I0000O;
                public I1iIilO0io01 I0000oI00;
                public IIlo110 I0001Ioi1lo;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Path cross not found for [B:105:0x01ec, B:107:0x01f1], limit reached: 137 */
                /* JADX WARN: Path cross not found for [B:107:0x01f1, B:105:0x01ec], limit reached: 137 */
                /* JADX WARN: Path cross not found for [B:63:0x0196, B:61:0x0192], limit reached: 137 */
                /* JADX WARN: Path cross not found for [B:73:0x01a8, B:72:0x01a6], limit reached: 137 */
                /* JADX WARN: Removed duplicated region for block: B:105:0x01ec A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:14:0x003b, B:117:0x0292, B:119:0x029a, B:35:0x011c, B:42:0x0133, B:45:0x013d, B:47:0x0162, B:105:0x01ec, B:109:0x01f8, B:113:0x0271, B:107:0x01f1, B:103:0x01d8, B:50:0x0176, B:122:0x02a8, B:123:0x02ab, B:22:0x0060, B:46:0x0156), top: B:134:0x0025, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x01f8 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:14:0x003b, B:117:0x0292, B:119:0x029a, B:35:0x011c, B:42:0x0133, B:45:0x013d, B:47:0x0162, B:105:0x01ec, B:109:0x01f8, B:113:0x0271, B:107:0x01f1, B:103:0x01d8, B:50:0x0176, B:122:0x02a8, B:123:0x02ab, B:22:0x0060, B:46:0x0156), top: B:134:0x0025, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x029a A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:14:0x003b, B:117:0x0292, B:119:0x029a, B:35:0x011c, B:42:0x0133, B:45:0x013d, B:47:0x0162, B:105:0x01ec, B:109:0x01f8, B:113:0x0271, B:107:0x01f1, B:103:0x01d8, B:50:0x0176, B:122:0x02a8, B:123:0x02ab, B:22:0x0060, B:46:0x0156), top: B:134:0x0025, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x028f -> B:16:0x0042). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(String str, IIl0O0iioOO iIl0O0iioOO, Function1 function1, IOoilo iOoilo) {
                    Oi111Ii oi111Ii;
                    AutoCloseable autoCloseable;
                    Throwable th;
                    OOo0ll111 oOo0ll111;
                    int i;
                    Throwable th2;
                    IIl0O0iioOO iIl0O0iioOO2;
                    String str2;
                    Function1 function12;
                    long j;
                    AutoCloseable autoCloseable2;
                    IIilllloil1 iIilllloil1;
                    String str3;
                    IIl0O0iioOO iIl0O0iioOO3;
                    Function1 function13;
                    OOo0ll111 oOo0ll1112;
                    long j2;
                    IIilllloil1 iIilllloil12;
                    I0lIllO i0lIllO;
                    long j3;
                    boolean z;
                    int i2;
                    boolean z2;
                    int i3;
                    Object objI00000oOI;
/* 7 */             if (iOoilo instanceof Oi111Ii) {
/* 10 */                oi111Ii = (Oi111Ii) iOoilo;
/* 12 */                int i4 = oi111Ii.I00l0OO0IO;
/* 18 */                if ((i4 & Integer.MIN_VALUE) != 0) {
/* 21 */                    oi111Ii.I00l0OO0IO = i4 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    oi111Ii = new Oi111Ii(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = oi111Ii.I00ioIO;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i5 = oi111Ii.I00l0OO0IO;
/* 35 */            int i6 = 2;
                    try {
                    } catch (Throwable th3) {
/* 72 */                th = th3;
/* 73 */                th = th;
                        try {
/* 689 */                   throw th;
                        } catch (Throwable th4) {
/* 691 */                   iOOl00.I00000oIO(autoCloseable, th);
/* 1182 */                  throw th4;
                        }
                    }
                    try {
/* 38 */                if (i5 == 0) {
/* 122 */                   lIoii1l01l0i.I00000oOI(obj);
/* 125 */                   long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 131 */                   oOo0ll111 = new OOo0ll111();
/* 134 */                   o01l1ioOo0 o01l1iooo0 = this.I0000Il00O;
/* 138 */                   oi111Ii.I00iOIl = str;
/* 142 */                   oi111Ii.I00iiI = iIl0O0iioOO;
/* 146 */                   oi111Ii.I00iiO = function1;
/* 148 */                   oi111Ii.I00iio = oOo0ll111;
/* 150 */                   oi111Ii.I00io1l = jElapsedRealtimeNanos;
/* 152 */                   oi111Ii.I00l0OO0IO = 1;
/* 156 */                   IIilllloil1 iIilllloil13 = new IIilllloil1();
/* 169 */                   i = 1;
/* 180 */                   IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(((Oo10IliO00O) o01l1iooo0.I00iiI).I0000O, new Oliiii0((O010OIi) o01l1iooo0.I00iiO)));
/* 184 */                   iIilllloil13.I00iOIl = iIOlO1iiI00000oIO;
/* 191 */                   iIilllloil13.I00iiI = new CopyOnWriteArrayList();
/* 197 */                   th2 = null;
/* 201 */                   iOi1II01i0.I0000O(iIOlO1iiI00000oIO, null, null, new I00oIiI10(o01l1iooo0, str, iIilllloil13, false ? 1 : 0, 19), 3);
/* 204 */                   VarHandle.storeStoreFence();
/* 207 */                   if (iIilllloil13 != ii0111o) {
/* 213 */                       iIl0O0iioOO2 = iIl0O0iioOO;
/* 214 */                       obj = iIilllloil13;
/* 215 */                       str2 = str;
/* 217 */                       function12 = function1;
/* 219 */                       j = jElapsedRealtimeNanos;
                            }
/* 209 */                   return ii0111o;
                        }
/* 40 */                if (i5 == 1) {
/* 105 */                   j = oi111Ii.I00io1l;
/* 107 */                   oOo0ll111 = oi111Ii.I00iio;
/* 109 */                   function12 = oi111Ii.I00iiO;
/* 111 */                   iIl0O0iioOO2 = oi111Ii.I00iiI;
/* 113 */                   str2 = oi111Ii.I00iOIl;
/* 115 */                   lIoii1l01l0i.I00000oOI(obj);
/* 118 */                   i = 1;
/* 120 */                   th2 = null;
                        } else {
/* 42 */                    if (i5 != 2) {
/* 44 */                        if (i5 != 3) {
/* 78 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 81 */                            return null;
                                }
/* 46 */                        j = oi111Ii.I00io1l;
/* 48 */                        iIilllloil12 = oi111Ii.I00ilO0;
/* 50 */                        autoCloseable = oi111Ii.I00ilI0I1;
/* 52 */                        oOo0ll1112 = oi111Ii.I00iio;
/* 54 */                        function13 = oi111Ii.I00iiO;
/* 56 */                        iIl0O0iioOO3 = oi111Ii.I00iiI;
/* 58 */                        str3 = oi111Ii.I00iOIl;
/* 60 */                        lIoii1l01l0i.I00000oOI(obj);
/* 63 */                        Ii0111o ii0111o2 = ii0111o;
/* 64 */                        th2 = null;
/* 65 */                        Object objI00000oIO = obj;
/* 66 */                        char c = 3;
/* 67 */                        iIilllloil1 = iIilllloil12;
/* 68 */                        oOo0ll111 = oOo0ll1112;
/* 69 */                        iIl0O0iioOO2 = iIl0O0iioOO3;
/* 665 */                       if (!((Boolean) objI00000oIO).booleanValue()) {
/* 667 */                           IIllI0o.I0000Il00O(str3);
                                }
/* 671 */                       ii0111o = ii0111o2;
/* 672 */                       autoCloseable2 = autoCloseable;
/* 673 */                       function12 = function13;
/* 674 */                       str2 = str3;
/* 675 */                       i6 = 2;
/* 676 */                       i = 1;
/* 227 */                       int i7 = oOo0ll111.I00iOIl + 1;
/* 229 */                       oOo0ll111.I00iOIl = i7;
/* 231 */                       IIo11l1iO iIo11l1iO = this.I00000oIO;
/* 233 */                       I1iIilO0io01 i1iIilO0io01 = this.I0000oI00;
/* 235 */                       oi111Ii.I00iOIl = str2;
/* 237 */                       oi111Ii.I00iiI = iIl0O0iioOO2;
/* 239 */                       oi111Ii.I00iiO = function12;
/* 241 */                       oi111Ii.I00iio = oOo0ll111;
/* 243 */                       oi111Ii.I00ilI0I1 = autoCloseable2;
/* 245 */                       oi111Ii.I00ilO0 = iIilllloil1;
/* 247 */                       oi111Ii.I00io1l = j;
/* 249 */                       oi111Ii.I00l0OO0IO = i6;
/* 251 */                       Oi111Ii oi111Ii2 = oi111Ii;
/* 255 */                       long j4 = j;
/* 257 */                       IIl0O0iioOO iIl0O0iioOO4 = iIl0O0iioOO2;
/* 259 */                       String str4 = str2;
/* 265 */                       objI00000oOI = iIo11l1iO.I00000oOI(str4, i7, j4, iIl0O0iioOO4, i1iIilO0io01, oi111Ii2);
/* 269 */                       if (objI00000oOI != ii0111o) {
/* 272 */                           oOo0ll1112 = oOo0ll111;
/* 273 */                           iIilllloil12 = iIilllloil1;
/* 274 */                           function13 = function12;
/* 275 */                           str3 = str4;
/* 277 */                           j2 = j4;
/* 279 */                           iIl0O0iioOO3 = iIl0O0iioOO4;
/* 281 */                           autoCloseable = autoCloseable2;
/* 282 */                           obj = objI00000oOI;
/* 283 */                           oi111Ii = oi111Ii2;
/* 285 */                           OIi0ooOoOOo0 oIi0ooOoOOo0 = (OIi0ooOoOOo0) obj;
/* 291 */                           long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - j2;
/* 292 */                           i0lIllO = oIi0ooOoOOo0.I00000oIO;
/* 296 */                           IIlOloloOil iIlOloloOil = oIi0ooOoOOo0.I00000oOI;
/* 298 */                           if (i0lIllO != null) {
/* 300 */                               iOOl00.I00000oIO(autoCloseable, th2);
/* 303 */                               return oIi0ooOoOOo0;
                                    }
/* 306 */                           if (iIlOloloOil == null) {
/* 310 */                               Log.w("CXCP", "Camera open failed without an error. The CameraGraph may have been stopped or closed. Abandoning the camera open attempt.");
/* 314 */                               iOOl00.I00000oIO(autoCloseable, null);
/* 317 */                               return oIi0ooOoOOo0;
                                    }
/* 318 */                           int i8 = iIlOloloOil.I00000oIO;
/* 330 */                           ((Boolean) function13.invoke(OoiIlOl1iI.I00000oIO)).getClass();
/* 333 */                           o0llIi o0llii = I000II;
/* 337 */                           int i9 = oOo0ll1112.I00iOIl;
/* 339 */                           I0o0l0loiO i0o0l0loiO = this.I0000O;
                                    try {
/* 343 */                               Trace.beginSection("DevicePolicyManager#getCameraDisabled");
/* 348 */                               Ii0111o ii0111o3 = ii0111o;
/* 351 */                               boolean cameraDisabled = i0o0l0loiO.I00000oIO.getCameraDisabled(null);
/* 355 */                               Trace.endSection();
/* 360 */                               Iio1ilIOl10o iio1ilIOl10o = this.I0001Ioi1lo.I0000Il00O;
/* 362 */                               int i10 = Oi11I1l.I00000oIO;
/* 364 */                               long j5 = 10000000000L;
/* 369 */                               if (iio1ilIOl10o == null) {
/* 371 */                                   j3 = j2;
/* 373 */                                   z = cameraDisabled;
                                        } else {
/* 375 */                                   j3 = j2;
/* 377 */                                   z = cameraDisabled;
/* 378 */                                   long j6 = iio1ilIOl10o.I00000oIO;
/* 382 */                                   if (10000000000L == j6 || 10000000000L >= j6) {
/* 384 */                                       j5 = j6;
                                            }
                                        }
/* 401 */                               if ((jElapsedRealtimeNanos2 != j5 ? jElapsedRealtimeNanos2 < j5 ? -1 : i : 0) <= 0) {
/* 407 */                                   if (i8 != 0) {
/* 415 */                                       i2 = i;
/* 417 */                                       if (i8 != i2) {
/* 421 */                                           if (i8 != 2) {
/* 426 */                                               if (i8 != 3) {
/* 437 */                                                   if (i8 != 4 && i8 != 5 && i8 != 6 && i8 != 7) {
/* 454 */                                                       if (i8 == 8) {
/* 456 */                                                           i2 = 1;
/* 457 */                                                           if (i9 <= 1) {
                                                                    }
                                                                } else if (i8 != 10) {
/* 468 */                                                           if (i8 != 11) {
/* 487 */                                                               Log.e("CXCP", "Unexpected CameraError: " + o0llii);
                                                                    } else if (i9 <= 1) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
/* 434 */                                                   z2 = (!z || i9 <= i2) ? 1 : 0;
                                                        }
/* 491 */                                               if (z2 != 0 || oOo0ll1112.I00iOIl > 1) {
/* 500 */                                                   this.I00000oOI.I00000oIO(z2, str3, i8);
                                                        }
/* 503 */                                               if (z2 == 0) {
/* 507 */                                                   StringBuilder sb = new StringBuilder();
/* 512 */                                                   sb.append("Failed to open camera ");
/* 519 */                                                   sb.append((Object) IIllI0o.I0000Il00O(str3));
/* 524 */                                                   sb.append(" after ");
/* 529 */                                                   sb.append(oOo0ll1112.I00iOIl);
/* 534 */                                                   sb.append(" attempts and ");
/* 592 */                                                   sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{new Double((SystemClock.elapsedRealtimeNanos() - j3) / 1000000.0d)}, 1)));
/* 597 */                                                   sb.append(". Last error was ");
/* 604 */                                                   sb.append((Object) IIlOloloOil.I00000oOI(i8));
/* 609 */                                                   sb.append('.');
/* 616 */                                                   Log.e("CXCP", sb.toString());
/* 620 */                                                   iOOl00.I00000oIO(autoCloseable, null);
/* 320 */                                                   return oIi0ooOoOOo0;
                                                        }
/* 625 */                                               th2 = null;
/* 626 */                                               oi111Ii.I00iOIl = str3;
/* 628 */                                               oi111Ii.I00iiI = iIl0O0iioOO3;
/* 630 */                                               oi111Ii.I00iiO = function13;
/* 632 */                                               oi111Ii.I00iio = oOo0ll1112;
/* 634 */                                               oi111Ii.I00ilI0I1 = autoCloseable;
/* 636 */                                               oi111Ii.I00ilO0 = iIilllloil12;
/* 638 */                                               long j7 = j3;
/* 640 */                                               oi111Ii.I00io1l = j7;
/* 642 */                                               c = 3;
/* 643 */                                               oi111Ii.I00l0OO0IO = 3;
/* 647 */                                               objI00000oIO = iIilllloil12.I00000oIO(500L, oi111Ii);
/* 651 */                                               ii0111o2 = ii0111o3;
/* 653 */                                               if (objI00000oIO == ii0111o2) {
/* 655 */                                                   return ii0111o2;
                                                        }
/* 656 */                                               j = j7;
/* 67 */                                                iIilllloil1 = iIilllloil12;
/* 68 */                                                oOo0ll111 = oOo0ll1112;
/* 69 */                                                iIl0O0iioOO2 = iIl0O0iioOO3;
/* 665 */                                               if (!((Boolean) objI00000oIO).booleanValue()) {
                                                        }
/* 671 */                                               ii0111o = ii0111o2;
/* 672 */                                               autoCloseable2 = autoCloseable;
/* 673 */                                               function12 = function13;
/* 674 */                                               str2 = str3;
/* 675 */                                               i6 = 2;
/* 676 */                                               i = 1;
/* 227 */                                               int i72 = oOo0ll111.I00iOIl + 1;
/* 229 */                                               oOo0ll111.I00iOIl = i72;
/* 231 */                                               IIo11l1iO iIo11l1iO2 = this.I00000oIO;
/* 233 */                                               I1iIilO0io01 i1iIilO0io012 = this.I0000oI00;
/* 235 */                                               oi111Ii.I00iOIl = str2;
/* 237 */                                               oi111Ii.I00iiI = iIl0O0iioOO2;
/* 239 */                                               oi111Ii.I00iiO = function12;
/* 241 */                                               oi111Ii.I00iio = oOo0ll111;
/* 243 */                                               oi111Ii.I00ilI0I1 = autoCloseable2;
/* 245 */                                               oi111Ii.I00ilO0 = iIilllloil1;
/* 247 */                                               oi111Ii.I00io1l = j;
/* 249 */                                               oi111Ii.I00l0OO0IO = i6;
/* 251 */                                               Oi111Ii oi111Ii22 = oi111Ii;
/* 255 */                                               long j42 = j;
/* 257 */                                               IIl0O0iioOO iIl0O0iioOO42 = iIl0O0iioOO2;
/* 259 */                                               String str42 = str2;
/* 265 */                                               objI00000oOI = iIo11l1iO2.I00000oOI(str42, i72, j42, iIl0O0iioOO42, i1iIilO0io012, oi111Ii22);
/* 269 */                                               if (objI00000oOI != ii0111o) {
                                                        }
                                                    }
/* 423 */                                           z2 = i2;
/* 491 */                                           if (z2 != 0) {
                                                    }
/* 500 */                                           this.I00000oOI.I00000oIO(z2, str3, i8);
/* 503 */                                           if (z2 == 0) {
                                                    }
                                                }
                                            } else {
/* 409 */                                       i2 = i;
/* 411 */                                       if (i9 <= i2) {
                                                }
                                                z2 = i3;
/* 491 */                                       if (z2 != 0) {
                                                }
/* 500 */                                       this.I00000oOI.I00000oIO(z2, str3, i8);
/* 503 */                                       if (z2 == 0) {
                                                }
                                            }
/* 413 */                                   i3 = i2;
                                            z2 = i3;
/* 491 */                                   if (z2 != 0) {
                                            }
/* 500 */                                   this.I00000oOI.I00000oIO(z2, str3, i8);
/* 503 */                                   if (z2 == 0) {
                                            }
                                        }
/* 403 */                               i3 = 0;
                                        z2 = i3;
/* 491 */                               if (z2 != 0) {
                                        }
/* 500 */                               this.I00000oOI.I00000oIO(z2, str3, i8);
/* 503 */                               if (z2 == 0) {
                                        }
                                    } catch (Throwable th5) {
/* 681 */                               Trace.endSection();
/* 684 */                               throw th5;
                                    }
                                }
/* 209 */                       return ii0111o;
                            }
/* 83 */                    j2 = oi111Ii.I00io1l;
/* 85 */                    iIilllloil12 = oi111Ii.I00ilO0;
/* 87 */                    autoCloseable = oi111Ii.I00ilI0I1;
/* 89 */                    oOo0ll1112 = oi111Ii.I00iio;
/* 91 */                    function13 = oi111Ii.I00iiO;
/* 93 */                    iIl0O0iioOO3 = oi111Ii.I00iiI;
/* 95 */                    str3 = oi111Ii.I00iOIl;
/* 97 */                    lIoii1l01l0i.I00000oOI(obj);
/* 100 */                   i = 1;
/* 102 */                   th2 = null;
/* 285 */                   OIi0ooOoOOo0 oIi0ooOoOOo02 = (OIi0ooOoOOo0) obj;
/* 291 */                   long jElapsedRealtimeNanos22 = SystemClock.elapsedRealtimeNanos() - j2;
/* 292 */                   i0lIllO = oIi0ooOoOOo02.I00000oIO;
/* 296 */                   IIlOloloOil iIlOloloOil2 = oIi0ooOoOOo02.I00000oOI;
/* 298 */                   if (i0lIllO != null) {
                            }
                        }
/* 223 */               iIilllloil1 = (IIilllloil1) autoCloseable2;
/* 227 */               int i722 = oOo0ll111.I00iOIl + 1;
/* 229 */               oOo0ll111.I00iOIl = i722;
/* 231 */               IIo11l1iO iIo11l1iO22 = this.I00000oIO;
/* 233 */               I1iIilO0io01 i1iIilO0io0122 = this.I0000oI00;
/* 235 */               oi111Ii.I00iOIl = str2;
/* 237 */               oi111Ii.I00iiI = iIl0O0iioOO2;
/* 239 */               oi111Ii.I00iiO = function12;
/* 241 */               oi111Ii.I00iio = oOo0ll111;
/* 243 */               oi111Ii.I00ilI0I1 = autoCloseable2;
/* 245 */               oi111Ii.I00ilO0 = iIilllloil1;
/* 247 */               oi111Ii.I00io1l = j;
/* 249 */               oi111Ii.I00l0OO0IO = i6;
/* 251 */               Oi111Ii oi111Ii222 = oi111Ii;
/* 255 */               long j422 = j;
/* 257 */               IIl0O0iioOO iIl0O0iioOO422 = iIl0O0iioOO2;
/* 259 */               String str422 = str2;
/* 265 */               objI00000oOI = iIo11l1iO22.I00000oOI(str422, i722, j422, iIl0O0iioOO422, i1iIilO0io0122, oi111Ii222);
/* 269 */               if (objI00000oOI != ii0111o) {
                        }
/* 209 */               return ii0111o;
                    } catch (Throwable th6) {
/* 685 */               th = th6;
/* 686 */               autoCloseable = autoCloseable2;
/* 73 */                th = th;
/* 689 */               throw th;
                    }
/* 220 */           autoCloseable2 = (AutoCloseable) obj;
                }
            }
