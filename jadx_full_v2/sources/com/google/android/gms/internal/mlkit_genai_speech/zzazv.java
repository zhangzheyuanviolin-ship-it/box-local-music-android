            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIi0I0;
            
            public final class zzazv {
                public static final zzazv zza;
                private final int zzb;

                static {
/* 5 */             zzazt zzaztVar = new zzazt(0, null);
/* 9 */             zzaztVar.zzb(true);
/* 16 */            zza = zzaztVar.zzd();
                }

                public zzazv(int i, zzazu zzazuVar) {
/* 4 */             this.zzb = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return obj != null && zzazv.class == obj.getClass() && this.zzb == ((zzazv) obj).zzb;
                }

                public final int hashCode() {
/* 1 */             return this.zzb;
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("BindServiceFlags{", Integer.toHexString(this.zzb), "}");
                }

                public final int zza() {
/* 1 */             return this.zzb;
                }

                public final zzazt zzb() {
/* 6 */             return new zzazt(this.zzb, null);
                }
            }
