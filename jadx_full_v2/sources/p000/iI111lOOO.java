            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class iI111lOOO {
                public static final O1oO0lOoI1 I00000oIO;

                static {
/* 1 */             int i = i1ioiooIiOol.I00000oIO;
/* 9 */             I00000oIO = new O1oO0lOoI1(7);
                }

                public static boolean I00000oIO(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static void I00000oOI(Object obj, Object obj2) {
/* 1 */             i1oi01OllI i1oi01olli = (i1oi01OllI) obj;
/* 3 */             iI1O01I1 ii1o01i1 = i1oi01olli.zzc;
/* 7 */             iI1O01I1 ii1o01i12 = ((i1oi01OllI) obj2).zzc;
/* 9 */             iI1O01I1 ii1o01i13 = iI1O01I1.I0001Ioi1lo;
/* 15 */            if (!ii1o01i13.equals(ii1o01i12)) {
/* 22 */                if (ii1o01i13.equals(ii1o01i1)) {
/* 28 */                    int i = ii1o01i1.I00000oIO + ii1o01i12.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(ii1o01i1.I00000oOI, i);
/* 41 */                    System.arraycopy(ii1o01i12.I00000oOI, 0, iArrCopyOf, ii1o01i1.I00000oIO, ii1o01i12.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(ii1o01i1.I0000Il00O, i);
/* 56 */                    System.arraycopy(ii1o01i12.I0000Il00O, 0, objArrCopyOf, ii1o01i1.I00000oIO, ii1o01i12.I00000oIO);
/* 62 */                    ii1o01i1 = new iI1O01I1(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    ii1o01i1.getClass();
/* 73 */                    if (!ii1o01i12.equals(ii1o01i13)) {
/* 78 */                        if (!ii1o01i1.I0000oI00) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = ii1o01i1.I00000oIO + ii1o01i12.I00000oIO;
/* 85 */                        ii1o01i1.I0000oI00(i2);
/* 96 */                        System.arraycopy(ii1o01i12.I00000oOI, 0, ii1o01i1.I00000oOI, ii1o01i1.I00000oIO, ii1o01i12.I00000oIO);
/* 107 */                       System.arraycopy(ii1o01i12.I0000Il00O, 0, ii1o01i1.I0000Il00O, ii1o01i1.I00000oIO, ii1o01i12.I00000oIO);
/* 110 */                       ii1o01i1.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           i1oi01olli.zzc = ii1o01i1;
                }

                public static Object I0000Il00O(Object obj, int i, iI00IlI1oII ii00ili1oii, i1iOOl0o i1iool0o, Object obj2, O1oO0lOoI1 o1oO0lOoI1) {
/* 1 */             if (i1iool0o == null) {
/* 3 */                 return obj2;
                    }
/* 4 */             if (ii00ili1oii == null) {
/* 76 */                Iterator it = ii00ili1oii.iterator();
/* 84 */                while (it.hasNext()) {
/* 92 */                    int iIntValue = ((Integer) it.next()).intValue();
/* 100 */                   if (!i1iool0o.I00000oIO(iIntValue)) {
/* 102 */                       if (obj2 == null) {
/* 104 */                           o1oO0lOoI1.getClass();
/* 107 */                           obj2 = O1oO0lOoI1.I0001Ioi1lo(obj);
                                }
/* 112 */                       o1oO0lOoI1.getClass();
/* 124 */                       ((iI1O01I1) obj2).I0000O(i << 3, Long.valueOf(iIntValue));
/* 127 */                       it.remove();
                            }
                        }
/* 685 */               return obj2;
                    }
/* 6 */             int size = ii00ili1oii.size();
/* 11 */            int i2 = 0;
/* 12 */            for (int i3 = 0; i3 < size; i3++) {
/* 18 */                Integer num = (Integer) ii00ili1oii.get(i3);
/* 20 */                int iIntValue2 = num.intValue();
/* 28 */                if (i1iool0o.I00000oIO(iIntValue2)) {
/* 30 */                    if (i3 != i2) {
/* 32 */                        ii00ili1oii.set(i2, num);
                            }
/* 35 */                    i2++;
                        } else {
/* 38 */                    if (obj2 == null) {
/* 40 */                        o1oO0lOoI1.getClass();
/* 43 */                        obj2 = O1oO0lOoI1.I0001Ioi1lo(obj);
                            }
/* 48 */                    o1oO0lOoI1.getClass();
/* 60 */                    ((iI1O01I1) obj2).I0000O(i << 3, Long.valueOf(iIntValue2));
                        }
                    }
/* 66 */            if (i2 != size) {
/* 72 */                ii00ili1oii.subList(i2, size).clear();
                    }
/* 75 */            return obj2;
                }

                public static void I0000O(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof i1loo0OlO) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    i1lllo0.I000OOo1O(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            i1lllo0.I0000O(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            i1lllo0.I0010I0i(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                i1lllo0.I001IIilI0O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0000oI00(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof i1oIillO1io1) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    i1lllo0.I000II(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            i1lllo0.I0000O(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Float) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            i1lllo0.I0010I0i(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                i1lllo0.I0010o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0001Ioi1lo(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof iI0Il0IoIil)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       i1lllo0.I000O01llI0(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                i1lllo0.I0000O(i, 2);
/* 81 */                int iI00000oOI = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oOI += i1lllO0.I00000oOI(((Long) list.get(i3)).longValue());
                        }
/* 106 */               i1lllo0.I0010I0i(iI00000oOI);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   i1lllo0.I00111O(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < ii0il0ioiil.I00iiO) {
/* 69 */                    i1lllo0.I000O01llI0(i, ii0il0ioiil.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0il0ioiil.I00iiO; i4++) {
/* 40 */                iI00000oOI2 += i1lllO0.I00000oOI(ii0il0ioiil.I0000O(i4));
                    }
/* 44 */            i1lllo0.I0010I0i(iI00000oOI2);
/* 49 */            while (i2 < ii0il0ioiil.I00iiO) {
/* 55 */                i1lllo0.I00111O(ii0il0ioiil.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static void I000II(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof iI0Il0IoIil)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       i1lllo0.I000O01llI0(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                i1lllo0.I0000O(i, 2);
/* 81 */                int iI00000oOI = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oOI += i1lllO0.I00000oOI(((Long) list.get(i3)).longValue());
                        }
/* 106 */               i1lllo0.I0010I0i(iI00000oOI);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   i1lllo0.I00111O(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < ii0il0ioiil.I00iiO) {
/* 69 */                    i1lllo0.I000O01llI0(i, ii0il0ioiil.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0il0ioiil.I00iiO; i4++) {
/* 40 */                iI00000oOI2 += i1lllO0.I00000oOI(ii0il0ioiil.I0000O(i4));
                    }
/* 44 */            i1lllo0.I0010I0i(iI00000oOI2);
/* 49 */            while (i2 < ii0il0ioiil.I00iiO) {
/* 55 */                i1lllo0.I00111O(ii0il0ioiil.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static void I000O01llI0(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 18 */            int i2 = 0;
/* 19 */            if (!(list instanceof iI0Il0IoIil)) {
/* 89 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 165 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 173 */                       i1lllo0.I000O01llI0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 176 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                i1lllo0.I0000O(i, 2);
/* 95 */                int iI00000oOI = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iI00000oOI += i1lllO0.I00000oOI((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               i1lllo0.I0010I0i(iI00000oOI);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   i1lllo0.I00111O((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 23 */            if (!z) {
/* 73 */                while (i2 < ii0il0ioiil.I00iiO) {
/* 75 */                    long jI0000O = ii0il0ioiil.I0000O(i2);
/* 83 */                    i1lllo0.I000O01llI0(i, (jI0000O >> 63) ^ (jI0000O + jI0000O));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 25 */            i1lllo0.I0000O(i, 2);
/* 29 */            int iI00000oOI2 = 0;
/* 32 */            for (int i4 = 0; i4 < ii0il0ioiil.I00iiO; i4++) {
/* 34 */                long jI0000O2 = ii0il0ioiil.I0000O(i4);
/* 46 */                iI00000oOI2 += i1lllO0.I00000oOI((jI0000O2 >> 63) ^ (jI0000O2 + jI0000O2));
                    }
/* 50 */            i1lllo0.I0010I0i(iI00000oOI2);
/* 55 */            while (i2 < ii0il0ioiil.I00iiO) {
/* 57 */                long jI0000O3 = ii0il0ioiil.I0000O(i2);
/* 65 */                i1lllo0.I00111O((jI0000O3 >> 63) ^ (jI0000O3 + jI0000O3));
/* 68 */                i2++;
                    }
                }

                public static void I000OOo1O(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof iI0Il0IoIil)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i1lllo0.I000OOo1O(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i1lllo0.I0000O(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                i1lllo0.I0010I0i(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i1lllo0.I001IIilI0O(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < ii0il0ioiil.I00iiO) {
/* 65 */                    i1lllo0.I000OOo1O(i, ii0il0ioiil.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0il0ioiil.I00iiO; i6++) {
/* 32 */                ii0il0ioiil.I0000O(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            i1lllo0.I0010I0i(i5);
/* 45 */            while (i2 < ii0il0ioiil.I00iiO) {
/* 51 */                i1lllo0.I001IIilI0O(ii0il0ioiil.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I000OiO(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof iI0Il0IoIil)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i1lllo0.I000OOo1O(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i1lllo0.I0000O(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                i1lllo0.I0010I0i(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i1lllo0.I001IIilI0O(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < ii0il0ioiil.I00iiO) {
/* 65 */                    i1lllo0.I000OOo1O(i, ii0il0ioiil.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0il0ioiil.I00iiO; i6++) {
/* 32 */                ii0il0ioiil.I0000O(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            i1lllo0.I0010I0i(i5);
/* 45 */            while (i2 < ii0il0ioiil.I00iiO) {
/* 51 */                i1lllo0.I001IIilI0O(ii0il0ioiil.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I000iOII(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i1oiI1lIo)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       i1lllo0.I0000oI00(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                i1lllo0.I0000O(i, 2);
/* 82 */                int iI00000oOI = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI00000oOI += i1lllO0.I00000oOI(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               i1lllo0.I0010I0i(iI00000oOI);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   i1lllo0.I00100o1O0lo(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < i1oii1lio.I00iiO) {
/* 70 */                    i1lllo0.I0000oI00(i, i1oii1lio.I0000oI00(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < i1oii1lio.I00iiO; i4++) {
/* 41 */                iI00000oOI2 += i1lllO0.I00000oOI(i1oii1lio.I0000oI00(i4));
                    }
/* 45 */            i1lllo0.I0010I0i(iI00000oOI2);
/* 50 */            while (i2 < i1oii1lio.I00iiO) {
/* 56 */                i1lllo0.I00100o1O0lo(i1oii1lio.I0000oI00(i2));
/* 59 */                i2++;
                    }
                }

                public static void I000l1(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i1oiI1lIo)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       i1lllo0.I0001Ioi1lo(i, ((Integer) list.get(i2)).intValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                i1lllo0.I0000O(i, 2);
/* 81 */                int iI00000oIO = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oIO += i1lllO0.I00000oIO(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               i1lllo0.I0010I0i(iI00000oIO);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   i1lllo0.I0010I0i(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < i1oii1lio.I00iiO) {
/* 69 */                    i1lllo0.I0001Ioi1lo(i, i1oii1lio.I0000oI00(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < i1oii1lio.I00iiO; i4++) {
/* 40 */                iI00000oIO2 += i1lllO0.I00000oIO(i1oii1lio.I0000oI00(i4));
                    }
/* 44 */            i1lllo0.I0010I0i(iI00000oIO2);
/* 49 */            while (i2 < i1oii1lio.I00iiO) {
/* 55 */                i1lllo0.I0010I0i(i1oii1lio.I0000oI00(i2));
/* 58 */                i2++;
                    }
                }

                public static void I000lI(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i1oiI1lIo)) {
/* 90 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 168 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 177 */                       i1lllo0.I0001Ioi1lo(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 180 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 92 */                i1lllo0.I0000O(i, 2);
/* 96 */                int iI00000oIO = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iI00000oIO += i1lllO0.I00000oIO((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               i1lllo0.I0010I0i(iI00000oIO);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   i1lllo0.I0010I0i((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 21 */            if (!z) {
/* 73 */                while (i2 < i1oii1lio.I00iiO) {
/* 75 */                    int iI0000oI00 = i1oii1lio.I0000oI00(i2);
/* 84 */                    i1lllo0.I0001Ioi1lo(i, (iI0000oI00 >> 31) ^ (iI0000oI00 + iI0000oI00));
/* 87 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < i1oii1lio.I00iiO; i4++) {
/* 32 */                int iI0000oI002 = i1oii1lio.I0000oI00(i4);
/* 45 */                iI00000oIO2 += i1lllO0.I00000oIO((iI0000oI002 >> 31) ^ (iI0000oI002 + iI0000oI002));
                    }
/* 49 */            i1lllo0.I0010I0i(iI00000oIO2);
/* 54 */            while (i2 < i1oii1lio.I00iiO) {
/* 56 */                int iI0000oI003 = i1oii1lio.I0000oI00(i2);
/* 65 */                i1lllo0.I0010I0i((iI0000oI003 >> 31) ^ (iI0000oI003 + iI0000oI003));
/* 68 */                i2++;
                    }
                }

                public static void I000o00OoI0I(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i1oiI1lIo)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i1lllo0.I000II(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i1lllo0.I0000O(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                i1lllo0.I0010I0i(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i1lllo0.I0010o(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < i1oii1lio.I00iiO) {
/* 65 */                    i1lllo0.I000II(i, i1oii1lio.I0000oI00(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i1oii1lio.I00iiO; i6++) {
/* 32 */                i1oii1lio.I0000oI00(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            i1lllo0.I0010I0i(i5);
/* 45 */            while (i2 < i1oii1lio.I00iiO) {
/* 51 */                i1lllo0.I0010o(i1oii1lio.I0000oI00(i2));
/* 54 */                i2++;
                    }
                }

                public static void I000oI1ioi(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i1oiI1lIo)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i1lllo0.I000II(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i1lllo0.I0000O(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                i1lllo0.I0010I0i(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i1lllo0.I0010o(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < i1oii1lio.I00iiO) {
/* 65 */                    i1lllo0.I000II(i, i1oii1lio.I0000oI00(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i1oii1lio.I00iiO; i6++) {
/* 32 */                i1oii1lio.I0000oI00(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            i1lllo0.I0010I0i(i5);
/* 45 */            while (i2 < i1oii1lio.I00iiO) {
/* 51 */                i1lllo0.I0010o(i1oii1lio.I0000oI00(i2));
/* 54 */                i2++;
                    }
                }

                public static void I00100l0(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i1oiI1lIo)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       i1lllo0.I0000oI00(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                i1lllo0.I0000O(i, 2);
/* 82 */                int iI00000oOI = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI00000oOI += i1lllO0.I00000oOI(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               i1lllo0.I0010I0i(iI00000oOI);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   i1lllo0.I00100o1O0lo(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < i1oii1lio.I00iiO) {
/* 70 */                    i1lllo0.I0000oI00(i, i1oii1lio.I0000oI00(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i1lllo0.I0000O(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < i1oii1lio.I00iiO; i4++) {
/* 41 */                iI00000oOI2 += i1lllO0.I00000oOI(i1oii1lio.I0000oI00(i4));
                    }
/* 45 */            i1lllo0.I0010I0i(iI00000oOI2);
/* 50 */            while (i2 < i1oii1lio.I00iiO) {
/* 56 */                i1lllo0.I00100o1O0lo(i1oii1lio.I0000oI00(i2));
/* 59 */                i2++;
                    }
                }

                public static void I00100o1O0lo(int i, List list, Oi1ol0llI oi1ol0llI, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 15 */            if (list instanceof i1l0lll) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    i1lllo0.I000OiO(i, ((Boolean) list.get(i2)).booleanValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            i1lllo0.I0000O(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            i1lllo0.I0010I0i(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                i1lllo0.I00100l0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 68 */                i2++;
                    }
                }

                public static int I0010I0i(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof iI0Il0IoIil)) {
/* 31 */                int iI00000oOI = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oOI += i1lllO0.I00000oOI(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oOI2 += i1lllO0.I00000oOI(ii0il0ioiil.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oOI2;
                }

                public static int I0010o(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof iI0Il0IoIil)) {
/* 31 */                int iI00000oOI = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oOI += i1lllO0.I00000oOI(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oOI2 += i1lllO0.I00000oOI(ii0il0ioiil.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oOI2;
                }

                public static int I00111O(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof iI0Il0IoIil)) {
/* 37 */                int iI00000oOI = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iI00000oOI += i1lllO0.I00000oOI((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 15 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) list;
/* 17 */            int iI00000oOI2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jI0000O = ii0il0ioiil.I0000O(i);
/* 32 */                iI00000oOI2 += i1lllO0.I00000oOI((jI0000O >> 63) ^ (jI0000O + jI0000O));
/* 33 */                i++;
                    }
/* 36 */            return iI00000oOI2;
                }

                public static int I001IIilI0O(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i1oiI1lIo)) {
/* 32 */                int iI00000oOI = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI00000oOI += i1lllO0.I00000oOI(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI00000oOI2 += i1lllO0.I00000oOI(i1oii1lio.I0000oI00(i));
/* 28 */                i++;
                    }
/* 31 */            return iI00000oOI2;
                }

                public static int I001IO000(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i1oiI1lIo)) {
/* 32 */                int iI00000oOI = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI00000oOI += i1lllO0.I00000oOI(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI00000oOI2 += i1lllO0.I00000oOI(i1oii1lio.I0000oI00(i));
/* 28 */                i++;
                    }
/* 31 */            return iI00000oOI2;
                }

                public static int I001i1O0Ol(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i1oiI1lIo)) {
/* 31 */                int iI00000oIO = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oIO += i1lllO0.I00000oIO(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oIO2 += i1lllO0.I00000oIO(i1oii1lio.I0000oI00(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oIO2;
                }

                public static int I001i1lo1io(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i1oiI1lIo)) {
/* 36 */                int iI00000oIO = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iI00000oIO += i1lllO0.I00000oIO((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iI0000oI00 = i1oii1lio.I0000oI00(i);
/* 31 */                iI00000oIO2 += i1lllO0.I00000oIO((iI0000oI00 >> 31) ^ (iI0000oI00 + iI0000oI00));
/* 32 */                i++;
                    }
/* 35 */            return iI00000oIO2;
                }

                public static int I001iOo1i0O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (i1lllO0.I00000oIO(i << 3) + 4) * size;
                }

                public static int I001l0I00(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (i1lllO0.I00000oIO(i << 3) + 8) * size;
                }
            }
