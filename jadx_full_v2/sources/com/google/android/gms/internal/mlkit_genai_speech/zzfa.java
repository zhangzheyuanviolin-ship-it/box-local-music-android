            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzfa extends zzagg implements zzaho {
                private static final zzfa zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private int zzh;
                private int zzi;

                static {
/* 3 */             zzfa zzfaVar = new zzfa();
/* 6 */             zzb = zzfaVar;
/* 10 */            zzagg.zzD(zzfa.class, zzfaVar);
                }

                private zzfa() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0007᠌\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", zzey.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzfa();
                    }
/* 12 */            zzez zzezVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzex(zzezVar);
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
                    synchronized (zzfa.class) {
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
