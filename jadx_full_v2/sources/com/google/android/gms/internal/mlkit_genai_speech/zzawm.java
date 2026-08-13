            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIi0I0;
            
            public final class zzawm extends zzawu {
                private final zzawp zza;

                public zzawm(zzawp zzawpVar) {
/* 4 */             this.zza = zzawpVar;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof zzawm) {
/* 13 */                return this.zza.equals(((zzawm) obj).zza);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("FixedResultPicker(", this.zza.toString(), ")");
                }

                @Override
                public final zzawp zza(zzawq zzawqVar) {
/* 1 */             return this.zza;
                }
            }
