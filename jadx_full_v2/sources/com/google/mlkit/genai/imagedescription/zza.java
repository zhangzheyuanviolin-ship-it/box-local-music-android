            package com.google.mlkit.genai.imagedescription;

            import android.content.Context;
            import com.google.mlkit.genai.imagedescription.ImageDescriberOptions;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zza extends ImageDescriberOptions.Builder {
                private Context zza;

                @Override
                public final ImageDescriberOptions build() {
/* 1 */             Context context = this.zza;
/* 3 */             zzb zzbVar = null;
/* 4 */             if (context != null) {
/* 8 */                 return new zzc(context, zzbVar);
                    }
/* 14 */            I000II.I001IO000("Missing required properties: context");
/* 3 */             return null;
                }

                public final ImageDescriberOptions.Builder zza(Context context) {
/* 1 */             if (context != null) {
/* 3 */                 this.zza = context;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null context");
/* 11 */            return null;
                }
            }
