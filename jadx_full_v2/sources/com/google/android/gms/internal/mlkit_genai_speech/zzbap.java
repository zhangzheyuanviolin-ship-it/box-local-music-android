            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Context;
            import java.net.SocketAddress;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import p000.I000II;
            
            public final class zzbap implements zzbdp {
                final Context zza;
                final zzazx zzb;
                final Executor zzc;
                final zzbju zzd;
                final zzbju zze;
                final zzbab zzf;
                final zzazv zzg;
                final zzazy zzh;
                ScheduledExecutorService zzi;
                Executor zzj;
                final zzbbr zzk;
                private boolean zzl;

                public zzbap(zzban zzbanVar, zzbao zzbaoVar) {
/* 4 */             Context context = zzbanVar.zza;
/* 6 */             context.getClass();
/* 9 */             this.zza = context;
/* 11 */            zzazx zzazxVar = zzbanVar.zzc;
/* 13 */            zzazxVar.getClass();
/* 16 */            this.zzb = zzazxVar;
/* 22 */            this.zzc = context.getMainExecutor();
/* 24 */            zzbju zzbjuVar = zzbanVar.zzd;
/* 26 */            this.zzd = zzbjuVar;
/* 28 */            zzbju zzbjuVar2 = zzbanVar.zzb;
/* 30 */            zzbjuVar2.getClass();
/* 33 */            this.zze = zzbjuVar2;
/* 35 */            zzbab zzbabVar = zzbanVar.zze;
/* 37 */            zzbabVar.getClass();
/* 40 */            this.zzf = zzbabVar;
/* 42 */            zzazv zzazvVar = zzbanVar.zzf;
/* 44 */            zzazvVar.getClass();
/* 47 */            this.zzg = zzazvVar;
/* 49 */            zzazy zzazyVar = zzbanVar.zzg;
/* 51 */            zzazyVar.getClass();
/* 54 */            this.zzh = zzazyVar;
/* 56 */            zzbbr zzbbrVar = zzbanVar.zzh;
/* 58 */            zzbbrVar.getClass();
/* 61 */            this.zzk = zzbbrVar;
/* 69 */            this.zzi = (ScheduledExecutorService) zzbjuVar.zza();
/* 77 */            this.zzj = (Executor) zzbjuVar2.zza();
                }

                @Override
                public final void close() {
/* 2 */             this.zzl = true;
/* 8 */             this.zzd.zzb(this.zzi);
/* 12 */            this.zzi = null;
/* 18 */            this.zze.zzb(this.zzj);
/* 21 */            this.zzj = null;
                }

                @Override
                public final zzbdr zza(SocketAddress socketAddress, zzbdo zzbdoVar, zzauc zzaucVar) {
/* 3 */             if (!this.zzl) {
/* 9 */                 return new zzbam(this, (zzazq) socketAddress, zzbdoVar);
                    }
/* 15 */            I000II.I001IO000("The transport factory is closed.");
/* 18 */            return null;
                }

                @Override
                public final ScheduledExecutorService zzb() {
/* 1 */             return this.zzi;
                }
            }
