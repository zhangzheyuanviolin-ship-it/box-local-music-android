            package com.google.mlkit.genai.imagedescription;

            import android.content.Context;
            import p000.IlIi0I0;
            
            final class zzc extends ImageDescriberOptions {
                private final Context zza;

                public zzc(Context context, zzb zzbVar) {
/* 4 */             this.zza = context;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ImageDescriberOptions) {
/* 17 */                return this.zza.equals(((ImageDescriberOptions) obj).zza());
                    }
/* 22 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.zza.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("ImageDescriberOptions{context=", this.zza.toString(), "}");
                }

                @Override
                public final Context zza() {
/* 1 */             return this.zza;
                }
            }
