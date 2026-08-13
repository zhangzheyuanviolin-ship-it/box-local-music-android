            package com.google.mlkit.vision.vkp;

            import p000.IIl001iO0Io;
            import p000.IOOlIIilOl0;
            import p000.O11o0I1oo;
            
            final class zzb extends VkpObjectDetectorOptions {
                private final boolean zza;
                private final boolean zzb;
                private final boolean zzc;
                private final boolean zzd;
                private final float zze;
                private final int zzf;
                private final O11o0I1oo zzg;
                private final String zzh;
                private final String zzi;

                public zzb(boolean z, boolean z2, boolean z3, boolean z4, float f, int i, O11o0I1oo o11o0I1oo, String str, String str2) {
/* 4 */             this.zza = z;
/* 6 */             this.zzb = z2;
/* 8 */             this.zzc = z3;
/* 10 */            this.zzd = z4;
/* 12 */            this.zze = f;
/* 14 */            this.zzf = i;
/* 16 */            this.zzh = str;
/* 18 */            if (str2 != null) {
/* 20 */                this.zzi = str2;
                    } else {
/* 25 */                IOOlIIilOl0.I000II("Null clientLibraryVersion");
/* 338 */               throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof VkpObjectDetectorOptions) {
/* 10 */                VkpObjectDetectorOptions vkpObjectDetectorOptions = (VkpObjectDetectorOptions) obj;
/* 18 */                if (this.zza == vkpObjectDetectorOptions.zzi() && this.zzb == vkpObjectDetectorOptions.zzh() && this.zzc == vkpObjectDetectorOptions.zzg() && this.zzd == vkpObjectDetectorOptions.zzf() && Float.floatToIntBits(this.zze) == Float.floatToIntBits(vkpObjectDetectorOptions.zza()) && this.zzf == vkpObjectDetectorOptions.zzb()) {
/* 68 */                    vkpObjectDetectorOptions.zzc();
/* 81 */                    if (this.zzh.equals(vkpObjectDetectorOptions.zzd()) && this.zzi.equals(vkpObjectDetectorOptions.zze())) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 12 */            int i = true != this.zza ? 1237 : 1231;
/* 72 */            return this.zzi.hashCode() ^ ((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ this.zzf) * (-721379959)) ^ this.zzh.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VkpObjectDetectorOptions{streamingMode=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", multipleObjectsEnabled=");
/* 20 */            sb.append(this.zzb);
/* 25 */            sb.append(", classificationEnabled=");
/* 30 */            sb.append(this.zzc);
/* 35 */            sb.append(", accelerationEnabled=");
/* 40 */            sb.append(this.zzd);
/* 45 */            sb.append(", classificationConfidenceThreshold=");
/* 50 */            sb.append(this.zze);
/* 55 */            sb.append(", maxPerObjectLabelCount=");
/* 60 */            sb.append(this.zzf);
/* 65 */            sb.append(", customClassifierLocalModel=null, clientLibraryName=");
/* 70 */            sb.append(this.zzh);
/* 75 */            sb.append(", clientLibraryVersion=");
/* 82 */            return IIl001iO0Io.I00100l0(sb, this.zzi, "}");
                }

                @Override
                public final float zza() {
/* 1 */             return this.zze;
                }

                @Override
                public final int zzb() {
/* 1 */             return this.zzf;
                }

                @Override
                public final O11o0I1oo zzc() {
/* 1 */             return null;
                }

                @Override
                public final String zzd() {
/* 1 */             return this.zzh;
                }

                @Override
                public final String zze() {
/* 1 */             return this.zzi;
                }

                @Override
                public final boolean zzf() {
/* 1 */             return this.zzd;
                }

                @Override
                public final boolean zzg() {
/* 1 */             return this.zzc;
                }

                @Override
                public final boolean zzh() {
/* 1 */             return this.zzb;
                }

                @Override
                public final boolean zzi() {
/* 1 */             return this.zza;
                }
            }
