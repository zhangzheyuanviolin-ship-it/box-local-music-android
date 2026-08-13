            package com.google.mlkit.vision.vkp;

            import com.google.mlkit.vision.vkp.VkpStatus;
            import java.util.Set;
            import p000.IIl001iO0Io;
            import p000.IOOlIIilOl0;
            import p000.O1o01iO0liI0;
            
            final class AutoValue_VkpStatus extends VkpStatus {
                private final boolean zza;
                private final O1o01iO0liI0 zzb;
                private final Set zzc;

                public AutoValue_VkpStatus(boolean z, O1o01iO0liI0 o1o01iO0liI0, Set set) {
/* 4 */             this.zza = z;
/* 6 */             this.zzb = o1o01iO0liI0;
/* 8 */             if (set != null) {
/* 10 */                this.zzc = set;
                    } else {
/* 15 */                IOOlIIilOl0.I000II("Null errors");
/* 215 */               throw null;
                    }
                }

                public final boolean equals(Object obj) {
                    O1o01iO0liI0 o1o01iO0liI0;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpStatus) {
/* 10 */                VkpStatus vkpStatus = (VkpStatus) obj;
/* 18 */                if (this.zza == vkpStatus.isSuccess() && ((o1o01iO0liI0 = this.zzb) != null ? o1o01iO0liI0 == vkpStatus.getMlKitException() : vkpStatus.getMlKitException() == null) && this.zzc.equals(vkpStatus.getErrors())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public Set<VkpStatus.VkpError> getErrors() {
/* 1 */             return this.zzc;
                }

                @Override
                public O1o01iO0liI0 getMlKitException() {
/* 1 */             return this.zzb;
                }

                public final int hashCode() {
/* 1 */             O1o01iO0liI0 o1o01iO0liI0 = this.zzb;
/* 34 */            return this.zzc.hashCode() ^ (((o1o01iO0liI0 == null ? 0 : o1o01iO0liI0.hashCode()) ^ (((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003)) * 1000003);
                }

                @Override
                public boolean isSuccess() {
/* 1 */             return this.zza;
                }

                public final String toString() {
/* 1 */             Set set = this.zzc;
/* 5 */             String strValueOf = String.valueOf(this.zzb);
/* 9 */             String string = set.toString();
/* 17 */            StringBuilder sb = new StringBuilder("VkpStatus{success=");
/* 22 */            sb.append(this.zza);
/* 27 */            sb.append(", mlKitException=");
/* 30 */            sb.append(strValueOf);
/* 35 */            sb.append(", errors=");
/* 40 */            return IIl001iO0Io.I00100l0(sb, string, "}");
                }
            }
