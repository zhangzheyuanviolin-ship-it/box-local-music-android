            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzs extends zzagg implements zzaho {
                private static final zzs zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private long zzh;

                static {
/* 3 */             zzs zzsVar = new zzs();
/* 6 */             zzb = zzsVar;
/* 10 */            zzagg.zzD(zzs.class, zzsVar);
                }

                private zzs() {
                }

                public static zzs zzd() {
/* 1 */             return zzb;
                }

                public final int zza() {
/* 1 */             return this.zzg;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzs();
                    }
/* 12 */            zzr zzrVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzq(zzrVar);
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
                    synchronized (zzs.class) {
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
