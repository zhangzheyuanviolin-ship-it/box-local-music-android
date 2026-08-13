            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import p000.IlIi0I0;
            
            final class zzia extends zzho {
                final transient Object zza;

                public zzia(Object obj) {
/* 4 */             obj.getClass();
/* 7 */             this.zza = obj;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.zza.equals(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 5 */             return new zzhp(this.zza);
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }

                @Override
                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("[", this.zza.toString(), "]");
                }

                @Override
                public final int zza(Object[] objArr, int i) {
/* 3 */             objArr[i] = this.zza;
/* 5 */             return i + 1;
                }

                @Override
                public final zzib iterator() {
/* 5 */             return new zzhp(this.zza);
                }

                @Override
                public final boolean zze() {
/* 1 */             return false;
                }
            }
