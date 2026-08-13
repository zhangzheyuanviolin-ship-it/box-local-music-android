            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class zzazt {
                private int zza;

                public zzazt(int i, zzazu zzazuVar) {
/* 4 */             this.zza = i;
                }

                public final zzazt zza(boolean z) {
                    this.zza |= Barcode.FORMAT_UPC_A;
/* 29 */            return this;
                }

                public final zzazt zzb(boolean z) {
                    this.zza |= 1;
/* 29 */            return this;
                }

                public final zzazt zzc(boolean z) {
                    this.zza |= Barcode.FORMAT_AZTEC;
/* 29 */            return this;
                }

                public final zzazv zzd() {
/* 6 */             return new zzazv(this.zza, null);
                }
            }
