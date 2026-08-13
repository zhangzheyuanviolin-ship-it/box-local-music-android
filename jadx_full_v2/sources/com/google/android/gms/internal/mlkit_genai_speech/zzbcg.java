            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            import p000.Oi010OO0;
            
/* 18 */    final class zzbcg implements zzbdk {
                private final zzbax zza;
                private final zzbbw zzb;
                private InputStream zzc;
                private zzavf zzd;

                public zzbcg(zzbax zzbaxVar, zzbbw zzbbwVar, zzatu zzatuVar) {
/* 4 */             this.zza = zzbaxVar;
/* 6 */             this.zzb = zzbbwVar;
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("SingleMessageClientStream[", this.zza.toString(), "/", this.zzb.toString(), "]");
                }

                @Override
                public final void zzb(zzazd zzazdVar) {
/* 1 */             zzbax zzbaxVar = this.zza;
                    synchronized (zzbaxVar) {
/* 4 */                 zzbaxVar.zzh(zzazdVar);
                    }
                }

                @Override
                public final void zzd() {
                    try {
/* 1 */                 zzbbw zzbbwVar = this.zzb;
                        synchronized (zzbbwVar) {
                            try {
/* 4 */                         zzavf zzavfVar = this.zzd;
/* 6 */                         if (zzavfVar != null) {
/* 8 */                             zzbbwVar.zzb(zzavfVar);
                                }
/* 14 */                        zzbbwVar.zze();
/* 17 */                        InputStream inputStream = this.zzc;
/* 19 */                        if (inputStream != null) {
/* 21 */                            zzbbwVar.zzd(inputStream);
                                }
/* 24 */                        zzbbwVar.zzf();
/* 27 */                        zzbbwVar.zzg();
                            } catch (Throwable th) {
/* 33 */                        throw th;
                            }
                        }
                    } catch (zzaze e) {
/* 35 */                zzbax zzbaxVar = this.zza;
                        synchronized (zzbaxVar) {
/* 42 */                    zzbaxVar.zzg(e.zza());
                        }
                    }
                }

                @Override
                public final void zzf(int i) {
/* 1 */             zzbax zzbaxVar = this.zza;
                    synchronized (zzbaxVar) {
/* 4 */                 zzbaxVar.zzn(i);
                    }
                }

                @Override
                public final void zzh(zzavf zzavfVar) {
/* 1 */             this.zzd = zzavfVar;
                }

                @Override
                public final void zzl(zzbdm zzbdmVar) {
/* 1 */             zzbax zzbaxVar = this.zza;
                    synchronized (zzbaxVar) {
/* 6 */                 zzbaxVar.zzk(this.zzb, zzbdmVar);
                    }
/* 16 */            if (this.zzb.zzh()) {
/* 18 */                zzbdmVar.zzg();
                    }
                }

                @Override
                public final void zzm(InputStream inputStream) {
/* 3 */             if (this.zzc == null) {
/* 24 */                this.zzc = inputStream;
/* 29 */                return;
                    }
/* 5 */             zzbax zzbaxVar = this.zza;
                    synchronized (zzbaxVar) {
/* 16 */                zzbaxVar.zzg(zzazd.zzi.zze("too many messages"));
                    }
                }

                @Override
                public final boolean zzn() {
/* 3 */             return this.zzb.zzh();
                }

                @Override
/* 19 */        public final void zzc() {
                }

                @Override
/* 19 */        public final void zze() {
                }

                @Override
/* 28 */        public final void zza(zzbgu zzbguVar) {
                }

                @Override
/* 28 */        public final void zzg(zzaur zzaurVar) {
                }

                @Override
/* 28 */        public final void zzi(zzavi zzaviVar) {
                }

                @Override
/* 28 */        public final void zzj(int i) {
                }

                @Override
/* 28 */        public final void zzk(int i) {
                }
            }
