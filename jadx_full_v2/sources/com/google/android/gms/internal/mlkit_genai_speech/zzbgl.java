            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            final class zzbgl implements zzbnc {
                public final String toString() {
/* 1 */             return "grpc-default-executor";
                }

                @Override
                public final Object zza() {
/* 8 */             return Executors.newCachedThreadPool(zzbgr.zzc("grpc-default-executor-%d", true));
                }

                @Override
                public final void zzb(Object obj) {
/* 5 */             ((ExecutorService) ((Executor) obj)).shutdown();
                }
            }
