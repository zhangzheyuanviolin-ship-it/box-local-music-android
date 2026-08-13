            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzare extends zzagd implements zzaho {
                private static final zzare zze;
                private static volatile zzahv zzf;
                private int zzg;
                private Object zzi;
                private int zzj;
                private zzaky zzk;
                private int zzh = 0;
                private byte zzn = 2;
                private zzago zzl = zzagg.zzx();
                private String zzm = "";

                static {
/* 3 */             zzare zzareVar = new zzare();
/* 6 */             zze = zzareVar;
/* 10 */            zzagg.zzD(zzare.class, zzareVar);
                }

                private zzare() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 112 */               return Byte.valueOf(this.zzn);
                    }
/* 6 */             if (i2 == 2) {
/* 105 */               return zzagg.zzA(zze, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0001\u0003\u0001м\u0000\u0002м\u0000\u0003᠌\u0000\u0004м\u0000\u0005ဉ\u0001\u0007\u001b\bဈ\u0002", new Object[]{"zzi", "zzh", "zzg", zzapb.class, zzaql.class, "zzj", zzasm.zza, zzaqz.class, "zzk", "zzl", zzaqh.class, "zzm"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzare();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzarc(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzn = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzare.class) {
                        try {
/* 36 */                    zzagbVar = zzf;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zze);
/* 47 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzagbVar;
                }
            }
