            package com.google.mlkit.vision.vkp;

            import java.util.List;
            import p000.IIl001iO0Io;
            import p000.IOOlIIilOl0;
            
            final class AutoValue_VkpResults extends VkpResults {
                private final VkpStatus zza;
                private final List zzb;
                private final List zzc;
                private final boolean zzd;
                private final Boolean zze;

                public AutoValue_VkpResults(VkpStatus vkpStatus, List list, List list2, boolean z, Boolean bool) {
/* 5 */             if (vkpStatus == null) {
/* 36 */                IOOlIIilOl0.I000II("Null getStatus");
/* 966 */               throw null;
                    }
/* 7 */             this.zza = vkpStatus;
/* 9 */             if (list == null) {
/* 30 */                IOOlIIilOl0.I000II("Null getDetectedObjects");
/* 33 */                throw null;
                    }
/* 11 */            this.zzb = list;
/* 13 */            if (list2 == null) {
/* 24 */                IOOlIIilOl0.I000II("Null getImageLabels");
/* 27 */                throw null;
                    }
/* 15 */            this.zzc = list2;
/* 17 */            this.zzd = z;
/* 19 */            this.zze = bool;
                }

                public final boolean equals(Object obj) {
                    Boolean bool;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpResults) {
/* 10 */                VkpResults vkpResults = (VkpResults) obj;
/* 22 */                if (this.zza.equals(vkpResults.getStatus()) && this.zzb.equals(vkpResults.getDetectedObjects()) && this.zzc.equals(vkpResults.getImageLabels()) && this.zzd == vkpResults.isFromColdCall() && ((bool = this.zze) != null ? bool.equals(vkpResults.isAccelerated()) : vkpResults.isAccelerated() == null)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public List<VkpDetectedObject> getDetectedObjects() {
/* 1 */             return this.zzb;
                }

                @Override
                public List<VkpImageLabel> getImageLabels() {
/* 1 */             return this.zzc;
                }

                @Override
                public VkpStatus getStatus() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 26 */            int iHashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
/* 27 */            Boolean bool = this.zze;
/* 50 */            return (((true != this.zzd ? 1237 : 1231) ^ (iHashCode * 1000003)) * 1000003) ^ (bool == null ? 0 : bool.hashCode());
                }

                @Override
                public Boolean isAccelerated() {
/* 1 */             return this.zze;
                }

                @Override
                public boolean isFromColdCall() {
/* 1 */             return this.zzd;
                }

                public final String toString() {
/* 1 */             List list = this.zzc;
/* 3 */             List list2 = this.zzb;
/* 7 */             String string = this.zza.toString();
/* 11 */            String string2 = list2.toString();
/* 15 */            String string3 = list.toString();
/* 25 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("VkpResults{getStatus=", string, ", getDetectedObjects=", string2, ", getImageLabels=");
/* 29 */            sbI00111O.append(string3);
/* 34 */            sbI00111O.append(", isFromColdCall=");
/* 39 */            sbI00111O.append(this.zzd);
/* 44 */            sbI00111O.append(", isAccelerated=");
/* 49 */            sbI00111O.append(this.zze);
/* 54 */            sbI00111O.append("}");
/* 57 */            return sbI00111O.toString();
                }
            }
