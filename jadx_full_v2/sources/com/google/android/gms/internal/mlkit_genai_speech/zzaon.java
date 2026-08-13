            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaon extends zzagg implements zzaho {
                private static final zzaon zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzago zzg = zzagg.zzx();
                private zzamy zzh;
                private zzaqr zzi;
                private zzany zzj;

                static {
/* 3 */             zzaon zzaonVar = new zzaon();
/* 6 */             zzb = zzaonVar;
/* 10 */            zzagg.zzD(zzaon.class, zzaonVar);
                }

                private zzaon() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"zzf", "zzg", zzarb.class, "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzaon();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzaom(zzarwVar);
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
                    synchronized (zzaon.class) {
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
            }
