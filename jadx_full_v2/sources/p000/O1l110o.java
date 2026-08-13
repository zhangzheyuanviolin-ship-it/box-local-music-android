            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.hardware.camera2.CameraCharacteristics;
            import android.net.ConnectivityManager;
            import android.net.Uri;
            import androidx.work.impl.WorkDatabase;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 9 */     public final class O1l110o implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public O1l110o(int i, Object obj, Object obj2) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
                }

                /* JADX WARN: Removed duplicated region for block: B:108:0x02d4  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    Bitmap bitmap;
                    OOlol11 oOlol11;
/* 7 */             boolean z = true;
/* 9 */             int i = 0;
/* 10 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1325 */                  ((IlliIl1l11O) this.I00iiI).invoke(((IO1OoiOlOO) this.I00iiO).I000II, 0);
/* 1328 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1259 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1263 */                  Bitmap bitmap2 = (Bitmap) this.I00iiO;
/* 1269 */                  List list = (List) oI10i0Il.getValue();
/* 1275 */                  ArrayList arrayList = new ArrayList();
/* 1286 */                  for (Object obj : list) {
/* 1299 */                      if (!O0000Ioio00.I0000O(bitmap2, (Bitmap) obj)) {
/* 1301 */                          arrayList.add(obj);
                                }
                            }
/* 1305 */                  oI10i0Il.setValue(arrayList);
/* 1308 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1215 */                  O1loIO o1loIO = (O1loIO) this.I00iiI;
/* 1220 */                  Context context = (Context) this.I00iiO;
/* 1230 */                  Bitmap bitmap3 = ((O1loIIIOiO) o1loIO.I00000oOI.getValue()).I0000O;
/* 1232 */                  if (bitmap3 != null) {
/* 1235 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o1loIO);
/* 1239 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1251 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context, o1loIO, bitmap3, (IOoil1iiIilo) null, 26), 2);
                            }
/* 1254 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1078 */                  O1loIO o1loIO2 = (O1loIO) this.I00iiI;
/* 1082 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 1084 */                  OlO0OIIl1 olO0OIIl1 = o1loIO2.I00000oOI;
/* 1086 */                  Object obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 1096 */                  O1lo00 o1lo00 = obj2 instanceof O1lo00 ? (O1lo00) obj2 : null;
/* 1097 */                  if (o1lo00 == null) {
/* 1122 */                      olO0OIIl1.I000lI(null, O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl1.getValue(), null, null, 0, null, 0.0f, false, "Model not loaded — try re-initializing it.", false, 191));
                            } else {
/* 1132 */                      Bitmap bitmap4 = ((O1loIIIOiO) olO0OIIl1.getValue()).I00000oIO;
/* 1134 */                      if (bitmap4 != null && (bitmap = ((O1loIIIOiO) olO0OIIl1.getValue()).I00000oOI) != null && !((O1loIIIOiO) olO0OIIl1.getValue()).I0001Ioi1lo) {
/* 1186 */                          olO0OIIl1.I000lI(null, O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl1.getValue(), null, null, 0, null, 0.0f, true, null, false, 159));
/* 1207 */                          o1loIO2.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o1loIO2), IiiIil1lOIO.I00000oIO, null, new I0iOI0o1i(o1lo00, bitmap4, bitmap, o1loIO2, (IOoil1iiIilo) null, 29), 2);
                                }
                            }
/* 1209 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 1069 */                  ((Function1) this.I00iiI).invoke(((OOOI1I) this.I00iiO).I00000oOI);
/* 1072 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 939 */                   O1o1io0oi0ol o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iiI;
/* 945 */                   Object obj3 = ((O1oIOiI11o0) this.I00iiO).I00IlilI0i0i;
/* 947 */                   OlO0OIIl1 olO0OIIl12 = o1o1io0oi0ol.I00000oOI;
/* 949 */                   if (obj3 == null) {
/* 970 */                       olO0OIIl12.I000lI(null, O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl12.getValue(), null, null, null, false, "Model not loaded — try re-initializing it.", 15));
                            } else {
/* 980 */                       Bitmap bitmap5 = ((O1o1iOlI1) olO0OIIl12.getValue()).I00000oIO;
/* 982 */                       if (bitmap5 == null) {
/* 1003 */                          olO0OIIl12.I000lI(null, O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl12.getValue(), null, null, null, false, "Pick an image first.", 15));
                                } else if (!((O1o1iOlI1) olO0OIIl12.getValue()).I0000O) {
/* 1036 */                          olO0OIIl12.I000lI(null, O1o1iOlI1.I00000oIO((O1o1iOlI1) olO0OIIl12.getValue(), null, Il01100l.I00iOIl, null, true, null, 1));
/* 1054 */                          o1o1io0oi0ol.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o1o1io0oi0ol), IiiIil1lOIO.I00000oIO, null, new O1o1iI(obj3, o1o1io0oi0ol, bitmap5, (IOoil1iiIilo) null), 2);
                                }
                            }
/* 1056 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 931 */                   ((Function1) this.I00iiI).invoke((Ioiol1OIol) this.I00iiO);
/* 934 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 862 */                   OI1Ooo oI1Ooo = (OI1Ooo) this.I00iiI;
/* 866 */                   OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I00iiO;
                            synchronized (oI1Ooo.I00000oIO) {
                                try {
/* 871 */                           OlO0OIIl1 olO0OIIl13 = oI1Ooo.I00000oOI;
/* 877 */                           Iterable iterable = (Iterable) olO0OIIl13.getValue();
/* 881 */                           ArrayList arrayList2 = new ArrayList();
/* 892 */                           for (Object obj4 : iterable) {
/* 905 */                               if (O0000Ioio00.I0000O((OI1OloOIO1O) obj4, oI1OloOIO1O)) {
/* 914 */                                   olO0OIIl13.I000lI(null, arrayList2);
                                        } else {
/* 908 */                                   arrayList2.add(obj4);
                                        }
                                    }
/* 914 */                           olO0OIIl13.I000lI(null, arrayList2);
                                } catch (Throwable th) {
/* 922 */                           throw th;
                                }
                            }
/* 918 */                   return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 828 */                   IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiI;
/* 834 */                   float fI000II = ((OIooO1iiliI) this.I00iiO).I000II();
/* 855 */                   return Float.valueOf(lIiioliIlo.I00000oOI((iiloOlIoIool.I00000oOI.I0001Ioi1lo() - fI000II) / (0.0f - fI000II), 0.0f, 1.0f));
                        case 9:
/* 803 */                   IoIlOo1o0IIl ioIlOo1o0IIl = (IoIlOo1o0IIl) this.I00iiI;
/* 807 */                   OOlol1ilOllO oOlol1ilOllO = (OOlol1ilOllO) this.I00iiO;
/* 817 */                   if (((I1Ooo1ii0l) ioIlOo1o0IIl.I00iiI).get() == 0) {
/* 820 */                       oOlol1ilOllO.invoke();
                            }
/* 823 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 796 */                   ((IOl0OoOIliI1) this.I00iiO).I0000O = (IlliIl1l11O) this.I00iiI;
/* 798 */                   return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 783 */                   return il0IOl1lI1l0.I00000oIO((Context) this.I00iiI, ((O0o0ill01o0) this.I00iiO).I00000oOI.concat(".preferences_pb"));
                        case 12:
/* 735 */                   OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiI;
/* 739 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 758 */                   iOi1II01i0.I0000O(OooiooIOO.I00000oIO(oOl1OlI0), null, null, new O1iIlllIoo(oOl1OlI0, (String) oI10i0Il2.getValue(), iOoil1iiIilo, 16), 3);
/* 761 */                   oI10i0Il2.setValue(null);
/* 764 */                   return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 659 */                   OI10IIO oi10iio = (OI10IIO) this.I00iiI;
/* 663 */                   IOlIOiI0iiI1 iOlIOiI0iiI1 = (IOlIOiI0iiI1) this.I00iiO;
/* 665 */                   Object[] objArr = oi10iio.I00000oOI;
/* 667 */                   long[] jArr = oi10iio.I00000oIO;
/* 670 */                   int length = jArr.length - 2;
/* 671 */                   if (length >= 0) {
/* 673 */                       int i2 = 0;
                                while (true) {
/* 674 */                           long j = jArr[i2];
/* 688 */                           if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 697 */                               int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 700 */                               for (int i4 = 0; i4 < i3; i4++) {
/* 709 */                                   if ((255 & j) < 128) {
/* 716 */                                       iOlIOiI0iiI1.I001lllioOl(objArr[(i2 << 3) + i4]);
                                            }
/* 719 */                                   j >>= 8;
                                        }
/* 723 */                               if (i3 == 8) {
/* 725 */                                   if (i2 != length) {
/* 727 */                                       i2++;
                                            }
                                        }
                                    }
                                }
                            }
/* 730 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 640 */                   OOoiliiIoloI oOoiliiIoloI = (OOoiliiIoloI) this.I00iiI;
/* 644 */                   CharSequence charSequence = (CharSequence) this.I00iiO;
/* 652 */                   return lIo0ol0oI010.I00000oIO(oOoiliiIoloI.I00iOIl.matcher(charSequence), 0, charSequence);
                        case 15:
/* 633 */                   ((OOo0ooi) this.I00iiI).I00iOIl = ((I0oo10O) this.I00iiO).I00o0l1o1o0.invoke();
/* 635 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 594 */                   String str = (String) this.I00iiI;
/* 598 */                   Oii01oOII oii01oOII = (Oii01oOII) this.I00iiO;
/* 606 */                   Oii01o1iiOI oii01o1iiOI = new Oii01o1iiOI(i);
/* 609 */                   oii01o1iiOI.I00iiI = oii01oOII;
/* 611 */                   VarHandle.storeStoreFence();
/* 614 */                   return lO1o10lllO0I.I00000oOI(str, OO1l1i.I0000Il00O, new OilOloI[0], oii01o1iiOI);
                        case 17:
/* 587 */                   ((OOo0ooi) this.I00iiI).I00iOIl = iiliIooIliOo.I00000oIO((OiiOIlioi0) this.I00iiO, OO110li0ioo.I00000oIO);
/* 589 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 495 */                   Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) this.I00iiI;
/* 507 */                   long j2 = ((IooOl0ol01) ((OI10i0Il) this.I00iiO).getValue()).I00000oIO;
/* 509 */                   OiiOlI0I oiiOlI0II000OOo1O = oiill0lI1il1.I000OOo1O();
/* 513 */                   long jI00000oOI = 9205357640488583168L;
/* 518 */                   if (oiiOlI0II000OOo1O != null) {
/* 521 */                       Io11Oll io11OllI000O01llI0 = oiill0lI1il1.I000O01llI0();
/* 535 */                       int i5 = io11OllI000O01llI0 == null ? -1 : Oiilll1OOi0.I00000oIO[io11OllI000O01llI0.ordinal()];
/* 537 */                       if (i5 != -1) {
/* 539 */                           if (i5 == 1) {
/* 564 */                               jI00000oOI = iO0loiii.I00000oOI(oiill0lI1il1, j2, oiiOlI0II000OOo1O.I00000oIO);
                                    } else {
/* 541 */                               if (i5 != 2) {
/* 543 */                                   if (i5 != 3) {
/* 545 */                                       I000II.I00000oIO();
/* 10 */                                        return null;
                                            }
/* 551 */                                   I000II.I001IO000("SelectionContainer does not support cursor");
/* 10 */                                    return null;
                                        }
/* 557 */                               jI00000oOI = iO0loiii.I00000oOI(oiill0lI1il1, j2, oiiOlI0II000OOo1O.I00000oOI);
                                    }
                                }
                            }
/* 568 */                   return OIOlIiiioi.I00000oIO(jI00000oOI);
                        case PoseLandmark.LEFT_INDEX:
/* 487 */                   ((OilIlo) this.I00iiI).I000O01llI0((O1oIOiI11o0) this.I00iiO);
/* 490 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 473 */                   ((I0lOl0I0) ((IOO0i0o1O0l) this.I00iiI)).I00000oOI(new I1111OO10i(((Oil1oo000i) this.I00iiO).I00000oIO));
/* 476 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 450 */                   ((Context) this.I00iiI).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Ool01lI1) this.I00iiO).I00000oOI)));
/* 453 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 380 */                   O1lIIi o1lIIi = (O1lIIi) this.I00iiI;
/* 384 */                   ConnectivityManager connectivityManager = (ConnectivityManager) this.I00iiO;
                            synchronized (Oiolol0ii1.I00000oOI) {
/* 389 */                       LinkedHashMap linkedHashMap = Oiolol0ii1.I0000Il00O;
/* 391 */                       linkedHashMap.remove(o1lIIi);
/* 398 */                       if (linkedHashMap.isEmpty()) {
/* 400 */                           IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 404 */                           int i6 = i01I01lIOo.I00000oIO;
/* 406 */                           iIi0oIlI000II.getClass();
/* 411 */                           connectivityManager.unregisterNetworkCallback(Oiolol0ii1.I00000oIO);
/* 414 */                           Oiolol0ii1.I0001Ioi1lo = null;
/* 416 */                           Oiolol0ii1.I0000O = null;
/* 418 */                           Oiolol0ii1.I0000oI00 = false;
                                }
                            }
/* 424 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 372 */                   ((I101liloIo1) this.I00iiI).I00000oIO(((Ol0ioI1iI) this.I00iiO).I00111O());
/* 375 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 343 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 347 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiO;
/* 351 */                   oI10i0Il3.setValue(Boolean.FALSE);
/* 354 */                   oIooi1iOiOol.I000O01llI0(-1);
/* 357 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 298 */                   Ol1OiolO0 ol1OiolO0 = (Ol1OiolO0) this.I00iiI;
/* 302 */                   IlI1ooiil1lo ilI1ooiil1lo = (IlI1ooiil1lo) this.I00iiO;
/* 310 */                   if (!O0000Ioio00.I0000O(ol1OiolO0, ilI1ooiil1lo.I00000oIO)) {
/* 312 */                       ArrayList arrayList3 = ilI1ooiil1lo.I00000oOI;
/* 316 */                       Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(i);
/* 319 */                       ol1OiIli00Ii.I00iiI = ol1OiolO0;
/* 321 */                       VarHandle.storeStoreFence();
/* 324 */                       IOOii0O10Io0.I0010I0i(arrayList3, ol1OiIli00Ii);
/* 327 */                       OOloioIl oOloioIl = ilI1ooiil1lo.I0000Il00O;
/* 329 */                       if (oOloioIl != null && (oOlol11 = oOloioIl.I00000oIO) != null) {
/* 335 */                           oOlol11.I0000Il00O(oOloioIl, null);
                                }
                            }
/* 338 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 291 */                   return ((Ol1OiIli00Ii) this.I00iiI).invoke((WorkDatabase) this.I00iiO);
                        case 27:
/* 246 */                   Ii10ioolOI ii10ioolOI = (Ii10ioolOI) this.I00iiI;
/* 250 */                   O00OoO o00OoO = (O00OoO) this.I00iiO;
/* 254 */                   String str2 = (String) ii10ioolOI.I0001Ioi1lo;
/* 256 */                   O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 260 */                   i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 278 */                   return IIl001iO0Io.I000oI1ioi("Client sending message via POST to ", str2, ": ", o011OoiO1I00000oIO.I0000O(O00OoO.Companion.serializer(), o00OoO));
                        case PoseLandmark.RIGHT_ANKLE:
/* 102 */                   Oliii00iliIi oliii00iliIi = (Oliii00iliIi) this.I00iiI;
/* 106 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiO;
/* 108 */                   OlO0OIIl1 olO0OIIl14 = oliii00iliIi.I00000oOI;
/* 110 */                   Object obj5 = o1oIOiI11o02.I00IlilI0i0i;
/* 120 */                   OliiOI oliiOI = obj5 instanceof OliiOI ? (OliiOI) obj5 : null;
/* 121 */                   if (oliiOI == null) {
/* 143 */                       olO0OIIl14.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl14.getValue(), null, false, 0, 0.0f, 0, "Model not loaded. Try re-initializing.", 31));
                            } else if (!((OliiOl0) olO0OIIl14.getValue()).I00000oOI) {
/* 163 */                       OliiOl0 oliiOl0 = (OliiOl0) olO0OIIl14.getValue();
/* 171 */                       String string = OlOoOIi0o.I00OIo(oliiOl0.I00000oIO).toString();
/* 179 */                       if (string.length() == 0) {
/* 197 */                           olO0OIIl14.I000lI(null, OliiOl0.I00000oIO(oliiOl0, null, false, 0, 0.0f, 0, "Enter some text first", 31));
                                } else {
/* 217 */                           olO0OIIl14.I000lI(null, OliiOl0.I00000oIO(oliiOl0, null, true, 0, 0.0f, 0, null, 29));
/* 239 */                           oliii00iliIi.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(oliii00iliIi), IiiIil1lOIO.I00000oIO, null, new O1o1iI(oliiOI, string, oliiOl0, oliii00iliIi, (IOoil1iiIilo) null, 16), 2);
                                }
                            }
/* 241 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 16 */                    OlilioIoO11 olilioIoO11 = (OlilioIoO11) this.I00iiI;
/* 20 */                    List list2 = (List) this.I00iiO;
/* 22 */                    I1ioiI i1ioiI = OlOOIoOO0OI.I00000oIO;
/* 34 */                    long[] jArr2 = (long[]) ((IIioli) olilioIoO11.I00000oIO).I0000O(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
/* 36 */                    if (jArr2 == null || jArr2.length == 0) {
/* 93 */                        z = false;
                            } else {
/* 44 */                        HashSet hashSet = new HashSet();
/* 49 */                        for (long j3 : jArr2) {
/* 57 */                            hashSet.add(Long.valueOf(j3));
                                }
/* 63 */                        Iterator it = list2.iterator();
/* 71 */                        while (it.hasNext()) {
/* 91 */                            if (!hashSet.contains(Long.valueOf(((Olio00O) it.next()).I0000Il00O.I00iOIl))) {
/* 93 */                                z = false;
                                    }
                                }
                            }
/* 94 */                    return Boolean.valueOf(z);
                    }
                }

/* 10 */        public O1l110o(int i) {
/* 11 */            this.I00iOIl = i;
                }
            }
