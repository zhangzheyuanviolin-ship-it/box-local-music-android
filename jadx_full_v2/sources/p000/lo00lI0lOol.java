            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class lo00lI0lOol extends iIIoIiOoOoiO {
                public final boolean I00iiO;
                public final boolean I00iio;
                public final l1oo00Iio10 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lo00lI0lOol(l1oo00Iio10 l1oo00iio10, boolean z, boolean z2) {
/* 5 */             super("log");
/* 1 */             this.I00ilI0I1 = l1oo00iio10;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = z2;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final iO0iIIoO11 I00000oIO(OillOo0 oillOo0, List list) {
                    int i;
                    int i2;
/* 10 */            ll00I0ii.I00000oOI("log", 1, list);
/* 13 */            int size = list.size();
/* 18 */            iOOl1i1 iool1i1 = iO0iIIoO11.I00Ol1ll1;
/* 20 */            l1oo00Iio10 l1oo00iio10 = this.I00ilI0I1;
/* 22 */            if (size == 1) {
/* 54 */                ((iii1IIii) l1oo00iio10.I00iio).I0000Il00O(3, ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(0)).zzc(), Collections.EMPTY_LIST, this.I00iiO, this.I00iio);
/* 57 */                return iool1i1;
                    }
/* 62 */            iO0iIIoO11 io0iiioo11 = (iO0iIIoO11) list.get(0);
/* 66 */            OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) oillOo0.I00iiO;
/* 70 */            OoOlO1O0o ooOlO1O0o2 = (OoOlO1O0o) oillOo0.I00iiO;
/* 84 */            int iI000II = ll00I0ii.I000II(ooOlO1O0o.I000OiO(oillOo0, io0iiioo11).zzd().doubleValue());
/* 90 */            if (iI000II != 2) {
/* 92 */                i = 3;
/* 93 */                if (iI000II == 3) {
/* 106 */                   i2 = 1;
                        } else if (iI000II == 5) {
/* 104 */                   i2 = 5;
                        } else if (iI000II == 6) {
/* 102 */                   i2 = 2;
                        }
/* 120 */               String strZzc = ooOlO1O0o2.I000OiO(oillOo0, (iO0iIIoO11) list.get(1)).zzc();
/* 128 */               if (list.size() != 2) {
/* 143 */                   ((iii1IIii) l1oo00iio10.I00iio).I0000Il00O(i2, strZzc, Collections.EMPTY_LIST, this.I00iiO, this.I00iio);
/* 146 */                   return iool1i1;
                        }
/* 149 */               ArrayList arrayList = new ArrayList();
/* 160 */               for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
/* 176 */                   arrayList.add(ooOlO1O0o2.I000OiO(oillOo0, (iO0iIIoO11) list.get(i3)).zzc());
                        }
/* 193 */               ((iii1IIii) l1oo00iio10.I00iio).I0000Il00O(i2, strZzc, arrayList, this.I00iiO, this.I00iio);
/* 332 */               return iool1i1;
                    }
/* 108 */           i = 4;
/* 100 */           i2 = i;
/* 120 */           String strZzc2 = ooOlO1O0o2.I000OiO(oillOo0, (iO0iIIoO11) list.get(1)).zzc();
/* 128 */           if (list.size() != 2) {
                    }
                }
            }
