            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbw extends zzagg implements zzaho {
                private static final zzbw zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzh;
                private long zzj;
                private String zzg = "";
                private zzagm zzi = zzagg.zzv();

                static {
/* 3 */             zzbw zzbwVar = new zzbw();
/* 6 */             zzb = zzbwVar;
/* 10 */            zzagg.zzD(zzbw.class, zzbwVar);
                }

                private zzbw() {
                }

                public static zzbw zzc() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002င\u0001\u0003ࠬ\u0004ဂ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", zzajx.zza(), "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzbw();
                    }
/* 12 */            zzbv zzbvVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzbu(zzbvVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 49 */                return zzahvVar;
                    }
                    synchronized (zzbw.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzagbVar;
                }

                public final String zzd() {
/* 1 */             return this.zzg;
                }
            }
