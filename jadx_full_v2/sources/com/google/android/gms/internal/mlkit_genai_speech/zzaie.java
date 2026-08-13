            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Map;
            import java.util.Objects;
            import p000.IlIi0I0;
            
            final class zzaie implements Map.Entry, Comparable {
                final zzaii zza;
                private final Comparable zzb;
                private Object zzc;

                public zzaie(zzaii zzaiiVar, Comparable comparable, Object obj) {
/* 1 */             Objects.requireNonNull(zzaiiVar);
/* 4 */             this.zza = zzaiiVar;
/* 9 */             this.zzb = comparable;
/* 11 */            this.zzc = obj;
                }

                private static final boolean zzb(Object obj, Object obj2) {
                    return obj == null ? obj2 == null : obj.equals(obj2);
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.zzb.compareTo(((zzaie) obj).zzb);
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Map.Entry)) {
/* 7 */                 return false;
                    }
/* 11 */            Map.Entry entry = (Map.Entry) obj;
                    return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
                }

                @Override
                public final Object getKey() {
/* 1 */             return this.zzb;
                }

                @Override
                public final Object getValue() {
/* 1 */             return this.zzc;
                }

                @Override
                public final int hashCode() {
/* 1 */             Comparable comparable = this.zzb;
/* 8 */             int iHashCode = comparable == null ? 0 : comparable.hashCode();
/* 12 */            Object obj = this.zzc;
/* 21 */            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
                }

                @Override
                public final Object setValue(Object obj) {
/* 1 */             this.zza.zzo();
/* 6 */             Object obj2 = this.zzc;
/* 8 */             this.zzc = obj;
/* 29 */            return obj2;
                }

                public final String toString() {
/* 15 */            return IlIi0I0.I000lI(String.valueOf(this.zzb), "=", String.valueOf(this.zzc));
                }

                public final Comparable zza() {
/* 1 */             return this.zzb;
                }
            }
