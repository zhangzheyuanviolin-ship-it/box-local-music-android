            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            final class zzbfj implements zzbdm {
                private final zzbdm zza;
                private volatile boolean zzb;
                private List zzc = new ArrayList();

                public zzbfj(zzbdm zzbdmVar) {
/* 11 */            this.zza = zzbdmVar;
                }

                private final void zzc(Runnable runnable) {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.zzb) {
/* 16 */                        runnable.run();
                            } else {
/* 8 */                         this.zzc.add(runnable);
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                public final void zzb() {
                    List list;
/* 3 */             List arrayList = new ArrayList();
                    while (true) {
                        synchronized (this) {
                            try {
/* 13 */                        if (this.zzc.isEmpty()) {
/* 16 */                            this.zzc = null;
/* 19 */                            this.zzb = true;
/* 22 */                            return;
                                } else {
/* 25 */                            list = this.zzc;
/* 27 */                            this.zzc = arrayList;
                                }
                            } catch (Throwable th) {
/* 110 */                       throw th;
                            }
                        }
/* 30 */                Iterator it = list.iterator();
/* 38 */                while (it.hasNext()) {
/* 46 */                    ((Runnable) it.next()).run();
                        }
/* 50 */                list.clear();
/* 53 */                arrayList = list;
                    }
                }

                @Override
                public final void zzd(zzazd zzazdVar, zzbdl zzbdlVar, zzaxq zzaxqVar) {
/* 6 */             zzc(new zzbfi(this, zzazdVar, zzbdlVar, zzaxqVar));
                }

                @Override
                public final void zze(zzaxq zzaxqVar) {
/* 6 */             zzc(new zzbfh(this, zzaxqVar));
                }

                @Override
                public final void zzf(zzbni zzbniVar) {
/* 3 */             if (this.zzb) {
/* 7 */                 this.zza.zzf(zzbniVar);
                    } else {
/* 16 */                zzc(new zzbff(this, zzbniVar));
                    }
                }

                @Override
                public final void zzg() {
/* 3 */             if (this.zzb) {
/* 7 */                 this.zza.zzg();
                    } else {
/* 16 */                zzc(new zzbfg(this));
                    }
                }
            }
