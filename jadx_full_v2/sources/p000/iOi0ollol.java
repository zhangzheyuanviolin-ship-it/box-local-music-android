            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class iOi0ollol {
                /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
/* 4 */             iloI0lOlll1.I00i0O(380139498);
/* 9 */             int i4 = 4;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 23 */                i3 = i;
                    }
/* 24 */            int i5 = i2 & 2;
/* 26 */            if (i5 != 0) {
/* 28 */                i3 |= 48;
                    } else if ((i & 48) == 0) {
/* 46 */                i3 |= iloI0lOlll1.I000II(i0iolI1I11l1) ? 32 : 16;
                    }
/* 47 */            int i6 = i3 | 384;
/* 53 */            if ((i & 3072) == 0) {
/* 65 */                i6 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 2048 : Barcode.FORMAT_UPC_E;
                    }
/* 83 */            if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 1171) != 1170)) {
/* 85 */                if (i5 != 0) {
/* 87 */                    i0iolI1I11l1 = i1O01oOIoI0I.I00iiO;
                        }
/* 89 */                Object objI0000Il00O = II1oOI10.I0000Il00O(i0iolI1I11l1, false);
/* 103 */               boolean zI000II = iloI0lOlll1.I000II(objI0000Il00O) | ((i6 & 7168) == 2048);
/* 104 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 108 */               if (!zI000II) {
                            Object obj = objI00O0i0ii;
/* 112 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 118 */                       I0Il0I1o i0Il0I1o = new I0Il0I1o(15);
/* 121 */                       i0Il0I1o.I00iiO = objI0000Il00O;
/* 123 */                       i0Il0I1o.I00iiI = iOii1l;
/* 125 */                       VarHandle.storeStoreFence();
/* 128 */                       iloI0lOlll1.I00iio(i0Il0I1o);
                                obj = i0Il0I1o;
                            }
/* 135 */                   Oli1lii10.I00000oIO(o1ooiI111i, (IlliIl1l11O) obj, iloI0lOlll1, i6 & 14, 0);
                        }
                    } else {
/* 139 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 142 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 146 */           if (oOloioIlI001IO000 != null) {
/* 150 */               I0O0Ol1O0O i0O0Ol1O0O = new I0O0Ol1O0O(i4);
/* 153 */               i0O0Ol1O0O.I00ilI0I1 = o1ooiI111i;
/* 155 */               i0O0Ol1O0O.I00iiI = i0iolI1I11l1;
/* 157 */               i0O0Ol1O0O.I00ilO0 = iOii1l;
/* 159 */               i0O0Ol1O0O.I00iiO = i;
/* 161 */               i0O0Ol1O0O.I00iio = i2;
/* 163 */               VarHandle.storeStoreFence();
/* 166 */               oOloioIlI001IO000.I0000O = i0O0Ol1O0O;
                    }
                }
            }
