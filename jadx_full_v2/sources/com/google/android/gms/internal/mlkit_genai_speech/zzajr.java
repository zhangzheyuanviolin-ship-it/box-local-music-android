            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzajr extends zzagd implements zzaho {
                private static final zzajr zze;
                private static volatile zzahv zzf;
                private byte zzg = 2;

                static {
/* 3 */             zzajr zzajrVar = new zzajr();
/* 6 */             zze = zzajrVar;
/* 10 */            zzagg.zzD(zzajr.class, zzajrVar);
                }

                private zzajr() {
                }

                public static zzajr zze() {
/* 1 */             return zze;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return Byte.valueOf(this.zzg);
                    }
/* 6 */             zzajs zzajsVar = null;
/* 7 */             if (i2 == 2) {
/* 76 */                return zzagg.zzA(zze, "\u0001\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 68 */                return new zzajr();
                    }
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzajq(zzajsVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzg = obj == null ? (byte) 0 : (byte) 1;
/* 6 */                 return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzajr.class) {
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
