            package p000;

            import java.util.Arrays;
            import java.util.List;
            
/* 964 */   public abstract class OiOO0oO1Io {
                public static final Class I00000oIO;
                public static final OoiO0oOll0oO I00000oOI;
                public static final OoiO0oOll0oO I0000Il00O;

                static {
                    Class<?> cls;
                    Class<?> cls2;
/* 1 */             Class cls3 = I0lI0Ooo.I00000oIO;
/* 3 */             OoiO0oOll0oO ooiO0oOll0oO = null;
                    try {
/* 6 */                 cls = Class.forName("com.google.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 11 */                cls = null;
                    }
/* 12 */            I00000oIO = cls;
                    try {
/* 14 */                Class cls4 = I0lI0Ooo.I00000oIO;
                        try {
/* 18 */                    cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
                        } catch (Throwable unused2) {
/* 23 */                    cls2 = null;
                        }
/* 24 */                if (cls2 != null) {
/* 35 */                    ooiO0oOll0oO = (OoiO0oOll0oO) cls2.getConstructor(null).newInstance(null);
                        }
                    } catch (Throwable unused3) {
                    }
/* 38 */            I00000oOI = ooiO0oOll0oO;
/* 45 */            I0000Il00O = new OoiO0oOll0oO();
                }

                public static int I00000oIO(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOOl11) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OOo1O = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Integer) list.get(i)).intValue());
                    }
/* 49 */            return iI000OOo1O;
                }

                public static int I00000oOI(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return (IOOOiI0.I000II(i) + 4) * size;
                }

                public static int I0000Il00O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return (IOOOiI0.I000II(i) + 8) * size;
                }

                public static int I0000O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof IooIOOl11) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OOo1O = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Integer) list.get(i)).intValue());
                    }
/* 49 */            return iI000OOo1O;
                }

                public static int I0000oI00(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IIo0iI) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OOo1O = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Long) list.get(i)).longValue());
                    }
/* 49 */            return iI000OOo1O;
                }

                public static int I0001Ioi1lo(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size != 0) {
/* 11 */                if (!(list instanceof IooIOOl11)) {
/* 21 */                    int iI000O01llI0 = 0;
/* 22 */                    for (int i = 0; i < size; i++) {
/* 30 */                        int iIntValue = ((Integer) list.get(i)).intValue();
/* 43 */                        iI000O01llI0 += IOOOiI0.I000O01llI0((iIntValue >> 31) ^ (iIntValue << 1));
                            }
/* 49 */                    return iI000O01llI0;
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
/* 11 */                if (!(list instanceof O1IIo0iI)) {
/* 21 */                    int iI000OOo1O = 0;
/* 22 */                    for (int i = 0; i < size; i++) {
/* 30 */                        long jLongValue = ((Long) list.get(i)).longValue();
/* 45 */                        iI000OOo1O += IOOOiI0.I000OOo1O((jLongValue >> 63) ^ (jLongValue << 1));
                            }
/* 49 */                    return iI000OOo1O;
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
/* 11 */            if (list instanceof IooIOOl11) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000O01llI0 = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000O01llI0 += IOOOiI0.I000O01llI0(((Integer) list.get(i)).intValue());
                    }
/* 49 */            return iI000O01llI0;
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof O1IIo0iI) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000OOo1O = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Long) list.get(i)).longValue());
                    }
/* 49 */            return iI000OOo1O;
                }

                public static void I000iOII(OoiO0oOll0oO ooiO0oOll0oO, Object obj, Object obj2) {
/* 1 */             ooiO0oOll0oO.getClass();
/* 4 */             Io00Ol1o10O io00Ol1o10O = (Io00Ol1o10O) obj;
/* 6 */             OoiO0IO0il ooiO0IO0il = io00Ol1o10O.unknownFields;
/* 10 */            OoiO0IO0il ooiO0IO0il2 = ((Io00Ol1o10O) obj2).unknownFields;
/* 12 */            OoiO0IO0il ooiO0IO0il3 = OoiO0IO0il.I0001Ioi1lo;
/* 18 */            if (!ooiO0IO0il3.equals(ooiO0IO0il2)) {
/* 26 */                if (ooiO0IO0il3.equals(ooiO0IO0il)) {
/* 32 */                    int i = ooiO0IO0il.I00000oIO + ooiO0IO0il2.I00000oIO;
/* 35 */                    int[] iArrCopyOf = Arrays.copyOf(ooiO0IO0il.I00000oOI, i);
/* 45 */                    System.arraycopy(ooiO0IO0il2.I00000oOI, 0, iArrCopyOf, ooiO0IO0il.I00000oIO, ooiO0IO0il2.I00000oIO);
/* 50 */                    Object[] objArrCopyOf = Arrays.copyOf(ooiO0IO0il.I0000Il00O, i);
/* 60 */                    System.arraycopy(ooiO0IO0il2.I0000Il00O, 0, objArrCopyOf, ooiO0IO0il.I00000oIO, ooiO0IO0il2.I00000oIO);
/* 66 */                    ooiO0IO0il = new OoiO0IO0il(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 70 */                    ooiO0IO0il.getClass();
/* 77 */                    if (!ooiO0IO0il2.equals(ooiO0IO0il3)) {
/* 82 */                        if (!ooiO0IO0il.I0000oI00) {
/* 119 */                           OIiilo1Ool0o.I000lI();
/* 215 */                           return;
                                }
/* 88 */                        int i2 = ooiO0IO0il.I00000oIO + ooiO0IO0il2.I00000oIO;
/* 89 */                        ooiO0IO0il.I00000oIO(i2);
/* 100 */                       System.arraycopy(ooiO0IO0il2.I00000oOI, 0, ooiO0IO0il.I00000oOI, ooiO0IO0il.I00000oIO, ooiO0IO0il2.I00000oIO);
/* 111 */                       System.arraycopy(ooiO0IO0il2.I0000Il00O, 0, ooiO0IO0il.I0000Il00O, ooiO0IO0il.I00000oIO, ooiO0IO0il2.I00000oIO);
/* 114 */                       ooiO0IO0il.I00000oIO = i2;
                            }
                        }
                    }
/* 116 */           io00Ol1o10O.unknownFields = ooiO0IO0il;
                }

                public static boolean I000l1(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                public static void I000lI(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof II11II0O0I) {
/* 94 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 76 */                while (i2 < list.size()) {
/* 88 */                    iOOOiI0.I000o00OoI0I(i, ((Boolean) list.get(i2)).booleanValue());
/* 91 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            iOOOiI0.I001lllioOl(i3);
/* 53 */            while (i2 < list.size()) {
/* 66 */                iOOOiI0.I000l1(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 69 */                i2++;
                    }
                }

                public static void I000o00OoI0I(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 9 */             boolean z2 = list instanceof Iiilo1O111;
/* 13 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!z2) {
/* 92 */                if (!z) {
/* 152 */                   while (i2 < list.size()) {
/* 160 */                       double dDoubleValue = ((Double) list.get(i2)).doubleValue();
/* 164 */                       iOOOiI0.getClass();
/* 171 */                       iOOOiI0.I0010o(i, Double.doubleToRawLongBits(dDoubleValue));
/* 174 */                       i2++;
                            }
/* 483 */                   return;
                        }
/* 94 */                iOOOiI0.I001l0I00(i, 2);
/* 98 */                int i3 = 0;
/* 103 */               for (int i4 = 0; i4 < list.size(); i4++) {
/* 111 */                   ((Double) list.get(i4)).getClass();
/* 114 */                   i3 += 8;
                        }
/* 119 */               iOOOiI0.I001lllioOl(i3);
/* 126 */               while (i2 < list.size()) {
/* 142 */                   iOOOiI0.I00111O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 145 */                   i2++;
                        }
/* 483 */               return;
                    }
/* 19 */            Iiilo1O111 iiilo1O111 = (Iiilo1O111) list;
/* 21 */            if (!z) {
/* 70 */                while (i2 < iiilo1O111.I00iiO) {
/* 72 */                    iiilo1O111.I0000oI00(i2);
/* 77 */                    double d = iiilo1O111.I00iiI[i2];
/* 79 */                    iOOOiI0.getClass();
/* 86 */                    iOOOiI0.I0010o(i, Double.doubleToRawLongBits(d));
/* 89 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 23 */            iOOOiI0.I001l0I00(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < iiilo1O111.I00iiO; i6++) {
/* 32 */                iiilo1O111.I0000oI00(i6);
/* 37 */                double d2 = iiilo1O111.I00iiI[i6];
/* 39 */                i5 += 8;
                    }
/* 44 */            iOOOiI0.I001lllioOl(i5);
/* 49 */            while (i2 < iiilo1O111.I00iiO) {
/* 51 */                iiilo1O111.I0000oI00(i2);
/* 62 */                iOOOiI0.I00111O(Double.doubleToRawLongBits(iiilo1O111.I00iiI[i2]));
/* 65 */                i2++;
                    }
                }

                public static void I000oI1ioi(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IooIOOl11) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 80 */                while (i2 < list.size()) {
/* 92 */                    iOOOiI0.I001IIilI0O(i, ((Integer) list.get(i2)).intValue());
/* 95 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int iI000OOo1O = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 47 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Integer) list.get(i3)).intValue());
                    }
/* 51 */            iOOOiI0.I001lllioOl(iI000OOo1O);
/* 58 */            while (i2 < list.size()) {
/* 70 */                iOOOiI0.I001IO000(((Integer) list.get(i2)).intValue());
/* 73 */                i2++;
                    }
                }

                public static void I00100l0(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IooIOOl11) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOiI0.I00100o1O0lo(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Integer) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            iOOOiI0.I001lllioOl(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOiI0.I0010I0i(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I00100o1O0lo(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof O1IIo0iI) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOiI0.I0010o(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            iOOOiI0.I001lllioOl(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOiI0.I00111O(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I0010I0i(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IlOOIO0) {
/* 104 */               OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 87 */                    float fFloatValue = ((Float) list.get(i2)).floatValue();
/* 91 */                    iOOOiI0.getClass();
/* 98 */                    iOOOiI0.I00100o1O0lo(i, Float.floatToRawIntBits(fFloatValue));
/* 101 */                   i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Float) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            iOOOiI0.I001lllioOl(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                iOOOiI0.I0010I0i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0010o(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IooIOOl11) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 80 */                while (i2 < list.size()) {
/* 92 */                    iOOOiI0.I001IIilI0O(i, ((Integer) list.get(i2)).intValue());
/* 95 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int iI000OOo1O = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 47 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Integer) list.get(i3)).intValue());
                    }
/* 51 */            iOOOiI0.I001lllioOl(iI000OOo1O);
/* 58 */            while (i2 < list.size()) {
/* 70 */                iOOOiI0.I001IO000(((Integer) list.get(i2)).intValue());
/* 73 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof O1IIo0iI) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    iOOOiI0.I001lloI(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int iI000OOo1O = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Long) list.get(i3)).longValue());
                    }
/* 50 */            iOOOiI0.I001lllioOl(iI000OOo1O);
/* 57 */            while (i2 < list.size()) {
/* 69 */                iOOOiI0.I00II0Ol1O0l(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IooIOOl11) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOiI0.I00100o1O0lo(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Integer) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            iOOOiI0.I001lllioOl(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOiI0.I0010I0i(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof O1IIo0iI) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    iOOOiI0.I0010o(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            iOOOiI0.I001lllioOl(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                iOOOiI0.I00111O(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IooIOOl11) {
/* 112 */               OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 89 */                while (i2 < list.size()) {
/* 97 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 106 */                   iOOOiI0.I001lIiIIo1O(i, (iIntValue >> 31) ^ (iIntValue << 1));
/* 109 */                   i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int iI000O01llI0 = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 38 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 51 */                iI000O01llI0 += IOOOiI0.I000O01llI0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                    }
/* 55 */            iOOOiI0.I001lllioOl(iI000O01llI0);
/* 62 */            while (i2 < list.size()) {
/* 70 */                int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 79 */                iOOOiI0.I001lllioOl((iIntValue3 >> 31) ^ (iIntValue3 << 1));
/* 82 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof O1IIo0iI) {
/* 112 */               OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 20 */            int i2 = 0;
/* 21 */            if (!z) {
/* 90 */                while (i2 < list.size()) {
/* 98 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 106 */                   iOOOiI0.I001lloI(i, (jLongValue >> 63) ^ (jLongValue << 1));
/* 109 */                   i2++;
                        }
/* 483 */               return;
                    }
/* 24 */            iOOOiI0.I001l0I00(i, 2);
/* 28 */            int iI000OOo1O = 0;
/* 33 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 41 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 53 */                iI000OOo1O += IOOOiI0.I000OOo1O((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    }
/* 57 */            iOOOiI0.I001lllioOl(iI000OOo1O);
/* 64 */            while (i2 < list.size()) {
/* 72 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 80 */                iOOOiI0.I00II0Ol1O0l((jLongValue3 >> 63) ^ (jLongValue3 << 1));
/* 83 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof IooIOOl11) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    iOOOiI0.I001lIiIIo1O(i, ((Integer) list.get(i2)).intValue());
/* 94 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int iI000O01llI0 = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI000O01llI0 += IOOOiI0.I000O01llI0(((Integer) list.get(i3)).intValue());
                    }
/* 50 */            iOOOiI0.I001lllioOl(iI000O01llI0);
/* 57 */            while (i2 < list.size()) {
/* 69 */                iOOOiI0.I001lllioOl(((Integer) list.get(i2)).intValue());
/* 72 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 483 */               return;
                    }
/* 11 */            IOOOiI0 iOOOiI0 = (IOOOiI0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof O1IIo0iI) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 483 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    iOOOiI0.I001lloI(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 483 */               return;
                    }
/* 21 */            iOOOiI0.I001l0I00(i, 2);
/* 25 */            int iI000OOo1O = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI000OOo1O += IOOOiI0.I000OOo1O(((Long) list.get(i3)).longValue());
                    }
/* 50 */            iOOOiI0.I001lllioOl(iI000OOo1O);
/* 57 */            while (i2 < list.size()) {
/* 69 */                iOOOiI0.I00II0Ol1O0l(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }

/* 965 */       public static Object I000OiO(Object obj, int i, Iool1IOO1o0i iool1IOO1o0i, Object obj2, OoiO0oOll0oO ooiO0oOll0oO) {
/* 966 */           return obj2;
                }
            }
