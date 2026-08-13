            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            
            public final class zzja extends zzjc {
                public static ListenableFuture zza(Callable callable, Executor executor) {
/* 3 */             zzjr zzjrVar = new zzjr(callable);
/* 6 */             executor.execute(zzjrVar);
/* 37 */            return zzjrVar;
                }

                public static void zzb(ListenableFuture listenableFuture, zziy zziyVar, Executor executor) {
/* 6 */             listenableFuture.addListener(new zziz(listenableFuture, zziyVar), executor);
                }
            }
