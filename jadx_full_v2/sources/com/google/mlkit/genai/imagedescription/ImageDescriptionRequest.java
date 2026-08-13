            package com.google.mlkit.genai.imagedescription;

            import android.graphics.Bitmap;
            
            public abstract class ImageDescriptionRequest {

                public static abstract class Builder {
                    public abstract ImageDescriptionRequest build();
                }

                public static Builder builder(Bitmap bitmap) {
/* 3 */             zzd zzdVar = new zzd();
/* 6 */             zzdVar.zza(bitmap);
/* 49 */            return zzdVar;
                }

                public abstract Bitmap zza();
            }
