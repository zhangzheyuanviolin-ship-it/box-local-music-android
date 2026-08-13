            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            
            public abstract class ioOi0IO {
                public static final Class I00000oIO;
                public static final iooO1IiiOoOo I00000oOI;
                public static final iooO1IiiOoOo I0000Il00O;

                static {
                    Class<?> cls;
                    Class<?> cls2;
/* 1 */             iooO1IiiOoOo iooo1iiioooo = null;
                    try {
/* 4 */                 cls = Class.forName("com.google.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            I00000oIO = cls;
                    try {
/* 14 */                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
                    } catch (Throwable unused2) {
/* 19 */                cls2 = null;
                    }
/* 20 */            if (cls2 != null) {
                        try {
/* 31 */                    iooo1iiioooo = (iooO1IiiOoOo) cls2.getConstructor(null).newInstance(null);
                        } catch (Throwable unused3) {
                        }
                    }
/* 34 */            I00000oOI = iooo1iiioooo;
/* 41 */            I0000Il00O = new iooO1IiiOoOo();
                }

                public static void I00000oIO(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    il1o00loo1.I0000O(i, ((Integer) list.get(i2)).intValue());
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                il1o00loo1.I0000oI00(((Integer) list.get(i2)).intValue());
/* 64 */                i2++;
                    }
                }

                public static void I00000oOI(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    il1o00loo1.I0001Ioi1lo(i, ((Long) list.get(i2)).longValue());
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                il1o00loo1.I000II(((Long) list.get(i2)).longValue());
/* 64 */                i2++;
                    }
                }

                public static void I0000Il00O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 85 */                while (i2 < list.size()) {
/* 93 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 104 */                   il1o00loo1.I000OiO(i << 3);
/* 107 */                   il1o00loo1.I000OiO((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 110 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int iI000o00OoI0I = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 34 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 47 */                iI000o00OoI0I += il1O00loO1.I000o00OoI0I((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                    }
/* 51 */            il1o00loo1.I000OiO(iI000o00OoI0I);
/* 58 */            while (i2 < list.size()) {
/* 66 */                int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 75 */                il1o00loo1.I000OiO((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 78 */                i2++;
                    }
                }

                public static void I0000O(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 15 */            int i2 = 0;
/* 16 */            if (!z) {
/* 85 */                while (i2 < list.size()) {
/* 93 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 101 */                   il1o00loo1.I000iOII(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 104 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            il1o00loo1.I000OOo1O(i, 2);
/* 23 */            int iI000oI1ioi = 0;
/* 28 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 36 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 48 */                iI000oI1ioi += il1O00loO1.I000oI1ioi((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                    }
/* 52 */            il1o00loo1.I000OiO(iI000oI1ioi);
/* 59 */            while (i2 < list.size()) {
/* 67 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 75 */                il1o00loo1.I000l1((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 78 */                i2++;
                    }
                }

                public static void I0000oI00(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 89 */                    il1o00loo1.I000OiO(i << 3);
/* 92 */                    il1o00loo1.I000OiO(iIntValue);
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int iI000o00OoI0I = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI000o00OoI0I += il1O00loO1.I000o00OoI0I(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            il1o00loo1.I000OiO(iI000o00OoI0I);
/* 53 */            while (i2 < list.size()) {
/* 65 */                il1o00loo1.I000OiO(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I0001Ioi1lo(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    il1o00loo1.I000iOII(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int iI000oI1ioi = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Long) list.get(i3)).longValue());
                    }
/* 46 */            il1o00loo1.I000OiO(iI000oI1ioi);
/* 53 */            while (i2 < list.size()) {
/* 65 */                il1o00loo1.I000l1(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static boolean I000II(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static int I000O01llI0(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ilOllI1i00l) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000oI1ioi = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI000oI1ioi;
                }

                public static int I000OOo1O(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (il1O00loO1.I000o00OoI0I(i << 3) + 4) * size;
                }

                public static int I000OiO(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (il1O00loO1.I000o00OoI0I(i << 3) + 8) * size;
                }

                public static int I000iOII(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ilOllI1i00l) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000oI1ioi = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI000oI1ioi;
                }

                public static int I000l1(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof iloiOllI) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000oI1ioi = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI000oI1ioi;
                }

                public static int I000lI(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ilOllI1i00l) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000o00OoI0I = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 29 */                int iIntValue = ((Integer) list.get(i)).intValue();
/* 42 */                iI000o00OoI0I += il1O00loO1.I000o00OoI0I((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    }
/* 77 */            return iI000o00OoI0I;
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof iloiOllI) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000oI1ioi = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 29 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 43 */                iI000oI1ioi += il1O00loO1.I000oI1ioi((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    }
/* 77 */            return iI000oI1ioi;
                }

                public static int I000oI1ioi(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ilOllI1i00l) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000o00OoI0I = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000o00OoI0I += il1O00loO1.I000o00OoI0I(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI000o00OoI0I;
                }

                public static int I00100l0(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof iloiOllI) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI000oI1ioi = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI000oI1ioi;
                }

                public static Object I00100o1O0lo(Object obj, int i, List list, l0IioO1i0lO1 l0iioo1i0lo1, Object obj2, iooO1IiiOoOo iooo1iiioooo) {
/* 1 */             if (l0iioo1i0lo1 == null) {
/* 3 */                 return obj2;
                    }
/* 6 */             if (!(list instanceof RandomAccess)) {
/* 78 */                Iterator it = list.iterator();
/* 86 */                while (it.hasNext()) {
/* 94 */                    int iIntValue = ((Integer) it.next()).intValue();
/* 102 */                   if (!l0iioo1i0lo1.I00000oIO(iIntValue)) {
/* 104 */                       if (obj2 == null) {
/* 106 */                           iooo1iiioooo.getClass();
/* 109 */                           obj2 = iooO1IiiOoOo.I00000oIO(obj);
                                }
/* 114 */                       iooo1iiioooo.getClass();
/* 126 */                       ((iooIiiOli) obj2).I0000Il00O(i << 3, Long.valueOf(iIntValue));
/* 129 */                       it.remove();
                            }
                        }
/* 685 */               return obj2;
                    }
/* 8 */             int size = list.size();
/* 13 */            int i2 = 0;
/* 14 */            for (int i3 = 0; i3 < size; i3++) {
/* 20 */                Integer num = (Integer) list.get(i3);
/* 22 */                int iIntValue2 = num.intValue();
/* 30 */                if (l0iioo1i0lo1.I00000oIO(iIntValue2)) {
/* 32 */                    if (i3 != i2) {
/* 34 */                        list.set(i2, num);
                            }
/* 37 */                    i2++;
                        } else {
/* 40 */                    if (obj2 == null) {
/* 42 */                        iooo1iiioooo.getClass();
/* 45 */                        obj2 = iooO1IiiOoOo.I00000oIO(obj);
                            }
/* 50 */                    iooo1iiioooo.getClass();
/* 62 */                    ((iooIiiOli) obj2).I0000Il00O(i << 3, Long.valueOf(iIntValue2));
                        }
                    }
/* 68 */            if (i2 != size) {
/* 74 */                list.subList(i2, size).clear();
                    }
/* 77 */            return obj2;
                }

                public static void I0010I0i(iooO1IiiOoOo iooo1iiioooo, Object obj, Object obj2) {
/* 1 */             iooo1iiioooo.getClass();
/* 4 */             ilOl10 ilol10 = (ilOl10) obj;
/* 6 */             iooIiiOli iooiiioli = ilol10.zzc;
/* 10 */            iooIiiOli iooiiioli2 = ((ilOl10) obj2).zzc;
/* 12 */            iooIiiOli iooiiioli3 = iooIiiOli.I0001Ioi1lo;
/* 18 */            if (!iooiiioli3.equals(iooiiioli2)) {
/* 25 */                if (iooiiioli3.equals(iooiiioli)) {
/* 31 */                    int i = iooiiioli.I00000oIO + iooiiioli2.I00000oIO;
/* 34 */                    int[] iArrCopyOf = Arrays.copyOf(iooiiioli.I00000oOI, i);
/* 44 */                    System.arraycopy(iooiiioli2.I00000oOI, 0, iArrCopyOf, iooiiioli.I00000oIO, iooiiioli2.I00000oIO);
/* 49 */                    Object[] objArrCopyOf = Arrays.copyOf(iooiiioli.I0000Il00O, i);
/* 59 */                    System.arraycopy(iooiiioli2.I0000Il00O, 0, objArrCopyOf, iooiiioli.I00000oIO, iooiiioli2.I00000oIO);
/* 65 */                    iooiiioli = new iooIiiOli(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 69 */                    iooiiioli.getClass();
/* 76 */                    if (!iooiiioli2.equals(iooiiioli3)) {
/* 81 */                        if (!iooiiioli.I0000oI00) {
/* 116 */                           OIiilo1Ool0o.I000lI();
/* 119 */                           return;
                                }
/* 87 */                        int i2 = iooiiioli.I00000oIO + iooiiioli2.I00000oIO;
/* 88 */                        iooiiioli.I0000oI00(i2);
/* 99 */                        System.arraycopy(iooiiioli2.I00000oOI, 0, iooiiioli.I00000oOI, iooiiioli.I00000oIO, iooiiioli2.I00000oIO);
/* 110 */                       System.arraycopy(iooiiioli2.I0000Il00O, 0, iooiiioli.I0000Il00O, iooiiioli.I00000oIO, iooiiioli2.I00000oIO);
/* 113 */                       iooiiioli.I00000oIO = i2;
                            }
                        }
                    }
/* 120 */           ilol10.zzc = iooiiioli;
                }

                public static void I0010o(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 79 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 85 */                    il1o00loo1.I000OiO(i << 3);
/* 88 */                    il1o00loo1.I00000oIO(zBooleanValue ? (byte) 1 : (byte) 0);
/* 91 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Boolean) list.get(i4)).getClass();
/* 37 */                i3++;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                il1o00loo1.I00000oIO(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 64 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 91 */                    il1o00loo1.I0001Ioi1lo(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Double) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 65 */                il1o00loo1.I000II(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 68 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 83 */                while (i2 < list.size()) {
/* 91 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 97 */                    il1o00loo1.I000OiO(i << 3);
/* 100 */                   if (iIntValue >= 0) {
/* 102 */                       il1o00loo1.I000OiO(iIntValue);
                            } else {
/* 107 */                       il1o00loo1.I000l1(iIntValue);
                            }
/* 110 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int iI000oI1ioi = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 43 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Integer) list.get(i3)).intValue());
                    }
/* 47 */            il1o00loo1.I000OiO(iI000oI1ioi);
/* 54 */            while (i2 < list.size()) {
/* 62 */                int iIntValue2 = ((Integer) list.get(i2)).intValue();
/* 66 */                if (iIntValue2 >= 0) {
/* 68 */                    il1o00loo1.I000OiO(iIntValue2);
                        } else {
/* 73 */                    il1o00loo1.I000l1(iIntValue2);
                        }
/* 76 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    il1o00loo1.I0000O(i, ((Integer) list.get(i2)).intValue());
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                il1o00loo1.I0000oI00(((Integer) list.get(i2)).intValue());
/* 64 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    il1o00loo1.I0001Ioi1lo(i, ((Long) list.get(i2)).longValue());
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                il1o00loo1.I000II(((Long) list.get(i2)).longValue());
/* 64 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 91 */                    il1o00loo1.I0000O(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Float) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            il1o00loo1.I000OiO(i3);
/* 49 */            while (i2 < list.size()) {
/* 65 */                il1o00loo1.I0000oI00(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 68 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 83 */                while (i2 < list.size()) {
/* 91 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 97 */                    il1o00loo1.I000OiO(i << 3);
/* 100 */                   if (iIntValue >= 0) {
/* 102 */                       il1o00loo1.I000OiO(iIntValue);
                            } else {
/* 107 */                       il1o00loo1.I000l1(iIntValue);
                            }
/* 110 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int iI000oI1ioi = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 43 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Integer) list.get(i3)).intValue());
                    }
/* 47 */            il1o00loo1.I000OiO(iI000oI1ioi);
/* 54 */            while (i2 < list.size()) {
/* 62 */                int iIntValue2 = ((Integer) list.get(i2)).intValue();
/* 66 */                if (iIntValue2 >= 0) {
/* 68 */                    il1o00loo1.I000OiO(iIntValue2);
                        } else {
/* 73 */                    il1o00loo1.I000l1(iIntValue2);
                        }
/* 76 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, i11I1Ili i11i1ili, boolean z) throws IOO1IOl1O10 {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            il1O00loO1 il1o00loo1 = (il1O00loO1) i11i1ili.I00iiI;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    il1o00loo1.I000iOII(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 17 */            il1o00loo1.I000OOo1O(i, 2);
/* 21 */            int iI000oI1ioi = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iI000oI1ioi += il1O00loO1.I000oI1ioi(((Long) list.get(i3)).longValue());
                    }
/* 46 */            il1o00loo1.I000OiO(iI000oI1ioi);
/* 53 */            while (i2 < list.size()) {
/* 65 */                il1o00loo1.I000l1(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }
            }
