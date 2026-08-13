            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaqb extends zzagd implements zzaho {
                private static final zzaqb zze;
                private static volatile zzahv zzf;
                private int zzg;
                private byte zzi = 2;
                private String zzh = "";

                static {
/* 3 */             zzaqb zzaqbVar = new zzaqb();
/* 6 */             zze = zzaqbVar;
/* 10 */            zzagg.zzD(zzaqb.class, zzaqbVar);
                }

                private zzaqb() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 84 */                return zzagg.zzA(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzaqb();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzaqa(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzi = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzaqb.class) {
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
