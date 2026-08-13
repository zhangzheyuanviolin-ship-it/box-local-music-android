            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbj {
                private static volatile zzaxv zza;
                private static volatile zzaxv zzb;
                private static volatile zzaxv zzc;

                private zzbj() {
                }

                public static zzaxv zza() {
                    zzaxv zzaxvVarZzf;
/* 1 */             zzaxv zzaxvVar = zza;
/* 3 */             if (zzaxvVar != null) {
/* 110 */               return zzaxvVar;
                    }
                    synchronized (zzbj.class) {
                        try {
/* 8 */                     zzaxvVarZzf = zza;
/* 10 */                    if (zzaxvVarZzf == null) {
/* 13 */                        zzaxr zzaxrVarZza = zzaxv.zza(null, null);
/* 19 */                        zzaxrVarZza.zze(zzaxt.UNARY);
/* 30 */                        zzaxrVarZza.zza(zzaxv.zze("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "CheckModelAvailability"));
/* 34 */                        zzaxrVarZza.zzd(true);
/* 45 */                        zzaxrVarZza.zzb(zzboi.zza(zzcc.zzd()));
/* 56 */                        zzaxrVarZza.zzc(zzboi.zza(zzch.zzc()));
/* 59 */                        zzaxvVarZzf = zzaxrVarZza.zzf();
/* 63 */                        zza = zzaxvVarZzf;
                            }
                        } catch (Throwable th) {
/* 71 */                    throw th;
                        }
                    }
/* 69 */            return zzaxvVarZzf;
                }

                public static zzaxv zzb() {
                    zzaxv zzaxvVarZzf;
/* 1 */             zzaxv zzaxvVar = zzb;
/* 3 */             if (zzaxvVar != null) {
/* 110 */               return zzaxvVar;
                    }
                    synchronized (zzbj.class) {
                        try {
/* 8 */                     zzaxvVarZzf = zzb;
/* 10 */                    if (zzaxvVarZzf == null) {
/* 13 */                        zzaxr zzaxrVarZza = zzaxv.zza(null, null);
/* 19 */                        zzaxrVarZza.zze(zzaxt.SERVER_STREAMING);
/* 30 */                        zzaxrVarZza.zza(zzaxv.zze("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "DownloadModel"));
/* 34 */                        zzaxrVarZza.zzd(true);
/* 45 */                        zzaxrVarZza.zzb(zzboi.zza(zzck.zzd()));
/* 56 */                        zzaxrVarZza.zzc(zzboi.zza(zzct.zze()));
/* 59 */                        zzaxvVarZzf = zzaxrVarZza.zzf();
/* 63 */                        zzb = zzaxvVarZzf;
                            }
                        } catch (Throwable th) {
/* 71 */                    throw th;
                        }
                    }
/* 69 */            return zzaxvVarZzf;
                }

                public static zzaxv zzc() {
                    zzaxv zzaxvVarZzf;
/* 1 */             zzaxv zzaxvVar = zzc;
/* 3 */             if (zzaxvVar != null) {
/* 110 */               return zzaxvVar;
                    }
                    synchronized (zzbj.class) {
                        try {
/* 8 */                     zzaxvVarZzf = zzc;
/* 10 */                    if (zzaxvVarZzf == null) {
/* 13 */                        zzaxr zzaxrVarZza = zzaxv.zza(null, null);
/* 19 */                        zzaxrVarZza.zze(zzaxt.BIDI_STREAMING);
/* 30 */                        zzaxrVarZza.zza(zzaxv.zze("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "RecognitionSession"));
/* 34 */                        zzaxrVarZza.zzd(true);
/* 45 */                        zzaxrVarZza.zzb(zzboi.zza(zzdr.zzd()));
/* 56 */                        zzaxrVarZza.zzc(zzboi.zza(zzeq.zzf()));
/* 59 */                        zzaxvVarZzf = zzaxrVarZza.zzf();
/* 63 */                        zzc = zzaxvVarZzf;
                            }
                        } catch (Throwable th) {
/* 71 */                    throw th;
                        }
                    }
/* 69 */            return zzaxvVarZzf;
                }
            }
