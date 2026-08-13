            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzbaw {
                private long zza;
                private long zzb;
                private volatile boolean zzc;

                public zzbaw(int i) {
                }

                public final synchronized boolean zza(long j) {
/* 2 */             long j2 = this.zzb;
/* 10 */            if (j2 - j >= 0) {
/* 13 */                j = j2;
                    }
/* 14 */            this.zzb = j;
/* 25 */            if (this.zza - j >= 131072 || !this.zzc) {
/* 24 */                return false;
                    }
/* 31 */            this.zzc = false;
/* 34 */            return true;
                }

                public final boolean zzb() {
/* 1 */             return this.zzc;
                }

                public final synchronized boolean zzc(long j) {
/* 4 */             long j2 = this.zza + j;
/* 5 */             this.zza = j2;
/* 15 */            if (j2 - this.zzb < 131072 || this.zzc) {
/* 29 */                return false;
                    }
/* 22 */            this.zzc = true;
/* 21 */            return true;
                }
            }
