            package p000;

            import android.R;
            import android.graphics.Rect;
            import android.os.Bundle;
            import android.os.SystemClock;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.text.BreakIterator;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public final class I01oIilIolOl extends AccessibilityNodeProvider {
                public I0ll0IlI1lo I00000oIO;

                @Override
                public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
/* 1 */             I0ll0IlI1lo i0ll0IlI1lo = this.I00000oIO;
/* 5 */             I01oII0IOOO i01oII0IOOO = new I01oII0IOOO();
/* 9 */             i01oII0IOOO.I00000oOI = -1;
/* 11 */            i01oII0IOOO.I0000Il00O = -1;
/* 13 */            i01oII0IOOO.I00000oIO = accessibilityNodeInfo;
/* 15 */            VarHandle.storeStoreFence();
/* 20 */            i0ll0IlI1lo.I00ilI0I1.I0000oI00(i, i01oII0IOOO, str, bundle);
                }

                @Override
                public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
/* 3 */             I01oII0IOOO i01oII0IOOOI00OIo = this.I00000oIO.I00OIo(i);
/* 7 */             if (i01oII0IOOOI00OIo == null) {
/* 9 */                 return null;
                    }
/* 11 */            return i01oII0IOOOI00OIo.I00000oIO;
                }

                @Override
                public final List findAccessibilityNodeInfosByText(String str, int i) {
/* 3 */             this.I00000oIO.getClass();
/* 6 */             return null;
                }

                @Override
                public final AccessibilityNodeInfo findFocus(int i) {
                    I01oII0IOOO i01oII0IOOOI00OIo;
/* 1 */             I0ll0IlI1lo i0ll0IlI1lo = this.I00000oIO;
/* 3 */             I0ll1oo i0ll1oo = i0ll0IlI1lo.I00ilI0I1;
/* 7 */             if (i == 1) {
/* 29 */                int i2 = i0ll1oo.I00ll1;
/* 37 */                i01oII0IOOOI00OIo = i2 == Integer.MIN_VALUE ? null : i0ll0IlI1lo.I00OIo(i2);
                    } else {
/* 10 */                if (i != 2) {
/* 25 */                    I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Unknown focus type: "));
/* 6 */                     return null;
                        }
/* 14 */                i01oII0IOOOI00OIo = i0ll0IlI1lo.I00OIo(i0ll1oo.I00li1OI);
                    }
/* 41 */            if (i01oII0IOOOI00OIo == null) {
/* 6 */                 return null;
                    }
/* 44 */            return i01oII0IOOOI00OIo.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:612:0x01ab, code lost:
                
                    r1 = null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:155:0x0259  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x0268  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x026b  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x028a  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0299  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x02b1  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x02c0  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x02d7  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:530:0x0740  */
                /* JADX WARN: Removed duplicated region for block: B:535:0x0753  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean performAction(int i, int i2, Bundle bundle) {
                    Oil000 oil000;
                    int i3;
                    I01loIooI i01loIooI;
                    int iI000lI;
                    int i4;
                    I01lolI0O i01lolI0O;
                    Oo0iil0o0oI oo0iil0o0oII00000oOI;
                    I01loo1IoIl0 i01loo1IoIl0;
                    IllOOo00lI illOOo00lI;
                    IllOOo00lI illOOo00lI2;
                    IllOOo00lI illOOo00lI3;
                    IllOOo00lI illOOo00lI4;
                    IllOOo00lI illOOo00lI5;
                    IllOOo00lI illOOo00lI6;
                    IllOOo00lI illOOo00lI7;
                    IllOOo00lI illOOo00lI8;
                    IllOOo00lI illOOo00lI9;
                    Function1 function1;
                    I01lOOlO0o i01lOOlO0o;
                    long jI00Iooi00oi;
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    long jFloatToRawIntBits;
                    long jFloatToRawIntBits2;
                    Function1 function12;
                    IllOOo00lI illOOo00lI10;
                    float f5;
                    float f6;
                    I01lOOlO0o i01lOOlO0o2;
                    IllOOo00lI illOOo00lI11;
                    I01lOOlO0o i01lOOlO0o3;
                    IllOOo00lI illOOo00lI12;
                    Function1 function13;
                    IllOOo00lI illOOo00lI13;
                    IllOOo00lI illOOo00lI14;
                    IllOOo00lI illOOo00lI15;
                    IllOOo00lI illOOo00lI16;
/* 11 */            I0ll1oo i0ll1oo = this.I00000oIO.I00ilI0I1;
/* 13 */            AccessibilityManager accessibilityManager = i0ll1oo.I00io1l;
/* 16 */            Float fValueOf = Float.valueOf(0.0f);
/* 20 */            I0lio1O01i01 i0lio1O01i01 = i0ll1oo.I00iio;
/* 30 */            Oil00l oil00l = (Oil00l) i0ll1oo.I000o00OoI0I().I00000oOI(i);
/* 32 */            if (oil00l == null || (oil000 = oil00l.I00000oIO) == null) {
/* 38 */                return false;
                    }
/* 42 */            O0iiOioolIi o0iiOioolIi = oil000.I0000Il00O;
/* 44 */            int i5 = oil000.I0001Ioi1lo;
/* 46 */            OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 48 */            OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 52 */            Object objI000II = oI10I1IoI0Ol.I000II(Oil0I1O.I000oI1ioi);
/* 56 */            if (objI000II == null) {
/* 58 */                objI000II = null;
                    }
/* 61 */            Boolean bool = Boolean.TRUE;
/* 67 */            if (O0000Ioio00.I0000O(objI000II, bool) && !accessibilityManager.isRequestFromAccessibilityTool()) {
/* 38 */                return false;
                    }
/* 79 */            if (i2 == 64) {
/* 2154 */              if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = i0ll1oo.I00li1OI) == i) {
/* 38 */                    return false;
                        }
/* 2170 */              if (i3 != Integer.MIN_VALUE) {
/* 2172 */                  I0ll1oo.I001lIiIIo1O(i0ll1oo, i3, 65536, null, 12);
                        }
/* 2175 */              i0ll1oo.I00li1OI = i;
/* 2177 */              i0lio1O01i01.invalidate();
/* 2183 */              I0ll1oo.I001lIiIIo1O(i0ll1oo, i, 32768, null, 12);
/* 78 */                return true;
                    }
/* 83 */            if (i2 == 128) {
/* 2125 */              if (i0ll1oo.I00li1OI != i) {
/* 38 */                    return false;
                        }
/* 2129 */              i0ll1oo.I00li1OI = Integer.MIN_VALUE;
/* 2132 */              i0ll1oo.I00lli11 = null;
/* 2134 */              i0lio1O01i01.invalidate();
/* 2141 */              I0ll1oo.I001lIiIIo1O(i0ll1oo, i, 65536, null, 12);
/* 78 */                return true;
                    }
/* 85 */            int i6 = Barcode.FORMAT_UPC_A;
/* 90 */            if (i2 == 256 || i2 == 512) {
/* 1776 */              if (bundle == null) {
/* 38 */                    return false;
                        }
/* 1780 */              int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
/* 1786 */              boolean z = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
/* 1794 */              boolean z2 = i2 == 256;
/* 1795 */              Integer num = i0ll1oo.I00oO101o;
/* 1797 */              if (num == null || i5 != num.intValue()) {
/* 1806 */                  i0ll1oo.I00oIiI10 = -1;
/* 1812 */                  i0ll1oo.I00oO101o = Integer.valueOf(i5);
                        }
/* 1814 */              String strI000oI1ioi = I0ll1oo.I000oI1ioi(oil000);
/* 1818 */              if (strI000oI1ioi == null || strI000oI1ioi.length() == 0) {
/* 38 */                    return false;
                        }
/* 1828 */              String strI000oI1ioi2 = I0ll1oo.I000oI1ioi(oil000);
/* 1832 */              if (strI000oI1ioi2 == null || strI000oI1ioi2.length() == 0) {
/* 1857 */                  i01loIooI = null;
                        } else {
/* 1841 */                  if (i7 == 1) {
/* 1985 */                      Locale locale = i0lio1O01i01.getContext().getResources().getConfiguration().locale;
/* 1987 */                      i01lolI0O = I01lolI0O.I0000oI00;
/* 1989 */                      if (i01lolI0O == null) {
/* 1994 */                          i01lolI0O = new I01lolI0O(0);
/* 2001 */                          i01lolI0O.I0000O = BreakIterator.getCharacterInstance(locale);
/* 2003 */                          I01lolI0O.I0000oI00 = i01lolI0O;
                                }
/* 2005 */                      i01lolI0O.I001l0I00(strI000oI1ioi2);
                            } else if (i7 == 2) {
/* 1949 */                      Locale locale2 = i0lio1O01i01.getContext().getResources().getConfiguration().locale;
/* 1951 */                      i01lolI0O = I01lolI0O.I0001Ioi1lo;
/* 1953 */                      if (i01lolI0O == null) {
/* 1957 */                          i01lolI0O = new I01lolI0O(1);
/* 1964 */                          i01lolI0O.I0000O = BreakIterator.getWordInstance(locale2);
/* 1966 */                          I01lolI0O.I0001Ioi1lo = i01lolI0O;
                                }
/* 1968 */                      i01lolI0O.I001l0I00(strI000oI1ioi2);
                            } else if (i7 == 4) {
/* 1882 */                      if (oI10I1IoI0Ol.I0000Il00O(Oiioi1IoIIli.I00000oIO) && (oo0iil0o0oII00000oOI = lO1i1O.I00000oOI(oiioiIIlooo)) != null) {
/* 1892 */                          if (i7 == 4) {
/* 1894 */                              I01loo1IoIl0 i01loo1IoIl02 = I01loo1IoIl0.I0000O;
/* 1896 */                              if (i01loo1IoIl02 == null) {
/* 1901 */                                  I01loo1IoIl0 i01loo1IoIl03 = new I01loo1IoIl0(0);
/* 1904 */                                  I01loo1IoIl0.I0000O = i01loo1IoIl03;
                                            i01loo1IoIl0 = i01loo1IoIl03;
                                        } else {
                                            i01loo1IoIl0 = i01loo1IoIl02;
                                        }
/* 1908 */                              i01loo1IoIl0.I00000oIO = strI000oI1ioi2;
/* 1910 */                              i01loo1IoIl0.I0000Il00O = oo0iil0o0oII00000oOI;
                                        i01loIooI = i01loo1IoIl0;
                                    } else {
/* 1914 */                              I01o00iOi i01o00iOi = I01o00iOi.I0000oI00;
                                        I01o00iOi i01o00iOi2 = i01o00iOi;
/* 1916 */                              if (i01o00iOi == null) {
/* 1920 */                                  I01o00iOi i01o00iOi3 = new I01o00iOi(0);
/* 1925 */                                  new Rect();
/* 1928 */                                  I01o00iOi.I0000oI00 = i01o00iOi3;
                                            i01o00iOi2 = i01o00iOi3;
                                        }
/* 1930 */                              i01o00iOi2.I00000oIO = strI000oI1ioi2;
/* 1932 */                              i01o00iOi2.I0000Il00O = oo0iil0o0oII00000oOI;
/* 1934 */                              i01o00iOi2.I0000O = oil000;
                                        i01loIooI = i01o00iOi2;
                                    }
                                }
                            } else if (i7 == 8) {
/* 1860 */                      I01o01 i01o01 = I01o01.I0000Il00O;
                                I01o01 i01o012 = i01o01;
/* 1862 */                      if (i01o01 == null) {
/* 1867 */                          I01o01 i01o013 = new I01o01(0);
/* 1870 */                          I01o01.I0000Il00O = i01o013;
                                    i01o012 = i01o013;
                                }
/* 1872 */                      i01o012.I00000oIO = strI000oI1ioi2;
                                i01loIooI = i01o012;
                            } else if (i7 != 16) {
                            }
/* 1971 */                  i01loIooI = i01lolI0O;
                        }
/* 2009 */              if (i01loIooI == null) {
/* 38 */                    return false;
                        }
/* 2013 */              int iI000l1 = i0ll1oo.I000l1(oil000);
/* 2017 */              if (iI000l1 == -1) {
/* 2023 */                  iI000l1 = z2 ? 0 : strI000oI1ioi.length();
                        }
/* 2035 */              int[] iArrI000iOII = z2 ? i01loIooI.I000iOII(iI000l1) : i01loIooI.I001i1lo1io(iI000l1);
/* 2039 */              if (iArrI000iOII == null) {
/* 38 */                    return false;
                        }
/* 2045 */              int i8 = iArrI000iOII[0];
/* 2047 */              int i9 = iArrI000iOII[1];
/* 2049 */              if (z && !oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I00000oIO) && oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I00IO1oi11O)) {
/* 2067 */                  iI000lI = i0ll1oo.I000lI(oil000);
/* 2071 */                  if (iI000lI == -1) {
/* 2077 */                      iI000lI = z2 ? i8 : i9;
                            }
/* 2082 */                  i4 = z2 ? i9 : i8;
                        } else {
/* 2088 */                  iI000lI = z2 ? i9 : i8;
/* 2089 */                  i4 = iI000lI;
                        }
/* 2090 */              if (z2) {
/* 2092 */                  i6 = 256;
                        }
/* 2095 */              long jUptimeMillis = SystemClock.uptimeMillis();
/* 2099 */              I0ll0oIl i0ll0oIl = new I0ll0oIl();
/* 2102 */              i0ll0oIl.I00000oIO = oil000;
/* 2104 */              i0ll0oIl.I00000oOI = i6;
/* 2106 */              i0ll0oIl.I0000Il00O = i7;
/* 2108 */              i0ll0oIl.I0000O = i8;
/* 2110 */              i0ll0oIl.I0000oI00 = i9;
/* 2112 */              i0ll0oIl.I0001Ioi1lo = jUptimeMillis;
/* 2114 */              VarHandle.storeStoreFence();
/* 2117 */              i0ll1oo.I00oli = i0ll0oIl;
/* 2119 */              i0ll1oo.I00IO1oi11O(oil000, iI000lI, i4, true);
/* 78 */                return true;
                    }
/* 96 */            if (i2 == 16384) {
/* 1746 */              Object objI000II2 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I00100o1O0lo);
/* 1755 */              I01lOOlO0o i01lOOlO0o4 = (I01lOOlO0o) (objI000II2 == null ? null : objI000II2);
/* 1757 */              if (i01lOOlO0o4 == null || (illOOo00lI = (IllOOo00lI) i01lOOlO0o4.I00000oOI) == null) {
/* 38 */                    return false;
                        }
/* 1771 */              return ((Boolean) illOOo00lI.invoke()).booleanValue();
                    }
/* 100 */           if (i2 == 131072) {
/* 1727 */              boolean zI00IO1oi11O = i0ll1oo.I00IO1oi11O(oil000, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
/* 1731 */              if (zI00IO1oi11O) {
/* 1740 */                  I0ll1oo.I001lIiIIo1O(i0ll1oo, i0ll1oo.I001i1O0Ol(i5), 0, null, 12);
                        }
/* 1743 */              return zI00IO1oi11O;
                    }
/* 106 */           if (!iOIl0OoO.I00000oIO(oil000)) {
/* 38 */                return false;
                    }
/* 109 */           if (i2 == 1) {
/* 1671 */              if (i0lio1O01i01.isInTouchMode()) {
/* 1673 */                  i0lio1O01i01.requestFocusFromTouch();
                        }
/* 1678 */              Object objI000II3 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001i1O0Ol);
/* 1687 */              I01lOOlO0o i01lOOlO0o5 = (I01lOOlO0o) (objI000II3 == null ? null : objI000II3);
/* 1689 */              if (i01lOOlO0o5 == null || (illOOo00lI2 = (IllOOo00lI) i01lOOlO0o5.I00000oOI) == null) {
/* 38 */                    return false;
                        }
/* 1703 */              return ((Boolean) illOOo00lI2.invoke()).booleanValue();
                    }
/* 112 */           if (i2 == 2) {
/* 1641 */              Object objI000II4 = oI10I1IoI0Ol.I000II(Oil0I1O.I000l1);
/* 1645 */              if (objI000II4 == null) {
/* 1647 */                  objI000II4 = null;
                        }
/* 1652 */              if (!O0000Ioio00.I0000O(objI000II4, bool)) {
/* 38 */                    return false;
                        }
/* 1663 */              ((Ili1ioOlo0oO) i0lio1O01i01.getFocusOwner()).I0000Il00O(8, false, true);
/* 78 */                return true;
                    }
                    switch (i2) {
                        case 16:
/* 1597 */                  Object objI000II5 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I00000oOI);
/* 1601 */                  if (objI000II5 == null) {
/* 1603 */                      objI000II5 = null;
                            }
/* 1604 */                  I01lOOlO0o i01lOOlO0o6 = (I01lOOlO0o) objI000II5;
/* 1626 */                  Boolean bool2 = (i01lOOlO0o6 == null || (illOOo00lI3 = (IllOOo00lI) i01lOOlO0o6.I00000oOI) == null) ? null : (Boolean) illOOo00lI3.invoke();
/* 1629 */                  I0ll1oo.I001lIiIIo1O(i0ll1oo, i, 1, null, 12);
/* 1632 */                  if (bool2 != null) {
/* 1634 */                      return bool2.booleanValue();
                            }
/* 38 */                    return false;
                        case 32:
/* 1565 */                  Object objI000II6 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I0000Il00O);
/* 1574 */                  I01lOOlO0o i01lOOlO0o7 = (I01lOOlO0o) (objI000II6 == null ? null : objI000II6);
/* 1576 */                  if (i01lOOlO0o7 == null || (illOOo00lI4 = (IllOOo00lI) i01lOOlO0o7.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 1590 */                  return ((Boolean) illOOo00lI4.invoke()).booleanValue();
                        case Barcode.FORMAT_AZTEC:
                        case 8192:
                            break;
                        case 32768:
/* 1039 */                  Object objI000II7 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I0010o);
/* 1048 */                  I01lOOlO0o i01lOOlO0o8 = (I01lOOlO0o) (objI000II7 == null ? null : objI000II7);
/* 1050 */                  if (i01lOOlO0o8 == null || (illOOo00lI5 = (IllOOo00lI) i01lOOlO0o8.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 1064 */                  return ((Boolean) illOOo00lI5.invoke()).booleanValue();
                        case 65536:
/* 1007 */                  Object objI000II8 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I0010I0i);
/* 1016 */                  I01lOOlO0o i01lOOlO0o9 = (I01lOOlO0o) (objI000II8 == null ? null : objI000II8);
/* 1018 */                  if (i01lOOlO0o9 == null || (illOOo00lI6 = (IllOOo00lI) i01lOOlO0o9.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 1032 */                  return ((Boolean) illOOo00lI6.invoke()).booleanValue();
                        case 262144:
/* 975 */                   Object objI000II9 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I00111O);
/* 984 */                   I01lOOlO0o i01lOOlO0o10 = (I01lOOlO0o) (objI000II9 == null ? null : objI000II9);
/* 986 */                   if (i01lOOlO0o10 == null || (illOOo00lI7 = (IllOOo00lI) i01lOOlO0o10.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 1000 */                  return ((Boolean) illOOo00lI7.invoke()).booleanValue();
                        case 524288:
/* 943 */                   Object objI000II10 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001IIilI0O);
/* 952 */                   I01lOOlO0o i01lOOlO0o11 = (I01lOOlO0o) (objI000II10 == null ? null : objI000II10);
/* 954 */                   if (i01lOOlO0o11 == null || (illOOo00lI8 = (IllOOo00lI) i01lOOlO0o11.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 968 */                   return ((Boolean) illOOo00lI8.invoke()).booleanValue();
                        case 1048576:
/* 911 */                   Object objI000II11 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001IO000);
/* 920 */                   I01lOOlO0o i01lOOlO0o12 = (I01lOOlO0o) (objI000II11 == null ? null : objI000II11);
/* 922 */                   if (i01lOOlO0o12 == null || (illOOo00lI9 = (IllOOo00lI) i01lOOlO0o12.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 936 */                   return ((Boolean) illOOo00lI9.invoke()).booleanValue();
                        case 2097152:
/* 867 */                   String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
/* 870 */                   Object objI000II12 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000iOII);
/* 879 */                   I01lOOlO0o i01lOOlO0o13 = (I01lOOlO0o) (objI000II12 == null ? null : objI000II12);
/* 881 */                   if (i01lOOlO0o13 == null || (function1 = (Function1) i01lOOlO0o13.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 891 */                   if (string == null) {
/* 893 */                       string = "";
                            }
/* 904 */                   return ((Boolean) function1.invoke(new I1111OO10i(string))).booleanValue();
                        case R.id.accessibilityActionShowOnScreen:
/* 405 */                   Oil000 oil000I000l1 = oil000.I000l1();
/* 409 */                   if (oil000I000l1 != null) {
/* 417 */                       Object objI000II13 = oil000I000l1.I0000O.I00iOIl.I000II(Oiioi1IoIIli.I0000O);
/* 421 */                       if (objI000II13 == null) {
/* 423 */                           objI000II13 = null;
                                }
/* 424 */                       i01lOOlO0o = (I01lOOlO0o) objI000II13;
/* 428 */                       while (i01lOOlO0o == null && oil000I000l1 != null) {
/* 432 */                           oil000I000l1 = oil000I000l1.I000l1();
/* 436 */                           if (oil000I000l1 != null) {
/* 444 */                               Object objI000II14 = oil000I000l1.I0000O.I00iOIl.I000II(Oiioi1IoIIli.I0000O);
/* 448 */                               if (objI000II14 == null) {
/* 450 */                                   objI000II14 = null;
                                        }
/* 451 */                               i01lOOlO0o = (I01lOOlO0o) objI000II14;
                                    }
                                }
/* 454 */                       if (oil000I000l1 == null) {
/* 456 */                           OOo0IO oOo0IOI000II = oil000.I000II();
/* 507 */                           return i0lio1O01i01.requestRectangleOnScreen(new Rect((int) Math.floor(oOo0IOI000II.I00000oIO), (int) Math.floor(oOo0IOI000II.I00000oOI), O1OooO0IlOo.I000II((float) Math.ceil(oOo0IOI000II.I0000Il00O)), O1OooO0IlOo.I000II((float) Math.ceil(oOo0IOI000II.I0000O))));
                                }
/* 514 */                       long jI0001Ioi1lo = 0;
/* 515 */                       boolean z3 = false;
/* 516 */                       while (oil000I000l1 != null) {
/* 518 */                           O0iiOioolIi o0iiOioolIi2 = oil000I000l1.I0000Il00O;
/* 522 */                           OI10I1IoI0Ol oI10I1IoI0Ol2 = oil000I000l1.I0000O.I00iOIl;
/* 526 */                           Object objI000II15 = oI10I1IoI0Ol2.I000II(Oiioi1IoIIli.I0000O);
/* 530 */                           if (objI000II15 == null) {
/* 532 */                               objI000II15 = null;
                                    }
/* 533 */                           I01lOOlO0o i01lOOlO0o14 = (I01lOOlO0o) objI000II15;
/* 535 */                           if (i01lOOlO0o14 != null) {
/* 543 */                               OOo0IO oOo0IOI00000oIO = l0o0IlOil1.I00000oIO((Iollol0oI) o0iiOioolIi2.I010101Oo1lO.I00iio);
/* 553 */                               O0iOOo0Ii o0iOOo0IiI00II0oii1o = ((Iollol0oI) o0iiOioolIi2.I010101Oo1lO.I00iio).I00II0oii1o();
/* 575 */                               OOo0IO oOo0IOI000OiO = oOo0IOI00000oIO.I000OiO(o0iOOo0IiI00II0oii1o != null ? ((OIIlIII0Ili) o0iOOo0IiI00II0oii1o).I00Iooi00oi(0L) : 0L);
/* 579 */                               OIIlIII0Ili oIIlIII0IliI0000O = oil000.I0000O();
/* 583 */                               if (oIIlIII0IliI0000O == null) {
/* 602 */                                   jI00Iooi00oi = 0;
/* 603 */                                   long jI000II = OIOlIiiioi.I000II(jI00Iooi00oi, jI0001Ioi1lo);
/* 607 */                                   OIIlIII0Ili oIIlIII0IliI0000O2 = oil000.I0000O();
/* 611 */                                   long j = jI0001Ioi1lo;
/* 625 */                                   OOo0IO oOo0IOI00000oIO2 = lIl0looO.I00000oIO(jI000II, l000O1l.I00000oOI(oIIlIII0IliI0000O2 == null ? oIIlIII0IliI0000O2.I00iiO : 0L));
/* 633 */                                   f = oOo0IOI00000oIO2.I00000oIO - oOo0IOI000OiO.I00000oIO;
/* 638 */                                   f2 = oOo0IOI00000oIO2.I0000Il00O - oOo0IOI000OiO.I0000Il00O;
/* 649 */                                   if (Math.signum(f) == Math.signum(f2)) {
/* 666 */                                       f = 0.0f;
                                            } else if (Math.abs(f) >= Math.abs(f2)) {
/* 664 */                                       f = f2;
                                            }
/* 672 */                                   f3 = oOo0IOI00000oIO2.I00000oOI - oOo0IOI000OiO.I00000oOI;
/* 677 */                                   f4 = oOo0IOI00000oIO2.I0000O - oOo0IOI000OiO.I0000O;
/* 688 */                                   if (Math.signum(f3) == Math.signum(f4)) {
/* 705 */                                       f3 = 0.0f;
                                            } else if (Math.abs(f3) >= Math.abs(f4)) {
/* 703 */                                       f3 = f4;
                                            }
/* 721 */                                   jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
/* 726 */                                   if (OIOlIiiioi.I0000O(jFloatToRawIntBits, 0L)) {
/* 733 */                                       float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
/* 740 */                                       float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
/* 746 */                                       Object objI000II16 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001IO000);
/* 750 */                                       if (objI000II16 == null) {
/* 752 */                                           objI000II16 = null;
                                                }
/* 759 */                                       if (o0iiOioolIi.I00oo1iO0ll == O0iOOoiioO.I00iiI) {
/* 761 */                                           fIntBitsToFloat = -fIntBitsToFloat;
                                                }
/* 764 */                                       Object objI000II17 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001i1O0Ol);
/* 768 */                                       if (objI000II17 == null) {
/* 770 */                                           objI000II17 = null;
                                                }
/* 787 */                                       jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                                            } else {
/* 728 */                                       jFloatToRawIntBits2 = jFloatToRawIntBits;
                                            }
/* 790 */                                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) i01lOOlO0o14.I00000oOI;
/* 835 */                                   z3 = (illiIl1l11O == null && ((Boolean) illiIl1l11O.invoke(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z3;
/* 837 */                                   jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j, jFloatToRawIntBits);
                                        } else {
/* 591 */                                   if (!oIIlIII0IliI0000O.I0110OiO().I00lll10) {
/* 594 */                                       oIIlIII0IliI0000O = null;
                                            }
/* 595 */                                   if (oIIlIII0IliI0000O != null) {
/* 597 */                                       jI00Iooi00oi = oIIlIII0IliI0000O.I00Iooi00oi(0L);
                                            }
/* 603 */                                   long jI000II2 = OIOlIiiioi.I000II(jI00Iooi00oi, jI0001Ioi1lo);
/* 607 */                                   OIIlIII0Ili oIIlIII0IliI0000O22 = oil000.I0000O();
/* 611 */                                   long j2 = jI0001Ioi1lo;
/* 625 */                                   OOo0IO oOo0IOI00000oIO22 = lIl0looO.I00000oIO(jI000II2, l000O1l.I00000oOI(oIIlIII0IliI0000O22 == null ? oIIlIII0IliI0000O22.I00iiO : 0L));
/* 633 */                                   f = oOo0IOI00000oIO22.I00000oIO - oOo0IOI000OiO.I00000oIO;
/* 638 */                                   f2 = oOo0IOI00000oIO22.I0000Il00O - oOo0IOI000OiO.I0000Il00O;
/* 649 */                                   if (Math.signum(f) == Math.signum(f2)) {
                                            }
/* 672 */                                   f3 = oOo0IOI00000oIO22.I00000oOI - oOo0IOI000OiO.I00000oOI;
/* 677 */                                   f4 = oOo0IOI00000oIO22.I0000O - oOo0IOI000OiO.I0000O;
/* 688 */                                   if (Math.signum(f3) == Math.signum(f4)) {
                                            }
/* 721 */                                   jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
/* 726 */                                   if (OIOlIiiioi.I0000O(jFloatToRawIntBits, 0L)) {
                                            }
/* 790 */                                   IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) i01lOOlO0o14.I00000oOI;
/* 835 */                                   if (illiIl1l11O2 == null) {
/* 837 */                                       jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j2, jFloatToRawIntBits);
                                            } else {
/* 837 */                                       jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j2, jFloatToRawIntBits);
                                            }
                                        }
                                    } else {
/* 850 */                               jI0001Ioi1lo = jI0001Ioi1lo;
                                    }
/* 851 */                           oil000I000l1 = oil000I000l1.I000l1();
                                }
/* 857 */                       return z3;
                            }
/* 427 */                   i01lOOlO0o = null;
                            break;
                        case R.id.accessibilityActionSetProgress:
/* 353 */                   if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
/* 38 */                        return false;
                            }
/* 367 */                   Object objI000II18 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000OOo1O);
/* 376 */                   I01lOOlO0o i01lOOlO0o15 = (I01lOOlO0o) (objI000II18 == null ? null : objI000II18);
/* 378 */                   if (i01lOOlO0o15 == null || (function12 = (Function1) i01lOOlO0o15.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 400 */                   return ((Boolean) function12.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                        case R.id.accessibilityActionImeEnter:
/* 323 */                   Object objI000II19 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I00100l0);
/* 332 */                   I01lOOlO0o i01lOOlO0o16 = (I01lOOlO0o) (objI000II19 == null ? null : objI000II19);
/* 334 */                   if (i01lOOlO0o16 == null || (illOOo00lI10 = (IllOOo00lI) i01lOOlO0o16.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 348 */                   return ((Boolean) illOOo00lI10.invoke()).booleanValue();
                        default:
                            switch (i2) {
                                case R.id.accessibilityActionScrollUp:
                                case R.id.accessibilityActionScrollLeft:
                                case R.id.accessibilityActionScrollDown:
                                case R.id.accessibilityActionScrollRight:
                                    break;
                                default:
                                    switch (i2) {
                                        case R.id.accessibilityActionPageUp:
/* 282 */                                   Object objI000II20 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001iOo1i0O);
/* 291 */                                   I01lOOlO0o i01lOOlO0o17 = (I01lOOlO0o) (objI000II20 == null ? null : objI000II20);
/* 293 */                                   if (i01lOOlO0o17 == null || (illOOo00lI13 = (IllOOo00lI) i01lOOlO0o17.I00000oOI) == null) {
/* 38 */                                        return false;
                                            }
/* 307 */                                   return ((Boolean) illOOo00lI13.invoke()).booleanValue();
                                        case R.id.accessibilityActionPageDown:
/* 250 */                                   Object objI000II21 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001lIiIIo1O);
/* 259 */                                   I01lOOlO0o i01lOOlO0o18 = (I01lOOlO0o) (objI000II21 == null ? null : objI000II21);
/* 261 */                                   if (i01lOOlO0o18 == null || (illOOo00lI14 = (IllOOo00lI) i01lOOlO0o18.I00000oOI) == null) {
/* 38 */                                        return false;
                                            }
/* 275 */                                   return ((Boolean) illOOo00lI14.invoke()).booleanValue();
                                        case R.id.accessibilityActionPageLeft:
/* 218 */                                   Object objI000II22 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001l0I00);
/* 227 */                                   I01lOOlO0o i01lOOlO0o19 = (I01lOOlO0o) (objI000II22 == null ? null : objI000II22);
/* 229 */                                   if (i01lOOlO0o19 == null || (illOOo00lI15 = (IllOOo00lI) i01lOOlO0o19.I00000oOI) == null) {
/* 38 */                                        return false;
                                            }
/* 243 */                                   return ((Boolean) illOOo00lI15.invoke()).booleanValue();
                                        case R.id.accessibilityActionPageRight:
/* 186 */                                   Object objI000II23 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001lllioOl);
/* 195 */                                   I01lOOlO0o i01lOOlO0o20 = (I01lOOlO0o) (objI000II23 == null ? null : objI000II23);
/* 197 */                                   if (i01lOOlO0o20 == null || (illOOo00lI16 = (IllOOo00lI) i01lOOlO0o20.I00000oOI) == null) {
/* 38 */                                        return false;
                                            }
/* 211 */                                   return ((Boolean) illOOo00lI16.invoke()).booleanValue();
                                        default:
/* 123 */                                   OlIIioolI olIIioolI = i0ll1oo.I00oI0i;
/* 125 */                                   olIIioolI.getClass();
/* 132 */                                   OlIIioolI olIIioolI2 = (OlIIioolI) iO10Oii01l.I00000oIO(olIIioolI, i);
/* 134 */                                   if (olIIioolI2 == null || ((CharSequence) iO10Oii01l.I00000oIO(olIIioolI2, i2)) == null) {
/* 38 */                                        return false;
                                            }
/* 147 */                                   Object objI000II24 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001i1lo1io);
/* 156 */                                   List list = (List) (objI000II24 == null ? null : objI000II24);
/* 158 */                                   if (list == null || list.size() <= 0) {
/* 38 */                                        return false;
                                            }
/* 177 */                                   list.get(0).getClass();
/* 180 */                                   OIiilo1Ool0o.I00000oIO();
/* 172 */                                   return false;
                                    }
                            }
                    }
/* 1075 */          boolean z4 = i2 == 4096;
/* 1082 */          boolean z5 = i2 == 8192;
/* 1090 */          boolean z6 = i2 == 16908345;
/* 1098 */          boolean z7 = i2 == 16908347;
/* 1106 */          boolean z8 = i2 == 16908344;
/* 1114 */          boolean z9 = i2 == 16908346;
/* 1126 */          boolean z10 = z6 || z7 || z4 || z5;
/* 1138 */          boolean z11 = z8 || z9 || z4 || z5;
/* 1139 */          if (z4 || z5) {
/* 1145 */              Object objI000II25 = oI10I1IoI0Ol.I000II(Oil0I1O.I0000Il00O);
/* 1149 */              if (objI000II25 == null) {
/* 1151 */                  objI000II25 = null;
                        }
/* 1152 */              OOO01oo oOO01oo = (OOO01oo) objI000II25;
/* 1156 */              Object objI000II26 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000OOo1O);
/* 1160 */              if (objI000II26 == null) {
/* 1162 */                  objI000II26 = null;
                        }
/* 1163 */              I01lOOlO0o i01lOOlO0o21 = (I01lOOlO0o) objI000II26;
/* 1165 */              if (oOO01oo != null) {
/* 1167 */                  IOO1O00oI iOO1O00oI = oOO01oo.I00000oOI;
/* 1169 */                  if (i01lOOlO0o21 != null) {
/* 1171 */                      float f7 = iOO1O00oI.I00000oOI;
/* 1173 */                      float f8 = iOO1O00oI.I00000oIO;
/* 1181 */                      float f9 = f7 < f8 ? f8 : f7;
/* 1184 */                      if (f8 <= f7) {
/* 1187 */                          f7 = f8;
                                }
/* 1188 */                      int i10 = oOO01oo.I0000Il00O;
/* 1190 */                      if (i10 > 0) {
/* 1192 */                          f5 = f9 - f7;
/* 1193 */                          f6 = i10 + 1;
                                } else {
/* 1197 */                          f5 = f9 - f7;
/* 1198 */                          f6 = 20.0f;
                                }
/* 1195 */                      float f10 = f5 / f6;
/* 1201 */                      if (z5) {
/* 1203 */                          f10 = -f10;
                                }
/* 1206 */                      Function1 function14 = (Function1) i01lOOlO0o21.I00000oOI;
/* 1208 */                      if (function14 != null) {
/* 1223 */                          return ((Boolean) function14.invoke(Float.valueOf(oOO01oo.I00000oIO + f10))).booleanValue();
                                }
/* 38 */                        return false;
                            }
                        }
                    }
/* 1238 */          long jI0000O = l0o0IlOil1.I00000oIO((Iollol0oI) o0iiOioolIi.I010101Oo1lO.I00iio).I0000O();
/* 1244 */          ArrayList arrayList = new ArrayList();
/* 1249 */          Object objI000II27 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001lloI);
/* 1253 */          if (objI000II27 == null) {
/* 1255 */              objI000II27 = null;
                    }
/* 1256 */          I01lOOlO0o i01lOOlO0o22 = (I01lOOlO0o) objI000II27;
/* 1286 */          Float f11 = (i01lOOlO0o22 == null || (function13 = (Function1) i01lOOlO0o22.I00000oOI) == null || !((Boolean) function13.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
/* 1289 */          Object objI000II28 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I0000O);
/* 1293 */          if (objI000II28 == null) {
/* 1295 */              objI000II28 = null;
                    }
/* 1296 */          I01lOOlO0o i01lOOlO0o23 = (I01lOOlO0o) objI000II28;
/* 1298 */          if (i01lOOlO0o23 == null) {
/* 38 */                return false;
                    }
/* 1302 */          IlliIlI illiIlI = i01lOOlO0o23.I00000oOI;
/* 1306 */          Object objI000II29 = oI10I1IoI0Ol.I000II(Oil0I1O.I001IO000);
/* 1310 */          if (objI000II29 == null) {
/* 1312 */              objI000II29 = null;
                    }
/* 1313 */          OiOi0l oiOi0l = (OiOi0l) objI000II29;
/* 1315 */          if (oiOi0l != null && z10) {
/* 1329 */              float fFloatValue = f11 != null ? f11.floatValue() : Float.intBitsToFloat((int) (jI0000O >> 32));
/* 1333 */              if (z6 || z5) {
/* 1337 */                  fFloatValue = -fFloatValue;
                        }
/* 1342 */              if (o0iiOioolIi.I00oo1iO0ll == O0iOOoiioO.I00iiI && (z6 || z7)) {
/* 1348 */                  fFloatValue = -fFloatValue;
                        }
/* 1353 */              if (I0ll1oo.I0010o(oiOi0l, fFloatValue)) {
/* 1355 */                  Oil0IoooOio oil0IoooOio = Oiioi1IoIIli.I001l0I00;
/* 1361 */                  if (!oI10I1IoI0Ol.I0000Il00O(oil0IoooOio) && !oI10I1IoI0Ol.I0000Il00O(Oiioi1IoIIli.I001lllioOl)) {
/* 1372 */                      IlliIl1l11O illiIl1l11O3 = (IlliIl1l11O) illiIlI;
/* 1374 */                      if (illiIl1l11O3 != null) {
/* 1386 */                          return ((Boolean) illiIl1l11O3.invoke(Float.valueOf(fFloatValue), fValueOf)).booleanValue();
                                }
/* 38 */                        return false;
                            }
/* 1393 */                  if (fFloatValue > 0.0f) {
/* 1397 */                      Object objI000II30 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001lllioOl);
/* 1406 */                      i01lOOlO0o3 = (I01lOOlO0o) (objI000II30 == null ? null : objI000II30);
                            } else {
/* 1409 */                      Object objI000II31 = oI10I1IoI0Ol.I000II(oil0IoooOio);
/* 1418 */                      i01lOOlO0o3 = (I01lOOlO0o) (objI000II31 == null ? null : objI000II31);
                            }
/* 1420 */                  if (i01lOOlO0o3 == null || (illOOo00lI12 = (IllOOo00lI) i01lOOlO0o3.I00000oOI) == null) {
/* 38 */                        return false;
                            }
/* 1434 */                  return ((Boolean) illOOo00lI12.invoke()).booleanValue();
                        }
                    }
/* 1441 */          Object objI000II32 = oI10I1IoI0Ol.I000II(Oil0I1O.I001i1O0Ol);
/* 1445 */          if (objI000II32 == null) {
/* 1447 */              objI000II32 = null;
                    }
/* 1448 */          OiOi0l oiOi0l2 = (OiOi0l) objI000II32;
/* 1450 */          if (oiOi0l2 == null || !z11) {
/* 38 */                return false;
                    }
/* 1464 */          float fFloatValue2 = f11 != null ? f11.floatValue() : Float.intBitsToFloat((int) (jI0000O & 4294967295L));
/* 1468 */          if (z8 || z5) {
/* 1472 */              fFloatValue2 = -fFloatValue2;
                    }
/* 1477 */          if (!I0ll1oo.I0010o(oiOi0l2, fFloatValue2)) {
/* 38 */                return false;
                    }
/* 1479 */          Oil0IoooOio oil0IoooOio2 = Oiioi1IoIIli.I001iOo1i0O;
/* 1485 */          if (!oI10I1IoI0Ol.I0000Il00O(oil0IoooOio2) && !oI10I1IoI0Ol.I0000Il00O(Oiioi1IoIIli.I001lIiIIo1O)) {
/* 1496 */              IlliIl1l11O illiIl1l11O4 = (IlliIl1l11O) illiIlI;
/* 1498 */              if (illiIl1l11O4 != null) {
/* 1510 */                  return ((Boolean) illiIl1l11O4.invoke(fValueOf, Float.valueOf(fFloatValue2))).booleanValue();
                        }
/* 38 */                return false;
                    }
/* 1517 */          if (fFloatValue2 > 0.0f) {
/* 1521 */              Object objI000II33 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I001lIiIIo1O);
/* 1530 */              i01lOOlO0o2 = (I01lOOlO0o) (objI000II33 == null ? null : objI000II33);
                    } else {
/* 1533 */              Object objI000II34 = oI10I1IoI0Ol.I000II(oil0IoooOio2);
/* 1542 */              i01lOOlO0o2 = (I01lOOlO0o) (objI000II34 == null ? null : objI000II34);
                    }
/* 1544 */          if (i01lOOlO0o2 == null || (illOOo00lI11 = (IllOOo00lI) i01lOOlO0o2.I00000oOI) == null) {
/* 38 */                return false;
                    }
/* 1558 */          return ((Boolean) illOOo00lI11.invoke()).booleanValue();
                }
            }
