            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.InvocationTargetException;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import p000.IioIoO10iOiI;
            
            final class zzbgm implements zzbnc {
                @Override
                public final Object zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 8 */             ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, zzbgr.zzc("grpc-timer-%d", true));
                    try {
/* 34 */                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    } catch (NoSuchMethodException unused) {
                    } catch (RuntimeException e) {
/* 45 */                throw e;
                    } catch (Exception e2) {
/* 39 */                IioIoO10iOiI.I000lI(e2);
/* 42 */                return null;
                    }
/* 46 */            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
                }

                @Override
                public final void zzb(Object obj) {
/* 3 */             ((ScheduledExecutorService) obj).shutdown();
                }
            }
