            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.O0000Ioio00;
            
            public final class zzko {
                private final zzaxk zza;
                private final zzauy zzb;
                private final zzauy zzc;
                private final zzauy zzd;

                public zzko(zzaxk zzaxkVar, zzauy zzauyVar, zzauy zzauyVar2, zzauy zzauyVar3) {
/* 4 */             this.zza = zzaxkVar;
/* 6 */             this.zzb = zzauyVar;
/* 8 */             this.zzc = zzauyVar2;
/* 10 */            this.zzd = zzauyVar3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzko)) {
/* 7 */                 return false;
                    }
/* 11 */            zzko zzkoVar = (zzko) obj;
                    return O0000Ioio00.I0000O(this.zza, zzkoVar.zza) && O0000Ioio00.I0000O(this.zzb, zzkoVar.zzb) && O0000Ioio00.I0000O(this.zzc, zzkoVar.zzc) && O0000Ioio00.I0000O(this.zzd, zzkoVar.zzd);
                }

                public final int hashCode() {
/* 15 */            int iHashCode = this.zzb.hashCode() + (this.zza.hashCode() * 31);
/* 20 */            int iHashCode2 = this.zzc.hashCode();
/* 33 */            return this.zzd.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "ParcelableOverMetadataKeys(metadataKey=" + this.zza + ", requestKey=" + this.zzb + ", responseHeaderKey=" + this.zzc + ", responseTrailerKey=" + this.zzd + ")";
                }

                public final zzaxk zza() {
/* 1 */             return this.zza;
                }
            }
