            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class i11o00oiil {
                public static final loIOiIO1O1 I00000oIO;

                static {
/* 1 */             i11liii0 i11liii0Var = i11liii0.I0000Il00O;
/* 10 */            I00000oIO = new loIOiIO1O1(17);
                }

                public static void I00000oIO(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11OIo)) {
/* 90 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 168 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 177 */                       i11i0o0ii.I00100l0(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 180 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 92 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 96 */                int iI00000oOI = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iI00000oOI += i11I0o0ii.I00000oOI((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               i11i0o0ii.I00100o1O0lo(iI00000oOI);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   i11i0o0ii.I00100o1O0lo((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11OIo i11oio = (i11OIo) list;
/* 21 */            if (!z) {
/* 73 */                while (i2 < i11oio.I00iiO) {
/* 75 */                    int iI0000O = i11oio.I0000O(i2);
/* 84 */                    i11i0o0ii.I00100l0(i, (iI0000O >> 31) ^ (iI0000O + iI0000O));
/* 87 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < i11oio.I00iiO; i4++) {
/* 32 */                int iI0000O2 = i11oio.I0000O(i4);
/* 45 */                iI00000oOI2 += i11I0o0ii.I00000oOI((iI0000O2 >> 31) ^ (iI0000O2 + iI0000O2));
                    }
/* 49 */            i11i0o0ii.I00100o1O0lo(iI00000oOI2);
/* 54 */            while (i2 < i11oio.I00iiO) {
/* 56 */                int iI0000O3 = i11oio.I0000O(i2);
/* 65 */                i11i0o0ii.I00100o1O0lo((iI0000O3 >> 31) ^ (iI0000O3 + iI0000O3));
/* 68 */                i2++;
                    }
                }

                public static void I00000oOI(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 18 */            int i2 = 0;
/* 19 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 89 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 165 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 173 */                       i11i0o0ii.I0010I0i(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 176 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 95 */                int iI0000Il00O = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iI0000Il00O += i11I0o0ii.I0000Il00O((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               i11i0o0ii.I00100o1O0lo(iI0000Il00O);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   i11i0o0ii.I0010o((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 23 */            if (!z) {
/* 73 */                while (i2 < i11l0o1l1l1o.I00iiO) {
/* 75 */                    long jI0000O = i11l0o1l1l1o.I0000O(i2);
/* 83 */                    i11i0o0ii.I0010I0i(i, (jI0000O >> 63) ^ (jI0000O + jI0000O));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 25 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 29 */            int iI0000Il00O2 = 0;
/* 32 */            for (int i4 = 0; i4 < i11l0o1l1l1o.I00iiO; i4++) {
/* 34 */                long jI0000O2 = i11l0o1l1l1o.I0000O(i4);
/* 46 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O((jI0000O2 >> 63) ^ (jI0000O2 + jI0000O2));
                    }
/* 50 */            i11i0o0ii.I00100o1O0lo(iI0000Il00O2);
/* 55 */            while (i2 < i11l0o1l1l1o.I00iiO) {
/* 57 */                long jI0000O3 = i11l0o1l1l1o.I0000O(i2);
/* 65 */                i11i0o0ii.I0010o((jI0000O3 >> 63) ^ (jI0000O3 + jI0000O3));
/* 68 */                i2++;
                    }
                }

                public static void I0000Il00O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11OIo)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       i11i0o0ii.I00100l0(i, ((Integer) list.get(i2)).intValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 81 */                int iI00000oOI = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oOI += i11I0o0ii.I00000oOI(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               i11i0o0ii.I00100o1O0lo(iI00000oOI);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   i11i0o0ii.I00100o1O0lo(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11OIo i11oio = (i11OIo) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < i11oio.I00iiO) {
/* 69 */                    i11i0o0ii.I00100l0(i, i11oio.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < i11oio.I00iiO; i4++) {
/* 40 */                iI00000oOI2 += i11I0o0ii.I00000oOI(i11oio.I0000O(i4));
                    }
/* 44 */            i11i0o0ii.I00100o1O0lo(iI00000oOI2);
/* 49 */            while (i2 < i11oio.I00iiO) {
/* 55 */                i11i0o0ii.I00100o1O0lo(i11oio.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static void I0000O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       i11i0o0ii.I0010I0i(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 81 */                int iI0000Il00O = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI0000Il00O += i11I0o0ii.I0000Il00O(((Long) list.get(i3)).longValue());
                        }
/* 106 */               i11i0o0ii.I00100o1O0lo(iI0000Il00O);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   i11i0o0ii.I0010o(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < i11l0o1l1l1o.I00iiO) {
/* 69 */                    i11i0o0ii.I0010I0i(i, i11l0o1l1l1o.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < i11l0o1l1l1o.I00iiO; i4++) {
/* 40 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11l0o1l1l1o.I0000O(i4));
                    }
/* 44 */            i11i0o0ii.I00100o1O0lo(iI0000Il00O2);
/* 49 */            while (i2 < i11l0o1l1l1o.I00iiO) {
/* 55 */                i11i0o0ii.I0010o(i11l0o1l1l1o.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static boolean I0000oI00(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static int I0001Ioi1lo(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i11OIo)) {
/* 32 */                int iI0000Il00O = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI0000Il00O += i11I0o0ii.I0000Il00O(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            i11OIo i11oio = (i11OIo) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11oio.I0000O(i));
/* 28 */                i++;
                    }
/* 31 */            return iI0000Il00O2;
                }

                public static int I000II(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (i11I0o0ii.I00000oOI(i << 3) + 4) * size;
                }

                public static int I000O01llI0(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (i11I0o0ii.I00000oOI(i << 3) + 8) * size;
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i11OIo)) {
/* 32 */                int iI0000Il00O = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI0000Il00O += i11I0o0ii.I0000Il00O(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            i11OIo i11oio = (i11OIo) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11oio.I0000O(i));
/* 28 */                i++;
                    }
/* 31 */            return iI0000Il00O2;
                }

                public static int I000OiO(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 31 */                int iI0000Il00O = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI0000Il00O += i11I0o0ii.I0000Il00O(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11l0o1l1l1o.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI0000Il00O2;
                }

                public static int I000iOII(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i11OIo)) {
/* 36 */                int iI00000oOI = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iI00000oOI += i11I0o0ii.I00000oOI((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            i11OIo i11oio = (i11OIo) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iI0000O = i11oio.I0000O(i);
/* 31 */                iI00000oOI2 += i11I0o0ii.I00000oOI((iI0000O >> 31) ^ (iI0000O + iI0000O));
/* 32 */                i++;
                    }
/* 35 */            return iI00000oOI2;
                }

                public static int I000l1(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 37 */                int iI0000Il00O = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iI0000Il00O += i11I0o0ii.I0000Il00O((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 15 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 17 */            int iI0000Il00O2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jI0000O = i11l0o1l1l1o.I0000O(i);
/* 32 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O((jI0000O >> 63) ^ (jI0000O + jI0000O));
/* 33 */                i++;
                    }
/* 36 */            return iI0000Il00O2;
                }

                public static int I000lI(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i11OIo)) {
/* 31 */                int iI00000oOI = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oOI += i11I0o0ii.I00000oOI(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            i11OIo i11oio = (i11OIo) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oOI2 += i11I0o0ii.I00000oOI(i11oio.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oOI2;
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 31 */                int iI0000Il00O = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI0000Il00O += i11I0o0ii.I0000Il00O(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI0000Il00O;
                    }
/* 13 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 15 */            int iI0000Il00O2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11l0o1l1l1o.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI0000Il00O2;
                }

                public static void I000oI1ioi(Object obj, Object obj2) {
/* 5 */             i11o10OIl i11o10oil = ((i11O011) obj2).zbb.I00000oIO;
/* 11 */            if (i11o10oil.isEmpty()) {
/* 106 */               return;
                    }
/* 13 */            i11O011 i11o011 = (i11O011) obj;
/* 15 */            i11Ii1iI0 i11ii1ii0Clone = i11o011.zbb;
/* 19 */            if (i11ii1ii0Clone.I00000oOI) {
/* 21 */                i11ii1ii0Clone = i11ii1ii0Clone.clone();
/* 25 */                i11o011.zbb = i11ii1ii0Clone;
                    }
/* 30 */            if (i11o10oil.I00iiI > 0) {
/* 62 */                i11ii1ii0Clone.I000II(i11o10oil.I0000Il00O(0));
/* 65 */                throw null;
                    }
/* 36 */            Iterator it = i11o10oil.I00000oIO().iterator();
/* 44 */            if (it.hasNext()) {
/* 53 */                i11ii1ii0Clone.I000II((Map.Entry) it.next());
/* 56 */                throw null;
                    }
                }

                public static void I00100l0(Object obj, Object obj2) {
/* 1 */             i11O1oIl i11o1oil = (i11O1oIl) obj;
/* 3 */             i11o1i i11o1iVar = i11o1oil.zbc;
/* 7 */             i11o1i i11o1iVar2 = ((i11O1oIl) obj2).zbc;
/* 9 */             i11o1i i11o1iVar3 = i11o1i.I0001Ioi1lo;
/* 15 */            if (!i11o1iVar3.equals(i11o1iVar2)) {
/* 22 */                if (i11o1iVar3.equals(i11o1iVar)) {
/* 28 */                    int i = i11o1iVar.I00000oIO + i11o1iVar2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(i11o1iVar.I00000oOI, i);
/* 41 */                    System.arraycopy(i11o1iVar2.I00000oOI, 0, iArrCopyOf, i11o1iVar.I00000oIO, i11o1iVar2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(i11o1iVar.I0000Il00O, i);
/* 56 */                    System.arraycopy(i11o1iVar2.I0000Il00O, 0, objArrCopyOf, i11o1iVar.I00000oIO, i11o1iVar2.I00000oIO);
/* 62 */                    i11o1iVar = new i11o1i(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    i11o1iVar.getClass();
/* 73 */                    if (!i11o1iVar2.equals(i11o1iVar3)) {
/* 78 */                        if (!i11o1iVar.I0000oI00) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = i11o1iVar.I00000oIO + i11o1iVar2.I00000oIO;
/* 85 */                        i11o1iVar.I0000oI00(i2);
/* 96 */                        System.arraycopy(i11o1iVar2.I00000oOI, 0, i11o1iVar.I00000oOI, i11o1iVar.I00000oIO, i11o1iVar2.I00000oIO);
/* 107 */                       System.arraycopy(i11o1iVar2.I0000Il00O, 0, i11o1iVar.I0000Il00O, i11o1iVar.I00000oIO, i11o1iVar2.I00000oIO);
/* 110 */                       i11o1iVar.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           i11o1oil.zbc = i11o1iVar;
                }

                public static void I00100o1O0lo(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 15 */            if (list instanceof i111ilIlIol) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 89 */                    i11i0o0ii.I00100o1O0lo(i << 3);
/* 92 */                    i11i0o0ii.I0000O(zBooleanValue ? (byte) 1 : (byte) 0);
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            i11i0o0ii.I00100o1O0lo(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                i11i0o0ii.I0000O(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 68 */                i2++;
                    }
                }

                public static void I0010I0i(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 15 */            if (list instanceof i11IIIo0) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    i11i0o0ii.I000OiO(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            i11i0o0ii.I00100o1O0lo(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                i11i0o0ii.I000iOII(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0010o(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11OIo)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       i11i0o0ii.I000l1(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 82 */                int iI0000Il00O = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI0000Il00O += i11I0o0ii.I0000Il00O(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               i11i0o0ii.I00100o1O0lo(iI0000Il00O);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   i11i0o0ii.I000lI(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11OIo i11oio = (i11OIo) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < i11oio.I00iiO) {
/* 70 */                    i11i0o0ii.I000l1(i, i11oio.I0000O(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < i11oio.I00iiO; i4++) {
/* 41 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11oio.I0000O(i4));
                    }
/* 45 */            i11i0o0ii.I00100o1O0lo(iI0000Il00O2);
/* 50 */            while (i2 < i11oio.I00iiO) {
/* 56 */                i11i0o0ii.I000lI(i11oio.I0000O(i2));
/* 59 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11OIo)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i11i0o0ii.I000O01llI0(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                i11i0o0ii.I00100o1O0lo(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i11i0o0ii.I000OOo1O(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11OIo i11oio = (i11OIo) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < i11oio.I00iiO) {
/* 65 */                    i11i0o0ii.I000O01llI0(i, i11oio.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i11oio.I00iiO; i6++) {
/* 32 */                i11oio.I0000O(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            i11i0o0ii.I00100o1O0lo(i5);
/* 45 */            while (i2 < i11oio.I00iiO) {
/* 51 */                i11i0o0ii.I000OOo1O(i11oio.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i11i0o0ii.I000OiO(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                i11i0o0ii.I00100o1O0lo(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i11i0o0ii.I000iOII(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < i11l0o1l1l1o.I00iiO) {
/* 65 */                    i11i0o0ii.I000OiO(i, i11l0o1l1l1o.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i11l0o1l1l1o.I00iiO; i6++) {
/* 32 */                i11l0o1l1l1o.I0000O(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            i11i0o0ii.I00100o1O0lo(i5);
/* 45 */            while (i2 < i11l0o1l1l1o.I00iiO) {
/* 51 */                i11i0o0ii.I000iOII(i11l0o1l1l1o.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11IiIo0l)) {
/* 89 */                if (!z) {
/* 149 */                   while (i2 < list.size()) {
/* 165 */                       i11i0o0ii.I000O01llI0(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 168 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 95 */                int i3 = 0;
/* 100 */               for (int i4 = 0; i4 < list.size(); i4++) {
/* 108 */                   ((Float) list.get(i4)).getClass();
/* 111 */                   i3 += 4;
                        }
/* 116 */               i11i0o0ii.I00100o1O0lo(i3);
/* 123 */               while (i2 < list.size()) {
/* 139 */                   i11i0o0ii.I000OOo1O(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 142 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11IiIo0l i11iiio0l = (i11IiIo0l) list;
/* 21 */            if (!z) {
/* 70 */                while (i2 < i11iiio0l.I00iiO) {
/* 72 */                    i11iiio0l.I0000oI00(i2);
/* 83 */                    i11i0o0ii.I000O01llI0(i, Float.floatToRawIntBits(i11iiio0l.I00iiI[i2]));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i11iiio0l.I00iiO; i6++) {
/* 32 */                i11iiio0l.I0000oI00(i6);
/* 37 */                float f = i11iiio0l.I00iiI[i6];
/* 39 */                i5 += 4;
                    }
/* 44 */            i11i0o0ii.I00100o1O0lo(i5);
/* 49 */            while (i2 < i11iiio0l.I00iiO) {
/* 51 */                i11iiio0l.I0000oI00(i2);
/* 62 */                i11i0o0ii.I000OOo1O(Float.floatToRawIntBits(i11iiio0l.I00iiI[i2]));
/* 65 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11OIo)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       i11i0o0ii.I000l1(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 82 */                int iI0000Il00O = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI0000Il00O += i11I0o0ii.I0000Il00O(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               i11i0o0ii.I00100o1O0lo(iI0000Il00O);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   i11i0o0ii.I000lI(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11OIo i11oio = (i11OIo) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < i11oio.I00iiO) {
/* 70 */                    i11i0o0ii.I000l1(i, i11oio.I0000O(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < i11oio.I00iiO; i4++) {
/* 41 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11oio.I0000O(i4));
                    }
/* 45 */            i11i0o0ii.I00100o1O0lo(iI0000Il00O2);
/* 50 */            while (i2 < i11oio.I00iiO) {
/* 56 */                i11i0o0ii.I000lI(i11oio.I0000O(i2));
/* 59 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       i11i0o0ii.I0010I0i(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 81 */                int iI0000Il00O = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI0000Il00O += i11I0o0ii.I0000Il00O(((Long) list.get(i3)).longValue());
                        }
/* 106 */               i11i0o0ii.I00100o1O0lo(iI0000Il00O);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   i11i0o0ii.I0010o(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < i11l0o1l1l1o.I00iiO) {
/* 69 */                    i11i0o0ii.I0010I0i(i, i11l0o1l1l1o.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int iI0000Il00O2 = 0;
/* 30 */            for (int i4 = 0; i4 < i11l0o1l1l1o.I00iiO; i4++) {
/* 40 */                iI0000Il00O2 += i11I0o0ii.I0000Il00O(i11l0o1l1l1o.I0000O(i4));
                    }
/* 44 */            i11i0o0ii.I00100o1O0lo(iI0000Il00O2);
/* 49 */            while (i2 < i11l0o1l1l1o.I00iiO) {
/* 55 */                i11i0o0ii.I0010o(i11l0o1l1l1o.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11OIo)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i11i0o0ii.I000O01llI0(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                i11i0o0ii.I00100o1O0lo(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i11i0o0ii.I000OOo1O(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11OIo i11oio = (i11OIo) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < i11oio.I00iiO) {
/* 65 */                    i11i0o0ii.I000O01llI0(i, i11oio.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i11oio.I00iiO; i6++) {
/* 32 */                i11oio.I0000O(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            i11i0o0ii.I00100o1O0lo(i5);
/* 45 */            while (i2 < i11oio.I00iiO) {
/* 51 */                i11i0o0ii.I000OOo1O(i11oio.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof i11l0O1l1l1O)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       i11i0o0ii.I000OiO(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                i11i0o0ii.I000oI1ioi(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                i11i0o0ii.I00100o1O0lo(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   i11i0o0ii.I000iOII(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < i11l0o1l1l1o.I00iiO) {
/* 65 */                    i11i0o0ii.I000OiO(i, i11l0o1l1l1o.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            i11i0o0ii.I000oI1ioi(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < i11l0o1l1l1o.I00iiO; i6++) {
/* 32 */                i11l0o1l1l1o.I0000O(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            i11i0o0ii.I00100o1O0lo(i5);
/* 45 */            while (i2 < i11l0o1l1l1o.I00iiO) {
/* 51 */                i11i0o0ii.I000iOII(i11l0o1l1l1o.I0000O(i2));
/* 54 */                i2++;
                    }
                }
            }
