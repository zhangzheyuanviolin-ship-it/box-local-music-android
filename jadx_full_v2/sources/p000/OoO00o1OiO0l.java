            package p000;

            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicIntegerArray;
            
            public class OoO00o1OiO0l extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             o01loll1loll.I00000oIO();
/* 13 */            while (o01loll1loll.I00IOO()) {
                        try {
/* 23 */                    arrayList.add(Integer.valueOf(o01loll1loll.I00OOll1()));
                        } catch (NumberFormatException e) {
/* 33 */                    throw new O01Oo001(e);
                        }
                    }
/* 34 */            o01loll1loll.I000l1();
/* 37 */            int size = arrayList.size();
/* 43 */            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
/* 47 */            for (int i = 0; i < size; i++) {
/* 59 */                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                    }
/* 186 */           return atomicIntegerArray;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 3 */             o01ooi1IIiiO.I0000Il00O();
/* 6 */             int length = ((AtomicIntegerArray) obj).length();
/* 11 */            for (int i = 0; i < length; i++) {
/* 18 */                o01ooi1IIiiO.I00OIl(r5.get(i));
                    }
/* 24 */            o01ooi1IIiiO.I000l1();
                }
            }
