            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaoi extends zzagg implements zzaho {
                private static final zzaoi zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzago zzg = zzagg.zzx();
                private boolean zzh;

                static {
/* 3 */             zzaoi zzaoiVar = new zzaoi();
/* 6 */             zzb = zzaoiVar;
/* 10 */            zzagg.zzD(zzaoi.class, zzaoiVar);
                }

                private zzaoi() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"zzf", "zzg", zzaoa.class, "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzaoi();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzaoh(zzarwVar);
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
                    synchronized (zzaoi.class) {
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
