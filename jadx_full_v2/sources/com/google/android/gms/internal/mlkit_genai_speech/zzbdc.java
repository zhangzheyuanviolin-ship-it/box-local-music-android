            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.logging.Level;
            import java.util.logging.LogRecord;
            import java.util.logging.Logger;
            import p000.IIl001iO0Io;
            
            final class zzbdc {
                static final Logger zza = Logger.getLogger(zzauc.class.getName());
                private final Object zzb = new Object();
                private final zzawd zzc;

                public zzbdc(zzawd zzawdVar, int i, long j, String str) {
/* 13 */            zzgo.zzc(zzawdVar, "logId");
/* 16 */            this.zzc = zzawdVar;
/* 20 */            zzavr zzavrVar = new zzavr();
/* 29 */            zzavrVar.zza(str.concat(" created"));
/* 34 */            zzavrVar.zzb(zzavs.CT_INFO);
/* 37 */            zzavrVar.zzd(j);
/* 44 */            zzc(zzavrVar.zze());
                }

                public static void zzb(zzawd zzawdVar, Level level, String str) {
/* 1 */             Logger logger = zza;
/* 7 */             if (logger.isLoggable(level)) {
/* 23 */                LogRecord logRecord = new LogRecord(level, IIl001iO0Io.I000oI1ioi("[", String.valueOf(zzawdVar), "] ", str));
/* 30 */                logRecord.setLoggerName(logger.getName());
/* 37 */                logRecord.setSourceClassName(logger.getName());
/* 42 */                logRecord.setSourceMethodName("log");
/* 45 */                logger.log(logRecord);
                    }
                }

                public final zzawd zza() {
/* 1 */             return this.zzc;
                }

                public final void zzc(zzavt zzavtVar) {
/* 3 */             int iOrdinal = zzavtVar.zzb.ordinal();
/* 19 */            Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
                    synchronized (this.zzb) {
                    }
/* 29 */            zzb(this.zzc, level, zzavtVar.zza);
                }

                public final boolean zzd() {
                    synchronized (this.zzb) {
                    }
/* 5 */             return false;
                }
            }
