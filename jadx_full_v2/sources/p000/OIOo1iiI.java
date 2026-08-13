            package p000;

            import android.os.Bundle;
            import android.os.Trace;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.concurrent.Callable;
            import kotlin.jvm.functions.Function1;
            import sun.misc.Unsafe;
            
            public final class OIOo1iiI implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;

                public OIOo1iiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    IllOOo00lI illOOo00lI;
                    boolean z;
                    boolean z2;
                    int i;
/* 5 */             int i2 = 8;
/* 7 */             boolean z3 = true;
                    switch (this.I00iOIl) {
                        case 0:
/* 966 */                   OIOoO1IOIo oIOoO1IOIo = (OIOoO1IOIo) this.I00iiI;
/* 970 */                   OIOo1olloli0 oIOo1olloli0 = new OIOo1olloli0();
/* 979 */                   I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(22);
/* 982 */                   i0IOIlIOIII.I00iiI = oIOoO1IOIo;
/* 984 */                   VarHandle.storeStoreFence();
/* 989 */                   iOliil ioliil = new iOliil(8);
/* 992 */                   ioliil.I00iiI = i0IOIlIOIII;
/* 996 */                   OII111OO1 oii111oo1 = new OII111OO1();
/* 1005 */                  oii111oo1.I00000oIO = OlO0iOl0il.I00000oIO(OII11i1lo0o0.I00000oIO);
/* 1012 */                  OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new OII10l11loo());
/* 1016 */                  oii111oo1.I00000oOI = olO0OIIl1I00000oIO;
/* 1022 */                  oii111oo1.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 1029 */                  oii111oo1.I0000O = new I1Il0loi();
/* 1036 */                  oii111oo1.I0000oI00 = new I1Il0loi();
/* 1043 */                  oii111oo1.I000OOo1O = new LinkedHashSet();
/* 1050 */                  oii111oo1.I000OiO = new LinkedHashSet();
/* 1057 */                  oii111oo1.I000iOII = new LinkedHashSet();
/* 1059 */                  VarHandle.storeStoreFence();
/* 1062 */                  ioliil.I00iiO = oii111oo1;
/* 1066 */                  new LinkedHashSet();
/* 1074 */                  ioliil.I00iio = new LinkedHashSet();
/* 1081 */                  ioliil.I00ilI0I1 = new LinkedHashSet();
/* 1083 */                  VarHandle.storeStoreFence();
/* 1086 */                  ioliil.I000OiO(oIOo1olloli0);
/* 1089 */                  oIOo1olloli0.I0000Il00O = ioliil;
/* 1091 */                  VarHandle.storeStoreFence();
/* 1094 */                  return oIOo1olloli0;
                        case 1:
/* 878 */                   OO01l1 oO01l1 = (OO01l1) this.I00iiI;
/* 880 */                   Oi1ol0llI oi1ol0llI = oO01l1.I00iOIl;
/* 882 */                   String str = oO01l1.I00iiI;
/* 888 */                   Olil10OiIi1l olil10OiIi1l = (Olil10OiIi1l) oi1ol0llI.I00iiI;
/* 890 */                   String databaseName = olil10OiIi1l.getDatabaseName();
/* 894 */                   if (databaseName == null) {
/* 902 */                       if (!str.equals(":memory:")) {
/* 911 */                           I000II.I0010I0i(IlIi0I0.I000lI("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
/* 8 */                             return null;
                                }
                            } else if (!databaseName.equals(str) && !OlOoOIi0o.I00O0i0ii('/', databaseName, databaseName).equals(OlOoOIi0o.I00O0i0ii('/', str, str))) {
/* 950 */                       I000II.I0010I0i(Oi010OO0.I001IO000("This driver is configured to open a database named '", olil10OiIi1l.getDatabaseName(), "' but '", str, "' was requested."));
/* 8 */                         return null;
                            }
/* 960 */                   return new Olil0III(olil10OiIi1l.I00Oio());
                        case 2:
/* 807 */                   OO1lO1i00 oO1lO1i00 = (OO1lO1i00) this.I00iiI;
/* 819 */                   OIoO1Ol oIoO1Ol = new OIoO1Ol(3);
/* 822 */                   oIoO1Ol.I00iiI = oO1lO1i00;
/* 824 */                   VarHandle.storeStoreFence();
/* 827 */                   OilOoi oilOoiI00000oOI = lO1o10lllO0I.I00000oOI("kotlinx.serialization.Polymorphic", OO1l1i.I00000oOI, new OilOloI[0], oIoO1Ol);
/* 831 */                   O0IOli0o0 o0IOli0o0 = oO1lO1i00.I00000oIO;
/* 835 */                   IOoi1io iOoi1io = new IOoi1io();
/* 838 */                   iOoi1io.I00000oIO = oilOoiI00000oOI;
/* 840 */                   iOoi1io.I00000oOI = o0IOli0o0;
/* 870 */                   iOoi1io.I0000Il00O = oilOoiI00000oOI.I00000oIO + '<' + o0IOli0o0.I000oI1ioi() + '>';
/* 872 */                   VarHandle.storeStoreFence();
/* 875 */                   return iOoi1io;
                        case 3:
/* 800 */                   return Boolean.valueOf(OO1lio.I000o00OoI0I((OO1lio) this.I00iiI));
                        case 4:
/* 765 */                   File file = (File) ((O1l110o) this.I00iiI).invoke();
/* 777 */                   if (IlIl10.I0001Ioi1lo(file).equals("preferences_pb")) {
/* 779 */                       return file.getAbsoluteFile();
                            }
/* 788 */                   IOOlIIilOl0.I0001Ioi1lo(file, "File extension for file: ", " does not match required extension for Preferences file: preferences_pb");
/* 8 */                     return null;
                        case 5:
/* 751 */                   ((Ol1o1llOII) this.I00iiI).put("full_prompt", Boolean.valueOf(!((Boolean) r0.get("full_prompt")).booleanValue()));
/* 754 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 721 */                   Ili1lII.I00000oIO((Ili1lII) this.I00iiI);
/* 724 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 712 */                   return "Sending request: " + ((Oi01i1OIl) this.I00iiI).getMethod();
                        case 8:
/* 630 */                   OOiIOI10OOIi oOiIOI10OOIi = (OOiIOI10OOIi) this.I00iiI;
/* 642 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(((I01Ii0ll10O) ((OO0oOlOi1) oOiIOI10OOIi.I0000oI00)).I0000O());
/* 646 */                   OO0oi0 oO0oi0 = OO0oi0.I00iio;
/* 648 */                   Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 652 */                   unsafe.getAndSetObject(oOiIOI10OOIi, OOiIOI10OOIi.I000l1, oO0oi0);
/* 657 */                   unsafe.getAndSetObject(oOiIOI10OOIi, OOiIOI10OOIi.I000OiO, oO0oi0);
/* 660 */                   oOiIOI10OOIi.I00000oOI = null;
/* 668 */                   O1i0lO o1i0lO = new O1i0lO(-32000, "Connection closed");
/* 671 */                   Iterator it = listI00iIi0i1o.iterator();
/* 679 */                   while (it.hasNext()) {
/* 687 */                       ((IlliIl1l11O) it.next()).invoke(null, o1i0lO);
                            }
/* 691 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 623 */                   return "Sending notification: " + ((IoliIiol1) this.I00iiI).I00000oOI;
                        case 10:
/* 568 */                   OOO10O0 ooo10o0 = ((OOO100oi0iI0) this.I00iiI).I00000oIO;
/* 602 */                   return "Received progress notification: token=" + ooo10o0.I00000oIO + ", progress=" + ooo10o0.I00000oOI + "/" + ooo10o0.I0000Il00O;
                        case 11:
/* 559 */                   return ((Error) this.I00iiI).getMessage();
                        case 12:
/* 550 */                   return "Sending request message with id: " + ((Oi0IO111o10) this.I00iiI);
                        case 13:
/* 513 */                   OOo0Olol0o oOo0Olol0o = (OOo0Olol0o) this.I00iiI;
/* 515 */                   oOo0Olol0o.I000OOo1O = null;
/* 519 */                   Trace.beginSection("OnPositionedDispatch");
                            try {
/* 522 */                       oOo0Olol0o.I00000oIO();
/* 525 */                       Trace.endSection();
/* 528 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th) {
/* 532 */                       Trace.endSection();
/* 535 */                       throw th;
                            }
                        case 14:
/* 506 */                   return "Missing 'method' for Request: " + ((O01O0o1iI) this.I00iiI);
                        case 15:
/* 487 */                   return ((Callable) this.I00iiI).call();
                        case 16:
/* 477 */                   ((Runnable) this.I00iiI).run();
/* 480 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 420 */                   OOoOIoio1i oOoOIoio1i = (OOoOIoio1i) this.I00iiI;
/* 432 */                   Method declaredMethod = oOoOIoio1i.I00000oIO.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
/* 468 */                   return Boolean.valueOf(declaredMethod.getReturnType().equals(oOoOIoio1i.I00000oIO.loadClass("androidx.window.extensions.WindowExtensions")) && Modifier.isPublic(declaredMethod.getModifiers()));
                        case PoseLandmark.RIGHT_PINKY:
/* 397 */                   OiIiOi0II oiIiOi0II = (OiIiOi0II) this.I00iiI;
/* 399 */                   OiIoliiIoIi0 oiIoliiIoIi0 = oiIiOi0II.I00iOIl;
/* 401 */                   Object obj = oiIiOi0II.I00iio;
/* 403 */                   if (obj != null) {
/* 405 */                       return oiIoliiIoIi0.I000iOII(oiIiOi0II, obj);
                            }
/* 412 */                   I000II.I000iOII("Value should be initialized");
/* 8 */                     return null;
                        case PoseLandmark.LEFT_INDEX:
/* 366 */                   IIlio101Io iIlio101Io = ((OiIl1O1OO) this.I00iiI).I00iiO;
/* 368 */                   if (iIlio101Io == null) {
/* 8 */                         return null;
                            }
/* 379 */                   Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 383 */                   iIlio101Io.I00ooIo0(bundleI00000oIO);
/* 390 */                   if (bundleI00000oIO.isEmpty()) {
/* 8 */                         return null;
                            }
/* 393 */                   return bundleI00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 357 */                   return OiIoII10il0.I0000Il00O((Oool1Ii0I) this.I00iiI);
                        case PoseLandmark.LEFT_THUMB:
/* 330 */                   OiIoOoIi01 oiIoOoIi01 = (OiIoOoIi01) this.I00iiI;
/* 332 */                   I01O1lIi i01O1lIiI000iOII = oiIoOoIi01.I000iOII();
/* 339 */                   OOo01Ilo oOo01Ilo = new OOo01Ilo(0);
/* 342 */                   oOo01Ilo.I00iiI = oiIoOoIi01;
/* 344 */                   VarHandle.storeStoreFence();
/* 347 */                   i01O1lIiI000iOII.I00li1OI(oOo01Ilo);
/* 350 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 305 */                   OiOlI0ol1 oiOlI0ol1 = (OiOlI0ol1) this.I00iiI;
/* 313 */                   I0o1iOo1i i0o1iOo1i = (I0o1iOo1i) iiliIooIliOo.I00000oIO(oiOlI0ol1, OIlIo0OII1.I00000oIO);
/* 315 */                   oiOlI0ol1.I00oo1iO0ll = i0o1iOo1i;
/* 323 */                   oiOlI0ol1.I00ooIo0 = i0o1iOo1i != null ? i0o1iOo1i.I00000oIO() : null;
/* 325 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 285 */                   Oii110oOoO oii110oOoO = (Oii110oOoO) this.I00iiI;
/* 287 */                   OoI1Oi0l1I0o ooI1Oi0l1I0o = oii110oOoO.I00ilI0I1;
/* 298 */                   oii110oOoO.I00ilO0 = ooI1Oi0l1I0o != null ? ooI1Oi0l1I0o.I000II() : 0L;
/* 300 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 277 */                   ((OilIlo) this.I00iiI).I0000oI00();
/* 280 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 270 */                   return this.I00iiI;
                        case PoseLandmark.RIGHT_KNEE:
/* 257 */                   OilOoi oilOoi = (OilOoi) this.I00iiI;
/* 265 */                   return Integer.valueOf(lI1O0i1l.I00000oIO(oilOoi, oilOoi.I000iOII));
                        case 27:
/* 203 */                   OioOII0IIoO1 oioOII0IIoO1 = (OioOII0IIoO1) this.I00iiI;
/* 205 */                   OIooliIO0 oIooliIO0 = oioOII0IIoO1.I00iiO;
/* 222 */                   if (((Ol0i1I) oIooliIO0.getValue()).I00000oIO == 9205357640488583168L || Ol0i1I.I0001Ioi1lo(((Ol0i1I) oIooliIO0.getValue()).I00000oIO)) {
/* 8 */                         return null;
                            }
/* 250 */                   return oioOII0IIoO1.I00iOIl.I0000Il00O(((Ol0i1I) oIooliIO0.getValue()).I00000oIO);
                        case PoseLandmark.RIGHT_ANKLE:
/* 175 */                   Ol111o0 ol111o0 = (Ol111o0) this.I00iiI;
/* 189 */                   if (!((Boolean) ol111o0.I00100l0.getValue()).booleanValue() && (illOOo00lI = ol111o0.I00000oOI) != null) {
/* 195 */                       illOOo00lI.invoke();
                            }
/* 198 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 15 */                    Ol1olI0o1I01 ol1olI0o1I01 = (Ol1olI0o1I01) this.I00iiI;
                            while (true) {
                                synchronized (ol1olI0o1I01.I000II) {
                                    try {
/* 22 */                                if (ol1olI0o1I01.I0000Il00O) {
/* 153 */                                   z = z3;
                                        } else {
/* 24 */                                    ol1olI0o1I01.I0000Il00O = z3;
                                            try {
/* 26 */                                        OI110O0 oi110o0 = ol1olI0o1I01.I0001Ioi1lo;
/* 28 */                                        Object[] objArr = oi110o0.I00iOIl;
/* 30 */                                        int i3 = oi110o0.I00iiO;
/* 32 */                                        int i4 = 0;
/* 33 */                                        while (i4 < i3) {
/* 37 */                                            Ol1oi0lO0I ol1oi0lO0I = (Ol1oi0lO0I) objArr[i4];
/* 39 */                                            OI10IIO oi10iio = ol1oi0lO0I.I000II;
/* 41 */                                            Function1 function1 = ol1oi0lO0I.I00000oIO;
/* 43 */                                            Object[] objArr2 = oi10iio.I00000oOI;
/* 45 */                                            long[] jArr = oi10iio.I00000oIO;
                                                    int length = jArr.length - 2;
/* 50 */                                            if (length >= 0) {
/* 52 */                                                int i5 = 0;
                                                        while (true) {
/* 53 */                                                    long j = jArr[i5];
/* 55 */                                                    z2 = z3;
/* 72 */                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 79 */                                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
/* 81 */                                                        int i7 = 0;
/* 82 */                                                        while (i7 < i6) {
/* 92 */                                                            if ((j & 255) < 128) {
/* 98 */                                                                i = i2;
/* 102 */                                                               function1.invoke(objArr2[(i5 << 3) + i7]);
                                                                    } else {
/* 106 */                                                               i = i2;
                                                                    }
/* 108 */                                                           j >>= i;
/* 110 */                                                           i7++;
/* 112 */                                                           i2 = i;
                                                                }
/* 115 */                                                       if (i6 == i2) {
/* 117 */                                                           if (i5 != length) {
/* 119 */                                                               i5++;
/* 121 */                                                               z3 = z2;
/* 123 */                                                               i2 = 8;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
/* 126 */                                               z2 = z3;
                                                    }
/* 128 */                                           oi10iio.I00000oOI();
/* 131 */                                           i4++;
/* 133 */                                           z3 = z2;
/* 135 */                                           i2 = 8;
                                                }
/* 142 */                                       z = z3;
/* 145 */                                       ol1olI0o1I01.I0000Il00O = false;
                                            } catch (Throwable th2) {
/* 150 */                                       ol1olI0o1I01.I0000Il00O = false;
/* 152 */                                       throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
/* 172 */                               throw th3;
                                    }
                                }
/* 160 */                       if (!ol1olI0o1I01.I0000Il00O()) {
/* 162 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 165 */                       z3 = z;
/* 167 */                       i2 = 8;
                            }
                    }
                }
            }
