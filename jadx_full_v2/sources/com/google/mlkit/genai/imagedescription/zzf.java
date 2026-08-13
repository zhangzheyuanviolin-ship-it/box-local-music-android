            package com.google.mlkit.genai.imagedescription;

            import android.graphics.Bitmap;
            import p000.IlIi0I0;
            
            final class zzf extends ImageDescriptionRequest {
                private final Bitmap zza;

                public zzf(Bitmap bitmap, zze zzeVar) {
/* 4 */             this.zza = bitmap;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ImageDescriptionRequest) {
/* 17 */                return this.zza.equals(((ImageDescriptionRequest) obj).zza());
                    }
/* 22 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.zza.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("ImageDescriptionRequest{image=", this.zza.toString(), "}");
                }

                @Override
                public final Bitmap zza() {
/* 1 */             return this.zza;
                }
            }
