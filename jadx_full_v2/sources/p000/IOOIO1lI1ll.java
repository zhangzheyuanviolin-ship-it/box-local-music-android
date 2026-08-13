            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class IOOIO1lI1ll implements IOOI0i0Io {
                public int I00iOIl;
                public int I00iiI;
                public long I00iiO;
                public int[] I00iio;
                public HashMap I00ilI0I1;
                public HashMap I00ilO0;

                public static int[] I00000oOI(int i) {
/* 1 */             int[] iArr = new int[i];
/* 4 */             Arrays.fill(iArr, -1);
/* 49 */            return iArr;
                }

                public final void I00000oIO(int i) {
/* 1 */             HashMap map = this.I00ilI0I1;
/* 9 */             this.I00iio = I00000oOI(i + 1);
/* 25 */            for (Map.Entry entry : this.I00ilO0.entrySet()) {
/* 48 */                if (this.I00iio[((Integer) entry.getValue()).intValue()] == -1) {
/* 72 */                    this.I00iio[((Integer) entry.getValue()).intValue()] = ((Integer) entry.getKey()).intValue();
                        } else {
/* 83 */                    List list = (List) map.get(entry.getValue());
                            List list2 = list;
/* 85 */                    if (list == null) {
/* 89 */                        ArrayList arrayList = new ArrayList();
/* 96 */                        map.put(entry.getValue(), arrayList);
/* 117 */                       arrayList.add(Integer.valueOf(this.I00iio[((Integer) entry.getValue()).intValue()]));
/* 134 */                       this.I00iio[((Integer) entry.getValue()).intValue()] = Integer.MIN_VALUE;
                                list2 = arrayList;
                            }
/* 140 */                   list2.add(entry.getKey());
                        }
                    }
                }

                @Override
                public final ArrayList I0001Ioi1lo(int i) {
                    int[] iArr;
/* 15 */            int i2 = (i < 0 || (iArr = this.I00iio) == null || i >= iArr.length) ? -1 : iArr[i];
/* 16 */            if (i2 == -1) {
/* 46 */                return null;
                    }
/* 21 */            if (i2 != Integer.MIN_VALUE) {
/* 51 */                ArrayList arrayList = new ArrayList(1);
/* 58 */                arrayList.add(Integer.valueOf(i2));
/* 186 */               return arrayList;
                    }
/* 33 */            List list = (List) this.I00ilI0I1.get(Integer.valueOf(i));
/* 35 */            if (list == null) {
/* 46 */                return null;
                    }
/* 39 */            ArrayList arrayList2 = new ArrayList(list);
/* 42 */            Collections.sort(arrayList2);
/* 45 */            return arrayList2;
                }

                @Override
                public final int I000II(int i) {
/* 11 */            Integer num = (Integer) this.I00ilO0.get(Integer.valueOf(i));
/* 13 */            if (num == null) {
/* 15 */                return 0;
                    }
/* 17 */            return num.intValue();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("{");
/* 10 */            sb.append(this.I00iOIl);
/* 15 */            sb.append(" ");
/* 22 */            return IIl001iO0Io.I000lI(this.I00iiI, "}", sb);
                }
            }
