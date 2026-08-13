            package p000;

            import android.R;
            import android.content.Context;
            import android.content.Intent;
            import android.content.res.Resources;
            import android.net.Uri;
            import com.box.gallery.MainActivity;
            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            import javax.crypto.Cipher;
            import kotlin.jvm.functions.Function1;
            
            public final class O11IOOoiI10i implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public O11IOOoiI10i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:303:0x0755  */
                /* JADX WARN: Removed duplicated region for block: B:355:0x08b2  */
                /* JADX WARN: Type inference failed for: r9v18, types: [Oo0OI01Il] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Resources.NotFoundException, IOException {
                    Uri uri;
                    Object objI000II;
                    I11110l0o i11110l0o;
                    Integer numI0000oI00;
                    Integer numI0000O;
                    Integer numI0000O2;
                    Integer numI0000oI002;
                    Oo0iil0o0oI oo0iil0o0oI;
                    Oo0iil0o0oI oo0iil0o0oI2;
                    Oo0il0olo1l oo0il0olo1l;
                    Oo0il0olo1l oo0il0olo1l2;
                    Oo0iil0o0oI oo0iil0o0oI3;
                    Oo0iil0o0oI oo0iil0o0oI4;
                    Oo0il0olo1l oo0il0olo1l3;
                    Oo0il0olo1l oo0il0olo1l4;
                    Integer numI0000O3;
                    Integer numI0000oI003;
                    Integer numI0000oI004;
                    Integer numI0000O4;
                    OoIol00Ool ooIol00Ool;
                    Uri data;
                    Uri data2;
/* 7 */             int i = 8;
/* 9 */             int i2 = 5;
/* 15 */            int i3 = 2;
/* 16 */            int i4 = 0;
/* 17 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 17 */            Oo0OI01Il oo0OI01Il = null;
/* 17 */            iOoil1iiIilo = null;
/* 18 */            int i5 = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 2547 */                  O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiI;
/* 2551 */                  Function1 function1 = (Function1) this.I00iiO;
/* 2555 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iio;
/* 2558 */                  String str = (String) obj;
/* 2560 */                  OlO0OIIl1 olO0OIIl1 = o11iO00I1o.I000OOo1O;
/* 2562 */                  olO0OIIl1.getClass();
/* 2565 */                  boolean z = false;
/* 2566 */                  olO0OIIl1.I000lI(null, str);
/* 2569 */                  String str2 = o11iO00I1o.I0001Ioi1lo;
/* 2571 */                  if (str2 != null) {
/* 2574 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o11iO00I1o);
/* 2578 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 2589 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new IiI110i1O(o11iO00I1o, str2, str, z ? 1 : 0, 21), 2);
                            }
/* 2592 */                  function1.invoke(str);
/* 2605 */                  O1oIOiI11o0 o1oIOiI11o0 = ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I000II;
/* 2623 */                  O11iO00I1o.I00111O(o11iO00I1o, o1oIOiI11o0, OlOoOIi0o.I001l0I00(str) ? null : Contents.INSTANCE.of(str), o1oIOiI11o0.I001i1O0Ol, o1oIOiI11o0.I001i1lo1io);
/* 2626 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2470 */                  O11l1I o11l1I = (O11l1I) this.I00iiI;
/* 2475 */                  OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) this.I00iiO;
/* 2480 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iio;
/* 2499 */                  iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o11l1I), IiiIil1lOIO.I00000oIO, null, new I0iOI0o1i((OooioIIoi0O) o11l1I, o1oIOiI11o02, (Object) oloIl1l1oOii, obj, (IOoil1iiIilo) null, 27), 2);
/* 2502 */                  FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 2506 */                  if (firebaseAnalyticsI00000oIO != null) {
/* 2508 */                      Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 2538 */                      firebaseAnalyticsI00000oIO.I00000oIO("generate_action", iOiIOo1010i.I00000oIO(new OIoi0IIoi("capability_name", oloIl1l1oOii.I00000oIO), new OIoi0IIoi("model_id", o1oIOiI11o02.I00000oIO)));
                            }
/* 2541 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 2378 */                  Ill0oOi0 ill0oOi0 = (Ill0oOi0) this.I00iiI;
/* 2382 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 2387 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
                            try {
/* 2392 */                      byte[] bArrI00000oOI = II0Oi0iIol0i.I00000oOI(ill0oOi0, (Cipher) obj);
/* 2396 */                      OlO0OIIl1 olO0OIIl12 = OO01IO.I00000oIO;
/* 2403 */                      OO01IO.I0000Il00O = Arrays.copyOf(bArrI00000oOI, bArrI00000oOI.length);
/* 2405 */                      OlO0OIIl1 olO0OIIl13 = OO01IO.I00000oIO;
/* 2407 */                      Boolean bool = Boolean.TRUE;
/* 2409 */                      olO0OIIl13.getClass();
/* 2412 */                      olO0OIIl13.I000lI(null, bool);
/* 2424 */                      MainActivity mainActivity = ill0oOi0 instanceof MainActivity ? (MainActivity) ill0oOi0 : null;
/* 2425 */                      if (mainActivity != null) {
/* 2427 */                          mainActivity.I0100i = true;
/* 2429 */                          OlO0OIIl1 olO0OIIl14 = I1IIl0I0l1I.I00000oIO;
/* 2431 */                          olO0OIIl14.getClass();
/* 2434 */                          olO0OIIl14.I000lI(null, bool);
                                }
                            } catch (Exception e) {
/* 2456 */                      oI10i0Il.setValue("Decryption failed: " + e.getMessage());
                            }
/* 2461 */                  oI10i0Il2.setValue(Boolean.FALSE);
/* 2464 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 2342 */                  O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00iio;
/* 2346 */                  O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00iiI;
/* 2350 */                  I0IoiIiOoi i0IoiIiOoi = (I0IoiIiOoi) this.I00iiO;
/* 2352 */                  String str3 = (String) obj;
/* 2361 */                  o1ol100o0O2.I00Io1o110i(o1oIOiI11o03, new O1oOil(O1oOl0.I00iiO));
/* 2368 */                  if (str3.length() > 0) {
/* 2370 */                      i0IoiIiOoi.invoke(str3);
                            }
/* 2373 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 2288 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 2293 */                  O1o1io0oi0ol o1o1io0oi0ol = (O1o1io0oi0ol) this.I00iiO;
/* 2298 */                  Context context = (Context) this.I00iio;
/* 2307 */                  if (((Boolean) obj).booleanValue() && (uri = (Uri) oI10i0Il3.getValue()) != null) {
/* 2318 */                      IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(o1o1io0oi0ol);
/* 2322 */                      IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 2334 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO2, Ii1oo1ooill0.I00iiI, null, new IiI110i1O(o1o1io0oi0ol, context, uri, null, 25), 2);
                            }
/* 2337 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 2255 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
/* 2259 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiO;
/* 2263 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iio;
/* 2269 */                  oI10i0Il4.setValue(Boolean.FALSE);
/* 2280 */                  illiIl1l11O.invoke(((O1oiOloOo) oI10i0Il5.getValue()).I000II, (O1oIOiI11o0) obj);
/* 2283 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 2124 */                  Set set = (Set) this.I00iiI;
/* 2128 */                  OI0i0O1IiiIO oI0i0O1IiiIO = (OI0i0O1IiiIO) this.I00iiO;
/* 2132 */                  OOo0ooi oOo0ooi = (OOo0ooi) this.I00iio;
/* 2138 */                  if (set.contains(obj) && (objI000II = oI0i0O1IiiIO.I00iiI.I000II(obj)) != null) {
/* 2150 */                      if (objI000II instanceof OI10IIO) {
/* 2152 */                          OI10IIO oi10iio = (OI10IIO) objI000II;
/* 2154 */                          Object[] objArr = oi10iio.I00000oOI;
/* 2156 */                          long[] jArr = oi10iio.I00000oIO;
/* 2159 */                          int length = jArr.length - 2;
/* 2160 */                          if (length >= 0) {
/* 2162 */                              int i6 = 0;
                                        while (true) {
/* 2163 */                                  long j = jArr[i6];
/* 2177 */                                  if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 2184 */                                      int i7 = 8 - ((~(i6 - length)) >>> 31);
/* 2187 */                                      for (int i8 = 0; i8 < i7; i8++) {
/* 2196 */                                          if ((255 & j) < 128) {
/* 2203 */                                              Oil1IOoo1lI oil1IOoo1lI = (Oil1IOoo1lI) objArr[(i6 << 3) + i8];
/* 2205 */                                              Object obj2 = oOo0ooi.I00iOIl;
                                                        Object obj3 = obj2;
/* 2207 */                                              if (obj2 == null) {
/* 2211 */                                                  ArrayList arrayList = new ArrayList();
/* 2214 */                                                  oOo0ooi.I00iOIl = arrayList;
                                                            obj3 = arrayList;
                                                        }
/* 2218 */                                              ((List) obj3).add(oil1IOoo1lI);
                                                    }
/* 2221 */                                          j >>= 8;
                                                }
/* 2225 */                                      if (i7 == 8) {
/* 2227 */                                          if (i6 != length) {
/* 2229 */                                              i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
/* 2232 */                          Oil1IOoo1lI oil1IOoo1lI2 = (Oil1IOoo1lI) objI000II;
/* 2234 */                          Object obj4 = oOo0ooi.I00iOIl;
                                    Object obj5 = obj4;
/* 2236 */                          if (obj4 == null) {
/* 2240 */                              ArrayList arrayList2 = new ArrayList();
/* 2243 */                              oOo0ooi.I00iOIl = arrayList2;
                                        obj5 = arrayList2;
                                    }
/* 2247 */                          ((List) obj5).add(oil1IOoo1lI2);
                                }
                            }
/* 2250 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 2076 */                  String str4 = (String) this.I00iiI;
/* 2080 */                  IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiO;
/* 2084 */                  Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 2086 */                  Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 2088 */                  Oil0Io.I000O01llI0(oil0O0I, str4);
/* 2095 */                  if (iiloOlIoIool.I0000Il00O()) {
/* 2099 */                      IoI0O1IIii ioI0O1IIii = new IoI0O1IIii(i3);
/* 2102 */                      ioI0O1IIii.I00iiO = iiloOlIoIool;
/* 2104 */                      ioI0O1IIii.I00iiI = ii0110;
/* 2106 */                      VarHandle.storeStoreFence();
/* 2116 */                      oil0O0I.I00000oOI(Oiioi1IoIIli.I001IO000, new I01lOOlO0o(null, ioI0O1IIii));
                            }
/* 2119 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 2030 */                  OII11i oII11i = (OII11i) this.I00iiI;
/* 2034 */                  IOiolo0oi0o iOiolo0oi0o = (IOiolo0oi0o) this.I00iiO;
/* 2038 */                  iOliil ioliil = (iOliil) this.I00iio;
/* 2044 */                  if (oII11i.I0000oI00 != null) {
/* 2070 */                      OIiilo1Ool0o.I000OiO("NavigationEventState '", oII11i, "' is already registered with a NavigationEventHandler '", iOiolo0oi0o, "'.");
/* 17 */                        return null;
                            }
/* 2046 */                  oII11i.I0000oI00 = iOiolo0oi0o;
/* 2048 */                  iOliil.I000O01llI0(ioliil, iOiolo0oi0o);
/* 2053 */                  I1loO00 i1loO00 = new I1loO00(i);
/* 2056 */                  i1loO00.I00000oOI = iOiolo0oi0o;
/* 2058 */                  i1loO00.I0000Il00O = oII11i;
/* 2060 */                  VarHandle.storeStoreFence();
/* 2073 */                  return i1loO00;
                        case 9:
/* 1979 */                  OiIil1il oiIil1il = (OiIil1il) this.I00iiI;
/* 1981 */                  Object obj6 = this.I00iiO;
/* 1985 */                  OiIl1O1OO oiIl1O1OO = (OiIl1O1OO) this.I00iio;
/* 1989 */                  OI10I1IoI0Ol oI10I1IoI0Ol = oiIil1il.I00iiI;
/* 1995 */                  if (oI10I1IoI0Ol.I00000oOI(obj6)) {
/* 2024 */                      OIiilo1Ool0o.I0010o(obj6, "Key ", " was used multiple times ");
/* 17 */                        return null;
                            }
/* 1999 */                  oiIil1il.I00iOIl.remove(obj6);
/* 2002 */                  oI10I1IoI0Ol.I000lI(obj6, oiIl1O1OO);
/* 2007 */                  I01oiO0OI0 i01oiO0OI0 = new I01oiO0OI0(i2);
/* 2010 */                  i01oiO0OI0.I00000oOI = oiIil1il;
/* 2012 */                  i01oiO0OI0.I0000Il00O = obj6;
/* 2014 */                  i01oiO0OI0.I0000O = oiIl1O1OO;
/* 2016 */                  VarHandle.storeStoreFence();
/* 2027 */                  return i01oiO0OI0;
                        case 10:
/* 1949 */                  OI0IIiI1lIol oI0IIiI1lIol = (OI0IIiI1lIol) this.I00iiI;
/* 1953 */                  OiiOloi1o oiiOloi1o = (OiiOloi1o) this.I00iiO;
/* 1957 */                  OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iio;
/* 1959 */                  OO1il00lI oO1il00lI = (OO1il00lI) obj;
/* 1967 */                  if (oI0IIiI1lIol.I0000O(oO1il00lI.I0000Il00O, oiiOloi1o)) {
/* 1969 */                      oO1il00lI.I00000oIO();
/* 1972 */                      oOo0l0ii10l.I00iOIl = true;
                            }
/* 1974 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 1908 */                  IIOIlOoI111 iIOIlOoI111 = (IIOIlOoI111) this.I00iiI;
/* 1912 */                  iOliil ioliil2 = (iOliil) this.I00iiO;
/* 1916 */                  IOioOOi0I iOioOOi0I = (IOioOOi0I) this.I00iio;
/* 1918 */                  Throwable th = (Throwable) obj;
/* 1920 */                  iIOIlOoI111.invoke(th);
/* 1925 */                  IIIII1OI1 iiiii1oi1 = (IIIII1OI1) ioliil2.I00iio;
/* 1927 */                  iiiii1oi1.I0000Il00O(false, th);
                            while (true) {
/* 1934 */                      Object objI0000Il00O = IO10lIoiO.I0000Il00O(iiiii1oi1.I0000oI00());
/* 1938 */                      if (objI0000Il00O == null) {
/* 1944 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 1940 */                      iOioOOi0I.invoke(objI0000Il00O, th);
                            }
                        case 12:
/* 1902 */                  return new Oll1l0IOli((Oll1lO) obj, (IiIooOOOI) this.I00iiI, (Function1) this.I00iiO, (Function1) this.I00iio);
                        case 13:
/* 1803 */                  OOo0l0ii10l oOo0l0ii10l2 = (OOo0l0ii10l) this.I00iiI;
/* 1807 */                  I11110l0o i11110l0o2 = (I11110l0o) this.I00iiO;
/* 1811 */                  OlIIi1oIIOlo olIIi1oIIOlo = (OlIIi1oIIOlo) this.I00iio;
/* 1813 */                  I11110l0o i11110l0o3 = (I11110l0o) obj;
/* 1817 */                  if (oOo0l0ii10l2.I00iOIl) {
/* 1819 */                      Object obj7 = i11110l0o3.I00000oIO;
/* 1821 */                      int i9 = i11110l0o3.I0000Il00O;
/* 1823 */                      int i10 = i11110l0o3.I00000oOI;
/* 1827 */                      if ((obj7 instanceof OlIIi1oIIOlo) && i10 == i11110l0o2.I00000oOI && i9 == i11110l0o2.I0000Il00O) {
/* 1839 */                          if (olIIi1oIIOlo == null) {
/* 1870 */                              olIIi1oIIOlo = new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                                    }
/* 1874 */                          i11110l0o = new I11110l0o(olIIi1oIIOlo, i10, i9);
                                } else {
/* 1878 */                          i11110l0o = i11110l0o3;
                                }
                            }
/* 1883 */                  oOo0l0ii10l2.I00iOIl = i11110l0o2.equals(i11110l0o3);
/* 1885 */                  return i11110l0o;
                        case 14:
/* 1770 */                  I1I0i0Ilo1Oi i1I0i0Ilo1Oi = (I1I0i0Ilo1Oi) this.I00iiI;
/* 1774 */                  IOooI1o iOooI1o = (IOooI1o) this.I00iiO;
/* 1784 */                  Oo0i01111o oo0i01111o = (Oo0i01111o) ((OOo0ooi) this.I00iio).I00iOIl;
/* 1786 */                  Oo0OI01Il oo0OI01IlI001lloI = i1I0i0Ilo1Oi.I001lloI((List) obj);
/* 1790 */                  if (oo0i01111o != null) {
/* 1792 */                      oo0i01111o.I00000oIO(null, oo0OI01IlI001lloI);
                            }
/* 1795 */                  iOooI1o.invoke(oo0OI01IlI001lloI);
/* 1798 */                  return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 508 */                   O0O1Ool o0O1Ool = (O0O1Ool) this.I00iiI;
/* 512 */                   Oo01IOO0O10 oo01IOO0O10 = (Oo01IOO0O10) this.I00iiO;
/* 516 */                   OOo0l0ii10l oOo0l0ii10l3 = (OOo0l0ii10l) this.I00iio;
/* 518 */                   Oo0I01o oo0I01o = (Oo0I01o) obj;
/* 520 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                            switch (o0O1Ool.ordinal()) {
                                case 0:
/* 1716 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1726 */                          if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 1734 */                              if (Oo0lI00l.I0000O(oo0I01o.I0001Ioi1lo)) {
/* 1736 */                                  oo0I01o.I000OOo1O();
                                            break;
                                        } else {
/* 1741 */                                  boolean zI0001Ioi1lo = oo0I01o.I0001Ioi1lo();
/* 1745 */                                  long j2 = oo0I01o.I0001Ioi1lo;
/* 1747 */                                  if (zI0001Ioi1lo) {
/* 1749 */                                      int iI000II = Oo0lI00l.I000II(j2);
/* 1753 */                                      oo0I01o.I00100o1O0lo(iI000II, iI000II);
                                                break;
                                            } else {
/* 1758 */                                      int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(j2);
/* 1762 */                                      oo0I01o.I00100o1O0lo(iI0001Ioi1lo, iI0001Ioi1lo);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 1:
/* 1663 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1673 */                          if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 1681 */                              if (Oo0lI00l.I0000O(oo0I01o.I0001Ioi1lo)) {
/* 1683 */                                  oo0I01o.I000lI();
                                            break;
                                        } else {
/* 1688 */                                  boolean zI0001Ioi1lo2 = oo0I01o.I0001Ioi1lo();
/* 1692 */                                  long j3 = oo0I01o.I0001Ioi1lo;
/* 1694 */                                  if (zI0001Ioi1lo2) {
/* 1696 */                                      int iI0001Ioi1lo2 = Oo0lI00l.I0001Ioi1lo(j3);
/* 1700 */                                      oo0I01o.I00100o1O0lo(iI0001Ioi1lo2, iI0001Ioi1lo2);
                                                break;
                                            } else {
/* 1705 */                                      int iI000II2 = Oo0lI00l.I000II(j3);
/* 1709 */                                      oo0I01o.I00100o1O0lo(iI000II2, iI000II2);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
/* 1593 */                          Oo0l1Ooo oo0l1Ooo = oo0I01o.I0000oI00;
/* 1595 */                          oo0l1Ooo.I00000oIO = null;
/* 1597 */                          I1111OO10i i1111OO10i = oo0I01o.I000II;
/* 1599 */                          String str5 = i1111OO10i.I00iiI;
/* 1601 */                          String str6 = i1111OO10i.I00iiI;
/* 1607 */                          if (str5.length() > 0) {
/* 1613 */                              if (oo0I01o.I0001Ioi1lo()) {
/* 1615 */                                  oo0l1Ooo.I00000oIO = null;
/* 1621 */                                  if (str6.length() > 0 && (numI0000O = oo0I01o.I0000O()) != null) {
/* 1629 */                                      int iIntValue = numI0000O.intValue();
/* 1633 */                                      oo0I01o.I00100o1O0lo(iIntValue, iIntValue);
                                                break;
                                            }
                                        } else {
/* 1638 */                                  oo0l1Ooo.I00000oIO = null;
/* 1644 */                                  if (str6.length() > 0 && (numI0000oI00 = oo0I01o.I0000oI00()) != null) {
/* 1652 */                                      int iIntValue2 = numI0000oI00.intValue();
/* 1656 */                                      oo0I01o.I00100o1O0lo(iIntValue2, iIntValue2);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
/* 1525 */                          Oo0l1Ooo oo0l1Ooo2 = oo0I01o.I0000oI00;
/* 1527 */                          oo0l1Ooo2.I00000oIO = null;
/* 1529 */                          I1111OO10i i1111OO10i2 = oo0I01o.I000II;
/* 1531 */                          String str7 = i1111OO10i2.I00iiI;
/* 1533 */                          String str8 = i1111OO10i2.I00iiI;
/* 1539 */                          if (str7.length() > 0) {
/* 1545 */                              if (oo0I01o.I0001Ioi1lo()) {
/* 1547 */                                  oo0l1Ooo2.I00000oIO = null;
/* 1553 */                                  if (str8.length() > 0 && (numI0000oI002 = oo0I01o.I0000oI00()) != null) {
/* 1561 */                                      int iIntValue3 = numI0000oI002.intValue();
/* 1565 */                                      oo0I01o.I00100o1O0lo(iIntValue3, iIntValue3);
                                                break;
                                            }
                                        } else {
/* 1570 */                                  oo0l1Ooo2.I00000oIO = null;
/* 1576 */                                  if (str8.length() > 0 && (numI0000O2 = oo0I01o.I0000O()) != null) {
/* 1584 */                                      int iIntValue4 = numI0000O2.intValue();
/* 1588 */                                      oo0I01o.I00100o1O0lo(iIntValue4, iIntValue4);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 4:
/* 1520 */                          oo0I01o.I000OiO();
                                    break;
                                case 5:
/* 1515 */                          oo0I01o.I000l1();
                                    break;
                                case 6:
/* 1510 */                          oo0I01o.I000oI1ioi();
                                    break;
                                case 7:
/* 1505 */                          oo0I01o.I000o00OoI0I();
                                    break;
                                case 8:
/* 1477 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1487 */                          if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 1493 */                              if (oo0I01o.I0001Ioi1lo()) {
/* 1495 */                                  oo0I01o.I000oI1ioi();
                                            break;
                                        } else {
/* 1500 */                                  oo0I01o.I000o00OoI0I();
                                            break;
                                        }
                                    }
                                    break;
                                case 9:
/* 1447 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1457 */                          if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 1463 */                              if (oo0I01o.I0001Ioi1lo()) {
/* 1465 */                                  oo0I01o.I000o00OoI0I();
                                            break;
                                        } else {
/* 1470 */                                  oo0I01o.I000oI1ioi();
                                            break;
                                        }
                                    }
                                    break;
                                case 10:
/* 1430 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0iil0o0oI = oo0I01o.I0000Il00O) != null) {
/* 1436 */                              int iI000II3 = oo0I01o.I000II(oo0iil0o0oI, -1);
/* 1440 */                              oo0I01o.I00100o1O0lo(iI000II3, iI000II3);
                                        break;
                                    }
                                    break;
                                case 11:
/* 1407 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0iil0o0oI2 = oo0I01o.I0000Il00O) != null) {
/* 1413 */                              int iI000II4 = oo0I01o.I000II(oo0iil0o0oI2, 1);
/* 1417 */                              oo0I01o.I00100o1O0lo(iI000II4, iI000II4);
                                        break;
                                    }
                                    break;
                                case 12:
                                case 48:
                                    break;
                                case 13:
/* 1384 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0il0olo1l = oo0I01o.I000OOo1O) != null) {
/* 1390 */                              int iI000O01llI0 = oo0I01o.I000O01llI0(oo0il0olo1l, -1);
/* 1394 */                              oo0I01o.I00100o1O0lo(iI000O01llI0, iI000O01llI0);
                                        break;
                                    }
                                    break;
                                case 14:
/* 1361 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0il0olo1l2 = oo0I01o.I000OOo1O) != null) {
/* 1367 */                              int iI000O01llI02 = oo0I01o.I000O01llI0(oo0il0olo1l2, 1);
/* 1371 */                              oo0I01o.I00100o1O0lo(iI000O01llI02, iI000O01llI02);
                                        break;
                                    }
                                    break;
                                case 15:
/* 1336 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1346 */                          if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 1348 */                              oo0I01o.I00100o1O0lo(0, 0);
                                        break;
                                    }
                                    break;
                                case 16:
/* 1311 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1313 */                          I1111OO10i i1111OO10i3 = oo0I01o.I000II;
/* 1321 */                          if (i1111OO10i3.I00iiI.length() > 0) {
/* 1325 */                              int length2 = i1111OO10i3.I00iiI.length();
/* 1329 */                              oo0I01o.I00100o1O0lo(length2, length2);
                                        break;
                                    }
                                    break;
                                case 17:
/* 1304 */                          oo01IOO0O10.I00000oOI.I00000oIO(false);
                                    break;
                                case PoseLandmark.RIGHT_PINKY:
/* 1297 */                          oo01IOO0O10.I00000oOI.I000oI1ioi();
                                    break;
                                case PoseLandmark.LEFT_INDEX:
/* 1290 */                          oo01IOO0O10.I00000oOI.I0000Il00O();
                                    break;
                                case PoseLandmark.RIGHT_INDEX:
/* 1277 */                          List listI00000oIO = oo0I01o.I00000oIO(new OiioI1Io0o(25));
/* 1281 */                          if (listI00000oIO != null) {
/* 1283 */                              oo01IOO0O10.I00000oIO(listI00000oIO);
                                        break;
                                    }
                                    break;
                                case PoseLandmark.LEFT_THUMB:
/* 1259 */                          List listI00000oIO2 = oo0I01o.I00000oIO(new OiioI1Io0o(26));
/* 1263 */                          if (listI00000oIO2 != null) {
/* 1265 */                              oo01IOO0O10.I00000oIO(listI00000oIO2);
                                        break;
                                    }
                                    break;
                                case PoseLandmark.RIGHT_THUMB:
/* 1241 */                          List listI00000oIO3 = oo0I01o.I00000oIO(new OiioI1Io0o(27));
/* 1245 */                          if (listI00000oIO3 != null) {
/* 1247 */                              oo01IOO0O10.I00000oIO(listI00000oIO3);
                                        break;
                                    }
                                    break;
                                case PoseLandmark.LEFT_HIP:
/* 1223 */                          List listI00000oIO4 = oo0I01o.I00000oIO(new OiioI1Io0o(28));
/* 1227 */                          if (listI00000oIO4 != null) {
/* 1229 */                              oo01IOO0O10.I00000oIO(listI00000oIO4);
                                        break;
                                    }
                                    break;
                                case PoseLandmark.RIGHT_HIP:
/* 1205 */                          List listI00000oIO5 = oo0I01o.I00000oIO(new OiioI1Io0o(29));
/* 1209 */                          if (listI00000oIO5 != null) {
/* 1211 */                              oo01IOO0O10.I00000oIO(listI00000oIO5);
                                        break;
                                    }
                                    break;
                                case PoseLandmark.LEFT_KNEE:
/* 1187 */                          List listI00000oIO6 = oo0I01o.I00000oIO(new Oo011oIOO1(i4));
/* 1191 */                          if (listI00000oIO6 != null) {
/* 1193 */                              oo01IOO0O10.I00000oIO(listI00000oIO6);
                                        break;
                                    }
                                    break;
                                case PoseLandmark.RIGHT_KNEE:
/* 1159 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1161 */                          I1111OO10i i1111OO10i4 = oo0I01o.I000II;
/* 1169 */                          if (i1111OO10i4.I00iiI.length() > 0) {
/* 1177 */                              oo0I01o.I00100o1O0lo(0, i1111OO10i4.I00iiI.length());
                                        break;
                                    }
                                    break;
                                case 27:
/* 1149 */                          oo0I01o.I000OOo1O();
/* 1152 */                          oo0I01o.I00100l0();
                                    break;
                                case PoseLandmark.RIGHT_ANKLE:
/* 1141 */                          oo0I01o.I000lI();
/* 1144 */                          oo0I01o.I00100l0();
                                    break;
                                case PoseLandmark.LEFT_HEEL:
/* 1123 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0iil0o0oI3 = oo0I01o.I0000Il00O) != null) {
/* 1129 */                              int iI000II5 = oo0I01o.I000II(oo0iil0o0oI3, -1);
/* 1133 */                              oo0I01o.I00100o1O0lo(iI000II5, iI000II5);
                                    }
/* 1136 */                          oo0I01o.I00100l0();
                                    break;
                                case 30:
/* 1097 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0iil0o0oI4 = oo0I01o.I0000Il00O) != null) {
/* 1103 */                              int iI000II6 = oo0I01o.I000II(oo0iil0o0oI4, 1);
/* 1107 */                              oo0I01o.I00100o1O0lo(iI000II6, iI000II6);
                                    }
/* 1110 */                          oo0I01o.I00100l0();
                                    break;
                                case PoseLandmark.LEFT_FOOT_INDEX:
/* 1071 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0il0olo1l3 = oo0I01o.I000OOo1O) != null) {
/* 1077 */                              int iI000O01llI03 = oo0I01o.I000O01llI0(oo0il0olo1l3, -1);
/* 1081 */                              oo0I01o.I00100o1O0lo(iI000O01llI03, iI000O01llI03);
                                    }
/* 1084 */                          oo0I01o.I00100l0();
                                    break;
                                case 32:
/* 1045 */                          if (oo0I01o.I000II.I00iiI.length() > 0 && (oo0il0olo1l4 = oo0I01o.I000OOo1O) != null) {
/* 1051 */                              int iI000O01llI04 = oo0I01o.I000O01llI0(oo0il0olo1l4, 1);
/* 1055 */                              oo0I01o.I00100o1O0lo(iI000O01llI04, iI000O01llI04);
                                    }
/* 1058 */                          oo0I01o.I00100l0();
                                    break;
                                case 33:
/* 1017 */                          oo0I01o.I0000oI00.I00000oIO = null;
/* 1027 */                          if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 1029 */                              oo0I01o.I00100o1O0lo(0, 0);
                                    }
/* 1032 */                          oo0I01o.I00100l0();
                                    break;
                                case 34:
/* 989 */                           oo0I01o.I0000oI00.I00000oIO = null;
/* 991 */                           I1111OO10i i1111OO10i5 = oo0I01o.I000II;
/* 999 */                           if (i1111OO10i5.I00iiI.length() > 0) {
/* 1003 */                              int length3 = i1111OO10i5.I00iiI.length();
/* 1007 */                              oo0I01o.I00100o1O0lo(length3, length3);
                                    }
/* 1010 */                          oo0I01o.I00100l0();
                                    break;
                                case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 917 */                           Oo0l1Ooo oo0l1Ooo3 = oo0I01o.I0000oI00;
/* 919 */                           oo0l1Ooo3.I00000oIO = null;
/* 921 */                           I1111OO10i i1111OO10i6 = oo0I01o.I000II;
/* 923 */                           String str9 = i1111OO10i6.I00iiI;
/* 925 */                           String str10 = i1111OO10i6.I00iiI;
/* 931 */                           if (str9.length() > 0) {
/* 937 */                               if (oo0I01o.I0001Ioi1lo()) {
/* 939 */                                   oo0l1Ooo3.I00000oIO = null;
/* 945 */                                   if (str10.length() > 0 && (numI0000oI003 = oo0I01o.I0000oI00()) != null) {
/* 953 */                                       int iIntValue5 = numI0000oI003.intValue();
/* 957 */                                       oo0I01o.I00100o1O0lo(iIntValue5, iIntValue5);
                                            }
                                        } else {
/* 961 */                                   oo0l1Ooo3.I00000oIO = null;
/* 967 */                                   if (str10.length() > 0 && (numI0000O3 = oo0I01o.I0000O()) != null) {
/* 975 */                                       int iIntValue6 = numI0000O3.intValue();
/* 979 */                                       oo0I01o.I00100o1O0lo(iIntValue6, iIntValue6);
                                            }
                                        }
                                    }
/* 982 */                           oo0I01o.I00100l0();
                                    break;
                                case 36:
/* 847 */                           Oo0l1Ooo oo0l1Ooo4 = oo0I01o.I0000oI00;
/* 849 */                           oo0l1Ooo4.I00000oIO = null;
/* 851 */                           I1111OO10i i1111OO10i7 = oo0I01o.I000II;
/* 853 */                           String str11 = i1111OO10i7.I00iiI;
/* 855 */                           String str12 = i1111OO10i7.I00iiI;
/* 861 */                           if (str11.length() > 0) {
/* 867 */                               if (oo0I01o.I0001Ioi1lo()) {
/* 869 */                                   oo0l1Ooo4.I00000oIO = null;
/* 875 */                                   if (str12.length() > 0 && (numI0000O4 = oo0I01o.I0000O()) != null) {
/* 883 */                                       int iIntValue7 = numI0000O4.intValue();
/* 887 */                                       oo0I01o.I00100o1O0lo(iIntValue7, iIntValue7);
                                            }
                                        } else {
/* 891 */                                   oo0l1Ooo4.I00000oIO = null;
/* 897 */                                   if (str12.length() > 0 && (numI0000oI004 = oo0I01o.I0000oI00()) != null) {
/* 905 */                                       int iIntValue8 = numI0000oI004.intValue();
/* 909 */                                       oo0I01o.I00100o1O0lo(iIntValue8, iIntValue8);
                                            }
                                        }
                                    }
/* 912 */                           oo0I01o.I00100l0();
                                    break;
                                case 37:
/* 839 */                           oo0I01o.I000OiO();
/* 842 */                           oo0I01o.I00100l0();
                                    break;
                                case 38:
/* 831 */                           oo0I01o.I000l1();
/* 834 */                           oo0I01o.I00100l0();
                                    break;
                                case 39:
/* 823 */                           oo0I01o.I000oI1ioi();
/* 826 */                           oo0I01o.I00100l0();
                                    break;
                                case 40:
/* 815 */                           oo0I01o.I000o00OoI0I();
/* 818 */                           oo0I01o.I00100l0();
                                    break;
                                case 41:
/* 785 */                           oo0I01o.I0000oI00.I00000oIO = null;
/* 795 */                           if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 801 */                               if (oo0I01o.I0001Ioi1lo()) {
/* 803 */                                   oo0I01o.I000oI1ioi();
                                        } else {
/* 807 */                                   oo0I01o.I000o00OoI0I();
                                        }
                                    }
/* 810 */                           oo0I01o.I00100l0();
                                    break;
                                case 42:
/* 753 */                           oo0I01o.I0000oI00.I00000oIO = null;
/* 763 */                           if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 769 */                               if (oo0I01o.I0001Ioi1lo()) {
/* 771 */                                   oo0I01o.I000o00OoI0I();
                                        } else {
/* 775 */                                   oo0I01o.I000oI1ioi();
                                        }
                                    }
/* 778 */                           oo0I01o.I00100l0();
                                    break;
                                case 43:
/* 728 */                           oo0I01o.I0000oI00.I00000oIO = null;
/* 738 */                           if (oo0I01o.I000II.I00iiI.length() > 0) {
/* 740 */                               long j4 = oo0I01o.I0001Ioi1lo;
/* 742 */                               int i11 = Oo0lI00l.I0000Il00O;
/* 745 */                               int i12 = (int) (j4 & 4294967295L);
/* 746 */                               oo0I01o.I00100o1O0lo(i12, i12);
                                        break;
                                    }
                                    break;
                                case 44:
/* 685 */                           if (oo01IOO0O10.I0000oI00) {
/* 722 */                               oOo0l0ii10l3.I00iOIl = ((Boolean) oo01IOO0O10.I00000oIO.I001i1lo1io.invoke(IoiiIoIo.I00000oIO(oo01IOO0O10.I000l1))).booleanValue();
                                        break;
                                    } else {
/* 698 */                               oo01IOO0O10.I00000oIO(Collections.singletonList(new IOi0OoOOIlli("\n", 1)));
                                        break;
                                    }
                                case BuildConfig.VERSION_CODE:
/* 663 */                           if (oo01IOO0O10.I0000oI00) {
/* 680 */                               oOo0l0ii10l3.I00iOIl = false;
                                        break;
                                    } else {
/* 676 */                               oo01IOO0O10.I00000oIO(Collections.singletonList(new IOi0OoOOIlli("\t", 1)));
                                        break;
                                    }
                                case 46:
/* 601 */                           oo01IOO0O10.I000O01llI0.I00000oIO(Oo0OI01Il.I00000oIO(oo0I01o.I000O01llI0, oo0I01o.I000II, oo0I01o.I0001Ioi1lo, 4));
/* 604 */                           OoiI0IO0oiI ooiI0IO0oiI = oo01IOO0O10.I000O01llI0;
/* 606 */                           OoIol00Ool ooIol00Ool2 = ooiI0IO0oiI.I00000oIO;
/* 608 */                           if (ooIol00Ool2 != null && (ooIol00Ool = (OoIol00Ool) ooIol00Ool2.I00iiI) != null) {
/* 616 */                               ooiI0IO0oiI.I00000oIO = ooIol00Ool;
                                        ooiI0IO0oiI.I0000Il00O -= ((Oo0OI01Il) ooIol00Ool2.I00iiO).I00000oIO.I00iiI.length();
/* 646 */                               ooiI0IO0oiI.I00000oOI = new OoIol00Ool(ooiI0IO0oiI.I00000oOI, (Oo0OI01Il) ooIol00Ool2.I00iiO);
/* 651 */                               iOoil1iiIilo = (Oo0OI01Il) ooIol00Ool.I00iiO;
                                    }
/* 653 */                           if (iOoil1iiIilo != null) {
/* 657 */                               oo01IOO0O10.I000iOII.invoke(iOoil1iiIilo);
                                        break;
                                    }
                                    break;
                                case 47:
/* 535 */                           OoiI0IO0oiI ooiI0IO0oiI2 = oo01IOO0O10.I000O01llI0;
/* 537 */                           OoIol00Ool ooIol00Ool3 = ooiI0IO0oiI2.I00000oOI;
/* 539 */                           if (ooIol00Ool3 != null) {
/* 545 */                               ooiI0IO0oiI2.I00000oOI = (OoIol00Ool) ooIol00Ool3.I00iiI;
/* 549 */                               Oo0OI01Il oo0OI01Il2 = (Oo0OI01Il) ooIol00Ool3.I00iiO;
/* 558 */                               ooiI0IO0oiI2.I00000oIO = new OoIol00Ool(ooiI0IO0oiI2.I00000oIO, oo0OI01Il2);
/* 571 */                               ooiI0IO0oiI2.I0000Il00O = oo0OI01Il2.I00000oIO.I00iiI.length() + ooiI0IO0oiI2.I0000Il00O;
/* 576 */                               oo0OI01Il = (Oo0OI01Il) ooIol00Ool3.I00iiO;
                                    }
/* 578 */                           if (oo0OI01Il != null) {
/* 582 */                               oo01IOO0O10.I000iOII.invoke(oo0OI01Il);
                                        break;
                                    }
                                    break;
                                default:
/* 530 */                           I000II.I00000oIO();
/* 17 */                            return null;
                            }
/* 585 */                   return ooiIlOl1iI;
                        case 16:
/* 187 */                   Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) this.I00iiI;
/* 192 */                   Ii0110 ii01102 = (Ii0110) this.I00iiO;
/* 197 */                   Context context2 = (Context) this.I00iio;
/* 200 */                   OloilI0Ol oloilI0Ol = (OloilI0Ol) obj;
/* 202 */                   oloilI0Ol.I00000oIO();
/* 205 */                   OI0oiiIO0 oI0oiiIO0 = oloilI0Ol.I00000oIO;
/* 247 */                   lOl1oii10I.I00000oIO(oloilI0Ol, ii01102, context2, OlollIOIlo.I00iio, (Oo0lI00l.I0000O(oo0IOoOi01.I000l1().I00000oOI) || !oo0IOoOi01.I000O01llI0() || (oo0IOoOi01.I0001Ioi1lo instanceof OO0I1Oli) || oo0IOoOi01.I000O01llI0 == null) ? false : true, new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, i5));
/* 284 */                   lOl1oii10I.I00000oIO(oloilI0Ol, ii01102, context2, OlollIOIlo.I00ilI0I1, (Oo0lI00l.I0000O(oo0IOoOi01.I000l1().I00000oOI) || (oo0IOoOi01.I0001Ioi1lo instanceof OO0I1Oli) || oo0IOoOi01.I000O01llI0 == null) ? false : true, new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, i3));
/* 324 */                   lOl1oii10I.I00000oIO(oloilI0Ol, ii01102, context2, OlollIOIlo.I00ilO0, oo0IOoOi01.I000O01llI0() && ((Boolean) oo0IOoOi01.I001i1lo1io.getValue()).booleanValue() && oo0IOoOi01.I000O01llI0 != null, new Oo0IIlI(oo0IOoOi01, iOoil1iiIilo, 3));
/* 327 */                   OlollIOIlo olollIOIlo = OlollIOIlo.I00iio;
/* 355 */                   boolean z2 = Oo0lI00l.I0000oI00(oo0IOoOi01.I000l1().I00000oOI) != oo0IOoOi01.I000l1().I00000oIO.I00iiI.length();
/* 358 */                   Oo0Iilloi oo0Iilloi = new Oo0Iilloi(i4);
/* 361 */                   oo0Iilloi.I00iiI = oo0IOoOi01;
/* 363 */                   VarHandle.storeStoreFence();
/* 368 */                   Oo0Iilloi oo0Iilloi2 = new Oo0Iilloi(i5);
/* 371 */                   oo0Iilloi2.I00iiI = oo0IOoOi01;
/* 373 */                   VarHandle.storeStoreFence();
/* 376 */                   Resources resources = context2.getResources();
/* 382 */                   OiilllO oiilllO = new OiilllO(1);
/* 385 */                   oiilllO.I00iiI = oo0Iilloi2;
/* 387 */                   oiilllO.I00iiO = oo0Iilloi;
/* 389 */                   VarHandle.storeStoreFence();
/* 392 */                   if (z2) {
/* 394 */                       Object obj8 = iO11lolO0lo.I0000O;
/* 399 */                       String string = resources.getString(R.string.selectAll);
/* 405 */                       OlolOO0oi ololOO0oi = new OlolOO0oi(obj8);
/* 408 */                       ololOO0oi.I00000oOI = string;
/* 413 */                       ololOO0oi.I0000Il00O = R.attr.actionModeSelectAllDrawable;
/* 415 */                       ololOO0oi.I0000O = oiilllO;
/* 417 */                       VarHandle.storeStoreFence();
/* 420 */                       oI0oiiIO0.I00000oOI(ololOO0oi);
                            }
/* 423 */                   OlollIOIlo olollIOIlo2 = OlollIOIlo.I00iio;
/* 445 */                   boolean z3 = oo0IOoOi01.I000O01llI0() && Oo0lI00l.I0000O(oo0IOoOi01.I000l1().I00000oOI);
/* 448 */                   Oo0Iilloi oo0Iilloi3 = new Oo0Iilloi(i3);
/* 451 */                   oo0Iilloi3.I00iiI = oo0IOoOi01;
/* 453 */                   VarHandle.storeStoreFence();
/* 456 */                   Resources resources2 = context2.getResources();
/* 462 */                   OiilllO oiilllO2 = new OiilllO(1);
/* 465 */                   oiilllO2.I00iiI = oo0Iilloi3;
/* 467 */                   oiilllO2.I00iiO = null;
/* 469 */                   VarHandle.storeStoreFence();
/* 472 */                   if (z3) {
/* 474 */                       Object obj9 = iO11lolO0lo.I0000oI00;
/* 479 */                       String string2 = resources2.getString(R.string.autofill);
/* 485 */                       OlolOO0oi ololOO0oi2 = new OlolOO0oi(obj9);
/* 488 */                       ololOO0oi2.I00000oOI = string2;
/* 490 */                       ololOO0oi2.I0000Il00O = 0;
/* 492 */                       ololOO0oi2.I0000O = oiilllO2;
/* 494 */                       VarHandle.storeStoreFence();
/* 497 */                       oI0oiiIO0.I00000oOI(ololOO0oi2);
                            }
/* 500 */                   oloilI0Ol.I00000oIO();
/* 503 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 129 */                   OoIoI0iii0 ooIoI0iii0 = (OoIoI0iii0) this.I00iiI;
/* 134 */                   Context context3 = (Context) this.I00iiO;
/* 138 */                   O1ol100o0O o1ol100o0O3 = (O1ol100o0O) this.I00iio;
/* 142 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 144 */                   Intent intent = ((I0IIOOO1O) obj).I00iiI;
/* 146 */                   if (intent != null && (data = intent.getData()) != null) {
/* 157 */                       IoI011li ioI011li = new IoI011li(i2);
/* 160 */                       ioI011li.I00iiI = o1ol100o0O3;
/* 162 */                       VarHandle.storeStoreFence();
/* 165 */                       IOO11li1OoII iOO11li1OoIII00000oIO3 = OooiooIOO.I00000oIO(ooIoI0iii0);
/* 169 */                       IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 181 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO3, Ii1oo1ooill0.I00iiI, null, new I000oI1ioi(ooIoI0iii0, context3, data, ioI011li, (IOoil1iiIilo) null, 24), 2);
                            }
/* 184 */                   return ooiIlOl1iI2;
                        case PoseLandmark.RIGHT_PINKY:
/* 84 */                    IiIooOOOI iiIooOOOI = (IiIooOOOI) this.I00iiI;
/* 88 */                    OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) this.I00iiO;
/* 103 */                   oIooO1iiliI.I000O01llI0((int) (r1.I000iOII() & 4294967295L));
/* 120 */                   ((OI10i0Il) this.I00iio).setValue(Iil1010O.I00000oIO(iiIooOOOI.I00O0o1oo((int) (((O0iOOo0Ii) obj).I000iOII() & 4294967295L))));
/* 123 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 25 */                    i001ll1 i001ll1Var = (i001ll1) this.I00iiI;
/* 30 */                    Context context4 = (Context) this.I00iiO;
/* 34 */                    O1ol100o0O o1ol100o0O4 = (O1ol100o0O) this.I00iio;
/* 38 */                    OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 40 */                    Intent intent2 = ((I0IIOOO1O) obj).I00iiI;
/* 42 */                    if (intent2 != null && (data2 = intent2.getData()) != null) {
/* 54 */                        IoI011li ioI011li2 = new IoI011li(6);
/* 57 */                        ioI011li2.I00iiI = o1ol100o0O4;
/* 59 */                        VarHandle.storeStoreFence();
/* 62 */                        IOO11li1OoII iOO11li1OoIII00000oIO4 = OooiooIOO.I00000oIO(i001ll1Var);
/* 66 */                        IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 78 */                        iOi1II01i0.I0000O(iOO11li1OoIII00000oIO4, Ii1oo1ooill0.I00iiI, null, new I000oI1ioi(i001ll1Var, context4, data2, ioI011li2, (IOoil1iiIilo) null, 26), 2);
                            }
/* 81 */                    return ooiIlOl1iI3;
                    }
                }
            }
