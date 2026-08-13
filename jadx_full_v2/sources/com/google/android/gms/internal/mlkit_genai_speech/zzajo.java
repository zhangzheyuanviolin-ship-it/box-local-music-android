            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzajo extends zzagg implements zzaho {
                private static final zzajo zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private zzaji zzi;
                private int zzk;
                private int zzl;
                private boolean zzm;
                private boolean zzs;
                private float zzt;
                private boolean zzu;
                private float zzv;
                private boolean zzw;
                private int zzg = 0;
                private zzagm zzj = zzagg.zzv();
                private float zzn = 1.0f;
                private boolean zzo = true;
                private boolean zzp = true;
                private int zzq = 1;
                private int zzr = 1;

                static {
/* 3 */             zzajo zzajoVar = new zzajo();
/* 6 */             zzb = zzajoVar;
/* 10 */            zzagg.zzD(zzajo.class, zzajoVar);
                }

                private zzajo() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 124 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 75 */                zzagk zzagkVar = zzajk.zza;
/* 118 */               return zzagg.zzA(zzb, "\u0001\u0011\u0001\u0001\u0001\u0011\u0011\u0000\u0001\u0000\u0001ဉ\u0000\u0002ࠞ\u0003ဇ\u0003\u0004ခ\u0004\u0005ဇ\u0005\u0006᠌\u0001\u0007᠌\u0007\b᠌\b\t4\u0000\n4\u0000\u000bဇ\t\fဇ\u0006\rခ\n\u000e᠌\u0002\u000fဇ\u000b\u0010ခ\f\u0011ဇ\r", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj", zzagkVar, "zzm", "zzn", "zzo", "zzk", zzagkVar, "zzq", zzajm.zza, "zzr", zzajl.zza, "zzs", "zzp", "zzt", "zzl", zzagkVar, "zzu", "zzv", "zzw"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzajo();
                    }
/* 12 */            zzajp zzajpVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzajn(zzajpVar);
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
                    synchronized (zzajo.class) {
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
