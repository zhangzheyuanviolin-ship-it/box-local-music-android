            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class o0OIIlOIl01I {
                public static final i1i0olI I00000oIO;

                static {
/* 1 */             o0Ioolo o0ioolo = o0Ioolo.I0000Il00O;
/* 10 */            I00000oIO = new i1i0olI(28);
                }

                public static void I00000oIO(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o00I0o1ilIO1) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    lolio00.I0000oI00(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Integer) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                lolio00.I0001Ioi1lo(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I00000oOI(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o01O1l0) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    lolio00.I000II(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                lolio00.I000O01llI0(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I0000Il00O(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o00I0o1ilIO1) {
/* 112 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 89 */                while (i2 < list.size()) {
/* 97 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 106 */                   lolio00.I000iOII(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 109 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int iI00100l0 = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 38 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 51 */                iI00100l0 += loliO00.I00100l0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                    }
/* 55 */            lolio00.I000l1(iI00100l0);
/* 62 */            while (i2 < list.size()) {
/* 70 */                int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 79 */                lolio00.I000l1((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 82 */                i2++;
                    }
                }

                public static void I0000O(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o01O1l0) {
/* 111 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 19 */            int i2 = 0;
/* 20 */            if (!z) {
/* 89 */                while (i2 < list.size()) {
/* 97 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 105 */                   lolio00.I000lI(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 108 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 23 */            lolio00.I000OiO(i, 2);
/* 27 */            int iI00000oIO = 0;
/* 32 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 40 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 52 */                iI00000oIO += loliO00.I00000oIO((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                    }
/* 56 */            lolio00.I000l1(iI00000oIO);
/* 63 */            while (i2 < list.size()) {
/* 71 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 79 */                lolio00.I000o00OoI0I((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 82 */                i2++;
                    }
                }

                public static void I0000oI00(int i, List list, o0iO1llOoO o0io1llooo) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 98 */                return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            int i2 = 0;
/* 16 */            if (!(list instanceof o01I0lI1)) {
/* 53 */                while (i2 < list.size()) {
/* 61 */                    lolio00.I000OOo1O(i, (String) list.get(i2));
/* 64 */                    i2++;
                        }
/* 98 */                return;
                    }
/* 19 */            o01I0lI1 o01i0li1 = (o01I0lI1) list;
/* 25 */            while (i2 < list.size()) {
/* 27 */                Object objZza = o01i0li1.zza();
/* 33 */                if (objZza instanceof String) {
/* 37 */                    lolio00.I000OOo1O(i, (String) objZza);
                        } else {
/* 43 */                    lolio00.I0000O(i, (lol1I010) objZza);
                        }
/* 46 */                i2++;
                    }
                }

                public static void I0001Ioi1lo(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o00I0o1ilIO1) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    lolio00.I000iOII(i, ((Integer) list.get(i2)).intValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int iI00100l0 = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI00100l0 += loliO00.I00100l0(((Integer) list.get(i3)).intValue());
                    }
/* 50 */            lolio00.I000l1(iI00100l0);
/* 57 */            while (i2 < list.size()) {
/* 69 */                lolio00.I000l1(((Integer) list.get(i2)).intValue());
/* 72 */                i2++;
                    }
                }

                public static void I000II(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o01O1l0) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    lolio00.I000lI(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int iI00000oIO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI00000oIO += loliO00.I00000oIO(((Long) list.get(i3)).longValue());
                    }
/* 50 */            lolio00.I000l1(iI00000oIO);
/* 57 */            while (i2 < list.size()) {
/* 69 */                lolio00.I000o00OoI0I(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }

                public static boolean I000O01llI0(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static int I000OOo1O(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o00I0o1ilIO1) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oIO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI00000oIO += loliO00.I00000oIO(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI00000oIO;
                }

                public static int I000OiO(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (loliO00.I00100l0(i << 3) + 4) * size;
                }

                public static int I000iOII(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (loliO00.I00100l0(i << 3) + 8) * size;
                }

                public static int I000l1(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o00I0o1ilIO1) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oIO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 38 */                iI00000oIO += loliO00.I00000oIO(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI00000oIO;
                }

                public static int I000lI(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o01O1l0) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oIO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI00000oIO += loliO00.I00000oIO(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI00000oIO;
                }

                public static int I000o00OoI0I(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o00I0o1ilIO1) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00100l0 = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 29 */                int iIntValue = ((Integer) list.get(i)).intValue();
/* 42 */                iI00100l0 += loliO00.I00100l0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    }
/* 77 */            return iI00100l0;
                }

                public static int I000oI1ioi(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o01O1l0) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oIO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 29 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 43 */                iI00000oIO += loliO00.I00000oIO((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    }
/* 77 */            return iI00000oIO;
                }

                public static int I00100l0(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o00I0o1ilIO1) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00100l0 = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI00100l0 += loliO00.I00100l0(((Integer) list.get(i)).intValue());
                    }
/* 77 */            return iI00100l0;
                }

                public static int I00100o1O0lo(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof o01O1l0) {
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 19 */                throw null;
                    }
/* 20 */            int iI00000oIO = 0;
/* 21 */            for (int i = 0; i < size; i++) {
/* 37 */                iI00000oIO += loliO00.I00000oIO(((Long) list.get(i)).longValue());
                    }
/* 77 */            return iI00000oIO;
                }

                public static void I0010I0i(Object obj, Object obj2) {
/* 5 */             o0OIiOo0oOi o0oiioo0ooi = ((looo1olo1) obj2).zzb.I00000oIO;
/* 11 */            if (o0oiioo0ooi.isEmpty()) {
/* 106 */               return;
                    }
/* 13 */            looo1olo1 looo1olo1Var = (looo1olo1) obj;
/* 15 */            looOi1oiO loooi1oioI00000oOI = looo1olo1Var.zzb;
/* 19 */            if (loooi1oioI00000oOI.I00000oOI) {
/* 21 */                loooi1oioI00000oOI = loooi1oioI00000oOI.clone();
/* 25 */                looo1olo1Var.zzb = loooi1oioI00000oOI;
                    }
/* 27 */            int i = o0oiioo0ooi.I00iiI;
/* 30 */            for (int i2 = 0; i2 < i; i2++) {
/* 36 */                loooi1oioI00000oOI.I000O01llI0(o0oiioo0ooi.I0000Il00O(i2));
                    }
/* 46 */            Iterator it = o0oiioo0ooi.I00000oIO().iterator();
/* 54 */            while (it.hasNext()) {
/* 62 */                loooi1oioI00000oOI.I000O01llI0((Map.Entry) it.next());
                    }
                }

                public static void I0010o(Object obj, Object obj2) {
/* 1 */             o001IlOi0O o001iloi0o = (o001IlOi0O) obj;
/* 3 */             o0i0oOOIl1Io o0i0oooil1io = o001iloi0o.zzc;
/* 7 */             o0i0oOOIl1Io o0i0oooil1io2 = ((o001IlOi0O) obj2).zzc;
/* 9 */             o0i0oOOIl1Io o0i0oooil1io3 = o0i0oOOIl1Io.I0001Ioi1lo;
/* 15 */            if (!o0i0oooil1io3.equals(o0i0oooil1io2)) {
/* 22 */                if (o0i0oooil1io3.equals(o0i0oooil1io)) {
/* 28 */                    int i = o0i0oooil1io.I00000oIO + o0i0oooil1io2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(o0i0oooil1io.I00000oOI, i);
/* 41 */                    System.arraycopy(o0i0oooil1io2.I00000oOI, 0, iArrCopyOf, o0i0oooil1io.I00000oIO, o0i0oooil1io2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(o0i0oooil1io.I0000Il00O, i);
/* 56 */                    System.arraycopy(o0i0oooil1io2.I0000Il00O, 0, objArrCopyOf, o0i0oooil1io.I00000oIO, o0i0oooil1io2.I00000oIO);
/* 62 */                    o0i0oooil1io = new o0i0oOOIl1Io(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    o0i0oooil1io.getClass();
/* 73 */                    if (!o0i0oooil1io2.equals(o0i0oooil1io3)) {
/* 78 */                        if (!o0i0oooil1io.I0000oI00) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = o0i0oooil1io.I00000oIO + o0i0oooil1io2.I00000oIO;
/* 85 */                        o0i0oooil1io.I0000oI00(i2);
/* 96 */                        System.arraycopy(o0i0oooil1io2.I00000oOI, 0, o0i0oooil1io.I00000oOI, o0i0oooil1io.I00000oIO, o0i0oooil1io2.I00000oIO);
/* 107 */                       System.arraycopy(o0i0oooil1io2.I0000Il00O, 0, o0i0oooil1io.I0000Il00O, o0i0oooil1io.I00000oIO, o0i0oooil1io2.I00000oIO);
/* 110 */                       o0i0oooil1io.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           o001iloi0o.zzc = o0i0oooil1io;
                }

                public static void I00111O(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof loiIIllIo) {
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 89 */                    lolio00.I000l1(i << 3);
/* 92 */                    lolio00.I00000oOI(zBooleanValue ? (byte) 1 : (byte) 0);
/* 95 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Boolean) list.get(i4)).getClass();
/* 41 */                i3++;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                lolio00.I00000oOI(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 68 */                i2++;
                    }
                }

                public static void I001IIilI0O(int i, List list, o0iO1llOoO o0io1llooo) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 98 */                return;
                    }
/* 9 */             o0io1llooo.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 29 */                ((loliO00) o0io1llooo.I00000oIO).I0000O(i, (lol1I010) list.get(i2));
                    }
                }

                public static void I001IO000(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof loo01OOOo) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    lolio00.I000II(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Double) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                lolio00.I000O01llI0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 72 */                i2++;
                    }
                }

                public static void I001i1O0Ol(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o00I0o1ilIO1) {
/* 117 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 87 */                while (i2 < list.size()) {
/* 95 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 101 */                   lolio00.I000l1(i << 3);
/* 104 */                   if (iIntValue >= 0) {
/* 106 */                       lolio00.I000l1(iIntValue);
                            } else {
/* 111 */                       lolio00.I000o00OoI0I(iIntValue);
                            }
/* 114 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int iI00000oIO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 47 */                iI00000oIO += loliO00.I00000oIO(((Integer) list.get(i3)).intValue());
                    }
/* 51 */            lolio00.I000l1(iI00000oIO);
/* 58 */            while (i2 < list.size()) {
/* 66 */                int iIntValue2 = ((Integer) list.get(i2)).intValue();
/* 70 */                if (iIntValue2 >= 0) {
/* 72 */                    lolio00.I000l1(iIntValue2);
                        } else {
/* 77 */                    lolio00.I000o00OoI0I(iIntValue2);
                        }
/* 80 */                i2++;
                    }
                }

                public static void I001i1lo1io(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o00I0o1ilIO1) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    lolio00.I0000oI00(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Integer) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                lolio00.I0001Ioi1lo(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                public static void I001iOo1i0O(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o01O1l0) {
/* 93 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    lolio00.I000II(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Long) list.get(i4)).getClass();
/* 41 */                i3 += 8;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 65 */                lolio00.I000O01llI0(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                public static void I001l0I00(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof looiOooooiI) {
/* 101 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 95 */                    lolio00.I0000oI00(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 98 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int i3 = 0;
/* 30 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 38 */                ((Float) list.get(i4)).getClass();
/* 41 */                i3 += 4;
                    }
/* 46 */            lolio00.I000l1(i3);
/* 53 */            while (i2 < list.size()) {
/* 69 */                lolio00.I0001Ioi1lo(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 72 */                i2++;
                    }
                }

                public static void I001lIiIIo1O(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o00I0o1ilIO1) {
/* 117 */               OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 87 */                while (i2 < list.size()) {
/* 95 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 101 */                   lolio00.I000l1(i << 3);
/* 104 */                   if (iIntValue >= 0) {
/* 106 */                       lolio00.I000l1(iIntValue);
                            } else {
/* 111 */                       lolio00.I000o00OoI0I(iIntValue);
                            }
/* 114 */                   i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int iI00000oIO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 47 */                iI00000oIO += loliO00.I00000oIO(((Integer) list.get(i3)).intValue());
                    }
/* 51 */            lolio00.I000l1(iI00000oIO);
/* 58 */            while (i2 < list.size()) {
/* 66 */                int iIntValue2 = ((Integer) list.get(i2)).intValue();
/* 70 */                if (iIntValue2 >= 0) {
/* 72 */                    lolio00.I000l1(iIntValue2);
                        } else {
/* 77 */                    lolio00.I000o00OoI0I(iIntValue2);
                        }
/* 80 */                i2++;
                    }
                }

                public static void I001lllioOl(int i, List list, o0iO1llOoO o0io1llooo, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 204 */               return;
                    }
/* 11 */            loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 15 */            if (list instanceof o01O1l0) {
/* 97 */                OIiilo1Ool0o.I00000oIO();
/* 204 */               return;
                    }
/* 17 */            int i2 = 0;
/* 18 */            if (!z) {
/* 79 */                while (i2 < list.size()) {
/* 91 */                    lolio00.I000lI(i, ((Long) list.get(i2)).longValue());
/* 94 */                    i2++;
                        }
/* 204 */               return;
                    }
/* 21 */            lolio00.I000OiO(i, 2);
/* 25 */            int iI00000oIO = 0;
/* 30 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 46 */                iI00000oIO += loliO00.I00000oIO(((Long) list.get(i3)).longValue());
                    }
/* 50 */            lolio00.I000l1(iI00000oIO);
/* 57 */            while (i2 < list.size()) {
/* 69 */                lolio00.I000o00OoI0I(((Long) list.get(i2)).longValue());
/* 72 */                i2++;
                    }
                }
            }
