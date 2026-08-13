            package p000;

            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicLongArray;
            
            public final class OoO011I0 extends OoO00O1IiOl {
                public final int I00000oIO;
                public OoO00O1IiOl I00000oOI;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 26 */                    ArrayList arrayList = new ArrayList();
/* 29 */                    o01loll1loll.I00000oIO();
/* 36 */                    while (o01loll1loll.I00IOO()) {
/* 54 */                        arrayList.add(Long.valueOf(((Number) this.I00000oOI.I00000oOI(o01loll1loll)).longValue()));
                            }
/* 58 */                    o01loll1loll.I000l1();
/* 61 */                    int size = arrayList.size();
/* 67 */                    AtomicLongArray atomicLongArray = new AtomicLongArray(size);
/* 71 */                    for (int i = 0; i < size; i++) {
/* 83 */                        atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                            }
/* 89 */                    return atomicLongArray;
                        default:
/* 20 */                    return new AtomicLong(((Number) this.I00000oOI.I00000oOI(o01loll1loll)).longValue());
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 22 */                    AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
/* 24 */                    o01ooi1IIiiO.I0000Il00O();
/* 27 */                    int length = atomicLongArray.length();
/* 32 */                    for (int i = 0; i < length; i++) {
/* 44 */                        this.I00000oOI.I0000Il00O(o01ooi1IIiiO, Long.valueOf(atomicLongArray.get(i)));
                            }
/* 50 */                    o01ooi1IIiiO.I000l1();
                            break;
                        default:
/* 18 */                    this.I00000oOI.I0000Il00O(o01ooi1IIiiO, Long.valueOf(((AtomicLong) obj).get()));
                            break;
                    }
                }
            }
