            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaow extends zzagg implements zzaho {
                private static final zzaow zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzare zzh;
                private byte zzi = 2;
                private String zzg = "";

                static {
/* 3 */             zzaow zzaowVar = new zzaow();
/* 6 */             zzb = zzaowVar;
/* 10 */            zzagg.zzD(zzaow.class, zzaowVar);
                }

                private zzaow() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 93 */                return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzaow();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzaov(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzi = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zze;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzaow.class) {
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
