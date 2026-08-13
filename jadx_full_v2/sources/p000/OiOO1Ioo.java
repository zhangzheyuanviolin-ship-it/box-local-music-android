            package p000;

            import java.util.Arrays;
            import java.util.List;
            
/* 397 */   public abstract class OiOO1Ioo {
                public static final Class I00000oIO;
                public static final OoiO0oloIiI I00000oOI;
                public static final OoiO0oloIiI I0000Il00O;

                static {
                    Class<?> cls;
                    Class<?> cls2;
/* 1 */             OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 3 */             OoiO0oloIiI ooiO0oloIiI = null;
                    try {
/* 6 */                 cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 11 */                cls = null;
                    }
/* 12 */            I00000oIO = cls;
                    try {
/* 14 */                OOi1oI oOi1oI2 = OOi1oI.I0000Il00O;
                        try {
/* 18 */                    cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
                        } catch (Throwable unused2) {
/* 23 */                    cls2 = null;
                        }
/* 24 */                if (cls2 != null) {
/* 35 */                    ooiO0oloIiI = (OoiO0oloIiI) cls2.getConstructor(null).newInstance(null);
                        }
                    } catch (Throwable unused3) {
                    }
/* 38 */            I00000oOI = ooiO0oloIiI;
/* 45 */            I0000Il00O = new OoiO0oloIiI();
                }

                public static int I00000oIO(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOi0) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OiO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI000OiO += IOOOio0o.I000OiO(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI000OiO;
                }

                public static int I00000oOI(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return (IOOOio0o.I000O01llI0(i) + 4) * size;
                }

                public static int I0000Il00O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return (IOOOio0o.I000O01llI0(i) + 8) * size;
                }

                public static int I0000O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOi0) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OiO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI000OiO += IOOOio0o.I000OiO(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI000OiO;
                }

                public static int I0000oI00(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IO010Oo) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OiO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000OiO += IOOOio0o.I000OiO(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI000OiO;
                }

                public static int I0001Ioi1lo(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size != 0) {
/* 11 */                if (!(list instanceof IooIOi0)) {
/* 21 */                    int iI000OOo1O = 0;
/* 22 */                    for (int i = 0; i < size; i++) {
/* 30 */                        int iIntValue = ((Integer) list.get(i)).intValue();
/* 43 */                        iI000OOo1O += IOOOio0o.I000OOo1O((iIntValue >> 31) ^ (iIntValue << 1));
                            }
/* 77 */                    return iI000OOo1O;
                        }
/* 13 */                IIlIOloOOO.I001i1lo1io(list);
/* 16 */                if (size > 0) {
/* 20 */                    throw null;
                        }
                    }
/* 5 */             return 0;
                }

                public static int I000II(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size != 0) {
/* 11 */                if (!(list instanceof O1IO010Oo)) {
/* 21 */                    int iI000OiO = 0;
/* 22 */                    for (int i = 0; i < size; i++) {
/* 30 */                        long jLongValue = ((Long) list.get(i)).longValue();
/* 45 */                        iI000OiO += IOOOio0o.I000OiO((jLongValue >> 63) ^ (jLongValue << 1));
                            }
/* 77 */                    return iI000OiO;
                        }
/* 13 */                IIlIOloOOO.I001i1lo1io(list);
/* 16 */                if (size > 0) {
/* 20 */                    throw null;
                        }
                    }
/* 5 */             return 0;
                }

                public static int I000O01llI0(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOi0) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OOo1O = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000OOo1O += IOOOio0o.I000OOo1O(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI000OOo1O;
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IO010Oo) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OiO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000OiO += IOOOio0o.I000OiO(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI000OiO;
                }

                public static void I000iOII(OoiO0oloIiI ooiO0oloIiI, Object obj, Object obj2) {
/* 1 */             ooiO0oloIiI.getClass();
/* 4 */             Io00l0 io00l0 = (Io00l0) obj;
/* 6 */             OoiO0l ooiO0l = io00l0.unknownFields;
/* 10 */            OoiO0l ooiO0l2 = ((Io00l0) obj2).unknownFields;
/* 12 */            OoiO0l ooiO0l3 = OoiO0l.I0001Ioi1lo;
/* 18 */            if (!ooiO0l3.equals(ooiO0l2)) {
/* 26 */                if (ooiO0l3.equals(ooiO0l)) {
/* 32 */                    int i = ooiO0l.I00000oIO + ooiO0l2.I00000oIO;
/* 35 */                    int[] iArrCopyOf = Arrays.copyOf(ooiO0l.I00000oOI, i);
/* 45 */                    System.arraycopy(ooiO0l2.I00000oOI, 0, iArrCopyOf, ooiO0l.I00000oIO, ooiO0l2.I00000oIO);
/* 50 */                    Object[] objArrCopyOf = Arrays.copyOf(ooiO0l.I0000Il00O, i);
/* 60 */                    System.arraycopy(ooiO0l2.I0000Il00O, 0, objArrCopyOf, ooiO0l.I00000oIO, ooiO0l2.I00000oIO);
/* 66 */                    ooiO0l = new OoiO0l(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 70 */                    ooiO0l.getClass();
/* 77 */                    if (!ooiO0l2.equals(ooiO0l3)) {
/* 82 */                        if (!ooiO0l.I0000oI00) {
/* 119 */                           OIiilo1Ool0o.I000lI();
/* 408 */                           return;
                                }
/* 88 */                        int i2 = ooiO0l.I00000oIO + ooiO0l2.I00000oIO;
/* 89 */                        ooiO0l.I00000oIO(i2);
/* 100 */                       System.arraycopy(ooiO0l2.I00000oOI, 0, ooiO0l.I00000oOI, ooiO0l.I00000oIO, ooiO0l2.I00000oIO);
/* 111 */                       System.arraycopy(ooiO0l2.I0000Il00O, 0, ooiO0l.I0000Il00O, ooiO0l.I00000oIO, ooiO0l2.I00000oIO);
/* 114 */                       ooiO0l.I00000oIO = i2;
                            }
                        }
                    }
/* 116 */           io00l0.unknownFields = ooiO0l;
                }

                public static boolean I000l1(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                public static void I000lI(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof II11IlioliO0) {
/* 94 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 76 */                while (i2 < list.size()) {
/* 88 */                    iOOOio0o.I000oI1ioi(i, ((Boolean) list.get(i2)).booleanValue());
/* 91 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 66 */                iOOOio0o.I000lI(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 69 */                i2++;
                    }
                }

                public static void I000o00OoI0I(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IiilolI0Oill) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    iOOOio0o.I00111O(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                iOOOio0o.I001IIilI0O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I000oI1ioi(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IooIOi0) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 80 */                while (i2 < list.size()) {
/* 92 */                    iOOOio0o.I001IO000(i, ((Integer) list.get(i2)).intValue());
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int iI000OiO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 47 */                iI000OiO += IOOOio0o.I000OiO(((Integer) list.get(i3)).intValue());
                    }
/* 51 */            iOOOio0o.I00II0Ol1O0l(iI000OiO);
/* 58 */            while (i2 < list.size()) {
/* 70 */                iOOOio0o.I001i1O0Ol(((Integer) list.get(i2)).intValue());
/* 73 */                i2++;
                    }
                }

                public static void I00100l0(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IooIOi0) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOio0o.I0010I0i(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Integer) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOio0o.I0010o(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I00100o1O0lo(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof O1IO010Oo) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOio0o.I00111O(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOio0o.I001IIilI0O(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I0010I0i(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IlOOOIo) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    iOOOio0o.I0010I0i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Float) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                iOOOio0o.I0010o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0010o(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IooIOi0) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 80 */                while (i2 < list.size()) {
/* 92 */                    iOOOio0o.I001IO000(i, ((Integer) list.get(i2)).intValue());
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int iI000OiO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 47 */                iI000OiO += IOOOio0o.I000OiO(((Integer) list.get(i3)).intValue());
                    }
/* 51 */            iOOOio0o.I00II0Ol1O0l(iI000OiO);
/* 58 */            while (i2 < list.size()) {
/* 70 */                iOOOio0o.I001i1O0Ol(((Integer) list.get(i2)).intValue());
/* 73 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof O1IO010Oo) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    iOOOio0o.I00II0oii1o(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int iI000OiO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI000OiO += IOOOio0o.I000OiO(((Long) list.get(i3)).longValue());
                    }
/* 50 */            iOOOio0o.I00II0Ol1O0l(iI000OiO);
/* 57 */            while (i2 < list.size()) {
/* 69 */                iOOOio0o.I00IO1(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IooIOi0) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOio0o.I0010I0i(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Integer) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOio0o.I0010o(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof O1IO010Oo) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOio0o.I00111O(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            iOOOio0o.I00II0Ol1O0l(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOio0o.I001IIilI0O(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IooIOi0) {
/* 112 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 89 */                while (i2 < list.size()) {
/* 97 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 106 */                   iOOOio0o.I001lloI(i, (iIntValue >> 31) ^ (iIntValue << 1));
/* 109 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int iI000OOo1O = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 38 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 51 */                iI000OOo1O += IOOOio0o.I000OOo1O((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                    }
/* 55 */            iOOOio0o.I00II0Ol1O0l(iI000OOo1O);
/* 62 */            while (i2 < list.size()) {
/* 70 */                int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 79 */                iOOOio0o.I00II0Ol1O0l((iIntValue3 >> 31) ^ (iIntValue3 << 1));
/* 82 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof O1IO010Oo) {
/* 112 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 20 */            int i2 = 0;
/* 21 */            if (!z) {
/* 90 */                while (i2 < list.size()) {
/* 98 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 106 */                   iOOOio0o.I00II0oii1o(i, (jLongValue >> 63) ^ (jLongValue << 1));
/* 109 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 24 */            iOOOio0o.I001lllioOl(i, 2);
/* 28 */            int iI000OiO = 0;
/* 33 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 41 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 53 */                iI000OiO += IOOOio0o.I000OiO((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    }
/* 57 */            iOOOio0o.I00II0Ol1O0l(iI000OiO);
/* 64 */            while (i2 < list.size()) {
/* 72 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 80 */                iOOOio0o.I00IO1((jLongValue3 >> 63) ^ (jLongValue3 << 1));
/* 83 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof IooIOi0) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    iOOOio0o.I001lloI(i, ((Integer) list.get(i2)).intValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int iI000OOo1O = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI000OOo1O += IOOOio0o.I000OOo1O(((Integer) list.get(i3)).intValue());
                    }
/* 50 */            iOOOio0o.I00II0Ol1O0l(iI000OOo1O);
/* 57 */            while (i2 < list.size()) {
/* 69 */                iOOOio0o.I00II0Ol1O0l(((Integer) list.get(i2)).intValue());
/* 72 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, IIOOoll iIOOoll, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            IOOOio0o iOOOio0o = (IOOOio0o) iIOOoll.I00iiI;
/* 15 */            if (list instanceof O1IO010Oo) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    iOOOio0o.I00II0oii1o(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iOOOio0o.I001lllioOl(i, 2);
/* 25 */            int iI000OiO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI000OiO += IOOOio0o.I000OiO(((Long) list.get(i3)).longValue());
                    }
/* 50 */            iOOOio0o.I00II0Ol1O0l(iI000OiO);
/* 57 */            while (i2 < list.size()) {
/* 69 */                iOOOio0o.I00IO1(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }

/* 398 */       public static Object I000OiO(Object obj, int i, Iool1O1Ol1i iool1O1Ol1i, Object obj2, OoiO0oloIiI ooiO0oloIiI) {
/* 399 */           return obj2;
                }
            }
