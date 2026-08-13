            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class iOiO0lo {
                public final ArrayList I00000oIO = new ArrayList();
                public final int I00000oOI;

                public iOiO0lo(int i) {
/* 1 */             this.I00000oOI = i;
                }

                public static iIolollI1 I0000Il00O(OillOo0 oillOo0, List list) {
/* 1 */             ii1il1Il ii1il1il = ii1il1Il.ADD;
/* 6 */             ll00I0ii.I00000oOI("FN", 2, list);
/* 20 */            iO0iIIoO11 io0iiioo11I000OiO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(0));
/* 35 */            iO0iIIoO11 io0iiioo11I000OiO2 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(1));
/* 41 */            if (!(io0iiioo11I000OiO2 instanceof i1ollIol0I0)) {
/* 142 */               I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("FN requires an ArrayValue of parameter names found ", io0iiioo11I000OiO2.getClass().getCanonicalName()));
/* 145 */               return null;
                    }
/* 45 */            List listI000OiO = ((i1ollIol0I0) io0iiioo11I000OiO2).I000OiO();
/* 51 */            Collection arrayList = new ArrayList();
/* 58 */            if (list.size() > 2) {
/* 64 */                arrayList = list.subList(2, list.size());
                    }
/* 74 */            iIolollI1 iiololli1 = new iIolollI1(io0iiioo11I000OiO.zzc());
/* 82 */            iiololli1.I00iiO = new ArrayList();
/* 84 */            iiololli1.I00ilI0I1 = oillOo0;
/* 86 */            ArrayList arrayList2 = (ArrayList) listI000OiO;
/* 92 */            if (!arrayList2.isEmpty()) {
/* 94 */                Iterator it = arrayList2.iterator();
/* 102 */               while (it.hasNext()) {
/* 116 */                   iiololli1.I00iiO.add(((iO0iIIoO11) it.next()).zzc());
                        }
                    }
/* 125 */           iiololli1.I00iio = new ArrayList(arrayList);
/* 127 */           return iiololli1;
                }

                public static boolean I0000O(iO0iIIoO11 io0iiioo11, iO0iIIoO11 io0iiioo112) {
/* 3 */             if (io0iiioo11 instanceof iIii1l00O1) {
/* 11 */                io0iiioo11 = new iOO00I0O(io0iiioo11.zzc());
                    }
/* 17 */            if (io0iiioo112 instanceof iIii1l00O1) {
/* 25 */                io0iiioo112 = new iOO00I0O(io0iiioo112.zzc());
                    }
/* 33 */            if ((io0iiioo11 instanceof iOO00I0O) && (io0iiioo112 instanceof iOO00I0O)) {
                        return ((iOO00I0O) io0iiioo11).I00iOIl.compareTo(((iOO00I0O) io0iiioo112).I00iOIl) < 0;
                    }
/* 60 */            double dDoubleValue = io0iiioo11.zzd().doubleValue();
/* 68 */            double dDoubleValue2 = io0iiioo112.zzd().doubleValue();
                    return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
                }

                public static iO0iIIoO11 I0000oI00(ii0O1IOI ii0o1ioi, iO0iIIoO11 io0iiioo11, iO0iIIoO11 io0iiioo112) {
/* 3 */             if (io0iiioo11 instanceof Iterable) {
/* 11 */                return I000II(ii0o1ioi, ((Iterable) io0iiioo11).iterator(), io0iiioo112);
                    }
/* 18 */            I000II.I000iOII("Non-iterable type in for...of loop.");
/* 21 */            return null;
                }

                public static boolean I0001Ioi1lo(iO0iIIoO11 io0iiioo11, iO0iIIoO11 io0iiioo112) {
/* 15 */            if (io0iiioo11.getClass().equals(io0iiioo112.getClass())) {
/* 19 */                if ((io0iiioo11 instanceof iOOl1i1) || (io0iiioo11 instanceof iIo00lo)) {
/* 14 */                    return true;
                        }
                        return io0iiioo11 instanceof iII01l ? (Double.isNaN(io0iiioo11.zzd().doubleValue()) || Double.isNaN(io0iiioo112.zzd().doubleValue()) || io0iiioo11.zzd().doubleValue() != io0iiioo112.zzd().doubleValue()) ? false : true : io0iiioo11 instanceof iOO00I0O ? io0iiioo11.zzc().equals(io0iiioo112.zzc()) : io0iiioo11 instanceof iI0io0OI1IOo ? io0iiioo11.zze().equals(io0iiioo112.zze()) : io0iiioo11 == io0iiioo112;
                    }
/* 122 */           if (((io0iiioo11 instanceof iOOl1i1) || (io0iiioo11 instanceof iIo00lo)) && ((io0iiioo112 instanceof iOOl1i1) || (io0iiioo112 instanceof iIo00lo))) {
/* 14 */                return true;
                    }
/* 138 */           boolean z = io0iiioo11 instanceof iII01l;
/* 140 */           if (z && (io0iiioo112 instanceof iOO00I0O)) {
/* 155 */               return I0001Ioi1lo(io0iiioo11, new iII01l(io0iiioo112.zzd()));
                    }
/* 160 */           boolean z2 = io0iiioo11 instanceof iOO00I0O;
/* 162 */           if (z2 && (io0iiioo112 instanceof iII01l)) {
/* 177 */               return I0001Ioi1lo(new iII01l(io0iiioo11.zzd()), io0iiioo112);
                    }
/* 184 */           if (io0iiioo11 instanceof iI0io0OI1IOo) {
/* 195 */               return I0001Ioi1lo(new iII01l(io0iiioo11.zzd()), io0iiioo112);
                    }
/* 202 */           if (io0iiioo112 instanceof iI0io0OI1IOo) {
/* 213 */               return I0001Ioi1lo(io0iiioo11, new iII01l(io0iiioo112.zzd()));
                    }
/* 218 */           if ((z2 || z) && (io0iiioo112 instanceof iIii1l00O1)) {
/* 235 */               return I0001Ioi1lo(io0iiioo11, new iOO00I0O(io0iiioo112.zzc()));
                    }
/* 242 */           if ((io0iiioo11 instanceof iIii1l00O1) && ((io0iiioo112 instanceof iOO00I0O) || (io0iiioo112 instanceof iII01l))) {
/* 261 */               return I0001Ioi1lo(new iOO00I0O(io0iiioo11.zzc()), io0iiioo112);
                    }
/* 13 */            return false;
                }

                public static iO0iIIoO11 I000II(ii0O1IOI ii0o1ioi, Iterator it, iO0iIIoO11 io0iiioo11) {
/* 1 */             if (it != null) {
/* 7 */                 while (it.hasNext()) {
/* 22 */                    iO0iIIoO11 io0iiioo11I001i1O0Ol = ii0o1ioi.I00000oOI((iO0iIIoO11) it.next()).I001i1O0Ol((i1ollIol0I0) io0iiioo11);
/* 28 */                    if (io0iiioo11I001i1O0Ol instanceof iI1II1oO) {
/* 30 */                        iI1II1oO ii1ii1oo = (iI1II1oO) io0iiioo11I001i1O0Ol;
/* 32 */                        String str = ii1ii1oo.I00iiI;
/* 40 */                        if ("break".equals(str)) {
/* 42 */                            return iO0iIIoO11.I00Ol1ll1;
                                }
/* 51 */                        if ("return".equals(str)) {
/* 53 */                            return ii1ii1oo;
                                }
                            }
                        }
                    }
/* 54 */            return iO0iIIoO11.I00Ol1ll1;
                }

                public static boolean I000O01llI0(iO0iIIoO11 io0iiioo11, iO0iIIoO11 io0iiioo112) {
/* 3 */             if (io0iiioo11 instanceof iIii1l00O1) {
/* 11 */                io0iiioo11 = new iOO00I0O(io0iiioo11.zzc());
                    }
/* 17 */            if (io0iiioo112 instanceof iIii1l00O1) {
/* 25 */                io0iiioo112 = new iOO00I0O(io0iiioo112.zzc());
                    }
                    return (((io0iiioo11 instanceof iOO00I0O) && (io0iiioo112 instanceof iOO00I0O)) || !(Double.isNaN(io0iiioo11.zzd().doubleValue()) || Double.isNaN(io0iiioo112.zzd().doubleValue()))) && !I0000O(io0iiioo112, io0iiioo11);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:401:0x0bb9  */
                /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r10v100, types: [iO0iIIoO11] */
                /* JADX WARN: Type inference failed for: r10v103, types: [iO0iIIoO11] */
                /* JADX WARN: Type inference failed for: r10v315 */
                /* JADX WARN: Type inference failed for: r10v320 */
                /* JADX WARN: Type inference failed for: r10v340, types: [i1ollIol0I0] */
                /* JADX WARN: Type inference failed for: r10v347, types: [iIlIIIl11I1I] */
                /* JADX WARN: Type inference failed for: r10v382 */
                /* JADX WARN: Type inference failed for: r10v383 */
                /* JADX WARN: Type inference failed for: r12v0, types: [OillOo0, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final iO0iIIoO11 I00000oIO(String str, OillOo0 oillOo0, ArrayList arrayList) {
                    boolean zI0001Ioi1lo;
                    boolean zI0001Ioi1lo2;
                    iOOl1i1 iool1i1;
                    iOOl1i1 iool1i1I001i1O0Ol;
                    iOOl1i1 iool1i12;
                    iI1II1oO ii1ii1oo;
                    iO0iIIoO11 ioo00i0o;
                    iO0iIIoO11 i1olliol0i0;
                    String str2;
/* 9 */             int i = 0;
                    switch (this.I00000oOI) {
                        case 0:
/* 3227 */                  ii1il1Il ii1il1il = ii1il1Il.ADD;
                            switch (ll00I0ii.I0000oI00(str).ordinal()) {
                                case 4:
/* 3657 */                          ll00I0ii.I00000oIO("BITWISE_AND", 2, arrayList);
/* 3720 */                          return new iII01l(Double.valueOf(ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) & ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue())));
                                case 5:
/* 3585 */                          ll00I0ii.I00000oIO("BITWISE_LEFT_SHIFT", 2, arrayList);
/* 3651 */                          return new iII01l(Double.valueOf(ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) << ((int) (ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()) & 31))));
                                case 6:
/* 3541 */                          ll00I0ii.I00000oIO("BITWISE_NOT", 1, arrayList);
/* 3578 */                          return new iII01l(Double.valueOf(~ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue())));
                                case 7:
/* 3471 */                          ll00I0ii.I00000oIO("BITWISE_OR", 2, arrayList);
/* 3534 */                          return new iII01l(Double.valueOf(ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) | ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue())));
                                case 8:
/* 3398 */                          ll00I0ii.I00000oIO("BITWISE_RIGHT_SHIFT", 2, arrayList);
/* 3464 */                          return new iII01l(Double.valueOf(ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) >> ((int) (ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()) & 31))));
                                case 9:
/* 3318 */                          ll00I0ii.I00000oIO("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
/* 3391 */                          return new iII01l(Double.valueOf((ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) & 4294967295L) >>> ((int) (ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()) & 31))));
                                case 10:
/* 3248 */                          ll00I0ii.I00000oIO("BITWISE_XOR", 2, arrayList);
/* 3311 */                          return new iII01l(Double.valueOf(ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) ^ ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue())));
                                default:
/* 3242 */                          I00000oOI(str);
/* 3245 */                          throw null;
                            }
                        case 1:
/* 3117 */                  ll00I0ii.I00000oIO(ll00I0ii.I0000oI00(str).name(), 2, arrayList);
/* 3130 */                  iO0iIIoO11 io0iiioo11I000OiO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 3144 */                  iO0iIIoO11 io0iiioo11I000OiO2 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 3152 */                  int iOrdinal = ll00I0ii.I0000oI00(str).ordinal();
/* 3158 */                  if (iOrdinal != 23) {
/* 3162 */                      if (iOrdinal == 48) {
/* 3210 */                          zI0001Ioi1lo2 = I0001Ioi1lo(io0iiioo11I000OiO, io0iiioo11I000OiO2);
                                } else if (iOrdinal == 42) {
/* 3205 */                          zI0001Ioi1lo = I0000O(io0iiioo11I000OiO, io0iiioo11I000OiO2);
                                } else if (iOrdinal != 43) {
                                    switch (iOrdinal) {
                                        case 37:
/* 3195 */                                  zI0001Ioi1lo = I0000O(io0iiioo11I000OiO2, io0iiioo11I000OiO);
                                            break;
                                        case 38:
/* 3190 */                                  zI0001Ioi1lo = I000O01llI0(io0iiioo11I000OiO2, io0iiioo11I000OiO);
                                            break;
                                        case 39:
/* 3185 */                                  zI0001Ioi1lo = ll00I0ii.I0001Ioi1lo(io0iiioo11I000OiO, io0iiioo11I000OiO2);
                                            break;
                                        case 40:
/* 3179 */                                  zI0001Ioi1lo2 = ll00I0ii.I0001Ioi1lo(io0iiioo11I000OiO, io0iiioo11I000OiO2);
                                            break;
                                        default:
/* 3175 */                                  I00000oOI(str);
/* 3178 */                                  throw null;
                                    }
                                } else {
/* 3200 */                          zI0001Ioi1lo = I000O01llI0(io0iiioo11I000OiO, io0iiioo11I000OiO2);
                                }
                                zI0001Ioi1lo = !zI0001Ioi1lo2;
                            } else {
/* 3215 */                      zI0001Ioi1lo = I0001Ioi1lo(io0iiioo11I000OiO, io0iiioo11I000OiO2);
                            }
                            return zI0001Ioi1lo ? iO0iIIoO11.I00i0oil : iO0iIIoO11.I00iIO;
                        case 2:
/* 2498 */                  ii1il1Il ii1il1il2 = ii1il1Il.ADD;
/* 2504 */                  int iOrdinal2 = ll00I0ii.I0000oI00(str).ordinal();
/* 2508 */                  if (iOrdinal2 == 2) {
/* 3017 */                      ll00I0ii.I00000oIO("APPLY", 3, arrayList);
/* 3024 */                      iO0iIIoO11 io0iiioo11 = (iO0iIIoO11) arrayList.get(0);
/* 3028 */                      OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) oillOo0.I00iiO;
/* 3032 */                      OoOlO1O0o ooOlO1O0o2 = (OoOlO1O0o) oillOo0.I00iiO;
/* 3034 */                      iO0iIIoO11 io0iiioo11I000OiO3 = ooOlO1O0o.I000OiO(oillOo0, io0iiioo11);
/* 3048 */                      String strZzc = ooOlO1O0o2.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzc();
/* 3058 */                      iO0iIIoO11 io0iiioo11I000OiO4 = ooOlO1O0o2.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2));
/* 3064 */                      if (!(io0iiioo11I000OiO4 instanceof i1ollIol0I0)) {
/* 3105 */                          I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Function arguments for Apply are not a list found ", io0iiioo11I000OiO4.getClass().getCanonicalName()));
/* 11 */                            return null;
                                }
/* 3070 */                      if (!strZzc.isEmpty()) {
/* 3080 */                          return io0iiioo11I000OiO3.I00000oOI(strZzc, oillOo0, (ArrayList) ((i1ollIol0I0) io0iiioo11I000OiO4).I000OiO());
                                }
/* 3087 */                      I000II.I000iOII("Function name for apply is undefined");
/* 11 */                        return null;
                            }
/* 2514 */                  if (iOrdinal2 == 15) {
/* 3009 */                      ll00I0ii.I00000oIO("BREAK", 0, arrayList);
/* 3012 */                      return iO0iIIoO11.I00i01iIIliI;
                            }
/* 2518 */                  if (iOrdinal2 == 25) {
/* 3004 */                      return I0000Il00O(oillOo0, arrayList);
                            }
/* 2522 */                  if (iOrdinal2 != 41) {
/* 2526 */                      if (iOrdinal2 == 54) {
/* 2914 */                          return new i1ollIol0I0(arrayList);
                                }
/* 2530 */                      if (iOrdinal2 == 57) {
/* 2880 */                          if (arrayList.isEmpty()) {
/* 2882 */                              return iO0iIIoO11.I00i0ilIl0i;
                                    }
/* 2888 */                          ll00I0ii.I00000oIO("RETURN", 1, arrayList);
/* 2907 */                          return new iI1II1oO("return", ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)));
                                }
/* 2534 */                      if (iOrdinal2 != 19) {
/* 2538 */                          if (iOrdinal2 == 20) {
/* 2813 */                              ll00I0ii.I00000oOI("DEFINE_FUNCTION", 2, arrayList);
/* 2816 */                              iIolollI1 iiololli1I0000Il00O = I0000Il00O(oillOo0, arrayList);
/* 2820 */                              String str3 = iiololli1I0000Il00O.I00iOIl;
/* 2822 */                              if (str3 == null) {
/* 2826 */                                  oillOo0.I00IO1oi11O("", iiololli1I0000Il00O);
/* 3108 */                                  return iiololli1I0000Il00O;
                                        }
/* 2831 */                              oillOo0.I00IO1oi11O(str3, iiololli1I0000Il00O);
/* 3108 */                              return iiololli1I0000Il00O;
                                    }
/* 2542 */                          if (iOrdinal2 == 60) {
/* 2636 */                              ll00I0ii.I00000oIO("SWITCH", 3, arrayList);
/* 2643 */                              iO0iIIoO11 io0iiioo112 = (iO0iIIoO11) arrayList.get(0);
/* 2647 */                              OoOlO1O0o ooOlO1O0o3 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2651 */                              OoOlO1O0o ooOlO1O0o4 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2653 */                              iO0iIIoO11 io0iiioo11I000OiO5 = ooOlO1O0o3.I000OiO(oillOo0, io0iiioo112);
/* 2663 */                              iO0iIIoO11 io0iiioo11I000OiO6 = ooOlO1O0o4.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 2673 */                              iO0iIIoO11 io0iiioo11I000OiO7 = ooOlO1O0o4.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2));
/* 2679 */                              if (!(io0iiioo11I000OiO6 instanceof i1ollIol0I0)) {
/* 2806 */                                  I000II.I000iOII("Malformed SWITCH statement, cases are not a list");
/* 11 */                                    return null;
                                        }
/* 2683 */                              if (!(io0iiioo11I000OiO7 instanceof i1ollIol0I0)) {
/* 2799 */                                  I000II.I000iOII("Malformed SWITCH statement, case statements are not a list");
/* 11 */                                    return null;
                                        }
/* 2685 */                              i1ollIol0I0 i1olliol0i02 = (i1ollIol0I0) io0iiioo11I000OiO6;
/* 2687 */                              i1ollIol0I0 i1olliol0i03 = (i1ollIol0I0) io0iiioo11I000OiO7;
/* 2690 */                              boolean z = false;
/* 2695 */                              for (int i2 = 0; i2 < i1olliol0i02.I000lI(); i2++) {
/* 2697 */                                  if (z || io0iiioo11I000OiO5.equals(ooOlO1O0o4.I000OiO(oillOo0, i1olliol0i02.I000o00OoI0I(i2)))) {
/* 2720 */                                      iO0iIIoO11 io0iiioo11I000OiO8 = ooOlO1O0o4.I000OiO(oillOo0, i1olliol0i03.I000o00OoI0I(i2));
/* 2726 */                                      if (io0iiioo11I000OiO8 instanceof iI1II1oO) {
                                                    return ((iI1II1oO) io0iiioo11I000OiO8).I00iiI.equals("break") ? iO0iIIoO11.I00Ol1ll1 : io0iiioo11I000OiO8;
                                                }
/* 2743 */                                      z = true;
                                            } else {
/* 2714 */                                      z = false;
                                            }
                                        }
/* 2756 */                              if (i1olliol0i02.I000lI() + 1 == i1olliol0i03.I000lI()) {
/* 2766 */                                  iO0iIIoO11 io0iiioo11I000OiO9 = ooOlO1O0o4.I000OiO(oillOo0, i1olliol0i03.I000o00OoI0I(i1olliol0i02.I000lI()));
/* 2772 */                                  if (io0iiioo11I000OiO9 instanceof iI1II1oO) {
/* 2777 */                                      String str4 = ((iI1II1oO) io0iiioo11I000OiO9).I00iiI;
/* 2783 */                                      if (str4.equals("return") || str4.equals("continue")) {
/* 3108 */                                          return io0iiioo11I000OiO9;
                                                }
                                            }
                                        }
/* 2793 */                              return iO0iIIoO11.I00Ol1ll1;
                                    }
/* 2546 */                          if (iOrdinal2 == 61) {
/* 2579 */                              ll00I0ii.I00000oIO("TERNARY", 3, arrayList);
/* 2586 */                              iO0iIIoO11 io0iiioo113 = (iO0iIIoO11) arrayList.get(0);
/* 2590 */                              OoOlO1O0o ooOlO1O0o5 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2594 */                              OoOlO1O0o ooOlO1O0o6 = (OoOlO1O0o) oillOo0.I00iiO;
                                        return ooOlO1O0o5.I000OiO(oillOo0, io0iiioo113).zze().booleanValue() ? ooOlO1O0o6.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)) : ooOlO1O0o6.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2));
                                    }
                                    switch (iOrdinal2) {
                                        case 11:
/* 2571 */                                  return oillOo0.I001lloI().I001i1O0Ol(new i1ollIol0I0(arrayList));
                                        case 12:
/* 2555 */                                  ll00I0ii.I00000oIO("BREAK", 0, arrayList);
/* 2558 */                                  return iO0iIIoO11.I00i0O;
                                        case 13:
                                            break;
                                        default:
/* 2551 */                                  I00000oOI(str);
/* 2554 */                                  throw null;
                                    }
                                }
/* 2840 */                      if (arrayList.isEmpty()) {
/* 2842 */                          return iO0iIIoO11.I00Ol1ll1;
                                }
/* 2856 */                      iO0iIIoO11 io0iiioo11I000OiO10 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
                                return io0iiioo11I000OiO10 instanceof i1ollIol0I0 ? oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO10) : iO0iIIoO11.I00Ol1ll1;
                            }
/* 2921 */                  ll00I0ii.I00000oOI("IF", 2, arrayList);
/* 2928 */                  iO0iIIoO11 io0iiioo114 = (iO0iIIoO11) arrayList.get(0);
/* 2932 */                  OoOlO1O0o ooOlO1O0o7 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2936 */                  OoOlO1O0o ooOlO1O0o8 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2938 */                  iO0iIIoO11 io0iiioo11I000OiO11 = ooOlO1O0o7.I000OiO(oillOo0, io0iiioo114);
/* 2948 */                  iO0iIIoO11 io0iiioo11I000OiO12 = ooOlO1O0o8.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 2964 */                  iO0iIIoO11 io0iiioo11I000OiO13 = arrayList.size() > 2 ? ooOlO1O0o8.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2)) : null;
/* 2968 */                  iOOl1i1 iool1i13 = iO0iIIoO11.I00Ol1ll1;
/* 2978 */                  if (io0iiioo11I000OiO11.zze().booleanValue()) {
/* 2982 */                      iool1i1I001i1O0Ol = oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO12);
                            } else {
/* 2988 */                      if (io0iiioo11I000OiO13 == null) {
/* 2997 */                          iool1i1 = iool1i13;
                                    return true == (iool1i1 instanceof iI1II1oO) ? iool1i13 : iool1i1;
                                }
/* 2992 */                      iool1i1I001i1O0Ol = oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO13);
                            }
/* 2986 */                  iool1i1 = iool1i1I001i1O0Ol;
                            if (true == (iool1i1 instanceof iI1II1oO)) {
                            }
                            break;
                        case 3:
/* 2347 */                  ii1il1Il ii1il1il3 = ii1il1Il.ADD;
/* 2353 */                  int iOrdinal3 = ll00I0ii.I0000oI00(str).ordinal();
/* 2357 */                  if (iOrdinal3 == 1) {
/* 2456 */                      ll00I0ii.I00000oIO("AND", 2, arrayList);
/* 2469 */                      iO0iIIoO11 io0iiioo11I000OiO14 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 2481 */                      if (io0iiioo11I000OiO14.zze().booleanValue()) {
/* 2493 */                          return ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
                                }
/* 2497 */                      return io0iiioo11I000OiO14;
                            }
/* 2361 */                  if (iOrdinal3 == 47) {
/* 2417 */                      ll00I0ii.I00000oIO("NOT", 1, arrayList);
/* 2449 */                      return new iI0io0OI1IOo(Boolean.valueOf(!((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zze().booleanValue()));
                            }
/* 2365 */                  if (iOrdinal3 != 50) {
/* 2411 */                      I00000oOI(str);
/* 2414 */                      throw null;
                            }
/* 2369 */                  ll00I0ii.I00000oIO("OR", 2, arrayList);
/* 2382 */                  iO0iIIoO11 io0iiioo11I000OiO15 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 2394 */                  if (io0iiioo11I000OiO15.zze().booleanValue()) {
/* 2497 */                      return io0iiioo11I000OiO15;
                            }
/* 2406 */                  return ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
                        case 4:
/* 1491 */                  ii1il1Il ii1il1il4 = ii1il1Il.ADD;
/* 1497 */                  int iOrdinal4 = ll00I0ii.I0000oI00(str).ordinal();
/* 1504 */                  if (iOrdinal4 == 65) {
/* 2208 */                      ll00I0ii.I00000oIO("WHILE", 4, arrayList);
/* 2215 */                      iO0iIIoO11 io0iiioo115 = (iO0iIIoO11) arrayList.get(0);
/* 2221 */                      iO0iIIoO11 io0iiioo116 = (iO0iIIoO11) arrayList.get(1);
/* 2227 */                      iO0iIIoO11 io0iiioo117 = (iO0iIIoO11) arrayList.get(2);
/* 2233 */                      iO0iIIoO11 io0iiioo118 = (iO0iIIoO11) arrayList.get(3);
/* 2237 */                      OoOlO1O0o ooOlO1O0o9 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2241 */                      OoOlO1O0o ooOlO1O0o10 = (OoOlO1O0o) oillOo0.I00iiO;
/* 2243 */                      iO0iIIoO11 io0iiioo11I000OiO16 = ooOlO1O0o9.I000OiO(oillOo0, io0iiioo118);
/* 2259 */                      if (ooOlO1O0o10.I000OiO(oillOo0, io0iiioo117).zze().booleanValue()) {
/* 2265 */                          iO0iIIoO11 io0iiioo11I001i1O0Ol = oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO16);
/* 2271 */                          if (io0iiioo11I001i1O0Ol instanceof iI1II1oO) {
/* 2274 */                              iI1II1oO ii1ii1oo2 = (iI1II1oO) io0iiioo11I001i1O0Ol;
/* 2276 */                              String str5 = ii1ii1oo2.I00iiI;
/* 2282 */                              if ("break".equals(str5)) {
/* 2284 */                                  return iO0iIIoO11.I00Ol1ll1;
                                        }
/* 2291 */                              if ("return".equals(str5)) {
/* 2346 */                                  return ii1ii1oo2;
                                        }
                                    }
                                }
/* 2306 */                      while (ooOlO1O0o10.I000OiO(oillOo0, io0iiioo115).zze().booleanValue()) {
/* 2311 */                          iO0iIIoO11 io0iiioo11I001i1O0Ol2 = oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO16);
/* 2317 */                          if (io0iiioo11I001i1O0Ol2 instanceof iI1II1oO) {
/* 2320 */                              iI1II1oO ii1ii1oo3 = (iI1II1oO) io0iiioo11I001i1O0Ol2;
/* 2322 */                              String str6 = ii1ii1oo3.I00iiI;
/* 2328 */                              if ("break".equals(str6)) {
/* 2330 */                                  return iO0iIIoO11.I00Ol1ll1;
                                        }
/* 2337 */                              if ("return".equals(str6)) {
/* 2346 */                                  return ii1ii1oo3;
                                        }
                                    }
/* 2340 */                          oillOo0.I00111O(io0iiioo116);
                                }
/* 2344 */                      return iO0iIIoO11.I00Ol1ll1;
                            }
                            switch (iOrdinal4) {
                                case PoseLandmark.RIGHT_KNEE:
/* 2092 */                          ll00I0ii.I00000oIO("FOR_IN", 3, arrayList);
/* 2101 */                          if (!(arrayList.get(0) instanceof iOO00I0O)) {
/* 2201 */                              I000II.I000iOII("Variable name in FOR_IN must be a string");
/* 11 */                                return null;
                                    }
/* 2109 */                          String strZzc2 = ((iO0iIIoO11) arrayList.get(0)).zzc();
/* 2123 */                          iO0iIIoO11 io0iiioo11I000OiO17 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 2137 */                          iO0iIIoO11 io0iiioo11I000OiO18 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2));
/* 2141 */                          Iterator itZzf = io0iiioo11I000OiO17.zzf();
/* 2145 */                          if (itZzf != null) {
/* 2151 */                              while (itZzf.hasNext()) {
/* 2159 */                                  oillOo0.I00IioO0OiOi(strZzc2, (iO0iIIoO11) itZzf.next());
/* 2165 */                                  iO0iIIoO11 io0iiioo11I001i1O0Ol3 = oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO18);
/* 2171 */                                  if (io0iiioo11I001i1O0Ol3 instanceof iI1II1oO) {
/* 2173 */                                      ii1ii1oo = (iI1II1oO) io0iiioo11I001i1O0Ol3;
/* 2175 */                                      String str7 = ii1ii1oo.I00iiI;
/* 2181 */                                      if ("break".equals(str7)) {
/* 2183 */                                          iool1i12 = iO0iIIoO11.I00Ol1ll1;
                                                } else if ("return".equals(str7)) {
/* 2004 */                                          return ii1ii1oo;
                                                }
                                            }
                                        }
/* 2195 */                              iool1i12 = iO0iIIoO11.I00Ol1ll1;
                                    } else {
/* 2195 */                              iool1i12 = iO0iIIoO11.I00Ol1ll1;
                                    }
/* 1995 */                          return iool1i12;
                                case 27:
/* 2019 */                          ll00I0ii.I00000oIO("FOR_IN_CONST", 3, arrayList);
/* 2028 */                          if (arrayList.get(0) instanceof iOO00I0O) {
/* 2077 */                              return I000II(new i000IO(7, oillOo0, ((iO0iIIoO11) arrayList.get(0)).zzc()), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzf(), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2)));
                                    }
/* 2085 */                          I000II.I000iOII("Variable name in FOR_IN_CONST must be a string");
/* 11 */                            return null;
                                case PoseLandmark.RIGHT_ANKLE:
/* 1898 */                          ll00I0ii.I00000oIO("FOR_IN_LET", 3, arrayList);
/* 1907 */                          if (!(arrayList.get(0) instanceof iOO00I0O)) {
/* 2012 */                              I000II.I000iOII("Variable name in FOR_IN_LET must be a string");
/* 11 */                                return null;
                                    }
/* 1915 */                          String strZzc3 = ((iO0iIIoO11) arrayList.get(0)).zzc();
/* 1929 */                          iO0iIIoO11 io0iiioo11I000OiO19 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 1943 */                          iO0iIIoO11 io0iiioo11I000OiO20 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2));
/* 1947 */                          Iterator itZzf2 = io0iiioo11I000OiO19.zzf();
/* 1951 */                          if (itZzf2 != null) {
/* 1957 */                              while (itZzf2.hasNext()) {
/* 1963 */                                  iO0iIIoO11 io0iiioo119 = (iO0iIIoO11) itZzf2.next();
/* 1965 */                                  OillOo0 oillOo0I001lloI = oillOo0.I001lloI();
/* 1969 */                                  oillOo0I001lloI.I00IioO0OiOi(strZzc3, io0iiioo119);
/* 1975 */                                  iO0iIIoO11 io0iiioo11I001i1O0Ol4 = oillOo0I001lloI.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO20);
/* 1981 */                                  if (io0iiioo11I001i1O0Ol4 instanceof iI1II1oO) {
/* 1983 */                                      ii1ii1oo = (iI1II1oO) io0iiioo11I001i1O0Ol4;
/* 1985 */                                      String str8 = ii1ii1oo.I00iiI;
/* 1991 */                                      if ("break".equals(str8)) {
/* 1993 */                                          iool1i12 = iO0iIIoO11.I00Ol1ll1;
                                                } else if ("return".equals(str8)) {
/* 2004 */                                          return ii1ii1oo;
                                                }
                                            }
                                        }
/* 2007 */                              iool1i12 = iO0iIIoO11.I00Ol1ll1;
                                    } else {
/* 2007 */                              iool1i12 = iO0iIIoO11.I00Ol1ll1;
                                    }
/* 1995 */                          return iool1i12;
                                case PoseLandmark.LEFT_HEEL:
/* 1725 */                          ll00I0ii.I00000oIO("FOR_LET", 4, arrayList);
/* 1732 */                          iO0iIIoO11 io0iiioo1110 = (iO0iIIoO11) arrayList.get(0);
/* 1736 */                          OoOlO1O0o ooOlO1O0o11 = (OoOlO1O0o) oillOo0.I00iiO;
/* 1740 */                          OoOlO1O0o ooOlO1O0o12 = (OoOlO1O0o) oillOo0.I00iiO;
/* 1742 */                          iO0iIIoO11 io0iiioo11I000OiO21 = ooOlO1O0o11.I000OiO(oillOo0, io0iiioo1110);
/* 1748 */                          if (!(io0iiioo11I000OiO21 instanceof i1ollIol0I0)) {
/* 1891 */                              I000II.I000iOII("Initializer variables in FOR_LET must be an ArrayList");
/* 11 */                                return null;
                                    }
/* 1750 */                          i1ollIol0I0 i1olliol0i04 = (i1ollIol0I0) io0iiioo11I000OiO21;
/* 1756 */                          iO0iIIoO11 io0iiioo1111 = (iO0iIIoO11) arrayList.get(1);
/* 1762 */                          iO0iIIoO11 io0iiioo1112 = (iO0iIIoO11) arrayList.get(2);
/* 1770 */                          iO0iIIoO11 io0iiioo11I000OiO22 = ooOlO1O0o12.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(3));
/* 1774 */                          OillOo0 oillOo0I001lloI2 = oillOo0.I001lloI();
/* 1783 */                          for (int i3 = 0; i3 < i1olliol0i04.I000lI(); i3++) {
/* 1789 */                              String strZzc4 = i1olliol0i04.I000o00OoI0I(i3).zzc();
/* 1797 */                              oillOo0I001lloI2.I00IO1oi11O(strZzc4, oillOo0.I00IlilI0i0i(strZzc4));
                                    }
/* 1815 */                          while (ooOlO1O0o12.I000OiO(oillOo0, io0iiioo1111).zze().booleanValue()) {
/* 1820 */                              iO0iIIoO11 io0iiioo11I001i1O0Ol5 = oillOo0.I001i1O0Ol((i1ollIol0I0) io0iiioo11I000OiO22);
/* 1826 */                              if (io0iiioo11I001i1O0Ol5 instanceof iI1II1oO) {
/* 1829 */                                  iI1II1oO ii1ii1oo4 = (iI1II1oO) io0iiioo11I001i1O0Ol5;
/* 1831 */                                  String str9 = ii1ii1oo4.I00iiI;
/* 1837 */                                  if ("break".equals(str9)) {
/* 1839 */                                      return iO0iIIoO11.I00Ol1ll1;
                                            }
/* 1847 */                                  if ("return".equals(str9)) {
/* 2346 */                                      return ii1ii1oo4;
                                            }
                                        }
/* 1851 */                              OillOo0 oillOo0I001lloI3 = oillOo0.I001lloI();
/* 1860 */                              for (int i4 = 0; i4 < i1olliol0i04.I000lI(); i4++) {
/* 1866 */                                  String strZzc5 = i1olliol0i04.I000o00OoI0I(i4).zzc();
/* 1874 */                                  oillOo0I001lloI3.I00IO1oi11O(strZzc5, oillOo0I001lloI2.I00IlilI0i0i(strZzc5));
                                        }
/* 1880 */                              oillOo0I001lloI3.I00111O(io0iiioo1112);
/* 1883 */                              oillOo0I001lloI2 = oillOo0I001lloI3;
                                    }
/* 1885 */                          return iO0iIIoO11.I00Ol1ll1;
                                case 30:
/* 1656 */                          ll00I0ii.I00000oIO("FOR_OF", 3, arrayList);
/* 1665 */                          if (arrayList.get(0) instanceof iOO00I0O) {
/* 1710 */                              return I0000oI00(new OoOlO1O0o(oillOo0, ((iO0iIIoO11) arrayList.get(0)).zzc()), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2)));
                                    }
/* 1718 */                          I000II.I000iOII("Variable name in FOR_OF must be a string");
/* 11 */                            return null;
                                case PoseLandmark.LEFT_FOOT_INDEX:
/* 1587 */                          ll00I0ii.I00000oIO("FOR_OF_CONST", 3, arrayList);
/* 1596 */                          if (arrayList.get(0) instanceof iOO00I0O) {
/* 1641 */                              return I0000oI00(new i000IO(7, oillOo0, ((iO0iIIoO11) arrayList.get(0)).zzc()), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2)));
                                    }
/* 1649 */                          I000II.I000iOII("Variable name in FOR_OF_CONST must be a string");
/* 11 */                            return null;
                                case 32:
/* 1516 */                          ll00I0ii.I00000oIO("FOR_OF_LET", 3, arrayList);
/* 1525 */                          if (arrayList.get(0) instanceof iOO00I0O) {
/* 1572 */                              return I0000oI00(new OoIOol(10, oillOo0, ((iO0iIIoO11) arrayList.get(0)).zzc()), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2)));
                                    }
/* 1580 */                          I000II.I000iOII("Variable name in FOR_OF_LET must be a string");
/* 11 */                            return null;
                                default:
/* 1510 */                          I00000oOI(str);
/* 1513 */                          throw null;
                            }
                        case 5:
/* 1009 */                  ii1il1Il ii1il1il5 = ii1il1Il.ADD;
/* 1015 */                  int iOrdinal5 = ll00I0ii.I0000oI00(str).ordinal();
/* 1019 */                  if (iOrdinal5 == 0) {
/* 1387 */                      ll00I0ii.I00000oIO("ADD", 2, arrayList);
/* 1400 */                      iO0iIIoO11 io0iiioo11I000OiO23 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 1414 */                      iO0iIIoO11 io0iiioo11I000OiO24 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 1485 */                      ioo00i0o = ((io0iiioo11I000OiO23 instanceof iIii1l00O1) || (io0iiioo11I000OiO23 instanceof iOO00I0O) || (io0iiioo11I000OiO24 instanceof iIii1l00O1) || (io0iiioo11I000OiO24 instanceof iOO00I0O)) ? new iOO00I0O(String.valueOf(io0iiioo11I000OiO23.zzc()).concat(String.valueOf(io0iiioo11I000OiO24.zzc()))) : new iII01l(Double.valueOf(io0iiioo11I000OiO24.zzd().doubleValue() + io0iiioo11I000OiO23.zzd().doubleValue()));
                            } else if (iOrdinal5 == 21) {
/* 1326 */                      ll00I0ii.I00000oIO("DIVIDE", 2, arrayList);
/* 1380 */                      ioo00i0o = new iII01l(Double.valueOf(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue() / ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()));
                            } else {
/* 1027 */                      if (iOrdinal5 == 59) {
/* 1263 */                          ll00I0ii.I00000oIO("SUBTRACT", 2, arrayList);
/* 1318 */                          return new iII01l(Double.valueOf(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue() + (-((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue())));
                                }
/* 1031 */                      if (iOrdinal5 == 52 || iOrdinal5 == 53) {
/* 1233 */                          ll00I0ii.I00000oIO(str, 2, arrayList);
/* 1246 */                          iO0iIIoO11 io0iiioo11I000OiO25 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 1256 */                          oillOo0.I00111O((iO0iIIoO11) arrayList.get(1));
/* 1490 */                          return io0iiioo11I000OiO25;
                                }
/* 1039 */                      if (iOrdinal5 == 55 || iOrdinal5 == 56) {
/* 1214 */                          ll00I0ii.I00000oIO(str, 1, arrayList);
/* 1227 */                          return ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
                                }
                                switch (iOrdinal5) {
                                    case 44:
/* 1154 */                              ll00I0ii.I00000oIO("MODULUS", 2, arrayList);
/* 1208 */                              ioo00i0o = new iII01l(Double.valueOf(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue() % ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()));
                                        break;
                                    case BuildConfig.VERSION_CODE:
/* 1093 */                              ll00I0ii.I00000oIO("MULTIPLY", 2, arrayList);
/* 1147 */                              return new iII01l(Double.valueOf(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue() * ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()));
                                    case 46:
/* 1054 */                              ll00I0ii.I00000oIO("NEGATE", 1, arrayList);
/* 1086 */                              return new iII01l(Double.valueOf(-((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()));
                                    default:
/* 1048 */                              I00000oOI(str);
/* 1051 */                              throw null;
                                }
                            }
/* 1211 */                  return ioo00i0o;
                        case 6:
/* 958 */                   if (str == null || str.isEmpty() || !oillOo0.I00II0oii1o(str)) {
/* 1005 */                      I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Command not found: ", str));
/* 11 */                        return null;
                            }
/* 972 */                   iO0iIIoO11 io0iiioo11I00IlilI0i0i = oillOo0.I00IlilI0i0i(str);
/* 978 */                   if (io0iiioo11I00IlilI0i0i instanceof iIIoIiOoOoiO) {
/* 982 */                       return ((iIIoIiOoOoiO) io0iiioo11I00IlilI0i0i).I00000oIO(oillOo0, arrayList);
                            }
/* 995 */                   I000II.I000iOII(IlIi0I0.I000lI("Function ", str, " is not defined"));
/* 11 */                    return null;
                        default:
/* 15 */                    ii1il1Il ii1il1il6 = ii1il1Il.ADD;
/* 21 */                    int iOrdinal6 = ll00I0ii.I0000oI00(str).ordinal();
/* 25 */                    if (iOrdinal6 == 3) {
/* 881 */                       ll00I0ii.I00000oIO("ASSIGN", 2, arrayList);
/* 894 */                       iO0iIIoO11 io0iiioo11I000OiO26 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 900 */                       if (!(io0iiioo11I000OiO26 instanceof iOO00I0O)) {
/* 954 */                           I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Expected string for assign var. got ", io0iiioo11I000OiO26.getClass().getCanonicalName()));
/* 11 */                            return null;
                                }
/* 904 */                       String str10 = ((iOO00I0O) io0iiioo11I000OiO26).I00iOIl;
/* 910 */                       if (!oillOo0.I00II0oii1o(str10)) {
/* 936 */                           I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Attempting to assign undefined value ", str10));
/* 11 */                            return null;
                                }
/* 922 */                       iO0iIIoO11 io0iiioo11I000OiO27 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 926 */                       oillOo0.I00IO1oi11O(str10, io0iiioo11I000OiO27);
/* 957 */                       return io0iiioo11I000OiO27;
                            }
/* 29 */                    if (iOrdinal6 == 14) {
/* 773 */                       ll00I0ii.I00000oOI("CONST", 2, arrayList);
/* 781 */                       if (arrayList.size() % 2 != 0) {
/* 875 */                           I000II.I000iOII(Oi010OO0.I000oI1ioi(arrayList.size(), "CONST requires an even number of arguments, found "));
/* 11 */                            return null;
                                }
/* 789 */                       while (i < arrayList.size() - 1) {
/* 801 */                           iO0iIIoO11 io0iiioo11I000OiO28 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(i));
/* 807 */                           if (!(io0iiioo11I000OiO28 instanceof iOO00I0O)) {
/* 858 */                               I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Expected string for const name. got ", io0iiioo11I000OiO28.getClass().getCanonicalName()));
/* 11 */                                return null;
                                    }
/* 811 */                           String str11 = ((iOO00I0O) io0iiioo11I000OiO28).I00iOIl;
/* 829 */                           oillOo0.I00IioO0OiOi(str11, ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(i + 1)));
/* 838 */                           ((HashMap) oillOo0.I00ilI0I1).put(str11, Boolean.TRUE);
/* 841 */                           i += 2;
                                }
/* 862 */                       return iO0iIIoO11.I00Ol1ll1;
                            }
/* 33 */                    if (iOrdinal6 == 24) {
/* 732 */                       ll00I0ii.I00000oOI("EXPRESSION_LIST", 1, arrayList);
/* 735 */                       i1olliol0i0 = iO0iIIoO11.I00Ol1ll1;
/* 741 */                       while (i < arrayList.size()) {
/* 753 */                           iO0iIIoO11 io0iiioo11I000OiO29 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(i));
/* 759 */                           if (io0iiioo11I000OiO29 instanceof iI1II1oO) {
/* 766 */                               I000II.I001IO000("ControlValue cannot be in an expression list");
/* 11 */                                return null;
                                    }
/* 761 */                           i++;
                                    i1olliol0i0 = io0iiioo11I000OiO29;
                                }
                            } else {
/* 37 */                        if (iOrdinal6 == 33) {
/* 680 */                           ll00I0ii.I00000oIO("GET", 1, arrayList);
/* 693 */                           iO0iIIoO11 io0iiioo11I000OiO30 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 699 */                           if (io0iiioo11I000OiO30 instanceof iOO00I0O) {
/* 705 */                               return oillOo0.I00IlilI0i0i(((iOO00I0O) io0iiioo11I000OiO30).I00iOIl);
                                    }
/* 725 */                           I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Expected string for get var. got ", io0iiioo11I000OiO30.getClass().getCanonicalName()));
/* 11 */                            return null;
                                }
/* 41 */                        if (iOrdinal6 == 49) {
/* 671 */                           ll00I0ii.I00000oIO("NULL", 0, arrayList);
/* 674 */                           return iO0iIIoO11.I00OloOo;
                                }
/* 45 */                        if (iOrdinal6 == 58) {
/* 560 */                           ll00I0ii.I00000oIO("SET_PROPERTY", 3, arrayList);
/* 567 */                           iO0iIIoO11 io0iiioo1113 = (iO0iIIoO11) arrayList.get(0);
/* 571 */                           OoOlO1O0o ooOlO1O0o13 = (OoOlO1O0o) oillOo0.I00iiO;
/* 575 */                           OoOlO1O0o ooOlO1O0o14 = (OoOlO1O0o) oillOo0.I00iiO;
/* 577 */                           iO0iIIoO11 io0iiioo11I000OiO31 = ooOlO1O0o13.I000OiO(oillOo0, io0iiioo1113);
/* 587 */                           iO0iIIoO11 io0iiioo11I000OiO32 = ooOlO1O0o14.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 597 */                           iO0iIIoO11 io0iiioo11I000OiO33 = ooOlO1O0o14.I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(2));
/* 603 */                           if (io0iiioo11I000OiO31 == iO0iIIoO11.I00Ol1ll1 || io0iiioo11I000OiO31 == iO0iIIoO11.I00OloOo) {
/* 664 */                               I000II.I001IO000(IIl001iO0Io.I000oI1ioi("Can't set property ", io0iiioo11I000OiO32.zzc(), " of ", io0iiioo11I000OiO31.zzc()));
/* 11 */                                return null;
                                    }
/* 611 */                           if ((io0iiioo11I000OiO31 instanceof i1ollIol0I0) && (io0iiioo11I000OiO32 instanceof iII01l)) {
/* 627 */                               ((i1ollIol0I0) io0iiioo11I000OiO31).I000oI1ioi(((iII01l) io0iiioo11I000OiO32).I00iOIl.intValue(), io0iiioo11I000OiO33);
                                    } else if (io0iiioo11I000OiO31 instanceof iIii1l00O1) {
/* 644 */                               ((iIii1l00O1) io0iiioo11I000OiO31).I0000oI00(io0iiioo11I000OiO32.zzc(), io0iiioo11I000OiO33);
                                    }
/* 630 */                           return io0iiioo11I000OiO33;
                                }
/* 49 */                        if (iOrdinal6 != 17) {
/* 53 */                            if (iOrdinal6 != 18) {
/* 57 */                                if (iOrdinal6 == 35 || iOrdinal6 == 36) {
/* 229 */                                   ll00I0ii.I00000oIO("GET_PROPERTY", 2, arrayList);
/* 242 */                                   iO0iIIoO11 io0iiioo11I000OiO34 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 256 */                                   iO0iIIoO11 io0iiioo11I000OiO35 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 262 */                                   if ((io0iiioo11I000OiO34 instanceof i1ollIol0I0) && ll00I0ii.I0000O(io0iiioo11I000OiO35)) {
/* 280 */                                       return ((i1ollIol0I0) io0iiioo11I000OiO34).I000o00OoI0I(io0iiioo11I000OiO35.zzd().intValue());
                                            }
/* 288 */                                   if (io0iiioo11I000OiO34 instanceof iIii1l00O1) {
/* 296 */                                       return ((iIii1l00O1) io0iiioo11I000OiO34).I0000O(io0iiioo11I000OiO35.zzc());
                                            }
/* 304 */                                   if (io0iiioo11I000OiO34 instanceof iOO00I0O) {
/* 316 */                                       if ("length".equals(io0iiioo11I000OiO35.zzc())) {
/* 333 */                                           return new iII01l(Double.valueOf(((iOO00I0O) io0iiioo11I000OiO34).I00iOIl.length()));
                                                }
/* 342 */                                       if (ll00I0ii.I0000O(io0iiioo11I000OiO35)) {
/* 348 */                                           double dDoubleValue = io0iiioo11I000OiO35.zzd().doubleValue();
/* 354 */                                           String str12 = ((iOO00I0O) io0iiioo11I000OiO34).I00iOIl;
/* 363 */                                           if (dDoubleValue < str12.length()) {
/* 383 */                                               return new iOO00I0O(String.valueOf(str12.charAt(io0iiioo11I000OiO35.zzd().intValue())));
                                                    }
                                                }
                                            }
/* 388 */                                   return iO0iIIoO11.I00Ol1ll1;
                                        }
                                        switch (iOrdinal6) {
                                            case 62:
/* 147 */                                       ll00I0ii.I00000oIO("TYPEOF", 1, arrayList);
/* 160 */                                       iO0iIIoO11 io0iiioo11I000OiO36 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 166 */                                       if (io0iiioo11I000OiO36 instanceof iOOl1i1) {
/* 168 */                                           str2 = "undefined";
                                                } else if (io0iiioo11I000OiO36 instanceof iI0io0OI1IOo) {
/* 175 */                                           str2 = "boolean";
                                                } else if (io0iiioo11I000OiO36 instanceof iII01l) {
/* 182 */                                           str2 = "number";
                                                } else if (io0iiioo11I000OiO36 instanceof iOO00I0O) {
/* 189 */                                           str2 = "string";
                                                } else if (io0iiioo11I000OiO36 instanceof iIolollI1) {
/* 196 */                                           str2 = "function";
                                                } else {
/* 201 */                                           if ((io0iiioo11I000OiO36 instanceof iO11IOo0II) || (io0iiioo11I000OiO36 instanceof iI1II1oO)) {
/* 222 */                                               OIiilo1Ool0o.I000l1("Unsupported value type %s in typeof", new Object[]{io0iiioo11I000OiO36});
/* 11 */                                                return null;
                                                    }
/* 207 */                                           str2 = "object";
                                                }
/* 211 */                                       return new iOO00I0O(str2);
                                            case 63:
/* 138 */                                       ll00I0ii.I00000oIO("UNDEFINED", 0, arrayList);
/* 141 */                                       return iO0iIIoO11.I00Ol1ll1;
                                            case Barcode.FORMAT_EAN_8:
/* 72 */                                        ll00I0ii.I00000oOI("VAR", 1, arrayList);
/* 75 */                                        Iterator it = arrayList.iterator();
/* 83 */                                        while (it.hasNext()) {
/* 95 */                                            iO0iIIoO11 io0iiioo11I000OiO37 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) it.next());
/* 101 */                                           if (!(io0iiioo11I000OiO37 instanceof iOO00I0O)) {
/* 127 */                                               I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Expected string for var name. got ", io0iiioo11I000OiO37.getClass().getCanonicalName()));
/* 11 */                                                return null;
                                                    }
/* 109 */                                           oillOo0.I00IioO0OiOi(((iOO00I0O) io0iiioo11I000OiO37).I00iOIl, iO0iIIoO11.I00Ol1ll1);
                                                }
/* 132 */                                       return iO0iIIoO11.I00Ol1ll1;
                                            default:
/* 66 */                                        I00000oOI(str);
/* 69 */                                        throw null;
                                        }
                                    }
/* 396 */                           if (arrayList.isEmpty()) {
/* 400 */                               return new iIlIIIl11I1I();
                                    }
/* 410 */                           if (arrayList.size() % 2 != 0) {
/* 493 */                               I000II.I000iOII(Oi010OO0.I000oI1ioi(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
/* 11 */                                return null;
                                    }
/* 414 */                           i1olliol0i0 = new iIlIIIl11I1I();
/* 423 */                           while (i < arrayList.size() - 1) {
/* 435 */                               iO0iIIoO11 io0iiioo11I000OiO38 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(i));
/* 451 */                               iO0iIIoO11 io0iiioo11I000OiO39 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(i + 1));
/* 457 */                               if ((io0iiioo11I000OiO38 instanceof iI1II1oO) || (io0iiioo11I000OiO39 instanceof iI1II1oO)) {
/* 475 */                                   I000II.I001IO000("Failed to evaluate map entry");
/* 11 */                                    return null;
                                        }
/* 467 */                               i1olliol0i0.I0000oI00(io0iiioo11I000OiO38.zzc(), io0iiioo11I000OiO39);
/* 470 */                               i += 2;
                                    }
                                } else {
/* 502 */                           if (arrayList.isEmpty()) {
/* 506 */                               return new i1ollIol0I0();
                                    }
/* 513 */                           i1olliol0i0 = new i1ollIol0I0();
/* 516 */                           Iterator it2 = arrayList.iterator();
/* 524 */                           while (it2.hasNext()) {
/* 536 */                               iO0iIIoO11 io0iiioo11I000OiO40 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) it2.next());
/* 542 */                               if (io0iiioo11I000OiO40 instanceof iI1II1oO) {
/* 553 */                                   I000II.I001IO000("Failed to evaluate array element");
/* 11 */                                    return null;
                                        }
/* 546 */                               i1olliol0i0.I000oI1ioi(i, io0iiioo11I000OiO40);
/* 544 */                               i++;
                                    }
                                }
                            }
/* 480 */                   return i1olliol0i0;
                    }
                }

                public final void I00000oOI(String str) {
/* 11 */            if (!this.I00000oIO.contains(ll00I0ii.I0000oI00(str))) {
/* 77 */                throw new IllegalArgumentException("Command not supported");
                    }
/* 28 */            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
                }
            }
