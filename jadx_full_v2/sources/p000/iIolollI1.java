            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class iIolollI1 extends iIIoIiOoOoiO {
                public ArrayList I00iiO;
                public ArrayList I00iio;
                public OillOo0 I00ilI0I1;

                @Override
                public final iO0iIIoO11 I00000oIO(OillOo0 oillOo0, List list) {
                    iOOl1i1 iool1i1;
/* 3 */             OillOo0 oillOo0I001lloI = this.I00ilI0I1.I001lloI();
/* 9 */             OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) oillOo0I001lloI.I00iiO;
/* 11 */            int i = 0;
                    while (true) {
/* 12 */                ArrayList arrayList = this.I00iiO;
/* 14 */                int size = arrayList.size();
/* 18 */                iool1i1 = iO0iIIoO11.I00Ol1ll1;
/* 20 */                if (i >= size) {
                            break;
                        }
/* 26 */                if (i < list.size()) {
/* 48 */                    oillOo0I001lloI.I00IioO0OiOi((String) arrayList.get(i), ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(i)));
                        } else {
/* 58 */                    oillOo0I001lloI.I00IioO0OiOi((String) arrayList.get(i), iool1i1);
                        }
/* 61 */                i++;
                    }
/* 66 */            Iterator it = this.I00iio.iterator();
/* 74 */            while (it.hasNext()) {
/* 80 */                iO0iIIoO11 io0iiioo11 = (iO0iIIoO11) it.next();
/* 82 */                iO0iIIoO11 io0iiioo11I000OiO = ooOlO1O0o.I000OiO(oillOo0I001lloI, io0iiioo11);
/* 88 */                if (io0iiioo11I000OiO instanceof iO11IOo0II) {
/* 90 */                    io0iiioo11I000OiO = ooOlO1O0o.I000OiO(oillOo0I001lloI, io0iiioo11);
                        }
/* 96 */                if (io0iiioo11I000OiO instanceof iI1II1oO) {
/* 100 */                   return ((iI1II1oO) io0iiioo11I000OiO).I00iOIl;
                        }
                    }
/* 106 */           return iool1i1;
                }

                @Override
                public final iO0iIIoO11 zzt() {
/* 5 */             iIolollI1 iiololli1 = new iIolollI1(this.I00iOIl);
/* 10 */            ArrayList arrayList = this.I00iiO;
/* 16 */            ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 19 */            iiololli1.I00iiO = arrayList2;
/* 21 */            arrayList2.addAll(arrayList);
/* 26 */            ArrayList arrayList3 = this.I00iio;
/* 32 */            ArrayList arrayList4 = new ArrayList(arrayList3.size());
/* 35 */            iiololli1.I00iio = arrayList4;
/* 37 */            arrayList4.addAll(arrayList3);
/* 42 */            iiololli1.I00ilI0I1 = this.I00ilI0I1;
/* 44 */            VarHandle.storeStoreFence();
/* 55 */            return iiololli1;
                }
            }
