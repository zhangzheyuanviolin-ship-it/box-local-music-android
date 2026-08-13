            package p000;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class iiIIO0lOllo1 extends iO1i1OI0 implements Set {
                public transient iOiloii0i1io I00ilI0I1;
                public final int I00ilO0;
                public final transient ii01iIOliOOI I00io1l;
                public final transient Serializable I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiIIO0lOllo1(ii01iIOliOOI ii01iioliooi, Serializable serializable, int i) {
/* 4 */             super(0);
/* 1 */             this.I00ilO0 = i;
/* 7 */             this.I00io1l = ii01iioliooi;
/* 9 */             this.I00ioIO = serializable;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
                    switch (this.I00ilO0) {
                        case 0:
/* 15 */                    iOiloii0i1io iii100i0i = this.I00ilI0I1;
/* 17 */                    if (iii100i0i == null) {
/* 21 */                        iii100i0i = new iiI100I0I(this);
/* 24 */                        this.I00ilI0I1 = iii100i0i;
                            }
/* 26 */                    return iii100i0i.I00000oOI(objArr);
                        default:
/* 10 */                    return ((iiIllO) this.I00ioIO).I00000oOI(objArr);
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00ilO0;
/* 5 */             ii01iIOliOOI ii01iioliooi = this.I00io1l;
                    switch (i) {
                        case 0:
/* 20 */                    if (obj instanceof Map.Entry) {
/* 22 */                        Map.Entry entry = (Map.Entry) obj;
/* 24 */                        Object key = entry.getKey();
/* 28 */                        Object value = entry.getValue();
/* 32 */                        if (value != null && value.equals(ii01iioliooi.get(key))) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 14 */                    if (ii01iioliooi.get(obj) != null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this || obj == this) {
/* 1 */                 return true;
                    }
/* 10 */            if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
                        try {
/* 22 */                    if (size() == set.size()) {
                                return containsAll(set);
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 9 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00ilO0) {
                        case 0:
/* 16 */                    iOiloii0i1io iii100i0i = this.I00ilI0I1;
/* 18 */                    if (iii100i0i == null) {
/* 22 */                        iii100i0i = new iiI100I0I(this);
/* 25 */                        this.I00ilI0I1 = iii100i0i;
                            }
/* 27 */                    return iii100i0i.listIterator(0);
                        default:
/* 11 */                    return ((iiIllO) this.I00ioIO).listIterator(0);
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00ilO0) {
                    }
/* 6 */             return 1;
                }
            }
