            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import p000.IlIi0I0;
            
            final class zzjl implements Runnable {
                Runnable zza;
                final zzjn zzb;

                public zzjl(zzjn zzjnVar, zzjm zzjmVar) {
/* 1 */             Objects.requireNonNull(zzjnVar);
/* 4 */             this.zzb = zzjnVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
                
                    if (r1 == false) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
                
                    r1 = r1 | java.lang.Thread.interrupted();
                    r3 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
                
                    r11.zza.run();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
                
                    com.google.android.gms.internal.mlkit_genai_speech.zzjn.zza.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.zza), (java.lang.Throwable) r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
                
                    r11.zza = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
                
                    r11.zza = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Removed duplicated region for block: B:62:0x003e A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Runnable runnable;
/* 1 */             boolean z = false;
/* 2 */             boolean zInterrupted = false;
                    while (true) {
                        try {
                            try {
/* 4 */                         zzjn zzjnVar = this.zzb;
                                synchronized (zzjnVar.zzc) {
/* 11 */                            if (z) {
/* 57 */                                runnable = (Runnable) zzjnVar.zzc.poll();
/* 59 */                                this.zza = runnable;
/* 61 */                                if (runnable != null) {
                                        }
                                    } else if (zzjnVar.zzf != 4) {
                                        zzjnVar.zzd++;
/* 1 */                                 zzjnVar.zzf = 4;
/* 57 */                                runnable = (Runnable) zzjnVar.zzc.poll();
/* 59 */                                this.zza = runnable;
/* 61 */                                if (runnable != null) {
/* 1 */                                     this.zzb.zzf = 1;
                                        }
                                    }
                                }
/* 21 */                        if (!zInterrupted) {
/* 72 */                            return;
                                }
/* 87 */                        z = true;
                            } catch (Error e) {
/* 153 */                       zzjn zzjnVar2 = this.zzb;
                                synchronized (zzjnVar2.zzc) {
/* 1 */                             zzjnVar2.zzf = 1;
/* 164 */                           throw e;
                                }
                            }
                        } finally {
/* 143 */                   if (zInterrupted) {
/* 149 */                       Thread.currentThread().interrupt();
                            }
                        }
                    }
                }

                public final String toString() {
/* 1 */             Runnable runnable = this.zza;
/* 5 */             if (runnable != null) {
/* 13 */                return IlIi0I0.I000lI("SequentialExecutorWorker{running=", runnable.toString(), "}");
                    }
/* 1 */             int i = this.zzb.zzf;
/* 52 */            return IlIi0I0.I000lI("SequentialExecutorWorker{state=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE", "}");
                }
            }
