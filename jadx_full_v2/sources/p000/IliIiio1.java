            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.Text;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Comparator;
            import java.util.Locale;
            import java.util.Map;
            
            public final class IliIiio1 implements Comparator {
                public static final IliIiio1 I00iiI = new IliIiio1(0);
                public static final IliIiio1 I00iiO = new IliIiio1(2);
                public static final IliIiio1 I00iio = new IliIiio1(3);
                public static final IliIiio1 I00ilI0I1 = new IliIiio1(4);
                public static final IliIiio1 I00ilO0 = new IliIiio1(5);
                public static final IliIiio1 I00io1l = new IliIiio1(6);
                public static final IliIiio1 I00ioIO = new IliIiio1(7);
                public final int I00iOIl;

                public IliIiio1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static float I00000oIO(OiolIO0Il oiolIO0Il) {
/* 10 */            if (oiolIO0Il.I00iiI.I000II() == 0.0f && (oiolIO0Il instanceof OiolIO0Il) && oiolIO0Il.I00ll1 == null) {
/* 20 */                return -1.0f;
                    }
/* 25 */            return oiolIO0Il.I00iiI.I000II();
                }

                public static int I00000oOI(Ii1Ool1 ii1Ool1) {
/* 1 */             if (ii1Ool1 == null) {
/* 70 */                IiOiIO0i1Oil.I00000oIO(36);
/* 77 */                throw null;
                    }
/* 3 */             int i = IiOiIO0i1Oil.I00000oIO;
/* 11 */            if (IiOiIO0i1Oil.I000l1(ii1Ool1, IOIOllO1oli.I00iio)) {
/* 13 */                return 8;
                    }
/* 18 */            if (ii1Ool1 instanceof IOo1IIOOiO1o) {
/* 20 */                return 7;
                    }
/* 24 */            if (ii1Ool1 instanceof OOOO01l) {
                        return ((OOOO01l) ii1Ool1).I00OOll1() == null ? 6 : 5;
                    }
/* 40 */            if (ii1Ool1 instanceof Illlil) {
                        return ((Illlil) ii1Ool1).I00OOll1() == null ? 4 : 3;
                    }
/* 56 */            if (ii1Ool1 instanceof OI000ilOol) {
/* 58 */                return 2;
                    }
                    return ii1Ool1 instanceof IiOoI0oI ? 1 : 0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:93:0x01f7, code lost:
                
                    if (r8 == 2) goto L97;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int compare(Object obj, Object obj2) {
                    Integer numValueOf;
                    int i;
/* 4 */             int i2 = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 867 */                   IliIO10oO0 iliIO10oO0 = (IliIO10oO0) obj;
/* 869 */                   IliIO10oO0 iliIO10oO02 = (IliIO10oO0) obj2;
/* 875 */                   if (iliI1i0.I0000O(iliIO10oO0) && iliI1i0.I0000O(iliIO10oO02)) {
/* 885 */                       O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
/* 889 */                       O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(iliIO10oO02);
/* 897 */                       if (!O0000Ioio00.I0000O(o0iiOioolIiI000O01llI0, o0iiOioolIiI000O01llI02)) {
/* 903 */                           O0iiOioolIi[] o0iiOioolIiArr = new O0iiOioolIi[16];
/* 905 */                           int i3 = 0;
/* 906 */                           while (o0iiOioolIiI000O01llI0 != null) {
/* 908 */                               int i4 = i3 + 1;
/* 911 */                               if (o0iiOioolIiArr.length < i4) {
/* 913 */                                   int length = o0iiOioolIiArr.length;
/* 920 */                                   ?? r4 = new Object[Math.max(i4, length * 2)];
/* 922 */                                   System.arraycopy(o0iiOioolIiArr, 0, r4, 0, length);
/* 925 */                                   o0iiOioolIiArr = r4;
                                        }
/* 926 */                               if (i3 != 0) {
/* 932 */                                   System.arraycopy(o0iiOioolIiArr, 0, o0iiOioolIiArr, 0 + 1, i3 + 0);
                                        }
/* 935 */                               o0iiOioolIiArr[0] = o0iiOioolIiI000O01llI0;
/* 937 */                               i3++;
/* 939 */                               o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
                                    }
/* 944 */                           O0iiOioolIi[] o0iiOioolIiArr2 = new O0iiOioolIi[16];
/* 946 */                           int i5 = 0;
/* 947 */                           while (o0iiOioolIiI000O01llI02 != null) {
/* 949 */                               int i6 = i5 + 1;
/* 952 */                               if (o0iiOioolIiArr2.length < i6) {
/* 954 */                                   int length2 = o0iiOioolIiArr2.length;
/* 961 */                                   ?? r42 = new Object[Math.max(i6, length2 * 2)];
/* 963 */                                   System.arraycopy(o0iiOioolIiArr2, 0, r42, 0, length2);
/* 966 */                                   o0iiOioolIiArr2 = r42;
                                        }
/* 967 */                               if (i5 != 0) {
/* 973 */                                   System.arraycopy(o0iiOioolIiArr2, 0, o0iiOioolIiArr2, 0 + 1, i5 + 0);
                                        }
/* 976 */                               o0iiOioolIiArr2[0] = o0iiOioolIiI000O01llI02;
/* 978 */                               i5++;
/* 980 */                               o0iiOioolIiI000O01llI02 = o0iiOioolIiI000O01llI02.I001IO000();
                                    }
/* 987 */                           int iMin = Math.min(i3 - 1, i5 - 1);
/* 991 */                           if (iMin >= 0) {
/* 993 */                               int i7 = 0;
/* 1002 */                              while (O0000Ioio00.I0000O(o0iiOioolIiArr[i7], o0iiOioolIiArr2[i7])) {
/* 1025 */                                  if (i7 != iMin) {
/* 1027 */                                      i7++;
                                            }
                                        }
/* 1020 */                              return O0000Ioio00.I0000oI00(o0iiOioolIiArr[i7].I001i1O0Ol(), o0iiOioolIiArr2[i7].I001i1O0Ol());
                                    }
/* 1032 */                          I000II.I001IO000("Could not find a common ancestor between the two FocusModifiers.");
                                }
                            } else {
/* 1041 */                      if (iliI1i0.I0000O(iliIO10oO0)) {
/* 3 */                             return -1;
                                }
/* 1048 */                      if (iliI1i0.I0000O(iliIO10oO02)) {
/* 4 */                             return 1;
                                }
                            }
/* 5 */                     return 0;
                        case 1:
/* 862 */                   return Float.compare(I00000oIO((OiolIO0Il) obj), I00000oIO((OiolIO0Il) obj2));
                        case 2:
/* 800 */                   OOo0IO oOo0IOI000O01llI0 = ((Oil000) obj).I000O01llI0();
/* 804 */                   OOo0IO oOo0IOI000O01llI02 = ((Oil000) obj2).I000O01llI0();
/* 812 */                   int iCompare = Float.compare(oOo0IOI000O01llI0.I00000oIO, oOo0IOI000O01llI02.I00000oIO);
/* 816 */                   if (iCompare != 0) {
/* 849 */                       return iCompare;
                            }
/* 823 */                   int iCompare2 = Float.compare(oOo0IOI000O01llI0.I00000oOI, oOo0IOI000O01llI02.I00000oOI);
/* 827 */                   if (iCompare2 != 0) {
/* 849 */                       return iCompare2;
                            }
/* 834 */                   int iCompare3 = Float.compare(oOo0IOI000O01llI0.I0000O, oOo0IOI000O01llI02.I0000O);
                            return iCompare3 != 0 ? iCompare3 : Float.compare(oOo0IOI000O01llI0.I0000Il00O, oOo0IOI000O01llI02.I0000Il00O);
                        case 3:
/* 726 */                   Ii1Ool1 ii1Ool1 = (Ii1Ool1) obj;
/* 728 */                   Ii1Ool1 ii1Ool12 = (Ii1Ool1) obj2;
/* 738 */                   int iI00000oOI = I00000oOI(ii1Ool12) - I00000oOI(ii1Ool1);
/* 739 */                   if (iI00000oOI != 0) {
/* 741 */                       numValueOf = Integer.valueOf(iI00000oOI);
                            } else {
/* 746 */                       IOIOllO1oli iOIOllO1oli = IOIOllO1oli.I00iio;
/* 752 */                       if (IiOiIO0i1Oil.I000l1(ii1Ool1, iOIOllO1oli) && IiOiIO0i1Oil.I000l1(ii1Ool12, iOIOllO1oli)) {
/* 760 */                           numValueOf = 0;
                                } else {
/* 777 */                           int iCompareTo = ii1Ool1.getName().I00iOIl.compareTo(ii1Ool12.getName().I00iOIl);
/* 788 */                           numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                                }
                            }
/* 789 */                   if (numValueOf != null) {
/* 791 */                       return numValueOf.intValue();
                            }
/* 5 */                     return 0;
                        case 4:
/* 698 */                   O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) obj;
/* 700 */                   O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) obj2;
/* 706 */                   int iI0000oI00 = O0000Ioio00.I0000oI00(o0iiOioolIi2.I00o101lO, o0iiOioolIi.I00o101lO);
                            return iI0000oI00 != 0 ? iI0000oI00 : O0000Ioio00.I0000oI00(o0iiOioolIi.hashCode(), o0iiOioolIi2.hashCode());
                        case 5:
/* 648 */                   OOo0IO oOo0IOI000O01llI03 = ((Oil000) obj).I000O01llI0();
/* 652 */                   OOo0IO oOo0IOI000O01llI04 = ((Oil000) obj2).I000O01llI0();
/* 660 */                   int iCompare4 = Float.compare(oOo0IOI000O01llI04.I0000Il00O, oOo0IOI000O01llI03.I0000Il00O);
/* 664 */                   if (iCompare4 != 0) {
/* 697 */                       return iCompare4;
                            }
/* 671 */                   int iCompare5 = Float.compare(oOo0IOI000O01llI03.I00000oOI, oOo0IOI000O01llI04.I00000oOI);
/* 675 */                   if (iCompare5 != 0) {
/* 697 */                       return iCompare5;
                            }
/* 682 */                   int iCompare6 = Float.compare(oOo0IOI000O01llI03.I0000O, oOo0IOI000O01llI04.I0000O);
                            return iCompare6 != 0 ? iCompare6 : Float.compare(oOo0IOI000O01llI04.I00000oIO, oOo0IOI000O01llI03.I00000oIO);
                        case 6:
/* 604 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) obj;
/* 606 */                   OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) obj2;
/* 620 */                   int iCompare7 = Float.compare(((OOo0IO) oIoi0IIoi.I00iOIl).I00000oOI, ((OOo0IO) oIoi0IIoi2.I00iOIl).I00000oOI);
                            return iCompare7 != 0 ? iCompare7 : Float.compare(((OOo0IO) oIoi0IIoi.I00iOIl).I0000O, ((OOo0IO) oIoi0IIoi2.I00iOIl).I0000O);
                        case 7:
/* 586 */                   I1l1iI1Io i1l1iI1Io = ((OiI1oi1) obj).I0000oI00;
/* 588 */                   I1l1iI1Io i1l1iI1Io2 = ((OiI1oi1) obj2).I0000oI00;
/* 590 */                   if (i1l1iI1Io == null) {
/* 4 */                         return 1;
                            }
/* 594 */                   if (i1l1iI1Io2 == null) {
/* 3 */                         return -1;
                            }
/* 601 */                   return i1l1iI1Io.I0000O - i1l1iI1Io2.I0000O;
                        case 8:
/* 577 */                   return iii1OiiIi.I00000oIO(Integer.valueOf(((I11110l0o) obj).I00000oOI), Integer.valueOf(((I11110l0o) obj2).I00000oOI));
                        case 9:
/* 556 */                   return iii1OiiIi.I00000oIO(Integer.valueOf(((I11110l0o) obj).I00000oOI), Integer.valueOf(((I11110l0o) obj2).I00000oOI));
                        case 10:
/* 535 */                   return iii1OiiIi.I00000oIO((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
                        case 11:
/* 451 */                   IiOoOOO iiOoOOO = (IiOoOOO) obj2;
/* 461 */                   int iOrdinal = II1o1O1O1iIi.I00000oIO(iiOoOOO.I00000oIO, iiOoOOO.I0000O).ordinal();
/* 467 */                   if (iOrdinal == 0) {
/* 481 */                       i = 3;
                            } else {
/* 469 */                       if (iOrdinal != 1) {
/* 471 */                           if (iOrdinal == 2) {
/* 473 */                               i = 1;
                                    }
/* 475 */                           I000II.I00000oIO();
/* 5 */                             return 0;
                                }
/* 479 */                       i = 2;
                            }
/* 482 */                   Integer numValueOf2 = Integer.valueOf(i);
/* 486 */                   IiOoOOO iiOoOOO2 = (IiOoOOO) obj;
/* 496 */                   int iOrdinal2 = II1o1O1O1iIi.I00000oIO(iiOoOOO2.I00000oIO, iiOoOOO2.I0000O).ordinal();
/* 500 */                   if (iOrdinal2 == 0) {
/* 509 */                       i2 = 3;
                            } else if (iOrdinal2 == 1) {
/* 507 */                       i2 = 2;
                            }
/* 514 */                   return iii1OiiIi.I00000oIO(numValueOf2, Integer.valueOf(i2));
                        case 12:
/* 395 */                   String str = (String) obj;
/* 397 */                   String str2 = (String) obj2;
/* 407 */                   int iMin2 = Math.min(str.length(), str2.length());
/* 411 */                   int i8 = 4;
                            while (true) {
/* 412 */                       if (i8 >= iMin2) {
/* 434 */                           int length3 = str.length();
/* 438 */                           int length4 = str2.length();
/* 442 */                           if (length3 == length4) {
/* 5 */                                 return 0;
                                    }
/* 444 */                           if (length3 < length4) {
/* 3 */                                 return -1;
                                    }
                                } else {
/* 414 */                           char cCharAt = str.charAt(i8);
/* 418 */                           char cCharAt2 = str2.charAt(i8);
/* 422 */                           if (cCharAt == cCharAt2) {
/* 431 */                               i8++;
                                    } else if (O0000Ioio00.I0000oI00(cCharAt, cCharAt2) < 0) {
/* 3 */                                 return -1;
                                    }
                                }
                            }
/* 4 */                     return 1;
                        case 13:
/* 390 */                   return iii1OiiIi.I00000oIO(IiOiOOIo.I000II((OI000ilOol) obj).I00000oIO.I00000oIO, IiOiOOIo.I000II((OI000ilOol) obj2).I00000oIO.I00000oIO);
                        case 14:
/* 365 */                   return iii1OiiIi.I00000oIO((String) ((OIoi0IIoi) obj).I00iOIl, (String) ((OIoi0IIoi) obj2).I00iOIl);
                        case 15:
/* 325 */                   O0iiOioolIi o0iiOioolIi3 = (O0iiOioolIi) obj;
/* 327 */                   O0iiOioolIi o0iiOioolIi4 = (O0iiOioolIi) obj2;
/* 333 */                   int iI0000oI002 = O0000Ioio00.I0000oI00(o0iiOioolIi3.I00o101lO, o0iiOioolIi4.I00o101lO);
                            return iI0000oI002 != 0 ? iI0000oI002 : O0000Ioio00.I0000oI00(o0iiOioolIi3.hashCode(), o0iiOioolIi4.hashCode());
                        case 16:
/* 320 */                   return iii1OiiIi.I00000oIO(((IiO1l1i) ((O0IooIIl00) obj)).getName(), ((IiO1l1i) ((O0IooIIl00) obj2)).getName());
                        case 17:
/* 283 */                   String str3 = ((Il0Oo11iiO) obj).I00000oIO;
/* 285 */                   Locale locale = Locale.ROOT;
/* 299 */                   return iii1OiiIi.I00000oIO(str3.toLowerCase(locale), ((Il0Oo11iiO) obj2).I00000oIO.toLowerCase(locale));
                        case PoseLandmark.RIGHT_PINKY:
/* 252 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj;
/* 254 */                   String str4 = o1oIOiI11o0.I00000oOI;
/* 260 */                   if (str4.length() == 0) {
/* 262 */                       str4 = o1oIOiI11o0.I00000oIO;
                            }
/* 264 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) obj2;
/* 266 */                   String str5 = o1oIOiI11o02.I00000oOI;
/* 272 */                   if (str5.length() == 0) {
/* 274 */                       str5 = o1oIOiI11o02.I00000oIO;
                            }
/* 276 */                   return iii1OiiIi.I00000oIO(str4, str5);
                        case PoseLandmark.LEFT_INDEX:
/* 247 */                   return iii1OiiIi.I00000oIO(((Charset) obj).name(), ((Charset) obj2).name());
                        case PoseLandmark.RIGHT_INDEX:
/* 230 */                   return iii1OiiIi.I00000oIO((Float) ((OIoi0IIoi) obj2).I00iiI, (Float) ((OIoi0IIoi) obj).I00iiI);
                        case PoseLandmark.LEFT_THUMB:
/* 213 */                   return iii1OiiIi.I00000oIO(((Method) obj).getName(), ((Method) obj2).getName());
                        case PoseLandmark.RIGHT_THUMB:
/* 188 */                   OOoiliiIoloI oOoiliiIoloI = O0IiOio0lo0.I00iOIl;
/* 190 */                   Integer numI00000oOI = IiOiioI.I00000oOI((IiOiOloo0) obj, (IiOiOloo0) obj2);
/* 194 */                   if (numI00000oOI != null) {
/* 196 */                       return numI00000oOI.intValue();
                            }
/* 5 */                     return 0;
                        case PoseLandmark.LEFT_HIP:
/* 179 */                   return ((Comparable) obj).compareTo((Comparable) obj2);
                        case PoseLandmark.RIGHT_HIP:
/* 136 */                   Size size = (Size) obj;
/* 153 */                   Size size2 = (Size) obj2;
/* 170 */                   return iii1OiiIi.I00000oIO(Long.valueOf(size.getWidth() * size.getHeight()), Long.valueOf(size2.getWidth() * size2.getHeight()));
                        case PoseLandmark.LEFT_KNEE:
/* 107 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) obj;
/* 109 */                   String str6 = o1oIOiI11o03.I00000oOI;
/* 115 */                   if (str6.length() == 0) {
/* 117 */                       str6 = o1oIOiI11o03.I00000oIO;
                            }
/* 119 */                   O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) obj2;
/* 121 */                   String str7 = o1oIOiI11o04.I00000oOI;
/* 127 */                   if (str7.length() == 0) {
/* 129 */                       str7 = o1oIOiI11o04.I00000oIO;
                            }
/* 131 */                   return iii1OiiIi.I00000oIO(str6, str7);
                        case PoseLandmark.RIGHT_KNEE:
/* 94 */                    int i9 = ((int[]) obj)[0];
/* 96 */                    int i10 = ((int[]) obj2)[0];
/* 98 */                    if (i9 < i10) {
/* 3 */                         return -1;
                            }
                            return i9 == i10 ? 0 : 1;
                        case 27:
/* 85 */                    return iii1OiiIi.I00000oIO(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj).length()));
                        case PoseLandmark.RIGHT_ANKLE:
/* 60 */                    return iii1OiiIi.I00000oIO(Float.valueOf(((Oi10ooi) obj2).I0000Il00O), Float.valueOf(((Oi10ooi) obj).I0000Il00O));
                        default:
/* 11 */                    Rect boundingBox = ((Text.TextBlock) obj).getBoundingBox();
/* 21 */                    Integer numValueOf3 = Integer.valueOf(boundingBox != null ? boundingBox.top : 0);
/* 27 */                    Rect boundingBox2 = ((Text.TextBlock) obj2).getBoundingBox();
/* 39 */                    return iii1OiiIi.I00000oIO(numValueOf3, Integer.valueOf(boundingBox2 != null ? boundingBox2.top : 0));
                    }
                }
            }
