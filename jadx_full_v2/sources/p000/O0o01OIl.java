            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.regex.Matcher;
            import kotlin.jvm.functions.Function1;
            
            public final class O0o01OIl implements Function1 {
                public final int I00iOIl;

                public O0o01OIl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    IoI1O1i1 ioI1O1i1;
/* 3 */             int i = this.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            Context context = null;
/* 15 */            int i3 = 2;
/* 16 */            int i4 = 1;
/* 17 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 974 */                   List list = (List) obj;
/* 998 */                   return new O0o0I1i0O(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
                        case 1:
/* 971 */                   return ooiIlOl1iI;
                        case 2:
/* 966 */                   return ooiIlOl1iI;
                        case 3:
/* 961 */                   return ooiIlOl1iI;
                        case 4:
/* 956 */                   return ooiIlOl1iI;
                        case 5:
/* 951 */                   return ooiIlOl1iI;
                        case 6:
/* 925 */                   Context baseContext = (Context) ((IOlIOlli0I) obj).I00iIO(I0lloOI0oio.I00000oOI);
                            while (true) {
/* 929 */                       if (baseContext instanceof ContextWrapper) {
/* 933 */                           if (baseContext instanceof Activity) {
/* 935 */                               context = baseContext;
                                    } else {
/* 939 */                               baseContext = ((ContextWrapper) baseContext).getBaseContext();
                                    }
                                }
                            }
/* 944 */                   return (Activity) context;
                        case 7:
/* 853 */                   OO1I01i oO1I01i = (OO1I01i) obj;
/* 859 */                   if (oO1I01i.I001IIilI0O()) {
/* 861 */                       O1IiO0l o1IiO0l = oO1I01i.I00iiI;
/* 865 */                       if (!o1IiO0l.I00o0iI0io1) {
/* 870 */                           Function1 function1I000II = oO1I01i.I00iOIl.I000II();
/* 880 */                           if (oO1I01i.I00iOIl.I0000oI00() != null) {
/* 882 */                               o1IiO0l.I010II();
                                    } else if (function1I000II == null) {
/* 888 */                               o1IiO0l.I00ioIO = null;
/* 890 */                               o1IiO0l.I00l0I0l0lO1 = null;
/* 892 */                               o1IiO0l.I00io1l = null;
/* 894 */                               o1IiO0l.I010II();
                                    } else {
/* 898 */                               o1IiO0l.I00ioIO = null;
/* 900 */                               o1IiO0l.I00l0I0l0lO1 = null;
/* 909 */                               o1IiO0l.I00li1OI(oO1I01i, 9223372034707292159L, 0L);
/* 912 */                               o1IiO0l.I00io1l = function1I000II;
                                    }
                                }
                            }
/* 914 */                   return ooiIlOl1iI;
                        case 8:
/* 810 */                   OO1I01i oO1I01i2 = (OO1I01i) obj;
/* 816 */                   if (oO1I01i2.I001IIilI0O() && (ioI1O1i1 = oO1I01i2.I00iiO) != null) {
/* 822 */                       O1IiO0l o1IiO0l2 = oO1I01i2.I00iiI;
/* 824 */                       OI10I1IoI0Ol oI10I1IoI0Ol = o1IiO0l2.I00oI0i;
/* 833 */                       OI10IIO oi10iio = oI10I1IoI0Ol != null ? (OI10IIO) oI10I1IoI0Ol.I000II(ioI1O1i1) : null;
/* 835 */                       if (oi10iio != null) {
/* 837 */                           I11l01l i11l01l = o1IiO0l2.I00o101lO;
/* 839 */                           if (i11l01l != null) {
/* 841 */                               i11l01l.I00IlilI0i0i(ioI1O1i1);
                                    }
/* 844 */                           o1IiO0l2.I010101Oo1lO(oi10iio);
/* 847 */                           oi10iio.I00000oOI();
                                }
                            }
/* 850 */                   return ooiIlOl1iI;
                        case 9:
/* 805 */                   ((O0iiOioolIi) obj).I00ioIO = true;
/* 807 */                   return ooiIlOl1iI;
                        case 10:
/* 797 */                   ((Long) obj).getClass();
/* 800 */                   return ooiIlOl1iI;
                        case 11:
/* 771 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) obj;
/* 788 */                   return IooOl0ol01.I00000oIO((iiIooOOOI.I00l0OO0IO(128.0f) & 4294967295L) | (iiIooOOOI.I00l0OO0IO(128.0f) << 32));
                        case 12:
/* 529 */                   O1OlOOioiI o1OlOOioiI = (O1OlOOioiI) ((O1OlIoo) obj);
/* 531 */                   Matcher matcher = o1OlOOioiI.I00000oIO;
/* 549 */                   String string = OlOoOIi0o.I00OIo((String) ((O1OlO1II) o1OlOOioiI.I00000oIO()).get(1)).toString();
/* 567 */                   if (!O1Ol1io1o.I00000oOI.I00iOIl.matcher(string).find()) {
/* 749 */                       String strI000OOo1O = O1Ol1io1o.I000OOo1O(OlOoOIi0o.I00OIo(O1Ol1io1o.I0000O.I0000oI00(string, "")).toString());
                                return strI000OOo1O.length() > 0 ? IlIi0I0.I000lI("$$", strI000OOo1O, "$$") : matcher.group();
                            }
/* 571 */                   ArrayList arrayList = new ArrayList();
/* 580 */                   Iterator it = OOoiliiIoloI.I00000oOI(O1Ol1io1o.I0000oI00, string).iterator();
                            while (true) {
/* 585 */                       Io00llIoO1lO io00llIoO1lO = (Io00llIoO1lO) it;
/* 591 */                       if (io00llIoO1lO.hasNext()) {
/* 613 */                           String strI000OOo1O2 = O1Ol1io1o.I000OOo1O((String) ((O1OlO1II) ((O1OlOOioiI) ((O1OlIoo) io00llIoO1lO.next())).I00000oIO()).get(1));
/* 621 */                           if (strI000OOo1O2.length() > 0) {
/* 638 */                               arrayList.add("$$" + strI000OOo1O2 + "$$");
                                    }
                                } else {
/* 648 */                           Iterator it2 = OOoiliiIoloI.I00000oOI(O1Ol1io1o.I0000Il00O, string).iterator();
                                    while (true) {
/* 653 */                               Io00llIoO1lO io00llIoO1lO2 = (Io00llIoO1lO) it2;
/* 659 */                               if (!io00llIoO1lO2.hasNext()) {
                                            return arrayList.isEmpty() ? matcher.group() : IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n\n", null, null, null, 62);
                                        }
/* 681 */                               String strI000OOo1O3 = O1Ol1io1o.I000OOo1O((String) ((O1OlO1II) ((O1OlOOioiI) ((O1OlIoo) io00llIoO1lO2.next())).I00000oIO()).get(2));
/* 689 */                               if (strI000OOo1O3.length() > 0) {
/* 706 */                                   arrayList.add("$$" + strI000OOo1O3 + "$$");
                                        }
                                    }
                                }
                            }
                        case 13:
/* 520 */                   return ((O1i1Ooo0ll) obj).I00000oIO.I001i1O0Ol();
                        case 14:
/* 482 */                   O1iI0OiI o1iI0OiI = (O1iI0OiI) obj;
/* 484 */                   String strI001IO000 = o1iI0OiI.I001IO000();
/* 488 */                   String strI0010o = o1iI0OiI.I0010o();
/* 492 */                   String strI001IIilI0O = o1iI0OiI.I001IIilI0O();
/* 502 */                   StringBuilder sbI00111O = IIl001iO0Io.I00111O("MCP tool name: \"", strI001IO000, "\"\n- Description: ", strI0010o, "\n- Input schema: ");
/* 506 */                   sbI00111O.append(strI001IIilI0O);
/* 509 */                   return sbI00111O.toString();
                        case 15:
/* 475 */                   return IlIi0I0.I000lI("\"", (String) obj, "\"");
                        case 16:
/* 464 */                   return ((O1iI0OiI) obj).I001IO000();
                        case 17:
/* 455 */                   return ((O1iI0OiI) obj).I001IO000();
                        case PoseLandmark.RIGHT_PINKY:
/* 446 */                   return ((O1iI0OiI) obj).I001IO000();
                        case PoseLandmark.LEFT_INDEX:
/* 437 */                   return ((O1iI0OiI) obj).I001IO000();
                        case PoseLandmark.RIGHT_INDEX:
/* 430 */                   return ((OloiioiOI1) obj).I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 423 */                   return ((OloiioiOI1) obj).I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 335 */                   O1l0O1O o1l0O1O = (O1l0O1O) obj;
/* 369 */                   List listI000O01llI0 = IOOi1I.I000O01llI0(O1l0O10iliOl.I00000oIO, O1l0O10iliOl.I00000oOI, ((int) (o1l0O1O.I00000oIO.I00000oIO() >> 32)) < ((int) (o1l0O1O.I00000oOI >> 32)) / 2 ? O1l0O10iliOl.I0000Il00O : O1l0O10iliOl.I0000O);
/* 373 */                   IooO1IOlo iooO1IOlo = o1l0O1O.I00000oIO;
/* 375 */                   long j = o1l0O1O.I00000oOI;
/* 380 */                   int i5 = (int) (o1l0O1O.I0000Il00O >> 32);
/* 381 */                   O0iOOoiioO o0iOOoiioO = o1l0O1O.I0000O;
/* 389 */                   OI0l1iiooO oI0l1iiooO = new OI0l1iiooO(listI000O01llI0.size());
/* 395 */                   int size = listI000O01llI0.size();
/* 399 */                   while (i2 < size) {
/* 412 */                       oI0l1iiooO.I00000oIO(((O1l0Ii10I00l) listI000O01llI0.get(i2)).I00000oIO(iooO1IOlo, j, i5, o0iOOoiioO));
/* 415 */                       i2++;
                            }
/* 418 */                   return oI0l1iiooO;
                        case PoseLandmark.LEFT_HIP:
/* 248 */                   O1l0O1O o1l0O1O2 = (O1l0O1O) obj;
/* 257 */                   int iI00000oIO = (int) (o1l0O1O2.I00000oIO.I00000oIO() & 4294967295L);
/* 258 */                   long j2 = o1l0O1O2.I00000oOI;
/* 288 */                   List listI000O01llI02 = IOOi1I.I000O01llI0(O1l0O10iliOl.I0000oI00, O1l0O10iliOl.I0001Ioi1lo, O1l0O10iliOl.I000II, iI00000oIO < ((int) (j2 & 4294967295L)) / 2 ? O1l0O10iliOl.I000O01llI0 : O1l0O10iliOl.I000OOo1O);
/* 292 */                   IooO1IOlo iooO1IOlo2 = o1l0O1O2.I00000oIO;
/* 297 */                   int i6 = (int) (4294967295L & o1l0O1O2.I0000Il00O);
/* 304 */                   OI0l1iiooO oI0l1iiooO2 = new OI0l1iiooO(listI000O01llI02.size());
/* 310 */                   int size2 = listI000O01llI02.size();
/* 314 */                   while (i2 < size2) {
/* 326 */                       oI0l1iiooO2.I00000oIO(((O1l0O0i1IOoI) listI000O01llI02.get(i2)).I00000oIO(iooO1IOlo2, j2, i6));
/* 329 */                       i2++;
                            }
/* 332 */                   return oI0l1iiooO2;
                        case PoseLandmark.RIGHT_HIP:
/* 242 */                   return new IOoOi11Io0o(Il0iiiII11.I000lI(1, new I10I0o1ii10(20)).I00000oIO(Il0iiiII11.I0000oI00(null, 3)), Il0iiiII11.I000oI1ioi(1, new O0o01OIl(25)).I00000oIO(Il0iiiII11.I0001Ioi1lo(null, 3)));
                        case PoseLandmark.LEFT_KNEE:
/* 193 */                   return Integer.valueOf(-((Integer) obj).intValue());
                        case PoseLandmark.RIGHT_KNEE:
/* 180 */                   return new IOoOi11Io0o(Il0iiiII11.I0000oI00(null, 3), Il0iiiII11.I0001Ioi1lo(null, 3));
                        case 27:
/* 162 */                   ((Oi11lOiIoi) obj).I0000Il00O(0.7f);
/* 165 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 38 */                    I10l1l11 i10l1l11 = (I10l1l11) obj;
                            return ((Number) i10l1l11.I0000oI00()).intValue() > ((Number) i10l1l11.I00000oOI()).intValue() ? new IOoOi11Io0o(Il0iiiII11.I000l1(new O0o01OIl(29)).I00000oIO(Il0iiiII11.I0000oI00(null, 3)), Il0iiiII11.I000o00OoI0I(new O1o0i0Ol0Oo0(i2)).I00000oIO(Il0iiiII11.I0001Ioi1lo(iOO01lio0.I0000O(50, 6, null), 2))) : new IOoOi11Io0o(Il0iiiII11.I000l1(new O1o0i0Ol0Oo0(i4)).I00000oIO(Il0iiiII11.I0000oI00(null, 3)), Il0iiiII11.I000o00OoI0I(new O1o0i0Ol0Oo0(i3)).I00000oIO(Il0iiiII11.I0001Ioi1lo(iOO01lio0.I0000O(50, 6, null), 2)));
                        default:
/* 26 */                    ((Integer) obj).getClass();
/* 31 */                    return 40;
                    }
                }
            }
