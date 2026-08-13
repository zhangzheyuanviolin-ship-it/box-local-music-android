            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class ii0olI1ooOiO {
                public static final i1i0olI I00000oIO;

                static {
/* 1 */             ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
/* 9 */             I00000oIO = new i1i0olI(7);
                }

                public static void I00000oIO(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0l0Ol0i)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       ii0i1il.I000lI(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                ii0i1il.I001i1O0Ol(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                ii0i1il.I001iOo1i0O(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   ii0i1il.I000o00OoI0I(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < ii0l0ol0i.I00iiO) {
/* 65 */                    ii0i1il.I000lI(i, ii0l0ol0i.I00000oOI(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0l0ol0i.I00iiO; i6++) {
/* 32 */                ii0l0ol0i.I00000oOI(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            ii0i1il.I001iOo1i0O(i5);
/* 45 */            while (i2 < ii0l0ol0i.I00iiO) {
/* 51 */                ii0i1il.I000o00OoI0I(ii0l0ol0i.I00000oOI(i2));
/* 54 */                i2++;
                    }
                }

                public static void I00000oOI(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 90 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 168 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 177 */                       ii0i1il.I001i1lo1io(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 180 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 92 */                ii0i1il.I001i1O0Ol(i, 2);
/* 96 */                int iI00000oOI = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iI00000oOI += ii0I1Il.I00000oOI((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               ii0i1il.I001iOo1i0O(iI00000oOI);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   ii0i1il.I001iOo1i0O((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 21 */            if (!z) {
/* 73 */                while (i2 < ii0i0iiooilo.I00iiO) {
/* 75 */                    int iI00000oOI2 = ii0i0iiooilo.I00000oOI(i2);
/* 84 */                    ii0i1il.I001i1lo1io(i, (iI00000oOI2 >> 31) ^ (iI00000oOI2 + iI00000oOI2));
/* 87 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int iI00000oOI3 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0i0iiooilo.I00iiO; i4++) {
/* 32 */                int iI00000oOI4 = ii0i0iiooilo.I00000oOI(i4);
/* 45 */                iI00000oOI3 += ii0I1Il.I00000oOI((iI00000oOI4 >> 31) ^ (iI00000oOI4 + iI00000oOI4));
                    }
/* 49 */            ii0i1il.I001iOo1i0O(iI00000oOI3);
/* 54 */            while (i2 < ii0i0iiooilo.I00iiO) {
/* 56 */                int iI00000oOI5 = ii0i0iiooilo.I00000oOI(i2);
/* 65 */                ii0i1il.I001iOo1i0O((iI00000oOI5 >> 31) ^ (iI00000oOI5 + iI00000oOI5));
/* 68 */                i2++;
                    }
                }

                public static void I0000Il00O(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 18 */            int i2 = 0;
/* 19 */            if (!(list instanceof ii0l0Ol0i)) {
/* 89 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 165 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 173 */                       ii0i1il.I001l0I00(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 176 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                ii0i1il.I001i1O0Ol(i, 2);
/* 95 */                int iI0000Il00O = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iI0000Il00O += ii0I1Il.I0000Il00O((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               ii0i1il.I001iOo1i0O(iI0000Il00O);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   ii0i1il.I001lIiIIo1O((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 23 */            if (!z) {
/* 73 */                while (i2 < ii0l0ol0i.I00iiO) {
/* 75 */                    long jI00000oOI = ii0l0ol0i.I00000oOI(i2);
/* 83 */                    ii0i1il.I001l0I00(i, (jI00000oOI >> 63) ^ (jI00000oOI + jI00000oOI));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 25 */            ii0i1il.I001i1O0Ol(i, 2);
/* 29 */            int iI0000Il00O2 = 0;
/* 32 */            for (int i4 = 0; i4 < ii0l0ol0i.I00iiO; i4++) {
/* 34 */                long jI00000oOI2 = ii0l0ol0i.I00000oOI(i4);
/* 46 */                iI0000Il00O2 += ii0I1Il.I0000Il00O((jI00000oOI2 >> 63) ^ (jI00000oOI2 + jI00000oOI2));
                    }
/* 50 */            ii0i1il.I001iOo1i0O(iI0000Il00O2);
/* 55 */            while (i2 < ii0l0ol0i.I00iiO) {
/* 57 */                long jI00000oOI3 = ii0l0ol0i.I00000oOI(i2);
/* 65 */                ii0i1il.I001lIiIIo1O((jI00000oOI3 >> 63) ^ (jI00000oOI3 + jI00000oOI3));
/* 68 */                i2++;
                    }
                }

                public static void I0000O(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       ii0i1il.I001i1lo1io(i, ((Integer) list.get(i2)).intValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                ii0i1il.I001i1O0Ol(i, 2);
/* 81 */                int iI00000oOI = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oOI += ii0I1Il.I00000oOI(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               ii0i1il.I001iOo1i0O(iI00000oOI);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   ii0i1il.I001iOo1i0O(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < ii0i0iiooilo.I00iiO) {
/* 69 */                    ii0i1il.I001i1lo1io(i, ii0i0iiooilo.I00000oOI(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0i0iiooilo.I00iiO; i4++) {
/* 40 */                iI00000oOI2 += ii0I1Il.I00000oOI(ii0i0iiooilo.I00000oOI(i4));
                    }
/* 44 */            ii0i1il.I001iOo1i0O(iI00000oOI2);
/* 49 */            while (i2 < ii0i0iiooilo.I00iiO) {
/* 55 */                ii0i1il.I001iOo1i0O(ii0i0iiooilo.I00000oOI(i2));
/* 58 */                i2++;
                    }
                }

                public static void I0000oI00(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0l0Ol0i)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       ii0i1il.I001l0I00(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                ii0i1il.I001i1O0Ol(i, 2);
/* 81 */                int iI0000Il00O = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI0000Il00O += ii0I1Il.I0000Il00O(((Long) list.get(i3)).longValue());
                        }
/* 106 */               ii0i1il.I001iOo1i0O(iI0000Il00O);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   ii0i1il.I001lIiIIo1O(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < ii0l0ol0i.I00iiO) {
/* 69 */                    ii0i1il.I001l0I00(i, ii0l0ol0i.I00000oOI(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0l0ol0i.I00iiO; i4++) {
/* 40 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0l0ol0i.I00000oOI(i4));
                    }
/* 44 */            ii0i1il.I001iOo1i0O(iI0000Il00O2);
/* 49 */            while (i2 < ii0l0ol0i.I00iiO) {
/* 55 */                ii0i1il.I001lIiIIo1O(ii0l0ol0i.I00000oOI(i2));
/* 58 */                i2++;
                    }
                }

                public static boolean I0001Ioi1lo(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static int I000II(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 32 */                int iI0000Il00O = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI0000Il00O += ii0I1Il.I0000Il00O(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0i0iiooilo.I00000oOI(i));
/* 28 */                i++;
                    }
/* 31 */            return iI0000Il00O2;
                }

                public static int I000O01llI0(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (ii0I1Il.I00000oOI(i << 3) + 4) * size;
                }

                public static int I000OOo1O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (ii0I1Il.I00000oOI(i << 3) + 8) * size;
                }

                public static int I000OiO(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 32 */                int iI0000Il00O = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI0000Il00O += ii0I1Il.I0000Il00O(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0i0iiooilo.I00000oOI(i));
/* 28 */                i++;
                    }
/* 31 */            return iI0000Il00O2;
                }

                public static int I000iOII(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof ii0l0Ol0i)) {
/* 31 */                int iI0000Il00O = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI0000Il00O += ii0I1Il.I0000Il00O(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0l0ol0i.I00000oOI(i));
/* 27 */                i++;
                    }
/* 30 */            return iI0000Il00O2;
                }

                public static int I000l1(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 36 */                int iI00000oOI = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iI00000oOI += ii0I1Il.I00000oOI((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iI00000oOI3 = ii0i0iiooilo.I00000oOI(i);
/* 31 */                iI00000oOI2 += ii0I1Il.I00000oOI((iI00000oOI3 >> 31) ^ (iI00000oOI3 + iI00000oOI3));
/* 32 */                i++;
                    }
/* 35 */            return iI00000oOI2;
                }

                public static int I000lI(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof ii0l0Ol0i)) {
/* 37 */                int iI0000Il00O = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iI0000Il00O += ii0I1Il.I0000Il00O((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 15 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 17 */            int iI0000Il00O2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jI00000oOI = ii0l0ol0i.I00000oOI(i);
/* 32 */                iI0000Il00O2 += ii0I1Il.I0000Il00O((jI00000oOI >> 63) ^ (jI00000oOI + jI00000oOI));
/* 33 */                i++;
                    }
/* 36 */            return iI0000Il00O2;
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 31 */                int iI00000oOI = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oOI += ii0I1Il.I00000oOI(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oOI2 += ii0I1Il.I00000oOI(ii0i0iiooilo.I00000oOI(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oOI2;
                }

                public static int I000oI1ioi(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof ii0l0Ol0i)) {
/* 31 */                int iI0000Il00O = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI0000Il00O += ii0I1Il.I0000Il00O(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0l0ol0i.I00000oOI(i));
/* 27 */                i++;
                    }
/* 30 */            return iI0000Il00O2;
                }

                public static Object I00100l0(Object obj, int i, ii0i1l11 ii0i1l11Var, ii0i10o ii0i10oVar, Object obj2, i1i0olI i1i0oli) {
/* 1 */             if (ii0i10oVar == null) {
/* 3 */                 return obj2;
                    }
/* 4 */             if (ii0i1l11Var == null) {
/* 76 */                Iterator it = ii0i1l11Var.iterator();
/* 84 */                while (it.hasNext()) {
/* 92 */                    int iIntValue = ((Integer) it.next()).intValue();
/* 100 */                   if (!ii0i10oVar.zza(iIntValue)) {
/* 102 */                       if (obj2 == null) {
/* 104 */                           i1i0oli.getClass();
/* 107 */                           obj2 = i1i0olI.I0010I0i(obj);
                                }
/* 112 */                       i1i0oli.getClass();
/* 124 */                       ((ii10O1i0I) obj2).I0000Il00O(i << 3, Long.valueOf(iIntValue));
/* 127 */                       it.remove();
                            }
                        }
/* 685 */               return obj2;
                    }
/* 6 */             int size = ii0i1l11Var.size();
/* 11 */            int i2 = 0;
/* 12 */            for (int i3 = 0; i3 < size; i3++) {
/* 18 */                Integer num = (Integer) ii0i1l11Var.get(i3);
/* 20 */                int iIntValue2 = num.intValue();
/* 28 */                if (ii0i10oVar.zza(iIntValue2)) {
/* 30 */                    if (i3 != i2) {
/* 32 */                        ii0i1l11Var.set(i2, num);
                            }
/* 35 */                    i2++;
                        } else {
/* 38 */                    if (obj2 == null) {
/* 40 */                        i1i0oli.getClass();
/* 43 */                        obj2 = i1i0olI.I0010I0i(obj);
                            }
/* 48 */                    i1i0oli.getClass();
/* 60 */                    ((ii10O1i0I) obj2).I0000Il00O(i << 3, Long.valueOf(iIntValue2));
                        }
                    }
/* 66 */            if (i2 != size) {
/* 72 */                ii0i1l11Var.subList(i2, size).clear();
                    }
/* 75 */            return obj2;
                }

                public static void I00100o1O0lo(Object obj, Object obj2) {
/* 5 */             ii0oll0il ii0oll0ilVar = ((ii0Oi0OiillI) obj2).zzb.I00000oIO;
/* 11 */            if (ii0oll0ilVar.isEmpty()) {
/* 106 */               return;
                    }
/* 15 */            ii0O1Ol1i ii0o1ol1iI00111O = ((ii0Oi0OiillI) obj).I00111O();
/* 22 */            if (ii0oll0ilVar.I00iiI > 0) {
/* 54 */                ii0o1ol1iI00111O.I000II(ii0oll0ilVar.I0000Il00O(0));
/* 57 */                throw null;
                    }
/* 28 */            Iterator it = ii0oll0ilVar.I00000oIO().iterator();
/* 36 */            if (it.hasNext()) {
/* 45 */                ii0o1ol1iI00111O.I000II((Map.Entry) it.next());
/* 48 */                throw null;
                    }
                }

                public static void I0010I0i(Object obj, Object obj2) {
/* 1 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) obj;
/* 3 */             ii10O1i0I ii10o1i0i = ii0oooo10.zzc;
/* 7 */             ii10O1i0I ii10o1i0i2 = ((ii0OoOo10) obj2).zzc;
/* 9 */             ii10O1i0I ii10o1i0i3 = ii10O1i0I.I0001Ioi1lo;
/* 15 */            if (!ii10o1i0i3.equals(ii10o1i0i2)) {
/* 22 */                if (ii10o1i0i3.equals(ii10o1i0i)) {
/* 28 */                    int i = ii10o1i0i.I00000oIO + ii10o1i0i2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(ii10o1i0i.I00000oOI, i);
/* 41 */                    System.arraycopy(ii10o1i0i2.I00000oOI, 0, iArrCopyOf, ii10o1i0i.I00000oIO, ii10o1i0i2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(ii10o1i0i.I0000Il00O, i);
/* 56 */                    System.arraycopy(ii10o1i0i2.I0000Il00O, 0, objArrCopyOf, ii10o1i0i.I00000oIO, ii10o1i0i2.I00000oIO);
/* 62 */                    ii10o1i0i = new ii10O1i0I(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    ii10o1i0i.getClass();
/* 73 */                    if (!ii10o1i0i2.equals(ii10o1i0i3)) {
/* 78 */                        if (!ii10o1i0i.I0000oI00) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = ii10o1i0i.I00000oIO + ii10o1i0i2.I00000oIO;
/* 85 */                        ii10o1i0i.I0000oI00(i2);
/* 96 */                        System.arraycopy(ii10o1i0i2.I00000oOI, 0, ii10o1i0i.I00000oOI, ii10o1i0i.I00000oIO, ii10o1i0i2.I00000oIO);
/* 107 */                       System.arraycopy(ii10o1i0i2.I0000Il00O, 0, ii10o1i0i.I0000Il00O, ii10o1i0i.I00000oIO, ii10o1i0i2.I00000oIO);
/* 110 */                       ii10o1i0i.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           ii0oooo10.zzc = ii10o1i0i;
                }

                public static void I0010o(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 15 */            if (list instanceof ii011Ol0li) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    ii0i1il.I0001Ioi1lo(i, ((Boolean) list.get(i2)).booleanValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ii0i1il.I001i1O0Ol(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            ii0i1il.I001iOo1i0O(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                ii0i1il.I0000oI00(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 68 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 15 */            if (list instanceof ii0I1oIOi) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    ii0i1il.I000lI(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ii0i1il.I001i1O0Ol(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            ii0i1il.I001iOo1i0O(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                ii0i1il.I000o00OoI0I(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       ii0i1il.I000oI1ioi(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                ii0i1il.I001i1O0Ol(i, 2);
/* 82 */                int iI0000Il00O = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI0000Il00O += ii0I1Il.I0000Il00O(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               ii0i1il.I001iOo1i0O(iI0000Il00O);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   ii0i1il.I00100l0(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < ii0i0iiooilo.I00iiO) {
/* 70 */                    ii0i1il.I000oI1ioi(i, ii0i0iiooilo.I00000oOI(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0i0iiooilo.I00iiO; i4++) {
/* 41 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0i0iiooilo.I00000oOI(i4));
                    }
/* 45 */            ii0i1il.I001iOo1i0O(iI0000Il00O2);
/* 50 */            while (i2 < ii0i0iiooilo.I00iiO) {
/* 56 */                ii0i1il.I00100l0(ii0i0iiooilo.I00000oOI(i2));
/* 59 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       ii0i1il.I000iOII(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                ii0i1il.I001i1O0Ol(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                ii0i1il.I001iOo1i0O(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   ii0i1il.I000l1(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < ii0i0iiooilo.I00iiO) {
/* 65 */                    ii0i1il.I000iOII(i, ii0i0iiooilo.I00000oOI(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0i0iiooilo.I00iiO; i6++) {
/* 32 */                ii0i0iiooilo.I00000oOI(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            ii0i1il.I001iOo1i0O(i5);
/* 45 */            while (i2 < ii0i0iiooilo.I00iiO) {
/* 51 */                ii0i1il.I000l1(ii0i0iiooilo.I00000oOI(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0l0Ol0i)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       ii0i1il.I000lI(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                ii0i1il.I001i1O0Ol(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                ii0i1il.I001iOo1i0O(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   ii0i1il.I000o00OoI0I(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < ii0l0ol0i.I00iiO) {
/* 65 */                    ii0i1il.I000lI(i, ii0l0ol0i.I00000oOI(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0l0ol0i.I00iiO; i6++) {
/* 32 */                ii0l0ol0i.I00000oOI(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            ii0i1il.I001iOo1i0O(i5);
/* 45 */            while (i2 < ii0l0ol0i.I00iiO) {
/* 51 */                ii0i1il.I000o00OoI0I(ii0l0ol0i.I00000oOI(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0OII0ll)) {
/* 89 */                if (!z) {
/* 149 */                   while (i2 < list.size()) {
/* 165 */                       ii0i1il.I000iOII(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 168 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                ii0i1il.I001i1O0Ol(i, 2);
/* 95 */                int i3 = 0;
/* 100 */               for (int i4 = 0; i4 < list.size(); i4++) {
/* 108 */                   ((Float) list.get(i4)).getClass();
/* 111 */                   i3 += 4;
                        }
/* 116 */               ii0i1il.I001iOo1i0O(i3);
/* 123 */               while (i2 < list.size()) {
/* 139 */                   ii0i1il.I000l1(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 142 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0OII0ll ii0oii0ll = (ii0OII0ll) list;
/* 21 */            if (!z) {
/* 70 */                while (i2 < ii0oii0ll.I00iiO) {
/* 72 */                    ii0oii0ll.I0000O(i2);
/* 83 */                    ii0i1il.I000iOII(i, Float.floatToRawIntBits(ii0oii0ll.I00iiI[i2]));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0oii0ll.I00iiO; i6++) {
/* 32 */                ii0oii0ll.I0000O(i6);
/* 37 */                float f = ii0oii0ll.I00iiI[i6];
/* 39 */                i5 += 4;
                    }
/* 44 */            ii0i1il.I001iOo1i0O(i5);
/* 49 */            while (i2 < ii0oii0ll.I00iiO) {
/* 51 */                ii0oii0ll.I0000O(i2);
/* 62 */                ii0i1il.I000l1(Float.floatToRawIntBits(ii0oii0ll.I00iiI[i2]));
/* 65 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       ii0i1il.I000oI1ioi(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                ii0i1il.I001i1O0Ol(i, 2);
/* 82 */                int iI0000Il00O = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI0000Il00O += ii0I1Il.I0000Il00O(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               ii0i1il.I001iOo1i0O(iI0000Il00O);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   ii0i1il.I00100l0(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < ii0i0iiooilo.I00iiO) {
/* 70 */                    ii0i1il.I000oI1ioi(i, ii0i0iiooilo.I00000oOI(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0i0iiooilo.I00iiO; i4++) {
/* 41 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0i0iiooilo.I00000oOI(i4));
                    }
/* 45 */            ii0i1il.I001iOo1i0O(iI0000Il00O2);
/* 50 */            while (i2 < ii0i0iiooilo.I00iiO) {
/* 56 */                ii0i1il.I00100l0(ii0i0iiooilo.I00000oOI(i2));
/* 59 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0l0Ol0i)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       ii0i1il.I001l0I00(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                ii0i1il.I001i1O0Ol(i, 2);
/* 81 */                int iI0000Il00O = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI0000Il00O += ii0I1Il.I0000Il00O(((Long) list.get(i3)).longValue());
                        }
/* 106 */               ii0i1il.I001iOo1i0O(iI0000Il00O);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   ii0i1il.I001lIiIIo1O(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0l0Ol0i ii0l0ol0i = (ii0l0Ol0i) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < ii0l0ol0i.I00iiO) {
/* 69 */                    ii0i1il.I001l0I00(i, ii0l0ol0i.I00000oOI(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < ii0l0ol0i.I00iiO; i4++) {
/* 40 */                iI0000Il00O2 += ii0I1Il.I0000Il00O(ii0l0ol0i.I00000oOI(i4));
                    }
/* 44 */            ii0i1il.I001iOo1i0O(iI0000Il00O2);
/* 49 */            while (i2 < ii0l0ol0i.I00iiO) {
/* 55 */                ii0i1il.I001lIiIIo1O(ii0l0ol0i.I00000oOI(i2));
/* 58 */                i2++;
                    }
                }

                public static void I001lIiIIo1O(int i, List list, i0OI1l1Oo i0oi1l1oo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof ii0i0iiOoIlo)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       ii0i1il.I000iOII(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                ii0i1il.I001i1O0Ol(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                ii0i1il.I001iOo1i0O(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   ii0i1il.I000l1(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < ii0i0iiooilo.I00iiO) {
/* 65 */                    ii0i1il.I000iOII(i, ii0i0iiooilo.I00000oOI(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ii0i1il.I001i1O0Ol(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ii0i0iiooilo.I00iiO; i6++) {
/* 32 */                ii0i0iiooilo.I00000oOI(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            ii0i1il.I001iOo1i0O(i5);
/* 45 */            while (i2 < ii0i0iiooilo.I00iiO) {
/* 51 */                ii0i1il.I000l1(ii0i0iiooilo.I00000oOI(i2));
/* 54 */                i2++;
                    }
                }
            }
