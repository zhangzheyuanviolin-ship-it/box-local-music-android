            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            
            final class zzaig extends AbstractSet {
                final zzaii zza;

                public zzaig(zzaii zzaiiVar, zzaih zzaihVar) {
/* 1 */             Objects.requireNonNull(zzaiiVar);
/* 4 */             this.zza = zzaiiVar;
                }

                @Override
                public final boolean add(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             if (contains(entry)) {
/* 26 */                return false;
                    }
/* 21 */            this.zza.put((Comparable) entry.getKey(), entry.getValue());
/* 24 */            return true;
                }

                @Override
                public final void clear() {
/* 3 */             this.zza.clear();
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 9 */             Object obj2 = this.zza.get(entry.getKey());
/* 13 */            Object value = entry.getValue();
/* 18 */            if (obj2 != value) {
                        return obj2 != null && obj2.equals(value);
                    }
/* 17 */            return true;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return new zzaif(this.zza, null);
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             if (!contains(entry)) {
/* 20 */                return false;
                    }
/* 15 */            this.zza.remove(entry.getKey());
/* 18 */            return true;
                }

                @Override
                public final int size() {
/* 3 */             return this.zza.size();
                }
            }
