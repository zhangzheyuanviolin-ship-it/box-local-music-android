            package p000;

            import java.util.AbstractList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 7 */     public abstract class I01O10iIoo1O extends AbstractList implements Iool1IOO1o0i {
                public boolean I00iOIl;

                public I01O10iIoo1O(boolean z) {
/* 4 */             this.I00iOIl = z;
                }

                public final void I00000oOI() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
                public boolean addAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             return super.addAll(collection);
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
/* 4 */             super.clear();
                }

                @Override
                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            if (!(obj instanceof RandomAccess)) {
/* 15 */                return super.equals(obj);
                    }
/* 20 */            List list = (List) obj;
/* 22 */            int size = size();
/* 30 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 34 */            for (int i = 0; i < size; i++) {
/* 48 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public abstract Object remove(int i);

                @Override
                public final boolean remove(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             int iIndexOf = indexOf(obj);
/* 9 */             if (iIndexOf == -1) {
/* 11 */                return false;
                    }
/* 13 */            remove(iIndexOf);
/* 16 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             return super.retainAll(collection);
                }

                @Override
/* 8 */         public final boolean addAll(int i, Collection collection) {
/* 9 */             I00000oOI();
/* 10 */            return super.addAll(i, collection);
                }
            }
