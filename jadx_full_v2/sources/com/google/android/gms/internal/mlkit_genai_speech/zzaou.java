            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaou extends zzagd implements zzaho {
                private static final zzaou zze;
                private static volatile zzahv zzf;
                private int zzg;
                private int zzh;
                private zzart zzi;
                private boolean zzj;
                private byte zzk = 2;

                static {
/* 3 */             zzaou zzaouVar = new zzaou();
/* 6 */             zze = zzaouVar;
/* 10 */            zzagg.zzD(zzaou.class, zzaouVar);
                }

                private zzaou() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 97 */                return Byte.valueOf(this.zzk);
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzagg.zzA(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"zzg", "zzh", zzaot.zza, "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzaou();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzaos(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzk = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzaou.class) {
                        try {
/* 36 */                    zzagbVar = zzf;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zze);
/* 47 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 53 */            return zzagbVar;
                }
            }
