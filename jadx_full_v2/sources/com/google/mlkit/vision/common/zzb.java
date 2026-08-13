            package com.google.mlkit.vision.common;

            import android.media.Image;
            
            final class zzb {
                private final Image zza;

                public zzb(Image image) {
/* 4 */             this.zza = image;
                }

                public final Image zza() {
/* 1 */             return this.zza;
                }

                public final Image.Plane[] zzb() {
/* 3 */             return this.zza.getPlanes();
                }
            }
