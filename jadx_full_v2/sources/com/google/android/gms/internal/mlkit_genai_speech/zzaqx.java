            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaqx extends zzagd implements zzaho {
                private static final zzaqx zze;
                private static volatile zzahv zzf;
                private Object zzh;
                private int zzg = 0;
                private byte zzi = 2;

                static {
/* 3 */             zzaqx zzaqxVar = new zzaqx();
/* 6 */             zze = zzaqxVar;
/* 10 */            zzagg.zzD(zzaqx.class, zzaqxVar);
                }

                private zzaqx() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 93 */                return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zze, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"zzh", "zzg", zzaqv.class});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzaqx();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzaqw(zzarwVar);
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
                    synchronized (zzaqx.class) {
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
