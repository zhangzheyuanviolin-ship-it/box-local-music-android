            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzcz extends zzagg implements zzaho {
                private static final zzcz zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzakj zzg;
                private byte zzi = 2;
                private String zzh = "";

                static {
/* 3 */             zzcz zzczVar = new zzcz();
/* 6 */             zzb = zzczVar;
/* 10 */            zzagg.zzD(zzcz.class, zzczVar);
                }

                private zzcz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 93 */                return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzcz();
                    }
/* 12 */            zzcy zzcyVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzcx(zzcyVar);
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
                    synchronized (zzcz.class) {
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
