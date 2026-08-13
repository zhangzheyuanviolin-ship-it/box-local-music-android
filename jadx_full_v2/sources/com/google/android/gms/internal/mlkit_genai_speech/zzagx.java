            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public class zzagx {
                protected volatile zzahn zza;
                private volatile zzafd zzb;
                private volatile boolean zzc;

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzagx)) {
/* 9 */                 return false;
                    }
/* 11 */            zzagx zzagxVar = (zzagx) obj;
/* 13 */            zzahn zzahnVar = this.zza;
/* 15 */            zzahn zzahnVar2 = zzagxVar.zza;
/* 17 */            if (zzahnVar == null && zzahnVar2 == null) {
/* 30 */                return zzb().equals(zzagxVar.zzb());
                    }
/* 35 */            if (zzahnVar != null && zzahnVar2 != null) {
/* 40 */                return zzahnVar.equals(zzahnVar2);
                    }
/* 45 */            if (zzahnVar != null) {
/* 51 */                zzagxVar.zzd(zzahnVar.zzp());
/* 56 */                return zzahnVar.equals(zzagxVar.zza);
                    }
/* 65 */            zzd(zzahnVar2.zzp());
/* 70 */            return this.zza.equals(zzahnVar2);
                }

                public int hashCode() {
/* 1 */             return 1;
                }

                public final int zza() {
/* 3 */             if (this.zzb != null) {
/* 7 */                 return this.zzb.zze();
                    }
/* 14 */            if (this.zza != null) {
/* 18 */                return this.zza.zzn();
                    }
/* 23 */            return 0;
                }

                public final zzafd zzb() {
/* 3 */             if (this.zzb != null) {
/* 5 */                 return this.zzb;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    if (this.zzb != null) {
/* 13 */                        return this.zzb;
                            }
/* 21 */                    if (this.zza == null) {
/* 25 */                        this.zzb = zzafd.zza;
                            } else {
/* 34 */                        this.zzb = this.zza.zzk();
                            }
/* 36 */                    return this.zzb;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final zzahn zzc(zzahn zzahnVar) {
/* 1 */             zzahn zzahnVar2 = this.zza;
/* 4 */             this.zzb = null;
/* 6 */             this.zza = zzahnVar;
/* 29 */            return zzahnVar2;
                }

                public final void zzd(zzahn zzahnVar) {
/* 3 */             if (this.zza != null) {
/* 32 */                return;
                    }
                    synchronized (this) {
/* 9 */                 if (this.zza != null) {
/* 12 */                    return;
                        }
                        try {
/* 15 */                    this.zza = zzahnVar;
/* 19 */                    this.zzb = zzafd.zza;
                        } catch (zzagr unused) {
/* 23 */                    this.zzc = true;
/* 25 */                    this.zza = zzahnVar;
/* 29 */                    this.zzb = zzafd.zza;
                        }
                    }
                }
            }
