            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public class OoIolOO1 extends OoIoiillI1 {
                public final float I000l1;
                public final float I000lI;
                public int I000o00OoI0I;
                public final List I000oI1ioi;

                public OoIolOO1(OoIoiillo ooIoiillo, String str, String str2, List list, int i, int i2) {
/* 1 */             super(ooIoiillo, str, str2);
/* 5 */             this.I000o00OoI0I = 0;
/* 7 */             this.I000oI1ioi = list;
/* 10 */            this.I000l1 = i;
/* 13 */            this.I000lI = i2;
/* 20 */            this.I000OiO = new ArrayList();
/* 22 */            this.I000o00OoI0I = 0;
/* 27 */            OoIoii ooIoii = new OoIoii(1);
/* 30 */            ooIoii.I00000oOI = this;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            ooIoii.I00000oIO(list);
                }

                public static ArrayList I000l1(int i, List list) {
/* 5 */             int size = list.size() / i;
/* 8 */             ArrayList arrayList = new ArrayList(size);
/* 11 */            int i2 = 0;
/* 12 */            while (i2 < size) {
/* 14 */                int i3 = i2 * i;
/* 16 */                i2++;
/* 24 */                arrayList.add(list.subList(i3, i2 * i));
                    }
/* 89 */            return arrayList;
                }

                public final void I0000oI00(List list, IO1I000 io1i000) {
/* 3 */             this.I000OiO.addAll(list);
/* 8 */             this.I000OiO.add(io1i000);
                }

                public final void I0001Ioi1lo(List list, IO1I000 io1i000) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                I0000oI00((List) it.next(), io1i000);
                    }
                }

                public final List I000II(ArrayList arrayList, boolean z) {
/* 2 */             Float fValueOf = Float.valueOf(0.0f);
/* 12 */            if (this.I000OiO.isEmpty()) {
/* 19 */                if (z) {
/* 53 */                    I0000oI00(Arrays.asList(fValueOf, Float.valueOf(((Number) arrayList.get(0)).floatValue() + this.I000lI)), new IO1I000(13));
/* 60 */                    return arrayList.subList(1, arrayList.size());
                        }
/* 86 */                I0000oI00(Arrays.asList(fValueOf, Float.valueOf(this.I000l1)), new IO1I000(13));
                    }
/* 89 */            return arrayList;
                }

                public final void I000O01llI0() {
/* 15 */            IO1I000 io1i000 = this.I000o00OoI0I > 0 ? (IO1I000) IIl001iO0Io.I000OiO(1, this.I000OiO) : null;
/* 20 */            IO1I000 io1i0002 = new IO1I000(9);
/* 23 */            if (io1i000 == null || io1i0002.equals(io1i000)) {
/* 113 */               return;
                    }
/* 33 */            I0000oI00(Collections.EMPTY_LIST, io1i0002);
                }

                public final void I000OOo1O(ArrayList arrayList, boolean z) {
/* 8 */             List listSubList = arrayList;
/* 10 */            boolean z2 = z;
                    while (true) {
/* 16 */                int i = 4;
/* 17 */                if (listSubList.size() < 4) {
/* 551 */                   return;
                        }
/* 29 */                boolean z3 = listSubList.size() == 5;
/* 35 */                if (z2) {
/* 95 */                    I0000oI00(Arrays.asList((Number) listSubList.get(0), 0, (Number) listSubList.get(1), (Number) listSubList.get(2), z3 ? (Number) listSubList.get(4) : 0, (Number) listSubList.get(3)), new IO1I000(8));
                        } else {
/* 157 */                   I0000oI00(Arrays.asList(0, (Number) listSubList.get(0), (Number) listSubList.get(1), (Number) listSubList.get(2), (Number) listSubList.get(3), z3 ? (Number) listSubList.get(4) : 0), new IO1I000(8));
                        }
/* 160 */               if (z3) {
/* 162 */                   i = 5;
                        }
/* 167 */               listSubList = listSubList.subList(i, listSubList.size());
                        z2 = !z2;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
                public final void I000OiO(ArrayList arrayList, boolean z) {
/* 5 */             for (ArrayList arrayListSubList = arrayList; !arrayListSubList.isEmpty(); arrayListSubList = arrayListSubList.subList(1, arrayListSubList.size())) {
/* 23 */                I0000oI00(arrayListSubList.subList(0, 1), new IO1I000(z ? 6 : 7));
                        z = !z;
                    }
                }

                public final void I000iOII(ArrayList arrayList, boolean z) {
                    int i;
/* 8 */             List listSubList = arrayList;
                    while (true) {
/* 15 */                if (listSubList.size() < 4) {
/* 551 */                   return;
                        }
/* 27 */                int i2 = listSubList.size() % 4 == 1 ? 1 : 0;
/* 34 */                if (z) {
/* 74 */                    i = 4;
/* 109 */                   I0000oI00(Arrays.asList((Number) listSubList.get(i2), i2 != 0 ? (Number) listSubList.get(0) : 0, (Number) listSubList.get(i2 != 0 ? 2 : 1), (Number) listSubList.get(i2 != 0 ? 3 : 2), (Number) listSubList.get(i2 == 0 ? 3 : 4), 0), new IO1I000(8));
                        } else {
/* 113 */                   i = 4;
/* 188 */                   I0000oI00(Arrays.asList(i2 != 0 ? (Number) listSubList.get(0) : 0, (Number) listSubList.get(i2), (Number) listSubList.get(i2 != 0 ? 2 : 1), (Number) listSubList.get(i2 != 0 ? 3 : 2), 0, (Number) listSubList.get(i2 != 0 ? 4 : 3)), new IO1I000(8));
                        }
/* 201 */               listSubList = listSubList.subList(i2 != 0 ? 5 : i, listSubList.size());
                    }
                }
            }
