            package p000;

            import java.util.Collections;
            import java.util.Comparator;
            import java.util.NavigableSet;
            import java.util.SortedSet;
            
/* 14 */    public abstract class Ioio1ol111i extends Ioio0O implements NavigableSet, Iterable {
                public static final int I00ilO0 = 0;
                public transient Comparator I00iio;
                public transient Ioio1ol111i I00ilI0I1;

                public static OOoll01 I0010I0i(Comparator comparator) {
/* 3 */             if (OI1OOoOiOOl.I00iOIl == comparator) {
/* 15 */                return OOoll01.I00ioIO;
                    }
/* 7 */             IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 11 */            return new OOoll01(OOol0l1I1.I00ilI0I1, comparator);
                }

                @Override
                public final OOoll01 subSet(Object obj, boolean z, Object obj2, boolean z2) {
/* 1 */             obj.getClass();
/* 4 */             obj2.getClass();
/* 19 */            lII0I0I01I1l.I00000oOI(this.I00iio.compare(obj, obj2) <= 0);
/* 22 */            OOoll01 oOoll01 = (OOoll01) this;
/* 34 */            OOoll01 oOoll01I00111O = oOoll01.I00111O(oOoll01.I001IO000(obj, z), oOoll01.I00io1l.size());
/* 42 */            return oOoll01I00111O.I00111O(0, oOoll01I00111O.I001IIilI0O(obj2, z2));
                }

                @Override
                public final Comparator comparator() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final NavigableSet descendingSet() {
/* 1 */             Ioio1ol111i ioio1ol111iI0010I0i = this.I00ilI0I1;
/* 3 */             if (ioio1ol111iI0010I0i == null) {
/* 6 */                 OOoll01 oOoll01 = (OOoll01) this;
/* 10 */                Comparator comparatorReverseOrder = Collections.reverseOrder(oOoll01.I00iio);
/* 33 */                ioio1ol111iI0010I0i = oOoll01.isEmpty() ? I0010I0i(comparatorReverseOrder) : new OOoll01(oOoll01.I00io1l.I0010I0i(), comparatorReverseOrder);
/* 37 */                this.I00ilI0I1 = ioio1ol111iI0010I0i;
/* 39 */                ioio1ol111iI0010I0i.I00ilI0I1 = this;
                    }
/* 113 */           return ioio1ol111iI0010I0i;
                }

                @Override
                public final NavigableSet headSet(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 4 */             OOoll01 oOoll01 = (OOoll01) this;
/* 11 */            return oOoll01.I00111O(0, oOoll01.I001IIilI0O(obj, z));
                }

                @Override
                public final Object pollFirst() {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object pollLast() {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final SortedSet subSet(Object obj, Object obj2) {
/* 3 */             return subSet(obj, true, obj2, false);
                }

                @Override
                public final SortedSet tailSet(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             OOoll01 oOoll01 = (OOoll01) this;
/* 17 */            return oOoll01.I00111O(oOoll01.I001IO000(obj, true), oOoll01.I00io1l.size());
                }

                @Override
/* 15 */        public final SortedSet headSet(Object obj) {
/* 16 */            obj.getClass();
/* 17 */            OOoll01 oOoll01 = (OOoll01) this;
/* 18 */            return oOoll01.I00111O(0, oOoll01.I001IIilI0O(obj, false));
                }

                @Override
/* 21 */        public final NavigableSet tailSet(Object obj, boolean z) {
/* 22 */            obj.getClass();
/* 23 */            OOoll01 oOoll01 = (OOoll01) this;
/* 26 */            return oOoll01.I00111O(oOoll01.I001IO000(obj, z), oOoll01.I00io1l.size());
                }
            }
