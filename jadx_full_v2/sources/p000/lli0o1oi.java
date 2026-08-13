            package p000;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class lli0o1oi extends iIIoI1 {
                public final int I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lli0o1oi(String str, Class cls, boolean z, boolean z2, int i) {
/* 3 */             super(str, cls, z, z2);
/* 1 */             this.I0001Ioi1lo = i;
                }

                @Override
                public void I00000oIO(Iterator it, iOoO1O iooo1o) {
                    switch (this.I0001Ioi1lo) {
                        case 0:
/* 14 */                    if (it.hasNext()) {
/* 16 */                        Object next = it.next();
/* 20 */                        boolean zHasNext = it.hasNext();
/* 24 */                        String str = this.I00000oIO;
/* 26 */                        if (!zHasNext) {
/* 28 */                            iooo1o.I00000oIO(str, next);
                                    break;
                                } else {
/* 36 */                            StringBuilder sb = new StringBuilder("[");
/* 39 */                            sb.append(next);
/* 58 */                            do {
/* 44 */                                sb.append(',');
/* 51 */                                sb.append(it.next());
/* 58 */                            } while (it.hasNext());
/* 62 */                            sb.append(']');
/* 69 */                            iooo1o.I00000oIO(str, sb.toString());
                                    break;
                                }
                            }
                            break;
                        default:
/* 6 */                     super.I00000oIO(it, iooo1o);
                            break;
                    }
                }

                @Override
                public void I00000oOI(Object obj, iOoO1O iooo1o) {
                    switch (this.I0001Ioi1lo) {
                        case 1:
/* 18 */                    Iterator it = ((ilI11lO01oo) ((ilIOIll) obj).I00000oIO.I00ilO0).iterator();
                            while (true) {
/* 23 */                        I1IoOOl1l1oo i1IoOOl1l1oo = (I1IoOOl1l1oo) it;
/* 29 */                        if (!i1IoOOl1l1oo.hasNext()) {
                                    break;
                                } else {
/* 35 */                            Map.Entry entry = (Map.Entry) i1IoOOl1l1oo.next();
/* 47 */                            if (((Set) entry.getValue()).isEmpty()) {
/* 86 */                                iooo1o.I00000oIO((String) entry.getKey(), null);
                                    } else {
/* 55 */                                Iterator it2 = ((Set) entry.getValue()).iterator();
/* 63 */                                while (it2.hasNext()) {
/* 75 */                                    iooo1o.I00000oIO((String) entry.getKey(), it2.next());
                                        }
                                    }
                                }
                            }
                        default:
/* 6 */                     super.I00000oOI(obj, iooo1o);
                            break;
                    }
                }
            }
