            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            
            final class zzbax extends zzbbb {
                private final boolean zzg;
                private zzazd zzh;
                private zzaxq zzi;

                public zzbax(zzbat zzbatVar, zzatu zzatuVar, int i, boolean z) {
/* 2 */             super(zzbatVar, zzatuVar, i, null);
/* 5 */             this.zzg = z;
                }

                @Override
                public final void zza(zzazd zzazdVar) {
/* 12 */            ((zzbdm) this.zzf).zzd(zzazdVar, zzbdl.PROCESSED, new zzaxq());
                }

                @Override
                public final void zzb() {
/* 5 */             this.zze.zzc(this.zzi);
/* 12 */            this.zze.zzm(this.zzh);
/* 17 */            zzl(zzbay.CLOSED);
/* 30 */            ((zzbdm) this.zzf).zzd(this.zzh, zzbdl.PROCESSED, this.zzi);
/* 35 */            this.zza.zzs(this);
                }

                @Override
                public final void zzc(int i, Parcel parcel) {
/* 3 */             zzaxq zzaxqVarZza = zzbbp.zza(parcel, this.zzb);
/* 9 */             this.zze.zzb(zzaxqVarZza);
/* 16 */            ((zzbdm) this.zzf).zze(zzaxqVarZza);
                }

                @Override
                public final void zzd(int i, Parcel parcel) {
/* 5 */             this.zzh = zzbcj.zza(i, parcel);
/* 13 */            this.zzi = zzbbp.zza(parcel, this.zzb);
                }

                @Override
                public final boolean zze() {
/* 1 */             return this.zzg;
                }
            }
