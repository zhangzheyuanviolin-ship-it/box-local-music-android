            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzan extends zzagg implements zzaho {
                private static final zzan zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzatj zzg;
                private zzdc zzi;
                private byte zzj = 2;
                private zzago zzh = zzagg.zzx();

                static {
/* 3 */             zzan zzanVar = new zzan();
/* 6 */             zzb = zzanVar;
/* 10 */            zzagg.zzD(zzan.class, zzanVar);
                }

                private zzan() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 95 */                return Byte.valueOf(this.zzj);
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0003\u001a\u0004ဉ\u0001", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzan();
                    }
/* 12 */            zzam zzamVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzal(zzamVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzj = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zze;
/* 31 */            if (zzahvVar != null) {
/* 56 */                return zzahvVar;
                    }
                    synchronized (zzan.class) {
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
