            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 8 */     public final class Oilolol11I extends I01Io001O implements Serializable {
                public static final Oilolol11I I00iiI;
                public final O1OOII I00iOIl;

                static {
/* 3 */             O1OOII o1ooii = O1OOII.I00lll10;
/* 10 */            I00iiI = new Oilolol11I(O1OOII.I00lll10);
                }

                public Oilolol11I() {
/* 6 */             this(new O1OOII());
                }

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iOIl.I00l0I0l0lO1;
                }

                @Override
                public final boolean add(Object obj) {
                    return this.I00iOIl.I00000oIO(obj) >= 0;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 3 */             this.I00iOIl.I0000Il00O();
/* 6 */             return super.addAll(collection);
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iOIl.clear();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iOIl.containsKey(obj);
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 1 */             O1OOII o1ooii = this.I00iOIl;
/* 3 */             o1ooii.getClass();
/* 9 */             return new O1OIoioOO1lo(o1ooii, 1);
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             O1OOII o1ooii = this.I00iOIl;
/* 3 */             o1ooii.I0000Il00O();
/* 6 */             int iI000O01llI0 = o1ooii.I000O01llI0(obj);
/* 10 */            if (iI000O01llI0 < 0) {
/* 12 */                return false;
                    }
/* 14 */            o1ooii.I000iOII(iI000O01llI0);
/* 17 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 3 */             this.I00iOIl.I0000Il00O();
/* 6 */             return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 3 */             this.I00iOIl.I0000Il00O();
/* 6 */             return super.retainAll(collection);
                }

/* 9 */         public Oilolol11I(O1OOII o1ooii) {
/* 11 */            this.I00iOIl = o1ooii;
                }
            }
