            package com.google.mlkit.vision.vkp;

            import p000.IIl001iO0Io;
            import p000.IOOlIIilOl0;
            
            final class AutoValue_VkpImageLabel extends VkpImageLabel {
                private final String zza;
                private final String zzb;
                private final float zzc;
                private final int zzd;

                public AutoValue_VkpImageLabel(String str, String str2, float f, int i) {
/* 5 */             if (str == null) {
/* 26 */                IOOlIIilOl0.I000II("Null className");
/* 483 */               throw null;
                    }
/* 7 */             this.zza = str;
/* 9 */             if (str2 == null) {
/* 20 */                IOOlIIilOl0.I000II("Null text");
/* 23 */                throw null;
                    }
/* 11 */            this.zzb = str2;
/* 13 */            this.zzc = f;
/* 15 */            this.zzd = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpImageLabel) {
/* 10 */                VkpImageLabel vkpImageLabel = (VkpImageLabel) obj;
/* 22 */                if (this.zza.equals(vkpImageLabel.getClassName()) && this.zzb.equals(vkpImageLabel.getText()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(vkpImageLabel.getScore()) && this.zzd == vkpImageLabel.getIndex()) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public String getClassName() {
/* 1 */             return this.zza;
                }

                @Override
                public int getIndex() {
/* 1 */             return this.zzd;
                }

                @Override
                public float getScore() {
/* 1 */             return this.zzc;
                }

                @Override
                public String getText() {
/* 1 */             return this.zzb;
                }

                public final int hashCode() {
/* 30 */            return this.zzd ^ ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VkpImageLabel{className=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", text=");
/* 20 */            sb.append(this.zzb);
/* 25 */            sb.append(", score=");
/* 30 */            sb.append(this.zzc);
/* 35 */            sb.append(", index=");
/* 42 */            return IIl001iO0Io.I000lI(this.zzd, "}", sb);
                }
            }
