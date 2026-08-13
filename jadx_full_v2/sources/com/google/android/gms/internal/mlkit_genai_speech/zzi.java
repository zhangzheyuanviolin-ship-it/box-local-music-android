            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzi extends zzagg implements zzaho {
                private static final zzi zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private int zzm;
                private int zzn;
                private boolean zzp;
                private float zzs;
                private float zzt;
                private int zzu;
                private int zzh = 1;
                private zzago zzi = zzagg.zzx();
                private String zzj = "";
                private String zzk = "";
                private String zzl = "";
                private String zzo = "";
                private zzagm zzq = zzagg.zzv();
                private zzago zzr = zzagg.zzx();
                private String zzv = "";

                static {
/* 3 */             zzi zziVar = new zzi();
/* 6 */             zzb = zziVar;
/* 10 */            zzagg.zzD(zzi.class, zziVar);
                }

                private zzi() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 127 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 121 */               return zzagg.zzA(zzb, "\u0004\u0010\u0000\u0001\u0006*\u0010\u0000\u0003\u0000\u0006᠌\u0000\t\u001a\u000bဈ\u0002\fဈ\u0003\rဈ\u0004\u0010᠌\u0006\u0013ဈ\u0007\u0014ဇ\b\u0015᠌\u0005$ࠞ%\u001b&᠌\u0001'ခ\t(ခ\n)᠌\u000b*ဈ\f", new Object[]{"zzf", "zzg", zzh.zza, "zzi", "zzj", "zzk", "zzl", "zzn", zzb.zza, "zzo", "zzp", "zzm", zzf.zza, "zzq", zzd.zza, "zzr", zzi.class, "zzh", zzg.zza, "zzs", "zzt", "zzu", zze.zza, "zzv"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzi();
                    }
/* 12 */            zzk zzkVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzc(zzkVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 48 */                return zzahvVar;
                    }
                    synchronized (zzi.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzagbVar;
                }
            }
