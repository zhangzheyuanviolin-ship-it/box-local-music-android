            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class iooiolOil0 {
                public static final i1O01oOIoI0I I00000oIO;

                static {
/* 1 */             ioiO0iOooii ioio0ioooii = ioiO0iOooii.I0000Il00O;
/* 10 */            I00000oIO = new i1O01oOIoI0I(26);
                }

                public static void I00000oIO(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof illiooo1io0I)) {
/* 90 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 168 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 177 */                       ilio10io.I000o00OoI0I(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 180 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 92 */                ilio10io.I000lI(i, 2);
/* 96 */                int iI00000oIO = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iI00000oIO += ilIO10iO.I00000oIO((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               ilio10io.I000oI1ioi(iI00000oIO);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   ilio10io.I000oI1ioi((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 21 */            if (!z) {
/* 73 */                while (i2 < illiooo1io0i.I00iiO) {
/* 75 */                    int iI00000oOI = illiooo1io0i.I00000oOI(i2);
/* 84 */                    ilio10io.I000o00OoI0I(i, (iI00000oOI >> 31) ^ (iI00000oOI + iI00000oOI));
/* 87 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < illiooo1io0i.I00iiO; i4++) {
/* 32 */                int iI00000oOI2 = illiooo1io0i.I00000oOI(i4);
/* 45 */                iI00000oIO2 += ilIO10iO.I00000oIO((iI00000oOI2 >> 31) ^ (iI00000oOI2 + iI00000oOI2));
                    }
/* 49 */            ilio10io.I000oI1ioi(iI00000oIO2);
/* 54 */            while (i2 < illiooo1io0i.I00iiO) {
/* 56 */                int iI00000oOI3 = illiooo1io0i.I00000oOI(i2);
/* 65 */                ilio10io.I000oI1ioi((iI00000oOI3 >> 31) ^ (iI00000oOI3 + iI00000oOI3));
/* 68 */                i2++;
                    }
                }

                public static void I00000oOI(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof io1II0loO1ol) {
/* 111 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 19 */            int i2 = 0;
/* 20 */            if (!z) {
/* 89 */                while (i2 < list.size()) {
/* 97 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 105 */                   ilio10io.I00100l0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 108 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int iI00000oOI = 0;
/* 32 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 40 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 52 */                iI00000oOI += ilIO10iO.I00000oOI((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                    }
/* 56 */            ilio10io.I000oI1ioi(iI00000oOI);
/* 63 */            while (i2 < list.size()) {
/* 71 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 79 */                ilio10io.I00100o1O0lo((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 82 */                i2++;
                    }
                }

                public static void I0000Il00O(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof illiooo1io0I)) {
/* 75 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 147 */                       ilio10io.I000o00OoI0I(i, ((Integer) list.get(i2)).intValue());
/* 150 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 77 */                ilio10io.I000lI(i, 2);
/* 81 */                int iI00000oIO = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iI00000oIO += ilIO10iO.I00000oIO(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               ilio10io.I000oI1ioi(iI00000oIO);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   ilio10io.I000oI1ioi(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 21 */            if (!z) {
/* 63 */                while (i2 < illiooo1io0i.I00iiO) {
/* 69 */                    ilio10io.I000o00OoI0I(i, illiooo1io0i.I00000oOI(i2));
/* 72 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int iI00000oIO2 = 0;
/* 30 */            for (int i4 = 0; i4 < illiooo1io0i.I00iiO; i4++) {
/* 40 */                iI00000oIO2 += ilIO10iO.I00000oIO(illiooo1io0i.I00000oOI(i4));
                    }
/* 44 */            ilio10io.I000oI1ioi(iI00000oIO2);
/* 49 */            while (i2 < illiooo1io0i.I00iiO) {
/* 55 */                ilio10io.I000oI1ioi(illiooo1io0i.I00000oOI(i2));
/* 58 */                i2++;
                    }
                }

                public static void I0000O(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof io1II0loO1ol) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    ilio10io.I00100l0(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ilio10io.I000lI(i, 2);
/* 25 */            int iI00000oOI = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI00000oOI += ilIO10iO.I00000oOI(((Long) list.get(i3)).longValue());
                    }
/* 50 */            ilio10io.I000oI1ioi(iI00000oOI);
/* 57 */            while (i2 < list.size()) {
/* 69 */                ilio10io.I00100o1O0lo(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
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
/* 11 */            if (!(list instanceof illiooo1io0I)) {
/* 32 */                int iI00000oOI = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI00000oOI += ilIO10iO.I00000oOI(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI00000oOI2 += ilIO10iO.I00000oOI(illiooo1io0i.I00000oOI(i));
/* 28 */                i++;
                    }
/* 31 */            return iI00000oOI2;
                }

                public static int I000II(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (ilIO10iO.I00000oIO(i << 3) + 4) * size;
                }

                public static int I000O01llI0(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (ilIO10iO.I00000oIO(i << 3) + 8) * size;
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof illiooo1io0I)) {
/* 32 */                int iI00000oOI = 0;
/* 33 */                while (i < size) {
/* 50 */                    iI00000oOI += ilIO10iO.I00000oOI(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 77 */                return iI00000oOI;
                    }
/* 13 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 15 */            int iI00000oOI2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iI00000oOI2 += ilIO10iO.I00000oOI(illiooo1io0i.I00000oOI(i));
/* 28 */                i++;
                    }
/* 31 */            return iI00000oOI2;
                }

                public static int I000OiO(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof io1II0loO1ol) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oOI = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI00000oOI += ilIO10iO.I00000oOI(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI00000oOI;
                }

                public static int I000iOII(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof illiooo1io0I)) {
/* 36 */                int iI00000oIO = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iI00000oIO += ilIO10iO.I00000oIO((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iI00000oOI = illiooo1io0i.I00000oOI(i);
/* 31 */                iI00000oIO2 += ilIO10iO.I00000oIO((iI00000oOI >> 31) ^ (iI00000oOI + iI00000oOI));
/* 32 */                i++;
                    }
/* 35 */            return iI00000oIO2;
                }

                public static int I000l1(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof io1II0loO1ol) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oOI = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 29 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 43 */                iI00000oOI += ilIO10iO.I00000oOI((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    }
/* 77 */            return iI00000oOI;
                }

                public static int I000lI(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof illiooo1io0I)) {
/* 31 */                int iI00000oIO = 0;
/* 32 */                while (i < size) {
/* 48 */                    iI00000oIO += ilIO10iO.I00000oIO(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 77 */                return iI00000oIO;
                    }
/* 13 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 15 */            int iI00000oIO2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iI00000oIO2 += ilIO10iO.I00000oIO(illiooo1io0i.I00000oOI(i));
/* 27 */                i++;
                    }
/* 30 */            return iI00000oIO2;
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof io1II0loO1ol) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oOI = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI00000oOI += ilIO10iO.I00000oOI(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI00000oOI;
                }

                public static void I000oI1ioi(Object obj, Object obj2) {
/* 5 */             ioolilol1oO0 ioolilol1oo0 = ((ill0o1o) obj2).zzb.I00000oIO;
/* 11 */            if (ioolilol1oo0.isEmpty()) {
/* 106 */               return;
                    }
/* 13 */            ill0o1o ill0o1oVar = (ill0o1o) obj;
/* 15 */            ilOol10I0IlI ilool10i0iliI00000oOI = ill0o1oVar.zzb;
/* 19 */            if (ilool10i0iliI00000oOI.I00000oOI) {
/* 21 */                ilool10i0iliI00000oOI = ilool10i0iliI00000oOI.clone();
/* 25 */                ill0o1oVar.zzb = ilool10i0iliI00000oOI;
                    }
/* 27 */            int i = ioolilol1oo0.I00iiI;
/* 30 */            for (int i2 = 0; i2 < i; i2++) {
/* 36 */                ilool10i0iliI00000oOI.I000II(ioolilol1oo0.I0000Il00O(i2));
                    }
/* 46 */            Iterator it = ioolilol1oo0.I00000oIO().iterator();
/* 54 */            while (it.hasNext()) {
/* 62 */                ilool10i0iliI00000oOI.I000II((Map.Entry) it.next());
                    }
                }

                public static void I00100l0(Object obj, Object obj2) {
/* 1 */             illOil illoil = (illOil) obj;
/* 3 */             l01IO0I1I l01io0i1i = illoil.zzc;
/* 7 */             l01IO0I1I l01io0i1i2 = ((illOil) obj2).zzc;
/* 9 */             l01IO0I1I l01io0i1i3 = l01IO0I1I.I0001Ioi1lo;
/* 15 */            if (!l01io0i1i3.equals(l01io0i1i2)) {
/* 22 */                if (l01io0i1i3.equals(l01io0i1i)) {
/* 28 */                    int i = l01io0i1i.I00000oIO + l01io0i1i2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(l01io0i1i.I00000oOI, i);
/* 41 */                    System.arraycopy(l01io0i1i2.I00000oOI, 0, iArrCopyOf, l01io0i1i.I00000oIO, l01io0i1i2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(l01io0i1i.I0000Il00O, i);
/* 56 */                    System.arraycopy(l01io0i1i2.I0000Il00O, 0, objArrCopyOf, l01io0i1i.I00000oIO, l01io0i1i2.I00000oIO);
/* 62 */                    l01io0i1i = new l01IO0I1I(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    l01io0i1i.getClass();
/* 73 */                    if (!l01io0i1i2.equals(l01io0i1i3)) {
/* 78 */                        if (!l01io0i1i.I0000oI00) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = l01io0i1i.I00000oIO + l01io0i1i2.I00000oIO;
/* 85 */                        l01io0i1i.I0000oI00(i2);
/* 96 */                        System.arraycopy(l01io0i1i2.I00000oOI, 0, l01io0i1i.I00000oOI, l01io0i1i.I00000oIO, l01io0i1i2.I00000oIO);
/* 107 */                       System.arraycopy(l01io0i1i2.I0000Il00O, 0, l01io0i1i.I0000Il00O, l01io0i1i.I00000oIO, l01io0i1i2.I00000oIO);
/* 110 */                       l01io0i1i.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           illoil.zzc = l01io0i1i;
                }

                public static void I00100o1O0lo(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof il0lloIOl0O) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 89 */                    ilio10io.I000oI1ioi(i << 3);
/* 92 */                    ilio10io.I0000Il00O(zBooleanValue ? (byte) 1 : (byte) 0);
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ilio10io.I000lI(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            ilio10io.I000oI1ioi(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                ilio10io.I0000Il00O(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 68 */                i2++;
                    }
                }

                public static void I0010I0i(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof ilO0iooO1) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    ilio10io.I000O01llI0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ilio10io.I000lI(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            ilio10io.I000oI1ioi(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                ilio10io.I000OOo1O(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I0010o(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof illiooo1io0I)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       ilio10io.I000OiO(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                ilio10io.I000lI(i, 2);
/* 82 */                int iI00000oOI = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI00000oOI += ilIO10iO.I00000oOI(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               ilio10io.I000oI1ioi(iI00000oOI);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   ilio10io.I000iOII(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < illiooo1io0i.I00iiO) {
/* 70 */                    ilio10io.I000OiO(i, illiooo1io0i.I00000oOI(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < illiooo1io0i.I00iiO; i4++) {
/* 41 */                iI00000oOI2 += ilIO10iO.I00000oOI(illiooo1io0i.I00000oOI(i4));
                    }
/* 45 */            ilio10io.I000oI1ioi(iI00000oOI2);
/* 50 */            while (i2 < illiooo1io0i.I00iiO) {
/* 56 */                ilio10io.I000iOII(illiooo1io0i.I00000oOI(i2));
/* 59 */                i2++;
                    }
                }

                public static void I00111O(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof illiooo1io0I)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       ilio10io.I0001Ioi1lo(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                ilio10io.I000lI(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                ilio10io.I000oI1ioi(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   ilio10io.I000II(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < illiooo1io0i.I00iiO) {
/* 65 */                    ilio10io.I0001Ioi1lo(i, illiooo1io0i.I00000oOI(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < illiooo1io0i.I00iiO; i6++) {
/* 32 */                illiooo1io0i.I00000oOI(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            ilio10io.I000oI1ioi(i5);
/* 45 */            while (i2 < illiooo1io0i.I00iiO) {
/* 51 */                ilio10io.I000II(illiooo1io0i.I00000oOI(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof io1II0loO1ol) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    ilio10io.I000O01llI0(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ilio10io.I000lI(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            ilio10io.I000oI1ioi(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                ilio10io.I000OOo1O(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I001IO000(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof iliO1I10o0)) {
/* 89 */                if (!z) {
/* 149 */                   while (i2 < list.size()) {
/* 165 */                       ilio10io.I0001Ioi1lo(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 168 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 91 */                ilio10io.I000lI(i, 2);
/* 95 */                int i3 = 0;
/* 100 */               for (int i4 = 0; i4 < list.size(); i4++) {
/* 108 */                   ((Float) list.get(i4)).getClass();
/* 111 */                   i3 += 4;
                        }
/* 116 */               ilio10io.I000oI1ioi(i3);
/* 123 */               while (i2 < list.size()) {
/* 139 */                   ilio10io.I000II(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 142 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            iliO1I10o0 ilio1i10o0 = (iliO1I10o0) list;
/* 21 */            if (!z) {
/* 70 */                while (i2 < ilio1i10o0.I00iiO) {
/* 72 */                    ilio1i10o0.I0000O(i2);
/* 83 */                    ilio10io.I0001Ioi1lo(i, Float.floatToRawIntBits(ilio1i10o0.I00iiI[i2]));
/* 86 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < ilio1i10o0.I00iiO; i6++) {
/* 32 */                ilio1i10o0.I0000O(i6);
/* 37 */                float f = ilio1i10o0.I00iiI[i6];
/* 39 */                i5 += 4;
                    }
/* 44 */            ilio10io.I000oI1ioi(i5);
/* 49 */            while (i2 < ilio1i10o0.I00iiO) {
/* 51 */                ilio1i10o0.I0000O(i2);
/* 62 */                ilio10io.I000II(Float.floatToRawIntBits(ilio1i10o0.I00iiI[i2]));
/* 65 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof illiooo1io0I)) {
/* 76 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 149 */                       ilio10io.I000OiO(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 78 */                ilio10io.I000lI(i, 2);
/* 82 */                int iI00000oOI = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iI00000oOI += ilIO10iO.I00000oOI(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               ilio10io.I000oI1ioi(iI00000oOI);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   ilio10io.I000iOII(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 21 */            if (!z) {
/* 64 */                while (i2 < illiooo1io0i.I00iiO) {
/* 70 */                    ilio10io.I000OiO(i, illiooo1io0i.I00000oOI(i2));
/* 73 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int iI00000oOI2 = 0;
/* 30 */            for (int i4 = 0; i4 < illiooo1io0i.I00iiO; i4++) {
/* 41 */                iI00000oOI2 += ilIO10iO.I00000oOI(illiooo1io0i.I00000oOI(i4));
                    }
/* 45 */            ilio10io.I000oI1ioi(iI00000oOI2);
/* 50 */            while (i2 < illiooo1io0i.I00iiO) {
/* 56 */                ilio10io.I000iOII(illiooo1io0i.I00000oOI(i2));
/* 59 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof io1II0loO1ol) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    ilio10io.I00100l0(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ilio10io.I000lI(i, 2);
/* 25 */            int iI00000oOI = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI00000oOI += ilIO10iO.I00000oOI(((Long) list.get(i3)).longValue());
                    }
/* 50 */            ilio10io.I000oI1ioi(iI00000oOI);
/* 57 */            while (i2 < list.size()) {
/* 69 */                ilio10io.I00100o1O0lo(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 16 */            int i2 = 0;
/* 17 */            if (!(list instanceof illiooo1io0I)) {
/* 71 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 139 */                       ilio10io.I0001Ioi1lo(i, ((Integer) list.get(i2)).intValue());
/* 142 */                       i2++;
                            }
/* 204 */                   return;
                        }
/* 73 */                ilio10io.I000lI(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                ilio10io.I000oI1ioi(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   ilio10io.I000II(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 19 */            illiooo1io0I illiooo1io0i = (illiooo1io0I) list;
/* 21 */            if (!z) {
/* 59 */                while (i2 < illiooo1io0i.I00iiO) {
/* 65 */                    ilio10io.I0001Ioi1lo(i, illiooo1io0i.I00000oOI(i2));
/* 68 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            ilio10io.I000lI(i, 2);
/* 27 */            int i5 = 0;
/* 30 */            for (int i6 = 0; i6 < illiooo1io0i.I00iiO; i6++) {
/* 32 */                illiooo1io0i.I00000oOI(i6);
/* 35 */                i5 += 4;
                    }
/* 40 */            ilio10io.I000oI1ioi(i5);
/* 45 */            while (i2 < illiooo1io0i.I00iiO) {
/* 51 */                ilio10io.I000II(illiooo1io0i.I00000oOI(i2));
/* 54 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, i1IoOl i1iool, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 15 */            if (list instanceof io1II0loO1ol) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    ilio10io.I000O01llI0(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            ilio10io.I000lI(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            ilio10io.I000oI1ioi(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                ilio10io.I000OOo1O(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }
            }
