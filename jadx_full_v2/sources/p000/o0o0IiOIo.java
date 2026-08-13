            package p000;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class o0o0IiOIo extends o0oooliI {
                public final int I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0o0IiOIo(String str, Class cls, boolean z, boolean z2, int i) {
/* 3 */             super(str, cls, z, z2);
/* 1 */             this.I0001Ioi1lo = i;
                }

                @Override
                public void I00000oIO(Iterator it, o1101OI1l o1101oi1l) {
                    switch (this.I0001Ioi1lo) {
                        case 0:
/* 14 */                    if (it.hasNext()) {
/* 16 */                        Object next = it.next();
/* 20 */                        boolean zHasNext = it.hasNext();
/* 24 */                        String str = this.I00000oIO;
/* 26 */                        if (!zHasNext) {
/* 28 */                            o1101oi1l.I00000oIO(str, next);
                                    break;
                                } else {
/* 36 */                            StringBuilder sb = new StringBuilder("[");
/* 39 */                            sb.append(next);
/* 58 */                            do {
/* 44 */                                sb.append(',');
/* 51 */                                sb.append(it.next());
/* 58 */                            } while (it.hasNext());
/* 62 */                            sb.append(']');
/* 69 */                            o1101oi1l.I00000oIO(str, sb.toString());
                                    break;
                                }
                            }
                            break;
                        default:
/* 6 */                     super.I00000oIO(it, o1101oi1l);
                            break;
                    }
                }

                @Override
                public void I00000oOI(Object obj, o1101OI1l o1101oi1l) {
                    switch (this.I0001Ioi1lo) {
                        case 1:
/* 10 */                    i1OlOoO10O1 i1olooo10o1 = (i1OlOoO10O1) obj;
/* 12 */                    if (i1olooo10o1 != null) {
/* 21 */                        Iterator it = ((i1Ol01i1) i1olooo10o1.I00000oIO.I00ilO0).iterator();
                                while (true) {
/* 26 */                            I1IoOOl1l1oo i1IoOOl1l1oo = (I1IoOOl1l1oo) it;
/* 32 */                            if (!i1IoOOl1l1oo.hasNext()) {
                                        break;
                                    } else {
/* 38 */                                Map.Entry entry = (Map.Entry) i1IoOOl1l1oo.next();
/* 50 */                                if (((Set) entry.getValue()).isEmpty()) {
/* 89 */                                    o1101oi1l.I00000oIO((String) entry.getKey(), null);
                                        } else {
/* 58 */                                    Iterator it2 = ((Set) entry.getValue()).iterator();
/* 66 */                                    while (it2.hasNext()) {
/* 78 */                                        o1101oi1l.I00000oIO((String) entry.getKey(), it2.next());
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        default:
/* 6 */                     super.I00000oOI(obj, o1101oi1l);
                            break;
                    }
                }
            }
