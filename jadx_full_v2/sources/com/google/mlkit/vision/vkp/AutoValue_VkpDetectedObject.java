            package com.google.mlkit.vision.vkp;

            import android.graphics.Rect;
            import java.util.List;
            import p000.IIlIOloOOO;
            import p000.IOOlIIilOl0;
            
            final class AutoValue_VkpDetectedObject extends VkpDetectedObject {
                private final Rect zza;
                private final Integer zzb;
                private final List zzc;

                public AutoValue_VkpDetectedObject(Rect rect, Integer num, List list) {
/* 4 */             this.zza = rect;
/* 6 */             this.zzb = num;
/* 8 */             if (list != null) {
/* 10 */                this.zzc = list;
                    } else {
/* 15 */                IOOlIIilOl0.I000II("Null labels");
/* 215 */               throw null;
                    }
                }

                public final boolean equals(Object obj) {
                    Integer num;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpDetectedObject) {
/* 10 */                VkpDetectedObject vkpDetectedObject = (VkpDetectedObject) obj;
/* 22 */                if (this.zza.equals(vkpDetectedObject.getBoundingBox()) && ((num = this.zzb) != null ? num.equals(vkpDetectedObject.getTrackingId()) : vkpDetectedObject.getTrackingId() == null) && this.zzc.equals(vkpDetectedObject.getLabels())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public Rect getBoundingBox() {
/* 1 */             return this.zza;
                }

                @Override
                public List<VkpImageLabel> getLabels() {
/* 1 */             return this.zzc;
                }

                @Override
                public Integer getTrackingId() {
/* 1 */             return this.zzb;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.zza.hashCode() ^ 1000003;
/* 11 */            Integer num = this.zzb;
/* 30 */            return this.zzc.hashCode() ^ (((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003);
                }

                public final String toString() {
/* 1 */             List list = this.zzc;
/* 5 */             String string = this.zza.toString();
/* 9 */             String string2 = list.toString();
/* 17 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("VkpDetectedObject{boundingBox=", string, ", trackingId=");
/* 23 */            sbI001IIilI0O.append(this.zzb);
/* 28 */            sbI001IIilI0O.append(", labels=");
/* 31 */            sbI001IIilI0O.append(string2);
/* 36 */            sbI001IIilI0O.append("}");
/* 39 */            return sbI001IIilI0O.toString();
                }
            }
