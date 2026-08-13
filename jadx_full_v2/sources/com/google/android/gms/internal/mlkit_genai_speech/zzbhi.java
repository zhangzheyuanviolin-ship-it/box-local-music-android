            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.List;
            
            final class zzbhi {
                private List zza;
                private int zzb;
                private int zzc;

                public zzbhi(List list) {
/* 4 */             this.zza = list;
                }

                public final zzatu zza() {
/* 11 */            return ((zzavj) this.zza.get(this.zzb)).zza();
                }

                public final SocketAddress zzb() {
/* 21 */            return (SocketAddress) ((zzavj) this.zza.get(this.zzb)).zzb().get(this.zzc);
                }

                public final void zzc() {
/* 9 */             zzavj zzavjVar = (zzavj) this.zza.get(this.zzb);
/* 13 */            int i = this.zzc + 1;
/* 15 */            this.zzc = i;
/* 25 */            if (i >= zzavjVar.zzb().size()) {
                        this.zzb++;
/* 34 */                this.zzc = 0;
                    }
                }

                public final void zzd() {
/* 2 */             this.zzb = 0;
/* 4 */             this.zzc = 0;
                }

                public final void zze(List list) {
/* 1 */             this.zza = list;
/* 3 */             zzd();
                }

                public final boolean zzf() {
                    return this.zzb == 0 && this.zzc == 0;
                }

                public final boolean zzg() {
                    return this.zzb < this.zza.size();
                }

                public final boolean zzh(SocketAddress socketAddress) {
/* 9 */             for (int i = 0; i < this.zza.size(); i++) {
/* 23 */                int iIndexOf = ((zzavj) this.zza.get(i)).zzb().indexOf(socketAddress);
/* 28 */                if (iIndexOf != -1) {
/* 33 */                    this.zzb = i;
/* 35 */                    this.zzc = iIndexOf;
/* 37 */                    return true;
                        }
                    }
/* 1 */             return false;
                }
            }
