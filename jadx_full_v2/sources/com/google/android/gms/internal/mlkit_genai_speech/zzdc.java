            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdc extends zzagg implements zzaho {
                private static final zzdc zzb;
                private static volatile zzahv zze;
                private int zzf;
                private String zzg = "";
                private String zzh = "";
                private zzago zzi = zzagg.zzx();

                static {
/* 3 */             zzdc zzdcVar = new zzdc();
/* 6 */             zzb = zzdcVar;
/* 10 */            zzagg.zzD(zzdc.class, zzdcVar);
                }

                private zzdc() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzdc();
                    }
/* 12 */            zzdb zzdbVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzda(zzdbVar);
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
                    synchronized (zzdc.class) {
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
