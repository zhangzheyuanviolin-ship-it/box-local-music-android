            package com.google.mlkit.vision.vkp;

            import p000.IIl001iO0Io;
            import p000.O11o0I1oo;
            
            final class zza extends VkpImageLabelerOptions {
                private final float zza;
                private final int zzb;
                private final O11o0I1oo zzc;

                public zza(float f, int i, O11o0I1oo o11o0I1oo) {
/* 4 */             this.zza = f;
/* 6 */             this.zzb = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpImageLabelerOptions) {
/* 10 */                VkpImageLabelerOptions vkpImageLabelerOptions = (VkpImageLabelerOptions) obj;
/* 26 */                if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(vkpImageLabelerOptions.zza()) && this.zzb == vkpImageLabelerOptions.zzb()) {
/* 36 */                    vkpImageLabelerOptions.zzc();
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 15 */            return (this.zzb ^ ((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003)) * 1000003;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VkpImageLabelerOptions{confidenceThreshold=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", maxResultCount=");
/* 22 */            return IIl001iO0Io.I000lI(this.zzb, ", customClassifierLocalModel=null}", sb);
                }

                @Override
                public final float zza() {
/* 1 */             return this.zza;
                }

                @Override
                public final int zzb() {
/* 1 */             return this.zzb;
                }

                @Override
                public final O11o0I1oo zzc() {
/* 1 */             return null;
                }
            }
