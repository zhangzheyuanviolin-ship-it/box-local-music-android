            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.ref.Reference;
            import java.lang.ref.ReferenceQueue;
            import java.lang.ref.SoftReference;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.logging.Level;
            import java.util.logging.LogRecord;
            import p000.IlIi0I0;
            
            final class zzbjk extends WeakReference {
                private static final boolean zza = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
                private static final RuntimeException zzb;
                private final ReferenceQueue zzc;
                private final ConcurrentMap zzd;
                private final String zze;
                private final Reference zzf;
                private final AtomicBoolean zzg;

                static {
/* 19 */            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
/* 25 */            runtimeException.setStackTrace(new StackTraceElement[0]);
/* 28 */            zzb = runtimeException;
                }

                public zzbjk(zzbjl zzbjlVar, zzaxd zzaxdVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
/* 1 */             super(zzbjlVar, referenceQueue);
/* 9 */             this.zzg = new AtomicBoolean();
/* 30 */            this.zzf = new SoftReference(zza ? new RuntimeException("ManagedChannel allocation site") : zzb);
/* 36 */            this.zze = zzaxdVar.toString();
/* 38 */            this.zzc = referenceQueue;
/* 40 */            this.zzd = concurrentMap;
/* 42 */            concurrentMap.put(this, this);
/* 45 */            zza(referenceQueue);
                }

                public static int zza(ReferenceQueue referenceQueue) {
/* 1 */             int i = 0;
                    while (true) {
/* 6 */                 zzbjk zzbjkVar = (zzbjk) referenceQueue.poll();
/* 8 */                 if (zzbjkVar == null) {
/* 168 */                   return i;
                        }
/* 16 */                RuntimeException runtimeException = (RuntimeException) zzbjkVar.zzf.get();
/* 18 */                zzbjkVar.zzc();
/* 27 */                if (!zzbjkVar.zzg.get()) {
/* 29 */                    i++;
/* 31 */                    Level level = Level.SEVERE;
/* 41 */                    if (zzbjl.zzc.isLoggable(level)) {
/* 59 */                        LogRecord logRecord = new LogRecord(level, IlIi0I0.I000lI("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*", System.getProperty("line.separator"), "    Make sure to call shutdown()/shutdownNow()"));
/* 70 */                        logRecord.setLoggerName(zzbjl.zzc.getName());
/* 79 */                        logRecord.setParameters(new Object[]{zzbjkVar.zze});
/* 82 */                        logRecord.setThrown(runtimeException);
/* 89 */                        zzbjl.zzc.log(logRecord);
                            }
                        }
                    }
                }

                public static void zzb(zzbjk zzbjkVar) {
/* 8 */             if (zzbjkVar.zzg.getAndSet(true)) {
/* 29 */                return;
                    }
/* 10 */            zzbjkVar.clear();
                }

                private final void zzc() {
/* 1 */             super.clear();
/* 6 */             this.zzd.remove(this);
/* 11 */            this.zzf.clear();
                }

                @Override
                public final void clear() {
/* 1 */             zzc();
/* 6 */             zza(this.zzc);
                }
            }
