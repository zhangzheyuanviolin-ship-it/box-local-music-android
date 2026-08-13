            package p000;

            import java.util.AbstractList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 7 */     public abstract class iilOi0ioo1 extends AbstractList implements iliiiioo {
                public boolean I00iOIl;

                public iilOi0ioo1(boolean z) {
/* 4 */             this.I00iOIl = z;
                }

                @Override
                public boolean add(Object obj) {
/* 1 */             zza();
/* 4 */             return super.add(obj);
                }

                @Override
                public boolean addAll(int i, Collection collection) {
/* 1 */             zza();
/* 4 */             return super.addAll(i, collection);
                }

                @Override
                public void clear() {
/* 1 */             zza();
/* 4 */             super.clear();
                }

                @Override
                public final boolean equals(Object obj) {
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
/* 33 */            for (int i = 0; i < size; i++) {
/* 47 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public abstract Object remove(int i);

                @Override
                public final boolean remove(Object obj) {
/* 1 */             zza();
/* 4 */             int iIndexOf = indexOf(obj);
/* 9 */             if (iIndexOf == -1) {
/* 11 */                return false;
                    }
/* 13 */            remove(iIndexOf);
/* 16 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             zza();
/* 4 */             return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             zza();
/* 4 */             return super.retainAll(collection);
                }

                public final void zza() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
/* 8 */         public boolean addAll(Collection collection) {
/* 9 */             zza();
/* 10 */            return super.addAll(collection);
                }
            }
