            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            
            final class zzbcy implements zzbdp {
                private final zzbdp zza;

                public zzbcy(zzbdp zzbdpVar, zzatv zzatvVar, Executor executor) {
/* 4 */             this.zza = zzbdpVar;
/* 8 */             zzgo.zzc(executor, "appExecutor");
                }

                @Override
                public final void close() {
/* 3 */             this.zza.close();
                }

                @Override
                public final zzbdr zza(SocketAddress socketAddress, zzbdo zzbdoVar, zzauc zzaucVar) {
/* 13 */            return new zzbcx(this, this.zza.zza(socketAddress, zzbdoVar, zzaucVar), zzbdoVar.zzf());
                }

                @Override
                public final ScheduledExecutorService zzb() {
/* 3 */             return this.zza.zzb();
                }
            }
