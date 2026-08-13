            package p000;

            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class I00iiI implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;

                public I00iiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:276:0x0763  */
                /* JADX WARN: Removed duplicated region for block: B:278:0x076f  */
                /* JADX WARN: Removed duplicated region for block: B:322:0x0840  */
                /* JADX WARN: Removed duplicated region for block: B:334:0x087d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws SecurityException {
                    OoOIi1lliil ooOIi1lliilI00i01iIIliI;
                    boolean zIsEmpty;
                    Ill0IO ill0IOI0000Il00O;
                    Object next;
                    IiOili0lOO1 iiOili0lOO1;
                    IiOiOloo0 iiOiOloo0;
                    IOIOllO1oli iOIOllO1oli;
                    O1iii1olO o1iii1olO;
                    iOliil ioliil;
                    I11IlOOO oIIo0Oi1;
                    Object next2;
                    boolean zEquals;
/* 5 */             int i = this.I00iOIl;
/* 9 */             int i2 = 2;
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            z = true;
/* 13 */            boolean z = true;
/* 13 */            z = true;
/* 13 */            boolean z2 = true;
/* 14 */            int i3 = 0;
/* 14 */            boolean z3 = false;
/* 14 */            boolean z4 = false;
                    switch (i) {
                        case 0:
/* 2346 */                  I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiI;
/* 2352 */                  HashMap map = new HashMap();
/* 2357 */                  HashMap map2 = new HashMap();
/* 2362 */                  HashMap map3 = new HashMap();
/* 2367 */                  OlOO1i11110 olOO1i11110 = new OlOO1i11110(i2);
/* 2370 */                  olOO1i11110.I00iiI = i0Oi111ii;
/* 2372 */                  olOO1i11110.I00iiO = map;
/* 2374 */                  VarHandle.storeStoreFence();
/* 2377 */                  Class cls = ((OOoOI1lIOi) obj).I00000oIO;
/* 2379 */                  Method[] declaredMethods = cls.getDeclaredMethods();
/* 2383 */                  int length = declaredMethods.length;
/* 2384 */                  int i4 = 0;
/* 2387 */                  while (i4 < length) {
/* 2389 */                      Method method = declaredMethods[i4];
/* 2395 */                      OI1Iio0ii1 oI1Iio0ii1I0000oI00 = OI1Iio0ii1.I0000oI00(method.getName());
/* 2401 */                      StringBuilder sb = new StringBuilder("(");
/* 2404 */                      Class<?>[] parameterTypes = method.getParameterTypes();
/* 2408 */                      int length2 = parameterTypes.length;
/* 2410 */                      for (int i5 = i3; i5 < length2; i5++) {
/* 2418 */                          sb.append(OOo1Io0I0.I00000oOI(parameterTypes[i5]));
                                }
/* 2427 */                      sb.append(")");
/* 2438 */                      sb.append(OOo1Io0I0.I00000oOI(method.getReturnType()));
/* 2457 */                      O1iioIi0010 o1iioIi0010 = new O1iioIi0010(oI1Iio0ii1I0000oI00.I00000oOI().concat(sb.toString()));
/* 2460 */                      OillOo0 oillOo0 = new OillOo0(i2);
/* 2463 */                      oillOo0.I00ilI0I1 = olOO1i11110;
/* 2465 */                      oillOo0.I00iio = olOO1i11110;
/* 2467 */                      oillOo0.I00iiI = o1iioIi0010;
/* 2474 */                      oillOo0.I00iiO = new ArrayList();
/* 2476 */                      VarHandle.storeStoreFence();
/* 2485 */                      for (Annotation annotation : method.getDeclaredAnnotations()) {
/* 2489 */                          lIl1l0IO.I00000oOI(oillOo0, annotation);
                                }
/* 2495 */                      Annotation[][] parameterAnnotations = method.getParameterAnnotations();
/* 2501 */                      int length3 = parameterAnnotations.length;
/* 2503 */                      for (int i6 = 0; i6 < length3; i6++) {
/* 2505 */                          Annotation[] annotationArr = parameterAnnotations[i6];
/* 2507 */                          int length4 = annotationArr.length;
/* 2508 */                          int i7 = 0;
/* 2509 */                          while (i7 < length4) {
/* 2511 */                              Annotation annotation2 = annotationArr[i7];
/* 2519 */                              Class cls2 = cls;
/* 2521 */                              Class clsI001l0I00 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation2)).I001l0I00();
/* 2525 */                              Method[] methodArr = declaredMethods;
/* 2531 */                              int i8 = length;
/* 2538 */                              IOiOol0 iOiOol0I0010o = oillOo0.I0010o(i6, OOo1Io0I0.I00000oIO(clsI001l0I00), new OOo1Il01OliO(annotation2));
/* 2542 */                              if (iOiOol0I0010o != null) {
/* 2544 */                                  lIl1l0IO.I0000Il00O(iOiOol0I0010o, annotation2, clsI001l0I00);
                                        }
/* 2547 */                              i7++;
/* 2549 */                              declaredMethods = methodArr;
/* 2551 */                              length = i8;
/* 2553 */                              cls = cls2;
                                    }
                                }
/* 2573 */                      oillOo0.I000OOo1O();
/* 2576 */                      i4++;
/* 2578 */                      i2 = 2;
/* 2579 */                      i3 = 0;
                            }
/* 2582 */                  Class cls3 = cls;
/* 2584 */                  Constructor<?>[] declaredConstructors = cls3.getDeclaredConstructors();
/* 2588 */                  int length5 = declaredConstructors.length;
/* 2589 */                  int i9 = 0;
/* 2590 */                  while (i9 < length5) {
/* 2592 */                      Constructor<?> constructor = declaredConstructors[i9];
/* 2594 */                      OI1Iio0ii1 oI1Iio0ii1 = OlIIoO0Ol0o1.I0000oI00;
/* 2598 */                      StringBuilder sb2 = new StringBuilder("(");
/* 2607 */                      for (Class<?> cls4 : constructor.getParameterTypes()) {
/* 2615 */                          sb2.append(OOo1Io0I0.I00000oOI(cls4));
                                }
/* 2623 */                      sb2.append(")V");
/* 2642 */                      O1iioIi0010 o1iioIi00102 = new O1iioIi0010(oI1Iio0ii1.I00000oOI().concat(sb2.toString()));
/* 2646 */                      OillOo0 oillOo02 = new OillOo0(2);
/* 2649 */                      oillOo02.I00ilI0I1 = olOO1i11110;
/* 2651 */                      oillOo02.I00iio = olOO1i11110;
/* 2653 */                      oillOo02.I00iiI = o1iioIi00102;
/* 2660 */                      oillOo02.I00iiO = new ArrayList();
/* 2662 */                      VarHandle.storeStoreFence();
/* 2671 */                      for (Annotation annotation3 : constructor.getDeclaredAnnotations()) {
/* 2675 */                          lIl1l0IO.I00000oOI(oillOo02, annotation3);
                                }
/* 2681 */                      Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
/* 2686 */                      if (parameterAnnotations2.length != 0) {
/* 2701 */                          int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
/* 2702 */                          int length7 = parameterAnnotations2.length;
/* 2704 */                          for (int i10 = 0; i10 < length7; i10++) {
/* 2706 */                              Annotation[] annotationArr2 = parameterAnnotations2[i10];
/* 2708 */                              int length8 = annotationArr2.length;
/* 2709 */                              int i11 = 0;
/* 2710 */                              while (i11 < length8) {
/* 2712 */                                  Constructor<?>[] constructorArr = declaredConstructors;
/* 2714 */                                  Annotation annotation4 = annotationArr2[i11];
/* 2722 */                                  int i12 = length5;
/* 2724 */                                  Class clsI001l0I002 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation4)).I001l0I00();
/* 2728 */                                  int i13 = i9;
/* 2732 */                                  int i14 = length6;
/* 2738 */                                  int i15 = i11;
/* 2745 */                                  IOiOol0 iOiOol0I0010o2 = oillOo02.I0010o(i10 + length6, OOo1Io0I0.I00000oIO(clsI001l0I002), new OOo1Il01OliO(annotation4));
/* 2749 */                                  if (iOiOol0I0010o2 != null) {
/* 2751 */                                      lIl1l0IO.I0000Il00O(iOiOol0I0010o2, annotation4, clsI001l0I002);
                                            }
/* 2754 */                                  i11 = i15 + 1;
/* 2756 */                                  declaredConstructors = constructorArr;
/* 2758 */                                  length6 = i14;
/* 2760 */                                  i9 = i13;
/* 2762 */                                  length5 = i12;
                                        }
                                    }
                                }
/* 2688 */                      Constructor<?>[] constructorArr2 = declaredConstructors;
/* 2690 */                      int i16 = length5;
/* 2692 */                      int i17 = i9;
/* 2777 */                      oillOo02.I000OOo1O();
/* 2780 */                      i9 = i17 + 1;
/* 2782 */                      declaredConstructors = constructorArr2;
/* 2784 */                      length5 = i16;
                            }
/* 2788 */                  Field[] declaredFields = cls3.getDeclaredFields();
/* 2792 */                  int length9 = declaredFields.length;
/* 2793 */                  int i18 = 0;
/* 2794 */                  while (i18 < length9) {
/* 2796 */                      Field field = declaredFields[i18];
/* 2826 */                      O1iioIi0010 o1iioIi00103 = new O1iioIi0010(IIlIOloOOO.I000oI1ioi('#', OI1Iio0ii1.I0000oI00(field.getName()).I00000oOI(), OOo1Io0I0.I00000oOI(field.getType())));
/* 2831 */                      ArrayList arrayList = new ArrayList();
/* 2834 */                      Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
/* 2838 */                      int length10 = declaredAnnotations.length;
/* 2839 */                      int i19 = 0;
/* 2840 */                      while (i19 < length10) {
/* 2842 */                          Annotation annotation5 = declaredAnnotations[i19];
/* 2850 */                          Class clsI001l0I003 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation5)).I001l0I00();
/* 2863 */                          Field[] fieldArr = declaredFields;
/* 2869 */                          IOiOol0 iOiOol0I00IO1 = ((I0Oi111ii) olOO1i11110.I00iiI).I00IO1(OOo1Io0I0.I00000oIO(clsI001l0I003), new OOo1Il01OliO(annotation5), arrayList);
/* 2873 */                          if (iOiOol0I00IO1 != null) {
/* 2875 */                              lIl1l0IO.I0000Il00O(iOiOol0I00IO1, annotation5, clsI001l0I003);
                                    }
/* 2878 */                          i19++;
/* 2880 */                          declaredFields = fieldArr;
                                }
/* 2883 */                      Field[] fieldArr2 = declaredFields;
/* 2889 */                      if (!arrayList.isEmpty()) {
/* 2895 */                          ((HashMap) olOO1i11110.I00iiO).put(o1iioIi00103, arrayList);
                                }
/* 2898 */                      i18++;
/* 2900 */                      declaredFields = fieldArr2;
                            }
/* 2905 */                  I11Ilo0I i11Ilo0I = new I11Ilo0I();
/* 2908 */                  i11Ilo0I.I00000oIO = map;
/* 2910 */                  i11Ilo0I.I00000oOI = map2;
/* 2912 */                  i11Ilo0I.I0000Il00O = map3;
/* 2914 */                  VarHandle.storeStoreFence();
/* 2917 */                  return i11Ilo0I;
                        case 1:
/* 2328 */                  I00lli11 i00lli11 = (I00lli11) this.I00iiI;
/* 2330 */                  ((O0iIoIOO0O0) obj).getClass();
/* 2341 */                  return (Ol0O0iI0l0O) i00lli11.I00iiI.I00iiI.invoke();
                        case 2:
/* 2292 */                  O0I0lI1IOool o0I0lI1IOool = (O0I0lI1IOool) this.I00iiI;
/* 2296 */                  IIIOiol iIIOiolI0000Il00O = o0I0lI1IOool.I0000Il00O((Ill0IO) obj);
/* 2300 */                  if (iIIOiolI0000Il00O == null) {
/* 2319 */                      return null;
                            }
/* 2302 */                  Ii10lIo0l1 ii10lIo0l1 = o0I0lI1IOool.I0000Il00O;
/* 2304 */                  if (ii10lIo0l1 != null) {
/* 2306 */                      iIIOiolI0000Il00O.I010ioo(ii10lIo0l1);
/* 2309 */                      return iIIOiolI0000Il00O;
                            }
/* 2313 */                  O0000Ioio00.I000OOo1O("components");
/* 2318 */                  throw null;
                        case 3:
/* 2121 */                  Ol0IO1iloi ol0IO1iloi = (Ol0IO1iloi) this.I00iiI;
/* 2123 */                  o0llIi o0llii = o0llIi.I00io1l;
/* 2125 */                  I01i1I i01i1I = (I01i1I) obj;
/* 2127 */                  O0iIo0i1 o0iIo0i1 = i01i1I.I00000oIO;
/* 2131 */                  if (ol0IO1iloi.I0000oI00 && o0iIo0i1 != null) {
/* 2137 */                      if (o0iIo0i1 instanceof O0iIl1) {
/* 2139 */                          z4 = o0iIo0i1 instanceof OOlIIOoli;
                                } else {
/* 2146 */                          StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 2149 */                          sb3.append(o0iIo0i1);
/* 2154 */                          sb3.append(", ");
/* 2167 */                          I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o0iIo0i1.getClass(), sb3));
                                }
/* 2170 */                      if (!z4) {
                                }
                            } else if (o0iIo0i1 != null && (ooOIi1lliilI00i01iIIliI = o0llii.I00i01iIIliI(o0iIo0i1)) != null) {
/* 2182 */                      List listI000oI1ioi = ii00il1.I000oI1ioi(ooOIi1lliilI00i01iIIliI);
/* 2188 */                      List listI000lI = ii00il1.I000lI(o0iIo0i1);
/* 2194 */                      Iterator it = listI000oI1ioi.iterator();
/* 2198 */                      Iterator it2 = listI000lI.iterator();
/* 2216 */                      ArrayList arrayList2 = new ArrayList(Math.min(IOOi1I.I0000O(listI000oI1ioi, 10), IOOi1I.I0000O(listI000lI, 10)));
/* 2223 */                      while (it.hasNext() && it2.hasNext()) {
/* 2241 */                          OoOOlO11iOi ooOOlO11iOi = (OoOOlO11iOi) it.next();
/* 2243 */                          Ooioo0o1l0 ooioo0o1l0I00100o1O0lo = ii00il1.I00100o1O0lo(o0llii, (OoOI1Ooo1) it2.next());
/* 2247 */                          O00ooi0o0iiO o00ooi0o0iiO = i01i1I.I00000oOI;
/* 2282 */                          arrayList2.add(ooioo0o1l0I00100o1O0lo == null ? new I01i1I(null, o00ooi0o0iiO, ooOOlO11iOi) : new I01i1I(ooioo0o1l0I00100o1O0lo, I11II1o.I00000oOI((I11II1o) ((I0l1OOl1l10) ol0IO1iloi.I0000Il00O.I00iOIl).I000OiO, o00ooi0o0iiO, ooioo0o1l0I00100o1O0lo.getAnnotations()), ooOOlO11iOi));
                                }
/* 2286 */                      return arrayList2;
                            }
/* 2288 */                  return null;
                        case 4:
/* 2078 */                  IiOoI0oI iiOoI0oI = (IiOoI0oI) this.I00iiI;
/* 2080 */                  Ooioo0o1l0 ooioo0o1l0 = (Ooioo0o1l0) obj;
/* 2086 */                  if (!l0loOi1ol11o.I00000oIO(ooioo0o1l0)) {
/* 2092 */                      IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooioo0o1l0.I00iOIl().I00100o1O0lo();
/* 2098 */                      z = (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) && !O0000Ioio00.I0000O(((OoOOiO) iOIiO1lIl0lI00100o1O0lo).I000lI(), iiOoI0oI);
                            }
/* 2114 */                  return Boolean.valueOf(z);
                        case 5:
/* 2014 */                  I01illiiIill i01illiiIill = (I01illiiIill) this.I00iiI;
/* 2016 */                  I01ilI00oIi i01ilI00oIi = (I01ilI00oIi) obj;
/* 2018 */                  O1oO0lOoI1 o1oO0lOoI1I0000Il00O = i01illiiIill.I0000Il00O();
/* 2022 */                  Collection collection = i01ilI00oIi.I00000oIO;
/* 2024 */                  o1oO0lOoI1I0000Il00O.getClass();
/* 2027 */                  boolean zIsEmpty2 = collection.isEmpty();
                            Collection collection2 = collection;
/* 2031 */                  if (zIsEmpty2) {
/* 2033 */                      O0iIl1 o0iIl1I00000oOI = i01illiiIill.I00000oOI();
/* 2044 */                      Collection collectionSingletonList = o0iIl1I00000oOI != null ? Collections.singletonList(o0iIl1I00000oOI) : null;
/* 2045 */                      if (collectionSingletonList == null) {
/* 2047 */                          collectionSingletonList = Il01100l.I00iOIl;
                                }
/* 2050 */                      collection2 = collectionSingletonList;
                            }
/* 2060 */                  List listI00iIi0i1o = collection2 instanceof List ? (List) collection2 : null;
/* 2061 */                  if (listI00iIi0i1o == null) {
/* 2065 */                      listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(collection2);
                            }
/* 2073 */                  i01ilI00oIi.I00000oOI = i01illiiIill.I000OOo1O(listI00iIi0i1o);
/* 2075 */                  return ooiIlOl1iI;
                        case 6:
/* 2008 */                  OO11o0IO.I000iOII((OO11o0IO) obj, (OO1I0001000i) this.I00iiI, 0, 0);
/* 2011 */                  return ooiIlOl1iI;
                        case 7:
/* 1974 */                  OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 1978 */                  ArrayList arrayList3 = (ArrayList) this.I00iiI;
/* 1980 */                  int iI000II = IOOi1I.I000II(arrayList3);
/* 1984 */                  if (iI000II >= 0) {
/* 1986 */                      int i20 = 0;
                                while (true) {
/* 1993 */                          OO11o0IO.I000iOII(oO11o0IO, (OO1I0001000i) arrayList3.get(i20), 0, 0);
/* 1996 */                          if (i20 != iI000II) {
/* 1998 */                              i20++;
                                    }
                                }
                            }
/* 2001 */                  return ooiIlOl1iI;
                        case 8:
/* 1970 */                  ((IIoi0i) this.I00iiI).cancel();
/* 1973 */                  return ooiIlOl1iI;
                        case 9:
/* 1959 */                  return Boolean.valueOf(OlIIlo.I000OOo1O.containsKey(l1OOo1o1l.I00000oOI((Ol0IioOo) this.I00iiI)));
                        case 10:
/* 1938 */                  return Boolean.valueOf(IOol1li.I00000oIO(((IO01o11o0lI0) this.I00iiI).I000oI1ioi(((IllIi0lI) obj).I0000Il00O()), true));
                        case 11:
/* 1916 */                  ((OI10i0Il) this.I00iiI).setValue((Conversation) obj);
/* 1919 */                  return ooiIlOl1iI;
                        case 12:
/* 1748 */                  OOoIOiO0 oOoIOiO0 = (OOoIOiO0) obj;
/* 1762 */                  if (!((Boolean) ((IOIO1iII) this.I00iiI).I00000oOI.invoke(oOoIOiO0)).booleanValue()) {
/* 1904 */                      z2 = false;
                            } else if (((Method) oOoIOiO0.I00000oOI()).getDeclaringClass().isInterface()) {
/* 1784 */                      String strI00000oOI = oOoIOiO0.I0000Il00O().I00000oOI();
/* 1788 */                      int iHashCode = strI00000oOI.hashCode();
/* 1795 */                      if (iHashCode != -1776922004) {
/* 1800 */                          if (iHashCode != -1295482945) {
/* 1805 */                              if (iHashCode == 147696667 && strI00000oOI.equals("hashCode")) {
/* 1898 */                                  zIsEmpty = ((ArrayList) oOoIOiO0.I0001Ioi1lo()).isEmpty();
                                        }
                                    } else if (strI00000oOI.equals("equals")) {
/* 1834 */                              OOoO1I0i oOoO1I0i = (OOoO1I0i) IOOi0Ool1i.I00Ol00(oOoIOiO0.I0001Ioi1lo());
/* 1841 */                              OOoIlii oOoIlii = oOoO1I0i != null ? oOoO1I0i.I00000oIO : null;
/* 1850 */                              OOoI10lllo oOoI10lllo = oOoIlii instanceof OOoI10lllo ? (OOoI10lllo) oOoIlii : null;
/* 1851 */                              if (oOoI10lllo != null) {
/* 1854 */                                  O00lI00ll o00lI00ll = oOoI10lllo.I00000oOI;
/* 1858 */                                  if ((o00lI00ll instanceof OOo1oliI) && (ill0IOI0000Il00O = ((OOo1oliI) o00lI00ll).I0000Il00O()) != null && O0000Ioio00.I0000O(ill0IOI0000Il00O.I00000oIO.I00000oIO, "java.lang.Object")) {
/* 1880 */                                      zIsEmpty = true;
                                            }
                                        }
                                    }
/* 1882 */                          zIsEmpty = false;
                                } else if (!strI00000oOI.equals("toString")) {
/* 1882 */                          zIsEmpty = false;
                                }
/* 1902 */                      if (zIsEmpty) {
                                }
                            }
/* 1905 */                  return Boolean.valueOf(z2);
                        case 13:
/* 851 */                   IOIOiIiilIl iOIOiIiilIl = (IOIOiIiilIl) this.I00iiI;
/* 853 */                   IOIOOIoOIO iOIOOIoOIO = (IOIOOIoOIO) obj;
/* 855 */                   IOIOill iOIOill = iOIOOIoOIO.I00000oIO;
/* 857 */                   Ii10lIo0l1 ii10lIo0l12 = iOIOiIiilIl.I00000oIO;
/* 863 */                   Iterator it3 = ((Iterable) ii10lIo0l12.I000OiO).iterator();
/* 871 */                   while (it3.hasNext()) {
/* 879 */                       OI000ilOol oI000ilOolI00000oIO = ((IOIOIoI) it3.next()).I00000oIO(iOIOill);
/* 883 */                       if (oI000ilOolI00000oIO != null) {
/* 885 */                           return oI000ilOolI00000oIO;
                                }
                            }
/* 894 */                   if (IOIOiIiilIl.I0000Il00O.contains(iOIOill)) {
/* 10 */                        return null;
                            }
/* 898 */                   IOIO1OO1l10l iOIO1OO1l10lI001lIiIIo1O = iOIOOIoOIO.I00000oOI;
/* 900 */                   if (iOIO1OO1l10lI001lIiIIo1O == null && (iOIO1OO1l10lI001lIiIIo1O = ((IOIO1OOOO0) ii10lIo0l12.I0000O).I001lIiIIo1O(iOIOill)) == null) {
/* 10 */                        return null;
                            }
/* 914 */                   OI1IlOlol oI1IlOlol = iOIO1OO1l10lI001lIiIIo1O.I00000oIO;
/* 916 */                   OOOi0i1IOo oOOi0i1IOo = iOIO1OO1l10lI001lIiIIo1O.I00000oOI;
/* 918 */                   II0O0I00oOi iI0O0I00oOi = iOIO1OO1l10lI001lIiIIo1O.I0000Il00O;
/* 920 */                   OlI1o0ooI olI1o0ooI = iOIO1OO1l10lI001lIiIIo1O.I0000O;
/* 922 */                   IOIOill iOIOillI0000oI00 = iOIOill.I0000oI00();
/* 926 */                   if (iOIOillI0000oI00 != null) {
/* 928 */                       I1ooIoloo0 i1ooIoloo0 = iOIOiIiilIl.I00000oOI;
/* 932 */                       IOIOOIoOIO iOIOOIoOIO2 = new IOIOOIoOIO();
/* 935 */                       iOIOOIoOIO2.I00000oIO = iOIOillI0000oI00;
/* 937 */                       iOIOOIoOIO2.I00000oOI = null;
/* 939 */                       VarHandle.storeStoreFence();
/* 946 */                       OI000ilOol oI000ilOol = (OI000ilOol) i1ooIoloo0.invoke(iOIOOIoOIO2);
/* 955 */                       IiOlI10iOI iiOlI10iOI = oI000ilOol instanceof IiOlI10iOI ? (IiOlI10iOI) oI000ilOol : null;
/* 956 */                       if (iiOlI10iOI == null) {
/* 10 */                            return null;
                                }
/* 976 */                       if (!iiOlI10iOI.I00oIiI10().I000lI().contains(iOIOill.I0001Ioi1lo())) {
/* 10 */                            return null;
                                }
/* 980 */                       iiOili0lOO1 = iiOlI10iOI.I00ll1;
                            } else {
/* 986 */                       OIo0loI111I1 oIo0loI111I1 = (OIo0loI111I1) ii10lIo0l12.I0001Ioi1lo;
/* 988 */                       Ill0IO ill0IO = iOIOill.I00000oIO;
/* 992 */                       ArrayList arrayList4 = new ArrayList();
/* 995 */                       oIo0loI111I1.I00000oOI(ill0IO, arrayList4);
/* 998 */                       Iterator it4 = arrayList4.iterator();
                                while (true) {
/* 1006 */                          if (it4.hasNext()) {
/* 1008 */                              next = it4.next();
/* 1013 */                              OIo0il oIo0il = (OIo0il) next;
/* 1017 */                              if (oIo0il instanceof IIIOiol) {
/* 1039 */                                  if (((IiOo0lO1) ((IIIOiol) oIo0il).I00IoiI()).I000lI().contains(iOIOill.I0001Ioi1lo())) {
                                            }
                                        }
                                    } else {
/* 1042 */                              next = null;
                                    }
                                }
/* 1044 */                      OIo0il oIo0il2 = (OIo0il) next;
/* 1046 */                      if (oIo0il2 == null) {
/* 10 */                            return null;
                                }
/* 1054 */                      Oi0Oooi oi0Oooi = new Oi0Oooi(oOOi0i1IOo.I00oo1iO0ll);
/* 1057 */                      OooO111lO1OI oooO111lO1OI = OooO111lO1OI.I00000oOI;
/* 1075 */                      IiOili0lOO1 iiOili0lOO12 = new IiOili0lOO1(ii10lIo0l12, oI1IlOlol, oIo0il2, oi0Oooi, li1i10.I00000oIO(oOOi0i1IOo.I00ooiO1I), iI0O0I00oOi, null, null, Il01100l.I00iOIl);
/* 1078 */                      oI1IlOlol = oI1IlOlol;
/* 1079 */                      iiOili0lOO1 = iiOili0lOO12;
                            }
/* 1100 */                  IiOlI10iOI iiOlI10iOI2 = new IiOlI10iOI((O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO, l1iI1lOO.I00000oIO(oI1IlOlol, oOOi0i1IOo.I00ilI0I1).I0001Ioi1lo());
/* 1103 */                  iiOlI10iOI2.I00ilI0I1 = oOOi0i1IOo;
/* 1105 */                  iiOlI10iOI2.I00ilO0 = iI0O0I00oOi;
/* 1107 */                  iiOlI10iOI2.I00io1l = olI1o0ooI;
/* 1115 */                  iiOlI10iOI2.I00ioIO = l1iI1lOO.I00000oIO(oI1IlOlol, oOOi0i1IOo.I00ilI0I1);
/* 1125 */                  OOOlloIl1Oio oOOlloIl1Oio = (OOOlloIl1Oio) IlO1il.I0000oI00.I0000oI00(oOOi0i1IOo.I00iio);
/* 1138 */                  int i21 = oOOlloIl1Oio == null ? -1 : OOi1O1O.I00000oIO[oOOlloIl1Oio.ordinal()];
/* 1164 */                  iiOlI10iOI2.I00l0I0l0lO1 = i21 != 1 ? i21 != 2 ? i21 != 3 ? i21 != 4 ? O1oIIloii0.I00iiI : O1oIIloii0.I00iiO : O1oIIloii0.I00ilI0I1 : O1oIIloii0.I00iio : O1oIIloii0.I00iiI;
/* 1174 */                  OOi110 oOi110 = (OOi110) IlO1il.I0000O.I0000oI00(oOOi0i1IOo.I00iio);
                            switch (oOi110 == null ? -1 : OOi1Ol0o.I00000oOI[oOi110.ordinal()]) {
                                case 1:
/* 1209 */                          iiOiOloo0 = IiOiioI.I0000O;
                                    break;
                                case 2:
/* 1206 */                          iiOiOloo0 = IiOiioI.I00000oIO;
                                    break;
                                case 3:
/* 1203 */                          iiOiOloo0 = IiOiioI.I00000oOI;
                                    break;
                                case 4:
/* 1200 */                          iiOiOloo0 = IiOiioI.I0000Il00O;
                                    break;
                                case 5:
/* 1197 */                          iiOiOloo0 = IiOiioI.I0000oI00;
                                    break;
                                case 6:
/* 1194 */                          iiOiOloo0 = IiOiioI.I0001Ioi1lo;
                                    break;
                                default:
/* 1191 */                          iiOiOloo0 = IiOiioI.I00000oIO;
                                    break;
                            }
/* 1211 */                  iiOlI10iOI2.I00l0OO0IO = iiOiOloo0;
/* 1221 */                  OOOi0O oOOi0O = (OOOi0O) IlO1il.I0001Ioi1lo.I0000oI00(oOOi0i1IOo.I00iio);
                            switch (oOOi0O != null ? OOi1O1O.I00000oOI[oOOi0O.ordinal()] : -1) {
                                case 1:
/* 1255 */                          iOIOllO1oli = IOIOllO1oli.I00iOIl;
                                    break;
                                case 2:
/* 1252 */                          iOIOllO1oli = IOIOllO1oli.I00iiI;
                                    break;
                                case 3:
/* 1249 */                          iOIOllO1oli = IOIOllO1oli.I00iiO;
                                    break;
                                case 4:
/* 1246 */                          iOIOllO1oli = IOIOllO1oli.I00iio;
                                    break;
                                case 5:
/* 1243 */                          iOIOllO1oli = IOIOllO1oli.I00ilI0I1;
                                    break;
                                case 6:
                                case 7:
/* 1240 */                          iOIOllO1oli = IOIOllO1oli.I00ilO0;
                                    break;
                                default:
/* 1237 */                          iOIOllO1oli = IOIOllO1oli.I00iOIl;
                                    break;
                            }
/* 1257 */                  iiOlI10iOI2.I00li1OI = iOIOllO1oli;
/* 1259 */                  List list = oOOi0i1IOo.I00io1l;
/* 1267 */                  Oi0Oooi oi0Oooi2 = new Oi0Oooi(oOOi0i1IOo.I00oo1iO0ll);
/* 1270 */                  OooO111lO1OI oooO111lO1OI2 = OooO111lO1OI.I00000oOI;
/* 1278 */                  IiOili0lOO1 iiOili0lOO1I00000oIO = iiOili0lOO1.I00000oIO(iiOlI10iOI2, list, oI1IlOlol, oi0Oooi2, li1i10.I00000oIO(oOOi0i1IOo.I00ooiO1I), iI0O0I00oOi);
/* 1284 */                  OI1IlOlol oI1IlOlol2 = (OI1IlOlol) iiOili0lOO1I00000oIO.I00iiO;
/* 1288 */                  Ii10lIo0l1 ii10lIo0l13 = (Ii10lIo0l1) iiOili0lOO1I00000oIO.I00iiI;
/* 1292 */                  O1I0OloI o1I0OloI = (O1I0OloI) ii10lIo0l13.I00000oIO;
/* 1294 */                  iiOlI10iOI2.I00ll1 = iiOili0lOO1I00000oIO;
/* 1304 */                  boolean zBooleanValue = IlO1il.I000lI.I0000oI00(oOOi0i1IOo.I00iio).booleanValue();
/* 1308 */                  IOIOllO1oli iOIOllO1oli2 = IOIOllO1oli.I00iiO;
/* 1310 */                  if (iOIOllO1oli == iOIOllO1oli2) {
/* 1333 */                      boolean z5 = zBooleanValue || O0000Ioio00.I0000O(((Il0lOIl1) ii10lIo0l13.I0010I0i).I0001Ioi1lo(), Boolean.TRUE);
/* 1336 */                      OlO1lI11oO0l olO1lI11oO0l = new OlO1lI11oO0l();
/* 1339 */                      olO1lI11oO0l.I00000oOI = iiOlI10iOI2;
/* 1341 */                      olO1lI11oO0l.I0000Il00O = z5;
/* 1345 */                      OlO1l00O1IO olO1l00O1IO = new OlO1l00O1IO(i3);
/* 1348 */                      olO1l00O1IO.I00iiI = olO1lI11oO0l;
/* 1350 */                      VarHandle.storeStoreFence();
/* 1358 */                      olO1lI11oO0l.I0000O = new O1I0II11i(o1I0OloI, olO1l00O1IO);
/* 1362 */                      OlO1l00O1IO olO1l00O1IO2 = new OlO1l00O1IO(z ? 1 : 0);
/* 1365 */                      olO1l00O1IO2.I00iiI = olO1lI11oO0l;
/* 1367 */                      VarHandle.storeStoreFence();
/* 1375 */                      olO1lI11oO0l.I0000oI00 = new O1I0II11i(o1I0OloI, olO1l00O1IO2);
/* 1377 */                      VarHandle.storeStoreFence();
                                o1iii1olO = olO1lI11oO0l;
                            } else {
/* 1381 */                      o1iii1olO = O1iii1olO.I00000oOI;
                            }
/* 1383 */                  iiOlI10iOI2.I00lli11 = o1iii1olO;
/* 1390 */                  iiOlI10iOI2.I00lll10 = new IiOl1ioiiol1(iiOlI10iOI2);
/* 1392 */                  i1O01oOIoI0I i1o01ooioi0i = OiOOi1.I0000O;
/* 1400 */                  ((OIIil1l0IioO) ((OIIiioOilI) ii10lIo0l13.I00100l0)).getClass();
/* 1419 */                  I00oII i00oII = new I00oII(1, iiOlI10iOI2, IiOl1IoO1.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 4);
/* 1424 */                  i1o01ooioi0i.getClass();
/* 1431 */                  iiOlI10iOI2.I00o0iI0io1 = i1O01oOIoI0I.I000II(iiOlI10iOI2, o1I0OloI, i00oII);
/* 1433 */                  int i22 = 5;
/* 1434 */                  if (iOIOllO1oli == iOIOllO1oli2) {
/* 1438 */                      ioliil = new iOliil(i22);
/* 1441 */                      ioliil.I00ilI0I1 = iiOlI10iOI2;
/* 1443 */                      List list2 = oOOi0i1IOo.I00oIiI10;
/* 1451 */                      int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(list2, 10));
/* 1455 */                      int i23 = 16;
/* 1457 */                      if (iI00000oIO < 16) {
/* 1459 */                          iI00000oIO = 16;
                                }
/* 1462 */                      LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 1473 */                      for (Object obj2 : list2) {
/* 1488 */                          linkedHashMap.put(l1iI1lOO.I00000oOI(oI1IlOlol2, ((OOOl0lIlIoil) obj2).I00iio), obj2);
                                }
/* 1492 */                      ioliil.I00iiI = linkedHashMap;
/* 1498 */                      I01i01OoI i01i01OoI = new I01i01OoI(12);
/* 1501 */                      i01i01OoI.I00iiI = ioliil;
/* 1503 */                      i01i01OoI.I00iiO = iiOlI10iOI2;
/* 1505 */                      VarHandle.storeStoreFence();
/* 1512 */                      ioliil.I00iiO = o1I0OloI.I0000Il00O(i01i01OoI);
/* 1516 */                      I01iiIii10O i01iiIii10O = new I01iiIii10O(i23);
/* 1519 */                      i01iiIii10O.I00iiI = ioliil;
/* 1521 */                      VarHandle.storeStoreFence();
/* 1529 */                      ioliil.I00iio = new O1I0II11i(o1I0OloI, i01iiIii10O);
/* 1531 */                      VarHandle.storeStoreFence();
                            } else {
/* 1535 */                      ioliil = null;
                            }
/* 1536 */                  iiOlI10iOI2.I00o0l1o1o0 = ioliil;
/* 1540 */                  Ii1Ool1 ii1Ool1 = (Ii1Ool1) iiOili0lOO1.I00iio;
/* 1542 */                  iiOlI10iOI2.I00o101lO = ii1Ool1;
/* 1546 */                  IiOl00l00 iiOl00l00 = new IiOl00l00(i3);
/* 1549 */                  iiOl00l00.I00iiI = iiOlI10iOI2;
/* 1551 */                  VarHandle.storeStoreFence();
/* 1554 */                  o1I0OloI.getClass();
/* 1562 */                  iiOlI10iOI2.I00oI0i = new O1I01I0o(o1I0OloI, iiOl00l00);
/* 1566 */                  IiOl00l00 iiOl00l002 = new IiOl00l00(z ? 1 : 0);
/* 1569 */                  iiOl00l002.I00iiI = iiOlI10iOI2;
/* 1571 */                  VarHandle.storeStoreFence();
/* 1579 */                  iiOlI10iOI2.I00oII = new O1I0II11i(o1I0OloI, iiOl00l002);
/* 1583 */                  IiOl00l00 iiOl00l003 = new IiOl00l00(i2);
/* 1586 */                  iiOl00l003.I00iiI = iiOlI10iOI2;
/* 1588 */                  VarHandle.storeStoreFence();
/* 1593 */                  new O1I01I0o(o1I0OloI, iiOl00l003);
/* 1599 */                  IiOl00l00 iiOl00l004 = new IiOl00l00(3);
/* 1602 */                  iiOl00l004.I00iiI = iiOlI10iOI2;
/* 1604 */                  VarHandle.storeStoreFence();
/* 1607 */                  o1I0OloI.I00000oIO(iiOl00l004);
/* 1613 */                  IiOl00l00 iiOl00l005 = new IiOl00l00(4);
/* 1616 */                  iiOl00l005.I00iiI = iiOlI10iOI2;
/* 1618 */                  VarHandle.storeStoreFence();
/* 1626 */                  iiOlI10iOI2.I00oIiI10 = new O1I01I0o(o1I0OloI, iiOl00l005);
/* 1632 */                  Oi0Oooi oi0Oooi3 = (Oi0Oooi) iiOili0lOO1I00000oIO.I00ilI0I1;
/* 1634 */                  OlI1o0ooI olI1o0ooI2 = iiOlI10iOI2.I00io1l;
/* 1643 */                  IiOlI10iOI iiOlI10iOI3 = ii1Ool1 instanceof IiOlI10iOI ? (IiOlI10iOI) ii1Ool1 : null;
/* 1649 */                  OOi1111IO0 oOi1111IO0 = iiOlI10iOI3 != null ? iiOlI10iOI3.I00oO101o : null;
/* 1650 */                  OOi1111IO0 oOi1111IO02 = new OOi1111IO0(oI1IlOlol2, oi0Oooi3, olI1o0ooI2, i2);
/* 1653 */                  oOi1111IO02.I0000oI00 = oOOi0i1IOo;
/* 1655 */                  oOi1111IO02.I0001Ioi1lo = oOi1111IO0;
/* 1663 */                  oOi1111IO02.I000II = l1iI1lOO.I00000oIO(oI1IlOlol2, oOOi0i1IOo.I00ilI0I1);
/* 1673 */                  OOOi0O oOOi0O2 = (OOOi0O) IlO1il.I0001Ioi1lo.I0000oI00(oOOi0i1IOo.I00iio);
/* 1675 */                  if (oOOi0O2 == null) {
/* 1677 */                      oOOi0O2 = OOOi0O.CLASS;
                            }
/* 1679 */                  oOi1111IO02.I000O01llI0 = oOOi0O2;
/* 1693 */                  oOi1111IO02.I000OOo1O = IlO1il.I000II.I0000oI00(oOOi0i1IOo.I00iio).booleanValue();
/* 1697 */                  IlO1il.I000O01llI0.getClass();
/* 1700 */                  VarHandle.storeStoreFence();
/* 1703 */                  iiOlI10iOI2.I00oO101o = oOi1111IO02;
/* 1717 */                  if (IlO1il.I0000Il00O.I0000oI00(oOOi0i1IOo.I00iio).booleanValue()) {
/* 1726 */                      IiOl00l00 iiOl00l006 = new IiOl00l00(i22);
/* 1729 */                      iiOl00l006.I00iiI = iiOlI10iOI2;
/* 1731 */                      VarHandle.storeStoreFence();
/* 1734 */                      oIIo0Oi1 = new OIIo0Oi1(o1I0OloI, iiOl00l006);
                            } else {
/* 1719 */                      oIIo0Oi1 = i1i0olI.I00iiO;
                            }
/* 1737 */                  iiOlI10iOI2.I00oOio10iI1 = oIIo0Oi1;
/* 1739 */                  VarHandle.storeStoreFence();
/* 1742 */                  return iiOlI10iOI2;
                        case 14:
/* 844 */                   return ((OI0010oo1o) obj).I0000O().I00100o1O0lo((OOIil01OI) this.I00iiI);
                        case 15:
/* 813 */                   IIiO00o1o iIiO00o1o = (IIiO00o1o) obj;
/* 815 */                   if (iIiO00o1o != null) {
/* 823 */                       ((IiOiIIOlI) this.I00iiI).I00000oIO.I0000O(iIiO00o1o);
/* 826 */                       return ooiIlOl1iI;
                            }
/* 830 */                   I000II.I000iOII("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
/* 10 */                    return null;
                        case 16:
/* 778 */                   Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 782 */                   OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iiI;
/* 784 */                   List list3 = IoI0lol0i1i.I00000oIO;
/* 796 */                   oi11lOiIoi.I000iOII(((Number) olO01l1oOil.getValue()).floatValue());
/* 809 */                   oi11lOiIoi.I000l1(((Number) olO01l1oOil.getValue()).floatValue());
/* 812 */                   return ooiIlOl1iI;
                        case 17:
/* 699 */                   Iooo1o0oiOo iooo1o0oiOo = (Iooo1o0oiOo) this.I00iiI;
/* 701 */                   O0iIoIOO0O0 o0iIoIOO0O0 = (O0iIoIOO0O0) obj;
/* 703 */                   LinkedHashSet linkedHashSet = iooo1o0oiOo.I00iiI;
/* 711 */                   ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(linkedHashSet, 10));
/* 714 */                   Iterator it5 = linkedHashSet.iterator();
/* 722 */                   while (it5.hasNext()) {
/* 734 */                       arrayList5.add(((O0iIl1) it5.next()).I00ll1(o0iIoIOO0O0));
/* 737 */                       z3 = true;
                            }
/* 739 */                   if (z3) {
/* 742 */                       O0iIl1 o0iIl1 = iooo1o0oiOo.I00iOIl;
/* 746 */                       o0iIl1I00ll1 = o0iIl1 != null ? o0iIl1.I00ll1(o0iIoIOO0O0) : null;
/* 750 */                       arrayList5.isEmpty();
/* 755 */                       LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList5);
/* 758 */                       linkedHashSet2.hashCode();
/* 763 */                       Iooo1o0oiOo iooo1o0oiOo2 = new Iooo1o0oiOo(linkedHashSet2);
/* 766 */                       iooo1o0oiOo2.I00iOIl = o0iIl1I00ll1;
/* 768 */                       o0iIl1I00ll1 = iooo1o0oiOo2;
                            }
/* 769 */                   if (o0iIl1I00ll1 != null) {
/* 772 */                       iooo1o0oiOo = o0iIl1I00ll1;
                            }
/* 773 */                   return iooo1o0oiOo.I00000oIO();
                        case PoseLandmark.RIGHT_PINKY:
/* 637 */                   O0iIolI o0iIolI = (O0iIolI) this.I00iiI;
/* 639 */                   Ill0IO ill0IO2 = (Ill0IO) obj;
/* 641 */                   Ill0IO ill0IO3 = O00o0lOioI.I00000oIO;
/* 645 */                   OIOOO10lIo.I00II0oii1o.getClass();
/* 658 */                   Oi01Iillli oi01Iillli = (Oi01Iillli) ((I1ooIoloo0) OIOOIoOoi.I00000oOI.I00iiO).invoke(ill0IO2);
/* 660 */                   if (oi01Iillli != null) {
/* 696 */                       return oi01Iillli;
                            }
/* 673 */                   O00o0oOl1IO1 o00o0oOl1IO1 = (O00o0oOl1IO1) ((I1ooIoloo0) O00o0lOioI.I0000Il00O.I00iiO).invoke(ill0IO2);
/* 675 */                   if (o00o0oOl1IO1 == null) {
/* 677 */                       return Oi01Iillli.I00iOIl;
                            }
/* 680 */                   O0iIolI o0iIolI2 = o00o0oOl1IO1.I00000oOI;
                            return (o0iIolI2 == null || o0iIolI2.I00iio - o0iIolI.I00iio > 0) ? o00o0oOl1IO1.I00000oIO : o00o0oOl1IO1.I0000Il00O;
                        case PoseLandmark.LEFT_INDEX:
/* 561 */                   O0I0iO0I1iI o0I0iO0I1iI = (O0I0iO0I1iI) this.I00iiI;
/* 563 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) obj;
/* 567 */                   String str = (String) oIoi0IIoi.I00iOIl;
/* 571 */                   String str2 = (String) oIoi0IIoi.I00iiI;
/* 610 */                   List listSingletonList = Collections.singletonList(I11IO1Io.I00000oIO(o0I0iO0I1iI.I00iOIl.I00iio, Oi010OO0.I001IO000("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
/* 618 */                   if (listSingletonList.isEmpty()) {
/* 620 */                       return i1i0olI.I00iiO;
                            }
/* 625 */                   I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 628 */                   i11Io0oil0i0.I00iiI = listSingletonList;
/* 630 */                   VarHandle.storeStoreFence();
/* 633 */                   return i11Io0oil0i0;
                        case PoseLandmark.RIGHT_INDEX:
/* 544 */                   O0l1Ol1o o0l1Ol1o = (O0l1Ol1o) this.I00iiI;
/* 548 */                   OI1Iio0ii1 oI1Iio0ii12 = O00ioI0Ii1Io.I00000oIO;
/* 554 */                   return O00ioI0Ii1Io.I00000oOI((OOo1O1i) obj, o0l1Ol1o.I00iOIl, o0l1Ol1o.I00iiO);
                        case PoseLandmark.LEFT_THUMB:
/* 518 */                   O0l1i0l o0l1i0l = (O0l1i0l) this.I00iiI;
/* 538 */                   return new O0l1oloIi(o0l1i0l.I00l0OO0IO, o0l1i0l, o0l1i0l.I00ioIO, o0l1i0l.I00l0I0l0lO1 != null, o0l1i0l.I00o101lO);
                        case PoseLandmark.RIGHT_THUMB:
/* 510 */                   return ((O1iil1I01o) obj).I0001Ioi1lo((OI1Iio0ii1) this.I00iiI, OIIl0iOOlo.I00ilI0I1);
                        case PoseLandmark.LEFT_HIP:
/* 406 */                   I0oiil10Ili i0oiil10Ili = (I0oiil10Ili) this.I00iiI;
/* 408 */                   OOoO0OoIIO oOoO0OoIIO = (OOoO0OoIIO) obj;
/* 412 */                   LinkedHashMap linkedHashMap2 = (LinkedHashMap) i0oiil10Ili.I00ilI0I1;
/* 417 */                   Ii1Ool1 ii1Ool12 = (Ii1Ool1) i0oiil10Ili.I00iio;
/* 423 */                   Integer num = (Integer) linkedHashMap2.get(oOoO0OoIIO);
/* 425 */                   if (num == null) {
/* 10 */                        return null;
                            }
/* 427 */                   int iIntValue = num.intValue();
/* 435 */                   o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) i0oiil10Ili.I00iiO;
/* 454 */                   o01l1ioOo0 o01l1iooo0I0000Il00O = iioIlooliI.I0000Il00O(new o01l1ioOo0((I0l1OOl1l10) o01l1iooo0.I00iOIl, i0oiil10Ili, (O0ioIllo0i1) o01l1iooo0.I00iiO), ii1Ool12.getAnnotations());
/* 490 */                   O0lO1101 o0lO1101 = new O0lO1101(i0oiil10Ili.I00iiI + iIntValue, new O0l1Ol1o(o01l1iooo0I0000Il00O, oOoO0OoIIO, false), ii1Ool12, (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0I0000Il00O.I00iOIl).I00000oIO, OI1Iio0ii1.I0000oI00(oOoO0OoIIO.I00000oIO.getName()), Ooo0Ioii0o0.I00iiO, false);
/* 493 */                   o0lO1101.I00li1OI = o01l1iooo0I0000Il00O;
/* 495 */                   o0lO1101.I00ll1 = oOoO0OoIIO;
/* 497 */                   VarHandle.storeStoreFence();
/* 500 */                   return o0lO1101;
                        case PoseLandmark.RIGHT_HIP:
/* 400 */                   ((ListenableFuture) this.I00iiI).cancel(false);
/* 403 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 302 */                   OI0011 oi0011 = (OI0011) this.I00iiI;
/* 304 */                   Ill0IO ill0IO4 = (Ill0IO) obj;
/* 306 */                   OIo111 oIo111 = oi0011.I00ilO0;
/* 308 */                   O1I0OloI o1I0OloI2 = oi0011.I00iiO;
/* 310 */                   oIo111.getClass();
/* 315 */                   I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 317 */                   Ill0OI0lo ill0OI0lo = ill0IO4.I00000oIO;
/* 332 */                   O0o0oOii o0o0oOii = new O0o0oOii(i11IiIloOo, ill0OI0lo.I0000Il00O() ? Ill0OI0lo.I0000oI00 : ill0OI0lo.I000II());
/* 335 */                   o0o0oOii.I00iiO = oi0011;
/* 337 */                   o0o0oOii.I00iio = ill0IO4;
/* 341 */                   O0o0o1 o0o0o1 = new O0o0o1(i3);
/* 344 */                   o0o0o1.I00iiI = o0o0oOii;
/* 346 */                   VarHandle.storeStoreFence();
/* 354 */                   o0o0oOii.I00ilI0I1 = new O1I0II11i(o1I0OloI2, o0o0o1);
/* 358 */                   O0o0o1 o0o0o12 = new O0o0o1(z ? 1 : 0);
/* 361 */                   o0o0o12.I00iiI = o0o0oOii;
/* 363 */                   VarHandle.storeStoreFence();
/* 371 */                   o0o0oOii.I00ilO0 = new O1I0II11i(o1I0OloI2, o0o0o12);
/* 377 */                   O0o0o1 o0o0o13 = new O0o0o1(i2);
/* 380 */                   o0o0o13.I00iiI = o0o0oOii;
/* 382 */                   VarHandle.storeStoreFence();
/* 388 */                   o0o0oOii.I00io1l = new O0o101l(o1I0OloI2, o0o0o13);
/* 390 */                   VarHandle.storeStoreFence();
/* 393 */                   return o0o0oOii;
                        case PoseLandmark.RIGHT_KNEE:
/* 120 */                   Ill0IO ill0IO5 = (Ill0IO) obj;
/* 124 */                   Map map4 = (Map) ((I1I0i0Ilo1Oi) this.I00iiI).I00iiI;
/* 128 */                   LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 143 */                   for (Map.Entry entry : map4.entrySet()) {
/* 155 */                       Ill0IO ill0IO6 = (Ill0IO) entry.getKey();
/* 161 */                       if (!ill0IO5.equals(ill0IO6)) {
/* 181 */                           if (O0000Ioio00.I0000O(ill0IO5.I00000oIO.I0000Il00O() ? null : ill0IO5.I00000oOI(), ill0IO6)) {
                                    }
                                }
/* 191 */                       linkedHashMap3.put(entry.getKey(), entry.getValue());
                            }
/* 199 */                   if (linkedHashMap3.isEmpty()) {
/* 202 */                       linkedHashMap3 = null;
                            }
/* 203 */                   if (linkedHashMap3 == null) {
/* 10 */                        return null;
                            }
/* 212 */                   Iterator it6 = linkedHashMap3.entrySet().iterator();
/* 220 */                   if (it6.hasNext()) {
/* 224 */                       next2 = it6.next();
/* 232 */                       if (it6.hasNext()) {
/* 252 */                           int length11 = ilioIlOi0O.I00000oIO((Ill0IO) ((Map.Entry) next2).getKey(), ill0IO5).I00000oIO.I00000oIO.length();
/* 289 */                           do {
/* 256 */                               Object next3 = it6.next();
/* 277 */                               int length12 = ilioIlOi0O.I00000oIO((Ill0IO) ((Map.Entry) next3).getKey(), ill0IO5).I00000oIO.I00000oIO.length();
/* 281 */                               if (length11 > length12) {
/* 283 */                                   next2 = next3;
/* 284 */                                   length11 = length12;
                                        }
/* 289 */                           } while (it6.hasNext());
                                }
                            } else {
/* 222 */                       next2 = null;
                            }
/* 291 */                   Map.Entry entry2 = (Map.Entry) next2;
/* 293 */                   if (entry2 != null) {
/* 295 */                       return entry2.getValue();
                            }
/* 10 */                    return null;
                        case 27:
/* 111 */                   ((Ol1OI1II0ll) this.I00iiI).add(obj);
/* 114 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 35 */                    OOo1oliI oOo1oliI = (OOo1oliI) this.I00iiI;
/* 37 */                    Method method2 = (Method) obj;
/* 43 */                    if (!method2.isSynthetic()) {
/* 53 */                        if (oOo1oliI.I00000oIO.isEnum()) {
/* 55 */                            String name = method2.getName();
/* 65 */                            if (O0000Ioio00.I0000O(name, "values")) {
/* 76 */                                zEquals = method2.getParameterTypes().length == 0;
/* 100 */                               if (zEquals) {
/* 45 */                                    z = false;
                                        }
                                    } else {
/* 84 */                                if (O0000Ioio00.I0000O(name, "valueOf")) {
/* 96 */                                    zEquals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                                        }
/* 100 */                               if (zEquals) {
                                        }
                                    }
                                }
                            }
/* 102 */                   return Boolean.valueOf(z);
                        default:
/* 20 */                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 26 */                    OO1ioi oO1ioi = (OO1ioi) this.I00iiI;
/* 28 */                    if (oO1ioi != null) {
/* 30 */                        oO1ioi.I0000Il00O = zBooleanValue2;
                            }
/* 32 */                    return ooiIlOl1iI;
                    }
                }
            }
