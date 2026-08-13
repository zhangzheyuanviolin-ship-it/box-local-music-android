            package p000;

            import java.util.Arrays;
            import java.util.List;
            import java.util.logging.Level;
            
            public abstract class OiOO0o1I0 {
                public static final Class I00000oIO;
                public static final OoiO0li I00000oOI;
                public static final OoiO0li I0000Il00O;
                public static final OoiO0li I0000O;

                static {
                    Class<?> cls;
                    try {
/* 3 */                 cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
                    } catch (Throwable unused) {
/* 8 */                 cls = null;
                    }
/* 9 */             I00000oIO = cls;
/* 16 */            I00000oOI = I001IO000(false);
/* 23 */            I0000Il00O = I001IO000(true);
/* 30 */            I0000O = new OoiO0li();
                }

                public static int I00000oIO(int i, List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i) * size;
/* 18 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 30 */                iI000O01llI0 += IOOOi1I1I1.I00000oOI((IIOI1Ii1I) list.get(i2));
                    }
/* 89 */            return iI000O01llI0;
                }

                public static int I00000oOI(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (IOOOi1I1I1.I000O01llI0(i) * size) + I0000Il00O(list);
                }

                public static int I0000Il00O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOOO0I) {
/* 13 */                IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                iooIOOO0I.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI0001Ioi1lo = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iI0001Ioi1lo += IOOOi1I1I1.I0001Ioi1lo(((Integer) list.get(i)).intValue());
                    }
/* 49 */            return iI0001Ioi1lo;
                }

                public static int I0000O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 13 */            return IOOOi1I1I1.I0000Il00O(i) * size;
                }

                public static int I0000oI00(List list) {
/* 5 */             return list.size() * 4;
                }

                public static int I0001Ioi1lo(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 13 */            return IOOOi1I1I1.I0000O(i) * size;
                }

                public static int I000II(List list) {
/* 5 */             return list.size() * 8;
                }

                public static int I000O01llI0(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (IOOOi1I1I1.I000O01llI0(i) * size) + I000OOo1O(list);
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOOO0I) {
/* 13 */                IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                iooIOOO0I.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI0001Ioi1lo = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iI0001Ioi1lo += IOOOi1I1I1.I0001Ioi1lo(((Integer) list.get(i)).intValue());
                    }
/* 49 */            return iI0001Ioi1lo;
                }

                public static int I000OiO(int i, List list) {
/* 5 */             if (list.size() == 0) {
/* 7 */                 return 0;
                    }
/* 22 */            return (IOOOi1I1I1.I000O01llI0(i) * list.size()) + I000iOII(list);
                }

                public static int I000iOII(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IIlI01ol) {
/* 13 */                O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                o1IIlI01ol.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI000OiO = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iI000OiO += IOOOi1I1I1.I000OiO(((Long) list.get(i)).longValue());
                    }
/* 49 */            return iI000OiO;
                }

                public static int I000l1(int i, List list, OiOIiIO0 oiOIiIO0) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i) * size;
/* 14 */            for (int i2 = 0; i2 < size; i2++) {
/* 22 */                int iI00000oOI = ((I01Iio10lo) list.get(i2)).I00000oOI(oiOIiIO0);
/* 31 */                iI000O01llI0 += IOOOi1I1I1.I000OOo1O(iI00000oOI) + iI00000oOI;
                    }
/* 215 */           return iI000O01llI0;
                }

                public static int I000lI(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (IOOOi1I1I1.I000O01llI0(i) * size) + I000o00OoI0I(list);
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOOO0I) {
/* 13 */                IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                iooIOOO0I.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI000OOo1O = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 32 */                int iIntValue = ((Integer) list.get(i)).intValue();
/* 45 */                iI000OOo1O += IOOOi1I1I1.I000OOo1O((iIntValue >> 31) ^ (iIntValue << 1));
                    }
/* 49 */            return iI000OOo1O;
                }

                public static int I000oI1ioi(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (IOOOi1I1I1.I000O01llI0(i) * size) + I00100l0(list);
                }

                public static int I00100l0(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IIlI01ol) {
/* 13 */                O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                o1IIlI01ol.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI000OiO = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 32 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 47 */                iI000OiO += IOOOi1I1I1.I000OiO((jLongValue >> 63) ^ (jLongValue << 1));
                    }
/* 186 */           return iI000OiO;
                }

                public static int I00100o1O0lo(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             int i2 = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iI000O01llI0 = IOOOi1I1I1.I000O01llI0(i) * size;
/* 16 */            if (!(list instanceof O0o1ioOoo00)) {
/* 56 */                while (i2 < size) {
/* 58 */                    Object obj = list.get(i2);
/* 64 */                    if (obj instanceof IIOI1Ii1I) {
/* 68 */                        int size2 = ((IIOI1Ii1I) obj).size();
/* 77 */                        iI000O01llI0 = IOOOi1I1I1.I000OOo1O(size2) + size2 + iI000O01llI0;
                            } else {
/* 86 */                        iI000O01llI0 = IOOOi1I1I1.I000II((String) obj) + iI000O01llI0;
                            }
/* 88 */                    i2++;
                        }
/* 551 */               return iI000O01llI0;
                    }
/* 18 */            O0o1ioOoo00 o0o1ioOoo00 = (O0o1ioOoo00) list;
/* 20 */            while (i2 < size) {
/* 22 */                Object objI00iiI = o0o1ioOoo00.I00iiI(i2);
/* 28 */                if (objI00iiI instanceof IIOI1Ii1I) {
/* 32 */                    int size3 = ((IIOI1Ii1I) objI00iiI).size();
/* 41 */                    iI000O01llI0 = IOOOi1I1I1.I000OOo1O(size3) + size3 + iI000O01llI0;
                        } else {
/* 50 */                    iI000O01llI0 = IOOOi1I1I1.I000II((String) objI00iiI) + iI000O01llI0;
                        }
/* 52 */                i2++;
                    }
/* 55 */            return iI000O01llI0;
                }

                public static int I0010I0i(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (IOOOi1I1I1.I000O01llI0(i) * size) + I0010o(list);
                }

                public static int I0010o(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOOO0I) {
/* 13 */                IooIOOO0I iooIOOO0I = (IooIOOO0I) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                iooIOOO0I.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI000OOo1O = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iI000OOo1O += IOOOi1I1I1.I000OOo1O(((Integer) list.get(i)).intValue());
                    }
/* 49 */            return iI000OOo1O;
                }

                public static int I00111O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (IOOOi1I1I1.I000O01llI0(i) * size) + I001IIilI0O(list);
                }

                public static int I001IIilI0O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IIlI01ol) {
/* 13 */                O1IIlI01ol o1IIlI01ol = (O1IIlI01ol) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                o1IIlI01ol.I0000oI00(0);
/* 22 */                throw null;
                    }
/* 23 */            int iI000OiO = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iI000OiO += IOOOi1I1I1.I000OiO(((Long) list.get(i)).longValue());
                    }
/* 49 */            return iI000OiO;
                }

                public static OoiO0li I001IO000(boolean z) {
                    Class<?> cls;
                    try {
/* 4 */                 cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            if (cls != null) {
                        try {
/* 35 */                    return (OoiO0li) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
                        } catch (Throwable unused2) {
                        }
                    }
/* 1 */             return null;
                }

                public static void I001i1O0Ol(OoiO0li ooiO0li, Object obj, Object obj2) {
/* 1 */             ooiO0li.getClass();
/* 4 */             Io00Io0IO11 io00Io0IO11 = (Io00Io0IO11) obj;
/* 6 */             OoiO0I1O1II ooiO0I1O1II = io00Io0IO11.unknownFields;
/* 10 */            OoiO0I1O1II ooiO0I1O1II2 = ((Io00Io0IO11) obj2).unknownFields;
/* 12 */            OoiO0I1O1II ooiO0I1O1II3 = OoiO0I1O1II.I0001Ioi1lo;
/* 18 */            if (!ooiO0I1O1II3.equals(ooiO0I1O1II2)) {
/* 26 */                if (ooiO0I1O1II3.equals(ooiO0I1O1II)) {
/* 32 */                    int i = ooiO0I1O1II.I00000oIO + ooiO0I1O1II2.I00000oIO;
/* 35 */                    int[] iArrCopyOf = Arrays.copyOf(ooiO0I1O1II.I00000oOI, i);
/* 45 */                    System.arraycopy(ooiO0I1O1II2.I00000oOI, 0, iArrCopyOf, ooiO0I1O1II.I00000oIO, ooiO0I1O1II2.I00000oIO);
/* 50 */                    Object[] objArrCopyOf = Arrays.copyOf(ooiO0I1O1II.I0000Il00O, i);
/* 60 */                    System.arraycopy(ooiO0I1O1II2.I0000Il00O, 0, objArrCopyOf, ooiO0I1O1II.I00000oIO, ooiO0I1O1II2.I00000oIO);
/* 66 */                    ooiO0I1O1II = new OoiO0I1O1II(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 70 */                    ooiO0I1O1II.getClass();
/* 77 */                    if (!ooiO0I1O1II2.equals(ooiO0I1O1II3)) {
/* 82 */                        if (!ooiO0I1O1II.I0000oI00) {
/* 119 */                           OIiilo1Ool0o.I000lI();
/* 215 */                           return;
                                }
/* 88 */                        int i2 = ooiO0I1O1II.I00000oIO + ooiO0I1O1II2.I00000oIO;
/* 89 */                        ooiO0I1O1II.I00000oIO(i2);
/* 100 */                       System.arraycopy(ooiO0I1O1II2.I00000oOI, 0, ooiO0I1O1II.I00000oOI, ooiO0I1O1II.I00000oIO, ooiO0I1O1II2.I00000oIO);
/* 111 */                       System.arraycopy(ooiO0I1O1II2.I0000Il00O, 0, ooiO0I1O1II.I0000Il00O, ooiO0I1O1II.I00000oIO, ooiO0I1O1II2.I00000oIO);
/* 114 */                       ooiO0I1O1II.I00000oIO = i2;
                            }
                        }
                    }
/* 116 */           io00Io0IO11.unknownFields = ooiO0I1O1II;
                }

                public static boolean I001i1lo1io(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                public static void I001iOo1i0O(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 73 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 81 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 85 */                    iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 89 */                    iOOOi1I1I1.I000l1(zBooleanValue ? (byte) 1 : (byte) 0);
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Boolean) list.get(i4)).getClass();
/* 37 */                i3++;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            for (int i5 = 0; i5 < list.size(); i5++) {
/* 62 */                iOOOi1I1I1.I000l1(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                    }
                }

                public static void I001l0I00(int i, List list, iiOlilo0IIIl iiolilo0iiil) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 215 */               return;
                    }
/* 9 */             iiolilo0iiil.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 21 */                IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 27 */                IIOI1Ii1I iIOI1Ii1I = (IIOI1Ii1I) list.get(i2);
/* 30 */                iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 37 */                iOOOi1I1I1.I0010I0i(iIOI1Ii1I.size());
/* 40 */                IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 52 */                iOOOi1I1I1.I000lI(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size());
                    }
                }

                public static void I001lIiIIo1O(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
/* 87 */                    iOOOi1I1I1.getClass();
/* 90 */                    long jDoubleToRawLongBits = Double.doubleToRawLongBits(dDoubleValue);
/* 95 */                    iOOOi1I1I1.I00100o1O0lo(i, 1);
/* 98 */                    iOOOi1I1I1.I000oI1ioi(jDoubleToRawLongBits);
/* 101 */                   i2++;
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Double) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            while (i2 < list.size()) {
/* 65 */                iOOOi1I1I1.I000oI1ioi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 68 */                i2++;
                    }
                }

                public static void I001lllioOl(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 88 */                    iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 91 */                    iOOOi1I1I1.I00100l0(iIntValue);
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int iI0001Ioi1lo = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI0001Ioi1lo += IOOOi1I1I1.I0001Ioi1lo(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            iOOOi1I1I1.I0010I0i(iI0001Ioi1lo);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                iOOOi1I1I1.I00100l0(((Integer) list.get(i4)).intValue());
                    }
                }

                public static void I001lloI(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 79 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 84 */                    iOOOi1I1I1.I00100o1O0lo(i, 5);
/* 87 */                    iOOOi1I1I1.I000o00OoI0I(iIntValue);
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                iOOOi1I1I1.I000o00OoI0I(((Integer) list.get(i2)).intValue());
/* 64 */                i2++;
                    }
                }

                public static void I00II0Ol1O0l(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 79 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 84 */                    iOOOi1I1I1.I00100o1O0lo(i, 1);
/* 87 */                    iOOOi1I1I1.I000oI1ioi(jLongValue);
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                iOOOi1I1I1.I000oI1ioi(((Long) list.get(i2)).longValue());
/* 64 */                i2++;
                    }
                }

                public static void I00II0oii1o(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    float fFloatValue = ((Float) list.get(i2)).floatValue();
/* 87 */                    iOOOi1I1I1.getClass();
/* 90 */                    int iFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
/* 95 */                    iOOOi1I1I1.I00100o1O0lo(i, 5);
/* 98 */                    iOOOi1I1I1.I000o00OoI0I(iFloatToRawIntBits);
/* 101 */                   i2++;
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Float) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            while (i2 < list.size()) {
/* 65 */                iOOOi1I1I1.I000o00OoI0I(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 68 */                i2++;
                    }
                }

                public static void I00IO1(int i, List list, iiOlilo0IIIl iiolilo0iiil, OiOIiIO0 oiOIiIO0) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 9 */             iiolilo0iiil.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 23 */                iiolilo0iiil.I00Iooi00oi(i, list.get(i2), oiOIiIO0);
                    }
                }

                public static void I00IO1oi11O(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 88 */                    iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 91 */                    iOOOi1I1I1.I00100l0(iIntValue);
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int iI0001Ioi1lo = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI0001Ioi1lo += IOOOi1I1I1.I0001Ioi1lo(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            iOOOi1I1I1.I0010I0i(iI0001Ioi1lo);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                iOOOi1I1I1.I00100l0(((Integer) list.get(i4)).intValue());
                    }
                }

                public static void I00IOO(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 88 */                    iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 91 */                    iOOOi1I1I1.I0010o(jLongValue);
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int iI000OiO = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI000OiO += IOOOi1I1I1.I000OiO(((Long) list.get(i3)).longValue());
                    }
/* 46 */            iOOOi1I1I1.I0010I0i(iI000OiO);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                iOOOi1I1I1.I0010o(((Long) list.get(i4)).longValue());
                    }
                }

                public static void I00IioO0OiOi(int i, List list, iiOlilo0IIIl iiolilo0iiil, OiOIiIO0 oiOIiIO0) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 9 */             iiolilo0iiil.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 23 */                iiolilo0iiil.I00O0i0ii(i, list.get(i2), oiOIiIO0);
                    }
                }

                public static void I00IlilI0i0i(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 79 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 84 */                    iOOOi1I1I1.I00100o1O0lo(i, 5);
/* 87 */                    iOOOi1I1I1.I000o00OoI0I(iIntValue);
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                iOOOi1I1I1.I000o00OoI0I(((Integer) list.get(i2)).intValue());
/* 64 */                i2++;
                    }
                }

                public static void I00Io1lO(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 79 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 84 */                    iOOOi1I1I1.I00100o1O0lo(i, 1);
/* 87 */                    iOOOi1I1I1.I000oI1ioi(jLongValue);
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            iOOOi1I1I1.I0010I0i(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                iOOOi1I1I1.I000oI1ioi(((Long) list.get(i2)).longValue());
/* 64 */                i2++;
                    }
                }

                public static void I00Io1o110i(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 86 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 94 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 103 */                   iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 106 */                   iOOOi1I1I1.I0010I0i((iIntValue >> 31) ^ (iIntValue << 1));
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int iI000OOo1O = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 34 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 47 */                iI000OOo1O += IOOOi1I1I1.I000OOo1O((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                    }
/* 51 */            iOOOi1I1I1.I0010I0i(iI000OOo1O);
/* 58 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 66 */                int iIntValue3 = ((Integer) list.get(i4)).intValue();
/* 75 */                iOOOi1I1I1.I0010I0i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                    }
                }

                public static void I00IoIO0lI(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 17 */            if (!z) {
/* 87 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 95 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 103 */                   iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 106 */                   iOOOi1I1I1.I0010o((jLongValue >> 63) ^ (jLongValue << 1));
                        }
/* 483 */               return;
                    }
/* 20 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 24 */            int iI000OiO = 0;
/* 29 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 37 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 49 */                iI000OiO += IOOOi1I1I1.I000OiO((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    }
/* 53 */            iOOOi1I1I1.I0010I0i(iI000OiO);
/* 60 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 68 */                long jLongValue3 = ((Long) list.get(i4)).longValue();
/* 76 */                iOOOi1I1I1.I0010o((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                    }
                }

                public static void I00IoO0(int i, List list, iiOlilo0IIIl iiolilo0iiil) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 2160 */              return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 19 */            if (!(list instanceof O0o1ioOoo00)) {
/* 187 */               for (int i2 = 0; i2 < list.size(); i2++) {
/* 193 */                   String str = (String) list.get(i2);
/* 195 */                   iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 198 */                   int i3 = iOOOi1I1I1.I0000Il00O;
/* 200 */                   byte[] bArr = iOOOi1I1I1.I00000oOI;
/* 202 */                   int i4 = iOOOi1I1I1.I0000O;
                            try {
/* 210 */                       int iI000OOo1O = IOOOi1I1I1.I000OOo1O(str.length() * 3);
/* 218 */                       int iI000OOo1O2 = IOOOi1I1I1.I000OOo1O(str.length());
/* 222 */                       if (iI000OOo1O2 == iI000OOo1O) {
/* 224 */                           int i5 = i4 + iI000OOo1O2;
/* 226 */                           iOOOi1I1I1.I0000O = i5;
/* 231 */                           int iI00000oOI = Oolio1l.I00000oIO.I00000oOI(str, bArr, i5, i3 - i5);
/* 235 */                           iOOOi1I1I1.I0000O = i4;
/* 240 */                           iOOOi1I1I1.I0010I0i((iI00000oOI - i4) - iI000OOo1O2);
/* 243 */                           iOOOi1I1I1.I0000O = iI00000oOI;
                                } else {
/* 252 */                           iOOOi1I1I1.I0010I0i(Oolio1l.I00000oIO(str));
/* 255 */                           int i6 = iOOOi1I1I1.I0000O;
/* 264 */                           iOOOi1I1I1.I0000O = Oolio1l.I00000oIO.I00000oOI(str, bArr, i6, i3 - i6);
                                }
                            } catch (Oolii1 e) {
/* 274 */                       iOOOi1I1I1.I0000O = i4;
/* 280 */                       IOOOi1I1I1.I0000oI00.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
/* 285 */                       byte[] bytes = str.getBytes(Iool1iOO11.I00000oIO);
                                try {
/* 290 */                           iOOOi1I1I1.I0010I0i(bytes.length);
/* 294 */                           iOOOi1I1I1.I000lI(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e2) {
/* 306 */                           throw new IOO1IOl1O10(e2);
                                }
                            } catch (IndexOutOfBoundsException e3) {
/* 273 */                       throw new IOO1IOl1O10(e3);
                            }
                        }
/* 2160 */              return;
                    }
/* 22 */            O0o1ioOoo00 o0o1ioOoo00 = (O0o1ioOoo00) list;
/* 29 */            for (int i7 = 0; i7 < list.size(); i7++) {
/* 31 */                Object objI00iiI = o0o1ioOoo00.I00iiI(i7);
/* 37 */                if (objI00iiI instanceof String) {
/* 39 */                    String str2 = (String) objI00iiI;
/* 41 */                    iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 44 */                    int i8 = iOOOi1I1I1.I0000Il00O;
/* 46 */                    byte[] bArr2 = iOOOi1I1I1.I00000oOI;
/* 48 */                    int i9 = iOOOi1I1I1.I0000O;
                            try {
/* 56 */                        int iI000OOo1O3 = IOOOi1I1I1.I000OOo1O(str2.length() * 3);
/* 64 */                        int iI000OOo1O4 = IOOOi1I1I1.I000OOo1O(str2.length());
/* 68 */                        if (iI000OOo1O4 == iI000OOo1O3) {
/* 70 */                            int i10 = i9 + iI000OOo1O4;
/* 72 */                            iOOOi1I1I1.I0000O = i10;
/* 77 */                            int iI00000oOI2 = Oolio1l.I00000oIO.I00000oOI(str2, bArr2, i10, i8 - i10);
/* 81 */                            iOOOi1I1I1.I0000O = i9;
/* 86 */                            iOOOi1I1I1.I0010I0i((iI00000oOI2 - i9) - iI000OOo1O4);
/* 89 */                            iOOOi1I1I1.I0000O = iI00000oOI2;
                                } else {
/* 98 */                            iOOOi1I1I1.I0010I0i(Oolio1l.I00000oIO(str2));
/* 101 */                           int i11 = iOOOi1I1I1.I0000O;
/* 110 */                           iOOOi1I1I1.I0000O = Oolio1l.I00000oIO.I00000oOI(str2, bArr2, i11, i8 - i11);
                                }
                            } catch (Oolii1 e4) {
/* 120 */                       iOOOi1I1I1.I0000O = i9;
/* 126 */                       IOOOi1I1I1.I0000oI00.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
/* 131 */                       byte[] bytes2 = str2.getBytes(Iool1iOO11.I00000oIO);
                                try {
/* 136 */                           iOOOi1I1I1.I0010I0i(bytes2.length);
/* 140 */                           iOOOi1I1I1.I000lI(bytes2, 0, bytes2.length);
                                } catch (IndexOutOfBoundsException e5) {
/* 150 */                           throw new IOO1IOl1O10(e5);
                                }
                            } catch (IndexOutOfBoundsException e6) {
/* 119 */                       throw new IOO1IOl1O10(e6);
                            }
                        } else {
/* 151 */                   IIOI1Ii1I iIOI1Ii1I = (IIOI1Ii1I) objI00iiI;
/* 153 */                   iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 160 */                   iOOOi1I1I1.I0010I0i(iIOI1Ii1I.size());
/* 163 */                   IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 175 */                   iOOOi1I1I1.I000lI(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size());
                        }
                    }
                }

                public static void I00IoiI(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 88 */                    iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 91 */                    iOOOi1I1I1.I0010I0i(iIntValue);
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int iI000OOo1O = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI000OOo1O += IOOOi1I1I1.I000OOo1O(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            iOOOi1I1I1.I0010I0i(iI000OOo1O);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                iOOOi1I1I1.I0010I0i(((Integer) list.get(i4)).intValue());
                    }
                }

                public static void I00Iooi00oi(int i, List list, iiOlilo0IIIl iiolilo0iiil, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) iiolilo0iiil.I00iOIl;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 88 */                    iOOOi1I1I1.I00100o1O0lo(i, 0);
/* 91 */                    iOOOi1I1I1.I0010o(jLongValue);
                        }
/* 483 */               return;
                    }
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 21 */            int iI000OiO = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI000OiO += IOOOi1I1I1.I000OiO(((Long) list.get(i3)).longValue());
                    }
/* 46 */            iOOOi1I1I1.I0010I0i(iI000OiO);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                iOOOi1I1I1.I0010o(((Long) list.get(i4)).longValue());
                    }
                }
            }
