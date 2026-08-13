            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            import p000.Oi010OO0;
            
/* 18 */    final class zzbbq implements zzbdk {
                private final zzbax zza;
                private final zzbbw zzb;

                public zzbbq(zzbax zzbaxVar, zzbbw zzbbwVar, zzatu zzatuVar) {
/* 4 */             this.zza = zzbaxVar;
/* 6 */             this.zzb = zzbbwVar;
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("MultiMessageClientStream[", this.zza.toString(), "/", this.zzb.toString(), "]");
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
/* 4 */                     zzbbwVar.zzf();
/* 7 */                     zzbbwVar.zzg();
                        }
                    } catch (zzaze e) {
/* 16 */                zzbax zzbaxVar = this.zza;
                        synchronized (zzbaxVar) {
/* 23 */                    zzbaxVar.zzg(e.zza());
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
/* 1 */             zzbbw zzbbwVar = this.zzb;
                    synchronized (zzbbwVar) {
/* 4 */                 zzbbwVar.zzb(zzavfVar);
                    }
                }

                @Override
                public final void zzl(zzbdm zzbdmVar) {
/* 1 */             zzbax zzbaxVar = this.zza;
                    synchronized (zzbaxVar) {
/* 6 */                 zzbaxVar.zzk(this.zzb, zzbdmVar);
                    }
/* 10 */            zzbbw zzbbwVar = this.zzb;
/* 16 */            if (zzbbwVar.zzh()) {
/* 18 */                zzbdmVar.zzg();
                    }
                    try {
                        synchronized (zzbbwVar) {
/* 22 */                    zzbbwVar.zze();
/* 25 */                    zzbbwVar.zzg();
                        }
                    } catch (zzaze e) {
/* 34 */                zzbax zzbaxVar2 = this.zza;
                        synchronized (zzbaxVar2) {
/* 41 */                    zzbaxVar2.zzg(e.zza());
                        }
                    }
                }

                @Override
                public final void zzm(InputStream inputStream) {
                    try {
/* 1 */                 zzbbw zzbbwVar = this.zzb;
                        synchronized (zzbbwVar) {
/* 4 */                     zzbbwVar.zzd(inputStream);
/* 7 */                     zzbbwVar.zzg();
                        }
                    } catch (zzaze e) {
/* 16 */                zzbax zzbaxVar = this.zza;
                        synchronized (zzbaxVar) {
/* 23 */                    zzbaxVar.zzg(e.zza());
                        }
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
