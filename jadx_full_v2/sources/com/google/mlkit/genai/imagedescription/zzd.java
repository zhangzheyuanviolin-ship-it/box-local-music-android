            package com.google.mlkit.genai.imagedescription;

            import android.graphics.Bitmap;
            import com.google.mlkit.genai.imagedescription.ImageDescriptionRequest;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zzd extends ImageDescriptionRequest.Builder {
                private Bitmap zza;

                @Override
                public final ImageDescriptionRequest build() {
/* 1 */             Bitmap bitmap = this.zza;
/* 3 */             zze zzeVar = null;
/* 4 */             if (bitmap != null) {
/* 8 */                 return new zzf(bitmap, zzeVar);
                    }
/* 14 */            I000II.I001IO000("Missing required properties: image");
/* 3 */             return null;
                }

                public final ImageDescriptionRequest.Builder zza(Bitmap bitmap) {
/* 1 */             if (bitmap != null) {
/* 3 */                 this.zza = bitmap;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null image");
/* 11 */            return null;
                }
            }
