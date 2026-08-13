            package com.google.android.gms.internal.mlkit_vision_mediapipe;

            import android.graphics.Bitmap;
            
            public final class zzhl extends zzhx {
                public zzhl(zzhp zzhpVar) {
/* 1 */             super(zzhpVar);
                }

                private final native long zzh(long j, Bitmap bitmap);

                public final zzhv zza(Bitmap bitmap) {
/* 7 */             if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
/* 19 */                return zzhv.zzd(zzh(this.zza.zza(), bitmap));
                    }
/* 77 */            throw new RuntimeException("bitmap must use ARGB_8888 config.");
                }
            }
