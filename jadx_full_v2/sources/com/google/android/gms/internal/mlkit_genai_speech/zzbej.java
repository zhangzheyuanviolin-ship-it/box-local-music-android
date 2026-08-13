            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            final class zzbej extends zzaud {
                private final zzaud zza;
                private volatile boolean zzb;
                private List zzc = new ArrayList();

                public zzbej(zzaud zzaudVar) {
/* 11 */            this.zza = zzaudVar;
                }

                private final void zzg(Runnable runnable) {
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

                @Override
                public final void zza(zzazd zzazdVar, zzaxq zzaxqVar) {
/* 6 */             zzg(new zzbeh(this, zzazdVar, zzaxqVar));
                }

                @Override
                public final void zzb(zzaxq zzaxqVar) {
/* 3 */             if (this.zzb) {
/* 7 */                 this.zza.zzb(zzaxqVar);
                    } else {
/* 16 */                zzg(new zzbef(this, zzaxqVar));
                    }
                }

                @Override
                public final void zzc(Object obj) {
/* 3 */             if (this.zzb) {
/* 7 */                 this.zza.zzc(obj);
                    } else {
/* 16 */                zzg(new zzbeg(this, obj));
                    }
                }

                @Override
                public final void zzd() {
/* 3 */             if (this.zzb) {
/* 7 */                 this.zza.zzd();
                    } else {
/* 16 */                zzg(new zzbei(this));
                    }
                }

                public final void zzf() {
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
            }
