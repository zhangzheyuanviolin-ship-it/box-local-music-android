            package com.google.mlkit.vision.vkp;

            import com.google.mlkit.vision.vkp.VkpStatus;
            import p000.IIl001iO0Io;
            
            final class AutoValue_VkpStatus_VkpError extends VkpStatus.VkpError {
                private final int zza;
                private final int zzb;

                public AutoValue_VkpStatus_VkpError(int i, int i2) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpStatus.VkpError) {
/* 10 */                VkpStatus.VkpError vkpError = (VkpStatus.VkpError) obj;
/* 18 */                if (this.zza == vkpError.getErrorSpaceNumber() && this.zzb == vkpError.getErrorCode()) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public int getErrorCode() {
/* 1 */             return this.zzb;
                }

                @Override
                public int getErrorSpaceNumber() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 10 */            return this.zzb ^ ((this.zza ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VkpError{errorSpaceNumber=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", errorCode=");
/* 22 */            return IIl001iO0Io.I000lI(this.zzb, "}", sb);
                }
            }
