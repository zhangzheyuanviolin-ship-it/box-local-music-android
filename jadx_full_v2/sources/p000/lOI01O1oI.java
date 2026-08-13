            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class lOI01O1oI {
                public static final o0iOli I00000oIO;

                static {
/* 1 */             lO1Ilo0lloiO lo1ilo0lloio = lO1Ilo0lloiO.I0000Il00O;
/* 10 */            I00000oIO = new o0iOli(26);
                }

                public static void I00000oIO(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIIOOOli10)) {
/* 90 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 168 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 177 */                       l1lo010ioi0.I000lI(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 180 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 92 */                l1lo010ioi0.I000l1(i, 2);
/* 96 */                int iI0010I0i = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iI0010I0i += l1lo010IOi0.I0010I0i((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               l1lo010ioi0.I000o00OoI0I(iI0010I0i);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   l1lo010ioi0.I000o00OoI0I((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 21 */            if (!z) {
/* 73 */                while (i2 < liioooli10.I00iiO) {
/* 75 */                    int iI0000O = liioooli10.I0000O(i2);
/* 84 */                    l1lo010ioi0.I000lI(i, (iI0000O >> 31) ^ (iI0000O + iI0000O));
/* 87 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int iI0010I0i2 = 0;
/* 30 */            for (int i4 = 0; i4 < liioooli10.I00iiO; i4++) {
/* 32 */                int iI0000O2 = liioooli10.I0000O(i4);
/* 45 */                iI0010I0i2 += l1lo010IOi0.I0010I0i((iI0000O2 >> 31) ^ (iI0000O2 + iI0000O2));
                    }
/* 49 */            l1lo010ioi0.I000o00OoI0I(iI0010I0i2);
/* 54 */            while (i2 < liioooli10.I00iiO) {
/* 56 */                int iI0000O3 = liioooli10.I0000O(i2);
/* 65 */                l1lo010ioi0.I000o00OoI0I((iI0000O3 >> 31) ^ (iI0000O3 + iI0000O3));
/* 68 */                i2++;
                    }
                }

                public static void I00000oOI(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 18 */            int i2 = 0;
/* 19 */            if (!(list instanceof lIlIoll)) {
/* 89 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 165 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 173 */                       l1lo010ioi0.I000oI1ioi(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 176 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                l1lo010ioi0.I000l1(i, 2);
/* 95 */                int iI00000oIO = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iI00000oIO += l1lo010IOi0.I00000oIO((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               l1lo010ioi0.I000o00OoI0I(iI00000oIO);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   l1lo010ioi0.I00100l0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lIlIoll lilioll = (lIlIoll) list;
/* 23 */            if (!z) {
/* 73 */                while (i2 < lilioll.I00iiO) {
/* 75 */                    long jI0000O = lilioll.I0000O(i2);
/* 83 */                    l1lo010ioi0.I000oI1ioi(i, (jI0000O >> 63) ^ (jI0000O + jI0000O));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 25 */            l1lo010ioi0.I000l1(i, 2);
/* 29 */            int iI00000oIO2 = 0;
/* 32 */            for (int i4 = 0; i4 < lilioll.I00iiO; i4++) {
/* 34 */                long jI0000O2 = lilioll.I0000O(i4);
/* 46 */                iI00000oIO2 += l1lo010IOi0.I00000oIO((jI0000O2 >> 63) ^ (jI0000O2 + jI0000O2));
                    }
/* 50 */            l1lo010ioi0.I000o00OoI0I(iI00000oIO2);
/* 55 */            while (i2 < lilioll.I00iiO) {
/* 57 */                long jI0000O3 = lilioll.I0000O(i2);
/* 65 */                l1lo010ioi0.I00100l0((jI0000O3 >> 63) ^ (jI0000O3 + jI0000O3));
/* 68 */                i2++;
                    }
                }

                public static void I0000Il00O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIIOOOli10)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       l1lo010ioi0.I000lI(i, ((Integer) list.get(i2)).intValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                l1lo010ioi0.I000l1(i, 2);
/* 81 */                int iI0010I0i = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI0010I0i += l1lo010IOi0.I0010I0i(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               l1lo010ioi0.I000o00OoI0I(iI0010I0i);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   l1lo010ioi0.I000o00OoI0I(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < liioooli10.I00iiO) {
/* 69 */                    l1lo010ioi0.I000lI(i, liioooli10.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int iI0010I0i2 = 0;
/* 30 */            for (int i4 = 0; i4 < liioooli10.I00iiO; i4++) {
/* 40 */                iI0010I0i2 += l1lo010IOi0.I0010I0i(liioooli10.I0000O(i4));
                    }
/* 44 */            l1lo010ioi0.I000o00OoI0I(iI0010I0i2);
/* 49 */            while (i2 < liioooli10.I00iiO) {
/* 55 */                l1lo010ioi0.I000o00OoI0I(liioooli10.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static void I0000O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIlIoll)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       l1lo010ioi0.I000oI1ioi(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                l1lo010ioi0.I000l1(i, 2);
/* 81 */                int iI00000oIO = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oIO += l1lo010IOi0.I00000oIO(((Long) list.get(i3)).longValue());
                        }
/* 106 */               l1lo010ioi0.I000o00OoI0I(iI00000oIO);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   l1lo010ioi0.I00100l0(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIlIoll lilioll = (lIlIoll) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < lilioll.I00iiO) {
/* 69 */                    l1lo010ioi0.I000oI1ioi(i, lilioll.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < lilioll.I00iiO; i4++) {
/* 40 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(lilioll.I0000O(i4));
                    }
/* 44 */            l1lo010ioi0.I000o00OoI0I(iI00000oIO2);
/* 49 */            while (i2 < lilioll.I00iiO) {
/* 55 */                l1lo010ioi0.I00100l0(lilioll.I0000O(i2));
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
/* 11 */            if (!(list instanceof lIIOOOli10)) {
/* 32 */                int iI00000oIO = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI00000oIO += l1lo010IOi0.I00000oIO(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(liioooli10.I0000O(i));
/* 28 */                i++;
                    }
/* 31 */            return iI00000oIO2;
                }

                public static int I000II(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (l1lo010IOi0.I0010I0i(i << 3) + 4) * size;
                }

                public static int I000O01llI0(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (l1lo010IOi0.I0010I0i(i << 3) + 8) * size;
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof lIIOOOli10)) {
/* 32 */                int iI00000oIO = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI00000oIO += l1lo010IOi0.I00000oIO(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(liioooli10.I0000O(i));
/* 28 */                i++;
                    }
/* 31 */            return iI00000oIO2;
                }

                public static int I000OiO(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof lIlIoll)) {
/* 31 */                int iI00000oIO = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oIO += l1lo010IOi0.I00000oIO(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            lIlIoll lilioll = (lIlIoll) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(lilioll.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oIO2;
                }

                public static int I000iOII(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof lIIOOOli10)) {
/* 36 */                int iI0010I0i = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iI0010I0i += l1lo010IOi0.I0010I0i((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI0010I0i;
                    }
/* 13 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 15 */            int iI0010I0i2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iI0000O = liioooli10.I0000O(i);
/* 31 */                iI0010I0i2 += l1lo010IOi0.I0010I0i((iI0000O >> 31) ^ (iI0000O + iI0000O));
/* 32 */                i++;
                    }
/* 35 */            return iI0010I0i2;
                }

                public static int I000l1(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof lIlIoll)) {
/* 37 */                int iI00000oIO = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iI00000oIO += l1lo010IOi0.I00000oIO((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 15 */            lIlIoll lilioll = (lIlIoll) list;
/* 17 */            int iI00000oIO2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jI0000O = lilioll.I0000O(i);
/* 32 */                iI00000oIO2 += l1lo010IOi0.I00000oIO((jI0000O >> 63) ^ (jI0000O + jI0000O));
/* 33 */                i++;
                    }
/* 36 */            return iI00000oIO2;
                }

                public static int I000lI(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof lIIOOOli10)) {
/* 31 */                int iI0010I0i = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI0010I0i += l1lo010IOi0.I0010I0i(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI0010I0i;
                    }
/* 13 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 15 */            int iI0010I0i2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI0010I0i2 += l1lo010IOi0.I0010I0i(liioooli10.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI0010I0i2;
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof lIlIoll)) {
/* 31 */                int iI00000oIO = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oIO += l1lo010IOi0.I00000oIO(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            lIlIoll lilioll = (lIlIoll) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(lilioll.I0000O(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oIO2;
                }

                public static void I000oI1ioi(Object obj, Object obj2) {
/* 3 */             lI0ioliI0l li0iolii0l = ((lI1oIOl10iIo) obj2).zzb;
/* 11 */            if (li0iolii0l.I00000oIO.isEmpty()) {
/* 106 */               return;
                    }
/* 13 */            lI1oIOl10iIo li1oiol10iio = (lI1oIOl10iIo) obj;
/* 15 */            lI0ioliI0l li0iolii0l2 = li1oiol10iio.zzb;
/* 19 */            if (li0iolii0l2.I00000oOI) {
/* 25 */                li1oiol10iio.zzb = li0iolii0l2.clone();
                    }
/* 27 */            lOI1I000IoiI loi1i000ioii = li0iolii0l.I00000oIO;
/* 31 */            if (loi1i000ioii.I00iiI > 0) {
/* 78 */                loi1i000ioii.I0000Il00O(0).getKey().getClass();
/* 81 */                OIiilo1Ool0o.I00000oIO();
/* 106 */               return;
                    }
/* 37 */            Iterator it = loi1i000ioii.I00000oIO().iterator();
/* 45 */            if (it.hasNext()) {
/* 52 */                Map.Entry entry = (Map.Entry) it.next();
/* 58 */                if (entry.getKey() != null) {
/* 60 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 64 */                    entry.getValue();
/* 68 */                    throw null;
                        }
                    }
                }

                public static void I00100l0(Object obj, Object obj2) {
/* 1 */             lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) obj;
/* 3 */             lOOlilii loolilii = liioo0oi1o.zzc;
/* 7 */             lOOlilii loolilii2 = ((lIIOO0oi1o) obj2).zzc;
/* 9 */             lOOlilii loolilii3 = lOOlilii.I0001Ioi1lo;
/* 15 */            if (!loolilii3.equals(loolilii2)) {
/* 22 */                if (loolilii3.equals(loolilii)) {
/* 28 */                    int i = loolilii.I00000oIO + loolilii2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(loolilii.I00000oOI, i);
/* 41 */                    System.arraycopy(loolilii2.I00000oOI, 0, iArrCopyOf, loolilii.I00000oIO, loolilii2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(loolilii.I0000Il00O, i);
/* 56 */                    System.arraycopy(loolilii2.I0000Il00O, 0, objArrCopyOf, loolilii.I00000oIO, loolilii2.I00000oIO);
/* 62 */                    loolilii = new lOOlilii(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    loolilii.getClass();
/* 73 */                    if (!loolilii2.equals(loolilii3)) {
/* 78 */                        if (!loolilii.I0000oI00) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = loolilii.I00000oIO + loolilii2.I00000oIO;
/* 85 */                        loolilii.I0000oI00(i2);
/* 96 */                        System.arraycopy(loolilii2.I00000oOI, 0, loolilii.I00000oOI, loolilii.I00000oIO, loolilii2.I00000oIO);
/* 107 */                       System.arraycopy(loolilii2.I0000Il00O, 0, loolilii.I0000Il00O, loolilii.I00000oIO, loolilii2.I00000oIO);
/* 110 */                       loolilii.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           liioo0oi1o.zzc = loolilii;
                }

                public static void I00100o1O0lo(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 15 */            if (list instanceof l1OolOoiloiI) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 89 */                    l1lo010ioi0.I000o00OoI0I(i << 3);
/* 92 */                    l1lo010ioi0.I00000oOI(zBooleanValue ? (byte) 1 : (byte) 0);
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            l1lo010ioi0.I000l1(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            l1lo010ioi0.I000o00OoI0I(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                l1lo010ioi0.I00000oOI(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 68 */                i2++;
                    }
                }

                public static void I0010I0i(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 15 */            if (list instanceof l1oIooo0IiOl) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    l1lo010ioi0.I000II(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            l1lo010ioi0.I000l1(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            l1lo010ioi0.I000o00OoI0I(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                l1lo010ioi0.I000O01llI0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0010o(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIIOOOli10)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       l1lo010ioi0.I000OOo1O(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                l1lo010ioi0.I000l1(i, 2);
/* 82 */                int iI00000oIO = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI00000oIO += l1lo010IOi0.I00000oIO(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               l1lo010ioi0.I000o00OoI0I(iI00000oIO);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   l1lo010ioi0.I000OiO(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < liioooli10.I00iiO) {
/* 70 */                    l1lo010ioi0.I000OOo1O(i, liioooli10.I0000O(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < liioooli10.I00iiO; i4++) {
/* 41 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(liioooli10.I0000O(i4));
                    }
/* 45 */            l1lo010ioi0.I000o00OoI0I(iI00000oIO2);
/* 50 */            while (i2 < liioooli10.I00iiO) {
/* 56 */                l1lo010ioi0.I000OiO(liioooli10.I0000O(i2));
/* 59 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIIOOOli10)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       l1lo010ioi0.I0000oI00(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                l1lo010ioi0.I000l1(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                l1lo010ioi0.I000o00OoI0I(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   l1lo010ioi0.I0001Ioi1lo(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < liioooli10.I00iiO) {
/* 65 */                    l1lo010ioi0.I0000oI00(i, liioooli10.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < liioooli10.I00iiO; i6++) {
/* 32 */                liioooli10.I0000O(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            l1lo010ioi0.I000o00OoI0I(i5);
/* 45 */            while (i2 < liioooli10.I00iiO) {
/* 51 */                l1lo010ioi0.I0001Ioi1lo(liioooli10.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIlIoll)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       l1lo010ioi0.I000II(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                l1lo010ioi0.I000l1(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                l1lo010ioi0.I000o00OoI0I(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   l1lo010ioi0.I000O01llI0(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIlIoll lilioll = (lIlIoll) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < lilioll.I00iiO) {
/* 65 */                    l1lo010ioi0.I000II(i, lilioll.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < lilioll.I00iiO; i6++) {
/* 32 */                lilioll.I0000O(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            l1lo010ioi0.I000o00OoI0I(i5);
/* 45 */            while (i2 < lilioll.I00iiO) {
/* 51 */                l1lo010ioi0.I000O01llI0(lilioll.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lI101iOli)) {
/* 89 */                if (!z) {
/* 149 */                   while (i2 < list.size()) {
/* 165 */                       l1lo010ioi0.I0000oI00(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 168 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                l1lo010ioi0.I000l1(i, 2);
/* 95 */                int i3 = 0;
/* 100 */               for (int i4 = 0; i4 < list.size(); i4++) {
/* 108 */                   ((Float) list.get(i4)).getClass();
/* 111 */                   i3 += 4;
                        }
/* 116 */               l1lo010ioi0.I000o00OoI0I(i3);
/* 123 */               while (i2 < list.size()) {
/* 139 */                   l1lo010ioi0.I0001Ioi1lo(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 142 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lI101iOli li101ioli = (lI101iOli) list;
/* 21 */            if (!z) {
/* 70 */                while (i2 < li101ioli.I00iiO) {
/* 72 */                    li101ioli.I0000oI00(i2);
/* 83 */                    l1lo010ioi0.I0000oI00(i, Float.floatToRawIntBits(li101ioli.I00iiI[i2]));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < li101ioli.I00iiO; i6++) {
/* 32 */                li101ioli.I0000oI00(i6);
/* 37 */                float f = li101ioli.I00iiI[i6];
/* 39 */                i5 += 4;
                    }
/* 44 */            l1lo010ioi0.I000o00OoI0I(i5);
/* 49 */            while (i2 < li101ioli.I00iiO) {
/* 51 */                li101ioli.I0000oI00(i2);
/* 62 */                l1lo010ioi0.I0001Ioi1lo(Float.floatToRawIntBits(li101ioli.I00iiI[i2]));
/* 65 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIIOOOli10)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       l1lo010ioi0.I000OOo1O(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                l1lo010ioi0.I000l1(i, 2);
/* 82 */                int iI00000oIO = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI00000oIO += l1lo010IOi0.I00000oIO(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               l1lo010ioi0.I000o00OoI0I(iI00000oIO);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   l1lo010ioi0.I000OiO(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < liioooli10.I00iiO) {
/* 70 */                    l1lo010ioi0.I000OOo1O(i, liioooli10.I0000O(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < liioooli10.I00iiO; i4++) {
/* 41 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(liioooli10.I0000O(i4));
                    }
/* 45 */            l1lo010ioi0.I000o00OoI0I(iI00000oIO2);
/* 50 */            while (i2 < liioooli10.I00iiO) {
/* 56 */                l1lo010ioi0.I000OiO(liioooli10.I0000O(i2));
/* 59 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIlIoll)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       l1lo010ioi0.I000oI1ioi(i, ((Long) list.get(i2)).longValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                l1lo010ioi0.I000l1(i, 2);
/* 81 */                int iI00000oIO = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oIO += l1lo010IOi0.I00000oIO(((Long) list.get(i3)).longValue());
                        }
/* 106 */               l1lo010ioi0.I000o00OoI0I(iI00000oIO);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   l1lo010ioi0.I00100l0(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIlIoll lilioll = (lIlIoll) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < lilioll.I00iiO) {
/* 69 */                    l1lo010ioi0.I000oI1ioi(i, lilioll.I0000O(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < lilioll.I00iiO; i4++) {
/* 40 */                iI00000oIO2 += l1lo010IOi0.I00000oIO(lilioll.I0000O(i4));
                    }
/* 44 */            l1lo010ioi0.I000o00OoI0I(iI00000oIO2);
/* 49 */            while (i2 < lilioll.I00iiO) {
/* 55 */                l1lo010ioi0.I00100l0(lilioll.I0000O(i2));
/* 58 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIIOOOli10)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       l1lo010ioi0.I0000oI00(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                l1lo010ioi0.I000l1(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                l1lo010ioi0.I000o00OoI0I(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   l1lo010ioi0.I0001Ioi1lo(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIIOOOli10 liioooli10 = (lIIOOOli10) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < liioooli10.I00iiO) {
/* 65 */                    l1lo010ioi0.I0000oI00(i, liioooli10.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < liioooli10.I00iiO; i6++) {
/* 32 */                liioooli10.I0000O(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            l1lo010ioi0.I000o00OoI0I(i5);
/* 45 */            while (i2 < liioooli10.I00iiO) {
/* 51 */                l1lo010ioi0.I0001Ioi1lo(liioooli10.I0000O(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, i11I1Ili i11i1ili, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof lIlIoll)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       l1lo010ioi0.I000II(i, ((Long) list.get(i2)).longValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                l1lo010ioi0.I000l1(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                l1lo010ioi0.I000o00OoI0I(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   l1lo010ioi0.I000O01llI0(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            lIlIoll lilioll = (lIlIoll) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < lilioll.I00iiO) {
/* 65 */                    l1lo010ioi0.I000II(i, lilioll.I0000O(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            l1lo010ioi0.I000l1(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < lilioll.I00iiO; i6++) {
/* 32 */                lilioll.I0000O(i6);
/* 35 */                i5 += 8;
                    }
/* 40 */            l1lo010ioi0.I000o00OoI0I(i5);
/* 45 */            while (i2 < lilioll.I00iiO) {
/* 51 */                l1lo010ioi0.I000O01llI0(lilioll.I0000O(i2));
/* 54 */                i2++;
                    }
                }
            }
