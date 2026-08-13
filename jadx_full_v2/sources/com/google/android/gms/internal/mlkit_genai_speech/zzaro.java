            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaro extends zzagg implements zzaho {
                private static final zzaro zzb;
                private static volatile zzahv zze;
                private byte zzg = 2;
                private zzago zzf = zzagg.zzx();

                static {
/* 3 */             zzaro zzaroVar = new zzaro();
/* 6 */             zzb = zzaroVar;
/* 10 */            zzagg.zzD(zzaro.class, zzaroVar);
                }

                private zzaro() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return Byte.valueOf(this.zzg);
                    }
/* 6 */             if (i2 == 2) {
/* 84 */                return zzagg.zzA(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzf", zzapr.class});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzaro();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzarn(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzg = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zze;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzaro.class) {
                        try {
/* 36 */                    zzagbVar = zze;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zzb);
/* 47 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 53 */            return zzagbVar;
                }
            }
